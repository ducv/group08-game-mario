package group08.developer.mario.player;

import org.andengine.entity.scene.Scene;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas;
import org.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory;
import org.andengine.opengl.texture.region.TiledTextureRegion;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import group08.developer.mario.sprite.InterfaceSprite;

/**
 * @author EvilSakura
 * 
 * @date May 18, 2013 7:42:06 PM
 */
public class Player implements InterfaceSprite {

	public AnimatedSprite player_AnimatedSprite;
	private int heart;
	private float positionX;
	private float positionY;

	private TiledTextureRegion player_TiledTextureRegion;
	private BitmapTextureAtlas player_BitmapTextureAtlas;

	public Player() {
		heart = 5;
		positionX = 0;
		positionY = 0;
	}

	public void onLoadResources(SimpleBaseGameActivity mainActivity) {
		BitmapTextureAtlasTextureRegionFactory.setAssetBasePath("gfx/Player/");
		this.player_BitmapTextureAtlas = new BitmapTextureAtlas(
				mainActivity.getTextureManager(), 512, 512,
				TextureOptions.BILINEAR_PREMULTIPLYALPHA);
		this.player_TiledTextureRegion = BitmapTextureAtlasTextureRegionFactory
				.createTiledFromAsset(this.player_BitmapTextureAtlas,
						mainActivity, "nhan_vat_chinh.png", 0, 0, 9, 8);
		this.player_BitmapTextureAtlas.load();
	}

	public void onLoadScene(SimpleBaseGameActivity mainActivity, Scene mScene) {
		player_AnimatedSprite = new AnimatedSprite(this.positionX,
				this.positionY, this.player_TiledTextureRegion,
				mainActivity.getVertexBufferObjectManager());
		mScene.attachChild(player_AnimatedSprite);
	}

	public float getPositionX() {
		return positionX;
	}

	public void setPositionX(float positionX) {
		this.positionX = positionX;
	}

	public float getPositionY() {
		return positionY;
	}

	public void setPositionY(float positionY) {
		this.positionY = positionY;
	}

	public int getHeart() {
		return heart;
	}

	public void setHeart(int heart) {
		this.heart = heart;
	}

	public void setPositionXY(float positionX, float positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}
}
