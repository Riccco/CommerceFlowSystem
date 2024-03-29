# コア機能
* SpringApplication: `main()`メソッドから開始されるSpringアプリ。
  * 遅延初期化:HTTPリクエストを受信すれまで多くのWeb関連Beanが初期化されなくなります。
  * application.properties => `spring.main.lazy-initialization=true`

# HTMLマッピング

1. pom.xml
```xml
       <!-- Thymeleaf -->
       <dependency>
   			 <groupId>org.springframework.boot</groupId>
   			 <artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
```

2. application.properties
```
spring.thymeleaf.cache=false
spring.thymeleaf.mode=HTML
spring.thymeleaf.encoding=UTF-8
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
```

3. ファイル.java
```Java
@Controller
public class a {
  @GetMapping("/path")
	public String inputForm(Model model) {
		model.addAttribute("data",new A());
		return "file";
	}
}

```

4. HTMLファイル配置: resources -> templates -> file.html
```HTML
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Thymeleaf Template</title>
</head>
<body>
    <form action="#" th:action="@{/submit}" th:object="${data}" method="post">
        <input type="text" th:field="*{input}" />
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
```


# ホットリロード

1. pom.xml
```
	  <!-- ホットリロード  -->
		<dependency>
			 <groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
        <optional>true</optional>
       </dependency>
```

2. Eclipse -> Menu -> Project -> Build Automatically -> 再起動

# Spring Web

## @RestController及び@RequestMapping アノテーション「注解」
> ステレオタイプ「刻板印象」アノテーション

`@RestController`を使われ、クラスはWeb@Controllerこのこと分かる。

`@RequestMapping` アノテーションは、結果の文字列を呼び出し元に直接返すようにSpringに指示「しじ」します

```Java
@RestController
public class A{
  @RequestMapping("/")
  String home(){
    return "hello"
  }
}
```

## @Controller
> HTTP リクエストを受け取って処理します

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

# 推奨「すいしょう」ディレクトリ

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

1. ok　別機能を連携  
  ・@Service ok
```
	private final helloworldSerivce helloworldserivce;
    @Autowired
    public HelloWorld(helloworldSerivce helloworldserivce) {
        this.helloworldserivce = helloworldserivce;
    }

    return helloworldserivce.newLogic();

```

2. ok   RestController
3. ok  @RequestMapping
4.   DB連携
5. * @SpringBootApplication


# 登録

1. app作成 inputあり  ok
2. パラメータを受ける
3. DB連携
4. 詮索

