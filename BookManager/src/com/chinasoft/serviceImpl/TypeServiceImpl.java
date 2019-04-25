package com.chinasoft.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.chinasoft.entity.Type;
import com.chinasoft.mapper.Typemapper;
import com.chinasoft.service.TypeService;


public class TypeServiceImpl implements TypeService{
	
	@Resource
	private Typemapper mapper;

	@Override
	public List<Type> findTypeList(){
		
		List<Type> list = mapper.findTypeList();
		System.out.println(list);
		return list;
	}
	
	/*public static void main(String[] args){
		
		TypeServiceImpl a = new TypeServiceImpl();
		List<Type> list = a.findTypeList();
		
		System.out.println(list);
	}*/

	@Override
	public void addType(Type type) {
		
		mapper.addType(type);
		
	}

	@Override
	public void deleteTypeById(int id) {
		
		mapper.deleteTypeById(id);
		
	}

	@Override
	public Type typeEdit(int id) {
		
		return mapper.typeEdit(id);
	}

	@Override
	public void typeEditSubmit(Type type) {
		
		mapper.typeEditSubmit(type);
	}

	
	
	

}
