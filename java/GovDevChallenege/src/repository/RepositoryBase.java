package repository;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import com.google.appengine.api.datastore.Key;

public abstract class RepositoryBase<T> {

	public List<T> list(Class<T> clazz) {
		return ofy().load().type(clazz).list();
	}
    public T get(Class<T> classType, Long id){
		return ofy().load().type(classType).id(id).now();
	}
	public void put(T entity){
        ofy().save().entity(entity).now();
	}
	public void putList(List<T> list)
	{
        ofy().save().entities(list).now();
	}
}
