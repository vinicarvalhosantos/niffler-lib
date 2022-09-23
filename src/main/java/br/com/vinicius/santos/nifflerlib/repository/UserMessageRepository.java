package br.com.vinicius.santos.nifflerlib.repository;

import br.com.vinicius.santos.nifflerlib.model.entity.UserMessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMessageRepository extends JpaRepository<UserMessageEntity, Long> {

}
