package matrices;

public class Matrix {
	
	private int cols;
	private int rows;
	private int[][] matrix;
	
	//Creates a matrix of rows x cols with values mrx.
	public Matrix(int[][] mrx, int rows, int cols) {
		this.matrix = mrx;
		this.rows = rows;
		this.cols = cols;
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
	
	public int[][] addMatrix(Matrix m){
		int[][] ret = new int[rows][cols];
		for(int r = 0; r < m.rows; r++) {
			for(int c = 0; c < m.cols; c++) {
				ret[r][c] = m.getMatrix()[r][c] + this.matrix[r][c];
			}
		}
		return ret;
	}
	
	public int[][] multiplyMatrix(Matrix m){
		// TODO add method
		return this.matrix;
	}

}
