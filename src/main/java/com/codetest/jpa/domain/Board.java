package com.codetest.jpa.domain;

import jakarta.persistence.*;
import lombok.Data;

/**
 * JTA (Java Transaction API)는 자바 EE (지금은 Jakarta EE) 표준 트랜잭션 처리 API
 * commit / rollback을 동시에 제어할 때 쓰는 트랜잭션 매니저 기술이 JTA
 * Spring Boot + Hibernate(JPA) 조합에서는 ==JTA 트랜잭션을 안 쓰고==
 * 'DataSourceTransactionManager' 기반의 단일 DB 트랜잭션을 쓴다.
 * 그러니 이 로그는 그냥 정보 메시지 수준이고 무시해도 됨.
 *
 * */


@Data
@Entity
@Table(name="board")  //BOARD 테이블과 매핑됨을 나타냅니다.
public class Board {
    @Id                                      //  IDENTITY는 자동으로 증가
    @GeneratedValue(strategy = GenerationType.AUTO) // jpa가 db에 맞는 전략을 자동으로 선택
    private long BNo;
    private String title;
}
