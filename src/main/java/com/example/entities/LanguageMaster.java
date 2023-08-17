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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long languageId;
    
    private String languageDesc;
    
    @OneToOne
    @JoinColumn(name = "typeId")
    private ProductTypeMaster productType;

	public String getLanguageDesc() {
		return languageDesc;
	}

	public void setLanguageDesc(String languageDesc) {
		this.languageDesc = languageDesc;
	}

	@Override
	public String toString() {
		return "LanguageMaster [languageId=" + languageId + ", languageDesc=" + languageDesc + ", productType="
				+ productType + "]";
	}
    
    // Getter and setter methods
}