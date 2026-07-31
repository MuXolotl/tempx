package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍ۠ۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9872l {
    public final Function0 amazon;
    public final int crashlytics;
    public final int loadAd;
    public final Function1 purchase;
    public final int yandex;

    public C9872l(int i, int i2, int i3, Function0 function0, Function1 function1) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = i3;
        this.amazon = function0;
        this.purchase = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9872l)) {
            return false;
        }
        C9872l c9872l = (C9872l) obj;
        return this.yandex == c9872l.yandex && this.loadAd == c9872l.loadAd && this.crashlytics == c9872l.crashlytics && this.amazon.equals(c9872l.amazon) && this.purchase.equals(c9872l.purchase);
    }

    public final int hashCode() {
        return this.purchase.hashCode() + ((this.amazon.hashCode() + (((((this.yandex * 31) + this.loadAd) * 31) + this.crashlytics) * 31)) * 31);
    }

    public final String toString() {
        return "Effect(icon=" + this.yandex + ", title=" + this.loadAd + ", description=" + this.crashlytics + ", navigateTo=" + this.amazon + ", isEnabled=" + this.purchase + ')';
    }
}
