package com.mouritech.onlineshoppingsystem.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



@Entity
@Table(name = "cart")
public class AddToCart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cart_id")
	private long cartId;
	
	@Column(name = "content")
	private String content;


//	@OneToMany(mappedBy = "cart", fetch = FetchType.LAZY)
//	@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
//	private Set<Product> products = new HashSet<>();

	@OneToOne(cascade = CascadeType.PERSIST)
     @JoinColumn(name = "custId")
     @OnDelete(action = OnDeleteAction.CASCADE)
	private Customer customer;

	public AddToCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "AddToCart [cartId=" + cartId + ", content=" + content + ", customer=" + customer + "]";
	}

	public AddToCart(long cartId, String content) {
		super();
		this.cartId = cartId;
		this.content = content;
	}






}
