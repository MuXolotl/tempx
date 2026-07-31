package defpackage;

/* JADX INFO: renamed from: lٌُؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C10913l {
    public static final C10860l Companion = new C10860l();
    public final String loadAd;
    public final String yandex;

    public /* synthetic */ C10913l(String str, int i, String str2) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C0697l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10913l)) {
            return false;
        }
        C10913l c10913l = (C10913l) obj;
        return AbstractC8576l.yandex(this.yandex, c10913l.yandex) && AbstractC8576l.yandex(this.loadAd, c10913l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthAgreementLinkDto(name=");
        sb.append(this.yandex);
        sb.append(", uri=");
        return AbstractC2812l.tapsense(sb, this.loadAd, ')');
    }
}
