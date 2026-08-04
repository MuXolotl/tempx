package defpackage;

/* JADX INFO: renamed from: lؙّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14099l implements InterfaceC10162l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f27460l;

    public /* synthetic */ C14099l(Object obj) {
        this.f27460l = obj;
    }

    public byte[] loadAd(byte[] bArr, int i, int i2, byte[] bArr2, C5138l c5138l) {
        if (i2 == 0) {
            return AbstractC14024l.crashlytics(bArr);
        }
        if (i + i2 > 15) {
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC10000l.isPro(i + i3, 28, (byte[]) c5138l.f11181l);
            bArr = ((AbstractC6716l) this.f27460l).yandex(c5138l, bArr2, bArr);
        }
        return bArr;
    }

    @Override // defpackage.InterfaceC10162l
    public void metrica(C3823l c3823l) {
        C0948l c0948l = (C0948l) this.f27460l;
        if (c3823l.amazon) {
            c0948l.cancel(false);
            return;
        }
        if (c3823l.smaato()) {
            c0948l.smaato(c3823l.isPro());
            return;
        }
        Exception excSubs = c3823l.subs();
        if (excSubs != null) {
            c0948l.remoteconfig(excSubs);
        } else {
            C18073l.admob();
        }
    }

    public void yandex(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3) {
            if (i5 == 0) {
                i5 += 8;
                i6 = bArr[i];
                i++;
            }
            i5 -= ((AbstractC6716l) this.f27460l).loadAd;
            iArr[i2] = (i6 >>> i5) & 15;
            i4++;
            i2++;
        }
    }
}
