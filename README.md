# jsp_and_database_curriculum-design
# 这个是我的jsp和数据库课程设计的作业，仅供参考！
#---------------------------------------------------------------------------------------------------
# 备注：eclipse汉化步骤：1. 选择Help 2.选择install New software..  3.点击add  4. 将下面的URL复制到location位置。（URL为：http://download.eclipse.org/technology/babel/update-site/R0.15.1/oxygen )   5.选择中文即Chinese（simple）这一个语言包，然后点击NEXT，I accept，finish等，等待安装完成（注意看右下角安装进度），然后重启eclipse即可！

#---------------------------------------------------------------------------------------------------
# 数据库层利用了SQL server的存储过程进而实现部分表的增删查改操作，请注意区分。   
#          MySql的时间类型有                                                                                     Java中与之对应的时间类型
#             date                                              java.sql.Date
#             Datetime                                       java.sql.Timestamp
#            Timestamp                                     java.sql.Timestamp
#            Time                                             java.sql.Time
#             Year                                              java.sql.Date
# 

#  在数据库中用Datetime 类型，在前端用   java.sql.Timestamp  的数据类型，可以精确到秒

#---------------------------------------------------------------------------------------------------
# 昨天做站内信这个模块，出现了一个很纠结的问题：在发站内信时需要往数据库中存入发信人，一般思维就是一个<input type=“hidden” value=<%=senter%> />，但是测试的时候Tiger这个名字没事，如果用Li Mei的话就只会出现Li 没有Mei，当然用Li Mei 也是一个错误，因为注册用户名是不允许有空格存在的。这是一个html 关于value 空格后的内容消失的问题

# 解决方法是<input type=“hidden” value=“<%=senter%>” />，加上双引号就行了，以后必须仔细，小有不慎，必酿大错。

#---------------------------------------------------------------------------------------------------

# 