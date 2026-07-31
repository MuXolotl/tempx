package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lؕۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3786l implements InterfaceC8145l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public SecureRandom f7877l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C18493l f7878l;

    @Override // defpackage.InterfaceC8145l
    public final C18595l purchase() {
        C13409l c13409lCrashlytics = C13409l.crashlytics(this.f7878l);
        SecureRandom secureRandom = this.f7877l;
        c13409lCrashlytics.getClass();
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        secureRandom.nextBytes(bArr);
        secureRandom.nextBytes(bArr2);
        byte[][] bArrLoadAd = c13409lCrashlytics.loadAd(bArr, bArr2);
        return new C18595l(new C1658l(this.f7878l, bArrLoadAd[0], bArrLoadAd[1]), new C10146l(this.f7878l, bArrLoadAd[2], bArrLoadAd[3], bArrLoadAd[4], bArrLoadAd[0], bArrLoadAd[1], bArrLoadAd[5]), 7);
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public final void mo274throws(C14785l c14785l) {
        this.f7878l = ((C11058l) c14785l).f22254l;
        this.f7877l = (SecureRandom) c14785l.f28907l;
    }
}
