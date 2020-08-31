package com.aruerue.shop.model.review;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review {
private int id;
private int productId;
private String title;
private String content;
private int userId;
private Timestamp createDate;
private int star;
private String img;
<<<<<<< HEAD
private boolean existenceOfImg; //이건 필요없을 듯...
=======
private boolean existenceOfImg;
>>>>>>> c3ce0af68d3d29589e62f7f56fded8857d096b13
private int orderId;
}
