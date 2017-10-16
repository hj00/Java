package article.controlers;

import java.util.HashMap;
import java.util.Map;

public class ModelAndeView {
	private String viewName;
	private Map<String, Object> model = new HashMap<String, Object>();
	
	public ModelAndeView(){};
	
	public ModelAndeView(String viewName, String key, Object obj) {
		this.viewName = viewName;
		model.put(key,  obj);
	}
	
	public ModelAndeView(String viewName) {//form같은데 이동할 때 사용하기 위한 생성자
		this.viewName = viewName;
	}	
	
	public Map<String, Object> getModel() {
		return model;
	}
	public void addObject(String key, Object obj) {
		model.put(key, obj);
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	@Override
	public String toString() {
		return "ModelAndeView [model=" + model + ", viewName=" + viewName + "]";
	}
	
	
	
	

}
