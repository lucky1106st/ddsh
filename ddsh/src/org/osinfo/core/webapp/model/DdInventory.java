package org.osinfo.core.webapp.model;

import java.sql.Timestamp;

/**
 * DdInventory entity. @author MyEclipse Persistence Tools
 */

public class DdInventory implements java.io.Serializable {

	// Fields

	private Integer id;
	private String barcode;
	private Integer amount;
	private Float discount;
	private String operator;
	private Timestamp date;

	// Constructors

	/** default constructor */
	public DdInventory() {
	}

	/** minimal constructor */
	public DdInventory(String barcode, Integer amount) {
		this.barcode = barcode;
		this.amount = amount;
	}

	/** full constructor */
	public DdInventory(String barcode, Integer amount, Float discount,
			String operator, Timestamp date) {
		this.barcode = barcode;
		this.amount = amount;
		this.discount = discount;
		this.operator = operator;
		this.date = date;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Float getDiscount() {
		return this.discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

}