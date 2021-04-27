package classesWithAttrilbutes; //31-34.videolar

public class Main {
	public static void main(String[] args) {
		Product product = new Product(2, "", "", 1000, 5, "Abc");
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());
//bir classýn içinde baþka klaslarda kullanýlabilir
	}

}