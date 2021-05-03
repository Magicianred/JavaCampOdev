package gameDemo;

public class Game {
private int id;
private int price;
private String name;
private String category;

public Game() {
	
}

public Game(int id, int price, String nickName, String category) {
	super();
	this.id = id;
	this.price = price;
	this.name = nickName;
	this.category = category;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getNickName() {
	return name;
}

public void setname(String name) {
	this.name = name;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}
}
