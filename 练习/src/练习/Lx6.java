package 练习;

public class Lx6 {

	private static int x = 100;
	public static void main(String args[]){
		Lx6 hs1 = new Lx6();
		hs1.x++;
		Lx6 hs2 = new Lx6(); 
		hs2.x++;
		hs1 = new Lx6();
		hs1.x++;
		Lx6.x--;
		System.out.println("x="+x);
	}
}
