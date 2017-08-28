package com.walmartstore.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"itemId",
"parentItemId",
"name",
"msrp",
"salePrice",
"categoryPath",
"shortDescription",
"longDescription",
"thumbnailImage",
"mediumImage",
"largeImage",
"productTrackingUrl",
"ninetySevenCentShipping",
"standardShipRate",
"twoThreeDayShippingRate",
"overnightShippingRate",
"marketplace",
"shipToStore",
"freeShipToStore",
"productUrl",
"categoryNode",
"bundle",
"isbn",
"clearance",
"preOrder",
"stock",
"addToCartUrl",
"affiliateAddToCartUrl",
"freeShippingOver50Dollars",
"maxItemsInOrder",
"availableOnline"
})
public class Item {

@JsonProperty("itemId")
private long itemId;
@JsonProperty("parentItemId")
private long parentItemId;
@JsonProperty("name")
private String name;
@JsonProperty("msrp")
private double msrp;
@JsonProperty("salePrice")
private double salePrice;
@JsonProperty("categoryPath")
private String categoryPath;
@JsonProperty("shortDescription")
private String shortDescription;
@JsonProperty("longDescription")
private String longDescription;
@JsonProperty("thumbnailImage")
private String thumbnailImage;
@JsonProperty("mediumImage")
private String mediumImage;
@JsonProperty("largeImage")
private String largeImage;
@JsonProperty("productTrackingUrl")
private String productTrackingUrl;
@JsonProperty("ninetySevenCentShipping")
private boolean ninetySevenCentShipping;
@JsonProperty("standardShipRate")
private double standardShipRate;
@JsonProperty("twoThreeDayShippingRate")
private double twoThreeDayShippingRate;
@JsonProperty("overnightShippingRate")
private double overnightShippingRate;
@JsonProperty("marketplace")
private boolean marketplace;
@JsonProperty("shipToStore")
private boolean shipToStore;
@JsonProperty("freeShipToStore")
private boolean freeShipToStore;
@JsonProperty("productUrl")
private String productUrl;
@JsonProperty("categoryNode")
private String categoryNode;
@JsonProperty("bundle")
private boolean bundle;
@JsonProperty("isbn")
private String isbn;
@JsonProperty("clearance")
private boolean clearance;
@JsonProperty("preOrder")
private boolean preOrder;
@JsonProperty("stock")
private String stock;
@JsonProperty("addToCartUrl")
private String addToCartUrl;
@JsonProperty("affiliateAddToCartUrl")
private String affiliateAddToCartUrl;
@JsonProperty("freeShippingOver50Dollars")
private boolean freeShippingOver50Dollars;
@JsonProperty("maxItemsInOrder")
private long maxItemsInOrder;
@JsonProperty("availableOnline")
private boolean availableOnline;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("itemId")
public long getItemId() {
return itemId;
}

@JsonProperty("itemId")
public void setItemId(long itemId) {
this.itemId = itemId;
}

@JsonProperty("parentItemId")
public long getParentItemId() {
return parentItemId;
}

@JsonProperty("parentItemId")
public void setParentItemId(long parentItemId) {
this.parentItemId = parentItemId;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("msrp")
public double getMsrp() {
return msrp;
}

@JsonProperty("msrp")
public void setMsrp(double msrp) {
this.msrp = msrp;
}

@JsonProperty("salePrice")
public double getSalePrice() {
return salePrice;
}

@JsonProperty("salePrice")
public void setSalePrice(double salePrice) {
this.salePrice = salePrice;
}

@JsonProperty("categoryPath")
public String getCategoryPath() {
return categoryPath;
}

@JsonProperty("categoryPath")
public void setCategoryPath(String categoryPath) {
this.categoryPath = categoryPath;
}

@JsonProperty("shortDescription")
public String getShortDescription() {
return shortDescription;
}

@JsonProperty("shortDescription")
public void setShortDescription(String shortDescription) {
this.shortDescription = shortDescription;
}

@JsonProperty("longDescription")
public String getLongDescription() {
return longDescription;
}

@JsonProperty("longDescription")
public void setLongDescription(String longDescription) {
this.longDescription = longDescription;
}

@JsonProperty("thumbnailImage")
public String getThumbnailImage() {
return thumbnailImage;
}

@JsonProperty("thumbnailImage")
public void setThumbnailImage(String thumbnailImage) {
this.thumbnailImage = thumbnailImage;
}

@JsonProperty("mediumImage")
public String getMediumImage() {
return mediumImage;
}

@JsonProperty("mediumImage")
public void setMediumImage(String mediumImage) {
this.mediumImage = mediumImage;
}

@JsonProperty("largeImage")
public String getLargeImage() {
return largeImage;
}

@JsonProperty("largeImage")
public void setLargeImage(String largeImage) {
this.largeImage = largeImage;
}

@JsonProperty("productTrackingUrl")
public String getProductTrackingUrl() {
return productTrackingUrl;
}

@JsonProperty("productTrackingUrl")
public void setProductTrackingUrl(String productTrackingUrl) {
this.productTrackingUrl = productTrackingUrl;
}

@JsonProperty("ninetySevenCentShipping")
public boolean isNinetySevenCentShipping() {
return ninetySevenCentShipping;
}

@JsonProperty("ninetySevenCentShipping")
public void setNinetySevenCentShipping(boolean ninetySevenCentShipping) {
this.ninetySevenCentShipping = ninetySevenCentShipping;
}

@JsonProperty("standardShipRate")
public double getStandardShipRate() {
return standardShipRate;
}

@JsonProperty("standardShipRate")
public void setStandardShipRate(double standardShipRate) {
this.standardShipRate = standardShipRate;
}

@JsonProperty("twoThreeDayShippingRate")
public double getTwoThreeDayShippingRate() {
return twoThreeDayShippingRate;
}

@JsonProperty("twoThreeDayShippingRate")
public void setTwoThreeDayShippingRate(double twoThreeDayShippingRate) {
this.twoThreeDayShippingRate = twoThreeDayShippingRate;
}

@JsonProperty("overnightShippingRate")
public double getOvernightShippingRate() {
return overnightShippingRate;
}

@JsonProperty("overnightShippingRate")
public void setOvernightShippingRate(double overnightShippingRate) {
this.overnightShippingRate = overnightShippingRate;
}

@JsonProperty("marketplace")
public boolean isMarketplace() {
return marketplace;
}

@JsonProperty("marketplace")
public void setMarketplace(boolean marketplace) {
this.marketplace = marketplace;
}

@JsonProperty("shipToStore")
public boolean isShipToStore() {
return shipToStore;
}

@JsonProperty("shipToStore")
public void setShipToStore(boolean shipToStore) {
this.shipToStore = shipToStore;
}

@JsonProperty("freeShipToStore")
public boolean isFreeShipToStore() {
return freeShipToStore;
}

@JsonProperty("freeShipToStore")
public void setFreeShipToStore(boolean freeShipToStore) {
this.freeShipToStore = freeShipToStore;
}

@JsonProperty("productUrl")
public String getProductUrl() {
return productUrl;
}

@JsonProperty("productUrl")
public void setProductUrl(String productUrl) {
this.productUrl = productUrl;
}

@JsonProperty("categoryNode")
public String getCategoryNode() {
return categoryNode;
}

@JsonProperty("categoryNode")
public void setCategoryNode(String categoryNode) {
this.categoryNode = categoryNode;
}

@JsonProperty("bundle")
public boolean isBundle() {
return bundle;
}

@JsonProperty("bundle")
public void setBundle(boolean bundle) {
this.bundle = bundle;
}

@JsonProperty("isbn")
public String getIsbn() {
return isbn;
}

@JsonProperty("isbn")
public void setIsbn(String isbn) {
this.isbn = isbn;
}

@JsonProperty("clearance")
public boolean isClearance() {
return clearance;
}

@JsonProperty("clearance")
public void setClearance(boolean clearance) {
this.clearance = clearance;
}

@JsonProperty("preOrder")
public boolean isPreOrder() {
return preOrder;
}

@JsonProperty("preOrder")
public void setPreOrder(boolean preOrder) {
this.preOrder = preOrder;
}

@JsonProperty("stock")
public String getStock() {
return stock;
}

@JsonProperty("stock")
public void setStock(String stock) {
this.stock = stock;
}

@JsonProperty("addToCartUrl")
public String getAddToCartUrl() {
return addToCartUrl;
}

@JsonProperty("addToCartUrl")
public void setAddToCartUrl(String addToCartUrl) {
this.addToCartUrl = addToCartUrl;
}

@JsonProperty("affiliateAddToCartUrl")
public String getAffiliateAddToCartUrl() {
return affiliateAddToCartUrl;
}

@JsonProperty("affiliateAddToCartUrl")
public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
this.affiliateAddToCartUrl = affiliateAddToCartUrl;
}

@JsonProperty("freeShippingOver50Dollars")
public boolean isFreeShippingOver50Dollars() {
return freeShippingOver50Dollars;
}

@JsonProperty("freeShippingOver50Dollars")
public void setFreeShippingOver50Dollars(boolean freeShippingOver50Dollars) {
this.freeShippingOver50Dollars = freeShippingOver50Dollars;
}

@JsonProperty("maxItemsInOrder")
public long getMaxItemsInOrder() {
return maxItemsInOrder;
}

@JsonProperty("maxItemsInOrder")
public void setMaxItemsInOrder(long maxItemsInOrder) {
this.maxItemsInOrder = maxItemsInOrder;
}

@JsonProperty("availableOnline")
public boolean isAvailableOnline() {
return availableOnline;
}

@JsonProperty("availableOnline")
public void setAvailableOnline(boolean availableOnline) {
this.availableOnline = availableOnline;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}