package com.redkit.olimpo.securityservice.bs.repository

import com.redkit.olimpo.securityservice.eis.bo.NavigationMenu
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 * @company RedKit
 * @project Olimpo - security-service
 * @version V1.0.0
 * @author bryanarriaza - Bryan Javier Arriaza Guitron
 * @since Guatemala, 18/03/18 10:04
 */

@Repository
interface NavigationMenuRepository : MongoRepository<NavigationMenu, String> {

    fun findByProfileMenu(_profileMenu: String): NavigationMenu

}