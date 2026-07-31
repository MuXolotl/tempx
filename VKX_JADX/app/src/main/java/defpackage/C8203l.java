package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًۖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8203l {
    public final Boolean admob;
    public final C12468l amazon;
    public final List billing;
    public final C1799l crashlytics;
    public final Boolean isPro;
    public final C7514l loadAd;
    public final List mopub;
    public final List purchase;
    public final Boolean subs;
    public final C6558l yandex;

    public C8203l(C6558l c6558l, C7514l c7514l, C1799l c1799l, C12468l c12468l, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.yandex = c6558l;
        this.loadAd = c7514l;
        this.crashlytics = c1799l;
        this.amazon = c12468l;
        this.purchase = list;
        this.billing = list2;
        this.mopub = list3;
        this.admob = bool;
        this.subs = bool2;
        this.isPro = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8203l)) {
            return false;
        }
        C8203l c8203l = (C8203l) obj;
        return AbstractC8576l.yandex(this.yandex, c8203l.yandex) && AbstractC8576l.yandex(this.loadAd, c8203l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c8203l.crashlytics) && AbstractC8576l.yandex(this.amazon, c8203l.amazon) && AbstractC8576l.yandex(this.purchase, c8203l.purchase) && AbstractC8576l.yandex(this.billing, c8203l.billing) && AbstractC8576l.yandex(this.mopub, c8203l.mopub) && AbstractC8576l.yandex(this.admob, c8203l.admob) && AbstractC8576l.yandex(this.subs, c8203l.subs) && AbstractC8576l.yandex(this.isPro, c8203l.isPro);
    }

    public final int hashCode() {
        C6558l c6558l = this.yandex;
        int i = (c6558l == null ? 0 : c6558l.yandex) * 31;
        C7514l c7514l = this.loadAd;
        int i2 = (i + (c7514l == null ? 0 : c7514l.yandex)) * 31;
        C1799l c1799l = this.crashlytics;
        int i3 = (i2 + (c1799l == null ? 0 : c1799l.yandex)) * 31;
        C12468l c12468l = this.amazon;
        int i4 = (i3 + (c12468l == null ? 0 : c12468l.yandex)) * 31;
        List list = this.purchase;
        int iHashCode = (i4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.billing;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.mopub;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.admob;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.subs;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isPro;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        return "State3A(aeMode=" + this.yandex + ", afMode=" + this.loadAd + ", awbMode=" + this.crashlytics + ", flashMode=" + this.amazon + ", aeRegions=" + this.purchase + ", afRegions=" + this.billing + ", awbRegions=" + this.mopub + ", aeLock=" + this.admob + ", afLock=" + this.subs + ", awbLock=" + this.isPro + ')';
    }
}
