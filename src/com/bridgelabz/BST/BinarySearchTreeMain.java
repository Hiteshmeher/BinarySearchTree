package com.bridgelabz.BST;
/**
 * 
 * @author HITESH
 *
 */
public class BinarySearchTreeMain {
	/**
	 * 
	 * @param <T>
	 * @param args
	 */
	public static <T extends Comparable<T>> void main(String[] args) {
		BinarySearch<T> bs = new BinarySearch<T>();
		//adding values to nodes
		bs.insert(56);
		bs.insert(30);
		bs.insert(70);
		bs.display();
	}
}