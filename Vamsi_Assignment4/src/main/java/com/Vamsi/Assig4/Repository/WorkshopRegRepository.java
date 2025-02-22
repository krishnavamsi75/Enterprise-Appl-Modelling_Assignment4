package com.Vamsi.Assig4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Vamsi.Assig4.Models.WorkshopRegModel;

@Repository  
public interface WorkshopRegRepository extends JpaRepository<WorkshopRegModel, Long> { 
}
