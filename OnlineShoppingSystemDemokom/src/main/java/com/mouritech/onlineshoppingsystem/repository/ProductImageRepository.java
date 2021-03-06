package com.mouritech.onlineshoppingsystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlineshoppingsystem.entity.ProductImage;

@Repository
public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {



	Optional<ProductImage> findByProduct_ProdId(String prodId);

	Optional<ProductImage> findByImageIdAndProduct_ProdId(Long imageId, String prodId);

	
}
