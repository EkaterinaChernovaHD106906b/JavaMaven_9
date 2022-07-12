package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import ru.netology.domain.Tickets;

public class Test {
    Tickets ticket1 = new Tickets(45, 16600, "DME", "HEL", 180);
    Tickets ticket2 = new Tickets(90, 10000, "LED", "SCO", 160);
    Tickets ticket3 = new Tickets(560, 7800, "DME", "HEL", 193);
    Tickets ticket4 = new Tickets(120, 12000, "VVO", "GDZ", 210);

    @org.junit.jupiter.api.Test
    public void myTest() {
        TicketsRepository repo = new TicketsRepository();
        TicketsManager manager = new TicketsManager(repo);
        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
        Tickets[] actual = manager.findTickets("DME", "HEL");
        Tickets[] expected = {ticket3, ticket1};
        Assertions.assertArrayEquals(expected, actual);


    }

    @org.junit.jupiter.api.Test
    public void myTest2() {
        TicketsRepository repo = new TicketsRepository();
        TicketsManager manager = new TicketsManager(repo);
        repo.save(ticket1);
        repo.save(ticket2);
        repo.save(ticket3);
        Tickets[] actual = manager.findTickets("LED", "SCO");
        Tickets[] expected = {ticket2};
        Assertions.assertArrayEquals(expected, actual);


    }
}