package region.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import region.back.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}