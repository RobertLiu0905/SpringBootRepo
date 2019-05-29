- demo boot parent

主要分为两部分，boot autoconfigure和boot starter工程。autoconfigure用于加入自动配置，比如装配druid mybatis等框架的bean到spring容器中；starter工程主要是引入模块的依赖，模仿springboot引入模块的思想



- demo bootstrap

客户端启动模块


- demo eureka server

服务中心


- demo common

公共模块，可以存放一些工具类等


- demo server 

存放后台业务代码，controller service mapper等


- demo test

一些demo测试工程，引入其他组件的使用样例 hystrix zuul feign ribbon sleuth

![image](https://github.com/RobertLiu0905/SpringBootRepo/blob/master/code/demo-parent/pic/WechatIMG1916.jpeg)
