package seol.study.jparepositoryditest.common;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import seol.study.jparepositoryditest.topic.entity.Topic;

@Repository
public class SimpleJpaRepository<T, ID> implements JpaRepository<T, ID> {

	public Optional<T> findById(final ID topicId) {
		return Optional.empty();
	}

	public List<T> findAllById(final Iterable<ID> topicIds) {
		return null;
	}


	public Topic findCustomById() {
		return null;
	}


	public Topic findJooqById() {
		return null;
	}
}
