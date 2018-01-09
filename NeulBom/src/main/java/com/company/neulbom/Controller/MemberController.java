package com.company.neulbom.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import com.company.neulbom.Domain.MemberVO;
import com.company.neulbom.Service.MemberServiceImpl;


@Controller
public class MemberController {

	@Autowired
	MemberServiceImpl msi ;
	
//동의 페이지
	@RequestMapping(value="/Spring/MemberJoinAgreeController")
	public String MemberJoinAgree()throws Exception{

		return "/member/MemberJoinAgree";

	}

//
//	//회원가입 입력
@RequestMapping(value="/Spring/MemberJoinController")
	public String MemberJoin() throws Exception{

		return "/member/MemberJoin";

	}
	@RequestMapping(value="/Spring/MemberJoinActionController")
	public String MemberJoinAction(@ModelAttribute("mv") MemberVO mv,Model model ) throws Exception{
	//테스트
	String url="";
	int rrd=0;

	
	Date dt = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
	String date = sdf.format(dt);		
	date = date.substring(2);
	



	mv.setMember_date(date);
	rrd = msi.insertMember(mv);
		
	if(rrd ==1){
		url = "redirect:/Spring/MemberJoinCheckController";
	}else{
		url = "redirect:/Spring/MemberJoinController";
	}

		return url;
	}
	
	@RequestMapping(value="/Spring/MemberJoinCheckController")
public String MemberJoinCheck() throws Exception{
	
		
	return "/member/MemberJoinCheck";
		
}
//	
//	
//	
//	//회원정보수정
	@RequestMapping(value="/Spring/MemberModifyController")
	public String MemberModify(@ModelAttribute("Member_idx") int Member_idx,Model model) throws Exception{
		
		
	//	System.out.println("member_idx:"+Member_idx);
	
	MemberVO mv= msi.getMember(Member_idx);		
		
	model.addAttribute("mv", mv);
	//System.out.println("mv:"+mv);
	return "/member/MemberInfoModify";
	}
	
	@RequestMapping(value="/Spring/MemberModifyActionController")
	public String MemberModifyAction(@ModelAttribute("mv") MemberVO mv,@ModelAttribute("member_idx") int Member_idx,Model model) throws Exception{
		//System.out.println("mv:"+mv.getMember_idx());
		
		String url="";
		int rrd=0;
	
		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
		String date = sdf.format(dt);		
		date = date.substring(2);		
//	

		mv.setMember_idx(Member_idx);
		mv.setMember_modifydate(date);	
		
		rrd = msi.modifyMember(mv);		
	//	System.out.println("rrd:"+rrd);

//	
		
		if(rrd ==1){
			System.out.println("rrd:"+rrd);
			url = "/member/MemberInfoModifyCheck";
	}else{
		url = "redirect:/Spring/MemberModifyController";
		}	

		return url;
	}
//
//
////	
////	
////	//회원정보탈퇴
	@RequestMapping(value="/Spring/MemberDeleteController")
	public String MemberDelete(@ModelAttribute("member_idx") int Member_idx,Model model) throws Exception{
		
		//System.out.println("member_idx:"+Member_idx);
		
		MemberVO mv= msi.getMember(Member_idx);		
		System.out.println("yn:"+mv.getMember_withdraw());	
		model.addAttribute("mv", mv);
		
		return "/member/MemberDrop";
	}

	@RequestMapping(value="/Spring/MemberDeleteActionController")
	public String MemberDeleteAction(@ModelAttribute("mv") MemberVO mv,@ModelAttribute("member_idx") int Member_idx,Model model) throws Exception{
		//System.out.println("mv:"+mv.getMember_idx());
		System.out.println("member_idx:"+Member_idx);
		System.out.println("yn:"+mv.getMember_withdraw());
		String url="";
		int rrd=0;
	
//		
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");		
		String date = sdf.format(dt);		
		date = date.substring(2);		
////	

		mv.setMember_idx(Member_idx);
		mv.setMember_modifydate(date);	
		
		rrd = msi.deleteMember(mv);		
		System.out.println("rrd:"+rrd);
//
////	
//		
		if(rrd ==1){
			System.out.println("rrd:"+rrd);
			url = "/member/MemberDropCheck";
		}else{
		url = "/member/MemberDrop";
		}	

		return url;
	}

	
////	
	@RequestMapping(value="/Spring/MemberLoginController")
public String MemberLogin() throws Exception{
	
		
	return "/member/Login";
		
}
//////로그인
@RequestMapping(value="/Spring/MemberLoginCheckController")
	public String MemberLoginCheck(@ModelAttribute("mv") MemberVO mvo, HttpServletRequest request) throws Exception{

	System.out.println("mv:"+mvo.getMember_id());
	
	MemberVO mv= msi.MemberLoginCheck(mvo.getMember_id(),mvo.getMember_password());
	System.out.println("mv:"+mv);
	
	HttpSession httpSession =request.getSession();
	httpSession.setAttribute("Member_id", mv.getMember_id());
	httpSession.setAttribute("Member_idx", mv.getMember_idx());
	System.out.println("Member_idx:"+mv.getMember_idx());
		
	
		return "/member/test";
				
		}










	
	
	//중복확인
	@RequestMapping(value="/Spring/MemberCheckController")
	public String MemberCheck(@ModelAttribute("member_id")String member_id,Model model) throws Exception{
		//System.out.println("getMember_id:"+member_id);
		String url="";
		int rrd = 0;
	
		int count=0;
		count= msi.MemberCheck(member_id);
		//System.out.println("count.count:"+count);
		model.addAttribute("count", count);


//			if(rrd ==1){
//			
//			url = "/member/MemberIDCheck";
//			}else{
//			url ="redirect:/Spring/MemberJoinController";
//			}	

		return "/member/MemberIDCheck";
	}

//id 찾기
	@RequestMapping(value="/Spring/MemberIdController")
	public String MemberId() throws Exception{

		
		return "/member/FindID";

	}
	@RequestMapping(value="/Spring/MemberIdActionController")
	public String MemberIdAction(@ModelAttribute("mv") MemberVO mv,Model model) throws Exception{
	//	String url="";
	//	int rrd=0;

		mv = msi.MemberId(mv.getMember_name(),mv.getMember_phone());
		model.addAttribute("mv", mv);
	
	
		return "/member/FindIDCheck";
	}
	
////	//비밀번호 찾기
	@RequestMapping(value="/Spring/MemberPasswordController")
	public String MemberPassword() throws Exception{

		
	return "/member/FindPW";

}
	@RequestMapping(value="/Spring/MemberPasswordActionController")
	public String MemberPasswordAction(@ModelAttribute("mv") MemberVO mv,Model model) throws Exception{
		//	String url="";
		//	int rrd=0;

		mv = msi.MemberPassword(mv.getMember_id(),mv.getMember_name(),mv.getMember_phone());
		model.addAttribute("mv", mv);
//
//		
//
////	System.out.println("-------------------------:"+mv.getMember_password());
//
////	if (mv ==""){
////		
////		url ="/member/FindPWCheck";
////		}else{
////			url ="/member/FindPW";
////			} 
//////					
	return "/member/FindPWCheck";		
//	
	}
//	
	
	

}
