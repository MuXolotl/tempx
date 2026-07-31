package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lِْٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13305l {
    public static final C13305l mopub = new C13305l(null, 0, null, false, false, false, 127);
    public final boolean amazon;
    public final boolean billing;
    public final List crashlytics;
    public final long loadAd;
    public final boolean purchase;
    public final InterfaceC11805l yandex;

    public C13305l(InterfaceC11805l interfaceC11805l, long j, List list, boolean z, boolean z2, boolean z3, int i) {
        interfaceC11805l = (i & 1) != 0 ? C4618l.yandex : interfaceC11805l;
        j = (i & 2) != 0 ? 0L : j;
        list = (i & 4) != 0 ? C2580l.f5619l : list;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        this.yandex = interfaceC11805l;
        this.loadAd = j;
        this.crashlytics = list;
        this.amazon = z;
        this.purchase = z2;
        this.billing = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13305l)) {
            return false;
        }
        C13305l c13305l = (C13305l) obj;
        return this.yandex.equals(c13305l.yandex) && this.loadAd == c13305l.loadAd && this.crashlytics.equals(c13305l.crashlytics) && this.amazon == c13305l.amazon && this.purchase == c13305l.purchase && this.billing == c13305l.billing;
    }

    public final int hashCode() {
        int iHashCode = this.yandex.hashCode() * 31;
        long j = this.loadAd;
        return ((((((AbstractC14814l.admob((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.crashlytics) + (this.amazon ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchParameters(startingEntrypoint=");
        sb.append(this.yandex);
        sb.append(", startingPosition=");
        sb.append(this.loadAd);
        sb.append(", tracks=");
        sb.append(this.crashlytics);
        sb.append(", cancelOnSourceEquality=");
        sb.append(this.amazon);
        sb.append(", ignoreSourceReloadOptimizations=");
        sb.append(this.purchase);
        sb.append(", shuffle=");
        return AbstractC5020l.Signature(sb, this.billing, ", loadEverything=false)");
    }
}
