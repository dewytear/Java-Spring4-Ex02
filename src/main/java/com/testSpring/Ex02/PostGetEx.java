package com.testSpring.Ex02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostGetEx {

	@RequestMapping("/inputMem")
	public String goInputMem() {
		return "inputForm";
	}

	@RequestMapping(value="person", method=RequestMethod.GET)
	public String goPerson(HttpServletRequest request, Model model) {

		String id = request.getParameter("id");
		String name = request.getParameter("name");

		System.out.println("id : "+ id);
		System.out.println("name : "+ name);

		model.addAttribute("id", id);
		model.addAttribute("name", name);

		return "person/infoMem";
	}//goPerson

	// goPerson 을 오버로딩 (하나의 비지니스 로직 이므로 이름을 같게 해서 사용함)
	// ModelAndView 객체를 리턴 해야하기때문에 ModelAndView로 선언
	@RequestMapping(value="person", method=RequestMethod.POST)
	public ModelAndView goPerson(HttpServletRequest request) {

		String id = request.getParameter("id");
		String name = request.getParameter("name");

		System.out.println("id : "+ id);
		System.out.println("name : "+ name);

//		model.addAttribute("id", id);
//		model.addAttribute("name", name);

		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("person/infoMem");
		modelView.addObject("id", id);
		modelView.addObject("name", name);

		return modelView;
	}//goPerson

}
