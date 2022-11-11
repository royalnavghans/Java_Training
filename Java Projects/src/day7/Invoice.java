package day7;

import java.util.Scanner;

class Invoice1{
	 String Part;
	 String Description;
	 int Quantity;
	 double Price;
	
	Invoice1(String Part, String Description,int Quantity,double Price){
		this.Part=Part;
		this.Description=Description;
		this.Quantity=Quantity;
		this.Price=Price;
		 
	}
public String getPart() {
		return Part;
	}

	public void setPart(String part) {
		Part = part;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		if(Quantity>0) {
			Quantity = quantity;	
		}
		else {
			Quantity=0;
		}
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		if(Price>0) {
			Price = price;	
		}
		else {
			Price=0.0;
		}
	
	}
	public double getInvoiceAmount() {
		double invoiceAmount = 0;
		if(Price>0) {
		invoiceAmount=Quantity*Price;
		}
		else if(Price<0) {
			invoiceAmount=0;
		}
		return invoiceAmount;
		
	} 
}


public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Invoice1 obj=new Invoice1("ABC123","Good/Bad",25,25);
System.out.println("Part No : "+obj.getPart()+"; Description : "+obj.getDescription()+"; Quantity : "+obj.getQuantity()+"; Price : "+obj.getPrice());;

Scanner sc =new Scanner(System.in);
System.out.println("Enter Quantity : ");
int Qua =sc.nextInt();
System.out.println("Enter price per Item : ");
int Pri =sc.nextInt();
obj.setPart("XYZ123");
obj.setDescription("Good");
obj.setQuantity(Qua);
obj.setPrice(Pri);
System.out.println("Part No : "+obj.getPart()+";\nDescription : "+obj.getDescription()+";\nQuantity : "+obj.getQuantity()+";\nPrice per Item : "+obj.getPrice()+";\nInvoice Amount : "+obj.getInvoiceAmount());;
	}

}
