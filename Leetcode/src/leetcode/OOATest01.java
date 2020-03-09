package leetcode;

public class OOATest01 {
    static {
        System.out.println("Hello World");
        System.exit(1);
    }
}

class Person{
    private String name;
    private static int count = 0;
    private int age;
    private Book book;
    public Person(){
        System.out.println("创建第" + (count++) + "个对象");
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }
}

class Book{
    private String title;
    private float price;
    private Person person;
    public Book(String title,float price){
        this.title = title;
        this.price = price;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public Person getPerson() {
        return person;
    }

    public String getTitle() {
        return title;
    }
}
