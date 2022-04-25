class student {
    private String s_Name;
    private int s_Roll;
    private int s_Age;
    public int getAge() { return s_Age; }
    public String getName() { return s_Name; }
    public int getRoll() { return s_Roll; }
    public void setAge(int newAge) { s_Age = newAge; }
    public void setName(String newName)
    {
        s_Name = newName;
    }
    public void setRoll(int newRoll) { s_Roll = newRoll; }
}

public class Student_Encap {
    public static void main(String[] args)
    {
        student obj = new student();
        obj.setName("abc");
        obj.setAge(10);
        obj.setRoll(1);
        System.out.println("name: " + obj.getName());
        System.out.println("age: " + obj.getAge());
        System.out.println("roll: " + obj.getRoll());
    }
}
