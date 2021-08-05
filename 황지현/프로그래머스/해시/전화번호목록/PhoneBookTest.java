package programmers.hash;

import java.util.Arrays;

/*
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 * 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.
 * 
 * 구조대 : 119
 * 박준영 : 97 674 223
 * 지영석 : 11 9552 4421
 * 
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 
 * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 
 * 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 * 
 * 제한 사항
 * phone_book의 길이는 1 이상 1,000,000 이하입니다.
 * 각 전화번호의 길이는 1 이상 20 이하입니다.
 * 같은 전화번호가 중복해서 들어있지 않습니다.
 * 
 */

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        int len = phone_book.length;
        
        // phone_book 의 값들 앞뒤공백, 중간 공백 제거해주기
        for (int i = 0; i < len; i++) {
        	phone_book[i].trim();
        	String[] pArr = phone_book[i].split(" ");
        	phone_book[i] = String.join("", pArr);

        	System.out.println(phone_book[i]);
        }
        
        
        // 
        for (int i = 0; i < len-1; i++) {
        	for (int j = i+1; j < len; j++) {
        		if (phone_book[i].indexOf(phone_book[j]) == 0) {
        			answer = false;
        			return answer;
        		} else if (phone_book[j].indexOf(phone_book[i]) == 0) {
        			answer = false;
        			return answer;
        		}
        	}
        }
        
        return answer;
    }
}

// hashSet 사용해서 해보기...
class Solution2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        int len = phone_book.length;
        
        // phone_book 의 값들 앞뒤공백, 중간 공백 제거해주기
        for (int i = 0; i < len; i++) {
        	phone_book[i].trim();
        	String[] pArr = phone_book[i].split(" ");
        	phone_book[i] = String.join("", pArr);

        }
        
        Arrays.sort(phone_book);
        for (String phone : phone_book) {
        	System.out.println(phone);
        }
        
        for (int i = 0; i < len-1; i++) {
    		if (phone_book[i+1].indexOf(phone_book[i]) == 0) {
    			answer = false;
    			break;
    		}
        	
        }

        
        return answer;
    }
}



public class PhoneBookTest {

	public static void main(String[] args) {
		// ["119", "97674223", "1195524421"] , false
		// ["123","456","789"] , true
		// ["12","123","1235","567","88"] , false
		
		String[] phone_book = {"119", "97674223", "1195524421"};
		
//		Solution s = new Solution();
//		System.out.println(s.solution(phone_book));
		
		Solution2 s2 = new Solution2();
		System.out.println(s2.solution(phone_book));

	}

}
