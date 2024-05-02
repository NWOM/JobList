package com.sagnik.joblisting.repository;

import com.sagnik.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
