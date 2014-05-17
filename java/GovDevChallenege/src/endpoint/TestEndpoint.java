package endpoint;

import java.util.ArrayList;
import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

@Api(name = "testEndpoint")
public class TestEndpoint {
	
    @ApiMethod(name = "test")
	public List<String> test() throws Exception {
    	List<String> stringList = new ArrayList<>();
    	
    	stringList.add("test");
    	return stringList;
	}	
	
}
