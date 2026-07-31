package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٍّؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C9497l {
    public static final C1650l Companion = new C1650l();
    public static final InterfaceC1220l[] loadAd = {AbstractC9968l.crashlytics(2, new C8631l(18))};
    public final List yandex;

    public /* synthetic */ C9497l(int i, List list) {
        if ((i & 1) == 0) {
            this.yandex = null;
        } else {
            this.yandex = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9497l) && AbstractC8576l.yandex(this.yandex, ((C9497l) obj).yandex);
    }

    public final int hashCode() {
        List list = this.yandex;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return AbstractC0653l.subscription(new StringBuilder("AuthGetExchangeTokenResponseDto(usersExchangeTokens="), this.yandex, ')');
    }
}
