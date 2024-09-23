package com.yukmuhae.demo.freeboard;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface FreeBoardRepository extends JpaRepository<FreeBoard, Long> {
    //insert update delete save 등등이 이 안에 들어있다.
    //findbyid 하려면 추가 해야한다.
//    Optional<FreeBoard> findByTitle(String title);
}
