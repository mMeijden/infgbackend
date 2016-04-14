package com.group4.entities;

import javax.persistence.*;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Table(name = "Travel_hotel", schema = "dbo", catalog = "OutdoorParadise")
@IdClass(TravelHotelPK.class)
public class TravelHotel {
    private int travelId;
    private int hotelId;

    @Id
    @Column(name = "Travel_ID")
    public int getTravelId() {
        return travelId;
    }

    public void setTravelId(int travelId) {
        this.travelId = travelId;
    }

    @Id
    @Column(name = "Hotel_ID")
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

        TravelHotel that = (TravelHotel) o;

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
