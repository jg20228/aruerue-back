package com.aruerue.shop.model.user;

<<<<<<< HEAD
=======
//import javax.persistence.*;
>>>>>>> c3ce0af68d3d29589e62f7f56fded8857d096b13

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

<<<<<<< HEAD
=======
//@Entity
>>>>>>> c3ce0af68d3d29589e62f7f56fded8857d096b13
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

<<<<<<< HEAD
    private int id;
=======
   // @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
  //  @Column(unique = true)
>>>>>>> c3ce0af68d3d29589e62f7f56fded8857d096b13
    private String username;
    private String password;
    private String email;
    private String name;
    private String gender;
    private String phone;
    private String address;
    private String detail_address;
    private String provider;
    private String providerId;
    private Timestamp birthday;
    private int total_amount;
    private String role;
<<<<<<< HEAD
    private boolean  cancel;
=======
//    private String cancel;
>>>>>>> c3ce0af68d3d29589e62f7f56fded8857d096b13
    private String profile;
    private Timestamp createDate;


    // ENUM으로 안하고 ,로 해서 구분해서 ROLE을 입력 -> 그걸 파싱!!
<<<<<<< HEAD
//    public List<String> getRoleList(){
//    	System.out.println("model.User의 getRoleList()에 왔습니다");
//        if(this.role.length() > 0){
//        	System.out.println("model.User의 getRoleList()의 if문에 왔습니다");
//            return Arrays.asList(this.role.split(","));
//        }
//        return new ArrayList<>();
//    }
=======
    public List<String> getRoleList(){
    	System.out.println("model.User의 getRoleList()에 왔습니다");
        if(this.role.length() > 0){
        	System.out.println("model.User의 getRoleList()의 if문에 왔습니다");
            return Arrays.asList(this.role.split(","));
        }
        return new ArrayList<>();
    }
>>>>>>> c3ce0af68d3d29589e62f7f56fded8857d096b13
}
