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
	
<<<<<<< HEAD
	Optional<GenreMaster> findBygenreDesc(String name);
	
	@Modifying
	//@Query("update GenreMaster g set g.genreDesc = :genreDesc where g.genreId = :genreId")
	@Query( value ="update genre_master g set g.genre_Desc = :genreDesc where g.genre_Id = :genreId", nativeQuery=true)
	void update(@Param("genreDesc") String genreDesc,@Param("genreId")Long Id);
=======
//	Optional<GenreMaster> findByName(String name);
//	
//	@Modifying
//	@Query("update genre_master g set g.genre_desc = :genreDesc where g.genre_Id = :Id")
//	void update(@Param("genreDesc") String genreDesc, @Param("Id")Long genreId );
>>>>>>> a0a538e2648ce6abccac512e89d9b7e81da00c7f
}
