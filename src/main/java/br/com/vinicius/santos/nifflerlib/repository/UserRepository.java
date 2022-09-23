package br.com.vinicius.santos.nifflerlib.repository;

import br.com.vinicius.santos.nifflerlib.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query(value = "SELECT u.id, u.display_name, u.points_added, u.points_to_add, u.username FROM user u WHERE u.points_to_add >= 1", nativeQuery = true)
    List<UserEntity> findAllEligibleUsers();

    Optional<UserEntity> findUserEntityByUsername(String username);

}
