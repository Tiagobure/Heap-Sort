package application;

public class Main {

	public static void main(String[] args) {

		int[] vector = new int[10];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) Math.floor(Math.random() * vector.length);
		}

		System.out.println("disorderly: ");

		for (int i = 0; i < vector.length; i++) {

			System.out.print(vector[i] + " ");
		}

		/*
		 * heap sort 2*i+1--2*i+2
		 */
		int n = vector.length;

		for (int i = n / 2 - 1; i >= 0; i--) {
			applyHeap(vector, n, i);
		}
		
		System.out.println("\n\nAlmost Ordered:");
		for (int i = 0; i < vector.length; i++) {

			System.out.print(vector[i] + " ");
		}
		
		for (int j = n-1; j > 0; j--) {
			int aux = vector[0];
			vector[0] = vector[j];
			vector[j] = aux;
			applyHeap(vector, j, 0);		
		}

		System.out.println("\n\nOrdered:");
		for (int i = 0; i < vector.length; i++) {

			System.out.print(vector[i] + " ");
		}
	}

	private static void applyHeap(int[] vector, int n, int i) {
		int root = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && vector[left] > vector[root]) {
			root = left;
		}
		if (right < n && vector[right] > vector[root]) {
			root = right;
		}
		if (root != i) {
			int aux = vector[i];
			vector[i] = vector[root];
			vector[root] = aux;
			// recursivo
			applyHeap(vector, n, root);
		}
	}

}
