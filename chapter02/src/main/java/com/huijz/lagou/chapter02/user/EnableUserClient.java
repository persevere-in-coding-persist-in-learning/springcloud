package com.huijz.lagou.chapter02.user;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/29 上午9:48
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({UserAutoConfigure.class})
public @interface EnableUserClient {


}
