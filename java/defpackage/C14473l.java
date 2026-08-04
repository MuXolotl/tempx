package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٖٓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14473l {
    public final C8688l amazon = new C8688l(new C13932l(5, this));
    public final float crashlytics;
    public final List loadAd;
    public final int yandex;
    public static final C14473l purchase = new C14473l(50, Collections.singletonList(new C15024l(-1728053248, 3)), 1.0f);
    public static final C14473l billing = new C14473l(50, Collections.singletonList(new C15024l(1761607680, 3)), 1.0f);
    public static final C14473l mopub = new C14473l(50, Collections.singletonList(new C15024l(1107296256, 3)), 1.0f);
    public static final C14473l admob = new C14473l(50, Collections.singletonList(new C15024l(436207616, 3)), 1.0f);
    public static final C14473l subs = new C14473l(20, Collections.singletonList(new C15024l(-870967786, 3)), 1.3f);
    public static final C14473l isPro = new C14473l(20, Collections.singletonList(new C15024l(-283304675, 3)), 1.3f);
    public static final C14473l firebase = new C14473l(50, AbstractC14055l.remoteconfig(new C15024l(-687865857, 3), new C15024l(1476395007, 12)), 1.0f);
    public static final C14473l smaato = new C14473l(50, AbstractC14055l.remoteconfig(new C15024l(-1711276033, 3), new C15024l(1090519039, 12)), 1.21f);
    public static final C14473l remoteconfig = new C14473l(50, AbstractC14055l.remoteconfig(new C15024l(1728053247, 3), new C15024l(234881023, 3)), 1.45f);
    public static final C14473l vip = new C14473l(30, AbstractC14055l.remoteconfig(new C15024l(536870911, 3), new C15024l(486539263, 3)), 1.0f);
    public static final C14473l metrica = new C14473l(20, Collections.singletonList(new C15024l(-856164361, 3)), 2.0f);
    public static final C14473l startapp = new C14473l(20, Collections.singletonList(new C15024l(-268830215, 3)), 2.0f);

    public C14473l(int i, List list, float f) {
        this.yandex = i;
        this.loadAd = list;
        this.crashlytics = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14473l)) {
            return false;
        }
        C14473l c14473l = (C14473l) obj;
        return this.yandex == c14473l.yandex && this.loadAd.equals(c14473l.loadAd) && Float.compare(this.crashlytics, c14473l.crashlytics) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.crashlytics) + AbstractC14814l.admob(this.yandex * 31, 31, this.loadAd);
    }

    public final String toString() {
        return "VibrancyMaterial(radius=" + this.yandex + ", overlays=" + this.loadAd + ", saturation=" + this.crashlytics + ')';
    }
}
