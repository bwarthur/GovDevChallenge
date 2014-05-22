package entity;

import java.util.List;
import entity.Auditor;

public class AuditorEndpointResult {
	private int count;
	private List<Auditor> items;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Auditor> getItems() {
		return items;
	}
	public void setItems(List<Auditor> items) {
		this.items = items;
	};
}
