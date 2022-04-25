class vehicle {
    private String v_Name;
    private int v_Model_Num;
    private String v_Reg_Num;
    public String getName() { return v_Name; }
    public int getMN() { return v_Model_Num; }
    public String getRN() { return v_Reg_Num; }
    public void setName(String newName) {v_Name = newName;}
    public void setMN(int newMN) { v_Model_Num = newMN; }
    public void setRN(String newRN) { v_Reg_Num = newRN; }
}

public class Vehicle_Encap {
    public static void main(String[] args)
    {
        vehicle obj = new vehicle();
        obj.setName("BMW");
        obj.setMN(2);
        obj.setRN("XY 12 Z 3456");
        System.out.println("Vehicle Name: " + obj.getName());
        System.out.println("Vehicle Model Number: " + obj.getMN());
        System.out.println("Vehicle Registration Number: " + obj.getRN());
    }
}
