package com.company.neulbom.Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.neulbom.Domain.PhotoAlbumVO;
import com.company.neulbom.Domain.PageMaker;
import com.company.neulbom.Domain.SearchCriteria;
import com.company.neulbom.Service.PhotoAlbumService;

@Controller
public class PhotoAlbumController {
	
	@Autowired
	private PhotoAlbumService pas;	
	
	@RequestMapping(value="/Spring/PhotoAlbumListController")
	public String PhotoAlbumList(@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		
		int cnt=0;
		cnt=pas.totalRecordCount(scri);
	
		PageMaker pageMaker = new PageMaker();
		pageMaker.setScri(scri);		
		pageMaker.setTotalCount(cnt);		
		
		ArrayList<PhotoAlbumVO> alist = pas.getPhotoAlbumList(scri);
	
		model.addAttribute("list",alist);
		model.addAttribute("pageMaker", pageMaker);		

		return "/photoalbum/PhotoAlbumList";
	}
	
	@RequestMapping(value="/Spring/PhotoAlbumContentController")
	public String PhotoAlbumContent(@RequestParam("photoalbum_idx") int photoalbum_idx,@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		
		PhotoAlbumVO pav=null;
		pav = pas.getPhotoAlbum(photoalbum_idx);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setScri(scri);
		
		model.addAttribute("pav", pav);
		model.addAttribute("pageMaker", pageMaker);

		return "/photoalbum/PhotoAlbumContent";
	}
	
	@RequestMapping(value="/Spring/PhotoAlbumWriteController")
	public String PhotoAlbumWrite(@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		
		model.addAttribute("scri", scri);
		
		return "/photoalbum/PhotoAlbumWrite";
	}
	
	@RequestMapping(value="/Spring/PhotoAlbumWriteActionController")
	public String PhotoAlbumWriteAction(@ModelAttribute("pav") PhotoAlbumVO pav,@ModelAttribute("scri") SearchCriteria scri, Model model) throws Exception{
		
		String url="";
		int rrd=0;
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
		String date = sdf.format(dt);		
		date = date.substring(2);
		
		pav.setPhotoalbum_idx(1); 
		pav.setPhotoalbum_date(date);
	
		rrd = pas.writePhotoAlbum(pav);
		
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());
		
		if(rrd ==1){
			url = "redirect:/Spring/PhotoAlbumListController";
		}else{
			url = "PhotoAlbumWrite";
		}
	
		return url;
	}
	
	@RequestMapping(value="/Spring/PhotoAlbumModifyController")
	public String PhotoAlbumModify(@RequestParam("photoalbum_idx") int photoalbum_idx,@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		
		PhotoAlbumVO pav= null;
		pav = pas.getPhotoAlbum(photoalbum_idx);		
		
		model.addAttribute("pav", pav);
		model.addAttribute("scri", scri);

		return "/photoalbum/PhotoAlbumModify";
	}
	
	@RequestMapping(value="/Spring/PhotoAlbumModifyActionController")
	public String PhotoAlbumModifyAction(@ModelAttribute("pav") PhotoAlbumVO pav,@ModelAttribute("scri") SearchCriteria scri, Model model) throws Exception{
		
		String url="";
		int rrd=0;
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
		String date = sdf.format(dt);		
		date = date.substring(2);		
	
		pav.setPhotoalbum_date(date);	
		
		rrd = pas.modifyPhotoAlbum(pav);		
		
		model.addAttribute("idx", pav.getPhotoalbum_idx());
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());
		
		if(rrd ==1){
			url = "redirect:/Spring/PhotoAlbumContentController";
		}else{
			url = "PhotoAlbumModify";
		}	

		return url;	
	}
	
	@RequestMapping(value="/Spring/PhotoAlbumDeleteActionController")
	public String PhotoAlbumDeleteAction(@RequestParam("photoalbum_idx") int photoalbum_idx,@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		
		String url="";
		int rrd=0;
		
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());	
		
		rrd = pas.deletePhotoAlbum(photoalbum_idx);		
				
		if(rrd ==1){
			url = "redirect:/Spring/PhotoAlbumListController";
		}else{
			model.addAttribute("photoalbum_idx", photoalbum_idx);
			url = "PhotoAlbumContent";
		}
		
		return url;
	}
}