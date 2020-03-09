package bookTest;

public class java_15_01 {
	private int number;

	public java_15_01(){
		number = 10;
	}
	public void name(){
		System.out.println("this is a name");
	}

	@Override
	public String toString(){
		return number+"";
	}

	public static void main(String[] args){
		java_15_01 j = new java_15_01();
		System.out.println(j.getClass().toString());
	}
}
