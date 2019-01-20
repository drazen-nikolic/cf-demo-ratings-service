package com.acme.ratingservice.persistance;

import com.acme.ratingservice.model.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface RatingRepository extends CrudRepository<Rating, String> {

}
