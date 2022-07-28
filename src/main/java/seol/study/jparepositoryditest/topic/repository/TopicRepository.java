package seol.study.jparepositoryditest.topic.repository;

import seol.study.jparepositoryditest.common.JpaRepository;
import seol.study.jparepositoryditest.topic.entity.Topic;
import seol.study.jparepositoryditest.topic.entity.TopicId;

public interface TopicRepository extends
		JpaRepository<Topic, TopicId>,
		TopicRepositoryCustom,
		TopicRepositoryJooq {

}
