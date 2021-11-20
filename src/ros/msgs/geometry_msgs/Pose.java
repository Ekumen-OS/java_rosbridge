package ros.msgs.geometry_msgs;

public class Pose {
    public static String _TYPE = "geometry_msgs/Pose";
    public static String _DEFINITION = "# A representation of pose in free space, composed of position and orientation. \nPoint position\nQuaternion orientation\n";
    public Point position;
    public Quaternion orientation;

    public Pose(){}

    public Pose(Point position, Quaternion orientation){
        this.position = position;
        this.orientation = orientation;
    }

    public Point getPosition(){
        return position;
    }

    public void setPosition(Point var1){
        this.position = var1;
    }

    public Quaternion getOrientation(){
        return orientation;
    }

    public void setOrientation(Quaternion var1){
        this.orientation = var1;
    }
}