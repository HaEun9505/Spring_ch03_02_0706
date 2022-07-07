package com.haeun.test;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

//      MyCalculator myCal = new MyCalculator(); // 선언
//      
//      myCal.setNum1(20);
//      myCal.setNum2(10);
//            
//      myCal.setCal(new Calculator());	// 초기화
//      
//      
//      myCal.add();
//      myCal.sub();
//      myCal.mul();
//      myCal.div();
      
      
      String config = "classpath:applicationCTX.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);   // 객체 생성
      MyCalculator cal1 = ctx.getBean("myCal2", MyCalculator.class);
      
      cal1.add();
      cal1.sub();
      cal1.mul();
      cal1.div();
      
      ctx.close(); // 사용 후 닫아줘야함
   }

}