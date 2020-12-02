package com.huijz.lagou.chapter04.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/12/2 上午7:34
 */
@Component
@Endpoint(id = "springCloud")
public class SpringCloudEndPoint {
    @ReadOperation
    public Map<String, Object> showData() {
        Map<String, Object> data = new HashMap<>();
        data.put("title", "springCloud");
        return data;
    }
}
