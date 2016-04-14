package com.group4.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
public class TravelHotelPK implements Serializable {
    private int travelId;
    private int hotelId;

    @Column(name = "Travel_ID")
    @Id
    public int getTravelId() {
        return travelId;
    }

    public void setTravelId(int travelId) {
        this.travelId = travelId;
    }

    @Column(name = "Hotel_ID")
    @Id
    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TravelHotelPK that = (TravelHotelPK) o;

        if (travelId != that.travelId) return false;
        if (hotelId != that.hotelId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = travelId;
        result = 31 * result + hotelId;
        return result;
    }
}
