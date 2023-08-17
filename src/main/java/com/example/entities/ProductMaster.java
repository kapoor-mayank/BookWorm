package com.example.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;



@Entity
public class ProductMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    
    private String productName;
    private String productEnglishName;
    
    @OneToOne
    @JoinColumn(name = "typeId")
    private ProductTypeMaster productType;
    
    private double productBasePrice;
    private double productSpCost;
    private double productOfferPrice;
    private Date productOffPriceExpiryDate;
    
    private String productDescriptionShort;
    private String productDescriptionLong;
    private String productISBN;
    private String productAuthor;
    
    @ManyToOne
    @JoinColumn(name = "productPublisher")
    private PublisherMaster productPublisher;

    
    @ManyToOne
    @JoinColumn(name = "productLang")
    private LanguageMaster productLang;
    
    @ManyToOne
    @JoinColumn(name = "productGenre")
    private GenreMaster productGenre;
    
    private boolean isRentable;
    private boolean isLibrary;
    private double rentPerDay;
    private double minRentDays;
    
    // Getter and setter methods
}
