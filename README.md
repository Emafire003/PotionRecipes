# Potion Recipes API
This simple API provides a simple way to make brewing recipes. If this is all you need, good use this, if you also need to do something else you may look also at nbt-crafting api or something like that.

This is just a "fancy" invoker, nothing less nothing more, so you could just create your own.
## Setup
Include this library into your `build.gradle` as a dependency
```gradle
repositories {
    maven {
        name = "Modrinth"
        url = "https://api.modrinth.com/maven"
        content {
            includeGroup "maven.modrinth"
        }
    }
}

dependencies {
    modImplementation "maven.modrinth:potionrecipes:<version>"
}
```
If you want you can `include `the API in your jar file by adding only the `include` string:
```gradle
repositories {
    maven {
        name = "Modrinth"
        url = "https://api.modrinth.com/maven"
        content {
            includeGroup "maven.modrinth"
        }
    }
}

dependencies {
    modImplementation "maven.modrinth:potionrecipes:<version>"
    include "maven.modrinth:potionrecipes:<version>"
}
```
## How to use it
Simply call 
```java
BrewingRecipeRegister.registerPotionRecipe(Potion input, Item item, Potion output);
```
@param input The potion you want to start from, usually Potions.AWKWARD or your custom potion (which is going to be YourPotions.POTION)
@param item The ingredient you need for your potion
@param output The potion you want to have as a result of the crafting

For an example you can look into my ![GlowfulWorld](https://github.com/Emafire003/GlowfulWorld/blob/1.18/src/main/java/me/emafire003/dev/glowful_world/items/GlowPotionItem.java) mod.

## License
This API is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.
