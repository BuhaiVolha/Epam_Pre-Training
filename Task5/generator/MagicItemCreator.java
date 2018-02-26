package by.epam_pre_training.task5.generator;

import by.epam_pre_training.task5.container.DynamicArray;
import by.epam_pre_training.task5.container.MyList;
import by.epam_pre_training.task5.entity.*;
import java.util.Random;

public class MagicItemCreator {
    private static MagicItemCreator instance;
    private static final int MAXIMUM_MAGIC_POWER = 21;
    
    private MagicItemCreator() {}
    
    public static MagicItemCreator getInstance() {

        if (instance == null) {
            return instance = new MagicItemCreator();
        }
        return instance;
    }

    
    // Creates a list of magic items

    public MyList<MagicItem> createMagicItemList(int size) {
        MyList<MagicItem> items = new DynamicArray<>();

        for (int i = 0; i < size; i++) {
            items.add(createMagicItem(MagicItemTypes.getRandomType()));
        }
        return items;
    }


    // Creates a random MagicItem object

    private MagicItem createMagicItem(MagicItemTypes type) {
        MagicItem item = null;

        switch (type) {
            case BOOK:
                item = createBook();
                break;
            case HERB:
                item = createHerb();
                break;
            case POTION:
                item = createPotion();
                break;
            case SCROLL:
                item = createScroll();
        }
        return item;
    }


    private Book createBook() {
        final String[] BOOK_NAMES = {"Ork Culture", "Evil Lizards", "Necromancy for beginners",
            "Dark Secrets", "Useless Book", "Ten Most Powerful Wizards", "Elven Fashion", "Ancient Drawings",
            "Forgotten Spells", "Cursed Armor", "Dragon Potions", "Magic History"};

        return new Book(BOOK_NAMES[new Random().nextInt(BOOK_NAMES.length)],
                new Random().nextInt(MAXIMUM_MAGIC_POWER),
                new Random().nextBoolean());
    }


    private Potion createPotion() {
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


    private Scroll createScroll() {
        final int MAXIMUM_SPELL_LEVEL = 10;
        
        final String[] SCROLL_NAMES = {"Symbol of Intelligence", "Magic Symbol", "Fireball Spell",
            "Charming Spell", "Symbol of Fear", "Cow Rain Spell", "Acid Bolt Spell", "Ooze Conjure Spell",
            "Healing Scroll", "Symbol of Curse", "Protection symbol", "Time Stop Scroll",
            "Petrification Scroll", "Blessing Scroll", "Power Word Sleep Spell"};

        return new Scroll(SCROLL_NAMES[new Random().nextInt(SCROLL_NAMES.length)],
                new Random().nextInt(MAXIMUM_MAGIC_POWER),
                new Random().nextInt(MAXIMUM_SPELL_LEVEL));
    }


    private Herb createHerb() {
        final int MAXIMUM_WEIGHT_IN_GRAMS = 1001;
        
        final String[] HERB_NAMES = {"Magical Basil", "Sacred Garlic", "Healing Mints",
            "Blood Lotus", "Cursed Catnip", "Sacred Tree", "Elfroot", "Unique four-leaf Coriander",
            "Healing Oregano", "Magical Rose", "Blessed Rosemary"};

        return new Herb(HERB_NAMES[new Random().nextInt(HERB_NAMES.length)],
                new Random().nextInt(MAXIMUM_MAGIC_POWER),
                new Random().nextInt(MAXIMUM_WEIGHT_IN_GRAMS));
    }
}
