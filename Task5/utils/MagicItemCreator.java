package by.epam_pre_training.task5.utils;

import by.epam_pre_training.task5.entity.*;
import java.util.Random;

public class MagicItemCreator {

    private static final int MAXIMUM_MAGIC_POWER = 21;

    
    // Creates a list of magic items

    public static MyList<MagicItem> createMagicItemArray(int size) {
        MyList<MagicItem> items = new DynamicArray<>();

        for (int i = 0; i < size; i++) {
            items.add(MagicItemCreator.createMagicItem());
        }
        return items;
    }


    // Creates a random MagicItem object

    private static MagicItem createMagicItem() {
        final int AMOUNT_OF_ITEMS = 4;
        MagicItem magicItem = null;

        switch (new Random().nextInt(AMOUNT_OF_ITEMS)) {
            case 0:
                magicItem = createBook();
                break;
            case 1:
                magicItem = createHerb();
                break;
            case 2:
                magicItem = createPotion();
                break;
            case 3:
                magicItem = createScroll();
        }
        return magicItem;
    }


    private static Book createBook() {
        final String[] BOOK_NAMES = {"Ork Culture", "Evil Lizards", "Necromancy for beginners",
            "Dark Secrets", "Useless Book", "Ten Most Powerful Wizards", "Elven Fashion", "Ancient Drawings",
            "Forgotten Spells", "Cursed Armor", "Dragon Potions", "Magic History"};

        return new Book(BOOK_NAMES[new Random().nextInt(BOOK_NAMES.length)],
                new Random().nextInt(MAXIMUM_MAGIC_POWER),
                new Random().nextBoolean());
    }


    private static Potion createPotion() {
        final String[] POTION_NAMES = {"Curing Brew", "Holy Potion", "Bird Transformation Potion",
            "Tasty Potion", "Basilisk Potion", "Magic Power Potion", "Strawberry Elixir", "Sleepy Brew",
            "Invisibility Elixir", "Weakening Potion", "Elixir of Knowledge", "Healing Potion"};
        
        final String[] COLORS = {"gold", "silver", "black", "soothing", "frightening",
            "green", "lilac", "yellow", "pink", "iridescent", "transparent", "blue", "orange",
            "strange", "violet", "red"};

        return new Potion(POTION_NAMES[new Random().nextInt(POTION_NAMES.length)],
                new Random().nextInt(MAXIMUM_MAGIC_POWER),
                COLORS[new Random().nextInt(COLORS.length)]);
    }


    private static Scroll createScroll() {
        final int MAXIMUM_SPELL_LEVEL = 10;
        
        final String[] SCROLL_NAMES = {"Symbol of Intelligence", "Magic Symbol", "Fireball Spell",
            "Charming Spell", "Symbol of Fear", "Cow Rain Spell", "Acid Bolt Spell", "Ooze Conjure Spell",
            "Healing Scroll", "Symbol of Curse", "Protection symbol", "Time Stop Scroll",
            "Petrification Scroll", "Blessing Scroll", "Power Word Sleep Spell"};

        return new Scroll(SCROLL_NAMES[new Random().nextInt(SCROLL_NAMES.length)],
                new Random().nextInt(MAXIMUM_MAGIC_POWER),
                new Random().nextInt(MAXIMUM_SPELL_LEVEL));
    }


    private static Herb createHerb() {
        final int MAXIMUM_WEIGHT_IN_GRAMS = 1001;
        
        final String[] HERB_NAMES = {"Magical Basil", "Sacred Garlic", "Healing Mints",
            "Blood Lotus", "Cursed Catnip", "Sacred Tree", "Elfroot", "Unique four-leaf Coriander",
            "Healing Oregano", "Magical Rose", "Blessed Rosemary"};

        return new Herb(HERB_NAMES[new Random().nextInt(HERB_NAMES.length)],
                new Random().nextInt(MAXIMUM_MAGIC_POWER),
                new Random().nextInt(MAXIMUM_WEIGHT_IN_GRAMS));
    }
}
