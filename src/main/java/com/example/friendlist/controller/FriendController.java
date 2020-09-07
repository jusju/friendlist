package com.example.friendlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.friendlist.model.Friend;

@Controller
public class FriendController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(@RequestParam(name="name", required=false) String name, Model model) {
		Friend friend = new Friend();
		model.addAttribute("friend", friend);
		return "index";
	}
	
	
}
