# Spring
Spring Framework related coding practice

                              SpringFirstProg/app1 -- 
this is 1st prog. Instead of creating package for XML, craete folder since package in java has .class/.java files.
For simple spring app. create XML file directly under src folder. In this prog I have created xml under src package.

XML --copy XSD in xml file. It check where ever tag libraries are available. Tags are available properly or not.
XSD --- beans.html -- search for XSD copy it and close it with </beans>
id -- class name ; class--fully qualified name of class; 

We can directly create object of bean in Test class and call sayHello(). But that is not the approach 

to use Spring. But in SPring, Spring will come to you, it will recognize the object you require, it will 

create that object and will provide it to you. Spring frm. is responsible to create bean object, develper 

is not. THat is the advantage of Spring. Every obj is provided by SPring frm, Our  job is to get that obj 

and use it. Hoe Spring creates the object? 
Spring frm will go to applicationcontext.xml file, will recognize bean config. will take bean class name  
on the basis of id, create obj and will return object reference value to you.
In web appl, we create servlet classes and map them in XML file. Web container will create servlet context 
object.
In spring, Spring container is specialized component to do this job.
If we want to create obj on our own. If a chain of classes is available then we create deeper class obj then 
upto top class. But in spring container will resolve all these dependencies and will create object.
ApplicationContext context = new ClassPathXmlApplicationContext(""); provide name and path of XML file 
name. If the file is under SRC then directly file name.
If there multiple beans then for each bean separate obj created by container. All these bean obj are 
availalbe as obj and its identity as key(identity) value(obj) pair.
context.getBean("class name") ; this getBean() returns the object in most generic type ie. super type ie. 
Object type. We want it in the our class type ie. HelloBean type.

