/*
 * Phone class
 * CSE 174 fall 2019
 * Meisam Amjad
 *
 * ###DO NOT CHANGE THE CONTENT OF THIS CLASS###
 *
 * The Phone class simulates a very simple library that holds
 * a phone number and its lable.
 * Copyright(C) Nov 2019
 */

public class Phone {

	private String label;     // One of the lables
	private String phonNum;   // Phone number

	// ======= Constructors =======
	/**
	 * This constructor sets the label and phone number fields
	 * from the values passed as arguments.
	 * @param phonNum The phone number.
	 */
	public Phone(String label, String phonNum){

		setLabel(label);
		setPhonNum(phonNum);

	}

	/**
	 * Copy Constructor
	 * @param p Phone class
	 */
	public Phone(Phone p) {
		setLabel(p.getLabel());
		setPhonNum(p.getPhonNum());
	}

	// ======= Setter Methods =======
	/**
	 * The setLabel method sets the phone label field.
	 * @param label The value to store in the label field.
	 */
	private void setLabel(String label) {
		this.label = label;
	}

	/*
    * The setPhonNum method sets the phone number.
    * @param PhonNum The value to store in the phone number field.
    */
	private void setPhonNum(String phonNum) {
		this.phonNum = phonNum;
	}

	// ======= Getter Methods =======
	/**
	 * The getLabel method returns the label of the phone number.
	 * @return The value of the label field.
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * The getPhonNum method returns the phone number.
	 *  @return The value of the phone number field.
	 */
	public String getPhonNum() {
		return this.phonNum;
	}


}
