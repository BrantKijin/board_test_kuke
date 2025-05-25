package kuke.board.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kuke.board.article.entity.BoardArticleCount;

@Repository
public interface BoardArticleCountRepository extends JpaRepository<BoardArticleCount, Long> {
}
