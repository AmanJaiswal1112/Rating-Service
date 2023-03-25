package com.lcwd.rating.service.service;

import com.lcwd.rating.service.entity.Rating;

import java.util.List;

public interface RatingService {

    public Rating create(Rating rating);

    public List<Rating> getRatings();

    public List<Rating> getRatingByUserId(String userId);

    public List<Rating> getRatingByHotelId(String hotelId);

}
