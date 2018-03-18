package com.yoyojyv.jboard.persistence;

import com.yoyojyv.jboard.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
