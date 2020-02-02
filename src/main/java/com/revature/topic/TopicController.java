package com.revature.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "spring framework", "spring description"),
				new Topic("java", "java framework", "description2"),
				new Topic("python", "framework", "desc3")
				);
	}
}
