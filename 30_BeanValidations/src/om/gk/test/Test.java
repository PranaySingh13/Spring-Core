package om.gk.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import com.gk.beans.User;
import com.gk.validator.UserValidator;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("/com/gk/resources/applicationContext.xml");
		User user=(User)context.getBean("userBean");
		user.getUserDetails();
		UserValidator userValidate=(UserValidator)context.getBean("userValidator");
		
		//both are String because map consider key and value as string.
		Map<String,String> map=new HashMap<String,String>();
		MapBindingResult results=new MapBindingResult(map,"com.gk.beans.User");
		userValidate.validate(user, results);
		
		//for getting all the validation messages
		List<ObjectError> list=results.getAllErrors();
		for(ObjectError error: list) {
			System.out.println(error.getDefaultMessage());
		}
	}

}
