package com.company;

import java.util.Iterator;

public class Main {

    static Parking parking = new Parking();

    public static void main(String[] args) {
        parking.ticketList.add(new Ticket(new Owner("Egor", "Dudzin"), "Mercedes-Benz AMG GT", true, false));
        parking.ticketList.add(new Ticket(new Owner("Ruslan", "Varvar"), "Mercedes-Benz AMG GT", true, true));
        parking.ticketList.add(new Ticket(new Owner("Sanya", "Veter"), "Mercedes-Benz AMG GT", false, true));

        Iterator iterator = parking.ticketList.iterator();

        while(iterator.hasNext()){
            Ticket ticket1 = (Ticket) iterator.next();
            System.out.println(ticket1);
        }

        System.out.println("Free parking spaces: " + parking.AmountOfFreePlaces() + "\n");
        parking.FindOwnerByMonthPayment();
        parking.RemoveFromBaseByLastName("Dudzin");
    }
}
