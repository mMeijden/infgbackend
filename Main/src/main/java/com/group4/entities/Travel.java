package com.group4.entities;

import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
@Setter
public class Travel implements Serializable {
    private int id;
    private String activity;
    private Integer minParticipants;
    private Integer maxParticipants;
    private Boolean kidsAllowed;
    private Hotel hotel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Travel_hotel",
            joinColumns = @JoinColumn(name = "Travel_ID"),
            inverseJoinColumns = @JoinColumn(name = "Hotel_ID")
    )
    public Hotel getHotel() {
        return hotel;
    }

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

//    @OneToOne(mappedBy = "travel", optional = false)
//    public Booking getBooking() {
//        return booking;
//    }
//
//    public void setBooking(Booking booking) {
//        this.booking = booking;
//    }


    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Activity")
    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Basic
    @Column(name = "Min_participants")
    public Integer getMinParticipants() {
        return minParticipants;
    }

    public void setMinParticipants(Integer minParticipants) {
        this.minParticipants = minParticipants;
    }

    @Basic
    @Column(name = "Max_participants")
    public Integer getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(Integer maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    @Basic
    @Column(name = "Kids_allowed")
    public Boolean getKidsAllowed() {
        return kidsAllowed;
    }

    public void setKidsAllowed(Boolean kidsAllowed) {
        this.kidsAllowed = kidsAllowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Travel travel = (Travel) o;

        if (id != travel.id) return false;
        if (activity != null ? !activity.equals(travel.activity) : travel.activity != null) return false;
        if (minParticipants != null ? !minParticipants.equals(travel.minParticipants) : travel.minParticipants != null)
            return false;
        if (maxParticipants != null ? !maxParticipants.equals(travel.maxParticipants) : travel.maxParticipants != null)
            return false;
        if (kidsAllowed != null ? !kidsAllowed.equals(travel.kidsAllowed) : travel.kidsAllowed != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (activity != null ? activity.hashCode() : 0);
        result = 31 * result + (minParticipants != null ? minParticipants.hashCode() : 0);
        result = 31 * result + (maxParticipants != null ? maxParticipants.hashCode() : 0);
        result = 31 * result + (kidsAllowed != null ? kidsAllowed.hashCode() : 0);
        return result;
    }


}
