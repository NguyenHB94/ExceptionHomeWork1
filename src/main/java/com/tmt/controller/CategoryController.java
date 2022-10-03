package com.tmt.controller;

import com.tmt.entity.Category;
import com.tmt.exception.MyException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {


    //API mang tính đề mô, không tạo DB
    @RequestMapping("/{categoryName}")
    public Category getCategoryByname(@PathVariable("categoryName") String categoryName) {
        if (categoryName.length() <= 5) {
            throw new MyException("Category name độ dài phải lớn hơn 5");
        }

        return new Category(1, "category 1");
    }
}
