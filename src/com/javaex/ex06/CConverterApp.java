package com.javaex.ex06;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar, won;
        // 임의 추가 
        dollar=0;
        won=0;
        System.out.println(dollar+won);
             
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        
        double toDollar= CConverter.toDoller(1000000); 
        System.out.println("백만원은 "+toDollar+"달러 입니다.");
        
        //100달려를 원으로 출력하기
        
        double toWon= CConverter.toKWR(100);
        System.out.println("백달러는 "+toWon+"원 입니다.");
        
        
 
    }
}
