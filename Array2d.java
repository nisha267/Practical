package Practical.com;
//multidimensional or 2d array
public class Array2d {
public static void main(String[] args) {
	//declaring and initializing 2d array
	int arr[][]= {{2,5,6},{4,6,8},{1,2,9}};
	for(int i=0;i<3;i++) {//for printing row
		for(int j=0;j<3;j++) {//for printing column
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
