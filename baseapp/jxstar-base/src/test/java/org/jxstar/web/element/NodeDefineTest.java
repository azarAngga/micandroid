/*
 * NodeDefineTest.java 2010-11-27
 * 
 * Copyright 2008-2011 the original author or authors.
 * Licensed under the Apache License, Version 2.0
 */
package org.jxstar.web.element;

import java.util.Map;

import org.jxstar.test.AbstractTest;
import org.jxstar.util.factory.FactoryUtil;

/**
 * 
 *
 * @author TonyTan
 * @version 1.0, 2010-11-27
 */
public class NodeDefineTest extends AbstractTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//FunDefineBO define = new FunDefineBO();
		
		//String oldFunId = "sys_user_data";
		//String copyFunId = "sys_user_datax";
		Map<String,String> mpUser = FactoryUtil.newMap(); 
		mpUser.put("user_id", "jxstar2");
		//define.copyFun(oldFunId, copyFunId, mpUser);
	}

}
