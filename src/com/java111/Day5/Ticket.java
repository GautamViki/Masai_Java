package com.java111.Day5;

public class Ticket {
    static int availableTickets;
    private int ticketId;
    private int price;

    public static void setAvailableTickets(int availableTickets) {
        Ticket.availableTickets = availableTickets;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int calculateTicketCost(int noOfTickets) {
        int totalPrice;
        if (availableTickets > 0) {
            totalPrice = noOfTickets * price;
            return totalPrice;
        } else {
            return -1;
        }
    }

}
