package defpackage;

/* JADX INFO: renamed from: lؔؐۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2313l implements InterfaceC6152l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte[] f5018l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f5019l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0361l f5020l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f5021l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public byte[] f5022l;

    public C2313l(InterfaceC16922l interfaceC16922l) {
        this.f5020l = new C0361l(interfaceC16922l);
        this.f5019l = interfaceC16922l.getDigestSize();
    }

    @Override // defpackage.InterfaceC6152l
    public final void billing(InterfaceC16937l interfaceC16937l) {
        if (!(interfaceC16937l instanceof C12333l)) {
            C8339l.metrica("HKDF parameters required for HKDFBytesGenerator");
            return;
        }
        C12333l c12333l = (C12333l) interfaceC16937l;
        byte[] bArr = c12333l.yandex;
        byte[] bArrCrashlytics = AbstractC14024l.crashlytics(c12333l.loadAd);
        byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(bArr);
        int i = this.f5019l;
        C0361l c0361l = this.f5020l;
        if (bArrCrashlytics == null) {
            c0361l.init(new C13886l(new byte[i], 0, i));
        } else {
            c0361l.init(new C13886l(bArrCrashlytics, 0, bArrCrashlytics.length));
        }
        c0361l.update(bArrCrashlytics2, 0, bArrCrashlytics2.length);
        byte[] bArr2 = new byte[i];
        c0361l.doFinal(bArr2, 0);
        c0361l.init(new C13886l(bArr2, 0, i));
        this.f5018l = AbstractC14024l.crashlytics(c12333l.crashlytics);
        this.f5021l = 0;
        this.f5022l = new byte[i];
    }

    @Override // defpackage.InterfaceC6152l
    public final int purchase(int i, byte[] bArr) {
        int i2 = this.f5021l;
        int i3 = i2 + i;
        int i4 = this.f5019l;
        if (i3 > i4 * 255) {
            C10754l.ad("HKDF may only be used for 255 * HashLen bytes of output");
            return 0;
        }
        if (i2 % i4 == 0) {
            yandex();
        }
        int i5 = this.f5021l % i4;
        int iMin = Math.min(i4 - i5, i);
        System.arraycopy(this.f5022l, i5, bArr, 0, iMin);
        this.f5021l += iMin;
        int i6 = i - iMin;
        while (i6 > 0) {
            yandex();
            int iMin2 = Math.min(i4, i6);
            System.arraycopy(this.f5022l, 0, bArr, iMin, iMin2);
            this.f5021l += iMin2;
            i6 -= iMin2;
            iMin += iMin2;
        }
        return i;
    }

    public final void yandex() {
        int i = this.f5021l;
        int i2 = this.f5019l;
        int i3 = (i / i2) + 1;
        if (i3 >= 256) {
            C10754l.ad("HKDF cannot generate more than 255 blocks of HashLen size");
            return;
        }
        C0361l c0361l = this.f5020l;
        if (i != 0) {
            c0361l.update(this.f5022l, 0, i2);
        }
        byte[] bArr = this.f5018l;
        c0361l.update(bArr, 0, bArr.length);
        c0361l.update((byte) i3);
        c0361l.doFinal(this.f5022l, 0);
    }
}
