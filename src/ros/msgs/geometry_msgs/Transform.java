package ros.msgs.geometry_msgs;

public class Transform {
    public static String _TYPE = "geometry_msgs/Transform";
    public static String _DEFINITION = "# This represents the transform between two coordinate frames in free space.\n\nVector3 translation\nQuaternion rotation\n";
    public Vector3 translation;
    public Quaternion rotation;

    public Transform(){}

    public Transform(Vector3 translation, Quaternion rotation){
        this.translation = translation;
        this.rotation = rotation;
    }

    public Vector3 getTranslation(){
        return translation;
    }

    public void setTranslation(Vector3 var1){
        this.translation = var1;
    }

    public Quaternion getRotation(){
        return rotation;
    }

    public void setRotation(Quaternion var1){
        this.rotation = var1;
    }
}