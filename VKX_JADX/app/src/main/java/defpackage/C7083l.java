package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lؘؚٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7083l implements InterfaceC8145l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public SecureRandom f14847l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C13812l f14848l;

    @Override // defpackage.InterfaceC8145l
    public final C18595l purchase() {
        C5775l c5775lAmazon = C5775l.amazon(this.f14848l, this.f14847l);
        byte[] bArr = new byte[32];
        c5775lAmazon.yandex.nextBytes(bArr);
        byte[][] bArrLoadAd = c5775lAmazon.loadAd(bArr);
        return new C18595l(new C4124l(this.f14848l, bArrLoadAd[0], bArrLoadAd[6]), new C8729l(this.f14848l, bArrLoadAd[0], bArrLoadAd[1], bArrLoadAd[2], bArrLoadAd[3], bArrLoadAd[4], bArrLoadAd[5], bArrLoadAd[6], bArrLoadAd[7]), 7);
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public final void mo274throws(C14785l c14785l) {
        this.f14848l = ((C9957l) c14785l).f20313l;
        this.f14847l = (SecureRandom) c14785l.f28907l;
    }
}
