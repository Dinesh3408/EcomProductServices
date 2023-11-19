package com.scaler.EcomProductService.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@Getter
@Setter

public class ProductListResponseDTO {
    private List<ProductResponseDTO> products;

}
