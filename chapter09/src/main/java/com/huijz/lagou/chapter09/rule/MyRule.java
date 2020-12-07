package com.huijz.lagou.chapter09.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/7 下午11:16
 */
public class MyRule extends AbstractLoadBalancerRule {

    public MyRule() {
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
        String clientName = iClientConfig.getClientName();
        System.out.println("clientName = " + clientName);
    }

    @Override
    public Server choose(Object o) {
        List<Server> serverList = this.getLoadBalancer().getReachableServers();
        return serverList.get(0);
    }
}
