# 打包流程

**预打包**

- 由于是平行模块,所以需要预先安装关联的父子模块

> 在根目录执行,下方命令,将 springboot-parent-controller 依赖的文件预安装
>
> `mvn -pl :parent,:springboot-parent-module,:springboot-parent-model,:springboot-parent-service clean install`

**obfuscate**

- 使用`proguard-maven-plugin`的**assembly**标签将模块`springboot-parent-service`,`springboot-parent-model`打包进`springboot-parent-controller`模块,一起混淆.
- 使用`spring-boot-maven-plugin`的**exclude**排除,`springboot-parent-service`,`springboot-parent-model`模块的jar包

> `mvn -pl :springboot-parent-controller clean package -P "obfuscate"`
