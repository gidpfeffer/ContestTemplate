package problems.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String path = Main.class.getResource("input.txt").getPath();
		System.setIn(new FileInputStream(path));
		Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
        	System.out.println(sc.nextInt());
        }
        sc.close();
	}

}
