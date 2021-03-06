package Array_1;

import java.util.Scanner;

/*1.6. 이미지를 표현하는 M X N 행렬, 이미지를 90도 회전시키는 메서드 작성
 * - 이미지의 각 픽셀은 4바이트로 표현 
 * - 부가적인 행렬 사용하지 않고 구현*/

public class RotateImage_6 {
	/*
	 * for i = 0 to n
	 *     tmp = top[i]
	 *     top[i] = left[i]
	 *     left[i] = bottom[i]
	 *     bottom[i] = right[i]
	 *     right[i] = tmp
	 * */
	public static void rotate(int[][] matrix, int n){
		for(int layer =0; layer<n/2; ++layer){
			int first = layer;
			int last = n-1-layer;
			for(int i = first; i < last; ++i) {
				int offset = i-first;
				
				//위쪽 저장
				int top = matrix[first][i];
				//왼쪽 > 위쪽
				matrix[first][i]=matrix[last-offset][first];
				//아래 > 왼쪽
				matrix[last-offset][first]=matrix[last][last-offset];
				//오른쪽>아래
				matrix[last][last-offset]=matrix[i][last];
				//위>오른쪽
				matrix[i][last] = top;
			}
		}
	}

	public static void main(String[] args) {

		int n = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the size of matrix : ");
		n = scan.nextInt();
		
		int[][] matrix = new int[n][n];
		matrix[0][0] = 1;
		matrix[0][n-1] = 2;
		matrix[n-1][n-1] = 3;
		matrix[n-1][0] = 4;
		System.out.println("1. Input : ");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(matrix[i][j]=='\0')
					matrix[i][j]=0;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("");
		
		rotate(matrix, n);
		
		System.out.println("2. Output : ");
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
