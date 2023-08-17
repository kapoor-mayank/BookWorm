package com.example.respositaries;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.GenreMaster;
@Repository
@Transactional
public interface GenreMasterRespository extends JpaRepository<GenreMaster,Long>{

	Optional<GenreMaster> findByName(String name);

	@Modifying
	@Query("update GenreMaster g set g.genreDesc = :genreDesc where g.genreId = :genreId")
	void update(@Param("genreDesc") String genreDesc,@Param("genreId")Long id);

}
