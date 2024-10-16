package com.polar_moviechart.scrapingservice.domain.service;

import com.polar_moviechart.scrapingservice.domain.entity.MovieDirector;
import com.polar_moviechart.scrapingservice.domain.repository.MovieDirectorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieDirectorQueryService {
    private final MovieDirectorRepository movieDirectorRepository;
    public boolean isExists(int movieCode, int directorCode) {
        return movieDirectorRepository.existsByMovieCodeAndDirectorCode(movieCode, directorCode);
    }
}
