package dev.car.carsell;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsellRepository extends MongoRepository<Car, ObjectId> {

}
