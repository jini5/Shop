package com.demo.Shop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded //내장타입을 포함했다는 어노테이션
    private Address address;

    @OneToMany(mappedBy = "member") //읽기전용
    private List<Order> orders = new ArrayList<>();


}
