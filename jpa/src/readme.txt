1.spring-boot-myBatis
2.分页 使用PageHelper 先在FrontApplication中实现pageHelper方法，
    然后再在Controller的方法的返回前加PageHelper.startPage(x,y); x-第几页，y-每页个数
3.自动json，加入fastjson的jar包，在FrontApplication中实现HttpMessageConverters方法，
    可以自定义json，如日期转换@JSONField(format = "yyyy-MM-dd HH:mm:ss")，某个属性不输出@JSONField(serialize=false)