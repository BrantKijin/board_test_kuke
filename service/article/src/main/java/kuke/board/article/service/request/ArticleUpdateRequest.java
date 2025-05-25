package kuke.board.article.service.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ArticleUpdateRequest {
	private String title;
	private String content;
}
