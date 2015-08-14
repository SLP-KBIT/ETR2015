package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cui {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader ( new InputStreamReader(Stream.in));
		System.out.println("please write your name");
		String line = reader.readLine();
		System.out.println("hekko" + line + "!");
				
		
	}

}
