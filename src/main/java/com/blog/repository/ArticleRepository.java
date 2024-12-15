package com.blog.repository;

import com.blog.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByAuthorId(Long authorId);
    List<Article> findByTitleContaining(String keyword);
    Page<Article> findByTitleContainingOrContentContaining(String title, String content, Pageable pageable);
} 