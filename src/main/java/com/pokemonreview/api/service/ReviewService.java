package com.pokemonreview.api.service;

import com.pokemonreview.api.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    ReviewDto createReview(long pokemonId, ReviewDto reviewDto);

    List<ReviewDto> getReviewsByPokemonId(long id);

    ReviewDto getReviewById(int reviewId, long pokemonId);

    ReviewDto updateReview(long pokemonId, int reviewId, ReviewDto reviewDto);

    void deleteReview(long pokemonId, int reviewId);
}
