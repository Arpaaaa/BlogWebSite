package com.blog.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(columnDefinition = "TEXT")
    private String content;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Article article;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
} 