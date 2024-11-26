package Aims;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public int Quatity() {
		return qtyOrdered;
	}
	public DigitalVideoDisc[] getItemsOrdered() {
		return itemsOrdered;
	}
	 public void addDigitalVideoDisc(DigitalVideoDisc disc) {
	        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	            itemsOrdered[qtyOrdered] = disc;
	            qtyOrdered++;
	            System.out.println("The disc has been added.");
	            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
	                System.out.println("The cart is almost full.");
	            }
	        } 
	        else {
	            System.out.println("The cart is full.");
	        }
	    }
	   //Nạp chồng phương thức: Thêm danh sách các DVD
	 public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) 
	 {
		 for(DigitalVideoDisc disc : dvdList) 
		 {
			 if(qtyOrdered < MAX_NUMBERS_ORDERED) 
			 {
				 itemsOrdered[qtyOrdered] = disc;
				 qtyOrdered++;
				 System.out.println("The disc " + disc.toString() + " has been added.");
			 }
			 else 
			 {
				 System.out.println("The cart is full. Cannot add "+ disc.toString() + ".");
				 break;
			 }
		 }
	 }
	 //Nạp chồng phương thức: Thêm 2 DVD cùng 1 lúc
	 public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
	        if (qtyOrdered < MAX_NUMBERS_ORDERED - 1) {
	            itemsOrdered[qtyOrdered] = dvd1;
	            qtyOrdered++;
	            System.out.println("The disc " + dvd1.toString() + " has been added.");

	            itemsOrdered[qtyOrdered] = dvd2;
	            qtyOrdered++;
	            System.out.println("The disc " + dvd2.toString() + " has been added.");
	        } else if (qtyOrdered < MAX_NUMBERS_ORDERED) {
	            itemsOrdered[qtyOrdered] = dvd1;
	            qtyOrdered++;
	            System.out.println("The disc " + dvd1.toString() + " has been added.");
	            System.out.println("The cart is full. Cannot add " + dvd2.toString() + ".");
	        } else {
	            System.out.println("The cart is full. Cannot add both discs.");
	        }
	    }
	  public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
	        boolean found = false;
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i] == disc) {
	                found = true;
	                for (int j = i; j < qtyOrdered - 1; j++) {
	                    itemsOrdered[j] = itemsOrdered[j + 1];
	                }
	                itemsOrdered[qtyOrdered - 1] = null;
	                qtyOrdered--;
	                System.out.println("The disc " +disc.toString()+" has been removed.");
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("The disc was not found in the cart.");
	        }
	    }
	      
	    public float totalCost() {
	        float total = 0;
	        for (int i = 0; i < qtyOrdered; i++) {
	            if (itemsOrdered[i] != null) {
	                total += itemsOrdered[i].getCost();
	            }
	        }
	        return total;
	    }
}
