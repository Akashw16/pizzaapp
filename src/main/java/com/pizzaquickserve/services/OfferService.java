package com.pizzaquickserve.services;

import com.pizzaquickserve.entities.Offer;
import com.pizzaquickserve.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OfferService {
    @Autowired
    private OfferRepository offerRepository;

    public Offer createOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    public Optional<Offer> findById(Long id) {
        return offerRepository.findById(id);
    }

    public List<Offer> findAll() {
        return offerRepository.findAll();
    }

    public Offer updateOffer(Offer offer) {
        return offerRepository.save(offer);
    }

    public void deleteOffer(Long id) {
        offerRepository.deleteById(id);
    }
}
