import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Traingle2 {
	public static void main(String args[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int range=Integer.parseInt(stdin.readLine());
		for (int line=1;line<=range;++line){
			int spaces = range-line;
			for (int space=0;space<range-line;++space) System.out.printf(" ");
			for (int stars=0;stars<line;++stars) System.out.printf("*");
			System.out.println();
			}
		}
	}
