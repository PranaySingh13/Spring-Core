package com.gk.validator;

import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.gk.beans.User;

public class UserValidator implements Validator {

	//To bind the error message.properties file in config.xml
	private Resource resource;

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	@Override // This method return true Value when it will check whether the Bean object is supporting data validations or not..
	public boolean supports(Class<?> type) {
		System.out.println("Hello! User is available");
		return User.class.equals(type);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		try {
			System.out.println("Hello! After Validating User Credentials Some Issues are present");
			User user = (User) obj;
			
			//Converting the resource object into property object to get the value associated with key thorugh getProperty().
			Properties prop = PropertiesLoaderUtils.loadProperties(resource);
			if (user.getUid() == null || user.getUid().equals("")) {
																			//We can also give hardcoded error message value associated with key in getProperty().
				errors.rejectValue("uid", "error.uid.empty", prop.getProperty("error.uid.empty","User Id is Required."));
			} else {
				if (!user.getUid().startsWith("U-")) {
																			//But for simplicity we create message in .properties file		
					errors.rejectValue("uid","error.uid.invalid", prop.getProperty("error.uid.invalid"));
				}
			}
			//---------------------
			if(user.getUname()==null || user.getUname().equals("")) {
				errors.rejectValue("uname", "error.uname.empty",prop.getProperty("error.uname.empty"));
			}
			//---------------------
			if(user.getUpwd()==null || user.getUpwd().equals("")) {
				errors.rejectValue("upwd","error.upwd.empty",prop.getProperty("error.upwd.empty"));
			}else {
				if(user.getUpwd().length()<8 || user.getUpwd().length()>15) {
					errors.rejectValue("upwd", "error.upwd.invalid.length", prop.getProperty("error.upwd.invalid.length"));
				}
			}
			//----------------------
			if(user.getUsal()<=0) {
				errors.rejectValue("usal", "error.usal.invalid",prop.getProperty("error.usal.invalid"));
			}
			//----------------------
			if(user.getUage()<18 ||user.getUage()>30) {
				errors.rejectValue("uage", "error.uage.invalid.range", prop.getProperty("error.uage.invalid.range"));
			}
			//----------------------
			if(user.getUemail()==null ||user.getUemail().equals("")) {
				errors.rejectValue("uemail", "error.uemail.empty", prop.getProperty("error.uemail.empty"));
			}
			else {
				if(!user.getUemail().endsWith("@gmail.com")) {
					errors.rejectValue("uemail", "error.uemail.invalid", prop.getProperty("error.uemail.invalid"));
				}
			}
			//----------------------
			if(user.getUmobile()==null || user.getUmobile().equals("")) {
				errors.rejectValue("umobile","error.umobile.empty", prop.getProperty("error.umobile.empty"));
			}
			else{
				if(!user.getUmobile().startsWith("+91-")) {
					errors.rejectValue("umobile", "error.umobile.invalid", prop.getProperty("error.umobile.invalid"));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
