package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؚٕۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C7575l {
    public static final C9448l Companion = new C9448l();
    public static final InterfaceC1220l[] crashlytics = {AbstractC9968l.crashlytics(2, new C8631l(24)), AbstractC9968l.crashlytics(2, new C8631l(25))};
    public final List loadAd;
    public final List yandex;

    public /* synthetic */ C7575l(int i, List list, List list2) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C16309l.yandex.purchase());
            throw null;
        }
        this.yandex = list;
        this.loadAd = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7575l)) {
            return false;
        }
        C7575l c7575l = (C7575l) obj;
        return AbstractC8576l.yandex(this.yandex, c7575l.yandex) && AbstractC8576l.yandex(this.loadAd, c7575l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshTokensResponseDto(success=");
        sb.append(this.yandex);
        sb.append(", errors=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}
