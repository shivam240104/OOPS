public class Oops{
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setColor("red");
        System.out.println(p1.Color);

        p1.setTip(4);
        System.out.println(p1.tip);
    }
}

class Pen{
    String Color;
    int tip;

    void setColor(String newColor){
        Color= newColor;
    }

    void setTip(int newtip){
        tip=newtip;
    }
}