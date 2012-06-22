	config.eventcfg = {
		deleteWf: function(){
			var self = this;
			var records = self.grid.getSelectionModel().getSelections();
			if (!JxUtil.selectone(records)) return;
			
			var record = records[0];
			var state = record.get('wf_process__process_state');
			if (state != '1') {
				JxHint.alert(jx.wf.nodel);	//'��ǰ���̲��ǡ����塱״̬������ɾ����'
				return true;
			}

			var hdcall = function() {
				//��������Ĳ���
				var params = 'funid=wf_process&keyid=' + record.get(self.define.pkcol);
				params += '&pagetype=editgrid&eventcode=delete';
				
				//���¼�������
				var endcall = function() {
					self.grid.getStore().reload();
				}
				//��������
				Request.postRequest(params, endcall);
			};
			//'ȷ��ɾ����ǰ���̶��弰������������Ϣ��'
			Ext.Msg.confirm(jx.base.hint, jx.wf.delyes, function(btn) {
				if (btn == 'yes') hdcall();
			});
		},
	
		checkwf: function(){
			var self = this;
			var records = self.grid.getSelectionModel().getSelections();
			if (!JxUtil.selectone(records)) return;
			
			//��������Ĳ���
			var params = 'funid=wf_process&keyid=' + records[0].get(self.define.pkcol);
			params += '&pagetype=editgrid&eventcode=checkwf';

			//��������
			Request.postRequest(params, null);
		},
		
		enablewf: function(){
			var self = this;
			var records = self.grid.getSelectionModel().getSelections();
			if (!JxUtil.selectone(records)) return;
			
			var record = records[0];
			var state = record.get('wf_process__process_state');
			if (state == '2') {
				JxHint.alert(jx.wf.dontuse);	//'��ǰ�����Ѿ����ã����������ã�'
				return true;
			}

			var oldProcessId = record.get('wf_process__old_processid');
			var hdcall = function() {
				//��������Ĳ���
				var params = 'funid=wf_process&keyid=' + record.get(self.define.pkcol);
				params += '&pagetype=editgrid&eventcode=enable&old_processid=' + oldProcessId;
				
				var endcall = function() {
					self.grid.getStore().reload();
				}
				//��������
				Request.postRequest(params, endcall);
			};
			//'ȷ�����õ�ǰ���̶�����'
			Ext.Msg.confirm(jx.base.hint, jx.wf.useyes, function(btn) {
				if (btn == 'yes') hdcall();
			});
		},
		
		disablewf: function(){
			var self = this;
			var records = self.grid.getSelectionModel().getSelections();
			if (!JxUtil.selectone(records)) return;
			
			var record = records[0];
			var state = record.get('wf_process__process_state');
			if (state != '2') {
				JxHint.alert(jx.wf.nodis);	//'��ǰ����û�����ã����ܽ��ã�'
				return true;
			}

			var hdcall = function() {
				//��������Ĳ���
				var params = 'funid=wf_process&keyid=' + record.get(self.define.pkcol);
				params += '&pagetype=editgrid&eventcode=disablewf';
				
				var endcall = function() {
					record.set('wf_process__process_state', '3');
					record.commit();
				}
				//��������
				Request.postRequest(params, endcall);
			};
			//'���ú���̲�����ʹ�ã�ȷ��������'
			Ext.Msg.confirm(jx.base.hint, jx.wf.disyes, function(btn) {
				if (btn == 'yes') hdcall();
			});
		},
		
		newversion: function(){
			var self = this;
			var records = self.grid.getSelectionModel().getSelections();
			if (!JxUtil.selectone(records)) return;
			
			var record = records[0];
			var state = record.get('wf_process__process_state');
			if (state != '2') {
				JxHint.alert(jx.wf.dontnew);	//'��ǰ����û�����ã����ܴ����°汾��'
				return true;
			}

			var hdcall = function() {
				//��������Ĳ���
				var params = 'funid=wf_process&keyid=' + record.get(self.define.pkcol);
				params += '&pagetype=editgrid&eventcode=newversion';
				//���¼�������
				var endcall = function() {
					self.grid.getStore().reload();
				}
				//��������
				Request.postRequest(params, endcall);
			};
			//'ȷ�������°����̶�����'
			Ext.Msg.confirm(jx.base.hint, jx.wf.newyes, function(btn) {
				if (btn == 'yes') hdcall();
			});
		},
		
		copywf: function(){
			var self = this;
			var records = self.grid.getSelectionModel().getSelections();
			if (!JxUtil.selectone(records)) return;

			var hdcall = function() {
				//��������Ĳ���
				var params = 'funid=wf_process&keyid=' + records[0].get(self.define.pkcol);
				params += '&pagetype=editgrid&eventcode=copywf';
				//���¼�������
				var endcall = function() {
					self.grid.getStore().reload();
				}
				//��������
				Request.postRequest(params, endcall);
			};
			//'ȷ���������̶�����'
			Ext.Msg.confirm(jx.base.hint, jx.wf.copyes, function(btn) {
				if (btn == 'yes') hdcall();
			});
		}
	};
	
	config.initpage = function(gridNode){
		var grid = gridNode.page;
		//����༭ǰ�¼� 
		grid.on('beforeedit', function(event) {
			var r = event.record;
			var state = r.get('wf_process__process_state');
			//�Ƕ���״̬��¼�����޸�
			if (state != '1') {
				return false;
			}
			
			return true;
		});
	};