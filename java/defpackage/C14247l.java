package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٓٚۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14247l implements InterfaceC8393l, InterfaceC2244l, InterfaceC3136l {
    public static final C12691l Companion = new C12691l();
    public static final InterfaceC1220l[] amazon = {AbstractC9968l.crashlytics(2, new C7703l(24)), null, null};
    public final String crashlytics;
    public final String loadAd;
    public final List yandex;

    public /* synthetic */ C14247l(int i, String str, String str2, List list) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C11869l.yandex.purchase());
            throw null;
        }
        this.yandex = list;
        this.loadAd = (i & 2) == 0 ? "" : str;
        if ((i & 4) == 0) {
            this.crashlytics = String.valueOf(list.hashCode());
        } else {
            this.crashlytics = str2;
        }
    }

    @Override // defpackage.InterfaceC2244l
    public final Object amazon(AbstractC0283l abstractC0283l) {
        return this.yandex;
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
        if (!(obj instanceof C14247l)) {
            return false;
        }
        C14247l c14247l = (C14247l) obj;
        return AbstractC8576l.yandex(this.yandex, c14247l.yandex) && AbstractC8576l.yandex(this.loadAd, c14247l.loadAd);
    }

    @Override // defpackage.InterfaceC17817l
    public final String getId() {
        return this.crashlytics;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC2244l
    public final Object loadAd(List list, AbstractC0283l abstractC0283l) {
        return AbstractC12900l.yandex(list, abstractC0283l);
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackIds(ids=");
        sb.append(this.yandex);
        sb.append(", displayName=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    public C14247l(String str, ArrayList arrayList) {
        this.yandex = arrayList;
        this.loadAd = str;
        this.crashlytics = String.valueOf(arrayList.hashCode());
    }

    public /* synthetic */ C14247l(ArrayList arrayList) {
        this("", arrayList);
    }
}
