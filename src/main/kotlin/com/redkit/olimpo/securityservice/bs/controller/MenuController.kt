package com.redkit.olimpo.securityservice.bs.controller

import com.redkit.olimpo.securityservice.bs.service.MenuService
import com.redkit.olimpo.securityservice.eis.bo.Menu
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

/**
 * @company RedKit
 * @project Olimpo - security-service
 * @version V1.0.0
 * @author bryanarriaza - Bryan Javier Arriaza Guitron
 * @since Guatemala, 18/03/18 10:33
 */

@Controller
@CrossOrigin
@RequestMapping(value = "/menu")
class MenuController {

    var menuService: MenuService

    @Autowired
    constructor(_menuService: MenuService) {
        this.menuService = _menuService
    }

    @GetMapping(value = "/{id}")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    fun getMenu(@PathVariable("id") _idMenu: String): ResponseEntity<Menu> {
        return ResponseEntity<Menu>(menuService.findById(_idMenu), HttpStatus.OK)
    }

    @GetMapping(value = "/")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    fun getMenus(): ResponseEntity<ArrayList<Menu>> {
        return ResponseEntity<ArrayList<Menu>>(menuService.findAll(), HttpStatus.OK)
    }

}