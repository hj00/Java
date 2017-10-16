package cookie;

import java.util.HashMap;
import java.util.Map;

import api.FriendVO;

public class CollectionTest03 {
	public static void main(String[] args) {
		Map<String, FriendVO> friendMap = new HashMap<String, FriendVO>();
		friendMap.put("최지웅A", new FriendVO("010-1111-1111", 29, 1));
		friendMap.put("최지웅B", new FriendVO("010-1111-1112", 23, 1));
		friendMap.put("카야누리브스", new FriendVO("010-1111-1113", 45, 1));
		friendMap.put("장동건", new FriendVO("010-1111-1114", 44, 1));
		friendMap.put("박주미", new FriendVO("010-1111-1115", 38, 2));
		
//		System.out.println("최지웅B");
		
		for(String key:friendMap.keySet()) {
			FriendVO friendVO = friendMap.get(key);
			System.out.println(key + "의 전화번호는 " + friendVO.getPhone());
			System.out.println(", 나이는 " + friendVO.getAge() + "이며");
			System.out.println(friendVO.getGender() == 1 ? "남자" : "여자");;
			System.out.println("입니다. ");
			
		}
		
		
		
	}

}
