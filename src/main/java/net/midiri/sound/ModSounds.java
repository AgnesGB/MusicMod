package net.midiri.sound;

import net.midiri.musicmod.MusicMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MusicMod.MOD_ID);

    //chill
    public static RegistryObject<SoundEvent> BAR_BRAWL = registerSoundEvents("bar_brawl");
    public static RegistryObject<SoundEvent> ADVENTURE = registerSoundEvents("adventure");
    public static RegistryObject<SoundEvent> FOR_TOMORROW = registerSoundEvents("for_tomorrow");
    public static RegistryObject<SoundEvent> TIMELESS = registerSoundEvents("timeless");
    public static RegistryObject<SoundEvent> TOWARDS_THE_HORIZON = registerSoundEvents("towards_the_horizon");
    public static RegistryObject<SoundEvent> TRAVELING_SYMPHONY = registerSoundEvents("traveling_symphony");
    public static RegistryObject<SoundEvent> ENCHANTED = registerSoundEvents("enchanted");
    public static RegistryObject<SoundEvent> SAND_DREAM = registerSoundEvents("sand_dream");

    //te(n)são
    public static RegistryObject<SoundEvent> TENSE = registerSoundEvents("tense");
    public static RegistryObject<SoundEvent> CHOIR = registerSoundEvents("choir");
    public static RegistryObject<SoundEvent> DARK = registerSoundEvents("dark");
    public static RegistryObject<SoundEvent> EMOTIONAL = registerSoundEvents("emotional");
    public static RegistryObject<SoundEvent> GUARDIAN_OF_THE_SWORD = registerSoundEvents("guardian_of_the_sword");
    public static RegistryObject<SoundEvent> RISING = registerSoundEvents("rising");
    public static RegistryObject<SoundEvent> THE_LOWER_DEPTHS = registerSoundEvents("the_lower_depths");

    //batalhas
    public static RegistryObject<SoundEvent> DRAGON_CASTLE = registerSoundEvents("dragon_castle");
    public static RegistryObject<SoundEvent> FLOREST_DANCE = registerSoundEvents("florest_dance");
    public static RegistryObject<SoundEvent> OBSCURITY = registerSoundEvents("obscurity");
    public static RegistryObject<SoundEvent> THE_LAST_STAND = registerSoundEvents("the_last_stand");
    public static RegistryObject<SoundEvent> THROUGH_FIRE_AND_WATER = registerSoundEvents("through_fire_and_water");
    public static RegistryObject<SoundEvent> TREACHEROUS_WATERS = registerSoundEvents("treacherous_waters");
    public static RegistryObject<SoundEvent> WHERE_IS_YOUR_GOD_NOW = registerSoundEvents("where_is_your_god_now");
    public static RegistryObject<SoundEvent> DIVEBOMB = registerSoundEvents("divebomb");
    public static RegistryObject<SoundEvent> FLIGHT_HYMN = registerSoundEvents("flight_hymn");
    public static RegistryObject<SoundEvent> PLANINSK_BRIZ = registerSoundEvents("planinsk_briz");
    public static RegistryObject<SoundEvent> STRATEGY = registerSoundEvents("strategy");
    public static RegistryObject<SoundEvent> THE_BATTLE_WITHIN = registerSoundEvents("the_battle_within");
    public static RegistryObject<SoundEvent> TOUCH = registerSoundEvents("touch");
    public static RegistryObject<SoundEvent> DEAD_KING = registerSoundEvents("dead_king");

    //OMORI
    public static RegistryObject<SoundEvent> ARACHNOPHOBIA = registerSoundEvents("arachnophobia");
    public static RegistryObject<SoundEvent> SOMETHING = registerSoundEvents("something");
    public static RegistryObject<SoundEvent> IT_MEANS_EVERYTHING = registerSoundEvents("it_means_everything");
    public static RegistryObject<SoundEvent> ACROPHOBIA = registerSoundEvents("acrophobia");
    public static RegistryObject<SoundEvent> OMORI_ALTER = registerSoundEvents("omori_alter");
    public static RegistryObject<SoundEvent> FINAL_DUET = registerSoundEvents("final_duet");
    public static RegistryObject<SoundEvent> RAP_ITACHI = registerSoundEvents("rap_itachi");

    //HAPPY
    public static RegistryObject<SoundEvent> BELLY_FULL = registerSoundEvents("belly_full");
    public static RegistryObject<SoundEvent> VICTORY_CELEBRATION = registerSoundEvents("victory_celebration");
    public static RegistryObject<SoundEvent> THE_BARD_DOWN = registerSoundEvents("the_bard_down");
    public static RegistryObject<SoundEvent> SALT_IN_THE_AIR = registerSoundEvents("salt_in_the_air");
    public static RegistryObject<SoundEvent> MEMORIES_OF_THE_QUEEN = registerSoundEvents("memories_of_the_queen");
    public static RegistryObject<SoundEvent> MAGICAL_FANTASY = registerSoundEvents("magical_fantasy");
    public static RegistryObject<SoundEvent> DANCING_GIRLS = registerSoundEvents("dancing_girls");

    //SAD
    public static RegistryObject<SoundEvent> SAD_VIOLIN = registerSoundEvents("sad_violin");
    public static RegistryObject<SoundEvent> SOFT_VIOLIN = registerSoundEvents("soft_violin");
    public static RegistryObject<SoundEvent> TAVERN_FUNERAL = registerSoundEvents("tavern_funeral");




    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MusicMod.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
