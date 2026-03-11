# Mystical More Crops

Mystical More Crops is an addon mod that expands Mystical Agriculture by integrating a wide variety of mobs into its crop system.

Most mobs drop a corresponding soul item, which can be used to obtain their spawn eggs through Mystical Agriculture recipes.

The following mobs are excluded from this system:

Bee (already exist as resource type crop)

Villager (nothing should drop form the Villager)

Ender Dragon (out of tier range)

Wither (out of tier range)

This mod aims to make more mobs compatible with Mystical Agriculture.

## License

[MIT License](./LICENSE)

# Contents
Most mobs are associated with a soul from Mystical Agriculture.

## New crops
This mod adds these crops.
### resource
supremium (You can disable this in the config)

prosperity (You can disable this in the config)

soulstone

sculk

sponge
### mob
allay (allay, vex)

amphibian (frog, tadpole, axolotl)

bat

bear (polar bear, panda)

cat (cat, ocelot)

dolphin

fox

golem (iron golem, snow golem, warden)

horse (horse, donkey, mule, skeleton horse)

human (illager mobs, piglin, piglin brute, villager) (※Villagers don't drop human soul)

llama (llama, trader llama, camel)

mite (ender mite, silver fish)

shulker

sniffer

strider

wolf

evil (Player cannot get this soul from any mobs directly.)

## Modify crops
This mod modify some mob crops.

chicken (+ parrot)

cow (+ mooshroom, ravager)

fish (+ guardian, elder guardian)

pig (+ hoglin)

sheep (+ goat)

slime (+ magma cube)

squid (+ glow squid)

zombie (+ zombified piglin, zoglin)


# Other
This mod is structured to make it easy to add support for additional resources in the Mystical Agriculture crop system.

You can modify and use this under the MIT license.

## How to add?
See these files for details.(Written in Japanese, but it's not difficult.
Reference, mimic and arrange existing codes.)

[ModCrops.java](./src/main/java/com/pybt58/mysticalmorecrops/lib/ModCrops.java) 

[ModMobSoulTypes.java](./src/main/java/com/pybt58/mysticalmorecrops/lib/ModMobSoulTypes.java)

Do not forget to add recipe json files and asset files.  (But don't worry!  Even if you forget this, Mystical Agriculture may complement some elements.)

Add new asset files them to the appropriate location in [this directory](./src/main/resources/assets/mysticalmorecrops) (or create new resourcepack).

Add new recipe files them to the appropriate location in [this directory](./src/main/resources/data/mysticalmorecrops/recipes) (or create new datapack).

About contents of file, reference files in these directories.

[texture flower](./src/main/resources/assets/mysticalmorecrops/textures/block/flower)

[texture essence](./src/main/resources/assets/mysticalmorecrops/textures/item/essence)

[texture seeds](./src/main/resources/assets/mysticalmorecrops/textures/item/seeds)

[model essence and seeds](./src/generated/resources/assets/mysticalagriculture/models/item)

[model cropBlock](./src/generated/resources/assets/mysticalagriculture/models/block)

[blockstates crop](./src/generated/resources/assets/mysticalagriculture/blockstates)

[recipe crafting seed](./src/generated/resources/data/mysticalmorecrops/recipes/seed/crafting)(Disabled by default. You can skip this)

[recipe infusion seed](./src/generated/resources/data/mysticalmorecrops/recipes/seed/infusion)

[recipe reprocessor](./src/generated/resources/data/mysticalmorecrops/recipes/seed/reprocessor)

Do not forget to add some recipe that [creates resource item from essence](./src/main/resources/data/mysticalmorecrops/recipes/essence)!

And add some [soul_extraction](./src/main/resources/data/mysticalmorecrops/recipes/souls) recipe if you need.