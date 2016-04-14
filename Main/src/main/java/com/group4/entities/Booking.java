package com.group4.entities;

import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by @author Matthijs van der Meijden on 13-4-2016.
 */
@Entity
@Setter
public class Booking implements Serializable {
    private int id;
    private Timestamp date;
    private String cancellationInsurance;
    private String payed;

    private Travel travel;
    private List<Excursion> excursions;

    private List<ExcursionBooking> excursionBookings;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="Booking_ID")
    public List<ExcursionBooking> getExcursionBookings(){
        return excursionBookings;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "Travel_booking",
            joinColumns = @JoinColumn(name = "Booking_ID"),
            inverseJoinColumns = @JoinColumn(name = "Travel_ID"))
    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel){
        this.travel = travel;
    }

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @Basic
    @Column(name = "Date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Cancellation_insurance")
    public String getCancellationInsurance() {
        return cancellationInsurance;
    }

    public void setCancellationInsurance(String cancellationInsurance) {
        this.cancellationInsurance = cancellationInsurance;
    }

    @Basic
    @Column(name = "Payed")
    public String getPayed() {
        return payed;
    }

    public void setPayed(String payed) {
        this.payed = payed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Booking booking = (Booking) o;

        if (id != booking.id) return false;
        if (date != null ? !date.equals(booking.date) : booking.date != null) return false;
        if (cancellationInsurance != null ? !cancellationInsurance.equals(booking.cancellationInsurance) : booking.cancellationInsurance != null)
            return false;
        if (payed != null ? !payed.equals(booking.payed) : booking.payed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (cancellationInsurance != null ? cancellationInsurance.hashCode() : 0);
        result = 31 * result + (payed != null ? payed.hashCode() : 0);
        return result;
    }
}
