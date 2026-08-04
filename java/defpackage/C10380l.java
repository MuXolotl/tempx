package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lَٙٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10380l implements InterfaceC14091l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final byte[] f21175l = new byte[0];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public SecureRandom f21176l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public byte[] f21177l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte[] f21178l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C8729l f21179l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C4124l f21180l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public byte[] f21181l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C17951l f21182l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C5775l f21183l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public byte[] f21184l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte[] f21185l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public byte[] f21186l;

    public final void amazon() {
        this.f21182l = new C17951l(this.f21183l.loadAd);
    }

    @Override // defpackage.InterfaceC14091l
    public final byte[] crashlytics() {
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.f21176l;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        C5775l c5775l = this.f21183l;
        C17951l c17951l = this.f21182l;
        c5775l.getClass();
        byte[] bArr2 = new byte[64];
        c17951l.crashlytics(0, 64, bArr2);
        byte[] bArrCrashlytics = this.f21183l.crashlytics(bArr2, this.f21182l, this.f21185l, this.f21177l, this.f21178l, this.f21181l, this.f21186l, bArr);
        amazon();
        return bArrCrashlytics;
    }

    @Override // defpackage.InterfaceC14091l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        byte[] bArrCrashlytics;
        C13812l c13812l;
        String str;
        this.f21186l = null;
        this.f21181l = null;
        this.f21184l = null;
        this.f21178l = null;
        this.f21177l = null;
        this.f21185l = null;
        if (interfaceC9719l instanceof C11702l) {
            C11702l c11702l = (C11702l) interfaceC9719l;
            bArrCrashlytics = AbstractC14024l.crashlytics(c11702l.f23446l);
            interfaceC9719l = c11702l.f23447l;
            if (bArrCrashlytics.length > 255) {
                str = "context too long";
            }
            C8339l.metrica(str);
        }
        bArrCrashlytics = f21175l;
        if (z) {
            this.f21180l = null;
            if (interfaceC9719l instanceof C6114l) {
                C6114l c6114l = (C6114l) interfaceC9719l;
                this.f21179l = (C8729l) c6114l.f12903l;
                this.f21176l = c6114l.f12904l;
            } else {
                this.f21179l = (C8729l) interfaceC9719l;
                this.f21176l = null;
            }
            c13812l = (C13812l) this.f21179l.f16541l;
            this.f21183l = C5775l.amazon(c13812l, this.f21176l);
            this.f21185l = AbstractC14024l.crashlytics(this.f21179l.f17955l);
            this.f21178l = AbstractC14024l.crashlytics(this.f21179l.f17957l);
            this.f21177l = AbstractC14024l.crashlytics(this.f21179l.f17960l);
            this.f21181l = AbstractC14024l.crashlytics(this.f21179l.f17962l);
            this.f21186l = AbstractC14024l.crashlytics(this.f21179l.f17956l);
            C5775l c5775l = this.f21183l;
            byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(this.f21179l.f17959l);
            C17951l c17951l = c5775l.loadAd;
            c17951l.billing(0, 64, bArrCrashlytics2);
            c17951l.update((byte) 0);
            c17951l.update((byte) bArrCrashlytics.length);
            c17951l.billing(0, bArrCrashlytics.length, bArrCrashlytics);
        } else {
            C4124l c4124l = (C4124l) interfaceC9719l;
            this.f21180l = c4124l;
            this.f21179l = null;
            this.f21176l = null;
            c13812l = (C13812l) c4124l.f16541l;
            this.f21183l = C5775l.amazon(c13812l, null);
            this.f21184l = AbstractC14024l.crashlytics(this.f21180l.f8489l);
            byte[] bArrCrashlytics3 = AbstractC14024l.crashlytics(this.f21180l.f8488l);
            this.f21185l = bArrCrashlytics3;
            C5775l c5775l2 = this.f21183l;
            byte[] bArr = this.f21184l;
            byte[] bArr2 = new byte[64];
            C17951l c17951l2 = c5775l2.loadAd;
            c17951l2.billing(0, bArrCrashlytics3.length, bArrCrashlytics3);
            c17951l2.billing(0, bArr.length, bArr);
            c17951l2.crashlytics(0, 64, bArr2);
            c17951l2.billing(0, 64, bArr2);
            c17951l2.update((byte) 0);
            c17951l2.update((byte) bArrCrashlytics.length);
            c17951l2.billing(0, bArrCrashlytics.length, bArrCrashlytics);
        }
        if (c13812l.crashlytics == 0) {
            amazon();
        } else {
            str = "\"pure\" ml-dsa must use non pre-hash parameters";
            C8339l.metrica(str);
        }
    }

    @Override // defpackage.InterfaceC14091l
    public final boolean loadAd(byte[] bArr) {
        C5775l c5775l = this.f21183l;
        int length = bArr.length;
        C17951l c17951l = this.f21182l;
        byte[] bArr2 = this.f21185l;
        byte[] bArr3 = this.f21184l;
        byte[] bArr4 = new byte[Math.max((c5775l.billing * c5775l.amazon) + 64, c5775l.vip)];
        c17951l.doFinal(bArr4, 0);
        boolean zYandex = c5775l.yandex(bArr4, bArr, length, c17951l, bArr2, bArr3);
        amazon();
        return zYandex;
    }

    public final boolean purchase(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            C10754l.ad("mu value must be 64 bytes");
            return false;
        }
        this.f21182l.reset();
        C5775l c5775l = this.f21183l;
        int length = bArr2.length;
        C17951l c17951l = this.f21182l;
        byte[] bArr3 = this.f21185l;
        byte[] bArr4 = this.f21184l;
        byte[] bArr5 = new byte[Math.max((c5775l.billing * c5775l.amazon) + 64, c5775l.vip)];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        boolean zYandex = c5775l.yandex(bArr5, bArr2, length, c17951l, bArr3, bArr4);
        amazon();
        return zYandex;
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte b) {
        this.f21182l.update(b);
    }

    public final byte[] yandex(byte[] bArr) {
        if (bArr.length != 64) {
            C10754l.ad("mu value must be 64 bytes");
            return null;
        }
        byte[] bArr2 = new byte[32];
        SecureRandom secureRandom = this.f21176l;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr2);
        }
        this.f21182l.reset();
        byte[] bArrCrashlytics = this.f21183l.crashlytics(bArr, this.f21182l, this.f21185l, this.f21177l, this.f21178l, this.f21181l, this.f21186l, bArr2);
        amazon();
        return bArrCrashlytics;
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte[] bArr, int i, int i2) {
        this.f21182l.billing(i, i2, bArr);
    }
}
