package defpackage;

import android.content.Context;

/* JADX INFO: renamed from: lْؒٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13075l {
    public final InterfaceC11780l amazon;
    public final long crashlytics;
    public final InterfaceC13490l loadAd;
    public final Context yandex;

    public C13075l(Context context, InterfaceC13490l interfaceC13490l, long j, InterfaceC11780l interfaceC11780l) {
        this.yandex = context;
        this.loadAd = interfaceC13490l;
        this.crashlytics = j;
        this.amazon = interfaceC11780l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C13075l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C13075l c13075l = (C13075l) obj;
        return AbstractC8576l.yandex(this.yandex, c13075l.yandex) && AbstractC8576l.yandex(this.loadAd, c13075l.loadAd) && C9735l.crashlytics(this.crashlytics, c13075l.crashlytics) && AbstractC8576l.yandex(this.amazon, c13075l.amazon);
    }

    public final int hashCode() {
        int iHashCode = (this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31;
        int i = C9735l.smaato;
        return this.amazon.hashCode() + AbstractC1757l.m1038strictfp(iHashCode, this.crashlytics, 31);
    }
}
