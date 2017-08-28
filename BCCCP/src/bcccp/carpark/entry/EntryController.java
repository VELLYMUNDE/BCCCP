package bcccp.carpark.entry;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.ICarparkObserver;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class EntryController 
		implements ICarSensorResponder,
				   ICarparkObserver,
		           IEntryController {
	
	private IGate entryGate;
	private ICarSensor outsideSensor; 
	private ICarSensor insideSensor;
	private IEntryUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long entryTime;
	private String seasonTicketId = null;
	
	

	public EntryController(Carpark carpark, IGate entryGate, 
			ICarSensor os, 
			ICarSensor is,
			IEntryUI ui) {
		//TODO Implement constructor
	}



	@Override
	public void buttonPushed() {
		system.out.println("Push button");
		
	}



	@Override
	public void ticketInserted(String barcode) {
		system.out.println("Insert ticket");
		
	}



	@Override
	public void ticketTaken() {
		system.out.println("Take your ticket");
		
	}



	@Override
	public void notifyCarparkEvent() {
		system.out.println("Entry recorded");
		
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		// TODO Auto-generated method stub
		
	}

	
	
}
