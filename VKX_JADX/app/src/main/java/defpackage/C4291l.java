package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lُٟؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4291l {
    public final LinkedHashMap amazon;
    public final InterfaceC12918l crashlytics;
    public final LinkedHashMap loadAd;
    public final ArrayList yandex;

    public C4291l(ArrayList arrayList, LinkedHashMap linkedHashMap, C5819l c5819l, LinkedHashMap linkedHashMap2) {
        this.yandex = arrayList;
        this.loadAd = linkedHashMap;
        this.crashlytics = c5819l;
        this.amazon = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4291l)) {
            return false;
        }
        C4291l c4291l = (C4291l) obj;
        return this.yandex.equals(c4291l.yandex) && this.loadAd.equals(c4291l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c4291l.crashlytics) && this.amazon.equals(c4291l.amazon);
    }

    public final int hashCode() {
        int iMetrica = AbstractC15560l.metrica(this.loadAd, this.yandex.hashCode() * 31, 31);
        InterfaceC12918l interfaceC12918l = this.crashlytics;
        return this.amazon.hashCode() + ((iMetrica + (interfaceC12918l == null ? 0 : interfaceC12918l.hashCode())) * 31);
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.yandex + ", deferred=" + this.loadAd + ", postviewOutput=" + this.crashlytics + ", outputSurfaceMap=" + this.amazon + ')';
    }
}
