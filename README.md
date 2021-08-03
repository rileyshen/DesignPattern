design patter from real life：

1. simple factory： design a calculator
v1.1: add a new operation "sqrt"? 


2. factory method ： design a calculator
   
   simple factory: add a new operation "M^N"? 
   need to change code in OperationFactory, 
   break open closed principle.
   use factory method to solve the problem
   
3. use factory method design a "Customer loyalty program", include : coupon, goods, gift card
  3 interface: 
   1. Counpon:   CouponResult sendCoupon(String uId, String couponNumbner, String uuid);
   2. Goods:   Boolean deleverGoods (DeliverReq req);
   3. gift card:  void grantToken(String phoneNumber, String cardId);
   
4.  design a Sqlserver has a function insert user and get User by id
