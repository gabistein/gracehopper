package musicFest;

/*You are given the following class that already has two instance variables and constructor. 
 * The basic purpose of this class is that given a music festival name and number of booths, 
 * come up with a method that generates super cool band names by following a few instructions. 
*/
public class MusicFest {

	int _initialBoothCount;
	String _festivalName;

	public MusicFest(int initialBoothCount, String festivalName) {
		_initialBoothCount = initialBoothCount;
		_festivalName = festivalName;
	}

	/*
	 * Write a method that returns a new total booth count if more booths are
	 * added. This method should take in an int, declare a local variable that
	 * holds the new booth count, and returns a string that has the instance
	 * variable _festival names and your local variable.
	 */
	public String boothCountChange(int newBooths) {
		int totalBooths = newBooths + _initialBoothCount;
		return "The new booth total at " + _festivalName + " is " + totalBooths + ".";

	}

	/*
	 * This method will generate band names. Make sure your method meets all of
	 * the following requirements. 1)Declares a string, int, double, char, and
	 * boolean local variable. 2)Returns a string that takes in all of your
	 * local variables to make the super dope name.
	 */
	public String makeBandName() {
		String bandName = "";
		int startOfName = 0;
		double secondPartOfName = 0;
		char thirdPartOfName = 'a';
		boolean coolName = false;

		if (_initialBoothCount > 10) {
			for (int i = 0; i < _initialBoothCount; i++) {
				startOfName += _initialBoothCount * 2;
			}
		}

		if (startOfName > 0) {
			secondPartOfName = startOfName / 13;
			thirdPartOfName = '3';

		} else {
			coolName = true;
		}

		bandName = bandName + startOfName + secondPartOfName + thirdPartOfName + coolName;
		System.out.println(bandName);
		return bandName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicFest bonaroo = new MusicFest(15, "Bonaroo");

		bonaroo.makeBandName();

	}

}
