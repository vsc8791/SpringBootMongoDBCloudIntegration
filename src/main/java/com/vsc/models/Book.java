package com.vsc.models;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Document(collection="book")
@Data
@AllArgsConstructor
@NoArgsConstructor	
public class Book {

	
	private String id;
	private String name;
	private String author;
	private String description;
	private String url;
	private String type;
	private String code;
	private String image;
	private String category;
	private String tags;
	private String createdDT;
	
	public Book() {
	}

	public Book(String id, String name, String author, String description, String url, String type, String code,
			String image, String category, String tags, String createdDT) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.description = description;
		this.url = url;
		this.type = type;
		this.code = code;
		this.image = image;
		this.category = category;
		this.tags = tags;
		this.createdDT = createdDT;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getCreatedDT() {
		return createdDT;
	}

	public void setCreatedDT(String createdDT) {
		this.createdDT = createdDT;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", description=" + description + ", url="
				+ url + ", type=" + type + ", code=" + code + ", image=" + image + ", category=" + category + ", tags="
				+ tags + ", createdDT=" + createdDT + "]";
	}
	
	
	
	
}
