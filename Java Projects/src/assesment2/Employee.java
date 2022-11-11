
/*IV) USING Collection framework , derive solution for the below problem statement:

create Seat and Theatre classes with below fields information.

Seat --> SeatNo, Price and Reserved

Theatre--> name and ArrayList of seats
       --> constructor (name,noOfRows,SeatsperRow)

Business requirement to implement:

Build solution to fill the Theatre with seats of 10 rows and 15 seats per row

The seats name must be A01, A02, A03, ..., H15 as 'A' is the row and '01' as the seat number

The front seats as A01.....A05  are more expensive than the others seats.
  1.Create method that makes you reserve a seat
  2.Create a method that makes you cancel seat reservation
 */

package assesment2;

import java.util.ArrayList;

class Seat{
	int seatno;
	double price;boolean reserved;

	public int getSeatno() {
		return seatno;
	}

	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
	
}
class Theatre{
	String name;
	int row;
	int seatperrow;
	Seat web =new Seat();
	ArrayList<String>seats;
	Theatre(String name,int row,int seatperrow){
		this.name=name;
		this.row=row;
		this.seatperrow=seatperrow;
		seats=new ArrayList<>();
		for(int i=1;i<row;i++) {
			for(int j=1;j<seatperrow;j++) {
				web=new Seat();
				char[]seatname= {'A','B','C','D','E','F','G','H'};
				String names=seatname[i]+""+j;
				web.setSeatno(5);
				web.setPrice(200);
				web.setReserved(false);
			}
		}
		
	}
	public void book(String seatno) {
		if(web.isReserved()) {
			System.out.println(seatno+"booked");
		}else {
			web.setReserved(true);
			System.out.println("Booked seat successfully"+seatno);
		}
	}
	public void cancel(String seatno) {
		if(web.isReserved()) {
			System.out.println(seatno+"canceled");
		}else {
			web.setReserved(false);
			System.out.println(seatno+"canceled");
		}
	}
}


public class Employee {

	public static void main(String[] args) {
		Theatre t=new Theatre("ramesh",2,3);
		t.book("A1");
		t.book("A1");
       t.cancel("G1");
	}

}
