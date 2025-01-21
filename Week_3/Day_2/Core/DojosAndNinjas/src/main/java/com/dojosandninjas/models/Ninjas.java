package com.dojosandninjas.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="ninjas")
public class Ninjas {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
		   
			
			@NotNull(message="First Name is required!")
			@Size(min=3, max=30, message="First Name must be between 3 and 30 characters")
			private String firstName;
			
			@NotNull(message="Last Name is required!")
			@Size(min=3, max=30, message="Last Name must be between 3 and 30 characters")
			private String lastName;
			
			@NotNull(message="Age is required!")
			@Min(18)
			private int age;
			
			@ManyToOne(fetch = FetchType.LAZY)
		    @JoinColumn(name="dojo")
		    private Dojo dojo;
			
			@Column(updatable=false)
		    private Date createdAt;
		    private Date updatedAt;

		    @PrePersist
		    protected void onCreate(){
		        this.createdAt = new Date();
		        this.updatedAt = new Date();
		    }
		    @PreUpdate
		    protected void onUpdate(){
		        this.updatedAt = new Date();
		    }
		    
		    public Ninjas() {}
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			
			public String getFirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public Dojo getDojo() {
				return dojo;
			}
			public void setDojo(Dojo dojo) {
				this.dojo = dojo;
			}
			public Date getCreatedAt() {
				return createdAt;
			}
			public void setCreatedAt(Date createdAt) {
				this.createdAt = createdAt;
			}
			public Date getUpdatedAt() {
				return updatedAt;
			}
			public void setUpdatedAt(Date updatedAt) {
				this.updatedAt = updatedAt;
			}
		    
		    
}
