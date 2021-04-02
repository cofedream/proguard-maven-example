# proguard-maven-example
Java代码混淆案例，基于Proguard，使用Maven构建

# 模块说明及注意事项

> base-module 基础混淆,[详情文档](base-module/README.md)
> 
> multi-module 多模块混淆,[详情文档](multiple-module/README.md)

**注意事项**

1. proguard-base 6及以下与 proguard-base 7需要的依赖不同,详情见 [base-module](/base-module) 中的 [pom.xml](/base-module/pom.xml) 的 version 6.2.2、7.0.1
2. 如果不指定 proguard-maven-plugin 依赖的版本，则使用该版本号对应的最新依赖
