package com.pizzaquickserve.repositories;

import com.pizzaquickserve.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
