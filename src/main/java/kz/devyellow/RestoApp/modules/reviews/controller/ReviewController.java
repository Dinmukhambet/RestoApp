package kz.devyellow.RestoApp.modules.reviews.controller;

import kz.devyellow.RestoApp.modules.reviews.entities.Review;
import kz.devyellow.RestoApp.modules.reviews.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("review")
public class ReviewController {

    @Autowired
    ReviewService service;

    @PostMapping("save")
    public Review saveReview(@RequestBody Review review) {
        return service.saveReview(review);
    }

    @GetMapping("all")
    public List<Review> getCalendarByYear() {
        return service.getAll();
    }
}
