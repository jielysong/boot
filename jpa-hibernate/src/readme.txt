1.Spring Boot Spring Data JPA
2.分页 使用PageHelper 先在FrontApplication中实现pageHelper方法，
    然后再在Controller的方法的返回前加PageHelper.startPage(x,y); x-第几页，y-每页个数
3.自动json，加入fastjson的jar包，在FrontApplication中实现HttpMessageConverters方法，
    可以自定义json，如日期转换@JSONField(format = "yyyy-MM-dd HH:mm:ss")，某个属性不输出@JSONField(serialize=false)
4.全局异常捕捉不起作用
5.thymeleaf 在Controller中使用注解@Controller，方法返回值必须为String，返回值对应了heml文件，如返回字符串为"nimei",则在浏览器中会打开nimei.xml
6.jdbcTemperate-见UserService
7.server的配置
8.freeMaker失败

错误处理
1.strategy = "uuid"，出现Could not set field value [40289f645a4ee816015a4ef19d5e0003] value by reflection,错误
  把id属性改为String类型
2 strategy = "uuid"，出现GenericJDBCException，把表删除了，再运行就OK了
3.全局异常捕捉不起作用
4.template might not exist or might not be accessible by any of the configured Template Resolvers