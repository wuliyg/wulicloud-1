项目启动顺序：
1.(高可用集群)wulicloud-eureka  idea设置成多例启动 启动参数分别为：--spring.profiles.active=eureka-a 和 --spring.profiles.active=eureka-b
2.(高可用集群)wulicloud-config  idea设置成多例启动(也可单例) 启动参数(读取本地配置文件)：--spring.profiles.active=native
3.其他微服务无启动顺序

数据库：sql脚本在doc文件夹下;项目数据源默认为阿里服务器无需修改

├─wulicloud------------------------------------父项目，公共依赖
│  │
│  ├─wulicloud-eureka--------------------------微服务注册中心   port:9000,9001 预留port: 9002
│  │
│  ├─wulicloud-config-- -----------------------微服务配置中心   port:9003      预留port: 9004
│  │
│  ├─wulicloud-gateway-------------------------微服务网关中心   port:9005
│  │
│  ├─wulicloud-monitor-------------------------微服务监控中心   port:9006
│  │
│  ├─wulicloud-auth----------------------------微服务认证中心   port:9007
│  │
│  ├─wulicloud-common
│  │  │
│  │  ├─wulicloud-common-config----------------公共配置
│  │  │
│  │  ├─wulicloud-common-core------------------微服务核心依赖
│  │  │
│  │  ├─wulicloud-common-util------------------微服务工具
│  │
│  ├─wulicloud-provider
│  │  │
│  │  ├─wulicloud-provider-adm-----------------Admin管理中心   port:9011
│  │  │
│  │  ├─wulicloud-provider-mem-----------------会员中心        port:9012
│  │
│  ├─wulicloud-provider-api
│  │  │
│  │  ├─wulicloud-provider-adm-api-------------Admin管理中心API
│  │  │
│  │  ├─wulicloud-provider-mem-api-------------会员中心中心API