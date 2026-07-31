package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؚؐؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6935l {
    public static final C13645l purchase = AbstractC15212l.purchase(new C5562l(21), new C14813l(0, 23));
    public final C13765l amazon;
    public final Function0 crashlytics = new C1712l(13);
    public final C13765l loadAd;
    public float yandex;

    public C6935l(float f, float f2, float f3) {
        this.yandex = f;
        this.loadAd = new C13765l(f3);
        this.amazon = new C13765l(f2);
    }

    public final void crashlytics(float f) {
        this.amazon.subs(AbstractC8576l.amazon(f, this.yandex, 0.0f));
    }

    public final float loadAd() {
        boolean zBooleanValue = ((Boolean) this.crashlytics.invoke()).booleanValue();
        C13765l c13765l = this.loadAd;
        if (!zBooleanValue && c13765l.admob() == 0.0f) {
            return 1.0f;
        }
        float f = this.yandex;
        if (f == 0.0f) {
            return 0.0f;
        }
        return 1.0f - (AbstractC8576l.amazon(Math.abs(c13765l.admob()) + f, this.yandex, 0.0f) / this.yandex);
    }

    public final float yandex() {
        if (this.yandex == 0.0f) {
            return 0.0f;
        }
        return this.amazon.admob() / this.yandex;
    }
}
