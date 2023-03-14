package com.stc.filemanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import java.util.List;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "permission_groups")
public class PermissionGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String groupName;

//    @OneToMany(mappedBy = "permissionGroup")
//    @OneToMany(targetEntity = Item.class)
//    @Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})
//    @LazyCollection(LazyCollectionOption.TRUE)
//    private List<Item> items;

    @OneToMany(targetEntity=Permission.class)
    private List<Permission> permissions;

}
