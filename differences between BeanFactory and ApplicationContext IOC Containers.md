Differences between BeanFactory and ApplicationContext IOC Containers.md

1)BeanFactory is fundamental IOC Container , it is able to provide fundamental functionalities to the spring applications like creating and maintaning bean objects.
ApplicationContext IOC Container is an extension of BeanFactory IOC Container , it is able to provide some advanced features like Internationalization, Event Handling,..... along with fundamental functionalities what BeanFactory is providing.
2) BeanFactory is not supporting to integrate AOP services like Security, JTA,... to the spring applications.
ApplicationContext is supporting to integrate AOP services like Security, JTA,... to the spring applications.
3)BeanFactory is not suitable for web applications which we are going to prepare on the basis of Spring web module.
ApplicationContext is suitable for the web applications which we want to prepare on the basis of Spring web module.
4)BeanFactory is able to prpare Singleton objects when we send first request for bean, that is, Lazy Instantiation/Initialization.
ApplicationContext is able to prepare Singleton objects when we activate Container , that is , early Instantiation/Initialization.
5.BeanFactory is supporting only the scopes like Singleton and Prototype.
ApplicationContext is supporting almost all the Spring scopes like Singleton, Prototype, request, session, globalSession, webSocket,...
6.BeanFactory is mainly for Standalone Applications.
ApplicationContext is for all the types of Spring famework applications.
7.BeanFactory is an outdated Container in Spring applications.
ApplicationContext is not outdated Container.
