package MyFirstWebConnect;

import java.util.HashMap;
import java.util.Map;

public class Request {

		// TODO 自动生成的方法存根
		Map<String,String> requestHeadMap=new HashMap<String,String>();
		String method;
		String resourcePath;
		Map<String,String> parameter=new HashMap<String,String>();
		public void setRequestHead(String key,String value) {
			requestHeadMap.put(key, value);
		}
		public String getHead(String key) {
			return requestHeadMap.get(key);
		}
		public void setParameter(String key,String value) {
			parameter.put(key, value);
		}
		public String getParameter(String key) {
			return  parameter.get(key);
		}
		public String getMethod() {
			return method;
		}
		public void setMethod(String method) {
			this.method=method;
		}
		public String getResourcePath() {
			return resourcePath;
		}
		public void setResourcePath(String resourcePath) {
			this.resourcePath=resourcePath;
		}

}
