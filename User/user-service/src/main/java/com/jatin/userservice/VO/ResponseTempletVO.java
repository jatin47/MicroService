package com.jatin.userservice.VO;

import com.jatin.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTempletVO {

    public User user;
    public Department department;
    
}
