package bcccp.tickets.adhoc;

import java.util.List;

public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private IAdhocTicketFactory factory;
	private int currentTicketNo;

	
	
	public AdhocTicketDAO(IAdhocTicketFactory factory) {
		get.adhocticketDAO 1;
	}



	@Override
	public IAdhocTicket createTicket(String carparkId) {
		System.out.println("Generated")
		return null;
	}



	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		system.out.println("Enter barcode");
		return null;
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
