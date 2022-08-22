package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Model.SalesList;

public interface SalesListRepository extends JpaRepository<SalesList,Integer> {

}
