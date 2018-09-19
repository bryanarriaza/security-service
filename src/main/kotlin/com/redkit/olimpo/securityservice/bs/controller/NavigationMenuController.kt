package com.redkit.olimpo.securityservice.bs.controller

import com.redkit.olimpo.securityservice.bs.service.NavigationMenuService
import com.redkit.olimpo.securityservice.eis.bo.NavigationMenu
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMethod

/**
 * @company RedKit
 * @project Olimpo - security-service
 * @version V1.0.0
 * @author bryanarriaza - Bryan Javier Arriaza Guitron
 * @since Guatemala, 18/03/18 10:33
 */

@RestController
@CrossOrigin
@RequestMapping(value = "/menu2", produces = arrayOf(MediaType.APPLICATION_JSON_VALUE), headers = ["Accept=application/json"])
class NavigationMenuController {

    var navigationMenuServie: NavigationMenuService

    @Autowired
    constructor(_navigationMenuServie: NavigationMenuService) {
        this.navigationMenuServie = _navigationMenuServie
    }

    @GetMapping(value = "/test/{id}")
    fun getNavigationMenu(@PathVariable("id") _idMenu: String): ResponseEntity<NavigationMenu> {
        return ResponseEntity<NavigationMenu>(navigationMenuServie.findByProfileMenu(_idMenu), HttpStatus.OK)
    }

}