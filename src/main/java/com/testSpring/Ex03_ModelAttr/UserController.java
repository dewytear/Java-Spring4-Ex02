package com.testSpring.Ex03_ModelAttr;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	//[region] @ModelAttribute 사용

	// 1. @ModelAttribute Annotation은 view에 model을 전달한다.
//	@ModelAttribute("manufactorCar")
//	public String[] refManufactorCar() {
//		return new String[] {"현대", "기아", "대우", "쌍용"};
//	}

	// 2.아래의 @ModelAttribute Annotation은 커멘드 객체를 초기화 하는 용도로 사용되었다.
	@ModelAttribute("userVO")
	public UserVO init(HttpServletRequest request) {
		System.out.println("@ModelAttribute()...............");
		if(request.getMethod().equalsIgnoreCase("GET")) {
			System.out.println("@ModelAttribute(): GET..........");

			UserVO userVO = new UserVO();
			System.out.println("객체 생성...");

			userVO.setUserName("이름을 입력하세요..");
			userVO.setAddress("주소를 입력하세요..");
			userVO.setCar("자동차 입력..");

			return userVO;
		}else {
			System.out.println("@ModelAttribute(): POST.........");
			return new UserVO();
		}
	}

	//[end]

	//[region] userForm

	@RequestMapping(value="/userForm", method=RequestMethod.GET)
	public String userForm() {
		System.out.println("------------------- userForm -------------------");

		return "user/userForm2";
	}//userForm()

//	@RequestMapping(value="/userForm", method=RequestMethod.GET)
//	public String userForm() {
//		System.out.println("------------------- userForm -------------------");
//
//		return "user/userForm1";
//	}//userForm()

	//[end]

	//[region] userSave

	@RequestMapping(value="/userSave", method=RequestMethod.POST)
	public ModelAndView userSave(@ModelAttribute("userVO") UserVO userVO, Model model) {
		System.out.println("------------------- userSave -------------------");
		System.out.println("user : " + userVO.toString());

		model.addAttribute("msg", "회원정보 출력 성공!");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user/userInfo2");
		modelAndView.addObject("userVO", userVO);

		return modelAndView;
	}//userSave()

//	@RequestMapping(value="/userSave", method=RequestMethod.POST)
//	public ModelAndView userSave(UserVO userVO, Model model) {
//		System.out.println("------------------- userSave -------------------");
//		System.out.println("user : " + userVO.toString());
//
//		model.addAttribute("msg", "회원정보 출력 성공!");
//
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("user/userInfo1");
//		modelAndView.addObject("userVO", userVO);
//
//		return modelAndView;
//	}//userSave()

	//[end]

	//[region] userView

//	@RequestMapping(value="/userView", method=RequestMethod.POST)
//	public Model userView() {
//		System.out.println("------------------- userView -------------------");
//
//		// model에 뷰이름을 정의하지 않았기에
//		// userView.jsp 파일은 views 폴더로 이동해주었다.
//		Model model = new ExtendedModelMap();
//		model.addAttribute("msg", "자동차 정보 출력");
//
//		return model;
//	}//userView()

	//[end]
}
