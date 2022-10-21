package Threads;

public class POJO {
    private int x = 5;
    private String name = "Jason";

    public int getX(){ //accessor method
        return x;
    }

    public void setX (int x){
        this.x =x;
    }

    public String getName(){
        return name;
    }

    public void setValue(int x, String y){
        //mutator method
    }

    public POJO getValues(){
        return new POJO();
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        POJO p = new POJO();
        p.setX(10);

        POJO name = new POJO();
        name.setName("Jasonnnnnnnnn");
        System.out.println(p.getX() + " and "+  name.getName());
    }
}
