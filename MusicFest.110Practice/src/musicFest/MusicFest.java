package musicFest;

public class MusicFest {

	int _initialBoothCount;
	String _festivalName;

	public MusicFest(int initialBoothCount, String festivalName) {
		_initialBoothCount = initialBoothCount;
		_festivalName = festivalName;
	}

	// Write a method that takes in an int, declares a local variable that holds
	// the new booth count, and returns
	// a string that has the instance variable _festivalName and your local
	// variable.
	public String boothCountChange(int newBooths) {
		int totalBooths = newBooths + _initialBoothCount;
		return "The new booth total at " + _festivalName + " is " + totalBooths + ".";

	}

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
