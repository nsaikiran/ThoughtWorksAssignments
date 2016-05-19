import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InvertedIsosceles {
	public static void print(int lines,int fromleft) throws IOException {
		int stars=lines+(lines-1);
		int spaces=fromleft;
		for (int line=0;line<lines;++line){
			for (int space=0;space<spaces;++space) System.out.printf(" ");
			for (int star=0;star<stars;++star) System.out.printf("*");
			System.out.println();
			stars-=2;
			spaces+=1;
			}
		}

	public static void main(String args[]) throws IOException {
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		InvertedIsosceles.print(Integer.parseInt(stdin.readLine()),0);
		}
	}
