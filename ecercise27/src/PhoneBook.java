import java.util.ArrayList;
import java.util.Scanner;

/* 
 * PhoneBook class
 * CSE 174 fall 2019
 * YOUR NAME
 * YOUR INFORMATION
 * 
 * The PhoneBook class simulates a simple phone book application.
 * Copyright(C) Nov 2019
 */

public class PhoneBook {
	/**
	 *
	 * @param
	 * @param
	 * @param
	 * @param
	 * @param
	 */
	public static void add(ArrayList<ContactInfo> list, String name,
						   String label, String pNum) {
		// Adds a ContactInfo object to the list
		// If the name is already in the list
		// the method should print:
		// "The name already exists!"
		// If the contact is added successfully, the method should
		// print "*The contact has been added successfully*"
		for (int i = 0;i < list.size();i++){
			if (list.get(i).getName().equals(name)){
				System.out.println("The name already exists!");
				return;
			}
		}
		ArrayList<Phone> temp = new ArrayList<>();
		temp.add(new Phone(label,pNum));
		list.add(new ContactInfo(name,temp));
		System.out.println("*The contact has been added successfully*");
	}
  
	/**
	 *
	 * @param
	 * @param
	 * @param
	 * @param
	 */
	public static void append(ArrayList<ContactInfo> list, String name,
							  String label, String pNum) {
		// Adds a new Phone object to a specific ContactInfo
		// If this person does not exist the method should print:
		//   ,"Couldn't find the name!"
		// If a similar label or phone number already exists for
		// that person, the result should be:
		//     "The label/number already exists for this person!"
		// If the number is added, the method should print
		// "*The number has been added successfully*"
		for (int i = 0;i < list.size();i++){
			if (list.get(i).getName().equals(name)){
				ContactInfo temp = list.get(i);
				if (!temp.addPhone(new Phone(label,pNum))){
					System.out.println("The label/number already exists for this person!");
					return;
				}
				list.set(i,temp);
				System.out.println("*The number has been added successfully*");
				return;
			}
		}
		System.out.println("Couldn't find the name!");
    
    
	}
  
	/**
	 *
	 *
	 * @param
	 * @param
	 */
	public static void display(ArrayList<ContactInfo> list,
							   String name) {
		//Displays all the phone numbers that belongs to the given
		// name.
		// If the name doesn't exist in the list, the method should print
		// "Couldn't find the name"
		if (list.size() == 0){
			System.out.println("The list is empty");
			return;
		}
		for (int i = 0;i < list.size();i++){
			if (list.get(i).getName().equals(name)){
				for (int j = 0;j < list.get(i).getPhones().size();j++){
					System.out.println(list.get(i).getPhones().get(j).getLabel() + " "
							+ list.get(i).getPhones().get(j).getPhonNum());
				}
				return;
			}
		}
		System.out.println("Couldn't find the name");
	}
  
	/**
	 *
	 * @param
	 */
	public static void displayAll(ArrayList<ContactInfo> list){
		// Displays all the names and the phone numbers.
		// If the list is empty, the method should print�
		//"The list is Empty!"
		if (list.size() == 0){
			System.out.println("The list is Empty!");
			return;
		}
		for (int i = 0;i < list.size();i++){
			System.out.println(list.get(i).getName());
			for (int j = 0;j < list.get(i).getPhones().size();j++){
				System.out.println("\t" + list.get(i).getPhones().get(j).getLabel() + " "
						+ list.get(i).getPhones().get(j).getPhonNum());
			}
		}
    
	}
  
	/**
	 *
	 * @param
	 * @param
	 */
	public static void remove(ArrayList<ContactInfo> list,
							  String name) {
		// Remove all data related to the given name from the
		// list.
		// If the list is empty, the method should print
		// "The list is Empty!",
		// If the name does not exist the method should print
		// �"Couldn't find the name!"
		// If the contat is removed the method should print
		// *Contact is removed successfully*
		if (list.size() == 0){
			System.out.println("The list is Empty!");
			return;
		}
		for (int i = 0;i < list.size();i++){
			if (list.get(i).getName().equals(name)){
				list.remove(i);
				System.out.println("*Contact is removed successfully*");
				return;
			}
		}
		System.out.println("Couldn't find the name!");
	}
  
  
  
	// main method
	public static void main(String[] args) {
		// This is how you need to define your list.
		// Use this list.
		ArrayList<ContactInfo> list = new ArrayList<ContactInfo>();
		Scanner keyboard = new Scanner(System.in);
    
		// Complete the rest

		int command;
		while (true){
			System.out.print("1. Add a contact\n" +
					"2. Add a new number to an old contact \n" +
					"3. Display a contact  \n" +
					"4. Display All \n" +
					"5. Remove a contact \n" +
					"6. Exit \n" +
					"Enter your choice: ");
			command = keyboard.nextInt();
			if (command == 1){
				System.out.println("---Add a contact\nName: ");
				String name = keyboard.next();
				System.out.println("Label: ");
				String label = keyboard.next();
				System.out.println("Phone number (i.e. (513)111-1111): ");
				String pNumber = keyboard.next();
				add(list,name,label,pNumber);
			}
			else if (command == 2){
				System.out.println("Name: ");
				String name = keyboard.next();
				System.out.println("Label: ");
				String label = keyboard.next();
				System.out.println("Phone number (i.e. (513)111-1111): ");
				String pNumber = keyboard.next();
				append(list,name,label,pNumber);
			}
			else if (command == 3){
				System.out.print("---Display a contact\nName: ");
				String name = keyboard.next();
				display(list,name);
			}
			else if (command == 4){
				System.out.println("---Display all");
				displayAll(list);
			}
			else if (command == 5){
				System.out.print("---Remove a contact\nName:");
				String name = keyboard.next();
				remove(list,name);
			}
			else if (command == 6){
				return;
			}
			else {
				System.out.println("Invalid Input!!");
			}
		}
    
	}
}
