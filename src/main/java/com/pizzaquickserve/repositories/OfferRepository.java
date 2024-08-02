package com.pizzaquickserve.repositories;

import com.pizzaquickserve.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
