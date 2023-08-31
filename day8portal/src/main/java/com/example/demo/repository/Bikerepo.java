package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Bikeentity;

public interface Bikerepo extends JpaRepository<Bikeentity, Integer>{
	
	@Query(value="select * from bike_table where year=:s",nativeQuery=true)
	public List<Bikeentity> getBikeInfo(@Param("s") int year);
	
	
	@Query(value="select * from bike_table where bikename=:bikename",nativeQuery=true)
	public List<Bikeentity> getBikeInfoname(@Param("bikename") String bikename);

	@Query(value="select * from bike_table where year=:year and bikename=:bikename",nativeQuery=true)
	public List<Bikeentity> getBikeInfobytypes(@Param("year") int year,@Param("bikename") String bikename);

}