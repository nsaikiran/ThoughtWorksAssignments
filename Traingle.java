import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Traingle {
	public static void main(String args[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int range=Integer.parseInt(stdin.readLine());
		for (int lines=0;lines<=range;++lines){
			for (int stars=0;stars<lines;++stars)
				System.out.printf("*");
			System.out.println();
			}
		}
	}
