package com.lcwd.rating.service.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_ratings")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {

    @Id
    @Column(name = "RATING_ID")
    private String ratingId;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "HOTEL_ID")
    private String hotelId;
    @Column(name = "RATING")
    private int rating;
    @Column(name = "FEEDBACK")
    private String feedback;

}
