package oop1;
                                                                    // class adlandırmaları PascalCase yazılır
public class Product {
 
 private String name;                                                      // field (alan) lar camelCase yazılır
 private double unitPrice;
 private double discount;                                          //private sadece o class içinde kullanılabilir demektir
 private String imageUrl;                                          
 private int unitsInStock;
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}
public int getUnitsInStock() {
	return unitsInStock;
}
public void setUnitsInStock(int unitsInStock) {
	this.unitsInStock = unitsInStock;
}
 
 
 
}
