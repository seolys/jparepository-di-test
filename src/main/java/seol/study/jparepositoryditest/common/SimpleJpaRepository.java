package seol.study.jparepositoryditest.common;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import seol.study.jparepositoryditest.topic.entity.Topic;
import seol.study.jparepositoryditest.topic.entity.TopicId;
import seol.study.jparepositoryditest.topic.repository.TopicRepository;

@Repository
public class SimpleJpaRepository implements TopicRepository {

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
