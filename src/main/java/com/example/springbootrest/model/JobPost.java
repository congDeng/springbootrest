package com.example.springbootrest.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPost {

    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;

    @Column(name = "post_tech_stack")
    private String postTechStack;

    // Convert List<String> to a comma-separated String for storage
    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = String.join(",", postTechStack);
    }

    // Convert comma-separated String back to List<String>
    public List<String> getPostTechStack() {
        return Arrays.asList(postTechStack.split(","));
    }
}