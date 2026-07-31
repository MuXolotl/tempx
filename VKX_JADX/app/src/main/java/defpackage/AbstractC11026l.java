package defpackage;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: renamed from: lُْٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11026l {
    public static C16242l loadAd(View view, C16242l c16242l) {
        ContentInfo contentInfoPurchase = c16242l.yandex.purchase();
        Objects.requireNonNull(contentInfoPurchase);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoPurchase);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoPurchase ? c16242l : new C16242l(new C17240l(contentInfoPerformReceiveContent));
    }

    public static String[] yandex(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
