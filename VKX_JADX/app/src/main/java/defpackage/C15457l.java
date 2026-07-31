package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15457l {
    public final InterfaceC17807l crashlytics;
    public final Function1 loadAd;
    public final InterfaceC13460l yandex;

    public C15457l(InterfaceC13460l interfaceC13460l, InterfaceC17807l interfaceC17807l, Function1 function1) {
        this.yandex = interfaceC13460l;
        this.loadAd = function1;
        this.crashlytics = interfaceC17807l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15457l)) {
            return false;
        }
        C15457l c15457l = (C15457l) obj;
        return AbstractC8576l.yandex(this.yandex, c15457l.yandex) && AbstractC8576l.yandex(this.loadAd, c15457l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c15457l.crashlytics);
    }

    public final int hashCode() {
        return ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31) + 1231;
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.yandex + ", size=" + this.loadAd + ", animationSpec=" + this.crashlytics + ", clip=true)";
    }
}
