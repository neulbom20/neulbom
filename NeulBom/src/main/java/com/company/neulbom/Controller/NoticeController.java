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

import com.company.neulbom.Domain.NoticeVO;
import com.company.neulbom.Domain.PageMaker;
import com.company.neulbom.Domain.SearchCriteria;
import com.company.neulbom.Service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService ns;	

	@RequestMapping(value="/Spring/NoticeListController")
	public String NoticeList(@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{

		//System.out.println("NoticeListController의 ns:"+ns);
		
		int cnt=0;
		cnt=ns.totalRecordCount(scri);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setScri(scri);		
		pageMaker.setTotalCount(cnt);	
		
		ArrayList<NoticeVO> list = ns.getNoticeList(scri);
		
		model.addAttribute("list",list);
		//System.out.println("NoticeListController의 list:"+list);
		model.addAttribute("pageMaker", pageMaker);		
		//System.out.println("NoticeListController의 pageMaker:"+pageMaker);
		
		return "/notice/NoticeList";
	}
	
	@RequestMapping(value="/Spring/NoticeContentController")
	public String NoticeContent(@RequestParam("notice_idx") int notice_idx,@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		

		NoticeVO nv=null;
		nv=ns.getNotice(notice_idx);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setScri(scri);
		
		model.addAttribute("nv", nv);
		//System.out.println("NoticeContentController의 nv:"+nv);
		model.addAttribute("pageMaker", pageMaker);
		//System.out.println("NoticeContentController의 pageMaker:"+pageMaker);

		return "/notice/NoticeContent";
	}	
	
	@RequestMapping(value="/Spring/NoticeWriteController")
	public String NoticeWrite(@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{

		model.addAttribute("scri", scri);
        //System.out.println("NoticeWriteController의 scri:"+scri);
		
		return "/notice/NoticeWrite";
	}
	
	@RequestMapping(value="/Spring/NoticeWriteActionController")
	public String NoticeWriteAction(@ModelAttribute("nv") NoticeVO nv,@ModelAttribute("scri") SearchCriteria scri, Model model) throws Exception{

		String url="";
		int rrd=0;
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
		String date = sdf.format(dt);		
		date = date.substring(2);
		
		nv.setNotice_idx(1); 
		nv.setNotice_date(date);
		//System.out.println("NoticeWriteActionController의 nv:"+nv);
		
		rrd = ns.writeNotice(nv);
		//System.out.println("NoticeWriteActionController의 rrd:"+rrd);
		
		model.addAttribute("page", scri.getPage());
		//System.out.println("NoticeWriteActionController의 page:"+scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		//System.out.println("NoticeWriteActionController의 searchType:"+scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());
		//System.out.println("NoticeWriteActionController의 keyword:"+ scri.getKeyword());
		
		if(rrd ==1){
			url = "redirect:/Spring/NoticeListController";
		}else{
			url = "NoticeWrite";
		}
	
		return url;
	}

	@RequestMapping(value="/Spring/NoticeModifyController")
	public String NoticeModify(@RequestParam("notice_idx") int notice_idx,@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		
		NoticeVO nv= null;
		nv = ns.getNotice(notice_idx);	
		
		model.addAttribute("nv", nv);
		model.addAttribute("scri", scri);

		return "/notice/NoticeModify";
	}
	
	@RequestMapping(value="/Spring/NoticeModifyActionController")
	public String NoticeModifyAction(@ModelAttribute("nv") NoticeVO nv,@ModelAttribute("scri") SearchCriteria scri, Model model) throws Exception{
		
		String url="";
		int rrd=0;
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
		String date = sdf.format(dt);		
		date = date.substring(2);		
	
		nv.setNotice_date(date);	
		
		rrd = ns.modifyNotice(nv);		
		
		model.addAttribute("notice_idx", nv.getNotice_idx());
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());
		
		if(rrd ==1){
			url = "redirect:/Spring/NoticeContentController";
		}else{
			url = "NoticeModify";
		}	

		return url;	
	}
	
	@RequestMapping(value="/Spring/NoticeDeleteActionController")
	public String NoticeDeleteAction(@RequestParam("notice_idx") int notice_idx,@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{

		String url="";
		int rrd=0;
		
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());	
		
		rrd = ns.deleteNotice(notice_idx);		
				
		if(rrd ==1){
			url = "redirect:/Spring/NoticeListController";
		}else{
			model.addAttribute("notice_idx", notice_idx);
			url = "NoticeContent";
		}
		
		return url;
	}
}