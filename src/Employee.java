public class Employee {
    private int age;
    private String name;
    private String designation;
    private int salary;

    public Employee(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation(){
        return  designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public void printEmployee(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return "年龄" + age + "\n" +
                "姓名" + name + "\n" +
                "职位" + designation + "\n" +
                "工资" + salary;
    }
}
