package ros.msgs.geometry_msgs;

import ros.msgs.std_msgs.Header;

public class TransformStamped {
    public static String _TYPE = "geometry_msgs/TransformStamped";
    // TODO update description
    public static String _DEFINITION = "Transform";
    private Header header;
    private String child_frame_id;
    private Transform transform;

    public TransformStamped(){}

    public TransformStamped(Header header, String child_frame_id, Transform transform){
        this.header = header;
        this.child_frame_id = child_frame_id;
        this.transform = transform;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String getChild_frame_id() {
        return child_frame_id;
    }

    public void setChild_frame_id(String child_frame_id) {
        this.child_frame_id = child_frame_id;
    }

    public Transform getTransform() {
        return transform;
    }

    public void setTransform(Transform transform) {
        this.transform = transform;
    }
}
