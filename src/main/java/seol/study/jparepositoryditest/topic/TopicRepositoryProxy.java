package seol.study.jparepositoryditest.topic;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import seol.study.jparepositoryditest.common.JpaRepository;
import seol.study.jparepositoryditest.topic.entity.Topic;
import seol.study.jparepositoryditest.topic.entity.TopicId;
import seol.study.jparepositoryditest.topic.repository.TopicRepository;
import seol.study.jparepositoryditest.topic.repository.TopicRepositoryCustom;
import seol.study.jparepositoryditest.topic.repository.TopicRepositoryJooq;

/**
 * 스프링이라면 이렇게 프록시로 구현하지 않았을까 추측 목적.
 */
@Primary
@Component // 주석처리하면 오류 확인 가능
public class TopicRepositoryProxy implements TopicRepository {

	@Autowired @Qualifier("simpleJpaRepository")
	private JpaRepository<Topic, TopicId> jpaRepository; // 제네릭 생략함

	@Autowired @Qualifier("topicRepositoryCustomImpl")
	private TopicRepositoryCustom topicRepositoryCustom;
	@Autowired @Qualifier("topicRepositoryJooqImpl")
	private TopicRepositoryJooq topicRepositoryJooq;

	public Optional<Topic> findById(final TopicId topicId) {
		return jpaRepository.findById(topicId);
	}

	public List<Topic> findAllById(final Iterable<TopicId> topicIds) {
		return jpaRepository.findAllById(topicIds);
	}

	public Topic findCustomById() {
		return topicRepositoryCustom.findCustomById();
	}

	public Topic findJooqById() {
		return topicRepositoryJooq.findJooqById();
	}

}
