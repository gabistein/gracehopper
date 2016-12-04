package whilelooppractice;

public class StudentImpl implements Student {
	private String _dietaryPreference;
	private int _mealSwipes;
	private int _cookiesEaten;

	public StudentImpl(String dietaryPreference, int mealSwipes, int cookiesEaten) {
		_dietaryPreference = dietaryPreference;
		_mealSwipes = mealSwipes;
		_cookiesEaten = cookiesEaten;

	}

	public String getDietaryPreference() {
		return _dietaryPreference;
	}

	public int getMealSwipes() {
		return _mealSwipes;
	}

	public int getCookiesEaten() {
		return _cookiesEaten;
	}

	public void addStudent(StudentImpl student) {

	}

	public void typesOfOmelet() {
		if (this.getDietaryPreference().equals("Vegan")) {
			System.out.println("You don't eat omelets");
		} else if (this.getDietaryPreference().equals("Vegetarian")) {
			System.out.println("Cheese and veggies please");
		} else {
			System.out.println("I'll take all of the topics!");
		}
	}

	public void swipeMeIn() {
		if (this.getMealSwipes() == 0) {
			System.out.println("No late night for you.");
		} else {
			if (this.getMealSwipes() < 10) {
				System.out.println("Running low.....");
			} else if (this.getMealSwipes() > 100) {
				System.out.println("Give your friends a swipe.");
			} else if (this.getMealSwipes() < 100) {
				System.out.println("Just enough for the rest of the semester.");
				// unreachable code
			} else {
				System.out.println("Dang, you got a lot of swipes.");
			}
		}

	}

	public void cookieOverload() {
		if (this.getCookiesEaten() > 10) {
			System.out.println("COOKIE OVERLOAD");
		} else {
			System.out.println("Go for the m&m kind.");
		}

	}

	public int sumCookies(StudentImpl[] a) {
		int sumOfCookies = 0;
		int i = 0;
		while (i < a.length) {
			sumOfCookies += a[i].getCookiesEaten();
		}
		if (sumOfCookies > 500) {
			System.out.println("RAMS IS OUT OF COOKIES");
		}
		return sumOfCookies;
	}

}
