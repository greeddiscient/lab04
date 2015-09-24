public class Measurement {

	/**
	 * Constructor: initialize this object to be a measurement of 0 feet, 0
	 * inches
	 */
	private int myfeet, myinch;
	
	public Measurement() {
		myfeet=0;
		myinch=0;
	}

	/**
	 * Constructor: takes a number of feet as its single argument, using 0 as
	 * the number of inches
	 */
	public Measurement(int feet) {
		myfeet= feet;
		myinch=0;
	}

	/**
	 * Constructor: takes the number of feet in the measurement and the number
	 * of inches as arguments (in that order), and does the appropriate
	 * initialization
	 */
	public Measurement(int feet, int inches) {
		myfeet=feet;
		myinch=inches;
	}

	/**
	 * Returns the number of feet in in this Measurement. For example, if the
	 * Measurement has 1 foot and 6 inches, this method should return 1.
	 */
	public int getFeet() {
		return myfeet;
	}

	/**
	 * Returns the number of inches in this Measurement. For example, if the
	 * Measurement has 1 foot and 6 inches, this method should return 6.
	 */
	public int getInches() {
		return myinch;
	}

	/** Adds the argument m2 to the current measurement */
	public Measurement plus(Measurement m2) {
		int carryover=0;
		int newfeet,newinch;
		if (myinch+m2.getInches() > 12){
			carryover+=1;
			newinch= myinch+m2.getInches()-12;
		}
		else{
			newinch=myinch+m2.getInches();
		}
		newfeet=myfeet+m2.getFeet()+carryover;
		Measurement bossmode= new Measurement(newfeet,newinch);
		return bossmode;
		
	}

	/**
	 * Subtracts the argument m2 from the current measurement. You may assume
	 * that m2 will always be smaller than the current measurement.
	 */
	public Measurement minus(Measurement m2) {
		int carryover=0;
		int newfeet,newinch;
		if (myinch<m2.getInches()){
			carryover+=1;
			newinch= myinch+12-m2.getInches();
		}
		else{
			newinch=myinch-m2.getInches();
		}
		newfeet=myfeet-m2.getFeet()-carryover;
		Measurement bossmode= new Measurement(newfeet,newinch);
		return bossmode;
	}

	/**
	 * Takes a nonnegative integer argument n, and returns a new object that
	 * represents the result of multiplying this object's measurement by n. For
	 * example, if this object represents a measurement of 7 inches, multiple
	 * (3) should return an object that represents 1 foot, 9 inches.
	 */
	public Measurement multiple(int multipleAmount) {
		int totalinch,newinch;
		totalinch= myfeet*12+myinch;
		newinch= totalinch*multipleAmount;
		return  new Measurement(newinch/12,newinch%12);
		//return bossmode;
	}

	/**
	 * toString should return the String representation of this object in the
	 * form f'i" that is, a number of feet followed by a single quote followed
	 * by a number of inches less than 12 followed by a double quote (with no
	 * blanks).
	 */
	@Override
	public String toString() {
		return new String(myfeet+"'"+myinch+'"');
	}

}
