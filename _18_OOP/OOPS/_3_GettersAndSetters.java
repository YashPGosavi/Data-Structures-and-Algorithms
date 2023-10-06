/*
Getters & Setters
Get : to return the value
Set : to modify the value
this: this keyword is used to refer to the current obiect.
 */
public class _3_GettersAndSetters {
    public static void main(String[] args) {
        ColorPen p = new ColorPen();
        p.setColor("red");
        System.out.println(p.getColor());

        p.setTip(1.2);
        System.out.println(p.getTip());
    }
}

class ColorPen {
    private String color;
    private double tip;

    void setColor(String color) {
        this.color = color;
    }

    void setTip(double tip) {
        this.tip = tip;
    }

    String getColor() {
        return color;
    }

    double getTip() {
        return tip;
    }
}
