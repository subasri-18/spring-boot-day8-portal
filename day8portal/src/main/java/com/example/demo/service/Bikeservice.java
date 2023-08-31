package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bikeentity;
import com.example.demo.repository.Bikerepo;

@Service
public class Bikeservice {

	@Autowired
	Bikerepo br;
	public Bikeentity saveinfo(Bikeentity bb)
	{
		return br.save(bb);
	}
	
	public List<Bikeentity> savedetails(List<Bikeentity> bb){
		
		return (List<Bikeentity>)br.saveAll(bb);
	}
	public List<Bikeentity> showinfo()
	{
	      return br.findAll();
	}
	public List<Bikeentity> getbike(int s)
	{
		return br.getBikeInfo(s);
	}
	
	public List<Bikeentity> getbikename(String bikename)
	{
		return br.getBikeInfoname(bikename);
	}
	public List<Bikeentity> getbiketypes(int i,String s)
	{
		return br.getBikeInfobytypes(i, s);
	}
}