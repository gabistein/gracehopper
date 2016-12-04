package conditionalPractice1;

public class FranklinStreet {
	private int _blockNumber;
	private String _name;
	private Boolean _restaurant;

	FranklinStreet(String name, int blockNumber, boolean restaurant) {
		_blockNumber = blockNumber;
		_name = name;
		_restaurant = restaurant;
	}

	public int getBlockNumber() {
		return _blockNumber;
	}

	public void setBlockNumber(int newBlockNumber) {
		_blockNumber = newBlockNumber;
	}

	public String getName() {
		return _name;
	}

	public void setName(String newName) {
		_name = newName;
	}

	public boolean getRestaurantStatus() {
		return _restaurant;
	}

	public void setRestarantStatus(boolean status) {
		_restaurant = status;
	}

	public boolean close(FranklinStreet place1) {
		if (place1.getBlockNumber() > this.getBlockNumber() && place1.getBlockNumber() - this.getBlockNumber() < 5) {
			return true;
		} else if (this.getBlockNumber() > place1.getBlockNumber()
				&& this.getBlockNumber() - place1.getBlockNumber() < 5) {
			return false;
		} else {
			return false;
		}
	}

	public boolean sellsFood(FranklinStreet place1) {
		if (this.getRestaurantStatus() == true) {
			return this.getRestaurantStatus() && place1.getRestaurantStatus();
		} else if (this.getRestaurantStatus() == false) {
			return this.getRestaurantStatus() || place1.getRestaurantStatus();
		} else {
			return this.getRestaurantStatus();
		}
	}

}
