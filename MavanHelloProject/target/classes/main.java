import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.face.hello.helloClass;

public class main {

	public static void main(String[] args) {
		public static void main(String[] args) {
			ApplicationContext beanFactory=new ClassPathXmlApplicationContext("resources/H.xml");
			helloClass myBean=(helloClass) beanFactory.getBean("a");
			myBean.printHello();
		}
		}

