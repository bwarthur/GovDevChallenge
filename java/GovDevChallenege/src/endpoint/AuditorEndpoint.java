package endpoint;

import java.util.ArrayList;
import java.util.List;

import repository.AuditorRepository;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import entity.Auditor;
import entity.AuditorSearchCriteria;
import entity.AuditorWrapper;

@Api(name = "auditorEndpoint")
public class AuditorEndpoint {

    @ApiMethod(name = "putList", httpMethod = ApiMethod.HttpMethod.POST)
	public void putList(AuditorWrapper wrapper) throws Exception {
    	new AuditorRepository().putList(wrapper.getItems());
	}	
    
    @ApiMethod(name = "search", httpMethod = ApiMethod.HttpMethod.POST)
	public List<Auditor> search(AuditorSearchCriteria criteria) throws Exception {
    	System.out.println(criteria.getName());
    	return new AuditorRepository().search(criteria);
	}	    
    
    @ApiMethod(name = "clear", httpMethod = ApiMethod.HttpMethod.GET)
	public void clear() throws Exception {
    	new AuditorRepository().clear(Auditor.class);
	}	        

}
