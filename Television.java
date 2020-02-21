/**
 * The purpose of this class is to model television
 *@author Maisha Jahan 2/20/2020
 */

// fields
public class Television {
	String brand; // represents the brand of the television (constant)
	int size; // represents the size of the television (constant)
	int channel, volume; // sets variables for the channel and volume
	boolean powerOn; // represents true if power is on and false if off

//parameterized constructor
// gets and sets the television name and size,
//sets power = Off, volume = 20, and channel = 20
public Television (String brand, int size) {
	this.brand = brand;
	this.size= size;
	powerOn = false; 
	volume = 20;
	channel = 2;
}

/**
 * accessor method to get the volume
 * @return an int for the volume
 */
public int getVolume() {
	 return volume;
}

/**
 * accessor method to get the channel
 * @return an int for the channel
 */
public int getChannel() {
	return channel;
}

/**
 * accessor method to get the brand
 * @return a String for the manufacturer
 */
public String getManufacturer() {
	return brand;
}

/**
 * accessor method to get the screen size
 * @return an int for the screen size
 */
public int getScreenSize() {
	return size;
}

/**
 * sets the int of the channel
 * @param channel
 */
public void setChannel(int channel) {
	this.channel= channel;
}

/**
 * mutator method that switches the state of the television
 */
public void power() {
	if (powerOn == true)
	{
		powerOn = !powerOn;
	}
	else if (powerOn == false)
	{
		powerOn = !powerOn;
	}
}

/**
 * mutator method to increase the volume by 1
 */
public void increaseVolume () {
	volume += 1;
}

/**
 * mutator method to decreace the volume by 1
 */
public void decreaseVolume () {
	volume -=1;
}
}