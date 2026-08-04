package defpackage;

import java.util.List;

/* JADX INFO: renamed from: l٘ۢۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C18292l {
    public static final C13559l Companion = new C13559l();
    public static final InterfaceC1220l[] billing = {null, AbstractC9968l.crashlytics(2, new C14499l(3)), AbstractC9968l.crashlytics(2, new C14499l(4)), AbstractC9968l.crashlytics(2, new C14499l(5)), null};
    public final List amazon;
    public final List crashlytics;
    public final List loadAd;
    public final String purchase;
    public final int yandex;

    public /* synthetic */ C18292l(int i, int i2, List list, List list2, List list3, String str) {
        this.yandex = (i & 1) == 0 ? 0 : i2;
        int i3 = i & 2;
        C2580l c2580l = C2580l.f5619l;
        if (i3 == 0) {
            this.loadAd = c2580l;
        } else {
            this.loadAd = list;
        }
        if ((i & 4) == 0) {
            this.crashlytics = c2580l;
        } else {
            this.crashlytics = list2;
        }
        if ((i & 8) == 0) {
            this.amazon = c2580l;
        } else {
            this.amazon = list3;
        }
        if ((i & 16) == 0) {
            this.purchase = null;
        } else {
            this.purchase = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18292l)) {
            return false;
        }
        C18292l c18292l = (C18292l) obj;
        return this.yandex == c18292l.yandex && AbstractC8576l.yandex(this.loadAd, c18292l.loadAd) && AbstractC8576l.yandex(this.crashlytics, c18292l.crashlytics) && AbstractC8576l.yandex(this.amazon, c18292l.amazon) && AbstractC8576l.yandex(this.purchase, c18292l.purchase);
    }

    public final int hashCode() {
        int iAdmob = AbstractC14814l.admob(AbstractC14814l.admob(AbstractC14814l.admob(this.yandex * 31, 31, this.loadAd), 31, this.crashlytics), 31, this.amazon);
        String str = this.purchase;
        return iAdmob + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetPlaylistsResponseDto(count=");
        sb.append(this.yandex);
        sb.append(", items=");
        sb.append(this.loadAd);
        sb.append(", groups=");
        sb.append(this.crashlytics);
        sb.append(", profiles=");
        sb.append(this.amazon);
        sb.append(", nextFrom=");
        return AbstractC2812l.tapsense(sb, this.purchase, ')');
    }
}
