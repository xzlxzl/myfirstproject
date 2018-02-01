import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swd.webservice.service.IUserService;
import com.swd.webservice.vo.User;


public class SqlTest {
     public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	    IUserService userService =(IUserService) ac.getBean("iuserServiceImpl");
	    User user=userService.getUserById(222);
	    System.out.println(user.getUserName());
	}
}
