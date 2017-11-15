package Array_1;

import java.util.Scanner;

/*
 * 1.7. M X N ����� ��ȸ�ϸ鼭 0�� ���Ҹ� �߰��ϸ� �ش� ���Ұ� ���� ��� ���� ��� ���Ҹ� 0���� ����
 * - �������鼭 �ٲٸ� ��� �ٲ�����
 * - 0���� ����� ��� �߰� */

public class SetZero_7 {
	public static void setZeros(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		//0�� ���Ұ� �ִ� ��� ���� �ε��� ����
		for(int i=0; i<row.length; i++){
			for(int j=0; j<column.length; j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[j]=true;
				}
			}
		}
		
		//i���̳� j���� 0�� ���Ҹ� ���°�� matrix[i][j]�� 0���� ����
		for(int i=0; i<row.length; i++){
			for(int j=0; j<column.length; j++){
				if(row[i]||column[j])
					matrix[i][j]=0;
			}
		}
	}

	public static void main(String[] args) {
		int m = 0, n = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the size of matrix(m) : ");
		m = scan.nextInt();
		System.out.println("Please enter the size of matrix(n) : ");
		n = scan.nextInt();
		
		System.out.println(" > Make a matrix : ");
		int[][] matrix = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++)
				matrix[i][j] = scan.nextInt();	
		}
		System.out.println("");
		
		System.out.println("1. Input : ");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		setZeros(matrix);
		
		System.out.println("2. Output : ");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}


	}

}
