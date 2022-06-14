package org.javabody.formlogin.controller;

import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
public class HelloController {
 // @Autowired
  Producer producer;
  @GetMapping("/hello")
    public String hello(){
      return "hello";
  }
  @RequestMapping("/s")
  public String s(){
    return "success";
  }
  @RequestMapping("/admin/hello")
  public String admin(){
    return "admin";
  }
  @RequestMapping("/user/hello")
  public String user(){
    return "user";
  }
  @GetMapping("/vc.jpg")
  public void getVerifyCode(HttpServletResponse resp, HttpSession session) throws IOException {
    resp.setContentType("image/jpeg");
    String text = producer.createText();
    session.setAttribute("verify_code", text);
    BufferedImage image = producer.createImage(text);
    try(ServletOutputStream out = resp.getOutputStream()) {
      ImageIO.write(image, "jpg", out);
    }
  }
}
