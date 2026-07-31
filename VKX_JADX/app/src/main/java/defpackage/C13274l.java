package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lَْۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13274l implements InterfaceC3937l, InterfaceC2373l {
    public final String amazon;
    public final String crashlytics;
    public final String loadAd = "";
    public final List yandex;

    public C13274l(List list) {
        this.yandex = list;
        StringBuilder sb = new StringBuilder("Bearer ");
        C3544l c3544l = C3544l.yandex;
        C5993l c5993l = C3544l.loadAd;
        sb.append(c5993l.yandex() ? c5993l.loadAd.loadAd : "");
        this.crashlytics = sb.toString();
        this.amazon = "uma_" + list.hashCode();
    }

    @Override // defpackage.InterfaceC17817l
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.InterfaceC17817l
    public final String crashlytics() {
        return this.loadAd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13274l)) {
            return false;
        }
        C13274l c13274l = (C13274l) obj;
        return AbstractC8576l.yandex(this.yandex, c13274l.yandex) && this.loadAd.equals(c13274l.loadAd);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.amazon;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return this.crashlytics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackObjects(tracks=");
        sb.append(this.yandex);
        sb.append(", displayName=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    @Override // defpackage.InterfaceC2373l
    public final Object yandex(InterfaceC14029l interfaceC14029l) {
        return this.yandex;
    }
}
