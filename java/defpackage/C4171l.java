package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: lؖٗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4171l {
    public final int crashlytics;
    public final int loadAd;
    public final int yandex;
    public static final Pattern amazon = Pattern.compile("\\s+");
    public static final AbstractC8481l purchase = AbstractC8481l.metrica(2, "auto", "none");
    public static final AbstractC8481l billing = AbstractC8481l.metrica(3, "dot", "sesame", "circle");
    public static final AbstractC8481l mopub = AbstractC8481l.metrica(2, "filled", "open");
    public static final AbstractC8481l admob = AbstractC8481l.metrica(3, "after", "before", "outside");

    public C4171l(int i, int i2, int i3) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
    }
}
