package com.yanader.restaurant.controllers;

import com.yanader.restaurant.domain.dtos.PhotoDto;
import com.yanader.restaurant.domain.entities.Photo;
import com.yanader.restaurant.mappers.PhotoMapper;
import com.yanader.restaurant.services.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/photos")
public class PhotoController {

    private final PhotoService photoService;
    private final PhotoMapper photoMapper;

    @PostMapping
    public PhotoDto uploadPhoto(@RequestParam("file")MultipartFile file) {
        Photo savedPhoto =  photoService.uploadPhoto(file);
        return photoMapper.toDto(savedPhoto);
    }
}
