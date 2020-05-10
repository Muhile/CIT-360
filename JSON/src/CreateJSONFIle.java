import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSONFIle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject obj = new JSONObject();
		obj.put("name","Ben Frank");
		obj.put("location", "USA");
		
		JSONArray list = new JSONArray();
		list.add("Java");
		list.add("Java");
		list.add("Java");
		
		obj.put("courses", list);
		
	}

}
