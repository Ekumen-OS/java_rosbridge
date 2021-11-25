package tests;

import ros.*;
import ros.msgs.geometry_msgs.Quaternion;
import ros.msgs.geometry_msgs.Transform;
import ros.msgs.geometry_msgs.TransformStamped;
import ros.msgs.geometry_msgs.Vector3;
import ros.msgs.std_msgs.Header;

public class RosServiceCallTest {

	private static class SyncFramesRequestArg {
		private TransformStamped transform;

		public SyncFramesRequestArg(TransformStamped transform){
			this.transform = transform;
		}

		public TransformStamped getTransform() {
			return transform;
		}

		public void setTransform(TransformStamped transform) {
			this.transform = transform;
		}
	}

	public static void main(String[] args) {

		if(args.length != 1){
			System.out.println("Need the rosbridge websocket URI provided as argument. For example:\n\tws://localhost:9090");
			System.exit(0);
		}

		RosBridge bridge = new RosBridge();
		bridge.connect(args[0], true);
		Transform transform = new Transform(new Vector3(0, 0, 0), new Quaternion(0, 0, 0, 0));
		Header header = new Header(0, null, "");
		SyncFramesRequestArg arg = new SyncFramesRequestArg(new TransformStamped(header, "", transform));
		ServiceRequest request = new ServiceRequest("/arnav/sync_frames", bridge);
		RosServiceResponseDelegate responseDelegate = (data, stringRep) -> System.out.println(stringRep);
		request.callService(responseDelegate, arg);
	}

}
