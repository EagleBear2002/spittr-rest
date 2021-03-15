# spittr-rest
## rest接口测试用
## 这是一个基于spring mvc框架的rest实现
## 并非使用spring boot
`1）内容协商（Content negotiation）
ContentNegotiatingViewResolver是要创建的bean，基于内容协商生成表述，判断的依据有请求头的Accept，URL请求路径加扩展名（优先）。
然后会转向具体的视图解析器生成不同的视图表述
ContentNegotiationManager（配置的作用）
通过setter注入到ContentNegotiatingViewResolver中
创建这个Bean的方式是继承自WebMvcConfigerAdapter（基于spring mvc）
覆盖方法configureContentNegotiation，配置缺省内容类型等。
2）消息转换器（Message conversion）
使用注解@ResponseBody或类级@RestController，作用：指定使用消息转换器
没有model和视图，控制器产生数据，然后消息转换器转换数据之后的资源表述。
spring自动注册一些消息转换器（HttpMethodConverter），不过类路径下要有对应转换能力的库，如：Jackson Json processor、JAXB库
请求传入，@RequestBody以及HttpMethodConverter`