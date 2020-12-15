package world.ucode.peppes;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Peppes {
    private String name;

    private double maxHealth;
    private PeppeType type;
    private double health = 10;

    private double happy = 10;
    private double hunger = 10;
    private double thirst = 10;
    private double cleanliness = 10;
    private final Map<PeppesInteraction, Method> actions = new HashMap<PeppesInteraction, Method>() {{
        try {
            put(PeppesInteraction.PLAY, Peppes.class.getDeclaredMethod("play"));
            put(PeppesInteraction.FEED, Peppes.class.getDeclaredMethod("feed"));
            put(PeppesInteraction.GIVE_WATER, Peppes.class.getDeclaredMethod("giveWater"));
            put(PeppesInteraction.GIVE_DRUGS, Peppes.class.getDeclaredMethod("giveDrugs"));
            put(PeppesInteraction.CLEAN_UP, Peppes.class.getDeclaredMethod("cleanUp"));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }};


    public void ActionHandler(PeppesInteraction interact, Peppes peppes) throws InvocationTargetException, IllegalAccessException {
        actions.get(interact).invoke(peppes);
    }

    public String getName() {
        return name;
    }
    public PeppeType getType() {
        return type;
    }
    public double getMaxHealth() {
        return maxHealth;
    }
    public double getCleanliness() {
        return cleanliness;
    }
    public double getHappy() {
        return happy;
    }
    public double getHealth() {
        return health;
    }
    public double getHunger() {
        return hunger;
    }
    public double getThirst() {
        return thirst;
    }

    public PeppeType toType(String type) {
        if (type.equals("BadMan"))
            return PeppeType.BADMAN;
        if (type.equals("Clown"))
            return PeppeType.CLOWN;
        return null;
    }

    public int LifeCycle() {
        if (getHealth() > 0) {
            setHappy(getHappy() - 0.05);
            setHealth(getHealth() - 0.05);
            setCleanliness(getCleanliness() - 0.05);
            setHunger(getHunger() - 0.05);
            setThirst(getThirst() - 0.05);
            return 0;
        }
        return -1;
    }

    private void play() {
        setHappy(getHappy() + 1);
        setHunger(getHunger() - 0.5);
        setThirst(getThirst() - 0.5);
        setCleanliness(getCleanliness() - 0.5);
        setHealth(getHealth() - 0.5);
    }

    private void feed() {
        setHunger(getHunger() + 1);
        setHealth(getHealth() + 0.25);
    }

    private void giveWater() {
        setThirst(getThirst() + 1);
        setHealth(getHealth() + 0.25);
    }

    private void giveDrugs() {
        setHealth(getHealth() + 1);
    }

    private void cleanUp() {
        setCleanliness(getCleanliness() + 1);
    }

    public void setCleanliness(double value) {
        if (value < 1)
            setHealth(getHealth() - 0.05);
        else
            cleanliness = value;
    }

    public void setHunger(double value) {
        if (value < 1)
            setHealth(getHealth() - 0.05);
        else
            hunger = value;
    }

    public void setThirst(double value) {
        if (value < 1)
            setHealth(getHealth() - 0.05);
    }

    public void setHealth(double value) {
        health = value;
    }

    public void setHappy(double value) {
        if (value < 1)
            setHealth(getHealth() - 0.05);
        else
            happy = value;
    }

}