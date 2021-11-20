package ros.msgs.geometry_msgs;

public class Quaternion {
    public static String _TYPE = "geometry_msgs/Quaternion";
    public static String _DEFINITION = "# This represents an orientation in free space in quaternion form.\n\nfloat64 x\nfloat64 y\nfloat64 z\nfloat64 w\n";
    double x;
    double y;
    double z;
    double w;

    public Quaternion(){}

    public Quaternion(double x, double y, double z, double w){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public double getX(){
        return x;
    }

    public void setX(double var1){
        this.x = var1;
    }

    public double getY(){
        return y;
    }

    public void setY(double var1){
        this.y = var1;
    }

    public double getZ(){
        return z;
    }

    public void setZ(double var1){
        this.z = var1;
    }

    public double getW(){
        return w;
    }

    public void setW(double var1){
        this.w = var1;
    }
}