
public class OldLady {

	public static void main(String[] args) {
		System.out.println("There was an old lady who swallowed a fly.");
		flyDie();
			System.out.println("");
		System.out.println("There was an old lady who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spiderDie();
			System.out.println("");
		System.out.println("There was an old lady who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		birdDie();
			System.out.println("");
		System.out.println("There was an old lady who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		catDie();
			System.out.println("");
		System.out.println("There was an old lady who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		dogDie();
			System.out.println("");
		System.out.println("There was an old lady who swallowed a horse,\nShe died of course.");
	}
	public static void flyDie() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
	}
	public static void spiderDie() {
		System.out.println("She swallowed the spider to catch the fly,");
		flyDie();
	}
	public static void birdDie() {
		System.out.println("She swallowed the bird to catch the spider,");
		spiderDie();
	}
	public static void catDie() {
		System.out.println("She swallowed the cat to catch the bird,");
		birdDie();
	}
	public static void dogDie() {
		System.out.println("She swallowed the dog to catch the cat,");
		catDie();
	}

}
