
public class ThreadExecution {
	public static void main(String[] args) {
		Dharam d1=new Dharam();
		Dharam d2=new Dharam();
        d1.setName("hemant");
        d2.setName("naveen");
        d1.start();
        d2.start();
	}

}
