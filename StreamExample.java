import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	static void customPrint(int x) {
		System.out.println(x);
	}

	static boolean isEven(int x) {
		return x % 2 == 0;
	}
	// x -> x % 2 == 0
	
	public static int customSum(int a, int b) {
		return a + b;
	}
	// (x, y) -> x+y


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Stream

		List<Integer> numbeIntegers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

		// numbeIntegers.stream().forEach(System.out::println);
		numbeIntegers.stream().forEach(StreamExample::customPrint);

		// Show even numbers

		System.out.println("Show Even number:");

		// numbeIntegers.stream().filter(StreamExample::isEven).forEach(StreamExample::customPrint);

		numbeIntegers.stream().filter(x -> x % 2 == 0).forEach(StreamExample::customPrint);

		System.out.println("Show odd number:");
		// Odd numeber
		numbeIntegers.stream().filter(x -> x % 2 == 1).forEach(StreamExample::customPrint);

		//
		numbeIntegers.stream().map(x -> "Previous:" + x + " After: " + 2 * x).forEach(System.out::println);

		// Reduce

		System.out.println("Sum of all the numbers:");

		// Using Integer wrapper class
		System.out.println(numbeIntegers.stream().reduce(0, Integer::sum));

		// Using custom function
		System.out.println(numbeIntegers.stream().reduce(0, StreamExample::customSum));

		// using lambda
		System.out.println(numbeIntegers.stream().reduce(0, (x, y) -> x + y));

		// Count of the odd number

		System.out.println(numbeIntegers.stream().filter(x -> x % 2 == 1).count());

		System.out.println(numbeIntegers.stream().count());

		List<Integer> resultNumberIntegers = numbeIntegers.stream().map(x -> 2 * x).collect(Collectors.toList());

		System.out.println(resultNumberIntegers);

		// 0 1 2 3

		// 0 + 1 = 1
		// 1 + 2 = 3
		// 3 + 3 = 6

		// numbers.

		//
		// 1234

		// 1234 % 10 = 4 1234 / 10 = 123.4 ~ 123
		// 123 % 10 = 3 123 / 10 = 12.3 ~ 12
		// 12 % 10 = 2 12 / 10 = 1.2 ~ 1
		// 1 % 10 = 1 1 / 10 = 0.1 ~ 0

//		while(numbers != 0) {
//			int digit = numbers % 10;
//			numbers = numbers / 10;
//		}

//		  arr[0] = 4;
//	    arr[1] = 3;
//	    arr[2] = 2;
//	    arr[3] = 1;
//	    
//	    anotherArr[i] = arr[len - i];

	}

}
