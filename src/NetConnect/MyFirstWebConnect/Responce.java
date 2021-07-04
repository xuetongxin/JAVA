package MyFirstWebConnect;

import java.util.HashMap;
import java.util.Map;

public class Responce {
	int respCode=200;
	byte[] respBody;
	Map<String ,String> respHead=new HashMap<String,String>();
	public void setHead(String key,String value) {
		respHead.put(key, value);
	}
	public int getRespCode() {
		return respCode;
	}
	public void setRespCode(int respCode) {
		this.respCode=respCode;
	}
	public byte[] getRespBody() {
		return respBody;
	}
	public void setRespBody(byte[] respBody) {
		this.respBody=respBody;
	}
	public Map<String,String> getRespHead(){
		return respHead;
	}
	public void setRespHead(Map<String ,String> respHead) {
		this.respHead=respHead;
	}
	
}
