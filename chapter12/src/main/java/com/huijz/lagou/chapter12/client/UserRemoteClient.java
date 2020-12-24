package com.huijz.lagou.chapter12.client;

import com.huijz.lagou.chapter12.config.FeignConfiguration;
import com.huijz.lagou.chapter12.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/9 下午8:14
 */
@FeignClient(value = "eureka-client-provider", configuration = FeignConfiguration.class, fallbackFactory = UserRemoteClientFallbackFactory.class)
public interface UserRemoteClient {
    @GetMapping("user/get")
    User getUser(@RequestParam("id") Integer id);
}
