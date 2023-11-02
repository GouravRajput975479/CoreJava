package in.com.rays;

import java.util.*;

public class Array2dsc {
	public static void main(String[] args) {
		System.out.println("2D array size;");

		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();

		int cols = sc.nextInt();

		int[][] num = new int[rows][cols];

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {
				
				num[i][j] = sc.nextInt();

				System.out.println(num[i][j]);
			}
			
		}
		System.out.println();

	}

}

