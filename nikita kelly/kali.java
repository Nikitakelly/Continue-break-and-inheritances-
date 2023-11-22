
 class kali{

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };

		for (int i : intArray) {
			if (i % 2 != 0)
				continue;
			System.out.println("Processing entry " + i);
		}
	}

}