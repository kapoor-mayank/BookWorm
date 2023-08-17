package com.example.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "publisher_master")
public class PublisherMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private Long publisherId;
    
    @Column(name = "publisher_name")
    private String publisherName;
    
    @Column(name = "publisher_contact_no")
    private String publisherContactNo;
    
//    
//    @OneToMany(mappedBy = "productPublisher", cascade = CascadeType.PERSIST) // Adjust cascade type if needed
//    private List<ProductMaster> products;
//    // Other publisher attributes

	@Override
	public String toString() {
		return "PublisherMaster [publisherId=" + publisherId + ", publisherName=" + publisherName
				+ ", publisherContactNo=" + publisherContactNo + "]";
	}

	public Long getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherContactNo() {
		return publisherContactNo;
	}

	public void setPublisherContactNo(String publisherContactNo) {
		this.publisherContactNo = publisherContactNo;
	}
    
  
    
    
    
    
}
