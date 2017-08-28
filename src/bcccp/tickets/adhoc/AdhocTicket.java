package bcccp.tickets.adhoc;

import java.util.Date;

public class AdhocTicket implements IAdhocTicket {
	
	private String carparkId;
	private int ticketNo;
	private long entryDateTime;
	private long paidDateTime;
	private long exitDateTime;
	private float charge;
	private String barcode;

	
	
	public AdhocTicket(String carparkId, int ticketNo, String barcode) {
		System.out.println("data types ")
	}


	@Override
	public int getTicketNo() {
		System.out.println("enter ticket number");


	@Override
	public String getBarcode() {
		System.out.println("enter barcode")
}


	@Override
	public String getCarparkId() {
                  System.out.println("enter car parkld");
	}


	@Override
	public void enter(long dateTime) {
		system.out.println("enter date");
		
	}


	@Override
	public long getEntryDateTime() {
                  System.out.println("enter ticket date and time");
	}


	@Override
	public boolean isCurrent() {
		System.out.println("boolean type")
                  return false;
	}


	@Override
	public void pay(long dateTime, float charge) {
		System.out.println("Enter float charge");
		
	}


	@Override
	public long getPaidDateTime() {
		System.out.println("date and time of entry")	return 0;
	}


	@Override
	public boolean isPaid() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public float getCharge() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void exit(long dateTime) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public long getExitDateTime() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean hasExited() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
