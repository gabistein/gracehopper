package whilelooppractice;

public class LateNightAtRams {

	public static void main(String[] args) {
		StudentImpl Jake = new StudentImpl("Vegetarian", 300, 5);
		StudentImpl Susan = new StudentImpl("Vegan", 10, 1);
		StudentImpl Alex = new StudentImpl("All foods", 0, 0);
		StudentImpl Kris = new StudentImpl("Pizza", 40, 1);
		StudentImpl Gabi = new StudentImpl("Pescatarian", 0, 2);
		StudentImpl[] students = { Jake, Susan, Alex, Kris, Gabi };
		int i = 0;
		while (i < students.length) {
			students[i].typesOfOmelet();
			i++;

		}
		while (i < students.length) {
			students[i].swipeMeIn();
			i++;
		}

	}

}
