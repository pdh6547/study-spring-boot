package com.donghyun.repository;

import com.donghyun.domain.Board;
import com.donghyun.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository <Board, Long> {
    Board findByUser(User user);
}
