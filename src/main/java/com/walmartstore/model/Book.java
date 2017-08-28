package com.walmartstore.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"category",
"format",
"nextPage",
"items"
})
public class Book {

@JsonProperty("category")
private String category;
@JsonProperty("format")
private String format;
@JsonProperty("nextPage")
private String nextPage;
@JsonProperty("items")
private List<Item> items = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("category")
public String getCategory() {
return category;
}

@JsonProperty("category")
public void setCategory(String category) {
this.category = category;
}

@JsonProperty("format")
public String getFormat() {
return format;
}

@JsonProperty("format")
public void setFormat(String format) {
this.format = format;
}

@JsonProperty("nextPage")
public String getNextPage() {
return nextPage;
}

@JsonProperty("nextPage")
public void setNextPage(String nextPage) {
this.nextPage = nextPage;
}

@JsonProperty("items")
public List<Item> getItems() {
return items;
}

@JsonProperty("items")
public void setItems(List<Item> items) {
this.items = items;
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