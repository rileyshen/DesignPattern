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
[see more details](https://rileyshen.github.io/post/designpattern1/)    
    

5. Builder pattern:  
   5. 1 DecorationPackage (https://github.com/rileyshen/DesignPattern/tree/main/builder/src/main/java/apartdeco)
        different combination of ceiling, floor, tile deco levels
   5. 2 fast food ordering system  (https://github.com/rileyshen/DesignPattern/tree/main/builder/src/main/java/faststore)
      [see more details](https://rileyshen.github.io/post/designpattern2/)
      
   5.3 game actors  (https://github.com/rileyshen/DesignPattern/tree/main/builder/src/main/java/game)
6. Prototype pattern
   shallowClone
   deepClone:
   //Serialization : put object into stream
   ByteArrayOutputStream bao = new ByteArrayOutputStream();
   ObjectOutputStream oos = new ObjectOutputStream(bao);
   oos.writeObject(this);

        // read object from strom
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Log)ois.readObject();

Prototype Manager： store those objects in a set

use Prototype design an item banking, create Multiple choice question, Q & A,