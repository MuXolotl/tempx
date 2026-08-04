package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؖۖؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C4308l {
    public static final C9521l Companion = new C9521l();
    public static final InterfaceC1220l[] crashlytics = {null, AbstractC9968l.crashlytics(2, new C14499l(14))};
    public final List loadAd;
    public final String yandex;

    public /* synthetic */ C4308l(int i, String str, List list) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C7673l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4308l)) {
            return false;
        }
        C4308l c4308l = (C4308l) obj;
        return AbstractC8576l.yandex(this.yandex, c4308l.yandex) && AbstractC8576l.yandex(this.loadAd, c4308l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPhotosByTypeDto(type=");
        sb.append(this.yandex);
        sb.append(", photo=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}
