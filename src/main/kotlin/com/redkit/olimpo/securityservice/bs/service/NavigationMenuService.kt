package com.redkit.olimpo.securityservice.bs.service

import com.redkit.olimpo.securityservice.eis.bo.NavigationMenu

/**
 * @company RedKit
 * @project Olimpo - security-service
 * @version V1.0.0
 * @author bryanarriaza - Bryan Javier Arriaza Guitron
 * @since Guatemala, 18/03/18 10:10
 */

interface NavigationMenuService {

    fun findByProfileMenu(_profileMenu: String): NavigationMenu?

}