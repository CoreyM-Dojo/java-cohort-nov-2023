package com.coreym.mvcdemo.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="pizzas")
public class Pizza {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
//	@NotNull - Checks if an input was not entered 
//	@NotBlank - Trims the whitespace of the string and then checks the size
//	@NotEmpty - Checks the length of the input and makes sure it is greater than 0
	
	@NotBlank
	@Size(min=3, max=200, message="Pizza Type must be between 3 and 200 characters")
	private String pizzaType;
	
	@NotBlank
	@Size(min=3, max=200)
	private String pizzaSize;
	
	@Min(1)
	private Integer numOfToppings;
	
//	{
//		pepperoni: 1,
//		onions: 0,
//		pineapple: 0
//	}
	private String[] toppings;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public Pizza() {}

	public Pizza(@Size(min = 3, max = 200) String pizzaType, @Size(min = 3, max = 200) String pizzaSize,
			@Min(1) Integer numOfToppings) {
		this.pizzaType = pizzaType;
		this.pizzaSize = pizzaSize;
		this.numOfToppings = numOfToppings;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPizzaType() {
		return pizzaType;
	}

	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}

	public String getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public Integer getNumOfToppings() {
		return numOfToppings;
	}

	public void setNumOfToppings(Integer numOfToppings) {
		this.numOfToppings = numOfToppings;
	}
	
	

	public String[] getToppings() {
		return toppings;
	}

	public void setToppings(String[] toppings) {
		this.toppings = toppings;
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
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	
	
	

}
