

### 版本

基于IDEA的moven整合的SSM框架

Tomcat 8.5(9,10出问题不知道咋改)

Mysql 8.0.26

Moven 3.8.3

### 参考

[(1条消息) （超详细、适合新手入门）IDEA+Maven 整合SSM框架实现简单的增删改查_khxu666的博客-CSDN博客_idea maven ssm](https://blog.csdn.net/khxu666/article/details/79851070?utm_medium=distribute.pc_relevant.none-task-blog-2~default~BlogCommendFromBaidu~default-6.no_search_link&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2~default~BlogCommendFromBaidu~default-6.no_search_link)

### 注意事项

- 需要基于mysql版本选择对应的链接包

  ![image-20211018091703323](C:\Users\17875\Desktop\QQ截图20211018093020.png)

  [Maven Repository: Search/Browse/Explore (mvnrepository.com)](https://mvnrepository.com/)

  在该网站搜索对应的artifactId

  <img src="C:\Users\17875\AppData\Roaming\Typora\typora-user-images\image-20211018091958908.png" alt="image-20211018091958908" style="zoom:50%;" />

  选择合适版本，将对应依赖代码粘贴至pom.xml处，

  ![image-20211018092217725](C:\Users\17875\AppData\Roaming\Typora\typora-user-images\image-20211018092217725.png)

- 修改jdbc.properties

  新版本驱动为com.mysql.cj.jdbc.Driver，老版本为com.sql.jdbc.Driver根据版本进行修改。

  url跟改为自己数据库连接，修改hccsql为自己数据库名称。

  ![image-20211018092451599](C:\Users\17875\AppData\Roaming\Typora\typora-user-images\image-20211018092451599.png)

- 运行Test/java/test类，测试数据库是否连接。

- 运行结果![image-20211018092857474](C:\Users\17875\AppData\Roaming\Typora\typora-user-images\image-20211018092857474.png)

- 其余问题私聊我，若你有我联系方式的话。

