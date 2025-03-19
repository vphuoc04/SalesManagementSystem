package com.example.backend.modules.products.requests.ProductBrand;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UpdateRequest {
    @NotBlank(message = "Name is requried")
    private String name;
}
