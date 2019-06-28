package com.bitcamp.web.entityes;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;



/*
엔티티를 영구 저장하는 환경으로, 논리적인 개념입니다.

특징
1) persistence context는 엔티티의 @Id 필드를 이용하여 엔티티를 식별합니다.

따라서 엔티티를 정의할 때 식별자 값이 꼭 있어야 합니다.


2) persistence context에는 쓰기 지연 기능이 있습니다.

즉 값을 변경하자마자 바로 DB에 반영하는 것이 아니라, persistence context에 쓰기 지연 SQL 저장소가 있어서 SQL 쿼리들을 저장해 뒀다가, 엔티티 매니저가 commit() 메서드를 호출할 때 DB에 반영됩니다.

이를 flush라 합니다.


3) 그 밖에 1차 캐시 , 동일성 보장, 변경 감지, 지연 로딩 등의 특징이 있습니다.
*/

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@ToString
@Table(name = "customers")
public class Customer implements Serializable {


   private static final long serialVersionUID = 1L;
   @Id
   private Long id;
   @GeneratedValue(strategy=GenerationType.AUTO)

 // 오른쪽 DTO에 실제값이 왼쪽 name지정한 곳 에 메핑된다.
   @Column(name="customer_id") private String customerId; 
   @Column(name="customer_name") private String customerName;
   @Column(name="password") private String password;
   @Column(name="ssn") private String ssn;
   @Column(name="phone") private String phone;
   @Column(name="city") private String city;
   @Column(name="address") private String address;
   @Column(name="postalcode") private String postalcode;
   @Column(name="photo") private String photo;

   @Builder
   private Customer(String customerId,String customerName,
   String password,String ssn,String phone,String city,
   String address,String postalcode,String photo){
       this.customerId = customerId;
       this.customerName = customerName;
       this.password = password;
       this.ssn = ssn;
       this.phone = phone;
       this.city = city;
       this.address = address;
       this.postalcode = postalcode;
       this.photo = photo;
   }

   @Override
   public String toString(){
       return String.format("고객정보 No: %d\n"
       +"ID: %s", id, customerId);
   }

   
}