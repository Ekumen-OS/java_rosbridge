package ros.msgs.geometry_msgs;

public class Point {
    public static String _TYPE = "geometry_msgs/Point";
    public static String _DEFINITION = "# This contains the position of a point in free space\nfloat64 x\nfloat64 y\nfloat64 z\n";
    public double x;
    public double y;
    public double z;

    public Point(){}

    public Point(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
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
}
