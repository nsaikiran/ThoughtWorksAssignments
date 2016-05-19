import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Diamond {
	public static void main(String args[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		int lines=Integer.parseInt(stdin.readLine());
		Isosceles.print(lines,0);
		InvertedIsosceles.print(lines-1,1);
		}
	}
