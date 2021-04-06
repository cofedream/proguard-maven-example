# 打包流程

**普通编译**

> `mvn -pl :springboot-module clean package`

**混淆编译**

> `mvn -pl :springboot-module clean package -P "obfuscate"`

# 详解

**proguard.cfg**

> `dontshrink` 保留未被使用的类,否则`@Controller,@Service`之类的服务类会被会被优化删除
> `dontoptimize` 不进行内联操作,否则会导致`@Service`中的方法加入到`@Controller`中
> `keepclassmembers` 保证实体类get/set方法的完整性,否则会导致序列化框架无法正常运行
> `keepattributes` 保留指定的属性,[详情](https://www.guardsquare.com/en/products/proguard/manual/usage/attributes)