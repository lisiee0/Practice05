package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        //친구정보 3명 입력 로직 --> 반복문 사용
        String name, hp, school;
        Friend fr1= new Friend();
        friendArray[0]= fr1;
        
        Friend fr2= new Friend();
        friendArray[1]= fr2;
        
        Friend fr3= new Friend();
        friendArray[2]= fr3;
  
        for(int i= 0; i<friendArray.length; i++) {
        	
        	System.out.print("이름: ");
        	name= sc.nextLine();

        	System.out.print("핸드폰: ");
        	hp= sc.nextLine();
        	
        	System.out.print("학교: ");
        	school= sc.nextLine();
        	
        	System.out.println("------------------------------");
        	
        	friendArray[i].setName(name);
        	friendArray[i].setHp(hp);
        	friendArray[i].setSchool(school);
        }
       
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
    	}
        sc.close();
    }
}
