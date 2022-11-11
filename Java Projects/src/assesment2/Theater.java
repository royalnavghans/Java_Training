package assesment2;

/*IV) USING Collection framework , derive solution for the below problem statement:

create Seat and Theatre classes with below fields information.

Seat --> SeatNo, Price and Reserved

Theatre--> name and ArrayList of seats
       --> constructor (name,noOfRows,SeatsperRow)

Business requirement to implement:

Build solution to fill the Theatre with seats of 10 rows and 15 seats per row

The seats name must be A01, A02, A03, ..., H15 as 'A' is the row and '01' as the seat number

The front seats as A01.....A05  are more expensive than the others seats.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Seats {

	private String seatNo;
	private double price;
	private boolean reserved;

	public String getSeatNo() {return seatNo;}
	public void setSeatNo(String seatNo) {this.seatNo = seatNo;}
	public double getPrice() {return price;}
	public void setPrice(double price) {this.price = price;}
	public boolean isReserved() {return reserved;}
	public void setReserved(boolean reserved) {this.reserved = reserved;}

	@Override
	public String toString() {
		return "Seat [seatNo=" + seatNo + ", price=" + price + ", reserved=" + reserved + "]";
	}

}

class Theatres {
	private String name;
	ArrayList<Seats> seats;
	private List<Seats> availableSeats = new ArrayList<>();

	@Override
	public String toString() {
		return "Theatre [name=" + name + ", seats=" + seats + "]";
	}

	Theatres(String name, int noOfRows, int SeatsPerRow) {
		this.name = name;
		seats = new ArrayList<>();
		char row = 'A';
		for (int i = 0; i < noOfRows; i++) {

			for (int j = 0; j < SeatsPerRow; j++) {
				String seatName = row + "" + (j + 1);
				Seats ob = new Seats();

				if (seatName.equals("A1") || seatName.equals("A2") || seatName.equals("A3") || seatName.equals("A4")
						|| seatName.equals("A5")) {
					double price = 300;
					ob.setPrice(price);
				} else {
					double price = 200;
					ob.setPrice(price);
				}
				boolean reserved = false;
				ob.setSeatNo(seatName);
				ob.setReserved(reserved);
				seats.add(ob);
			}
			row++;
		}

	}

	public void bookTicket(String seatNo) {
		
		Seats reserveSeat = isSeatAvailable(seatNo);
		
		if (validateSeat(seatNo)) {
			if(reserveSeat == null) {
				System.out.println(seatNo + " is already booked..");
			} else if (!reserveSeat.isReserved()) {
				if (reserveSeat.getSeatNo().equals("A1") || reserveSeat.getSeatNo().equals("A2") || reserveSeat.getSeatNo().equals("A3")
						|| reserveSeat.getSeatNo().equals("A4") || reserveSeat.getSeatNo().equals("A5")) {
					reserveSeat.setPrice(300);
					reserveSeat.setReserved(true);
					System.out
							.println(seatNo + " is booked, please pay rs:" + reserveSeat.getPrice() + ", have a nice day...");
					return;
				} else {
					reserveSeat.setReserved(true);
					System.out.println(seatNo + " is booked, please pay rs:" + reserveSeat.getPrice() + ", have a nice day...");
					return;
				}
			}
		} else {
		System.out.println(seatNo + " is not valid, please enter a valid seatNo.");
		}

	}

	public void cancelTicket(String seatNo) {
		Seats reservedSeat = isSeatAvailable(seatNo);
		
		if(validateSeat(seatNo)) {
			if(reservedSeat == null) {
				for(Seats getSeat : seats) {
					if(getSeat.getSeatNo().equals(seatNo)) {
						if(getSeat.isReserved()) {
							getSeat.setReserved(false);
							System.out.println("Your ticket of seat " + seatNo + " is cancelled..");
						}
					}
				}
			} else {
				System.out.println(seatNo + " is not yet booked..");
			}
		} else {
			System.out.println(seatNo + " is not a valid ticket, Please enter a valid ticket.");
		}
	
	}

	private boolean validateSeat(String seatNo) {
		for (Seats eachSeat : seats) {
			if (eachSeat.getSeatNo().equals(seatNo)) {
				return true;
			}
		}
		return false;
	}

	private Seats isSeatAvailable(String seatNo) {
		for (Seats seat : availableSeats()) {
			if (seat.getSeatNo().equals(seatNo)) {
				return seat;
			}
		}
		return null;
	}
	
	List<Seats> availableSeats() {
		availableSeats.clear();
		for (Seats seat : seats) {
			if (!seat.isReserved()) {
				availableSeats.add(seat);
			}
		}
		
		return availableSeats;
	}
	
}

public class Theater {

	int rows = 10;
	int eachRowSeats = 15;
	Theatres ob = new Theatres("Ganga", rows, eachRowSeats);

	public static void main(String[] args) {
		
		Theater sol = new Theater();
		Scanner sc = new Scanner(System.in);
		
		int bt = 1;
		int ct = 2;
		int exit = 3;
		
		int input = 0;
		
		while (true) {
			
			System.out.println("\n\nWelcome to BMS, Availabe seats to book: ");
			
			sol.prapareStuff();
			
			
			System.out.println("Please choose the following: ");
			System.out.println("Book a ticket: " + bt);
			System.out.println("Cancel a ticket: " + ct);
			System.out.println("Exit: " + exit);
			input = sc.nextInt();
			
			if(input == 1) {
				System.out.println("Please enter the seatNo: ");
				sc.nextLine();
				String sn = sc.nextLine();
				sol.ob.bookTicket(sn);
			} else if (input == 2) {
				System.out.println("Please enter the seatNo: ");
				sc.nextLine();
				String sn = sc.nextLine();
				sol.ob.cancelTicket(sn);
			} else if (input == 3) {
				sc.close();
				System.out.println("Thanks for visiting BMS.");
				System.exit(0);
			}
		}

	}
	
	void prapareStuff() {
		List<Seats> avlSeats;
		
		avlSeats = ob.seats;
		int printRow = 0;
		for(Seats eachAvlSeat : avlSeats) {
			String printSeatRow = "";
				if(printRow == eachRowSeats) {
					System.out.println();
					printRow = 0;
				}
				if(eachAvlSeat.isReserved()) {
					printSeatRow = printSeatRow + "-" + " | ";
					printRow++;
				} else {
					printSeatRow = printSeatRow + eachAvlSeat.getSeatNo() + " | ";
					printRow++;					
				}
			System.out.print(printSeatRow);
		} System.out.println("\n\n\n");
	}

}
