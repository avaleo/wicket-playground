package net.avaleo.wicket;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class PlaygroundApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return HomePage.class;
	}

}
