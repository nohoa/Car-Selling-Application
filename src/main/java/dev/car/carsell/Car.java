package dev.car.carsell;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    private ObjectId id ;

    private String carId ;

    private String carName ;

    private Integer carPrice ;

    private String carCateogy ;
}
