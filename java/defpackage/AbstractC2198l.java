package defpackage;

import android.view.RenderNode;

/* JADX INFO: renamed from: lؓۢٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2198l {
    public static void amazon(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }

    public static void crashlytics(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    public static int loadAd(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static int yandex(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }
}
