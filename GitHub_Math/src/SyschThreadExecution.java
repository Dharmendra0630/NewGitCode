
public class SyschThreadExecution {
	public static void main(String[] args) {
		SynchDharam d1=new SynchDharam();
		SynchDharam d2=new SynchDharam();
        d1.setName("hemant");
        d2.setName("naveen");
        d1.start();
        d2.start();
	}

}
