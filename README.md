# ◤◣ prefab

## prefab-spring-boot
A scaffold code for the java spring boot service

### Fetch from Github

```
> mkdir $HOME/service
> cd service
> git clone https://github.com/yantrashala/prefab-spring-boot.git
> cd prefab-spring-boot
```

### Build and Run in docker (suggested)

````
> cd prefab-spring-boot
> docker build -t ps/prefab-spring-boot:latest .

...

> docker run --rm -p8080:8080 -it  ps/prefab-spring-boot


 .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.3.RELEASE)

2019-03-16 20:44:07.611  INFO 7 --- [           main] c.p.services.springboot.Application      : Starting Application on b57628548cb7 with PID 7 (/app started by root in /)
2019-03-16 20:44:07.625  INFO 7 --- [           main] c.p.services.springboot.Application      : No active profile set, falling back to default profiles: default
2019-03-16 20:44:13.658  INFO 7 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2019-03-16 20:44:13.745  INFO 7 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-03-16 20:44:13.747  INFO 7 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.16]
2019-03-16 20:44:13.797  INFO 7 --- [           main] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [/usr/lib/jvm/java-1.8-openjdk/jre/lib/amd64/server:/usr/lib/jvm/java-1.8-openjdk/jre/lib/amd64:/usr/lib/jvm/java-1.8-openjdk/jre/../lib/amd64:/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib]
2019-03-16 20:44:14.137  INFO 7 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-03-16 20:44:14.138  INFO 7 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 6283 ms
2019-03-16 20:44:16.027  INFO 7 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2019-03-16 20:44:16.202  INFO 7 --- [           main] pertySourcedRequestMappingHandlerMapping : Mapped URL path [/v2/api-docs] onto method [public org.springframework.http.ResponseEntity<springfox.documentation.spring.web.json.Json> springfox.documentation.swagger2.web.Swagger2Controller.getDocumentation(java.lang.String,javax.servlet.http.HttpServletRequest)]
2019-03-16 20:44:16.502  INFO 7 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-03-16 20:44:16.999  INFO 7 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Context refreshed
2019-03-16 20:44:17.062  INFO 7 --- [           main] d.s.w.p.DocumentationPluginsBootstrapper : Found 1 custom documentation plugin(s)
2019-03-16 20:44:17.106  INFO 7 --- [           main] s.d.s.w.s.ApiListingReferenceScanner     : Scanning for api listing references
2019-03-16 20:44:17.741  INFO 7 --- [           main] .d.s.w.r.o.CachingOperationNameGenerator : Generating unique operation named: handleUsingGET_1
2019-03-16 20:44:17.751  INFO 7 --- [           main] .d.s.w.r.o.CachingOperationNameGenerator : Generating unique operation named: handleUsingGET_2
2019-03-16 20:44:17.773  INFO 7 --- [           main] .d.s.w.r.o.CachingOperationNameGenerator : Generating unique operation named: handleUsingGET_3
2019-03-16 20:44:17.981  INFO 7 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2019-03-16 20:44:17.991  INFO 7 --- [           main] c.p.services.springboot.Application      : Started Application in 11.196 seconds (JVM running for 11.949)
2019-03-16 20:44:32.140  INFO 7 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2019-03-16 20:44:32.140  INFO 7 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2019-03-16 20:44:32.166  INFO 7 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 25 ms
