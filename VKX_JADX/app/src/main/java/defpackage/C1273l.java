package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؒۗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C1273l {
    public static final C12749l Companion = new C12749l();
    public static final InterfaceC1220l[] loadAd = {AbstractC9968l.crashlytics(2, new C14499l(6))};
    public final List yandex;

    public /* synthetic */ C1273l(int i, List list) {
        if (1 == (i & 1)) {
            this.yandex = list;
        } else {
            AbstractC11036l.isPro(i, 1, C1199l.yandex.purchase());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1273l) && AbstractC8576l.yandex(this.yandex, ((C1273l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC0653l.subscription(new StringBuilder("AudioGetRelatedArtistsResponseDto(artists="), this.yandex, ')');
    }
}
