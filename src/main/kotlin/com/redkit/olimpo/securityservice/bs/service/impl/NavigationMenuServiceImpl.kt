package com.redkit.olimpo.securityservice.bs.service.impl

import com.redkit.olimpo.securityservice.bs.repository.NavigationMenuRepository
import com.redkit.olimpo.securityservice.bs.service.NavigationMenuService
import com.redkit.olimpo.securityservice.eis.bo.NavigationMenu
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * @company RedKit
 * @project Olimpo - security-service
 * @version V1.0.0
 * @author bryanarriaza - Bryan Javier Arriaza Guitron
 * @since Guatemala, 18/03/18 10:11
 */

@Service
class NavigationMenuServiceImpl(val navigationMenuRepository: NavigationMenuRepository) : NavigationMenuService {

    override fun findByProfileMenu(_profileMenu: String) = navigationMenuRepository.findByProfileMenu(_profileMenu)

}