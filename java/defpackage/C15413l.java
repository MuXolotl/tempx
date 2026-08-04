package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؓٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15413l {
    public final Function1 amazon;
    public final boolean crashlytics;
    public final int loadAd;
    public final int yandex;

    public C15413l(int i, int i2, boolean z, Function1 function1) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = z;
        this.amazon = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15413l)) {
            return false;
        }
        C15413l c15413l = (C15413l) obj;
        return this.yandex == c15413l.yandex && this.loadAd == c15413l.loadAd && this.crashlytics == c15413l.crashlytics && this.amazon.equals(c15413l.amazon);
    }

    public final int hashCode() {
        return this.amazon.hashCode() + (((((this.yandex * 31) + this.loadAd) * 31) + (this.crashlytics ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Action(icon=" + this.yandex + ", name=" + this.loadAd + ", plusGray=" + this.crashlytics + ", clickAction=" + this.amazon + ')';
    }
}
