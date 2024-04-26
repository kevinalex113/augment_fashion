package com.shop.augment_fashion.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TBL_USER")
public class UserModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Setter @Getter @Column(name="NID_USER")
    private int nid_user;

    @Setter @Getter @Column(name="CFIRST_NAME")
    private String cfirst_name;

    @Setter @Getter @Column(name="CSURNAMES")
    private String csurnames;

    @Setter @Getter @Column(name="CNICKNAME")
    private String cnickname;

    @Setter @Getter @Column(name="CEMAIL")
    private String cemail;

    @Setter @Getter @Column(name="CPASSWORD")
    private String cpassword;

    @Setter @Getter @Column(name="NROLE")
    private int nrole;

    @Setter @Getter @Column(name="NID_ADDRESS")
    private int nid_Address;

    @Setter @Getter @Column(name="CNUMBER_CREDIT_CARD")
    private String cnumber_credit_card;
}
