package Thread;

class Table{  
		void fun() throws InterruptedException {
			Thread.sleep(1000); 
		}
		
		 // void printTable(int n){//synchronized method  
		 synchronized void printTable(int n){//synchronized method  
			for(int i=1;i<=5;i++){ 
				try{ 
				System.out.println(n*i);  
				fun();
				}catch(Exception e){System.out.println(e);}  
			}  

		}  
	}

	class MyThread3 extends Thread{  
		Table t;   
		MyThread3(Table t){  
			this.t=t;  
		}  
		public void run(){  
			t.printTable(5);  
		}  

	}  
	class MyThread4 extends Thread{  
		Table t;   
		MyThread4(Table t){  
			this.t=t;  
		}  
		public void run(){  
			t.printTable(100);  
		}  
	}  

	public class TestSynchronization3{  
		public static void main(String args[]){  
			Table obj = new Table();//only one object  
			MyThread3 t1=new MyThread3(obj);  
			MyThread4 t2=new MyThread4(obj);  
			t1.start();  
			t2.start();
		}  
	}

