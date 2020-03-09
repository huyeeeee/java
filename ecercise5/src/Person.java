public class Person {
    private String name;
    private String sex;
    private int age;
    private Height height;

    //constructor
    public Person(){
        name = null;
        sex = null;
        age = 0;
        height = null;
    }
    public Person(String name,String sex,int age,Height height){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.height = height;
    }

    //setter and getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Height getHeight() {
        return height;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     *
     * @return a person's basic information
     */
    @Override
    public String toString() {
        return "name: "+name+"\n"+
                "sex: "+sex+"\n"+
                "age: "+age+"\n"+
                "height: "+height.toString()+"\n";
    }
}
