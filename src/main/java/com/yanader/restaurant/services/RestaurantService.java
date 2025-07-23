package com.yanader.restaurant.services;

import com.yanader.restaurant.domain.RestaurantCreateUpdateRequest;
import com.yanader.restaurant.domain.entities.Restaurant;

public interface RestaurantService {
    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);
}
