package com.testSpring.Ex02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableEx {

	@RequestMapping("/page/{var}")
	public String page(@PathVariable String var) {

		String ViewName = "";

		// 호출하는 주소(var)에 따라 여는 페이지를 다르게 지정
		if(var.equals("one")) {
			ViewName = "page/page1";
		}else if(var.equals("two")) {
			ViewName = "page/page2";
		}

		//http://localhost:9090/Ex02/page/one
		//http://localhost:9090/Ex02/page/two
		return ViewName;
	}
}
