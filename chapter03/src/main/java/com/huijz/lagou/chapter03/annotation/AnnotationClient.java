package com.huijz.lagou.chapter03.annotation;

/**
 * @author jiangzhouhui
 * @mail: 670478647@qq.com
 * @date 2020/11/29 下午11:08
 */
public class AnnotationClient {
    private AnnotationProperties annotationProperties;

    public AnnotationClient(AnnotationProperties annotationProperties) {
        this.annotationProperties = annotationProperties;
    }

    public String getConfig() {
        return this.annotationProperties.getConfig();
    }
}
