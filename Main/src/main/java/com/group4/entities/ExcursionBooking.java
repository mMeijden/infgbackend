package com.group4.entities;

import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Excursion_booking", schema = "dbo", catalog = "OutdoorParadise")
//@IdClass(ExcursionBookingPK.class)
@Setter
public class ExcursionBooking implements Serializable{

    private Excursion excursion;
    private int excursionId;
    private int bookingId;
    private Boolean tourguide;
    private Integer participants;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Excursion_ID")
    public Excursion getExcursion(){
        return excursion;
    }

    @Id
    @Column(name = "Excursion_ID")
    public int getExcursionId() {
        return excursionId;
    }

    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
    }

    @Id
    @Column(name = "Booking_ID")
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    @Basic
    @Column(name = "Tourguide")
    public Boolean getTourguide() {
        return tourguide;
    }

    public void setTourguide(Boolean tourguide) {
        this.tourguide = tourguide;
    }

    @Basic
    @Column(name = "Participants")
    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExcursionBooking that = (ExcursionBooking) o;

        if (excursionId != that.excursionId) return false;
        if (bookingId != that.bookingId) return false;
        if (tourguide != null ? !tourguide.equals(that.tourguide) : that.tourguide != null) return false;
        if (participants != null ? !participants.equals(that.participants) : that.participants != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = excursionId;
        result = 31 * result + bookingId;
        result = 31 * result + (tourguide != null ? tourguide.hashCode() : 0);
        result = 31 * result + (participants != null ? participants.hashCode() : 0);
        return result;
    }
}
