package com.stc.filemanager.entity;

import com.stc.filemanager.enums.ItemType;
import jakarta.persistence.*;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import java.util.List;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ItemType type;

    private String name;

    @ManyToOne(targetEntity = PermissionGroup.class)
    @JoinColumn(name = "permission_group_id")
    private PermissionGroup permissionGroup;

    @ManyToOne(targetEntity = Item.class)
    @JoinColumn(name = "parent_item_id")
    private Item parentItem;

}