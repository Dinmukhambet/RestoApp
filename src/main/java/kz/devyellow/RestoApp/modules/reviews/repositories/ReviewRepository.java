package kz.devyellow.RestoApp.modules.reviews.repositories;

import kz.devyellow.RestoApp.modules.reviews.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
