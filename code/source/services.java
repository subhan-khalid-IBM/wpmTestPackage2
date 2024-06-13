

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class services

{
	// ---( internal utility methods )---

	final static services _instance = new services();

	static services _newInstance() { return new services(); }

	static services _cast(Object o) { return (services)o; }

	// ---( server methods )---




	public static final void test_javaService (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(test_javaService)>> ---
		// @sigtype java 3.5
		System.out.println("This is running test_javaService");
		for(int i = 0; i <=10; i++) {
			System.out.println("Number: " + i);
		}
		// --- <<IS-END>> ---

                
	}
}

