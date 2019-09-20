/***
 * Grading Comments:
 * Very good job.  Definitely got the idea of 
 * reducing redundancy, and your use of nested
 * methods (inside other methods) is key.
 *  Compiles and Runs:  15/15
 *  Desired Output:  6/6
 *  Consistency:  2/2.   I see what you did with indenting the 'space'
 *    lines - and that's ok - but we'd probably rather see you use a
 *    new line instead of indenting - as indenting really represents
 *    a change in code flow rather than output.
 *  Efficiency: 1/2:   The nesting is great, but you could have
 *    taken this a couple steps further to reduce your bulk typing
 *    and duplication.   A method that just does:
 *    System.out.print("There was an old lady who swallowed a");
 *    could be called followed by:
 *    System.out.println("fly,");  ..(spider, bird etc)
 *    and you could've taken a step further by separating versus
 *    but what you did overall was really great.
 *  24/25
 */
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
