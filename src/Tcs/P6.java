package Tcs;

import java.util.*;

class Hotel {
	private int hotelId;
	private String hotelName;
	private String dateOfBooking;
	private int noOfRoomsBooked;
	private String wifiFacility;
	private double totalBill;

	Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility,
			double totalBill) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.dateOfBooking = dateOfBooking;
		this.noOfRoomsBooked = noOfRoomsBooked;
		this.wifiFacility = wifiFacility;
		this.totalBill = totalBill;
	}

	public int getHotelId() {
		return hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public String getDateOfBooking() {
		return dateOfBooking;
	}

	public int getNoOfRoomsBooked() {
		return noOfRoomsBooked;
	}

	public String getWifiFacility() {
		return wifiFacility;
	}

	public double gettotalBill() {
		return totalBill;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public void setNoOfRoomsBooked(int noOfRoomsBooked) {
		this.noOfRoomsBooked = noOfRoomsBooked;
	}

	public void setWifiFacility(String wifiFacility) {
		this.wifiFacility = wifiFacility;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

}

public class P6 {

	static int noOfRoomsBookedInGivenMonth(Hotel[] obj, String str_month) {// may
		int total = 0;
		int count1 = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i].getDateOfBooking().substring(3, 6).length() == str_month.length()) {
				if ((obj[i].getDateOfBooking().substring(3, 6)).equalsIgnoreCase(str_month)) {
					total = total + obj[i].getNoOfRoomsBooked();
					count1++;

				}
			}
		}
		if (count1 > 0) {
			return total;
		} else {
			return 0;
		}

	}

	static int[] searchHotelByWifiOption(Hotel[] obj, String str_wifi) {
		int count2 = 0;
		int flag = 0;
		int[] temp = {};

		for (int m = 0; m < obj.length; m++) {
			if ((obj[m].getWifiFacility()).equalsIgnoreCase(str_wifi)) {
				flag++;
			}
		}

		if (flag >= 2 || flag == 0) {
			double high = Double.MIN_VALUE;
			double second_high = 0.0;

			for (int i = 0; i < obj.length; i++) {
				for (int j = i + 1; j < obj.length; j++) {
					if ((obj[i].getHotelId() != obj[j].getHotelId())
							&& (obj[i].gettotalBill() != obj[j].gettotalBill())) {

						if (obj[i].gettotalBill() > high) {
							second_high = high;
							high = obj[i].gettotalBill();
						} else if (obj[i].gettotalBill() > second_high && obj[i].gettotalBill() != high) {
							second_high = obj[i].gettotalBill();
						}
					}

				}

			}
			for (int x = 0; x < obj.length; x++) {
				if (second_high == obj[x].gettotalBill()) {
					temp[0] = obj[x].getHotelId();
					count2++;
				}
			}
		}
		return temp;
	}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Hotel[] obj = new Hotel[4];

		for (int i = 0; i < obj.length; i++) {
			int hotelId = sc.nextInt();
			sc.nextLine();
			String hotelName = sc.nextLine().toLowerCase();
			String dateOfBooking = sc.nextLine().toLowerCase();
			int noOfRoomsBooked = sc.nextInt();
			sc.nextLine();
			String wifiFacility = sc.nextLine().toLowerCase();
			double totalBill = sc.nextDouble();
			sc.nextLine();
			obj[i] = new Hotel(hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill);

		}
		String str_month = sc.nextLine().toLowerCase();
		String str_wifi = sc.nextLine().toLowerCase();
		sc.close();

		int n = noOfRoomsBookedInGivenMonth(obj, str_month);
		int[] option = searchHotelByWifiOption(obj, str_wifi);

		if (n > 0) {
			System.out.println(n);
		} else {
			System.out.println("No such option available");
		}

		if (searchHotelByWifiOption(obj, str_wifi) != null) {
			for (int i = 0; i < option.length; i++) {
				System.out.println(option[i]);
			}
		} else {
			System.out.println("No rooms booked in the given month");
		}

	}
}
