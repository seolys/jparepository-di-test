package seol.study.jparepositoryditest.topic;

import java.util.List;
import java.util.Optional;
import seol.study.jparepositoryditest.topic.entity.Topic;
import seol.study.jparepositoryditest.topic.entity.TopicId;
import seol.study.jparepositoryditest.topic.repository.TopicRepository;

/**
 * TopicRepository을 직접 상속할 경우, 구현해야 하는 메서드 확인 목적.
 */
//@Component
public class TopicRepositoryImpl implements TopicRepository {

	@Override public Optional<Topic> findById(final TopicId topicId) {
		return Optional.empty();
	}

	@Override public List<Topic> findAllById(final Iterable<TopicId> topicIds) {
		return null;
	}

	@Override public Topic findCustomById() {
		return null;
	}

	@Override public Topic findJooqById() {
		return null;
	}
}
