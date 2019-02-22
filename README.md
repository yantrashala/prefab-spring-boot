# ?? prefab

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

2019-02-22 16:41:45.221  INFO 1 --- [           main] c.p.services.spring.boot.Application     : Starting Application on 353536f7ec8b with PID 1 (/app started by root in /)
2019-02-22 16:41:45.224  INFO 1 --- [           main] c.p.services.spring.boot.Application     : No active profile set, falling back to default profiles: default
2019-02-22 16:41:47.970  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2019-02-22 16:41:48.025  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2019-02-22 16:41:48.026  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.16]
2019-02-22 16:41:48.037  INFO 1 --- [           main] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [/usr/lib/jvm/java-1.8-openjdk/jre/lib/amd64/server:/usr/lib/jvm/java-1.8-openjdk/jre/lib/amd64:/usr/lib/jvm/java-1.8-openjdk/jre/../lib/amd64:/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib]
2019-02-22 16:41:48.215  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2019-02-22 16:41:48.215  INFO 1 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2896 ms
2019-02-22 16:41:49.371  INFO 1 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-02-22 16:41:49.834  INFO 1 --- [           main] .s.s.UserDetailsServiceAutoConfiguration :

Using generated security password: 1d937a9e-22b1-481d-a4fb-4f8515007257

2019-02-22 16:41:49.982  INFO 1 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Creating filter chain: any request, [org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@11f406f8, org.springframework.security.web.context.SecurityContextPersistenceFilter@6cd164a6, org.springframework.security.web.header.HeaderWriterFilter@55e2fe3c, org.springframework.security.web.csrf.CsrfFilter@6b8280e6, org.springframework.security.web.authentication.logout.LogoutFilter@3cb8c8ce, org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter@43a0a32d, org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter@44550792, org.springframework.security.web.authentication.ui.DefaultLogoutPageGeneratingFilter@987455b, org.springframework.security.web.authentication.www.BasicAuthenticationFilter@1174a305, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@64469d8, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@27df0f3d, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@622fdb81, org.springframework.security.web.session.SessionManagementFilter@12c60152, org.springframework.security.web.access.ExceptionTranslationFilter@282ffbf5, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@44924587]
2019-02-22 16:41:50.035  INFO 1 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2019-02-22 16:41:50.210  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2019-02-22 16:41:50.216  INFO 1 --- [           main] c.p.services.spring.boot.Application     : Started Application in 5.632 seconds (JVM running for 6.089)