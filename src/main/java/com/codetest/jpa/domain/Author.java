package com.codetest.jpa.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String authNm; // 작성자 이름
    /**
     * @OneToMany 왜 사용? "객체 간의 관계를 자연스럽게 표현하고 매핑하기 위해서"
     * @mappedBy : '양방향 관계'에서 주체가 되는 필드를 지정하는 속성
     *  -> Board 엔티티에서 'author'필드가 관계의 주체이기 때문에 mappedBy = "author"로 지정
     * */
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Board> boards;

}
