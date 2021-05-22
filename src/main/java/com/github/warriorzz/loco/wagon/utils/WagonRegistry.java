package com.github.warriorzz.loco.wagon.utils;

import com.github.warriorzz.loco.wagon.Wagon;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.types.Type;
import net.minecraft.server.v1_16_R3.*;

import java.util.Map;

/*public class WagonRegistry {

    public static EntityTypes<Wagon> WAGON;

    // Lifted from: https://www.spigotmc.org/threads/1-14-nms-registering-custom-entity.371482/ & https://papermc.io/forums/t/solved-1-16-x-register-custom-entity-nullpointerexception/7361
    private static <T extends Entity> EntityTypes<T> register(String name, EntityTypes<?> parentType, EntityTypes.b<? extends Entity> producer, EnumCreatureType type) {
        MinecraftKey key = MinecraftKey.a(name);
        if (key == null) {
            throw new IllegalStateException(String.format("Unable to register entity with key '%s' as it is already registered.", name));
        }

        Map<Object, Type<?>> dataTypes = (Map<Object, Type<?>>)DataConverterRegistry.a()
                .getSchema(DataFixUtils.makeKey(SharedConstants.getGameVersion().getWorldVersion()))
                .findChoiceType(DataConverterTypes.ENTITY_TREE).types();

        dataTypes.put(key.toString(), dataTypes.get(parentType.i().getKey().replace("entities/", "minecraft:")));

        EntityTypes.Builder<T> a = EntityTypes.Builder.a(producer, type);
        return IRegistry.a(IRegistry.ENTITY_TYPE, key, a.a(key.getKey()));
    }

    private WagonRegistry() { }

    private static boolean injected = false;

    public static void inject() {
        if (!injected) {
            WAGON = register("wagon", EntityTypes.MINECART, Wagon::new, EnumCreatureType.MISC);
            System.out.println(IRegistry.ENTITY_TYPE.getKey(WAGON));
        }
        injected = true;
    }
}
*/
