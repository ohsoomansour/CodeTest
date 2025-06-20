package com.codetest.jpa.service;

import com.codetest.jpa.domain.Board;
import com.codetest.jpa.repository.BoardRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BoardService {

   /**
    * @Since 2025.6.20
    * @PersistenceContext 설명: EntityManagerFactory를 통해 EntityManager를 생성하고, 해당 필드에 주입
    * @EntityMagneger: '프록시 객체' 즉, 원래 객체를 감싸는 껍데기 객체
    *  ->필요한 경우 실제 객체를 지연 초기화(lazy) or 로직을 가로채서(transparent interception) 추가적인 처리
    * */
    @PersistenceContext
    private EntityManager em;

    @Autowired
    private BoardRepository boardRepository;

    public Optional<Board> findBoardByBNo(long b_no){
        return boardRepository.findBoardByBNo(b_no);
    }

    public List<Board> findByTitleContaing(String title){
        return boardRepository.findByTitleContaining(title);
    }
    /**
     * @Since : 2025.6.20
     * @Description: EntityManager 사용 (순수 JPQL)
     * @param -
     * @return List<Board>
     * */
    public List<Board> findBoardsWithAuthor(){
        return em.createQuery(
                "SELECT b FROM Board b LEFT JOIN b.author a ON b.BNo = a.id", Board.class
        ).getResultList();
    }



}
