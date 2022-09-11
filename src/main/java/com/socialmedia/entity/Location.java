package com.socialmedia.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Locations")
public class Location extends BaseEntity {
	private String city;
	private String state;
	private String zipCode;
	private String country;
	@OneToOne(mappedBy = "location", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
    private UserProfile userProfile;
}
