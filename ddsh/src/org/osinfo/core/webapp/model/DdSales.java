package org.osinfo.core.webapp.model;

import java.sql.Timestamp;

/**
 * DdSales entity. @author MyEclipse Persistence Tools
 */

public class DdSales implements java.io.Serializable {

	// Fields

	private Integer id;
	private String transaction;
	private String barcode;
	private Float discount;
	private Integer amount;
	private String operator;
	private Timestamp date;

	// Constructors

	/** default constructor */
	public DdSales() {
	}

	/** minimal constructor */
	public DdSales(String transaction, String barcode, Float discount,
			Integer amount) {
		this.transaction = transaction;
		this.barcode = barcode;
		this.discount = discount;
		this.amount = amount;
	}

	/** full constructor */
	public DdSales(String transaction, String barcode, Float discount,
			Integer amount, String operator, Timestamp date) {
		this.transaction = transaction;
		this.barcode = barcode;
		this.discount = discount;
		this.amount = amount;
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

	public String getTransaction() {
		return this.transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

	public String getBarcode() {
		return this.barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Float getDiscount() {
		return this.discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
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