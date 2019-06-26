package kz.devyellow.RestoApp.modules.reviews.services;

import kz.devyellow.RestoApp.modules.reviews.entities.Review;
import kz.devyellow.RestoApp.modules.reviews.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review saveReview(Review review) {
         return reviewRepository.save(review);
    }

    public List<Review> getAll() {
        return reviewRepository.findAll();
    }
}
