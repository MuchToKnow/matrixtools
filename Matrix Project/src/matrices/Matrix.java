package matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {
	
	private int cols;
	private int rows;
	private int[][] matrix;
	
	//Creates a matrix of rows x cols with values mrx.
	public Matrix(int[][] mrx) {
		this.matrix = mrx;
		this.rows = mrx.length;
		this.cols = mrx[0].length;
	}
	
	public Matrix(int rows, int cols) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		this.rows = rows;
		this.cols = cols;
		this.matrix = new int[rows][cols];
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c < cols; c++) {
				System.out.println("Entry (" + r + ", " + c + "):" );
				this.matrix[r][c] = Integer.parseInt(reader.readLine());
			}
		}
		
	}
	
	public int[][] getMatrix() {
		return this.matrix;
	}
	
	public int getCols() {
		return this.cols;
	}
	
	public int getRows() {
		return this.rows;
	}
	
	//Prints a Matrix to the console
	public void printMatrix() {
		for(int r = 0; r < this.rows; r++) {
			for(int c = 0; c < this.cols; c++) {
				System.out.print(this.matrix[r][c] + " ");
			}
			System.out.println();
		}
	}
	
	//Adds two matrices of the same size
	public Matrix addMatrix(Matrix m){
		int[][] ret = new int[rows][cols];
		//check for same size
		if ((m.cols != this.cols) || (m.rows != this.rows)) {
			return new Matrix(ret);
		}
		for(int r = 0; r < m.rows; r++) {
			for(int c = 0; c < m.cols; c++) {
				ret[r][c] = m.getMatrix()[r][c] + this.matrix[r][c];
			}
		}
		return new Matrix(ret);
	}
	
	//Multiplies this by m provided m has dimensions: ([this.cols][this.rows])
	public Matrix multiplyMatrix(Matrix m){
		int[][] ret = new int[this.rows][m.cols];
		for(int r = 0; r < this.rows; r++) {
			for(int c = 0; c < m.cols; c++) {
				
			}
		}
		return new Matrix(ret);
	}
}
