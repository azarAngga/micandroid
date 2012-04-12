/*
 * MysqlDdlTable.java 2010-12-18
 * 
 * Copyright 2008-2011 the original author or authors.
 * Licensed under the Apache License, Version 2.0
 */
package org.jxstar.dm.ddl;

import org.jxstar.dm.DdlField;
import org.jxstar.dm.DdlIndex;
import org.jxstar.dm.DdlTable;

/**
 * Mysql表对象管理类。
 * 
 * @author TonyTan
 * @version 1.0, 2010-12-18
 */
public class MysqlDdlTable extends DdlTable {
	/**
	 * 构建表对象
	 * @param dbtype
	 */
	public MysqlDdlTable() {
		super("oracle");
	}
	
	/**
	 * 初始化全局对象
	 * @param dbtype
	 */
	public void init(String dbtype) {
		//创建MYSQL模板解析类
		_parser = new MysqlDmParser();
		//创建字段解析对象
		_fieldObj = new DdlField(_parser);
		//创建索引解析对象
		_indexObj = new DdlIndex(_parser);
	}
	
}
