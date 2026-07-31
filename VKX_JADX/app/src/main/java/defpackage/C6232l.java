package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؙؔۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C6232l {
    public static final C13828l Companion = new C13828l();
    public static final InterfaceC1220l[] crashlytics = {null, AbstractC9968l.crashlytics(2, new C8810l(8))};
    public final List loadAd;
    public final long yandex;

    public /* synthetic */ C6232l(int i, long j, List list) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C14515l.yandex.purchase());
            throw null;
        }
        this.yandex = j;
        this.loadAd = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6232l)) {
            return false;
        }
        C6232l c6232l = (C6232l) obj;
        return this.yandex == c6232l.yandex && AbstractC8576l.yandex(this.loadAd, c6232l.loadAd);
    }

    public final int hashCode() {
        long j = this.yandex;
        return this.loadAd.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAccountsStoreModel(defaultAccountId=");
        sb.append(this.yandex);
        sb.append(", accountStore=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }

    public C6232l(long j, List list) {
        this.yandex = j;
        this.loadAd = list;
    }
}
