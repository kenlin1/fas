# 代码结构说明
com.founder

  +- fas 总根路径
  
   	 +- secure   模块名称
    
      +- dao   数据访问
      |
      +- entity 实体类
      |
      +- service 业务逻辑
      | 
      +- web 页面controller
      |

# secure
角色权限管理模块

1 页面权限

2 页面中元素权限

3 数据库取roles和users

核心代码：WebSecurityConfig 权限配置      MyStartupRunner 服务启动执行