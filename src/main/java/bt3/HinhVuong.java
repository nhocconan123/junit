package bt3;

public class HinhVuong {
    private double canh=1.0;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    public double chuVi()
    {
        double cv=canh*4;
        return Math.round(cv*100)/100.0;
    }
    public double dienTich(){
        double dt= canh*canh;
        return Math.round(dt*100)/100.0;
    }
}
