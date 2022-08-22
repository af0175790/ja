package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Model.CarList;

public interface CarListRepository extends JpaRepository<CarList,Integer> {

}
