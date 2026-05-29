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
    public static RegistryObject<SoundEvent> CALMA_RHUS_SONG = registerSoundEvents("calma_rhus_song");
    public static RegistryObject<SoundEvent> CALMA_ADVENTURE = registerSoundEvents("calma_adventure");
    public static RegistryObject<SoundEvent> FOR_TOMORROW = registerSoundEvents("for_tomorrow");
    public static RegistryObject<SoundEvent> TIMELESS = registerSoundEvents("timeless");
    public static RegistryObject<SoundEvent> TOWARDS_THE_HORIZON = registerSoundEvents("towards_the_horizon");
    public static RegistryObject<SoundEvent> TRAVELING_SYMPHONY = registerSoundEvents("traveling_symphony");
    public static RegistryObject<SoundEvent> CALMA_ENCHANTED = registerSoundEvents("calma_enchanted");
    public static RegistryObject<SoundEvent> SAND_DREAM = registerSoundEvents("sand_dream");

    //te(n)são
    public static RegistryObject<SoundEvent> TENSE = registerSoundEvents("tense");
    public static RegistryObject<SoundEvent> TENSE_BATTLE_CHOIR = registerSoundEvents("tense_battle_choir");
    public static RegistryObject<SoundEvent> TENSO_DARK = registerSoundEvents("tenso_dark");
    public static RegistryObject<SoundEvent> EPIC_EMOTIONAL = registerSoundEvents("epic_emotional");
    public static RegistryObject<SoundEvent> GUARDIAN_OF_THE_SWORD = registerSoundEvents("guardian_of_the_sword");
    public static RegistryObject<SoundEvent> RISING = registerSoundEvents("rising");
    public static RegistryObject<SoundEvent> THE_LOWER_DEPTHS = registerSoundEvents("the_lower_depths");
    public static RegistryObject<SoundEvent> TENSO_DUNGEONS_AND_DRAGONS = registerSoundEvents("tenso_dungeons_and_dragons");
    public static RegistryObject<SoundEvent> TENSO_HUNTER_HUNTER = registerSoundEvents("tenso_hunter_hunter");
    public static RegistryObject<SoundEvent> TENSO_PARISTON = registerSoundEvents("tenso_pariston");
    public static RegistryObject<SoundEvent> TENSO_PERSONA5 = registerSoundEvents("tenso_persona5");

    //BATTLE
    public static RegistryObject<SoundEvent> BATTLE_DRAGON_CASTLE = registerSoundEvents("battle_dragon_castle");
    public static RegistryObject<SoundEvent> TENSE_BATTLEFLOREST_DANCE = registerSoundEvents("tense_battle_florest_dance");
    public static RegistryObject<SoundEvent> OBSCURITY = registerSoundEvents("obscurity");
    public static RegistryObject<SoundEvent> THE_LAST_STAND = registerSoundEvents("the_last_stand");
    public static RegistryObject<SoundEvent> THROUGH_FIRE_AND_WATER = registerSoundEvents("through_fire_and_water");
    public static RegistryObject<SoundEvent> TREACHEROUS_WATERS = registerSoundEvents("treacherous_waters");
    public static RegistryObject<SoundEvent> WHERE_IS_YOUR_GOD_NOW = registerSoundEvents("where_is_your_god_now");
    public static RegistryObject<SoundEvent> BATTLE_DIVEBOMB = registerSoundEvents("battle_divebomb");
    public static RegistryObject<SoundEvent> TENSO_CARONTE_SONG = registerSoundEvents("tenso_caronte_song");
    public static RegistryObject<SoundEvent> PLANINSK_BRIZ = registerSoundEvents("planinsk_briz");
    public static RegistryObject<SoundEvent> STRATEGY = registerSoundEvents("strategy");
    public static RegistryObject<SoundEvent> THE_BATTLE_WITHIN = registerSoundEvents("the_battle_within");
    public static RegistryObject<SoundEvent> TOUCH = registerSoundEvents("touch");
    public static RegistryObject<SoundEvent> TENSE_BATTLE_ELEGY_THE_END_LAPPY = registerSoundEvents("tense_battle_elegy_the_end_lappy");
    public static RegistryObject<SoundEvent> TENSE_BATTLE_ESCAFLOWNE = registerSoundEvents("tense_battle_escaflowne");
    public static RegistryObject<SoundEvent> TENSE_BATTLE_MY_BROTHER = registerSoundEvents("tense_battle_my_brother");
    public static RegistryObject<SoundEvent> TENSE_BATTLE_KATAKURI = registerSoundEvents("tense_battle_katakuri");
    public static RegistryObject<SoundEvent> TENSE_BLEACH_INVASION = registerSoundEvents("tense_battle_bleach_invasion");
    public static RegistryObject<SoundEvent> TENSE_BLEACH_REBELLION = registerSoundEvents("tense_battle_bleach_rebellion");
    public static RegistryObject<SoundEvent> BATTLE_STEEL_FOR_HUMANS = registerSoundEvents("battle_steel_for_humans");
    public static RegistryObject<SoundEvent> BATTLE_RENGOKU = registerSoundEvents("battle_rengoku");
    public static RegistryObject<SoundEvent> BATTLE_YOU_SAY_RUN = registerSoundEvents("battle_you_say_run");

    //OMORI
    public static RegistryObject<SoundEvent> TENSO_ARACHNOPHOBIA = registerSoundEvents("tenso_arachnophobia");
    public static RegistryObject<SoundEvent> SOMETHING = registerSoundEvents("something");
    public static RegistryObject<SoundEvent> IT_MEANS_EVERYTHING = registerSoundEvents("it_means_everything");
    public static RegistryObject<SoundEvent> TENSO_ACROPHOBIA = registerSoundEvents("tenso_acrophobia");
    public static RegistryObject<SoundEvent> OMORI_ALTER = registerSoundEvents("omori_alter");
    public static RegistryObject<SoundEvent> CALMA_FINAL_DUET = registerSoundEvents("calma_final_duet");
    public static RegistryObject<SoundEvent> RAP_ITACHI = registerSoundEvents("rap_itachi");

    //HAPPY
    public static RegistryObject<SoundEvent> FELIZ_BELLY_FULL = registerSoundEvents("feliz_belly_full");
    public static RegistryObject<SoundEvent> VICTORY_CELEBRATION = registerSoundEvents("victory_celebration");
    public static RegistryObject<SoundEvent> THE_BARD_DOWN = registerSoundEvents("the_bard_down");
    public static RegistryObject<SoundEvent> SALT_IN_THE_AIR = registerSoundEvents("salt_in_the_air");
    public static RegistryObject<SoundEvent> MEMORIES_OF_THE_QUEEN = registerSoundEvents("memories_of_the_queen");
    public static RegistryObject<SoundEvent> MAGICAL_FANTASY = registerSoundEvents("magical_fantasy");
    public static RegistryObject<SoundEvent> FELIZ_DANCING_GIRLS = registerSoundEvents("feliz_dancing_girls");
    public static RegistryObject<SoundEvent> FELIZ_FRIEREN = registerSoundEvents("feliz_frieren");
    public static RegistryObject<SoundEvent> FELIZ_GERUDO_VALLEY = registerSoundEvents("feliz_gerudo_valley");
    public static RegistryObject<SoundEvent> FELIZ_KIKI_DELIVERY = registerSoundEvents("feliz_kiki_delivery");
    public static RegistryObject<SoundEvent> FELIZ_POKEMON = registerSoundEvents("feliz_pokemon");
    public static RegistryObject<SoundEvent> FELIZ_CASTELO_ANIMADO = registerSoundEvents("feliz_castelo_animado");
    public static RegistryObject<SoundEvent> FELIZ_CLAIR_OBSCURE = registerSoundEvents("feliz_clair_obscure");
    public static RegistryObject<SoundEvent> FELIZ_HXH_ADVENTURE = registerSoundEvents("feliz_hxh_adventure");

    //SAD
    public static RegistryObject<SoundEvent> SAD_VIOLIN = registerSoundEvents("sad_violin");
    public static RegistryObject<SoundEvent> SOFT_VIOLIN = registerSoundEvents("soft_violin");
    public static RegistryObject<SoundEvent> TAVERN_FUNERAL = registerSoundEvents("tavern_funeral");
    public static RegistryObject<SoundEvent> TRISTE_CLAIR_OBSCURE = registerSoundEvents("triste_clair_obscure");
    public static RegistryObject<SoundEvent> TRISTE_FULLMETAL = registerSoundEvents("triste_fullmetal");
    public static RegistryObject<SoundEvent> TRISTE_MEMORIAS = registerSoundEvents("triste_memorias");
    public static RegistryObject<SoundEvent> TRISTE_SAD_BROTHER_CDZ = registerSoundEvents("triste_sad_brother_cdz");
    public static RegistryObject<SoundEvent> TRISTE_BLEACH = registerSoundEvents("triste_bleach");
    public static RegistryObject<SoundEvent> TRISTE_HYOGA = registerSoundEvents("triste_hyoga");
    public static RegistryObject<SoundEvent> TRISTE_RIAS_GREMORY = registerSoundEvents("triste_rias_gremory");

    //EPIC
    public static RegistryObject<SoundEvent> EPIC_BOKU_NO_HERO = registerSoundEvents("epic_boku_no_hero");
    public static RegistryObject<SoundEvent> EPIC_FAIRY_TAIL = registerSoundEvents("epic_fairy_tail");
    public static RegistryObject<SoundEvent> EPIC_HEART_OF_COURAGE = registerSoundEvents("epic_heart_of_courage");
    public static RegistryObject<SoundEvent> EPIC_HXH_LEGEND_MARTIALARTIST = registerSoundEvents("epic_hxh_legend_martialartist");
    public static RegistryObject<SoundEvent> EPIC_PIRATAS_DO_CARIBE = registerSoundEvents("epic_piratas_do_caribe");


    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MusicMod.MOD_ID, name)));
    }


    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
