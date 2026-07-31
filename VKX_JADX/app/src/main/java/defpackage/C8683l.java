package defpackage;

import android.widget.RemoteViews;

/* JADX INFO: renamed from: lٌَؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8683l {
    public final C5697l loadAd;
    public final RemoteViews yandex;

    public C8683l(RemoteViews remoteViews, C5697l c5697l) {
        this.yandex = remoteViews;
        this.loadAd = c5697l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8683l)) {
            return false;
        }
        C8683l c8683l = (C8683l) obj;
        return this.yandex.equals(c8683l.yandex) && this.loadAd.equals(c8683l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.yandex + ", view=" + this.loadAd + ')';
    }
}
