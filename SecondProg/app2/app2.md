app2
We have changed the xml file location. If we save it under src then no need to give path. But if we keep in 

separate folder then path should be mentioned.
We have added getter and setter methods in bean class. In actual class we are setting value of property.
If we want to change the value of peroperty in such a way that the files is not compiled after every 

change, then set it in xml file as property under <beans> .... </beans> tag
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
        
       <bean id="HelloBean" class="com.secondapp.beans.HelloBean" >
       <property name="name" value="Ram"></property>
       </bean>
        
</beans>


RunApp.java
public static void main(String[] args) {  
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext

("/com/secondapp/cfgs/applicationContext.xml");
		HelloBean bean = (HelloBean)context.getBean("HelloBean");
//		bean.setName("Ram");
		System.out.println(bean.sayHello());
	}

In this code, if when the HelloBean object is created ?
It is created at ApplicationContext context = new ClassPathXmlApplicationContext

("/com/secondapp/cfgs/applicationContext.xml");
This is called early initialization which feature of ApplicationContext. In beanFactory it is lazy 

initialization.

How to check object craetion?
//		HelloBean bean = (HelloBean)context.getBean("HelloBean");
//		bean.setName("Ram");
//		System.out.println(bean.sayHello());
comment this code. Now add constructor() to bean class
HelloBean(){   "Object created."  }
Run the code.

Run.java
ApplicationContext context = new ClassPathXmlApplicationContext

("/com/secondapp/cfgs/applicationContext.xml");
		
		HelloBean bean = (HelloBean)context.getBean("HelloBean");
		HelloBean bean1 = (HelloBean)context.getBean("HelloBean");
		HelloBean bean2 = (HelloBean)context.getBean("HelloBean");

1 -- ApplicationContext object created --- 3 HelloBean objects created(false).
But it will return same application object. Hence only 1 HelloBean object created for 1 ApplicationContext 

object.

How to check this?
create static int x; increment it inside constructor x++; print in Run.java


Run.java
ApplicationContext context = new ClassPathXmlApplicationContext

("/com/secondapp/cfgs/applicationContext.xml");
		ApplicationContext context1 = new ClassPathXmlApplicationContext

("/com/secondapp/cfgs/applicationContext.xml");
		ApplicationContext context2 = new ClassPathXmlApplicationContext

("/com/secondapp/cfgs/applicationContext.xml");

In this case 3 separate ApplicationContext objects are created.  

For each container 1 ApplicationContext object created.

In case of BeanFactory, everytime when we call getBean() separate Bean object is created. BeanFactory does 

not create the bean object at the time of Container creation. For eact container, separate Bean object is 

created.
