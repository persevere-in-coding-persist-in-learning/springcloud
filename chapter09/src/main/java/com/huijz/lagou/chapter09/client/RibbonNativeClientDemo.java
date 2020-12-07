package com.huijz.lagou.chapter09.client;

import com.netflix.loadbalancer.BaseLoadBalancer;
import com.netflix.loadbalancer.LoadBalancerBuilder;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.reactive.LoadBalancerCommand;
import rx.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * ribbon 随机调用策略
 *
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/5 下午8:54
 */
public class RibbonNativeClientDemo {
    public static void main(String[] args) {

        /**服务列表*/
        List<Server> serverList = Arrays.asList(new Server("localhost", 8081), new Server("localhost", 8082));
        /**构建负载实例*/
        BaseLoadBalancer loadBalancer = LoadBalancerBuilder.newBuilder().buildFixedServerListLoadBalancer(serverList);
        loadBalancer.setRule(new RandomRule());
        /**调用5次来测试效果*/
        for (int i = 0; i < 5; i++) {
            String result = LoadBalancerCommand.<String>builder().withLoadBalancer(loadBalancer).build()
                    .submit(server -> {
                        try {
                            String addr = "http://".concat(server.getHost()).concat(":").concat(String.valueOf(server.getPort()));
                            System.out.println("调用地址：" + addr);
                            return Observable.just("");
                        } catch (Exception e) {
                            return Observable.error(e);
                        }
                    }).toBlocking().first();
            System.out.println("调用结果：" + result);

        }

    }
}
