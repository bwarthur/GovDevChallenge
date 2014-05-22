package repository;

import java.util.ArrayList;
import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;
import entity.Auditor;
import entity.AuditorSearchCriteria;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PropertyProjection;
import com.google.common.base.Strings;
import com.googlecode.objectify.cmd.Query;

public class AuditorRepository extends RepositoryBase<Auditor>{
	private int limit = 100;
	
	public int getSearchCount(AuditorSearchCriteria criteria) {
		Query<Auditor> q = getSearchQuery(criteria);
        return q.count();
	}
	
	public List<Auditor> search(AuditorSearchCriteria criteria) {
		Query<Auditor> q = getSearchQuery(criteria);
		return q.limit(limit).list();
	}
	
    private Query<Auditor> getSearchQuery(AuditorSearchCriteria criteria)
    {
        Query<Auditor> q = ofy().load().type(Auditor.class);

        if (!Strings.isNullOrEmpty(criteria.getName()))
            q = q.filter("vendorName >=", criteria.getName().toUpperCase()).filter("vendorName <", criteria.getName().toUpperCase() + "\uFFFD");

        if (!Strings.isNullOrEmpty(criteria.getDepartment()))
            q = q.filter("deptName", criteria.getDepartment());

        return q;
    }		
    
    public List<String> getAgencyList() {
    	
    	com.google.appengine.api.datastore.Query q = new com.google.appengine.api.datastore.Query("Auditor");

    	q.addProjection(new PropertyProjection("deptName", String.class));
    	q.setDistinct(true);
    	q.addSort("deptName", com.google.appengine.api.datastore.Query.SortDirection.ASCENDING);

    	DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    	List<Entity> entityList = datastore.prepare(q).asList(FetchOptions.Builder.withDefaults());
    	
    	List<String> result = new ArrayList<>();
    	
    	for (int i = 0; i < entityList.size(); i++){
    		System.out.println(entityList.get(i).getProperty("deptName").toString());
    		result.add(entityList.get(i).getProperty("deptName").toString());
    	}
    	
    	return result;
    }
}
