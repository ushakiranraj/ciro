class bag {
    private String s_Name;
    private int num_of_books;
    private int num_of_pen;

    public String getName() { return s_Name; }
    public int getbooknum() { return num_of_books; }
    public int getpennum() { return num_of_pen; }

    public void setName(String newName) {s_Name = newName;}
    public void setbooknum(int newbooknum) { num_of_books = newbooknum; }
    public void setpennum(int newpennum) { num_of_pen = newpennum; }
}

public class School_Bag {
    public static void main(String[] args)
    {
        bag obj = new bag();

        obj.setName("Elon Musk");
        obj.setbooknum(6);
        obj.setpennum(9);

        System.out.println("Student Name: " + obj.getName());
        System.out.println("Number of books in bag: " + obj.getbooknum());
        System.out.println("Number of pens in bag: " + obj.getpennum());
    }
}
