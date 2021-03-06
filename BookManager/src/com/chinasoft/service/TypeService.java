package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.Type;

public interface TypeService {
	
	public List<Type> findTypeList();
	public void addType(Type type);
	public void deleteTypeById(int id);
	public Type typeEdit(int id);
	public void typeEditSubmit(Type type); 

}
