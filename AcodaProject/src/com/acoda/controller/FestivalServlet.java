package com.acoda.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

import com.acoda.biz.FestivalBIZ;
import com.acoda.vo.FestivalVO;

@Controller
@RequestMapping("/festival")
public class FestivalServlet {

   @Autowired
   FestivalBIZ festivalBIZ;

   //list보여주는곳.
   @RequestMapping("/select.do")
   public String f_Select(Model m,HttpSession session)throws Exception {
      m.addAttribute("all", festivalBIZ.getAllFestival());
      session.removeAttribute("searchKeyword");
      return "festival/list_festival";      

   }
   //insert
   @RequestMapping(value ="/insert.do", method=RequestMethod.GET)
   public String f_insert(@ModelAttribute FestivalVO vo) {
      System.out.println("여기는 인서트 추가하는 곳");
      festivalBIZ.getInsertFestival(vo);
      return "redirect:/festival/select.do";
   }
   //insert페이지로 넘어감
   @RequestMapping("/insert_page.do")
   public ModelAndView Festival_insertpage() {
      System.out.println("여기서 넘어가는건가?");
      InternalResourceView irv = new InternalResourceView("/input/input_festival.jsp");
      return new ModelAndView(irv);
   }

   //삭제
   @RequestMapping(value = "/delete.do", method = RequestMethod.GET)
   public ModelAndView Festival_delete(@RequestParam("del_number") String name) {
      System.out.println("여긴 컨트롤러 딜리트");
      InternalResourceView irv = new InternalResourceView("/festival/select.do");
      if (festivalBIZ.getDelFestival(name) > 0) {
         System.out.println("여기까지느 온다");
         return new ModelAndView(irv);
      } else {
         System.out.println("삭제오류");
      return null;   
      }
   }
   //파인드
   @RequestMapping(value = "/find.do", method = RequestMethod.GET)
   public ModelAndView Festival_find(@RequestParam("find_number") String f_number,Model m) {
      System.out.println("여기는 파인드" + f_number);
      FestivalVO v = festivalBIZ.getFindFestival(f_number);
      //m.addAttribute("find",v);   
      InternalResourceView irv = new InternalResourceView("/input/update_festival.jsp");
      return new ModelAndView(irv,"find",v);
   }
   //업데이트
   @RequestMapping(value="update.do",method=RequestMethod.POST)
   public ModelAndView Festival_update(@ModelAttribute FestivalVO vo) {
      System.out.println("여기는 업데이트 서블릿");
       festivalBIZ.getUpdateFestival(vo);
      InternalResourceView irv = new InternalResourceView("/festival/select.do");
      ModelAndView mav=new ModelAndView(irv);
      return mav;
   }
   
   //검색
   @RequestMapping(value="/search.do",method=RequestMethod.GET)
 public String Festival_search(@RequestParam ("searchKeyword") String s,Model m,HttpSession session) {
      session.setAttribute("searchKeyword", s);
      List<FestivalVO> list = festivalBIZ.getSearch(s);
      m.addAttribute("all",list);
   return "festival/list_festival";
   }

   @RequestMapping(value="/click.do",method=RequestMethod.GET)
   public String festival_click(@RequestParam("click_number") String name ,Model m) {
       System.out.println("여기는 클릭 컨트롤러"+festivalBIZ.getClickfestival(name).size());
      m.addAttribute("click", festivalBIZ.getClickfestival(name));
      return "festival/click_festival";
   }
}