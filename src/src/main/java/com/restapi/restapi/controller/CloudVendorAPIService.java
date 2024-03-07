package com.restapi.restapi.controller;

import com.restapi.restapi.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
public CloudVendor getCloudVendorDetails(String vendorId)
    {
    return cloudVendor;
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){

        this.cloudVendor = cloudVendor;
        return "success";
    }
}
