package BusResv;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity; //get and set
	
	Bus(int no,boolean ac,int cap){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	public int getBusNo(){ //accessor method
		return busNo;
	}	
	
	public boolean isAc(){
		return ac;
	}
	
	public int getCapacity(){ //accessor method
		return capacity;
	}
	
	public void setAc(boolean val) { //mutators
		ac = val;
	}
	public void setCapacity(int cap) { //mutator method
		capacity = cap;
	}
	public void displayBusInfo(){
		   System.out.println("Bus No:" + busNo + "Ac:" + ac + "Total capacity:" + capacity);	
	     }	
    }


