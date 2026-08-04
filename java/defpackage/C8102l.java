package defpackage;

/* JADX INFO: renamed from: lًٚ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8102l extends C17841l {
    public final void mopub(InterfaceC6951l interfaceC6951l, int i) {
        float[] fArr = this.yandex;
        int i2 = i + 1;
        long jYandex = interfaceC6951l.yandex(fArr[i], fArr[i2]);
        fArr[i] = Float.intBitsToFloat((int) (jYandex >> 32));
        fArr[i2] = Float.intBitsToFloat((int) (4294967295L & jYandex));
    }
}
