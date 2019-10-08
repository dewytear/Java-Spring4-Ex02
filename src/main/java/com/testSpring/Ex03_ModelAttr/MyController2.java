package com.testSpring.Ex03_ModelAttr;


//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController2 {

//	private static final Logger Logger = LoggerFactory.getLogger(MyController2.class);

	@RequestMapping("/form")
	public String userForm() {

//		Logger.info("test Logging....................................");

		//http://localhost:9090/Ex03_ModelAttr/form
		return "user/userFrom";
	}

	@RequestMapping("/userInfo")
	public String userInfo(@ModelAttribute("userInfo") UserInformation userInformation) {

		return "user/userInfo";
	}

}
