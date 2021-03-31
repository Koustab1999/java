package com.valuemomentum.training.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderMark {

	public static void main(String[] args) {
		System.out.print("Enter Characters: ");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// catch the possible IOException by the read() method
		try { 

			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			reader.mark(2);
			System.out.println("Printing characters after mark");
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			reader.reset();
			System.out.println("Printing characters after reset");
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			// close the BufferedReader object
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
