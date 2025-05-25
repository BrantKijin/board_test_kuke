package kuke.board.comment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kuke.board.comment.service.CommentService;
import kuke.board.comment.service.response.CommentResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class CommentController {

	private final CommentService commentService;

	@GetMapping("/v1/comments/{commentId}")
	public CommentResponse read(
		@PathVariable("commentId") Long commentId
	) {
		return commentService.read(commentId);
	}
}
