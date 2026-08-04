package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٜٔؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15019l {
    public final List amazon;
    public final List crashlytics;
    public final List loadAd;
    public final C2421l purchase;
    public final List yandex;

    public C15019l(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, List list, C2421l c2421l) {
        this.yandex = AbstractC9905l.loadAd(arrayList);
        this.loadAd = AbstractC9905l.loadAd(arrayList2);
        this.crashlytics = AbstractC9905l.loadAd(arrayList3);
        this.amazon = AbstractC9905l.loadAd(list);
        this.purchase = c2421l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15019l)) {
            return false;
        }
        C15019l c15019l = (C15019l) obj;
        return Objects.equals(this.crashlytics, c15019l.crashlytics) && Objects.equals(this.yandex, c15019l.yandex) && Objects.equals(this.loadAd, c15019l.loadAd) && Objects.equals(this.amazon, c15019l.amazon) && Objects.equals(this.purchase, c15019l.purchase);
    }

    public final int hashCode() {
        return Objects.hash(this.crashlytics, this.yandex, this.loadAd, this.amazon, this.purchase);
    }

    public final String toString() {
        return "(MasterPlaylist mPlaylists=" + this.yandex.toString() + " mIFramePlaylists=" + this.loadAd.toString() + " mMediaData=" + this.crashlytics.toString() + " mUnknownTags=" + this.amazon.toString() + " mStartData=" + this.purchase.toString() + ")";
    }
}
