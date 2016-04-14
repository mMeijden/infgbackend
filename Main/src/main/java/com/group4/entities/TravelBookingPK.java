package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class TravelBookingPK implements Serializable {
    private int travelId;
    private int bookingId;

    @Column(name = "Travel_ID")
    @Id
    public int getTravelId() {
        return travelId;
    }

    public void setTravelId(int travelId) {
        this.travelId = travelId;
    }

    @Column(name = "Booking_ID")
    @Id
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelBookingPK that = (TravelBookingPK) o;

        if (travelId != that.travelId) return false;
        if (bookingId != that.bookingId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = travelId;
        result = 31 * result + bookingId;
        return result;
    }
}
