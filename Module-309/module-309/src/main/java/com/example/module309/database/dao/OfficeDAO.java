package com.example.module309.database.dao;

import com.example.module309.database.entity.Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface OfficeDAO extends JpaRepository<Office, Integer> {

    @Query("select o from Office o where o.id = :officeId")
    Office findByOfficeId(int officeId);
}
