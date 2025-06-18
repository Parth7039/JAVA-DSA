public class Circle {
    private float rad;

    public void setRad(float a){
        rad = a;
        System.out.println("Radius is set to "+a);
    }

    public float CalcArea(){
        float Area = (float) (Math.PI*Math.pow(rad,2));
        return Area;
    }

    public float CalcCircum(){
        float circum = (float) (2*Math.PI*rad);
        return circum;
    }
    public void showdata() {
        float area = CalcArea();
        float circum = CalcCircum();
        System.out.println("Area and Circumference is " +area+ " and " +circum);
    }
}
