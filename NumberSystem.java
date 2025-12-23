public class NumberSystem {
// Print numbers from 1 to N
//  Input: 5 → Output: 1 2 3 4 5

	public static void main(String...somu) {
		int n;
		for(n=1;n<=5;n++) {
			System.out.println(n);
		}
	}

}

// Print numbers reverse from N to 1
// Ex-Input: 5 → Output: 5 4 3 2 1

 class Number {
	public static void main(String...somu) {
		
		for(int n=15;n>=1;n--) {
			System.out.println(n);
		}
	}


}



// Updated on 21 Dec



// Print even numbers from 1 to N
//  Input: 10 → Output: 2 4 6 8 10



 class Number1 {
	public static void main(String...somu) {
		
		for(int n=1;n<=10;n++) {
			if(n%2==0) {
				System.out.println(n);
			}
		}
	}


}





// Print odd numbers from 1 to N
// Input: 10 → Output: 1 3 5 7 9


 class Number2 {
	public static void main(String...somu) {
		
		for(int n=1;n<=10;n++) {
			if(n%2!=0) {
				System.out.println(n);
			}
		}
	}


}






// Sum of first N natural numbers
// Input: 5 → Output: 15


 class Number3 {
	public static void main(String...somu) {
		int i=0;
		for(int n=1;n<=5;n++) {
			i+=n;
		}
		System.out.println(i);
	}


}


// Sum of even numbers between 1 to N
//  Input: 10 → Output: 30


class Number4 {
	public static void main(String...somu) {
		int i=0;
		for(int n=1;n<=10;n++) {
			if(n%2==0) {
				i+=n;
			}
		}
		System.out.println(i);
	}


}

// Updated on 22 Dec


// Count number of digits
// Input: 12345 → Output: 5


class Number5{
public static void main(String...somu) {
		int count=0;
		for(int n=12345;n>0;n=n/10) {
			count++;
		}
		System.out.println(count);
	}


}
