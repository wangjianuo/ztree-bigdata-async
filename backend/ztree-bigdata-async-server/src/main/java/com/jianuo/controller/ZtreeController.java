package com.jianuo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/ztree")
@Controller
public class ZtreeController {

    @RequestMapping(value = "/list", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public List getList(@RequestBody Map<String, Object> param, HttpServletRequest request) {
        try {
            String idStr = request.getParameter("id").toString();
            String nameStr = request.getParameter("count").toString();
//            Integer count = (Integer) param.get("id");

            List list = new ArrayList();
            for (int i = 1; i < 100; i++) {
                Map<String, Object> node = new HashMap<>();
                node.put("id", i);
                node.put("name", "tree" + i);
                list.add(node);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }
}
