public class SinhVien {
    private String name;
    private double point;
    public SinhVien(String name, double point){
        this.name = name;
        this.point= point;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
