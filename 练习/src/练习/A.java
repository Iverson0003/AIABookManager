package 练习;

import java.math.BigDecimal;

/*
 * Iverson 第一次修改
 */
public class A {

	public static void main(String args[]){
		BB b = new BB();
		b.setVar(BigDecimal.ZERO);
		method2(b);
		System.out.println(b.getvar());
		}
	
	public static void method2(BB b){
		b = new BB();
		b.setVar(BigDecimal.ONE);
	}
}
