# 说明
* bee-knife4j-spring-boot-starter，封装knife4j文档，父工程引入即可
* bee-mybatis-plus-starter, 封装MyBatis Plus，提供批量插入功能
  * 在Mapper中定义`Integer insertBatchSomeColumn(Collection<Users> entities);`方法即可使用
* bee-spring-cloud-alibaba-starter，封装Spring Cloud Alibaba和常用中间件
  * Redis
  * OpenFeign
  * Nacos
# 使用说明
工程父Pom引入：
```xml
<dependency>
    <groupId>com.hnzhrh</groupId>
    <artifactId>bee-knife4j-spring-boot-starter</artifactId>
</dependency>
```
`domain`模块引入：
```xml
<dependency>
    <groupId>com.hnzhrh</groupId>
    <artifactId>bee-mybatis-plus-starter</artifactId>
</dependency>
```

`start`模块引入：
```xml
<dependency>
    <groupId>com.hnzhrh</groupId>
    <artifactId>bee-spring-cloud-alibaba-starter</artifactId>
</dependency>
```