package timbalucha;

public class Tes {
    int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        Tes t = new Tes();
        t.setMarks(90);
        System.out.println(t.marks);
    }
}
