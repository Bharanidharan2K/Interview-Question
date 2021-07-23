package com.rotate_image;

public class Main {

	public static void main(String[] args) {
		int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Before: ");
		for(int i[] : matrix) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		rotate(matrix);
	}
	public static void rotate(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=i+1; j<matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int i =0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length-1];
				matrix[i][matrix.length-1] = temp;
			}
		}
		System.out.println("After: ");
		for(int i[] : matrix) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
