package defpackage;

/* JADX INFO: renamed from: lْ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18000l extends AbstractC3302l {
    public final C9358l loadAd;
    public final String yandex;

    public C18000l(String str, C9358l c9358l) {
        this.yandex = str;
        this.loadAd = c9358l;
    }

    public final String toString() {
        return AbstractC14814l.ads("(typeUrl=", this.yandex, ", outputPrefixType=", this.loadAd.yandex, ")");
    }

    @Override // defpackage.AbstractC3302l
    public final boolean yandex() {
        return this.loadAd != C9358l.purchase;
    }
}
