package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؘٔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C5682l {
    public static final C5862l Companion = new C5862l();
    public static final InterfaceC1220l[] purchase = {null, AbstractC9968l.crashlytics(2, new C8631l(27)), null, AbstractC9968l.crashlytics(2, new C8631l(28))};
    public final List amazon;
    public final String crashlytics;
    public final EnumC8858l loadAd;
    public final long yandex;

    public /* synthetic */ C5682l(int i, C10877l c10877l, EnumC8858l enumC8858l, String str, List list) {
        if (1 != (i & 1)) {
            AbstractC11036l.isPro(i, 1, C10496l.yandex.purchase());
            throw null;
        }
        this.yandex = c10877l.yandex;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = enumC8858l;
        }
        if ((i & 4) == 0) {
            this.crashlytics = null;
        } else {
            this.crashlytics = str;
        }
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5682l)) {
            return false;
        }
        C5682l c5682l = (C5682l) obj;
        return C10877l.yandex(this.yandex, c5682l.yandex) && this.loadAd == c5682l.loadAd && AbstractC8576l.yandex(this.crashlytics, c5682l.crashlytics) && AbstractC8576l.yandex(this.amazon, c5682l.amazon);
    }

    public final int hashCode() {
        int iLoadAd = C10877l.loadAd(this.yandex) * 31;
        EnumC8858l enumC8858l = this.loadAd;
        int iHashCode = (iLoadAd + (enumC8858l == null ? 0 : enumC8858l.hashCode())) * 31;
        String str = this.crashlytics;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.amazon;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthUserExchangeTokenDto(userId=");
        sb.append((Object) String.valueOf(this.yandex));
        sb.append(", profileType=");
        sb.append(this.loadAd);
        sb.append(", commonToken=");
        sb.append(this.crashlytics);
        sb.append(", tierTokens=");
        return AbstractC0653l.subscription(sb, this.amazon, ')');
    }
}
