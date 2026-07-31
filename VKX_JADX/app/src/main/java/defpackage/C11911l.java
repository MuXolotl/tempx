package defpackage;

/* JADX INFO: renamed from: lَِ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11911l {
    public final C11310l loadAd;
    public final String yandex;

    public C11911l(String str, C11310l c11310l) {
        this.yandex = str;
        this.loadAd = c11310l;
        if (AbstractC12024l.m3315catch(str)) {
            C8339l.metrica("Name can't be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11911l)) {
            return false;
        }
        C11911l c11911l = (C11911l) obj;
        return this.yandex.equals(c11911l.yandex) && this.loadAd.equals(c11911l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: ".concat(this.yandex);
    }
}
