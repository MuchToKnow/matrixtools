package matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vector {
	
	private int[] vector;
	private int length;
	
	public Vector(int length) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		this.length = length;
		for(int i = 0; i < length; i++) {
			System.out.println("Insert value for index: " + i);
			this.vector[i] = Integer.parseInt(reader.readLine());
		}
	}
	
	public Vector(int[] vector) {
		this.vector = vector;
		this.length = vector.length;
	}
	
	//Returns dotProdcuct of this vector and a given vector v
	public int getDotProduct(Vector v) {
		int ret = 0;
		for(int i = 0; i < Math.min(v.length, this.length); i++) {
			ret += v.vector[i] * this.vector[i];
		}
		return ret;
	}
	
	//Returns the scaled Vector of this
	public Vector getScale(int s) {
		int[] ret = new int[this.length];
		for(int i = 0; i < this.length; i++) {
			ret[i] = this.vector[i] * s;
		}
		return new Vector(ret);
	}
}
