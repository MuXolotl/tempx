package defpackage;

/* JADX INFO: renamed from: lٕۦٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C16070l {
    public static final C17692l Companion = new C17692l();
    public final String yandex;

    public C16070l(int i, String str) {
        if (1 == (i & 1)) {
            this.yandex = str;
        } else {
            AbstractC11036l.isPro(i, 1, C0994l.loadAd);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16070l) && AbstractC8576l.yandex(this.yandex, ((C16070l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("BsonValueJson(data="), this.yandex, ')');
    }

    public C16070l(C8728l c8728l) {
        this.yandex = String.valueOf(c8728l.f17954l);
    }
}
