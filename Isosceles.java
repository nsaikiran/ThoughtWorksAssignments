import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Isosceles {
	public static void print(int range,int fromleft) throws IOException {
		int StarsInBase=range+(range-1);
		int spaces=StarsInBase/2+fromleft,stars=1;
		for (int line=1;line<=range;++line){
			for (int space=0;space<spaces;++space) System.out.printf(" ");
			for (int star=0;star<line+(line-1);++star) System.out.printf("*");
			System.out.println();
			spaces--;
			}
		}
	public static void main(String args[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		print(Integer.parseInt(stdin.readLine()),0);
		}
	}
/*
line	stars	diff
1 	1 	0
2 	3	1
3	5	2
4	7	3
5	9	4
6	11	5
7	13	6
.	.	.
.	.	.
*/
