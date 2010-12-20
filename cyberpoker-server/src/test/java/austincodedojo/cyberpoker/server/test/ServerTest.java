package austincodedojo.cyberpoker.server.test;

import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.LowLevelAppDescriptor;

public abstract class ServerTest extends JerseyTest {

	protected static final LowLevelAppDescriptor descriptor = new LowLevelAppDescriptor.Builder("austincodedojo.cyberpoker.server").build();

	public ServerTest() throws Exception {
		super();
	}
	
	@Override
	protected AppDescriptor configure()
	{
		return descriptor;
	}
}