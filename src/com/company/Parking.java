package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Parking {
    final static int AMOUNT_OF_PLACE = 100;
    public static int AMOUNT_OF_CAR = 0;

    public ArrayList<Ticket> ticketList = new ArrayList<Ticket>(100);

    public Parking(){ }

    public int AmountOfFreePlaces(){
        return AMOUNT_OF_PLACE - AMOUNT_OF_CAR;
    }

    public void FindOwnerByMonthPayment(){
        Iterator iterator = this.ticketList.iterator();

        while(iterator.hasNext()) {
            Ticket ticket = (Ticket) iterator.next();
            if(ticket.GetPaidMonth() == false)
                System.out.println(ticket);
        }
    }

    public Parking RemoveFromBaseByLastName(String lastName){
        Parking result = new Parking();
        Iterator iterator = this.ticketList.iterator();

        while(iterator.hasNext()) {
            Ticket ticket = (Ticket) iterator.next();
            if(!ticket.GetOwner().toString().contains(lastName))
                result.ticketList.add(ticket);
            else
                System.out.println(ticket);
        }

        return result;
    }



}
