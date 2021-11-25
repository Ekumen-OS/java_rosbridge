package ros;

import com.fasterxml.jackson.databind.JsonNode;

public interface RosServiceResponseDelegate {
    void response(JsonNode data, String stringRep);
}
