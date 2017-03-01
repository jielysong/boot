
1.继承了redis


1.错误
Field userMapper in com.example.service.UserService required a bean of type 'com.example.mapper.UserMapper' that could not be found.
把MybatisApplication中的@MapperScan("com.example.*.mapper")改为@MapperScan("com.example.*")