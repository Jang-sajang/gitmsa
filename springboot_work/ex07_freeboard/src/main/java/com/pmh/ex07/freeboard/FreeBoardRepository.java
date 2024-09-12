package com.pmh.ex07.freeboard;

import org.springframework.data.jpa.repository.JpaRepository;

// select,intsertm,update,deldete 다 있따 이안에.
public interface FreeBoardRepository extends JpaRepository<FreeBoard,Long> {
}
