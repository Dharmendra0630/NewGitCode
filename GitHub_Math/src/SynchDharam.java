
public class SynchDharam  extends Thread{
   synchronized public void run(){
	   for(int i=10;i<=15;i++){
		   System.out.println(this.getName()+":"+i);
	   }
   }
}
