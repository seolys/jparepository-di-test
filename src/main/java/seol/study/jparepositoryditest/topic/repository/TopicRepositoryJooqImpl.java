package seol.study.jparepositoryditest.topic.repository;

import org.springframework.stereotype.Repository;
import seol.study.jparepositoryditest.topic.entity.Topic;

@Repository
public class TopicRepositoryJooqImpl implements TopicRepositoryJooq {

	@Override public Topic findJooqById() {
		return null;
	}

}
