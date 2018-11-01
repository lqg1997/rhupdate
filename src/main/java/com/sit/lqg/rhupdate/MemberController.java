package com.sit.lqg.rhupdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/yanlord_member",method = RequestMethod.GET)
public class MemberController {
    @Autowired
    public MemberRepository memberRepository;

    @GetMapping(value = "/allyanlord_member")
    public List <Member> getALLyanlord_memberInfo(){
        return memberRepository.findAll ();
    }


}
