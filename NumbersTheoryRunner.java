package com.in28minutes.JspidersQuestion;

public class NumbersTheoryRunner {

	public static void main(String[] args) {
		NumbersTheory numbers = new NumbersTheory(987654);

		System.out.println(numbers.findBiggerNumberBetween2(88, 152));

		System.out.println(numbers.findSmallerNumberBetween2(88, 152));

		System.out.println(numbers.findSmallestNumberBetween3(88, 64, 152));

		System.out.println(numbers.findBiggestNumberBetween3(88, 64, 152));

		System.out.println(numbers.findMiddleNumberBetween3(88, 64, 152));

		numbers.printAscendingOrderBetween3(88, 64, 152);

		System.out.println(numbers.findIfTheSumOfTwoNumbersIsAThirdNumber(88, 64, 152));

		System.out.println(numbers.findIfTheSumOfSquaresOfTwoNumbersIsAThirdNumber(88, 64, 11840));

		numbers.findEvenOrOdd();

		numbers.findNext5Multiples();

		numbers.findAllOddNumbersBetween2(64, 88);

		System.out.println(numbers.findSumOfAllEvenNumbersBetween2(64, 88));

		numbers.printStuffForNumbers(100);

		System.out.println(numbers.findIfTheDigitsAreInRaisingOrder(759));

		numbers.swapTwoVariables(12, 24);

		System.out.println(numbers.findTotalNumberOfDigits(1224));

		System.out.println(numbers.findSumOfAllDigits(1224));

		System.out.println("The reverse of the number is " + numbers.reverseANumber());

		System.out.println(numbers.findPalindromeOrNot());

		System.out.println(numbers.reverseFirstHalfOfNumberIfDigitsIsEven());

		System.out.println(numbers.findSumOfFirst2DigitsEqualsThird());

		System.out.println(numbers.findFactorialOfAGivenNumber(5));

		System.out.println(numbers.isPrimeOrNot(5));

		numbers.printFirst20PrimeNumbers();

		numbers.printPrimeNumbersBetween50And100();

		numbers.printPrimeNumbersBetween2Numbers(2, 100);

		numbers.printFirst20PrimeNumbersFrom100();

		System.out.println(numbers.printSumOfFirst30PrimeNumbers());

		System.out.println(numbers.printSumOfPrimeNumbersBetween2Numbers(2, 10));

		numbers.printPrimeNumbersInReverseOrder(70, 20);

		numbers.printPrimeNumbersJustAfterMultiplesOf10();

		numbers.printPrimeNumbersJustBeforeMultiplesOf10();

		numbers.printNumberAfter3PrimeNumbers();

		numbers.printFibonacciSeries(1, 100);

		numbers.printFirst10FibonacciSeries();

		numbers.printFibonacciSeriesBetween100and10000();

		numbers.printFibonacciSeriesInReverseOrder();

		numbers.printFibonacciSeriesImmediateNextNumber();

		numbers.printPrimeNumbersFromFibonacciSeries();

		System.out.println(numbers.findArmstrongNumberOrNot(153));

		numbers.findInitial3ArmstrongNumbers();

		System.out.println(numbers.findAllArmstrongNumbersBetween2Numbers(10, 10000));

		System.out.println(numbers.findPerfectNumberOrNot(496));

		numbers.findInitial5PerfectNumbers();

		System.out.println(numbers.findAllPerfectNumbersBetween2Numbers(1, 10000));

		System.out.println(numbers.findAnagramOrNot(14233425, 44332215));

		numbers.reverseSecondHalfOfNumberIfDigitsIsEven();

		System.out.println(numbers.findSumOfAllDigitsInANumber());

		numbers.moveFirstHalfToSecondHalfAndViceVersa();

		numbers.swapEveryDigitWithImmediateNextDigit();

	}


}
