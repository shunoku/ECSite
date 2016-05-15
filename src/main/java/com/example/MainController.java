package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/cart")
	public ModelAndView cart(ModelAndView mav){
		mav.setViewName("cart");
		return mav;
	}

	@RequestMapping("/checkNewMember")
	public ModelAndView checkNewMember(ModelAndView mav){
		mav.setViewName("checkNewMember");
		return mav;
	}

	@RequestMapping("/completeNewMember")
	public ModelAndView completeNewMember(ModelAndView mav){
		mav.setViewName("completeNewMember");
		return mav;
	}

	@RequestMapping("/completePayment")
	public ModelAndView completePayment(ModelAndView mav){
		mav.setViewName("completePayment");
		return mav;
	}

	@RequestMapping("/login")
	public ModelAndView login(ModelAndView mav){
		mav.setViewName("login");
		return mav;
	}

	@RequestMapping("/newMember")
	public ModelAndView newMember(ModelAndView mav){
		mav.setViewName("newMember");
		return mav;
	}

	@RequestMapping("/order")
	public ModelAndView order(ModelAndView mav){
		mav.setViewName("order");
		return mav;
	}

	@RequestMapping("/payment")
	public ModelAndView payment(ModelAndView mav){
		mav.setViewName("payment");
		return mav;
	}

	@RequestMapping("/productDetail")
	public ModelAndView productDetail(ModelAndView mav){
		mav.setViewName("productDetail");
		return mav;
	}

	@RequestMapping("/searchProducts")
	public ModelAndView searchProducts(ModelAndView mav){
		mav.setViewName("searchProducts");
		return mav;
	}

	@RequestMapping("/")
	public ModelAndView top(ModelAndView mav){
		mav.setViewName("top");
		return mav;
	}
}
