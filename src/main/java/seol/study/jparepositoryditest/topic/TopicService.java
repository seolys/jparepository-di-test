package seol.study.jparepositoryditest.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import seol.study.jparepositoryditest.topic.repository.TopicRepository;

@Component
public class TopicService {

	@Autowired
	private TopicRepository topicRepository; // TopicRepositoryProxy 컴포넌트 여부에 따라 오류발생여부 결정됨.

}
