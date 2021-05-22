package com.github.warriorzz.loco.commands

import com.github.warriorzz.loco.wagon.Wagon
import com.github.warriorzz.loco.wagon.utils.WagonType
import org.bukkit.EntityEffect
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class SpawnCommand : CommandExecutor {
    override fun onCommand(p0: CommandSender, p1: Command, p2: String, p3: Array<out String>): Boolean {
        if (p0 !is Player) return false
        val wagon = Wagon(p0.location, WagonType.LOCO)
        wagon.spawn(p0.location)
        return true
    }
}
