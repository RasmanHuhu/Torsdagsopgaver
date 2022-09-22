import java.util.Random;

class MathWork {


	public static void main(String[] args) {
		int n = 100;
		int divisible = 15;
		int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

		for(int i = 1; i <= n; i++) {
			if(i%divisible == 0){
				System.out.println(i + " ");
		}
	}

		System.out.println();
		System.out.println(getRandom(arr));
	}

		public static int getRandom(int[]arr){
		int rnd = new Random().nextInt(arr.length);
		return arr[rnd];
}

public static void printNum(int num) {
System.out.println(num);
num = num - 1;
System.out.println(num);
}
}

	

