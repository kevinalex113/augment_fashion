package com.shop.augment_fashion.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_ADDRESSES")
public class AddressModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Setter @Getter @Column(name="NID_ADDRESS")
    private int nid_address;

    @Setter @Getter @Column(name="CSTREET")
    private String cstreet;

    @Setter @Getter @Column(name="COUTDOOR_NUMBER")
    private String coutdoor_number;

    @Setter @Getter @Column(name="CINTERIOR_NUMBER")
    private String cinterior_number;

    @Setter @Getter @Column(name="CCOLOGNE")
    private String ccologne;

    @Setter @Getter @Column(name="CTOWN_HALL")
    private String ctown_hall;

    @Setter @Getter @Column(name="CSTATE")
    private String cstate;

    @Setter @Getter @Column(name="CCOUNTRY")
    private String ccountry;
    
    @Setter @Getter @Column(name="BENABLE")
    private Boolean benable;

    @Setter @Getter @Column(name="DREGISTRATION_DATE")
    @CreationTimestamp
    private LocalDateTime dregistration_date;
    
    @Setter @Getter @Column(name="DCANCELLATION_DATE")
    private LocalDateTime dcancellation_date;
}
