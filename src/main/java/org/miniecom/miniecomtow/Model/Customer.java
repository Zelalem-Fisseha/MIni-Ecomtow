package org.miniecom.miniecomtow.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="customers")
@Setter @Getter
@NoArgsConstructor @AllArgsConstructor
public class Customer extends User{
    @Column(nullable = false)
    private String shippingAddress;
    @Column(nullable = false)
    private String phoneNumber;

}
