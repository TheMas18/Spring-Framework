package Tcs;

//Question

//Create a class Motel with the below attributes:
//motelId - int
//motelName - String
//dateOfBooking – String (in the format dd-mon-yyyy)
//noOfRoomsBooked – int
//cabFacility – String
//totalBill- double
//Restricted for circulation outside TCS Xplore 6
//The above attributes should be private, write getters, setters and parameterized constructor as
//required.
//Create class Solution with main method.
//Implement one static method – totalNoOfRoomsBooked in Solution class.
//totalNoOfRoomsBooked method:
//This method will take two input parameter - array of Motel objects and a String parameter.
//The method will return the total numbers of rooms booked from array of Motel objects if the cab facility
//attribute matches with the given String parameter(cab facility) and the number of rooms booked is
//greater than 5.
//If no rooms are booked with the above criteria in the array of Motel objects, then the method should
//return 0.
//Note :
//No two Motel object would have the same motelId.
//dateOfBooking is stored in the format dd-mon-yyyy(eg. 01-Jan-2022)
//The above mentioned static method should be called from the main method.
//For totalNoOfRoomsBooked method - The main method should print the total number of booked rooms
//as it is, if the returned value is greater than 0, else it
//should print "No such rooms booked"
//Before calling these static methods in main, use Scanner object to read the values of four Motel objects
//referring attributes in the above mentioned attribute sequence.
//Next, read the value of one String parameter for capturing the cab facility.
//Restricted for circulation outside TCS Xplore 7
//Consider below sample input and output:
//Input1:
//1001
//M&M
//01-Dec-2022
//5
//Yes
//30000
//1002
//BestStay
//10-Jan-2022
//3
//Yes
//27000
//1003
//Novatel
//11-Jun-2022
//5
//Yes
//25000
//1004
//Chola
//01-Sep-2022
//7
//Yes
//72000
//Yes
//Restricted for circulation outside TCS Xplore 8
//Output1:
//7
//Input2:
//1001
//M&M
//01-Dec-2022
//5
//No
//30000
//1002
//BestStay
//10-Jan-2022
//3
//No
//27000
//1003
//Novatel
//11-Jun-2022
//5
//No
//25000
//1004
//Chola
//01-Sep-2022
//7
//No
//72000
//JUne
//Restricted for circulation outside TCS Xplore 9
//Output2:
//No such rooms booked
//--------------------------------------------------
//Sample code snippet for reference:
//Please use below code to build your Solution.
//--------------------------------------------------
//import java.util.Scanner;
//public class Solution
//{
// public static void main(String[] args)
//{
// //code to read values
// //code to call required method
// //code to display the result
//}
//
////code the first method
//
//}
//
////code the class
//-------------------------------------------------
//Note on using Scanner object:
//Sometimes scanner does not read the new line character while invoking methods like nextInt(),
//nextDouble() etc.
//Restricted for circulation outside TCS Xplore 10
//Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those
//methods.
//Consider below input values:
//1001
//Savings
//Referring below code:
//Scanner sc = new Scanner(System.in);
//int x = sc.nextInt();
//String str = sc.nextLine(); -> here we expect str to have value Savings.Instead it may be "".
//If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading
//numeric value.
//

//Solution
import java.util.Scanner;



class Motel {

	int motelId;
	String motelName;
	String dateOfBooking;
	int noOfRoomsBooked;
	String cabFacility;
	double totalbill;

	public int getMotelId() {
		return motelId;
	}

	public void setMotelId(int motelId) {
		this.motelId = motelId;
	}

	public String getMotelName() {
		return motelName;
	}

	public void setMotelName(String motelName) {
		this.motelName = motelName;
	}

	public String getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public int getNoOfRoomsBooked() {
		return noOfRoomsBooked;
	}

	public void setNoOfRoomsBooked(int noOfRoomsBooked) {
		this.noOfRoomsBooked = noOfRoomsBooked;
	}

	public String getCabFacility() {
		return cabFacility;
	}

	public void setCabFacility(String cabFacility) {
		this.cabFacility = cabFacility;
	}

	public double getTotalbill() {
		return totalbill;
	}

	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}

	public Motel(int motelId, String motelName, String dateOfBooking, int noOfRoomsBooked, String cabFacility,

			double totalbill) {
		super();
		this.motelId = motelId;
		this.motelName = motelName;
		this.dateOfBooking = dateOfBooking;
		this.noOfRoomsBooked = noOfRoomsBooked;
		this.cabFacility = cabFacility;
		this.totalbill = totalbill;
	}

}
public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Motel[] Motel = new Motel[4];

		for (int i = 0; i < Motel.length; i++) {
			int motelId = sc.nextInt();
			sc.nextLine();

			String motelName = sc.nextLine();
			String date = sc.nextLine();
			int noOfRooms = sc.nextInt();
			sc.nextLine();
			String cab = sc.nextLine();
			double bill = sc.nextDouble();
			sc.nextLine();

			Motel[i] = new Motel(motelId, motelName, date, noOfRooms, cab, bill);
		}

		String cabFaci = sc.nextLine();

		int nos = totalNoOfRoomsBooked(Motel, cabFaci);
		if (nos > 0) {
			System.out.println(nos);
		} else {
			System.out.println("No such rooms booked");
		}

	}

	public static int totalNoOfRoomsBooked(Motel[] motel, String cabFaci) {
		int count = 0;
		for (Motel mo : motel) {
			if (mo.getNoOfRoomsBooked() > 5 && mo.getCabFacility().equalsIgnoreCase(cabFaci)) {

				count = count + mo.getNoOfRoomsBooked();
			}
		}
		return count;
	}

}

//Test cases
//Testcase1:
//Input:
//1001
//M&M
//01-Dec-2022
//5
//Yes
//30000
//1002
//BestStay
//10-Jan-2022
//3
//Yes
//27000
//1003
//Restricted for circulation outside TCS Xplore 15
//Novatel
//11-Jun-2022
//5
//Yes
//25000
//1004
//Chola
//01-Sep-2022
//7
//Yes
//72000
//Yes
//Output1:
//7
//Testcase2:
//Input:
//1001
//M&M
//01-Dec-2022
//5
//No
//30000
//1002
//BestStay
//10-Jan-2022
//Restricted for circulation outside TCS Xplore 16
//3
//No
//27000
//1003
//Novatel
//11-Jun-2022
//5
//No
//25000
//1004
//Chola
//01-Sep-2022
//7
//No
//72000
//JUne
//Output:
//No such rooms booked
//Testcase3:
//Input:
//1001
//M&M
//01-Dec-2022
//7
//Yes
//Restricted for circulation outside TCS Xplore 17
//30000
//1002
//BestStay
//10-Jan-2022
//3
//Yes
//27000
//1003
//Novatel
//11-Jun-2022
//7
//Yes
//25000
//1004
//Chola
//01-Sep-2022
//7
//Yes
//72000
//Yes
//Output:
//21
//Testcase4:
//Input:
//1001
//Restricted for circulation outside TCS Xplore 18
//M&M
//01-Dec-2022
//5
//Yes
//30000
//1002
//BestStay
//10-Jan-2022
//3
//Yes
//27000
//1003
//Novatel
//11-Jun-2022
//5
//Yes
//25000
//1004
//Chola
//01-Sep-2022
//10
//No
//72000
//No
//Output:
//10