package com.example.shoppingMall.dto;

import com.example.shoppingMall.entity.Category;
import com.example.shoppingMall.entity.Product;
import com.example.shoppingMall.entity.ShopEntity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@NoArgsConstructor
public class ShopDto {
    private Long id;
    @Setter
    private String name;
    @Setter
    private  String description;
    @Setter
    private CategoryDto category;
    @Setter
    private UserDto owner;
    @Setter
    @Enumerated(EnumType.STRING)
    private ShopEntity.OwnerStatus ownerStatus = ShopEntity.OwnerStatus.PREPARING;
    @Setter
    private String rejectReason;
    @Setter
    private String closeReason;
    @Setter
    private LocalDateTime lastShoppingTime;


    public static ShopDto fromEntity(ShopEntity shop) {
        ShopDto shopDto = new ShopDto();
        shopDto.id = shop.getId();
        shopDto.name = shop.getName();
        shopDto.description = shop.getDescription();
        shopDto.category = CategoryDto.fromEntity(shop.getCategory());
        shopDto.owner = UserDto.fromEntity(shop.getOwner());
        shopDto.ownerStatus = shop.getOwnerStatus();
        shopDto.rejectReason = shop.getRejectReason();
        shopDto.closeReason = shop.getCloseReason();
        shopDto.lastShoppingTime = shop.getLastShoppingTime();
        return shopDto;
    }
}