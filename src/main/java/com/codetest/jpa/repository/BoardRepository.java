package com.codetest.jpa.repository;


import com.codetest.jpa.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
/**
 * Long은 Enitty의 ID를 가리킴 죽, Board 엔티티에서 @Id라고 지정한 필드
 *  - 필드의 이름은 반드시 ID는 아니다!
 *
 *  LIKE '%title%' == findBy + 필드이름 + Containing
 * */

public interface BoardRepository extends JpaRepository<Board, Long> {
    Optional<Board> findBoardByBNo(long BNo);

    List<Board> findByTitleContaining(String title);
}