package com.stc.filemanager.controller;

import com.stc.filemanager.entity.Item;
import com.stc.filemanager.enums.ItemType;
import com.stc.filemanager.enums.PermissionLevel;
import com.stc.filemanager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

/**
 * @author : Somaia_Saeed
 * @since :  3/11/2023
 **/
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService serviceItem;

    @PostMapping(path = "/{itemType}")
    public ResponseEntity<Item> CreateItem(@RequestBody Item item, @PathVariable ItemType itemType) throws IOException {
        Item savedItem = serviceItem.createItem(item,itemType);

        if (savedItem != null)
            return ResponseEntity.status(HttpStatus.CREATED).body(savedItem);
        else
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

//    @GetMapping("/{fileId}/metadata")
//    public ResponseEntity<Map<String, Object>> getFileMetadata(@PathVariable Long fileId, @RequestParam String userEmail) {
//
//        Map<String, Object> metadata = serviceItem.getFileMetadata(fileId, userEmail);
//
//        if (metadata != null)
//            return ResponseEntity.status(HttpStatus.CREATED).body(metadata);
//        else
//            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
//    }

}