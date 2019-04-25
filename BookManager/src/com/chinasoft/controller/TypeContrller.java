package com.chinasoft.controller;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.entity.Type;
import com.chinasoft.service.TypeService;

@Controller
public class TypeContrller {
	
	@Resource
	private TypeService typeServiceImpl;
	
	
	@RequestMapping("/typelist")
	public ModelAndView findTypeList(){
		
		ModelAndView model = new ModelAndView();
		
		List<Type> list = typeServiceImpl.findTypeList();
		
		model.addObject("list",list);
		model.setViewName("/typeList.jsp");
		
		return model;
		
	}
	
	@RequestMapping("/addType")
	public String addType(Type type){
		
		typeServiceImpl.addType(type);
		
		return "redirect:/typelist.action";
		
	}
	
	
	@RequestMapping("/deleteTypeById")
	public String deleteTypeById(int id){
		
		typeServiceImpl.deleteTypeById(id);;
		
		return "redirect:/typelist.action";
		
	}
	
	/*
	 * 修改数据回显
	 */
	@RequestMapping("/typeEdit")
	public ModelAndView typeEdit(int id){
		
		ModelAndView model = new ModelAndView();
		Type type = typeServiceImpl.typeEdit(id);
		model.addObject("type",type);
		model.setViewName("/typeEdit.jsp");
		return model;
		}
	
	/*
	 * 确认修改
	 */
	@RequestMapping("/typeEditSubmit")
	public String typeEditSubmit(Type type){
		
		typeServiceImpl.typeEditSubmit(type);
		
		return "redirect:/typelist.action";
		
	}
}
