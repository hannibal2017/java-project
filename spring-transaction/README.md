# spring事务
## 0 搭建环境
  * springboot + MySQL + mybatisplus

## 1.方法A调用方法B  
   ```java
    public String insertA() {
        UserDo userDo = new UserDo();
        userDo.setName("A");
        log.info("UserDoServiceA");
        userDo.insert();

        log.info("UserDoServiceB");
        userDoServiceB.insertB();
        return "yes";
        }
   ```
    能正常入库:
![img.png](picture/img.png)
## REQUIRED，如果只是@Transactional，事务传播类型默认是REQUIRED

#### 1.方法A、B都加上注解transaction，方法B报错，方法A正常。
  * A的代码：  
    ```java
    @Transactional
    public String insertA() {
        UserDo userDo = new UserDo();
        userDo.setName("A");
        log.info("UserDoServiceA");
        userDo.insert();

        log.info("UserDoServiceB");
        userDoServiceB.insertB();
        return "yes";
    }
    ```
  * B的代码：  
   ```java
    @Transactional
    public String insertB() {
        UserDo userDoB = new UserDo();
        userDoB.setName("B");
        userDoB.insert();
        int a = 2 / 0;
        return "yes";
        }
   ```
   * 结果  
     两个方法均没有入库，说明事务起作用了。  

   * 主要日志：  
     ```java
     UserDoServiceA  
     UserDoServiceB  
     Servlet.service() for servlet [dispatcherServlet] in context with path [/api] threw exception [Request processing failed: java.lang.ArithmeticException: / by zero] with root cause
     ```
## 2，方法A加了注解@Transactional，方法B没有加。
   * 没有try，均没有入库。B方法抛错后，会把错误返回A方法；
   * 有try，均入库了。虽然B抛错了，但是在方法A捕获了错误，所以均能入库。
   ```java
    @Transactional
    public String insertA() {
        UserDo userDo = new UserDo();
        userDo.setName("A");
        log.info("UserDoServiceA");
        userDo.insert();

        log.info("UserDoServiceB");
        try {
            userDoServiceB.insertB();
        } catch (Exception e) {
            log.error("error:{}", e.getMessage());
        }
        return "yes";
    }
   ```

## 3,方法A没有事务，方法B有事务  
   ```java
   public String insertA() {
        UserDo userDo = new UserDo();
        userDo.setName("A");
        log.info("UserDoServiceA");
        userDo.insert();

        log.info("UserDoServiceB");
        userDoServiceB.insertB();
        return "yes";
        }
   ```
   * 结果  
     A入库了，B没有。
## REQUIRES_NEW

#### 1、方法A只是@Transactional，方法B加上REQUIRES_NEW
   * 1、方法A没有try，方法B抛错。均没有入库。因为方法B抛错后，方法A也会抛错；
   * 2、方法A有try，方法B抛错。方法B没有入库，方法A捕获了错误，正常入库；  
     + 方法A的代码：  
   ```java
     @Transactional
     public String insertA() {
        UserDo userDo = new UserDo();
        userDo.setName("A");
        log.info("UserDoServiceA");
        userDo.insert();

        log.info("UserDoServiceB");
        try {
            userDoServiceB.insertB();
        } catch (Exception e) {
            log.error("error:{}", e.getMessage());
        }
        return "yes";
    }
   ```
   + 方法B的代码
   ```java
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String insertB() {
        UserDo userDoB = new UserDo();
        userDoB.setName("B");
        userDoB.insert();
        int a = 2 / 0;
        return "yes";
    }
   ```  
   * 3、方法B正常，方法A抛错。  
    
    + 方法A的代码  
   ```java
   @Transactional
   public String insertA() {
        UserDo userDo = new UserDo();
        userDo.setName("A");
        log.info("UserDoServiceA");
        userDo.insert();

        log.info("UserDoServiceB");
        userDoServiceB.insertB();

        int a = 2 / 0;
        return "yes";
        }
   ``` 
   + 方法B的代码  
   ```java
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String insertB() {
        UserDo userDoB = new UserDo();
        userDoB.setName("B");
        userDoB.insert();
        return "yes";
        }
   ```
   + 结果。方法B正常入库，方法A抛错后，未入库。说明子方法B是独立的。
## NESTED，嵌套事务
  #### 1、方法B正常，方法A抛错。均未入库，都回滚了；
  #### 2、方法A正常，方法B抛错。均未入库，都回滚了；
  #### 3、方法B报错，方法Atry了.B未入库，回滚了；A入库了。
   * 方法A的代码  
   ```java
   @Transactional
   public String insertA() {
        UserDo userDo = new UserDo();
        userDo.setName("A");
        log.info("UserDoServiceA");
        userDo.insert();

        log.info("UserDoServiceB");

        try {
        userDoServiceB.insertB();
        } catch (Exception e) {
        log.error("error:{}", e.getMessage());
        }
        return "yes";
        }
   ```
      
