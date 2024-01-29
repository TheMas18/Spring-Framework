package ObjectClass;

public class garbage_collection {
	public static void main(String[] args) {
		System.out.println(new garbage_collection());
		garbage_collection ref = new garbage_collection();
		System.out.println(ref);
		ref = null;
		System.out.println(ref);
		garbage_collection ref1 = new garbage_collection();
		garbage_collection ref2 = new garbage_collection();
		ref1 = ref2;
		System.gc();

	}

	public void finalize() {
		System.out.println("Clean-Up Activity");
	}
}
