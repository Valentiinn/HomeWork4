package com.Karayvansky.HomeworkFourth;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String input1 = "";
		Boolean security = true;
		System.out.println("If you click:\n1 - Task 1\n2 - Task 2\n3 - Task 3\n4 - Task 4\n5 - Task "
				+ "5\n6 - Task 6\n7 - Task 7\n8 - Task 8\n9 - Task 9\n10 - Task 10");
		while (security) {
			Scanner sc = new Scanner(System.in);
			input1 = sc.next();
			switch (input1) {
			case "1":
				displaysOfFourDigitNumbers();
				break;
			case "2":
				outputSequence();
				break;
			case "3":
				displaysNonnegativee();
				break;
			case "4":
				displaysMultiply();
				break;
			case "5":
				summarizeArray();
				break;
			case "6":
				displaysMaximumMinimum();
				break;
			case "7":
				differenceArr(initializesArray());
				break;
			case "8":
				searchLuckyTickets();
				break;
			case "9":
				convertToBinary();
				break;
			case "10":
				displaysFiveElements();
				break;
			default:
				System.out.println("Error!");
			}
		}
	}

	public static void displaysOfFourDigitNumbers() {
		System.out.println("***Task 1***");
		for (int i = 1000; i <= 9999; i = i + 3)
			System.out.println(i + " ");
	}

	public static void outputSequence() {
		System.out.println("***Task 2***");
		for (int i = 1; i <= 55; i = i + 2)
			System.out.println(i + " ");
	}

	public static void displaysNonnegativee() {
		System.out.println("***Task 3***");
		for (int i = 90; i >= 0; i -= 5)
			System.out.println(i + " ");
	}

	public static void displaysMultiply() {
		System.out.println("***Task 4***");
		for (int i = 2; i <= 1048576; i *= 2)
			System.out.println(i + " ");
	}

	public static void summarizeArray() {
		System.out.println("***Task 5***");
		int n = 5;
		int sum = 0;
		for (int element : initializesArray())
			System.out.print(element + ";");
		for (int i = 0; i < n; i++) {
			sum += initializesArray()[i];
		}
		System.out.println("\nSum of " + n + " elemets: " + sum);

	}

	public static int[] initializesArray() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 2;
		}
		return arr;
	}

	public static int searchMin(int arr[]) {
		int max = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (max > arr[i])
				max = arr[i];
		}
		return max;
	}

	public static int searchMax(int arr[]) {
		int min = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (min < arr[i])
				min = arr[i];
		}
		return min;
	}

	public static void displaysMaximumMinimum() {
		System.out.println("***Task 6***");
		for (int element : initializesArray()) {
			System.out.print(element + ";");
		}
		System.out.println();
		System.out.println("Max number of array: " + searchMax(initializesArray()));
		System.out.println("Min number of array: " + searchMin(initializesArray()));

	}

	public static int differenceArr(int[] arr) {
		System.out.println("***Task 7***");
		int chet, nochet, sumchet = 0, sumnochet = 0, diff;
		for (int element : initializesArray()) {
			System.out.print(element + ";");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			chet = arr[i] % 2;
			if (chet == 0) {
				sumchet += arr[i];
			}
			nochet = arr[i] % 2;
			if (nochet != 0) {
				sumnochet += arr[i];
			}
		}
		System.out.println("Sum even: " + sumchet);
		System.out.println("Sum uneven: " + sumnochet);
		diff = sumchet - sumnochet;
		return Math.abs(diff);
	}

	public static void searchLuckyTickets() {
		System.out.println("***Task 8***");
		System.out.println("LuckyTickets!!!");
		for (int i = 100000; i <= 999999; i++) {
			int number1 = i % 10;
			int number2 = (i / 10) % 10;
			int number3 = (i / 100) % 10;
			int number4 = (i / 1000) % 10;
			int number5 = (i / 10000) % 10;
			int number6 = (i / 100000) % 10;
			int result1 = number1 + number2 + number3;
			int result2 = number4 + number5 + number6;
			if (result1 == result2) {
				System.out.println(i);
			}

		}
	}

	public static void convertToBinary() {
		System.out.println("***Task 9***");
		int number = 124;
		int result;
		System.out.println("Decimal number: " + number);
		System.out.print("Binary number: ");
		while (number != 0) {
			result = number % 2;
			System.out.print(result);
			number = number / 2;

		}
	}

	public static void printArray(int[] arr) {
		System.out.println("Five min:");
		for (int i = 0; i < 5; i++)
			System.out.print(arr[i] + ", ");

		System.out.println();
	}

	public static void displaysFiveElements() {
		System.out.println("***Task 10***");
		int array[] = { 4, 7, 4, 3, 2, 7, 8, 4, 1 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		printArray(array);
	}
}
