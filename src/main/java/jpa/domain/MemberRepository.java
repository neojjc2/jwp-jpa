package jpa.domain;

import java.nio.file.Path;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

	Member findByEmail(String email);

	Member findByAgeBetween(int fromAge, int toAge);
}
