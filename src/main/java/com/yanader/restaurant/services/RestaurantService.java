package com.yanader.restaurant.services;

import com.yanader.restaurant.domain.RestaurantCreateUpdateRequest;
import com.yanader.restaurant.domain.entities.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RestaurantService {
    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);

    Page<Restaurant> searchRestaurants(String query,
                                       Float minRating,
                                       Float latitude,
                                       Float longitude,
                                       Float radius,
                                       Pageable pageable);
}
