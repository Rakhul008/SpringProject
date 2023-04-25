package com.Mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Mall.entity.Mall;
import com.Mall.repository.MallRepository;

@Service
public class MallService {
@Autowired
MallRepository Repobj;

public Mall addDetails(@RequestBody Mall robj3)
{
	return Repobj.save(robj3);
}
public List<Mall> getDetails()
{
	List<Mall> listobj=Repobj.findAll();
	return listobj;
}
public Mall putDetails(@RequestBody Mall robj4)
{
	return Repobj.save(robj4);
}
public void delete(int MallNo)
{
	Repobj.deleteById(MallNo);
}
}
