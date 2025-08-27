package org.miniecom.miniecomtow.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "OrderItems")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class OrderItem {
    @Id
    @GeneratedValue
    private long id;
}
