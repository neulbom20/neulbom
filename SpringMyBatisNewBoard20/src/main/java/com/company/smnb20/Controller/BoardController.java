package com.company.smnb20.Controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.company.smnb20.Service.BoardDao_Father;
import com.company.smnb20.Service.BoardDao_Son;
import com.company.smnb20.domain.BoardVo;
import com.company.smnb20.domain.PageMaker;
import com.company.smnb20.domain.SearchCriteria;

@Controller
public class BoardController {	

	@Resource(name="boardDao_Son")
	private BoardDao_Son bd;	
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="/spring/ListController")
	public String List(@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		
//		System.out.println("컨트롤러의 keyword입니다:"+scri.getKeyword());
//		System.out.println("컨트롤러의 searchType입니다:"+scri.getSearchType());
//		System.out.println("컨트롤러의 page:"+scri.getPage());
//		System.out.println("컨트롤러의 perPageNum:"+scri.getPerPageNum());
			
		int cnt=0;
		cnt=bd.totalRecordCount(scri);
	//	System.out.println("컨트롤러의 cnt:"+cnt);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setScri(scri);		
		pageMaker.setTotalCount(cnt);		
		
		ArrayList<BoardVo> alist = bd.getBoardList_T(scri);
	
		model.addAttribute("list",alist);
		model.addAttribute("pageMaker", pageMaker);		
		
		return "List";
	}
	
	@RequestMapping(value="/spring/ContentController")
	public String Content(@RequestParam("bidx") int bidx,
			@ModelAttribute("scri") SearchCriteria scri,Model model) {
					
		BoardVo bv=null;
		bv = bd.getSelect(bidx);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setScri(scri);
		
		model.addAttribute("bv", bv);
		model.addAttribute("pageMaker", pageMaker);
		
		return "Content";
	}
	@RequestMapping(value="/spring/ModifyController")	
	public String Modify(@RequestParam("bidx") int bidx,
			@ModelAttribute("scri") SearchCriteria scri,Model model) {
						
		BoardVo bv= null;
		bv = bd.getSelect(bidx);		
		
		model.addAttribute("bv", bv);
		model.addAttribute("scri", scri);
		
		return "Modify";
		
	}
	@RequestMapping(value="/spring/ModifyActionController")
	public String ModifyAction(@ModelAttribute("bv") BoardVo bv,
			@ModelAttribute("scri") SearchCriteria scri, Model model) {
		
		String url="";
		int rrd=0;
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
		String date = sdf.format(dt);		
		date = date.substring(2);		
	
		bv.setModifyday(date);	
		
		rrd = bd.getUpdate(bv);		
		
		model.addAttribute("bidx", bv.getBidx());
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());
		
		if(rrd ==1){
			url = "redirect:/spring/ContentController";
		}else{
			url = "Modify";
		}	

		return url;		
	}
	@RequestMapping(value="/spring/WriteController")
	public String Write(@ModelAttribute("scri") SearchCriteria scri,Model model) {
				
		model.addAttribute("scri", scri);
		
		return "Write";
	}
	@RequestMapping(value="/spring/WriteActionController")
	public String WriteAction(@ModelAttribute("bv") BoardVo bv,
			@ModelAttribute("scri") SearchCriteria scri, Model model) {
		
		String url="";
		int maxBidx=0;
		int rrd=0;
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
		String date = sdf.format(dt);		
		date = date.substring(2);
		
		bv.setIdx(1);  //회원번호 1 임시
		bv.setWriteday(date);
	
		maxBidx = bd.getMaxBidx();		
		
		rrd = bd.getInsert(bv, maxBidx+1);
		
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());
		
		if(rrd ==1){
			url = "redirect:/spring/ListController";
		}else{
			url = "Write";
		}
	
		return url;
	}
	@RequestMapping(value="/spring/DeleteActionController")
	public String DeleteAction(@RequestParam("bidx") int bidx,
			@ModelAttribute("scri") SearchCriteria scri,Model model) {
	
		String url="";
		int rrd=0;
		
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());	
		
		rrd = bd.getDelete(bidx);		
				
		if(rrd ==1){
			url = "redirect:/spring/ListController";
		}else{
			model.addAttribute("bidx", bidx);
			url = "Content";
		}
		
		return url;
		
	}
	@RequestMapping(value="/spring/ReplyController")
	public String Reply(@ModelAttribute("bidx") int bidx, SearchCriteria scri, Model model,@ModelAttribute("bv") BoardVo bv){
		
		
		bv = bd.getSelect(bidx);
		
		model.addAttribute("bv", bv);
		model.addAttribute("scri", scri);
							
		return "Reply";
		
		
		
		
	}
	
	@RequestMapping(value="/spring/ReplyActionController")
	public String ReplyAction(@ModelAttribute("bv") BoardVo bv,
			@ModelAttribute("scri") SearchCriteria scri, Model model) {
	
		String url="";
		int rrd = 0;
		int maxBidx = 0;
		
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");			
		String date = sdf.format(dt);		
		date = date.substring(2);
		
		bv.setIdx(2); //회원번호2 임시
		bv.setWriteday(date);
		
		maxBidx = bd.getMaxBidx();
		
		rrd = bd.getReply(bv, maxBidx+1);
	
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());	
		if(rrd ==1){
			url = "redirect:/spring/ListController";
		}else{
			model.addAttribute("bidx", bv.getBidx());
			url = "Reply";
		}
		return url;
	}
	
}
