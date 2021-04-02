# proguard-maven-example
Java代码混淆案例，基于Proguard，使用Maven构建

# 模块说明及注意事项

> base-module 基础混淆
> multi-module 多模块混淆

**注意事项**

1. proguard-base 6及以下与 proguard-base 7需要的依赖不同,详情见 [base-module](/base-module) 中的 [pom.xml](/base-module/pom.xml) 的 version 6.2.2、7.0.1
2. 如果不指定 proguard-maven-plugin 依赖的版本，则使用该版本号对应的最新依赖

## base-module

**profile详解**

1. obfuscate pom,混淆配置放在 pom.xml 中
2. obfuscate cfg,混淆配置放在 proguard.cfg 中
3. obfuscate version 6.2.2,指定混淆的 proguard-base 插件为 6.2.2版本
4. obfuscate version 7.0.1,指定混淆的 proguard-base 插件为 7.0.1版本

# multiple-module

## 打包流程与讲解

**预打包**

> 在根目录执行,下方命令,将 multiple-module-parent 依赖的文件预安装
>
>> mvn -pl :parent,:multiple-module,:multiple-module-child clean install

**普通编译**

> mvn -pl :multiple-module-parent clean package

**multiple assembly plugin obfuscate**

- 由于是平行模块,所以需要预先安装子模块,再使用`maven-assembly-plugin`将子模块重新解压打包成一个jar
- 再使用`proguard-maven-plugin`,将由`maven-assembly-plugin`生成的jar进行混淆重新生成jar

> 将child和parent编译成一个jar 
>
>> mvn -pl :multiple-module-parent clean package -P "multiple assembly plugin"
> 
> 将child和parent编译成一个jar 并混淆
>
>> mvn -pl :multiple-module-parent clean package -P "multiple assembly plugin obfuscate"

**multiple assembly tag obfuscate**

- 直接使用 assembly 标签将子模块打包进父模块,一起混淆

> 在根目录执行,下方命令,将 multiple-module-parent 依赖的文件预安装
>
>> mvn -pl :parent,:multiple-module,:multiple-module-child clean install
>
> 将child和parent编译成一个jar 并混淆
>
>> mvn -pl :multiple-module-parent clean package -P "multiple assembly tag obfuscate"