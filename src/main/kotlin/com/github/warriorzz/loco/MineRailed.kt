package com.github.warriorzz.loco

import com.github.warriorzz.loco.commands.SpawnCommand
import net.axay.kspigot.main.KSpigot

class MineRailed : KSpigot() {

    override fun load() {
        MineRailedInstance = this
    }

    override fun startup() {
        getCommand("spawn")?.setExecutor(SpawnCommand())
    }

}

lateinit var MineRailedInstance: MineRailed
