# mybatis-generator
mybatis逆向工程(自动生成类注释和字段注释，序列化，mapper方法注释)


# idea打开项目：
1.修改jdbc.properties数据库链接，用户，密码（注意数据库时问题），修改生成文件的路径
2.修改mybatis-generator-config.xml中相关表的配置的配置（对应数据库中存在的表的名称）
3.运行StartUp.java中的main即可，将生成的entity,excample，mapper和mapper.xml复制到项目中即可
