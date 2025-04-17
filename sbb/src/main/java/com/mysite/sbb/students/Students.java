package com.mysite.sbb.students;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Students {
    
    @Id
    private String stid; // 학번, 7자리 문자열
    
    @Column(length = 10)
    private String name; // 이름, 10자리 문자열

    @Column(length = 20)
    private String add; // 주소, 20자리 문자열

    private int grade; // 학년, 1자리 정수

    @Column(columnDefinition = "TEXT")
    private String gmemo; // 메모, TEXT
}
