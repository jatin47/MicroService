package com.jatin.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jatin.userservice.VO.Department;
import com.jatin.userservice.VO.ResponseTempletVO;
import com.jatin.userservice.entity.User;
import com.jatin.userservice.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTempletVO getUserWithDepartment(Long userId) {
        ResponseTempletVO vo = new ResponseTempletVO();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate
                .getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                 Department.class);

        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }

}
