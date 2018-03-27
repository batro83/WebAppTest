package es.app.back;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class RestAppApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public RestAppApplication() {
//		singletons.add(new RestApp());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}

}
