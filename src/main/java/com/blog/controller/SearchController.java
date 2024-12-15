package com.blog.controller;

import com.blog.model.Article;
import com.blog.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/search")
public class SearchController {
    
    @Autowired
    private SearchService searchService;
    
    @GetMapping("/articles")
    public ResponseEntity<Page<Article>> searchArticles(
            @RequestParam String keyword,
            Pageable pageable) {
        return ResponseEntity.ok(searchService.searchArticles(keyword, pageable));
    }
} 