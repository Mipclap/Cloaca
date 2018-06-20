import java.util.LinkedList;
import java.util.List;

public class Products {
    private String product;
    private int weight;
    private String deliveryDate;
    private String expirationDate;
    private String country;
    private double price;
    static public List<Products> list;



    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void infoFilter(String input) {

        for (Products p : list) {
            if (input.equals(p.getDeliveryDate())) {
                System.out.println(p);

            } else if (input.equals(p.getCountry())) {
                System.out.println(p);
            }
        }
    }

    public static void infoFilter(double input) {
        for (Products p : list) {

            if (input == p.getPrice()) {
                System.out.println(p);

            } else if (input == p.getWeight()) {
                System.out.println(p);
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("product - " + getProduct() + "\n");
        sb.append("weight - " + getWeight() + "\n");
        sb.append("delivery date - " + getDeliveryDate() + "\n");
        sb.append("expiration date - " + getExpirationDate() + "\n");
        sb.append("price - " + getPrice() + "\n");
        sb.append("country - " + getCountry() + "\n");
        return sb.toString();
    }
}
