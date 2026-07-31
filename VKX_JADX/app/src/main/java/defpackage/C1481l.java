package defpackage;

/* JADX INFO: renamed from: lؒۦِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C1481l {
    public static final C12670l Companion = new C12670l();
    public final String yandex;

    public C1481l(int i, String str) {
        if (1 == (i & 1)) {
            this.yandex = str;
        } else {
            AbstractC11036l.isPro(i, 1, C17767l.loadAd);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1481l) && AbstractC8576l.yandex(this.yandex, ((C1481l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("BsonValueJson(data="), this.yandex, ')');
    }

    public C1481l(C13739l c13739l) {
        this.yandex = String.valueOf(c13739l.f26819l);
    }
}
