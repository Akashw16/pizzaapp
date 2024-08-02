//package com.pizzaquickserve.controllers;
//
//import com.pizzaquickserve.entities.Review;
//import com.pizzaquickserve.services.ReviewService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/review")
//public class ReviewController {
//    @Autowired
//    private ReviewService reviewService;
//
//    @PostMapping("/submit")
//    public ResponseEntity<Review> submitReview(@RequestBody Review review) {
//        return ResponseEntity.ok(reviewService.submitReview(review));
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Review> getReviewById(@PathVariable Long id) {
//        return reviewService.findById(id)
//                .map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @GetMapping("/all")
//    public ResponseEntity<List<Review>> getAllReviews() {
//        return ResponseEntity.ok(reviewService.findAll());
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteReview(@PathVariable Long id) {
//        reviewService.deleteReview(id);
//        return ResponseEntity.ok().build();
//    }
//}
