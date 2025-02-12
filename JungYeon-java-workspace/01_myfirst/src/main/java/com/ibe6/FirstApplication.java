package com.ibe6;

// single line comment (한 줄 주석)

/*
    multi line comment
    (여러 줄 주석)
 */

    /* 프로젝트
        ㄴ 패키지1
            ㄴ 패키지1_1
                ㄴ 클래스1(.java) => 소스코드 작업
                ㄴ 클래스2(.java) => 소스코드 작업
            ㄴ 패키지1_2
        ㄴ 패키지2
            ㄴ 패키지2_1

    * { } : 블럭 | 영역 | 구역 | 지역
            해당 블럭 내에 소스코드 작성시 한 tab 들여써야됨!!\

    * 클래스
    public class 클래스명 {

        // 메소드 == 기능
        // 기능별로 메소드 작성

        A 기능의 메소드1 {
            소스코드
            소스코드
        }

        B 기능의 메소드2 {
            소스코드
            소스코드
       }

       실행용 메소드(== main메소드) {
            소스코드
            소스코드
       }

    }


     */

import javax.swing.*;
import java.util.Arrays;

/**
 * documentation comment
 * (문서 주석)
 * 작성자, 작성일자, 설명 등을 API 문서로 제공하기 위한 주석
 *
 * @author JY
 * @version 1.0
 */

public class FirstApplication { // class start

        public void abc() { // abc method start

        } // abc method end

        public void def() {

        }

        /*
            ## 메인(main)메소드 ##
           1. Java Application 실행시 최초로 실행되는 메소드
           2. 즉, 프로그램의 시작점
           3. 실행용 메소드라고도 함
           4. 작성형식
              public static void main(String[] args) { }
         */



        public static void main(String[] args) {
            System.out.println(1);
            System.out.println(2);
            System.out.print('A');
            System.out.print("B\nCD\n");
            System.out.println("\"Hello\" \\Wo\trld");

            // 안녕하세요 XXX에 오신걸 환영합니다! x월 x일까지 잘해봐요!
            System.out.printf("안녕하세요 %s에 오신걸 환영합니다! %d월 %d일까지 잘해봐요!", "SSG", 7, 29);

   /* ## 출력문 ##
    1. 특정 값을 화면(콘솔)에 출력
    2. 종류
    println(값) : 값 출력 후 자동으로 줄바꿈 처리
    print(값) : 값 출력 후 줄바꿈 처리X
    printf("출력 형식", 값, 값, ..) : 지정한 형식대로 값을
     */
        } // class end