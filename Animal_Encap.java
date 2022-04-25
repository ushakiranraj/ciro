class animal {
    private int a_Age;
    private String a_Name;
    private String a_Type;
    public int getAge() { return a_Age; }
    public String getName() { return a_Name; }
    public String getType() { return a_Type; }
    public void setAge(int newAge) { a_Age = newAge; }
    public void setName(String newName) {a_Name = newName;}
    public void setType(String newType) { a_Type = newType; }
}

public class Animal_Encap {
    public static void main(String[] args)
    {
        animal obj = new animal();
        obj.setName("Dog");
        obj.setType("Golden Retriever");
        obj.setAge(5);
        System.out.println("Name: " + obj.getName());
        System.out.println("AnimalType: " + obj.getType());
        System.out.println("Animal Age: " + obj.getAge());
    }
}