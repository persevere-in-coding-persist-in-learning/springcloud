package com.huijz.lagou.chapter03.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/29 下午11:14
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({AnnotationConfigure.class})
public @interface EnableAutoConfigureAnnotationClient {
}
