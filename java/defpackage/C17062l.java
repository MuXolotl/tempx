package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lؘِٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C17062l {
    public static final C12140l Companion = new C12140l();
    public final String yandex;

    public C17062l(C17918l c17918l) {
        this.yandex = AbstractC8669l.m2397case(c17918l.mopub(), "", C16274l.f31848l, 30).toLowerCase(Locale.ROOT);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17062l) && AbstractC8576l.yandex(this.yandex, ((C17062l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("BsonValueJson(data="), this.yandex, ')');
    }

    public C17062l(int i, String str) {
        if (1 == (i & 1)) {
            this.yandex = str;
        } else {
            AbstractC11036l.isPro(i, 1, C0902l.loadAd);
            throw null;
        }
    }
}
