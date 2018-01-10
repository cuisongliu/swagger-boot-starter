package com.cuisongliu.swagger.autoconfigure.properties;
/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 cuisongliu@qq.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.cuisongliu.swagger.autoconfigure.properties.SwaggerProperties.SWAGGER_PREFIX;


/**
 * swagger 相关的参数
 *
 * @author cuisongliu [cuisongliu@qq.com]
 * @since 2018-01-02 20:47
 */
@ConfigurationProperties(prefix = SWAGGER_PREFIX)
public class SwaggerProperties {
    public static final String SWAGGER_PREFIX="spring.swagger";

    /**
     * 标题
     */
    private String title = "cuisongliu's Doc";

    /**
     * 描述
     */
    private String description="cuisongliu's API Doc";

    /**
     *  服务的Url
     */
    private String termsOfServiceUrl="https://github.com/cuisongliu";

    /**
     * 版本号
     */
    private String version="v1.0";

    /**
     *  用户的个人信息 名称
     */
    private String name="cuisongliu";

    /**
     *  用户的个人信息 email
     */
    private String email="cuisongliu@qq.com";

    /**
     *  用户的个人信息 个人网站
     */
    private String url="http://www.cuisongliu.com";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
