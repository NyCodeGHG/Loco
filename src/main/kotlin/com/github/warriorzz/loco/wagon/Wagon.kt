package com.github.warriorzz.loco.wagon

import com.github.warriorzz.loco.wagon.utils.WagonType
import net.minecraft.server.v1_16_R3.*
import org.bukkit.Location
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftMinecartRideable
import org.bukkit.event.entity.CreatureSpawnEvent

class Wagon(entityTypes: EntityTypes<*>, world: World) : EntityMinecartRideable(entityTypes, world) {

    private var craftEntity: CraftMinecartRideable? = null
    private var spawned = false

    constructor(location: Location, wagonType: WagonType) : this(EntityTypes.MINECART, (location.world as CraftWorld).handle.minecraftWorld) {
        customName = ChatComponentText(wagonType.name)
        customNameVisible = true

        glowing = true
        displayBlock = Block.getByCombinedId(wagonType.b)


    }

    fun spawn(loc: Location) {
        if (spawned) return
        spawned = true
        val craftWorld: CraftWorld? = loc.world as CraftWorld?
        craftEntity = craftWorld?.addEntity(this, CreatureSpawnEvent.SpawnReason.CUSTOM)

        setLocation(loc.x, loc.y, loc.z, loc.pitch, loc.yaw)
    }

    override fun decelerate() {}
    override fun collide(entity: Entity?) {}

    override fun getEntityType(): EntityTypes<*> {
        return EntityTypes.MINECART
    }
}
