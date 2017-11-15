package Array_1;

import java.util.Scanner;

/*
 * 1.7. M X N 행렬을 순회하면서 0인 원소를 발견하면 해당 원소가 속한 행과 열의 모든 원소를 0으로 설정
 * - 지나가면서 바꾸면 모두 바뀌어버림
 * - 0인지 기록할 행렬 추가 */

public class SetZero_7 {
	public static void setZeros(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		//0인 원소가 있는 행과 열의 인덱스 저장
		for(int i=0; i<row.length; i++){
			for(int j=0; j<column.length; j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[j]=true;
				}
			}
		}
		
		//i행이나 j열이 0인 원소를 갖는경우 matrix[i][j]를 0으로 변경
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
