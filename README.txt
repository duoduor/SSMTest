需要修改的文件有：resource/jdbc.properties 数据库参数

mvn运行：
浏览器输入：http://localhost:8088/views/login.jsp 进入登录页面
输入正确的firstName---> 登录  --> index页面
--> Customer 管理 --> 显示customer表信息

-->点击下一页/上一页 进行分页查询

-->新增--页面(customer.jsp)--输入页面数据--确认--插入成功 
                           --取消--返回index页面
-->点击删除-->数据从页面消失--返回index页面
-->点击修改-->页面(editCustomer.jsp)--编辑需要修改的数据--确定--修改成功--返回index页面
                                                        --取消--返回index页面
 

