package com.salesSite;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.salesSite.entities.MemberEntity;
import com.salesSite.entities.ProductEntity;
import com.salesSite.repositories.MemberRepository;
import com.salesSite.repositories.ProductRepository;

@Controller
public class MainController {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	MemberRepository memberRepository;

	@RequestMapping("/cart")
	public ModelAndView cart(ModelAndView mav){
		mav.setViewName("cart");
		return mav;
	}

	@RequestMapping("/checkNewMember")
	public ModelAndView checkNewMember(@ModelAttribute("memberModel") MemberEntity memberEntity, ModelAndView mav){
		mav.setViewName("checkNewMember");
		mav.addObject(memberEntity);
		return mav;
	}

	@RequestMapping("/completeNewMember")
	public ModelAndView completeNewMember(@ModelAttribute("memberModel") MemberEntity memberEntity,ModelAndView mav){
		mav.setViewName("completeNewMember");
		memberRepository.saveAndFlush(memberEntity);
		return mav;
	}

	@RequestMapping("/completePayOrder")
	public ModelAndView completePayOrder(ModelAndView mav){
		mav.setViewName("completePayOrder");
		return mav;
	}

	@RequestMapping(value = "/completeRegisterProduct",method = RequestMethod.POST)
	@Transactional(readOnly = false)
	public ModelAndView completeRegisterProduct(@ModelAttribute("productModel") ProductEntity productEntity, ModelAndView mav){
		mav.setViewName("completeRegisterProduct");
		productRepository.saveAndFlush(productEntity);
		return mav;
	}

	@RequestMapping("/login")
	public ModelAndView login(ModelAndView mav){
		mav.setViewName("login");
		return mav;
	}

	@RequestMapping("/managementLogin")
	public ModelAndView managementLogin(ModelAndView mav){
		mav.setViewName("managementLogin");
		return mav;
	}

	@RequestMapping("/managementTop")
	public ModelAndView managementTop(ModelAndView mav){
		mav.setViewName("managementTop");
		return mav;
	}

	@RequestMapping("/registerNewMember")
	public ModelAndView registerNewMember(ModelAndView mav){
		mav.setViewName("registerNewMember");
		return mav;
	}

	@RequestMapping("/order")
	public ModelAndView order(ModelAndView mav){
		mav.setViewName("order");
		return mav;
	}

	@RequestMapping("/payOrder")
	public ModelAndView payOrder(ModelAndView mav){
		mav.setViewName("payOrder");
		return mav;
	}

	@RequestMapping("/productDetail")
	public ModelAndView productDetail(ModelAndView mav){
		mav.setViewName("productDetail");
		return mav;
	}

	@RequestMapping("/registerProduct")
	public ModelAndView registerProduct(ModelAndView mav){
		mav.setViewName("registerProduct");
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
