package seol.study.jparepositoryditest.topic.repository;

import org.springframework.stereotype.Repository;
import seol.study.jparepositoryditest.topic.entity.Topic;

@Repository
public class TopicRepositoryCustomImpl implements TopicRepositoryCustom {

	@Override public Topic findCustomById() {
		return null;
	}
}
