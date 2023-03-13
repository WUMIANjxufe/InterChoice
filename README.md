# 工程简介

# 延伸阅读
#logback-spring.xml用于日志优化,会在根目录下生成log记录运行情况
#.gitignore文件可以用于添加不需要git托管的文件路径
DEBUG:
java: 程序包org.springframework.boot不存在的解决方法
打开idea的设置，在mav的运行程序项里面，勾上【将IDE构建/运行操作委托给Maven】

#SpringBoot端口号被占
创建新的端口号
当遇到这个问题时，我们可以创建一个新的端口号来重新执行SpringBoot项目，创建新的端口号其实很简单，只需要在application.yaml或者application.properties文件下配置即可。
#修改端口号  yaml文件修改
server:
port: 8080
#修改端口号 properties文件配置
server.port=8080
2.释放被占有的端口号
（1）打开 cmd命令窗口，输入netstat -ano|findstr 端口号 命令，查询该端口对应的TCP号；
查询到端口号后，在关闭对应的TCP号即可关闭端口。
（2）输入taskkill /t /f /im TCP号，来关闭被占用的端口

#可以参考周璐喆的项目，pdf信息提取