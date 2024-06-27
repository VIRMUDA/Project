package com.demo_virmuda.user.repository;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo_virmuda.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//	Optional<User> findByusername(String username);
	boolean existsByEmail(String email);
	boolean existsByUsername(String username);
	
	User findByEmail(String email);

}
