# 骚憋粉在线抽奖项目文档

一、项目背景
本项目的目的是实现类似于拼多多拼夕夕砍一刀的在线抽奖功能，用户可以在抽奖页面上点击“砍一刀”按钮，系统会根据一定的规则计算出本次砍价的金额，用户最终支付砍下的价格即可获得抽奖资格。

二、功能模块

1. 砍价规则模块：使用Lambda表达式和Stream API实现砍价规则的计算，包括基础价格、最高价格、砍价区间、砍价步长等，保证每次砍价金额的随机性和公平性。
2. 数据存储模块：使用Java 8中的新特性对数据进行存储和读取，可以使用Java 8自带的SQLite数据库，也可以使用Java 8中的Files和Path API实现数据的持久化存储。
3. 抽奖页面模块：使用JavaWeb实现抽奖页面的设计和交互，包括用户信息的录入、砍价按钮的点击、砍价金额的展示、抽奖结果的显示等功能。
4. 支付功能模块：使用Lambda表达式和Stream API实现支付功能，用户在砍价成功后可以选择使用支付宝、微信等支付方式进行支付，并在系统中记录支付信息和订单信息。
5. 系统设置模块：使用Properties类实现系统设置的读取和写入，包括数据库配置、砍价规则配置、支付配置等。

三、技术选型

Java EE：注解、反射、多线程、泛型等。
Java 8：使用Java 8中的新特性，包括Lambda表达式、Stream API等。
MySql：使用MySql数据库进行数据存储和读取，方便快捷。
DbUtils：使用DbUtils工具类库对数据库继续操作
vue2和es6：使用实现抽奖页面的设计和交互，提供更好的用户体验。
Maven：使用Maven管理项目依赖，方便项目的构建和管理。

四、相关链接
远程仓库：https://github.com/lldwb/PinduoduoSlashSimulator.git



