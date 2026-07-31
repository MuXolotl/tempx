package defpackage;

/* JADX INFO: renamed from: lٔۙٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15135l extends AbstractC12972l {
    public final C5254l loadAd;
    public final byte[] yandex;

    public C15135l(byte[] bArr, C5254l c5254l, int i) {
        c5254l = (i & 2) != 0 ? null : c5254l;
        this.yandex = bArr;
        this.loadAd = c5254l;
    }

    @Override // defpackage.AbstractC8870l
    public final C2759l amazon() {
        return null;
    }

    @Override // defpackage.AbstractC8870l
    public final C5254l loadAd() {
        return this.loadAd;
    }

    @Override // defpackage.AbstractC12972l
    public final byte[] purchase() {
        return this.yandex;
    }

    @Override // defpackage.AbstractC8870l
    public final Long yandex() {
        return Long.valueOf(this.yandex.length);
    }
}
