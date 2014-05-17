package endpoint;

import java.util.ArrayList;
import java.util.List;

import repository.AuditorRepository;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import entity.AuditorWrapper;

@Api(name = "auditorEndpoint")
public class AuditorEndpoint {

    @ApiMethod(name = "putList")
	public void putList(AuditorWrapper wrapper) throws Exception {
    	new AuditorRepository().putList(wrapper.getItems());
	}	

}
