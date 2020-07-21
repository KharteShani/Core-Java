package Array;

import java.util.Scanner;

public class MatrixSubtractionArray {
	public static void main(String[] args) {
		Scanner sc=null;
		
		try {
			sc=new Scanner(System.in);
			System.out.println("Enter First Number of rows::");
			int numberofrows=sc.nextInt();
			System.out.println("Enter Second Number of columns::");
			int numberofcolumns=sc.nextInt();

			
			int matrixFirst[][]=new int[numberofrows][numberofcolumns];
			int matrixSecond[][]=new int[numberofrows][numberofcolumns];
			int resultMatrix[][]=new int[numberofrows][numberofcolumns];
			
			System.out.println("Enter Number for First Matrix:: ");
		
			for(int i = 0;i < numberofrows; i++) {
				for (int j = 0; j < numberofcolumns; j++) {
					matrixFirst[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Entered Numbers are::");
			
			for (int i = 0; i < numberofrows; i++) {
				for (int j = 0; j < numberofcolumns; j++) {
					System.out.println(" "+matrixFirst[i][j]+"\t");
				}
			}
			
			System.out.println("Enter Number for Second Matrix");
			for (int i = 0; i < numberofrows; i++) {
				for (int j = 0; j < numberofcolumns; j++) {
					matrixSecond[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Entered Numbers of Matrix are::");
			for (int i = 0; i < numberofrows; i++) {
				for (int j = 0; j < numberofcolumns; j++) {
					System.out.println(" "+matrixSecond[i][j]+"\t");
				}
			}
			
			System.out.println("Substraction logic:: ");
			
			for (int i = 0; i < numberofrows; i++) {
				for (int j = 0; j < numberofcolumns; j++) {
					resultMatrix[i][j]=matrixFirst[i][j]-matrixSecond[i][j];
				} 
			}
			
			System.out.println("Result is as::");
			for (int i = 0; i < numberofrows; i++) {
				for (int j = 0; j < numberofcolumns; j++) {
					System.out.println(" " + resultMatrix[i][j] + "\t");
				}
			}//for
		}//try
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(sc!=null) {
				sc.close();
			}
		}	
	}
}
