

//Create a class Laptop with the below attributes:
//
//laptopld - int
//brand - String
//osType - String
//pice - double
//ratings int
//
//‘The above attributes should be private, write-getters, setters
//and parameterized constructor as required
//
//Create class Solution with main method,
//
//Implement two static methods - countOfLaptopsByBrand and
//searchLaptopByOsTypein Sotution class
//
//countOfLaptopsByBrand method:
//
//This method will take two input parameters - array of Laptop
//objects ania String parameter
//
//The fnethod will return the count of laptops fron-array of
//Laptop object for the given brand(String parameter passed)
//‘whose rating is more than 3.
//
//Ifno Laptop with the above condition is present in the array
//of Laptop objects, then the method should return 0
//searchLaptopByOs Type method:
//This method will take twa input parameters - array of Laptop
//objects and a String'parameter
//
//The method willrehimn Laptop object array in an descending
//order of their aytopld, from the array of Laptop objects,
//whose oxatitibute matches with the given OS(String
//parameter passed),
//
//Ifo Laptop with the given OS is present in the array of
//Laptop objects, then the method should returi null
//
//Note : No two Laptop object would have the same laptopld,
//All the searches should be case insensitive
//
//The above mentioned static methods should be called from
//the main method,
//
//For countOfLaptopsByBrand method - The main method
//should print the count of laptops as itis, if the returned wale
//is greaten than 0, or it
//
//should print "The given brand is not available"
//
//For searchLaptopByOsType method - The sain method
//should print the laptopld and rating from the returned Laptop
//object array if the returned value is not null
//
//If the returned value is null then it should print "The given os
//is not available"
//Before calling these static methods in main, use Scanner
//jobject to read the values of Four Laptop objects referring
//attributes in the above mentioned attribute Sequence
//Next, read two String values for capturing brand and os,
//123
//HP
//Windows
//35000
//5
//124
//Apple
//Mac OS
//70000
//5
//125
//Dell
//Ubuntu
//30000
//4
//126
//HP
//windows
//40000
//4
//HP
//windows


package Tcs;

import java.util.Scanner;

class Laptop {
	private int laptopId;
	private String brand;
	private String osType;
	private double price;
	private int rating;

	Laptop(int laptopId, String brand, String osType, double price, int rating) {
		super();
		this.laptopId = laptopId;
		this.brand = brand;
		this.osType = osType;
		this.price = price;
		this.rating = rating;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public String getBrand() {
		return brand;
	}

	public String getOsType() {
		return osType;
	}

	public double getPrice() {
		return price;
	}

	public int getRating() {
		return rating;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}

public class P4 {
	static int countOfLaptopsByBrand(Laptop[] obj, String str_brand) {
		int count = 0;

		for (int i = 0; i < obj.length; i++) {
			if (obj[i].getRating() > 3 && (obj[i].getBrand().equalsIgnoreCase(str_brand)) ) {
				count++;
			}
		}
		if (count== 0) {
			return 0;
		} else {
		
			return count;
		}

	}

	static int[] searchLaptopByOsType(Laptop[] obj, String str_os) {
		int temp[] = new int[obj.length];
		int flag = 0;
		int i = 0;
		for (int j = 0; j < obj.length; j++) {
			for (int j2 = j + 1; j2 < obj.length; j2++) {
				if ((obj[j].getLaptopId()) != (obj[j2].getLaptopId())) {
					while (i < 4) {
						if ((obj[i].getOsType()).equalsIgnoreCase(str_os)) {
							temp[i] = obj[i].getLaptopId();
							flag++;
						}
						i++;

					}

				}
			}
		}

		if (flag > 0) {
			return temp;
		} else {
			return null;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Laptop[] obj = new Laptop[4];
		for (int i = 0; i < obj.length; i++) {
			int laptopId = sc.nextInt();
			sc.nextLine();
			String brand = sc.nextLine().toLowerCase();
			String osType = sc.nextLine().toLowerCase();
			double price = sc.nextDouble();
			int rating = sc.nextInt();
			sc.nextLine();
			obj[i] = new Laptop(laptopId, brand, osType, price, rating);
		}
		String str_brand = sc.nextLine().toLowerCase();
		String str_os = sc.nextLine().toLowerCase();
	

		int count_brand = countOfLaptopsByBrand(obj, str_brand);
		if (count_brand > 0) {
			System.out.println(count_brand);
		} else {
			System.out.println("The given brand is not available");
		}

		int lp[] = searchLaptopByOsType(obj, str_os);
		if (searchLaptopByOsType(obj, str_os)!= null) {
			for (int i=lp.length-1; i >=0 ; i--) {
				if(lp[i]!=0) {//1
					System.out.println(lp[i]);//126
					for (int j = 0; j < obj.length; j++) {
						if (lp[i]==obj[j].getLaptopId()) {
							System.out.println(obj[i].getRating());
						} 
					}
				}
			}
		} else {
			System.out.println("The given os is not available");
		}
		

	}
}
