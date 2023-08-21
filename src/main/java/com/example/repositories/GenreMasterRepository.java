package com.example.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.GenreMaster;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface GenreMasterRepository extends JpaRepository< GenreMaster ,Long> {
	
	Optional<GenreMaster> findBygenreDesc(String name);
	
	@Modifying
	//@Query("update GenreMaster g set g.genreDesc = :genreDesc where g.genreId = :genreId")
	@Query( value ="update genre_master g set g.genre_Desc = :genreDesc where g.genre_Id = :genreId", nativeQuery=true)
	void update(@Param("genreDesc") String genreDesc,@Param("genreId")Long Id);
}
