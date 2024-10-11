package com.polar_moviechart.scrapingservice.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private final int code;

    @Column(nullable = false)
    private final String title;

    @OneToMany(mappedBy = "movie")
    private final List<MovieDailyStats> stats = new ArrayList<>();

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime modifiedAt;

    public Movie(int id, int code, String title) {
        this.code = code;
        this.title = title;
    }
}
