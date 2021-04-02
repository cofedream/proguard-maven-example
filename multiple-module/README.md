# 打包流程与讲解

**预打包**

> 在根目录执行,下方命令,将 multiple-module-parent 依赖的文件预安装
> 
> `mvn -pl :parent,:multiple-module,:multiple-module-child clean install`

**普通编译**

> mvn -pl :multiple-module-parent clean package

**multiple assembly plugin obfuscate**

- 由于是平行模块,所以需要预先安装子模块,再使用`maven-assembly-plugin`将子模块重新解压打包成一个jar
- 再使用`proguard-maven-plugin`,将由`maven-assembly-plugin`生成的jar进行混淆重新生成jar

> 将child和parent编译成一个jar
>
> `mvn -pl :multiple-module-parent clean package -P "multiple assembly plugin"`
>
> 将child和parent编译成一个jar 并混淆
>
> `mvn -pl :multiple-module-parent clean package -P "multiple assembly plugin obfuscate"`

**multiple assembly tag obfuscate**

- 直接使用 assembly 标签将子模块打包进父模块,一起混淆

> 在根目录执行,下方命令,将 multiple-module-parent 依赖的文件预安装
>
> `mvn -pl :parent,:multiple-module,:multiple-module-child clean install`
>
> 将child和parent编译成一个jar 并混淆
>
> `mvn -pl :multiple-module-parent clean package -P "multiple assembly tag obfuscate"`