package group08.developer.mario.map;

import org.andengine.engine.Engine;
import org.andengine.extension.tmx.TMXLayer;
import org.andengine.extension.tmx.TMXLoader;
import org.andengine.extension.tmx.TMXProperties;
import org.andengine.extension.tmx.TMXTile;
import org.andengine.extension.tmx.TMXTileProperty;
import org.andengine.extension.tmx.TMXTiledMap;
import org.andengine.extension.tmx.TMXLoader.ITMXTilePropertiesListener;
import org.andengine.extension.tmx.util.exception.TMXLoadException;
import org.andengine.opengl.texture.TextureOptions;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.util.debug.Debug;


/**
 * @author EvilSakura
 * 
 * @date May 18, 2013 7:03:16 PM
 */
public class Map {
	public static TMXTiledMap getTMXTiledMap(BaseGameActivity mainActivity,
			Engine mEngine, String mapName) {
		TMXTiledMap mTMXTiledMap;
		try {
			final TMXLoader tmxLoader = new TMXLoader(mainActivity.getAssets(),
					mEngine.getTextureManager(),
					TextureOptions.BILINEAR_PREMULTIPLYALPHA,
					mainActivity.getVertexBufferObjectManager(),
					new ITMXTilePropertiesListener() {
						@Override
						public void onTMXTileWithPropertiesCreated(
								final TMXTiledMap pTMXTiledMap,
								final TMXLayer pTMXLayer,
								final TMXTile pTMXTile,
								final TMXProperties<TMXTileProperty> pTMXTileProperties) {
						}
					});
			mTMXTiledMap = tmxLoader.loadFromAsset("tmx/untitled.tmx");
			return mTMXTiledMap;
		} catch (final TMXLoadException e) {
			Debug.e(e);
		}
		return null;
	}
}
