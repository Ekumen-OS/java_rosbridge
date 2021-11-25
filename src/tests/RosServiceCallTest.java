package tests;

import com.fasterxml.jackson.databind.JsonNode;
import ros.*;
import ros.msgs.std_msgs.PrimitiveMsg;
import ros.tools.MessageUnpacker;

public class RosServiceCallTest {

	public static void main(String[] args) {

		if(args.length != 1){
			System.out.println("Need the rosbridge websocket URI provided as argument. For example:\n\tws://localhost:9090");
			System.exit(0);
		}

		RosBridge bridge = new RosBridge();
		bridge.connect(args[0], true);

		ServiceRequest request = new ServiceRequest("/rosout/get_loggers", null);
		RosServiceResponseDelegate responseDelegate = (data, stringRep) -> System.out.println(stringRep);
		bridge.callService(request, responseDelegate);
	}

}
