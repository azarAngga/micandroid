﻿Jxstar.currentPage = function() {
	var config = {param:{},initpage:function(page, define){},eventcfg:{}};
	
	var tasktypeData = Jxstar.findComboData('tasktype');
	var yesnoData = Jxstar.findComboData('yesno');
	var taskstateData = Jxstar.findComboData('taskstate');
	var items = [{
		height: '97%',
		width: '97%',
		border: false,
		layout: 'form',
		style: 'padding:10px;',
		items: [{
			anchor:'100%',
			layout:'column',
			autoHeight:true,
			items:[{
				border:false,
				columnWidth:0.33,
				layout:'form',
				items:[
					{xtype:'textfield', fieldLabel:'任务名称', name:'task_base__task_name', allowBlank:false, labelStyle:'color:#0000FF;', labelSeparator:'*', anchor:'100%', maxLength:50},
					{xtype:'textfield', fieldLabel:'后台类', name:'task_base__task_class', allowBlank:false, labelStyle:'color:#0000FF;', labelSeparator:'*', anchor:'100%', maxLength:100},
					{xtype:'combo', fieldLabel:'任务类型', name:'task_base__task_type', defaultval:'1',
						anchor:'100%', editable:false,
						store: new Ext.data.SimpleStore({
							fields:['value','text'],
							data: tasktypeData
						}),
						emptyText: jx.star.select,
						mode: 'local',
						triggerAction: 'all',
						valueField: 'value',
						displayField: 'text',
						value: tasktypeData[0][0]}
				]
			},{
				border:false,
				columnWidth:0.33,
				layout:'form',
				items:[
					{xtype:'textfield', fieldLabel:'执行计划', name:'task_base__task_plan', allowBlank:false, labelStyle:'color:#0000FF;', labelSeparator:'*', readOnly:true, anchor:'100%', maxLength:50},
					{xtype:'combo', fieldLabel:'保留日志？', name:'task_base__has_log', defaultval:'1',
						anchor:'100%', editable:false,
						store: new Ext.data.SimpleStore({
							fields:['value','text'],
							data: yesnoData
						}),
						emptyText: jx.star.select,
						mode: 'local',
						triggerAction: 'all',
						valueField: 'value',
						displayField: 'text',
						value: yesnoData[0][0]},
					{xtype:'datefield', fieldLabel:'上次运行时间', name:'task_base__run_date', format:'Y-m-d H:i:s', anchor:'100%', readOnly:true}
				]
			},{
				border:false,
				columnWidth:0.33,
				layout:'form',
				items:[
					{xtype:'combo', fieldLabel:'任务状态', name:'task_base__task_state', defaultval:'1',
						anchor:'100%', readOnly:true, editable:false,
						store: new Ext.data.SimpleStore({
							fields:['value','text'],
							data: taskstateData
						}),
						emptyText: jx.star.select,
						mode: 'local',
						triggerAction: 'all',
						valueField: 'value',
						displayField: 'text',
						value: taskstateData[0][0]},
					{xtype:'numberfield', allowDecimals:false, fieldLabel:'最大日志条数', name:'task_base__log_num', defaultval:'1000', anchor:'100%', maxLength:12},
					{xtype:'hidden', fieldLabel:'任务ID', name:'task_base__task_id', anchor:'100%'}
				]
			}
			]
		},{
			anchor:'100%',
			layout:'column',
			autoHeight:true,
			items:[{
				border:false,
				columnWidth:0.99,
				layout:'form',
				items:[
					{xtype:'textarea', fieldLabel:'任务描述', name:'task_base__task_memo', width:'100%', height:96, maxLength:200}
				]
			}
			]
		}]
	}];
	
	config.param = {
		items: items,
		funid: 'sys_task'
	};

	config.eventcfg = {	
	
	return new Jxstar.FormNode(config);
}