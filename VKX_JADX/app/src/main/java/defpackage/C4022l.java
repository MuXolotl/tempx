package defpackage;

import java.io.IOException;
import java.security.SecureRandom;

/* JADX INFO: renamed from: lٍؖ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4022l implements InterfaceC14091l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final byte[] f8287l = new byte[0];

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public SecureRandom f8288l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public byte[] f8289l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte[] f8290l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C8729l f8291l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C4124l f8292l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public byte[] f8293l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C17711l f8294l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C5775l f8295l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public byte[] f8296l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public byte[] f8297l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte[] f8298l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public byte[] f8299l;

    @Override // defpackage.InterfaceC14091l
    public final byte[] crashlytics() {
        C17951l c17951lYandex = yandex();
        byte[] bArr = new byte[32];
        SecureRandom secureRandom = this.f8288l;
        if (secureRandom != null) {
            secureRandom.nextBytes(bArr);
        }
        this.f8295l.getClass();
        byte[] bArr2 = new byte[64];
        c17951lYandex.crashlytics(0, 64, bArr2);
        return this.f8295l.crashlytics(bArr2, c17951lYandex, this.f8289l, this.f8290l, this.f8297l, this.f8299l, this.f8296l, bArr);
    }

    @Override // defpackage.InterfaceC14091l
    public final void init(boolean z, InterfaceC9719l interfaceC9719l) {
        byte[] bArrCrashlytics;
        C13812l c13812l;
        this.f8296l = null;
        this.f8299l = null;
        this.f8293l = null;
        this.f8297l = null;
        this.f8290l = null;
        this.f8289l = null;
        if (interfaceC9719l instanceof C11702l) {
            C11702l c11702l = (C11702l) interfaceC9719l;
            bArrCrashlytics = AbstractC14024l.crashlytics(c11702l.f23446l);
            interfaceC9719l = c11702l.f23447l;
            if (bArrCrashlytics.length > 255) {
                C8339l.metrica("context too long");
                return;
            }
        } else {
            bArrCrashlytics = f8287l;
        }
        if (z) {
            this.f8292l = null;
            if (interfaceC9719l instanceof C6114l) {
                C6114l c6114l = (C6114l) interfaceC9719l;
                this.f8291l = (C8729l) c6114l.f12903l;
                this.f8288l = c6114l.f12904l;
            } else {
                this.f8291l = (C8729l) interfaceC9719l;
                this.f8288l = null;
            }
            c13812l = (C13812l) this.f8291l.f16541l;
            this.f8295l = C5775l.amazon(c13812l, this.f8288l);
            this.f8289l = AbstractC14024l.crashlytics(this.f8291l.f17955l);
            this.f8297l = AbstractC14024l.crashlytics(this.f8291l.f17957l);
            this.f8290l = AbstractC14024l.crashlytics(this.f8291l.f17960l);
            this.f8299l = AbstractC14024l.crashlytics(this.f8291l.f17962l);
            this.f8296l = AbstractC14024l.crashlytics(this.f8291l.f17956l);
            C5775l c5775l = this.f8295l;
            byte[] bArrCrashlytics2 = AbstractC14024l.crashlytics(this.f8291l.f17959l);
            C17951l c17951l = c5775l.loadAd;
            c17951l.billing(0, 64, bArrCrashlytics2);
            c17951l.update((byte) 1);
            c17951l.update((byte) bArrCrashlytics.length);
            c17951l.billing(0, bArrCrashlytics.length, bArrCrashlytics);
        } else {
            C4124l c4124l = (C4124l) interfaceC9719l;
            this.f8292l = c4124l;
            this.f8291l = null;
            this.f8288l = null;
            c13812l = (C13812l) c4124l.f16541l;
            this.f8295l = C5775l.amazon(c13812l, null);
            this.f8289l = AbstractC14024l.crashlytics(this.f8292l.f8488l);
            byte[] bArrCrashlytics3 = AbstractC14024l.crashlytics(this.f8292l.f8489l);
            this.f8293l = bArrCrashlytics3;
            C5775l c5775l2 = this.f8295l;
            byte[] bArr = this.f8289l;
            byte[] bArr2 = new byte[64];
            C17951l c17951l2 = c5775l2.loadAd;
            c17951l2.billing(0, bArr.length, bArr);
            c17951l2.billing(0, bArrCrashlytics3.length, bArrCrashlytics3);
            c17951l2.crashlytics(0, 64, bArr2);
            c17951l2.billing(0, 64, bArr2);
            c17951l2.update((byte) 1);
            c17951l2.update((byte) bArrCrashlytics.length);
            c17951l2.billing(0, bArrCrashlytics.length, bArrCrashlytics);
        }
        int i = c13812l.crashlytics;
        if (i != 0 && i != 1) {
            C8339l.metrica("unknown parameters type");
            return;
        }
        this.f8294l = new C17711l();
        try {
            this.f8298l = AbstractC9237l.yandex("SHA-512").remoteconfig("DER");
        } catch (IOException e) {
            C8339l.smaato(AbstractC5020l.adcel(e, new StringBuilder("oid encoding failed: ")));
        }
    }

    @Override // defpackage.InterfaceC14091l
    public final boolean loadAd(byte[] bArr) {
        C17951l c17951lYandex = yandex();
        C5775l c5775l = this.f8295l;
        int length = bArr.length;
        byte[] bArr2 = this.f8289l;
        byte[] bArr3 = this.f8293l;
        byte[] bArr4 = new byte[Math.max((c5775l.billing * c5775l.amazon) + 64, c5775l.vip)];
        c17951lYandex.doFinal(bArr4, 0);
        return c5775l.yandex(bArr4, bArr, length, c17951lYandex, bArr2, bArr3);
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte b) {
        this.f8294l.update(b);
    }

    public final C17951l yandex() {
        this.f8294l.getClass();
        byte[] bArr = new byte[64];
        this.f8294l.doFinal(bArr, 0);
        C17951l c17951l = new C17951l(this.f8295l.loadAd);
        byte[] bArr2 = this.f8298l;
        c17951l.billing(0, bArr2.length, bArr2);
        c17951l.billing(0, 64, bArr);
        return c17951l;
    }

    @Override // defpackage.InterfaceC14091l
    public final void update(byte[] bArr, int i, int i2) {
        this.f8294l.update(bArr, i, i2);
    }
}
