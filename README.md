design patter from real life：

1. [simple factory： design a calculator(https://github.com/rileyshen/DesignPattern/tree/main/exe-demo-design-1-00/src/main/java/org/exe/demo/simplefac)
v1.1: add a new operation "sqrt"? 


2. factory method ： design a calculator (https://github.com/rileyshen/DesignPattern/tree/main/exe-demo-design-1-00/src/main/java/org/exe/demo/factoryMethod)
   
   simple factory: add a new operation "M^N"? 
   need to change code in OperationFactory, 
   break open closed principle.
   use factory method to solve the problem
   
3. use factory method design a "Customer loyalty program", include : coupon, goods, gift card (https://github.com/rileyshen/DesignPattern/tree/main/exe-demo-design-1-00/src/main/java/org/exe/demo/shop)
  3 interface: 
   1. Counpon:   CouponResult sendCoupon(String uId, String couponNumbner, String uuid);
   2. Goods:   Boolean deleverGoods (DeliverReq req);
   3. gift card:  void grantToken(String phoneNumber, String cardId);
   
4.  design a Sqlserver has a function insert user and get User by id 
now how about you need add a department form?
[see more details](https://rileyshen.github.io/post/designpattern/)    
    

5. Builder pattern