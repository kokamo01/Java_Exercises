/**
* Hospital manager class responsible for adding and deleting patient to the list
* Day 7 practice-singly linked-list
*/

public class HospitalManager {
	private Patient head;
	
	/**
	* Adds a patient to the list
	*@param aPatient
	*/
	public void addPatientToList(Patient aPatient) {
		if (head == null) {
			head= aPatient;
		} else {
			head.add(aPatient);
		}
	}
	
	/**
	* Removes a patient from the list
	*@param name
	*/
	public void removePatientFromList(String name) {
		if (head.getPatientName().equals(name)) {
			head = head.getNext();
		} else {
			head.remove(name);
		}
	}

	/*
	* Prints the list out
	*/
	public void printList() {
		if (head == null) {
			System.out.println("Nothing in the list to print.");
		} else {
			head.print();
		}
	}
}