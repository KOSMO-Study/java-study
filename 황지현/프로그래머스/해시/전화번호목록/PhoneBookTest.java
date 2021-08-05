package programmers.hash;

import java.util.Arrays;

/*
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�.
 * ��ȭ��ȣ�� ������ ���� ���, ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�.
 * 
 * ������ : 119
 * ���ؿ� : 97 674 223
 * ������ : 11 9552 4421
 * 
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, 
 * � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false�� 
 * �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * 
 * ���� ����
 * phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�.
 * �� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
 * ���� ��ȭ��ȣ�� �ߺ��ؼ� ������� �ʽ��ϴ�.
 * 
 */

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        int len = phone_book.length;
        
        // phone_book �� ���� �յڰ���, �߰� ���� �������ֱ�
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

// hashSet ����ؼ� �غ���...
class Solution2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        int len = phone_book.length;
        
        // phone_book �� ���� �յڰ���, �߰� ���� �������ֱ�
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
