package ros.msgs.geometry_msgs;

import ros.msgs.std_msgs.Header;

public class PoseStamped {
    public static String _TYPE = "geometry_msgs/PoseStamped";
    public static String _DEFINITION = "# A Pose with reference coordinate frame and timestamp\nHeader header\nPose pose\n";
    public Header header;
    public Pose pose;

    public PoseStamped(){}

    public PoseStamped(Header header, Pose pose){
        this.header = header;
        this.pose = pose;
    }

    public Header getHeader(){
        return this.header;
    }

    public void setHeader(Header var1){
        this.header = var1;
    }

    public Pose getPose(){
        return pose;
    }

    public void setPose(Pose var1){
        this.pose = var1;
    }
}