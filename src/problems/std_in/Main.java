package problems.std_in;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String path = Main.class.getResource("input.txt").getPath();
		System.setIn(new FileInputStream(path));
		Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) System.out.println(sc.nextLine());
        sc.close();
	}

}
