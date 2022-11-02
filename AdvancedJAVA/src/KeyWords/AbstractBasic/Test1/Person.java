package KeyWords.AbstractBasic.Test1;

 class Person extends Creature{
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("person eats");
    }

//    public abstract void eat();

    public void walk(){
        System.out.println("person walks");
    }

     @Override
     public void breath() {
         System.out.println("Person Breath");
     }
 }
