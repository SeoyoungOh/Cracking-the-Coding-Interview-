package Array_1;

import java.util.Scanner;

/*1.6. �̹����� ǥ���ϴ� M X N ���, �̹����� 90�� ȸ����Ű�� �޼��� �ۼ�
 * - �̹����� �� �ȼ��� 4����Ʈ�� ǥ�� 
 * - �ΰ����� ��� ������� �ʰ� ����*/

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
				
				//���� ����
				int top = matrix[first][i];
				//���� > ����
				matrix[first][i]=matrix[last-offset][first];
				//�Ʒ� > ����
				matrix[last-offset][first]=matrix[last][last-offset];
				//������>�Ʒ�
				matrix[last][last-offset]=matrix[i][last];
				//��>������
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