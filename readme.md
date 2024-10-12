

基于原本的[Extract string resources](https://github.com/easylokal/string-resource-helper-plugin)插件修改

添加一定的筛选条件，避免所有的字符串都扫出来

![示例](/img.png)


比如
``` 
   [A-Za-z0-9_${}()%:&-/，, =\.\\]+
```
这样能避免一些纯数字，英文字符

这里就不发市场了。直接上jar。本地安装

[instrumented-testP-1.0-SNAPSHOT.jar](instrumented-testP-1.0-SNAPSHOT.jar)


开发环境
``` 
IntelliJ IDEA 2023.2.1 (Community Edition)
```



