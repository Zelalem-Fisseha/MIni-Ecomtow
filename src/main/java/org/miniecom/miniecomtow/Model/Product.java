package org.miniecom.miniecomtow.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String productName;
    @Column(nullable = false)
    private String productDescription;
    @Column(nullable = false)
    private String productPrice;
    @Column(nullable = false)
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    private Seller seller;

}
