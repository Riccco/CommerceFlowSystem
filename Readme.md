# 初めてのspring boot
* @RequestMapping ?
* @SpringBootApplication
* @RestController
* 

# コア機能
* SpringApplication: `main()`メソッドから開始されるSpringアプリ。
  * 遅延初期化:HTTPリクエストを受信すれまで多くのWeb関連Beanが初期化されなくなります。
  * application.properties => `spring.main.lazy-initialization=true`

# ホットリロード

1. 
pom.xml
```
	  <!-- ホットリロード  -->
		<dependency>
			 <groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
        <optional>true</optional>
       </dependency>
```

2. 
Eclipse -> Menu -> Project -> Build Automatically -> 再起動

# @Service & @Autowired
> 依存性注入

例:
```Java
> ファイル

@Service
public class A{
  public String Aa(){
    return "Aa"
  }
}

// コンストラクタ 「构造函数」
@Autowired
private final A a
public B(A a){
  this.a = a
}

return a.a
```

# ディレクトリ

```
src/main/java/
└── com
    └── yourcompany
        └── yourproject
            ├── controller  // 存放控制器类
            │   └── UserController.java
            ├── service     // 存放业务逻辑层类
            │   └── UserService.java
            ├── repository  // 存放数据访问层类
            │   └── UserRepository.java
            ├── model       // 存放实体类
            │   └── User.java
            ├── dto         // 存放数据传输对象
            │   └── UserRegistrationDto.java
            └── YourApplication.java // Spring Boot 应用的主类

Controller（控制器层）：UserController.java 文件负责处理用户相关的 HTTP 请求，如用户注册请求。

Service（服务层）：UserService.java 文件包含用户注册的业务逻辑，如检查用户名是否已存在、加密密码等。

Repository（数据访问层）：UserRepository.java 文件用于与数据库进行交互，例如保存新用户信息。

Model（模型层）：User.java 文件定义了用户实体，通常映射到数据库的用户表。

DTO（数据传输对象）：UserRegistrationDto.java 文件用于封装和传输用户注册时提交的数据。

Application Class（应用主类）：YourApplication.java 是启动 Spring Boot 应用的主类。

Resources（资源目录）：包含应用的配置文件（如 application.properties），以及可选的静态资源和模板文件。

src/main/resources/
├── static       // 存放静态资源，如 HTML、CSS、JS 文件
├── templates    // 存放模板文件，如 Thymeleaf 模板
└── application.properties // Spring Boot 配置文件
```

# TODO

1. 　別機能を連携  
  ・@Service ok
```
	private final helloworldSerivce helloworldserivce;
    @Autowired
    public HelloWorld(helloworldSerivce helloworldserivce) {
        this.helloworldserivce = helloworldserivce;
    }

    return helloworldserivce.newLogic();

```

2.   RestController
3.   @RequestMapping
4.   DB連携