package z_exam;

/*
class Exercise3_1 { 

	public static void main(String[] args){
		int x = 2; 
		int y = 5;
		char c = 'A'; // 'A' 65
		
		System.out.println(1 + x << 33); << 패스
		6
		System.out.println(y >= 5 || x < 0 && x > 2); &&먼저 계산
		true
		System.out.println(y += 10 - x++);
		x++ = x값 2
		y += 10 - 2
		10 - 2 먼저 계산 = 8
		y += 8
		y(5) += 8
		
		13
		System.out.println(x+=2); x
		5
		System.out.println( !('A' <= c && c <='Z') ); 
		false
		System.out.println('C'-c); c-a 67-65
		2
		System.out.println('5'-'0'); 
		5
		System.out.println(c+1);  
		66
		System.out.println(++c); b 
		B
		System.out.println(c++); 
		B
		System.out.println(c);
		C

[3-2] 아래의 코드는 사과를 담는데 필요한 바구니 (버켓) 의 수를 구하는 코드이다. 
 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면 
 13개의 바구니가 필요할 것이다. (1) .에 알맞은 코드를 넣으시오


numOfApples / sizeOfBucket + numOfApples%sizeOfBucket == 0 ? 0:1

numOfApples / sizeOfBucket = 3개가 남는데, 나머지가 있으면 1추가 

ex)
String gender = regNo == 1 ? "남자" : "여자";

		
[3-3] 아래는 변수 의 값에 따라 num을 ‘양수’, ‘음수’, ‘0’ 출력하는 코드이다. 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오 
[Hint] 삼항 연산자를 두 번 사용하라.


(num > 0 ? "양수" : num < 0 ? "음수" : 0 ) 


type을 맞춰주는 것이 좋다
(num > 0 ? "양수" : num < 0 ? "음수" : "0" )


?: (삼항연산자) :조건식 ? 조건식이 참일경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		                           비교연산이 true이면 두번째 문장만, false이면 세번째문장 실행

ex)
int result = (x < y) ? x : y; // 조건식 (x < y) ? 비교하고 있는데 참이면 두번쨰문장 실행 x를 result에 저장


[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다 만일 변수 num의 값이 ‘456’이라면 ‘400’이 되고 ,
‘111이라면  ‘100’이 된다. (1)에 알맞은 코드를 넣으세요.  

(num / 100 * 100)
num / 100 = int 타입으로 되서 56 숫자가 없어지게 되고 * 100을 하면 400이 됨


[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의 값이 333이라면 331이 되고,
777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.

(num/10*10+1)
num / 100 = int 타입 10의 자리 이하를 버리고 * 10+1을 하면 331이 됨


[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다.
 예를 들어 24의 크면서도 가장 가까운 10의 배수는 30이다 . 19의 경우 20이고 81의 경우 90이 된다. 
 30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 6을 결과로 얻어야 한다. 
 (1) 에 알맞은 코드를 넣으시오 .
 
 (10 - num%10 ) 
 
 
 [3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius로 변환하는 코드이다. 변환공식이 'C =  5/9 ×(F - 32)'라고 할 때
(1) 에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다. (Math.round())를 사용하지 않고 처리할 것 .

 (int)((5/9f * (fahrenheit - 32))*100 + 0.05) / 100f
  0
 

ex)
System.out.println(Math.round(round * 10) / 10.0); //위에와 같은 결과가 나옴



[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.

		byte a = 10; 
		byte b = 20; 
		int c = a + b;  		
		
	?	char ch = 'A'; 
		ch = (char)(ch+2); //현재 int 타입이라서 char(문자형)로 바꿔주기 
		
		float f = 3 / 2f; 
		long l = 3000 * 3000 * 3000L; 
		
		float f2 = 0.1f; /7자리까지 정확하게 표현
		double d = 0.1f; /15자리까지 정확하게 표현
		
		boolean result = d==f2; 
//
 		double d = 0.1; 
		
		boolean result = (float)d==f2;   
 

[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만  변수 b의 값이 true가 되도록 하는 코드이다.
(1)에 알맞은 코드를 넣으시오.

(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')

-> ||(OR-하나만이라도 true면 true)
-> &&(AND)

ex)
int i = 5;
b = i > 10 || i % 2 ==0; // i > 10 과 i % 2 ==0  비교


[3-10] 다음은 대문자를 소문자로 변경하는 코드인데,  문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다. 
문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를 들어 'A'의 코드는 65이고, 'a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오 .

(ch >= 'A' && ch <= 'Z') 대문자 지정
('a') 
--? (char)(ch+32) 
*/
	}

}
