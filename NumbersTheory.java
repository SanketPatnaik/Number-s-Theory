package com.in28minutes.JspidersQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class NumbersTheory {
	int number;

	public NumbersTheory(int number) {
		this.number = number;
	}

	public int findBiggerNumberBetween2(int number1, int number2) {
		int bigger = number1 > number2 ? number1 : number2;
		return bigger;
	}

	public int findSmallerNumberBetween2(int number1, int number2) {
		int bigger = number1 < number2 ? number1 : number2;
		return bigger;
	}

	public int findSmallestNumberBetween3(int number1, int number2, int number3) {
		int smallest = number3 < findSmallerNumberBetween2(number1, number2) ? number3
				: findSmallerNumberBetween2(number1, number2);
		return smallest;
	}

	public int findBiggestNumberBetween3(int number1, int number2, int number3) {
		int biggest = number3 > findSmallerNumberBetween2(number1, number2) ? number3
				: findSmallerNumberBetween2(number1, number2);
		return biggest;
	}

	public int findMiddleNumberBetween3(int number1, int number2, int number3) {
		int middle = number3 > findBiggerNumberBetween2(number1, number2) ? findBiggerNumberBetween2(number1, number2)
				: number3 > findSmallerNumberBetween2(number1, number2) ? number3
						: findSmallerNumberBetween2(number1, number2);
		return middle;
	}

	public void printAscendingOrderBetween3(int number1, int number2, int number3) {
		System.out.println("The ascending order is " + findSmallestNumberBetween3(number1, number2, number3) + " << "
				+ findMiddleNumberBetween3(number1, number2, number3) + " << "
				+ findBiggestNumberBetween3(number1, number2, number3));
	}

	public boolean findIfTheSumOfTwoNumbersIsAThirdNumber(int number1, int number2, int number3) {
		if (number1 + number2 == number3) {
			return true;
		}
		return false;
	}

	public boolean findIfTheSumOfSquaresOfTwoNumbersIsAThirdNumber(int number1, int number2, int number3) {
		if ((number1 * number1) + (number2 * number2) == number3) {
			return true;
		}
		return false;
	}

	public void findEvenOrOdd() {
		if (number % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}

	public void findNext5Multiples() {
		for (int i = 1; i <= 5; i++) {
			int multiple = number * i;
			System.out.print(multiple + " ");
		}
		System.out.println();
	}

	public void findAllOddNumbersBetween2(int number1, int number2) {
		for (int i = (number1 < number2 ? number1 : number2); i <= (number1 > number2 ? number1 : number2); i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public int findSumOfAllEvenNumbersBetween2(int number1, int number2) {
		int sum = 0;
		for (int i = (number1 < number2 ? number1 : number2); i <= (number1 > number2 ? number1 : number2); i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public void printStuffForNumbers(int limit) {
		for (int i = 1; i <= limit; i++) {
			if (i % 4 == 0 && i % 5 == 0) {
				System.out.print("Lara ");
			} else if (i % 4 == 0) {
				System.out.print("Java ");
			} else if (i % 5 == 0) {
				System.out.print("J2ee ");
			}
		}
		System.out.println();
	}

	public boolean findIfTheDigitsAreInRaisingOrder(int number) {
		int check = number;
		int digit1 = 0;
		int digit2 = check % 10;
		while (check >= 1) {
			digit1 = check % 10;
			check = check / 10;
			if (digit1 > digit2) {
				return false;
			}
			digit2 = digit1;
		}
		return true;
	}

	public void swapTwoVariables(int number1 , int number2) {
		System.out.println("Before swapping the variables are " + number1 + " and " + number2);
		number1 = number1*number2;
		number2 = number1/number2;
		number1 = number1/number2;
		System.out.println("After Swapping the variables become " + number1 + " and " + number2);
	}

	public int findTotalNumberOfDigits(int number) {
		int check = number;
		int count = 0;
		while (check > 0) {
			check = check/10;
			count++;
		}
		return count;
	}

	public ArrayList<Integer> findAllDigits(int number) {
		int check = number;
		ArrayList<Integer> digits = new ArrayList<Integer>();
		while (check > 0) {
			digits.add(check % 10);
			check = check / 10;
		}
		return digits;
	}

	public int findSumOfAllDigits(int number) {
		int check = number;
		int digit = 0;
		int sum = 0;
		while (check >= 1) {
			digit = check % 10;
			check = check / 10;
			sum = sum + digit;
		}
		return sum;
	}

	public int reverseANumber() {
		int check = number;
		int digit = 0;
		int reverse = 0;
		while (check >= 1) {
			digit = check % 10;
			check = check / 10;
			reverse = reverse * 10 + digit;
		}
		return reverse;
	}

	public boolean findPalindromeOrNot() {
		if (reverseANumber() == number) {
			return true;
		}
		return false;
	}

	public int reverseFirstHalfOfNumberIfDigitsIsEven() {
		int check = number;
		int digit = 0;
		int reverse = 0;
		if (findTotalNumberOfDigits(number) % 2 == 0) {
			for (int i = 1; i <= findTotalNumberOfDigits(number); i++) {
				if (i > findTotalNumberOfDigits(number) / 2) {
				digit = check % 10;
			}
			check = check / 10;
			reverse = reverse * 10 + digit;
		}
	}
		return reverse;
	}

	public boolean findSumOfFirst2DigitsEqualsThird() {
		int check = number;
		if (findTotalNumberOfDigits(number) == 3) {
			if (findSumOfAllDigits(number) - check % 10 == check % 10) {
				return true;
			}
		}
		return false;
	}

	public long findFactorialOfAGivenNumber(int number) {
		long factorial = 1l;
		for (long i = 1l; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public boolean isPrimeOrNot(int number) {
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void printFirst20PrimeNumbers() {
		int i = 2;
		int count = 0;
		while (count <= 20) {
			if (isPrimeOrNot(i)) {
				System.out.print(i + " ");
				count++;
			}
			i++;
			}
		System.out.println();
	}

	public void printPrimeNumbersBetween50And100() {
		for (int i = 50; i <= 100; i++) {
			if (isPrimeOrNot(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public void printPrimeNumbersBetween2Numbers(int number1, int number2) {
		for (int i = number1; i <= number2; i++) {
			if (isPrimeOrNot(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public void printFirst20PrimeNumbersFrom100() {
		int i = 100;
		int count = 0;
		while (count <= 20) {
			if (isPrimeOrNot(i)) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		System.out.println();
	}

	public int printSumOfFirst30PrimeNumbers() {
		int i = 2;
		int sum = 0;
		int count = 0;
		while (count <= 30) {
			if (isPrimeOrNot(i)) {
				sum = sum + i;
				count++;
			}
			i++;
		}
		return sum;
	}

	public int printSumOfPrimeNumbersBetween2Numbers(int number1, int number2) {
		int sum = 0;
		for (int i = number1; i <= number2; i++) {
			if (isPrimeOrNot(i)) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public void printPrimeNumbersInReverseOrder(int number1, int number2) {
		for (int i = findBiggerNumberBetween2(number1, number2); i >= findSmallerNumberBetween2(number1,
				number2); i--) {
			if (isPrimeOrNot(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public void printPrimeNumbersJustAfterMultiplesOf10() {
		for (int i = 10; i <= 200; i = i + 10) {
			for (int count = i; count <= i + 10; count++) {
				if (isPrimeOrNot(count)) {
					System.out.print(count + " ");
					break;
				}
			}
		}
		System.out.println();
	}

	public void printPrimeNumbersJustBeforeMultiplesOf10() {
		for (int i = 10; i <= 200; i = i + 10) {
			for (int count = i; count >= i - 10; count--) {
				if (isPrimeOrNot(count)) {
					System.out.print(count + " ");
					break;
				}
			}
		}
		System.out.println();
	}

	public void printNumberAfter3PrimeNumbers() {
		int count = 0;
		for (int i = 10; i <= 100; i++) {
			if (!(isPrimeOrNot(i))) {
				count++;
			}
			if (count > 3) {
				System.out.print(i + " ");
				count = 0;
			}
		}
		System.out.println();
	}

	public ArrayList<Integer> printFibonacciSeries(int lowerLimit, int upperLimit) {
		int number2 = 1;
		int number1 = 0;
		ArrayList<Integer> fibo = new ArrayList<Integer>();
		if (lowerLimit <= 1) {
			fibo.add(number1);
			fibo.add(number2);
		}
		for (int sum = 1; sum <= upperLimit; sum++) {
				if (sum == number2 + number1) {
					if (sum >= lowerLimit) {
						fibo.add(sum);
					}
					number1 = number2;
					number2 = sum;
				}
		}
		System.out.println(fibo);
		return fibo;
	}

	public void printFirst10FibonacciSeries() {
		int number2 = 1;
		int number1 = 0;
		int count = 0;
		int sum = 1;
		System.out.print("0 1 ");
		while (count <= 7) {
			if (sum == number2 + number1) {
				System.out.print(sum + " ");
				count++;
				number1 = number2;
				number2 = sum;
			}
			sum++;
		}
		System.out.println();
	}

	public void printFibonacciSeriesBetween100and10000() {
		printFibonacciSeries(100, 10000);
	}

	public void printFibonacciSeriesInReverseOrder() {
		ArrayList<Integer> fibo = printFibonacciSeries(500, 5000);
		for (int i = fibo.size() - 1; i >= 0; i--) {
			System.out.print(fibo.get(i) + " ");
		}
		System.out.println();
	}

	public void printFibonacciSeriesImmediateNextNumber() {
		ArrayList<Integer> fibo = printFibonacciSeries(1, 5000);
		for (int i = 0; i < fibo.size(); i++) {
			System.out.print(fibo.get(i) + 1 + " ");
		}
		System.out.println();
	}

	public void printPrimeNumbersFromFibonacciSeries() {
		ArrayList<Integer> fibo = printFibonacciSeries(2, 5000);
		for (int i = 0; i < fibo.size(); i++) {
			if (isPrimeOrNot(fibo.get(i))) {
				System.out.print(fibo.get(i) + " ");
			}
		}
		System.out.println();
	}

	public boolean findArmstrongNumberOrNot(int number) {
		int count = findTotalNumberOfDigits(number);
		int sum = 0;
		ArrayList<Integer> digits = findAllDigits(number);
		for (int i = 0; i < digits.size(); i++) {
			sum = sum + (int) Math.pow(digits.get(i), count);
		}
		if (sum == number) {
			return true;
		}
		return false;
	}

	public void findInitial3ArmstrongNumbers() {
		int count = 0;
		int i = 10;
		while (count < 3) {
			if (findArmstrongNumberOrNot(i)) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		System.out.println();
	}

	public ArrayList<Integer> findAllArmstrongNumbersBetween2Numbers(int limit1, int limit2) {
		int bigger = findBiggerNumberBetween2(limit1, limit2);
		int smaller = findSmallerNumberBetween2(limit1, limit2);
		ArrayList<Integer> arm = new ArrayList<Integer>();
		for (int i = smaller; i <= bigger; i++) {
			if (findArmstrongNumberOrNot(i)) {
				arm.add(i);
			}
		}
		return arm;
	}

	public boolean findPerfectNumberOrNot(int number) {
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			return true;
		}
		return false;
	}

	public void findInitial5PerfectNumbers() {
		int count = 0;
		int i = 10;
		while (count < 3) {
			if (findPerfectNumberOrNot(i)) {
				System.out.print(i + " ");
				count++;
			}
			i++;
		}
		System.out.println();
	}

	public ArrayList<Integer> findAllPerfectNumbersBetween2Numbers(int limit1, int limit2) {
		int bigger = findBiggerNumberBetween2(limit1, limit2);
		int smaller = findSmallerNumberBetween2(limit1, limit2);
		ArrayList<Integer> perfect = new ArrayList<Integer>();
		for (int i = smaller; i <= bigger; i++) {
			if (findPerfectNumberOrNot(i)) {
				perfect.add(i);
			}
		}
		return perfect;
	}

	public boolean findAnagramOrNot(int number1, int number2) {
		if (findTotalNumberOfDigits(number1) == findTotalNumberOfDigits(number2)) {
			ArrayList<Integer> digits1 = findAllDigits(number1);
			ArrayList<Integer> digits2 = findAllDigits(number2);
			Collections.sort(digits1);
			Collections.sort(digits2);
			if (digits1.equals(digits2)) {
				return true;
			}
		}
		return false;
	}

	public void reverseSecondHalfOfNumberIfDigitsIsEven() {
		ArrayList<Integer> digits = findAllDigits(number);
		for (int i = 0; i < digits.size() / 2; i++) {
			System.out.print(digits.get(i));
		}
		System.out.println();
	}

	public int findSumOfAllDigitsInANumber() {
		int sum = findSumOfAllDigits(number);
		while (findTotalNumberOfDigits(sum) > 1) {
			sum = findSumOfAllDigits(sum);
		}
		return sum;
	}

	public void moveFirstHalfToSecondHalfAndViceVersa() {
		if (findTotalNumberOfDigits(number) % 2 == 0) {
			ArrayList<Integer> digits = findAllDigits(number);
			for (int i = digits.size() / 2 - 1; i >= 0; i--) {
				System.out.print(digits.get(i));
			}
			for (int i = digits.size() - 1; i > digits.size() / 2 - 1; i--) {
				System.out.print(digits.get(i));
			}
		}
		System.out.println();
	}

	public void swapEveryDigitWithImmediateNextDigit() {
		if (findTotalNumberOfDigits(number) % 2 == 0) {
		ArrayList<Integer> digits = findAllDigits(number);
		Collections.sort(digits, Collections.reverseOrder());
		for (int i = 1, index = 0; i <= digits.size() / 2; i++, index = index + 2) {
			int temp = digits.get(index);
			digits.set(index, digits.get(index + 1));
			digits.set(index + 1, temp);
			}
			for (int i = 0; i < digits.size(); i++) {
				System.out.print(digits.get(i));
			}
		}
	}
}

