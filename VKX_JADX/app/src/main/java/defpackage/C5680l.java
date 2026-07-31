package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘٓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5680l implements InterfaceC15313l {
    public final List amazon;
    public final C6410l billing;
    public final List crashlytics;
    public final int loadAd;
    public final C12539l purchase;
    public final int yandex;

    public C5680l(int i, int i2, List list, List list2, C12539l c12539l, C6410l c6410l) {
        this.yandex = i;
        this.loadAd = i2;
        if (list == null) {
            C6541l.subs("Null audioProfiles");
            throw null;
        }
        this.crashlytics = list;
        if (list2 == null) {
            C6541l.subs("Null videoProfiles");
            throw null;
        }
        this.amazon = list2;
        this.purchase = c12539l;
        if (c6410l != null) {
            this.billing = c6410l;
        } else {
            C6541l.subs("Null defaultVideoProfile");
            throw null;
        }
    }

    @Override // defpackage.InterfaceC15313l
    public final List amazon() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC15313l
    public final List crashlytics() {
        return this.crashlytics;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5680l) {
            C5680l c5680l = (C5680l) obj;
            if (this.yandex == c5680l.yandex && this.loadAd == c5680l.loadAd && this.crashlytics.equals(c5680l.crashlytics) && this.amazon.equals(c5680l.amazon)) {
                C12539l c12539l = c5680l.purchase;
                C12539l c12539l2 = this.purchase;
                if (c12539l2 != null ? c12539l2.equals(c12539l) : c12539l == null) {
                    if (this.billing.equals(c5680l.billing)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.yandex ^ 1000003) * 1000003) ^ this.loadAd) * 1000003) ^ this.crashlytics.hashCode()) * 1000003) ^ this.amazon.hashCode()) * 1000003;
        C12539l c12539l = this.purchase;
        return this.billing.hashCode() ^ ((iHashCode ^ (c12539l == null ? 0 : c12539l.hashCode())) * 1000003);
    }

    @Override // defpackage.InterfaceC15313l
    public final int loadAd() {
        return this.loadAd;
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.yandex + ", recommendedFileFormat=" + this.loadAd + ", audioProfiles=" + this.crashlytics + ", videoProfiles=" + this.amazon + ", defaultAudioProfile=" + this.purchase + ", defaultVideoProfile=" + this.billing + "}";
    }

    @Override // defpackage.InterfaceC15313l
    public final int yandex() {
        return this.yandex;
    }
}
