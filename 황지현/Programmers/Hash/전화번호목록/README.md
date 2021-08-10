# 전화번호 목록

## 문제설명
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.  
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.  

- 구조대 : 119
- 박준영 : 97 674 223
- 지영석 : 11 9552 4421

전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.


## 제한사항
- phone_book의 길이는 1 이상 1,000,000 이하입니다.
- 각 전화번호의 길이는 1 이상 20 이하입니다.
- 같은 전화번호가 중복해서 들어있지 않습니다.

## 입출력 예
|phone_book	| return|
|-----------|--------|
|["119", "97674223", "1195524421"]|	false|
|["123","456","789"]|	true|
|["12","123","1235","567","88"]|	false|


<br><hr>

## 중첩 for문 사용
- 인덱스 번호 (0,1), (0,2), (1,2) 식으로 받아와 비교한다.
  - 0번 자리에 1번 문자열이 접두어인지 확인한다. -> indexOf(찾을문자열) 사용
  - 1번 자리에 0번 문자열이 접두어인지 확인한다.
- 중첩된 for문은 효율성이 떨어진다.


<br>

## sort 후, for문 한번만 사용
- 정렬을 하면, 앞 뒤 문자열만 비교하면 된다.
  `ex. ["119", "97674223", "1195524421"]  =>  ["119", "1195524421", "97674223"]`
- 뒤 문자열이 앞 문자열을 접두어로 가지고 있으면 false이다.

<br><hr>

## 코드 (수정 전)
```java
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int len = phone_book.length;
        
        // phone_book 의 값들 앞뒤공백, 중간 공백 제거해주기
        for (int i = 0; i < len; i++) {
            phone_book[i].trim();  // 앞뒤공백 제거
            String[] pArr = phone_book[i].split(" ");  // 중간공백있으면 나눠 배열로 만들기
            phone_book[i] = String.join("", pArr);  // 배열을 공백없이 붙여 다시 문자열로

            System.out.println(phone_book[i]);
        }
        
        
        // (0,1), (0,2), ~, (1,2), (1,3), ~ 비교하기
        // 중첩 for문을 사용해서 효율성이 떨어진다.
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if (phone_book[i].indexOf(phone_book[j]) == 0) {  // 인덱스번호가 0이면(접두사이면) false
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
```

## 코드 (수정 후)
```java
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
        
        // 미리 정렬을 해준다
        Arrays.sort(phone_book);
        
        // for문 한번만 사용해서 바로 앞 뒤 문자열만 비교하면된다.
        for (int i = 0; i < len-1; i++) {
            if (phone_book[i+1].indexOf(phone_book[i]) == 0) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
```

<hr>

출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges
