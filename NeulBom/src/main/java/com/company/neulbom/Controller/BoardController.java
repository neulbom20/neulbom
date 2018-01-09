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

import com.company.neulbom.Domain.BoardVO;
import com.company.neulbom.Domain.PageMaker;
import com.company.neulbom.Domain.SearchCriteria;
import com.company.neulbom.Service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService bs;	
	
	@RequestMapping(value="/Spring/BoardListController")
	public String BoardList(@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		
	 //System.out.println("BoardListController의 bs:"+bs);
		
		int cnt=0;
		cnt=bs.totalRecordCount(scri); 
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setScri(scri);
		pageMaker.setTotalCount(cnt);
		
		ArrayList<BoardVO> list = bs.getBoardList(scri);
	    
		model.addAttribute("list",list);
	 //뒤 list로 담아서 앞 list로 보낸다(~~~List.jsp/"${list}")
	 //System.out.println("BoardListController의 list:"+list);
		model.addAttribute("pageMaker", pageMaker);		
	 //System.out.println("BoardListController의 pageMaker:"+pageMaker);

		return "/board/BoardList";
	}

	@RequestMapping(value="/Spring/BoardContentController")
	public String BoardContent(@RequestParam("board_idx") int board_idx,@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		//앞에 파란색은 jsp로 보내는거고 뒤에 갈색은 ServiceImpl(Service,Mapper,Mapper.xml 모두와 연관)로 받아서 보내는거
		
		BoardVO bv=null;
		bv = bs.getBoard(board_idx);
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setScri(scri);
		
		model.addAttribute("bv", bv);
		System.out.println("BoardContentController의 bv:"+bv);
		model.addAttribute("pageMaker", pageMaker);
		System.out.println("BoardContentController의 pageMaker:"+pageMaker);

		return "/board/BoardContent";
	}

	@RequestMapping(value="/Spring/BoardWriteController")
	public String BoardWrite(@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		
		model.addAttribute("scri", scri);
	
		return "/board/BoardWrite";
	}
	
	@RequestMapping(value="/Spring/BoardWriteActionController")
	public String BoardWriteAction(@ModelAttribute("bv") BoardVO bv,@ModelAttribute("scri") SearchCriteria scri, Model model) throws Exception{
		
		String url="";
		int rrd=0;
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
		String date = sdf.format(dt);		
		date = date.substring(2);
		
		bv.setBoard_idx(1); 
		bv.setBoard_date(date);	
		
		rrd = bs.writeBoard(bv);
		
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());
		
		if(rrd ==1){
			url = "redirect:/Spring/BoardListController";
		}else{
			url = "BoardWrite";
		}
	
		return url;
	}
	
	@RequestMapping(value="/Spring/BoardModifyController")
	public String BoardModify(@RequestParam("board_idx") int board_idx,@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{
		
		BoardVO bv= null;
		bv = bs.getBoard(board_idx);		
		
		model.addAttribute("bv", bv);
		model.addAttribute("scri", scri);

		return "/board/BoardModify";
	}
	
	@RequestMapping(value="/Spring/BoardModifyActionController")
	public String BoardModifyAction(@ModelAttribute("bv") BoardVO bv,@ModelAttribute("scri") SearchCriteria scri, Model model) throws Exception{
		
		String url="";
		int rrd=0;
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
		String date = sdf.format(dt);		
		date = date.substring(2);		
	
		bv.setBoard_date(date);	
		
		rrd = bs.modifyBoard(bv);		
		
		model.addAttribute("board_idx", bv.getBoard_idx());
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());
		
		if(rrd ==1){
			url = "redirect:/Spring/BoardContentController";
		}else{
			url = "BoardModify";
		}	

		return url;	
	}
	
	@RequestMapping(value="/Spring/BoardDeleteActionController")
	public String BoardDeleteAction(@RequestParam("board_idx") int board_idx,@ModelAttribute("scri") SearchCriteria scri,Model model) throws Exception{

		String url="";
		int rrd=0;
		
		model.addAttribute("page", scri.getPage());
		model.addAttribute("searchType", scri.getSearchType());
		model.addAttribute("keyword", scri.getKeyword());	
		
		rrd = bs.deleteBoard(board_idx);		
				
		if(rrd ==1){
			url = "redirect:/Spring/BoardListController";
		}else{
			model.addAttribute("board_idx", board_idx);
			url = "BoardContent";
		}
		
		return url;
	}
}