package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: lَؙۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6694l {
    public C14023l amazon;
    public boolean billing;
    public final C13904l loadAd;
    public C16616l purchase;
    public final Object yandex;
    public final ArrayDeque crashlytics = new ArrayDeque();
    public C16616l mopub = C16616l.loadAd;

    public C6694l(Object obj, C13904l c13904l, C14023l c14023l, C16616l c16616l) {
        this.yandex = obj;
        this.loadAd = c13904l;
        this.amazon = c14023l;
        this.purchase = c16616l;
    }
}
