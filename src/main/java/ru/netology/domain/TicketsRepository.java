package ru.netology.domain;

public class TicketsRepository {
    protected Tickets[] tickets = new Tickets[0];

    public void save(Tickets ticket) {
        int length = tickets.length + 1;
        Tickets[] tmp = new Tickets[length];
        System.arraycopy(tickets, 0, tmp, 0, tickets.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = ticket;
        tickets = tmp;
    }

    public void removeById(int id) {
        int length = tickets.length - 1;
        Tickets[] tmp = new Tickets[length];
        int index = 0;
        for (Tickets ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[index] = ticket;
                index++;
            }
        }
        tickets = tmp;

    }

    public Tickets[] findAll() {
        return tickets;
    }
}
