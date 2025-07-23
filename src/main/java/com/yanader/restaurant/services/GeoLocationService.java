package com.yanader.restaurant.services;

import com.yanader.restaurant.domain.GeoLocation;
import com.yanader.restaurant.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}
