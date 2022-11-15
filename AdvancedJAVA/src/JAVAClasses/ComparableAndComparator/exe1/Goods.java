package JAVAClasses.ComparableAndComparator.exe1;


public class Goods implements Comparable{
    private String name;
    private  double price;

    public Goods() {
    }


    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods){
            Goods goods = (Goods) o;
            //method1
            if (this.price > goods.price) {
                return 1;
            }else if(this.price < goods.price) {
                return -1;
            }else {
//              return 0;
                return -this.name.compareTo(goods.name); // if the price are the same, then compare goods name
            }
            //method2
//         return Double.compare(this.price,goods.price);
        }

        throw new RuntimeException("the data type doesn't match");
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
