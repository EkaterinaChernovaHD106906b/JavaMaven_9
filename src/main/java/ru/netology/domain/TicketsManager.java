package ru.netology.domain;

import java.util.Arrays;

public class TicketsManager {
    protected TicketsRepository repo;

    public TicketsManager(TicketsRepository repo) {
        this.repo = repo;
    }

    public void add(Tickets ticket) {
        repo.save(ticket);
    }

    public boolean matches(Tickets ticket, String from, String to) {
        if (ticket.getDepartureAirport().contains(from) && ticket.getArrivalAirport().contains(to)) {
            return true;
        } else {
            return false;
        }
    }

    public Tickets[] findTickets(String from, String to) {
        Tickets[] ans = new Tickets[0];
        for (Tickets ticket : repo.findAll()) {
            if (matches(ticket, from, to)) {
                Tickets[] tmp = new Tickets[ans.length + 1];
                for (int i = 0; i < ans.length; i++) {
                    tmp[i] = ans[i];
                }
                tmp[tmp.length - 1] = ticket;
                ans = tmp;

            }

        }
        Arrays.sort(ans);
        return ans;
    }
}
