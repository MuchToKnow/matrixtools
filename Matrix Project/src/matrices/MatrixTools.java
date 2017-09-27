package matrices;

import java.io.IOException;

public class MatrixTools {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Matrix m1 = new Matrix(5,5);
		Matrix m2 = new Matrix(5,5);
		m1.addMatrix(m2).printMatrix();
	}
}
