package defpackage;

/* JADX INFO: renamed from: lًؘؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5413l extends AbstractC7775l {
    public final String crashlytics;
    public final int loadAd;
    public final String yandex;

    public C5413l(String str, int i) {
        this.yandex = str;
        this.loadAd = i;
        if (i <= 0) {
            C8339l.metrica("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
            throw null;
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.yandex);
        int i3 = this.loadAd;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        sb.append(")");
        this.crashlytics = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5413l)) {
            return false;
        }
        C5413l c5413l = (C5413l) obj;
        return AbstractC8576l.yandex(this.yandex, c5413l.yandex) && this.loadAd == c5413l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        return this.crashlytics;
    }
}
