package com.example.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class LanguageMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long languageId;
    
    private String languageDesc;
    
    @OneToOne
    @JoinColumn(name = "typeId")
    private ProductTypeMaster productType;

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	public String getLanguageDesc() {
		return languageDesc;
	}

	public void setLanguageDesc(String languageDesc) {
		this.languageDesc = languageDesc;
	}

	public ProductTypeMaster getProductType() {
		return productType;
	}

	public void setProductType(ProductTypeMaster productType) {
		this.productType = productType;
	}
    
    // Getter and setter methods
}