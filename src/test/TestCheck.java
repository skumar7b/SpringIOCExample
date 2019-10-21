package test;

import bean.TestInterface;

public class TestCheck {

		private TestInterface test;

		//constructor-based dependency injection
//		public MyXMLApplication(MessageService svc) {
//			this.service = svc;
//		}
		
		//setter-based dependency injection
		public void setBean(TestInterface t){
			this.test = t;
		}

		public void send(String msg) {
			// some magic like validation, logging etc
			  this.test.send(msg);
		}
	}