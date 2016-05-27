import java.util.ArrayList;
import java.util.Scanner;

public class Number {
	public static Integer[] primesUpto(int upto){
		ArrayList<Integer> primeList = new ArrayList<Integer>();

		if (upto<=1) return primeList.toArray(new Integer[primeList.size()]);
		primeList.add(new Integer(2));
		primeList.add(new Integer(3));

		boolean isPrime=true;
		
		for (int number=4;number<=upto;++number ){
			isPrime=true; 
			for (int index=0; index<primeList.size() && primeList.get(index) <= Math.sqrt(number); ++index){
				if ( number % Integer.valueOf(primeList.get(index)) == 0  ){
					isPrime=false;
					break;
					}
				}
			if (isPrime)
				primeList.add(new Integer(number));
			}

		return primeList.toArray(new Integer[primeList.size()]);
		
		}
	
	public static int[] primeFactors(int number){
		Integer[] primeArray = Number.primesUpto((int)Math.sqrt(number));

		ArrayList<Integer> primeFactorsList = new ArrayList<Integer>();

		for (int index=0; index<primeArray.length;++index){
			if (number % Integer.valueOf(primeArray[index]) == 0 ) primeFactorsList.add(primeArray[index]);
			}

		Integer[] primeFactorsArray = primeFactorsList.toArray(new Integer[primeFactorsList.size()]);
		
		int[] primeFactors = new int[primeFactorsArray.length];

		for (int index=0; index<primeFactorsArray.length;++index){
			primeFactors[index]=Integer.valueOf(primeFactorsArray[index]);
			}
		return primeFactors;
		}
	}

class Tester {
	public static void main(String args[]) {
		int number;
		System.out.println("Enter a integer: ");
		Scanner stdin = new Scanner(System.in);
		number=stdin.nextInt();
		int[] primeFactors = Number.primeFactors(number);


		for (int var=0;var<primeFactors.length;++var)
			System.out.println(primeFactors[var]);
		}
	}
