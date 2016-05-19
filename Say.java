import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Say {
	public static void main(String args[]) throws IOException {
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		Say obj=new Say();
		obj.fizzBuzz(Integer.parseInt(stdin.readLine()));
		}
	public void fizzBuzz(int range) {
		for (int num=1;num<range;++num) {
			if (num%15 == 0) System.out.println("FizzBuzz");
			else if (num%3 == 0 ) System.out.println("Fizz");
			else if (num%5 == 0 ) System.out.println("Buzz");
			else System.out.println(num);
			}
		}
	}

