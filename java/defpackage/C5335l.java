package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lؘّؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5335l {
    public final HashMap admob;
    public final ArrayList amazon;
    public final C10245l billing;
    public final ArrayList crashlytics;
    public final C15002l isPro;
    public final ArrayList loadAd;
    public final AbstractC6896l mopub;
    public final ArrayList purchase;
    public final C15002l subs;
    public final LinkedHashSet yandex;

    public C5335l(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C10245l c10245l, AbstractC6896l abstractC6896l, HashMap map, C15002l c15002l, C15002l c15002l2) {
        this.yandex = linkedHashSet;
        this.loadAd = arrayList;
        this.crashlytics = arrayList2;
        this.amazon = arrayList3;
        this.purchase = arrayList4;
        this.billing = c10245l;
        this.mopub = abstractC6896l;
        this.admob = map;
        this.subs = c15002l;
        this.isPro = c15002l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5335l)) {
            return false;
        }
        C5335l c5335l = (C5335l) obj;
        return this.yandex.equals(c5335l.yandex) && this.loadAd.equals(c5335l.loadAd) && this.crashlytics.equals(c5335l.crashlytics) && this.amazon.equals(c5335l.amazon) && this.purchase.equals(c5335l.purchase) && AbstractC8576l.yandex(this.billing, c5335l.billing) && AbstractC8576l.yandex(this.mopub, c5335l.mopub) && this.admob.equals(c5335l.admob) && AbstractC8576l.yandex(this.subs, c5335l.subs) && AbstractC8576l.yandex(this.isPro, c5335l.isPro);
    }

    public final int hashCode() {
        int iHashCode = (this.purchase.hashCode() + ((this.amazon.hashCode() + ((this.crashlytics.hashCode() + ((this.loadAd.hashCode() + (this.yandex.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        C10245l c10245l = this.billing;
        int iHashCode2 = (iHashCode + (c10245l == null ? 0 : c10245l.hashCode())) * 31;
        AbstractC6896l abstractC6896l = this.mopub;
        int iHashCode3 = (this.subs.hashCode() + ((this.admob.hashCode() + ((iHashCode2 + (abstractC6896l == null ? 0 : abstractC6896l.hashCode())) * 31)) * 31)) * 31;
        C15002l c15002l = this.isPro;
        return iHashCode3 + (c15002l != null ? c15002l.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.yandex + ", cameraUseCases=" + this.loadAd + ", cameraUseCasesToAttach=" + this.crashlytics + ", cameraUseCasesToKeep=" + this.amazon + ", cameraUseCasesToDetach=" + this.purchase + ", streamSharing=" + this.billing + ", placeholderForExtensions=" + this.mopub + ", useCaseConfigs=" + this.admob + ", primaryStreamSpecResult=" + this.subs + ", secondaryStreamSpecResult=" + this.isPro + ')';
    }
}
