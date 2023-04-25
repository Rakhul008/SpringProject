package com.Mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mall.entity.Mall;
import com.Mall.service.MallService;

@RestController
public class MallController {
	@Autowired
	MallService servobj;
	
	@PostMapping("/post")
	public Mall AddDetails(@RequestBody Mall robj1)
	{
		return servobj.addDetails(robj1);
	}
	@GetMapping("/get")
	public List<Mall> GetDetails()
	{
		List<Mall>listObject=servobj.getDetails();
		return listObject;
	}
	@PutMapping("/put")
	public Mall PutDetails(@RequestBody Mall robj2)
	{
		return servobj.putDetails(robj2);
	}
   @DeleteMapping("/delete/{no}")
   public String Delete(@PathVariable("no") int MallNo)
   {
	   servobj.delete(MallNo);
	   return "Deleted Successfully!💥";
   }
}

