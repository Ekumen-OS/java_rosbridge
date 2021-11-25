package ros;

public class ServiceRequest {
    private String name;
    private Object args;

    public ServiceRequest(String name, Object args){
        this.name = name;
        this.args = args;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getArgs() {
        return args;
    }

    public void setArgs(Object args) {
        this.args = args;
    }
}
