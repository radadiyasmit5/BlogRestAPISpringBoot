package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private Long id;
@NotNull
@Size(min = 2,message = "title should be atleast 2 characters long")
private String title;
    @NotNull
    @Size(min = 10,message = "description should be atleast 10 characters long")
private String description;
@NotEmpty
private String content;
Set<CommentDto> comments;

}
