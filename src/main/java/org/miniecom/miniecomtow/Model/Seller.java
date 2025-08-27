package org.miniecom.miniecomtow.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.action.internal.OrphanRemovalAction;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "sellers")
@NoArgsConstructor @AllArgsConstructor
public class Seller extends User{
    @Column(nullable = false)
    private String storeName;
    @Column(nullable = false)
    private String businessLicense;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Product> products=new ArrayList<>();
}
