//27-28.ders
public class Main {
public static void main(String[]  args) {
	CustomerManager customerManager = new CustomerManager(); //class bu sek�lde cag�r�l�r.Classlar referans tiptir.
	CustomerManager customerManager2 = new CustomerManager();
	customerManager = customerManager2;
	customerManager.Add();
	customerManager.Remove();
	customerManager.Update();
}


}
