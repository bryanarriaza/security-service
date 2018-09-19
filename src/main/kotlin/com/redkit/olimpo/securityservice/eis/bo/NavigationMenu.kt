package com.redkit.olimpo.securityservice.eis.bo

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.io.Serializable

/**
 * @author bryanarriaza - Bryan Javier Arriaza Guitron
 * @version v1.0.0
 * @company RedKit
 * @project Olimpo - security-service
 * @since Guatemala, 18/03/18 09:28
 */

@Document(collection = "testmongo")
data class NavigationMenu(
        @Field("profile") var profileMenu: String
) : Serializable