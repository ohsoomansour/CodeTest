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

//    //EntityManager를 자동으로 주입
//    @PersistenceContext
//    private EntityManager em;

    @Autowired
    private BoardRepository boardRepository;

    public Optional<Board> findBoardByBNo(long b_no){
        return boardRepository.findBoardByBNo(b_no);
    }

    public List<Board> findByTitleContaing(String title){
        return boardRepository.findByTitleContaining(title);
    }

}
