package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lؓۚؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2093l {
    public List admob;
    public int amazon;
    public int billing;
    public int crashlytics;
    public final ArrayList loadAd;
    public final ArrayList mopub;
    public int purchase;
    public int subs;
    public final C13964l yandex;

    public C2093l(C13964l c13964l) {
        this.yandex = c13964l;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C10193l(0, 0));
        this.loadAd = arrayList;
        this.billing = -1;
        this.mopub = new ArrayList();
        this.admob = C2580l.f5619l;
    }

    public final int amazon() {
        return this.yandex.amazon.f26744l;
    }

    public final int crashlytics(int i) {
        if (amazon() <= 0) {
            return 0;
        }
        if (i >= amazon()) {
            AbstractC14825l.yandex("ItemIndex > total count");
        }
        return i / this.subs;
    }

    public final C17368l loadAd(int i) {
        List list;
        int i2 = this.subs;
        int i3 = i * i2;
        int iAmazon = amazon() - i3;
        if (i2 > iAmazon) {
            i2 = iAmazon;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 == this.admob.size()) {
            list = this.admob;
        } else {
            ArrayList arrayList = new ArrayList(i2);
            for (int i4 = 0; i4 < i2; i4++) {
                arrayList.add(new C1398l(1L));
            }
            this.admob = arrayList;
            list = arrayList;
        }
        return new C17368l(i3, list);
    }

    public final int purchase(int i) {
        C2443l c2443lAdvert = this.yandex.amazon.advert(i);
        int i2 = i - c2443lAdvert.yandex;
        return (int) ((C1398l) ((C7526l) c2443lAdvert.crashlytics).loadAd.invoke(C14559l.yandex, Integer.valueOf(i2))).yandex;
    }

    public final int yandex() {
        return ((int) Math.sqrt((((double) amazon()) * 1.0d) / ((double) this.subs))) + 1;
    }
}
