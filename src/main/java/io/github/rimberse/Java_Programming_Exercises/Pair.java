package io.github.rimberse.Java_Programming_Exercises;

//Exercise: Generic pair
public class Pair<L, R> {
	private L left;
	private R right;
	
//	public static Pair<Integer, Double> withDifferentElements(int leftNumber, double rightNumber) {
//		return new Pair<>(leftNumber, rightNumber);
//	}
//	
//	public static Pair<String, String> withSameElements(String text) {
//		return new Pair<>(text, text);
//	}
	
	public Pair() {
		
	}
	
	public/*private*/ Pair(L left, R right) {
		this.left = left;
		this.right = right;
	}
	
	public L getLeft() {
		return left;
	}
	
	public R getRight() {
		return right;
	}
	
	public void setContents(L left, R right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left.toString() + " " + right.toString();
	}
}