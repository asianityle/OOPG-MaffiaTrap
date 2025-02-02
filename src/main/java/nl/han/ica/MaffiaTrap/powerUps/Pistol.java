package nl.han.ica.MaffiaTrap.powerUps;

import nl.han.ica.MaffiaTrap.main.MaffiaTrapApp;
import nl.han.ica.MaffiaTrap.entities.interfaces.IPlayer;
import nl.han.ica.OOPDProcessingEngineHAN.Objects.Sprite;

/**
 * Pistol.java
 * Hierin wordt de pistool gemaakt die uit de schatkist (zie Chest.java) kan komen.
 * @author Vu Le
 */
public class Pistol extends PowerUp {

    public MaffiaTrapApp app;

    /**
     * Constructor voor het maken van de pistool.
     * @param app Referentie naar de wereld (MaffiaTrapApp).
     * @param player Referentie naar de interface waar de functies van de powerup Pistol (makeFireball) wordt aangeroepen.
     * @param x X-coördinaat waar de pistool terechtkomt.
     * @param y Y-coördinaat waar de pistool terechtkomt.
     */

    public Pistol(MaffiaTrapApp app, IPlayer player, int x, int y){
        super(new Sprite("src/main/java/nl/han/ica/MaffiaTrap/media/Pistol.png"));
        this.app = app;
        this.player = player;
        this.setX(x);
        this.setY(y);
    }

    /**
     * De actie die de pistool moet uitvoeren
     */

    @Override
    public void doAction(){
        shootFireball();
    }

    @Override
    public void update(){ }

    /**
     * Maakt de vuurbal aan die uit de pistool komt
     */
    public void shootFireball(){
        app.makeFireball();
    }

}