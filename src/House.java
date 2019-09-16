
public class House {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	verse1();
	System.out.println();
	verse2();
	System.out.println();
	verse3();
	System.out.println();
	verse4();
	System.out.println();
	verse5();
	System.out.println();
	verse6();
	System.out.println();
	verse7();
	}
	
	//VERSE 1
	public static void verse1() {
		System.out.println("This is the house that Jack built.");
	}
	
	//VERSE 2
	public static void verse2() {
		System.out.println("This is the malt");
		house();
	}
	
	//VERSE 3
	public static void verse3() {
		System.out.println("This is the rat,");
		malt();
		house();
	}
	
	//VERSE 4
	public static void verse4() {
		System.out.println("This is the cat,");
		rat();
		malt();
		house();
	}
	
	//VERSE 5
	public static void verse5() {
		System.out.println("This is the dog,");
		cat();
		rat();
		malt();
		house();
	}
	
	//VERSE 6
	public static void verse6() {
		System.out.println("This is the cow with the crumpled horn,");
		dog();
		cat();
		rat();
		malt();
		house();
	}
	
	//VERSE 7
	public static void verse7() {
		System.out.println("This is the maiden all forlorn");
		cow();
		dog();
		cat();
		rat();
		malt();
		house();
	}
	
		//REPEATED LINES
		public static void cow() {
			System.out.println("That milked the cow with the crumpled horn,");
		}
		public static void dog() {
			System.out.println("That tossed the dog,");
		}
		public static void cat() {
			System.out.println("That worried the cat,");
		}
		public static void rat() {
			System.out.println("That killed the rat,");
		}
		public static void malt() {
			System.out.println("That ate the malt");
		}
		public static void house() {
			System.out.println("That lay in the house that Jack built.");
		}
}
