package com.coreym.mvcdemo.models;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
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
	
	

	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="pizzas_toppings", 
			joinColumns=@JoinColumn(name="pizza_id"),
			inverseJoinColumns=@JoinColumn(name="topping_id") 
	)
	private List<Topping> toppings;
	
	
	
	public Pizza() {}

	public Pizza(@Size(min = 3, max = 200) String pizzaType, @Size(min = 3, max = 200) String pizzaSize) {
		this.pizzaType = pizzaType;
		this.pizzaSize = pizzaSize;
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
	
	
	
	public List<Topping> getToppings() {
		return toppings;
	}

	public void setToppings(List<Topping> toppings) {
		this.toppings = toppings;
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
