package com.group4.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by @author Matthijs van der Meijden on 11-4-2016.
 */
@Entity
public class Product {
    private int id;
    private String name;
    private String size;
    private String color;
    private String image;
    private BigDecimal price;
    private BigDecimal cost;
    private Timestamp introductionDate;
    private Double margin;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "cost")
    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Basic
    @Column(name = "introduction_date")
    public Timestamp getIntroductionDate() {
        return introductionDate;
    }

    public void setIntroductionDate(Timestamp introductionDate) {
        this.introductionDate = introductionDate;
    }

    @Basic
    @Column(name = "margin")
    public Double getMargin() {
        return margin;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (size != null ? !size.equals(product.size) : product.size != null) return false;
        if (color != null ? !color.equals(product.color) : product.color != null) return false;
        if (image != null ? !image.equals(product.image) : product.image != null) return false;
        if (price != null ? !price.equals(product.price) : product.price != null) return false;
        if (cost != null ? !cost.equals(product.cost) : product.cost != null) return false;
        if (introductionDate != null ? !introductionDate.equals(product.introductionDate) : product.introductionDate != null)
            return false;
        if (margin != null ? !margin.equals(product.margin) : product.margin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (introductionDate != null ? introductionDate.hashCode() : 0);
        result = 31 * result + (margin != null ? margin.hashCode() : 0);
        return result;
    }
}
