package repository;

import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

import entity.Auditor;
import entity.AuditorSearchCriteria;
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

//        if (!Strings.isNullOrEmpty(employeeSearchCriteria.getSsnLast4()))
//            q = q.filter("ssnLast4", employeeSearchCriteria.getSsnLast4());
//
//        if (!Strings.isNullOrEmpty(employeeSearchCriteria.getLegacyEgiSysId()))
//            q = q.filter("legacyEgiSysId", employeeSearchCriteria.getLegacyEgiSysId().toLowerCase());

        return q;
    }			
}
