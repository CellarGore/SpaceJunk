package com.spacejunk.game.consumables;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.spacejunk.game.levels.Level;

/**
 * Created by vidxyz on 2/10/18.
 */

public class LifeConsumable extends Consumable {

    public LifeConsumable(Level level) {
        this.consumableTexture = level.getCurrentGame().getManager().get("heart.png");
        this.consumableTextureSmall = level.getCurrentGame().getManager().get("heart.png");
        this.sound = Gdx.audio.newSound(Gdx.files.internal("sounds/consumable_picked_up.mp3"));
        this.level = level;
        this.consumableType = CONSUMABLES.LIFE;
    }
}
