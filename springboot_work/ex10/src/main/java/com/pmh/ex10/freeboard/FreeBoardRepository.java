package com.pmh.ex10.freeboard;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface FreeBoardRepository extends JpaRepository<FreeBoard,Long> {


    @Modifying
    @Transactional
    @Query(value = "delete from FreeBoard fb WHERE fb.idx = :idx")
    void cusDeleteByIdx(@Param("idx") Long idx);
}