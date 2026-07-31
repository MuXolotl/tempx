package defpackage;

/* JADX INFO: renamed from: lٔۘٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8296l
public final class C15120l {
    public static final C16630l Companion = new C16630l();
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ C15120l(int i, int i2, String str) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C14171l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15120l)) {
            return false;
        }
        C15120l c15120l = (C15120l) obj;
        return this.yandex == c15120l.yandex && AbstractC8576l.yandex(this.loadAd, c15120l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.yandex);
        sb.append(", uuid=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }

    public C15120l(int i, String str) {
        this.yandex = i;
        this.loadAd = str;
    }
}
