
public class Shirt {
  public int shirtID = 42; // номер моделі сорочки
  public String description = "Стильна бавовняна сорочка"; // опис сорочки
  // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
  public char colorCode = 'B';
  public String color; // текстовий опис кольору
  public double price = 29.99; // вартість сорочки
  public int quantityInStock = 100; // кількість на складі
  
  // метод, що повертає назву кольору за кодом
  public String getColorString() {
    switch(colorCode) {
      case 'R': return "red";
      case 'B': return "blue";
      case 'G': return "green";
      default: return "unset";
    }
  }
  
  // метод, що виводить всю інформацію про сорочку на екран
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Color: " + getColorString());
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  }
}
