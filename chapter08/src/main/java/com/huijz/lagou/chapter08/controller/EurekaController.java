package com.huijz.lagou.chapter08.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/4 下午9:38
 */
@RestController
public class EurekaController {
    @Resource
    DiscoveryClient discoveryClient;

    /**
     * 获取Eureka Server中所有服务实例信息
     *
     * @return
     */
    @GetMapping("instances")
    public List<ServiceInstance> getApplications() {
        List<ServiceInstance> serviceInstanceList = discoveryClient.getServices().stream()
                .map(sid -> discoveryClient.getInstances(sid))
                .collect(Collectors.toList())
                .stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        return serviceInstanceList;
    }
}
