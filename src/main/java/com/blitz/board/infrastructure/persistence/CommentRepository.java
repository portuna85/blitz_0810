package com.blitz.board.infrastructure.persistence;

import com.blitz.board.domain.Comment;
import com.blitz.board.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> getCommentByPostsOrderById(Posts posts);
}
