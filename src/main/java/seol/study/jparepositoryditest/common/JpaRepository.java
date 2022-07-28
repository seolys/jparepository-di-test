package seol.study.jparepositoryditest.common;

import java.util.List;
import java.util.Optional;

/**
 * org.springframework.data.jpa.repository.JpaRepository 축소판
 */
public interface JpaRepository<T, ID> {

	Optional<T> findById(ID id);

	List<T> findAllById(Iterable<ID> ids);
	
}
