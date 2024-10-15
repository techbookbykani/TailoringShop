package com.tech.book.by.kani.tailoringshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TailoringShopController {

    @GetMapping("/shopDetails")
    public String getShopDetails() {
        return "TailoringShopByKani";
    }
}
