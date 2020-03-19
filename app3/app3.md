app3 -
BeanFactory is used in this application. 
BeanFactory (I) has 1 implementation class ie. XmlBeanFactory
First Spring framework loads, parses and reads xml and resource object is created. This resource object has 

the data of xml file ie. bean id and mapped class as key-value pair. Then BeanFactory object is created. It 
is Lazy instantiation. Menas; at this time no Bean object is created. 
Then Bean object is created using BeanFactory object. We can confirm this by introducing static blocks and 

constructor in Bean class.
IOC container creat singleton onjects. Each BeanFactory will create only one object for one Bean class. Our 

class is not a singleton class but container makes it singleton if we create only on beanfactory object.
This Bean object then loads Bean class

BeanFactory is oudated from Verion 3.0

applicationContext

It is BeanFactory + other features like Internationalization (I18N), Event handling etc 

It has 3 implementation classes. 1. ClassPathXmlApplicationContext 2. FileSystemApplicationContext 3. WebXmlApplicationContext
When we create applicationContext object then container is activated as well as it will BeansConfig xml file , load xml file and will maintain the xml file in the form of some object. It will identify all Bean configurations provided in xml and will recognize each one depending on id and class location. Will load bean class and perform instantiation. Bean object is craeted and will store it in the form of key value pair. Whether we use that bean object or not is different thing it is created at this stage. This is eager instantiation. 
When we call getBean() then applicaitnContext will take Bean class id and classpath and will creat and return Bean class object. Using this Bean object reference we can call properties of that Bean class.


 



