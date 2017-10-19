package mx.com.archetype.electricianservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.com.archetype.electricianservice.model.User;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

	 User findByEmail(String email);
}
