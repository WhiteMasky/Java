public class Puppy {

    private String name;
    //若没有显式构造方法则会有一个默认的无参构造方法
    public Puppy(){

    }

    public Puppy(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Puppy dog = new Puppy("Tommy");
        System.out.println(dog.name);
    }
}
