package ru.nrv.cloudstorage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.nrv.cloudstorage.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {
}