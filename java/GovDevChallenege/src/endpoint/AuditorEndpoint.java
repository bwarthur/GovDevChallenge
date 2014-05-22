package endpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

import repository.AuditorRepository;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.response.CollectionResponse;

import entity.Auditor;
import entity.AuditorEndpointResult;
import entity.AuditorSearchCriteria;
import entity.AuditorWrapper;

@Api(name = "auditorEndpoint")
public class AuditorEndpoint {

    @ApiMethod(name = "putList", path = "putList", httpMethod = ApiMethod.HttpMethod.POST)
	public void putList(AuditorWrapper wrapper) throws Exception {
    	new AuditorRepository().putList(wrapper.getItems());
	}	
    
    @ApiMethod(name = "search", path = "search", httpMethod = ApiMethod.HttpMethod.POST)
	public AuditorEndpointResult search(AuditorSearchCriteria criteria) throws Exception {
    	System.out.println(criteria.getName());
    	
    	AuditorRepository auditorRepository = new AuditorRepository();
    	
    	AuditorEndpointResult result = new AuditorEndpointResult();
    	result.setCount(auditorRepository.getSearchCount(criteria));
    	result.setItems(auditorRepository.search(criteria));
    	
    	return result;
	}	    
    
    @ApiMethod(name = "clear", path = "clear", httpMethod = ApiMethod.HttpMethod.GET)
	public void clear() throws Exception {
    	new AuditorRepository().clear(Auditor.class);
	}	        

    @ApiMethod(name = "getAgencyList", path = "getAgencyList", httpMethod = ApiMethod.HttpMethod.GET)
	public AgencyWrapper getAgencyList() throws Exception {
    	
    	Logger.getLogger("AuditorEndpoint").log(Level.WARNING, "getAgencyList.1");
    	
    	List<String> result = new AuditorRepository().getAgencyList();
    	
    	Logger.getLogger("AuditorEndpoint").log(Level.WARNING, "getAgencyList.2");
    	
    	AgencyWrapper wrapper = new AgencyWrapper();
    	wrapper.setItems(result);
    	
    	return wrapper;
    }
    
    public class AgencyWrapper {
    	private List<String> items;

		public List<String> getItems() {
			return items;
		}

		public void setItems(List<String> items) {
			this.items = items;
		}
    	
    	
    }
}
