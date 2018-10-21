package com.kapra.web.bo.product.details;

import java.sql.Timestamp;

/**
 * @author Karan Popat
 *
 */

public class Product {

	private Long productId;
	private String prductName;
	private String productDescription;
	private Double productMRP;
	private Double productSellPrice;
	private Double productCostPrice;
	private String barCode;
	private Double productDiscount;
	private Timestamp addedDate;
	private Timestamp sellingDate;
	private Long invoiceId;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getPrductName() {
		return prductName;
	}

	public void setPrductName(String prductName) {
		this.prductName = prductName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Double getProductMRP() {
		return productMRP;
	}

	public void setProductMRP(Double productMRP) {
		this.productMRP = productMRP;
	}

	public Double getProductSellPrice() {
		return productSellPrice;
	}

	public void setProductSellPrice(Double productSellPrice) {
		this.productSellPrice = productSellPrice;
	}

	public Double getProductCostPrice() {
		return productCostPrice;
	}

	public void setProductCostPrice(Double productCostPrice) {
		this.productCostPrice = productCostPrice;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Double getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(Double productDiscount) {
		this.productDiscount = productDiscount;
	}

	public Timestamp getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Timestamp addedDate) {
		this.addedDate = addedDate;
	}

	public Timestamp getSellingDate() {
		return sellingDate;
	}

	public void setSellingDate(Timestamp sellingDate) {
		this.sellingDate = sellingDate;
	}

	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

}
