package com.dungnt.remote_healthcare.repository;

import com.dungnt.remote_healthcare.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findBy_id(ObjectId _id);
}
