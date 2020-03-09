package bookTest;

public class java_14_1 {
	public static void main(String[] args){
		Color b = Color.Blue;
		Color r = Color.Red;
		Color g = Color.Green;
		System.out.println(b);
		System.out.println(r);
		System.out.println(b);
		for (Color c : Color.values()){
			System.out.println(c);
		}
	}
}
enum Color{
	Red,Blue,Green
}
