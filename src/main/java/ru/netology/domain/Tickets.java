package ru.netology.domain;

import java.util.Objects;

public class Tickets implements Comparable<Tickets> {
    private int id;
    private int price;
    private String departureAirport;
    private String arrivalAirport;
    private int time;

    public Tickets(int id, int price, String departureAirport, String arrivalAirport, int time) {
        this.id = id;
        this.price = price;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public int compareTo(Tickets ticket) {
        if (price < ticket.price) {
            return -1;
        }
        if (price > ticket.price) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tickets tickets = (Tickets) o;
        return id == tickets.id && price == tickets.price && time == tickets.time && Objects.equals(departureAirport, tickets.departureAirport) && Objects.equals(arrivalAirport, tickets.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, departureAirport, arrivalAirport, time);
    }
}

