package ros;

public class ServiceRequest {
    private String name;
    private RosBridge rosBridge;

    public ServiceRequest(String name, RosBridge rosBridge){
        this.name = name;
        this.rosBridge = rosBridge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void callService(RosServiceResponseDelegate onResponse, Object args){
        rosBridge.callService(name, args, onResponse);
    }
}
