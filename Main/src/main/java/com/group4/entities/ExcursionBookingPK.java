package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class ExcursionBookingPK implements Serializable {
    private int excursionId;
    private int bookingId;

    @Column(name = "Excursion_ID")
    @Id
    public int getExcursionId() {
        return excursionId;
    }

    public void setExcursionId(int excursionId) {
        this.excursionId = excursionId;
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

        ExcursionBookingPK that = (ExcursionBookingPK) o;

        if (excursionId != that.excursionId) return false;
        if (bookingId != that.bookingId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = excursionId;
        result = 31 * result + bookingId;
        return result;
    }
}
