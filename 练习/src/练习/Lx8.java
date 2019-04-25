package 练习;


public class Lx8 {

	public static void main(String[] args) {
		int[] arr= {5,4,8,6,9,10,7,11};
		Lx8 lx=new Lx8();
		lx.test(arr);
	}

	public void test(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}

}	
