package defpackage;

import android.graphics.Rect;
import android.view.Surface;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lٌؙُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6344l implements InterfaceC0587l, InterfaceC2232l, InterfaceC4831l, InterfaceC12679l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f13303l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f13304l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f13305l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f13306l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f13307l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f13308l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f13309l;

    public C6344l(int i) {
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 2:
                this.f13306l = true;
                this.f13307l = null;
                this.f13309l = null;
                this.f13304l = new byte[]{9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
                this.f13308l = new byte[8];
                this.f13303l = new byte[8];
                this.f13305l = 0;
                break;
            default:
                this.f13303l = new Rect();
                C8945l c8945l = C8924l.crashlytics;
                this.f13308l = (C8924l) c8945l.subs();
                this.f13307l = (C8924l) c8945l.subs();
                this.f13309l = new C11891l(i3);
                this.f13304l = new C11891l(i2);
                this.f13305l = -1;
                break;
        }
    }

    public static void crashlytics(byte[] bArr, int i, byte[] bArr2, byte[] bArr3) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr3[i2] = (byte) (bArr[i + i2] ^ bArr2[i2]);
        }
    }

    public void admob(InterfaceC9719l interfaceC9719l) {
        InterfaceC9719l interfaceC9719l2;
        if (interfaceC9719l == null) {
            return;
        }
        if (interfaceC9719l instanceof C2294l) {
            C2294l c2294l = (C2294l) interfaceC9719l;
            byte[] bArr = c2294l.f4984l;
            System.arraycopy(bArr, 0, (byte[]) this.f13304l, 0, bArr.length);
            interfaceC9719l2 = c2294l.f4985l;
        } else if (interfaceC9719l instanceof C13886l) {
            byte[] bArr2 = ((C13886l) interfaceC9719l).f27156l;
            if (bArr2.length != 32) {
                C8339l.metrica("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
                return;
            }
            int[] iArr = new int[8];
            for (int i = 0; i != 8; i++) {
                iArr[i] = AbstractC10000l.metrica(i * 4, bArr2);
            }
            this.f13307l = iArr;
            interfaceC9719l2 = null;
        } else {
            if (!(interfaceC9719l instanceof C0272l)) {
                C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to GOST28147 init - ", interfaceC9719l));
                return;
            }
            C0272l c0272l = (C0272l) interfaceC9719l;
            byte[] bArr3 = c0272l.f1273l;
            byte[] bArr4 = (byte[]) this.f13308l;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr4.length);
            this.f13309l = bArr3;
            interfaceC9719l2 = c0272l.f1272l;
        }
        admob(interfaceC9719l2);
    }

    public C2434l amazon() throws C2584l {
        C9173l c9173l;
        boolean z;
        ArrayList arrayList = (ArrayList) this.f13308l;
        C5390l c5390l = (C5390l) this.f13307l;
        C15019l c15019l = null;
        if (c5390l != null) {
            c5390l.f11543l = arrayList;
            c5390l.f11545l = (C2421l) this.f13304l;
            c15019l = (C15019l) c5390l.yandex();
            c9173l = null;
            z = true;
        } else {
            C3930l c3930l = (C3930l) this.f13309l;
            if (c3930l == null) {
                throw new C2584l(36, null);
            }
            c3930l.f8095l = arrayList;
            c3930l.f8094l = (C2421l) this.f13304l;
            c9173l = (C9173l) c3930l.yandex();
            z = this.f13306l;
        }
        int i = this.f13305l;
        return new C2434l(c15019l, c9173l, z, i != -1 ? i : 1);
    }

    public void billing(int[] iArr, byte[] bArr, byte[] bArr2) {
        int iMetrica = AbstractC10000l.metrica(0, bArr);
        int iMetrica2 = AbstractC10000l.metrica(4, bArr);
        for (int i = 0; i < 2; i++) {
            int i2 = 0;
            while (i2 < 8) {
                int i3 = iArr[i2] + iMetrica;
                byte[] bArr3 = (byte[]) this.f13304l;
                int i4 = bArr3[i3 & 15] + (bArr3[((i3 >> 4) & 15) + 16] << 4) + (bArr3[((i3 >> 8) & 15) + 32] << 8) + (bArr3[((i3 >> 12) & 15) + 48] << 12) + (bArr3[((i3 >> 16) & 15) + 64] << 16) + (bArr3[((i3 >> 20) & 15) + 80] << 20) + (bArr3[((i3 >> 24) & 15) + 96] << 24) + (bArr3[((i3 >> 28) & 15) + 112] << 28);
                i2++;
                int i5 = iMetrica;
                iMetrica = iMetrica2 ^ ((i4 << 11) | (i4 >>> 21));
                iMetrica2 = i5;
            }
        }
        AbstractC10000l.smaato(iMetrica, 0, bArr2);
        AbstractC10000l.smaato(iMetrica2, 4, bArr2);
    }

    @Override // defpackage.InterfaceC12679l
    public void close() {
        synchronized (this.f13303l) {
            try {
                Surface surface = (Surface) this.f13307l;
                if (surface != null) {
                    surface.release();
                }
                ((InterfaceC12679l) this.f13308l).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2;
        byte[] bArr3 = (byte[]) this.f13308l;
        while (true) {
            int i2 = this.f13305l;
            bArr2 = (byte[]) this.f13303l;
            if (i2 >= 8) {
                break;
            }
            bArr2[i2] = 0;
            this.f13305l = i2 + 1;
        }
        byte[] bArr4 = new byte[bArr2.length];
        if (this.f13306l) {
            this.f13306l = false;
            System.arraycopy(bArr2, 0, bArr4, 0, bArr3.length);
        } else {
            crashlytics(bArr2, 0, bArr3, bArr4);
        }
        billing((int[]) this.f13307l, bArr4, bArr3);
        System.arraycopy(bArr3, (bArr3.length / 2) - 4, bArr, i, 4);
        reset();
        return 4;
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return 4;
    }

    @Override // defpackage.InterfaceC12679l
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f13303l) {
            surface = ((InterfaceC12679l) this.f13308l).getSurface();
        }
        return surface;
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        reset();
        this.f13303l = new byte[8];
        this.f13309l = null;
        admob(interfaceC9719l);
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
        } else {
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
    }

    @Override // defpackage.InterfaceC12679l
    public int loadAd() {
        int iLoadAd;
        synchronized (this.f13303l) {
            iLoadAd = ((InterfaceC12679l) this.f13308l).loadAd();
        }
        return iLoadAd;
    }

    @Override // defpackage.InterfaceC12679l
    public int metrica() {
        int iMetrica;
        synchronized (this.f13303l) {
            iMetrica = ((InterfaceC12679l) this.f13308l).metrica();
        }
        return iMetrica;
    }

    public boolean mopub(float f, int i, C14689l c14689l) {
        if (((C8924l) this.f13308l).loadAd.isEmpty()) {
            return false;
        }
        int size = ((C8924l) this.f13308l).loadAd.size();
        int i2 = (((int) (f * size)) + i) % size;
        if (this.f13305l == i2) {
            return false;
        }
        this.f13305l = i2;
        C13703l c13703l = c14689l.amazon;
        C17270l c17270l = (C17270l) ((C8924l) this.f13308l).loadAd.get(i2);
        c13703l.amazon(c17270l.yandex.x);
        c13703l.purchase(c17270l.yandex.y);
        c13703l.isPro.billing(255);
        C13703l c13703l2 = c14689l.purchase;
        C17270l c17270l2 = (C17270l) ((C8924l) this.f13307l).loadAd.get(i2);
        c13703l2.amazon(c17270l2.yandex.x);
        c13703l2.purchase(c17270l2.yandex.y);
        c13703l2.isPro.billing(255);
        return true;
    }

    @Override // defpackage.InterfaceC12679l
    /* JADX INFO: renamed from: native, reason: not valid java name */
    public InterfaceC11792l mo1996native() {
        C1282l c1282l;
        synchronized (this.f13303l) {
            InterfaceC11792l interfaceC11792lMo1996native = ((InterfaceC12679l) this.f13308l).mo1996native();
            if (interfaceC11792lMo1996native != null) {
                this.f13305l++;
                c1282l = new C1282l(interfaceC11792lMo1996native);
                c1282l.yandex((C6986l) this.f13304l);
            } else {
                c1282l = null;
            }
        }
        return c1282l;
    }

    @Override // defpackage.InterfaceC12679l
    public void premium(InterfaceC5755l interfaceC5755l, Executor executor) {
        synchronized (this.f13303l) {
            ((InterfaceC12679l) this.f13308l).premium(new C15263l(this, interfaceC5755l, 20), executor);
        }
    }

    @Override // defpackage.InterfaceC0587l
    public InterfaceC14090l pro() {
        C13568l c13568l = (C13568l) this.f13304l;
        C14726l c14726l = null;
        InterfaceC14090l interfaceC14090lPro = c13568l != null ? c13568l.pro() : null;
        int i = this.f13305l;
        C12220l c12220l = (C12220l) this.f13303l;
        c12220l.getClass();
        if (!this.f13306l && interfaceC14090lPro != null) {
            C3253l c3253l = (C3253l) this.f13307l;
            if (c3253l != null) {
                C12220l c12220l2 = (C12220l) c3253l.f6947l;
                c12220l2.getClass();
                c14726l = new C14726l(c12220l2, c3253l.f6948l);
            } else {
                c14726l = new C14726l(c12220l, 5242880L);
            }
        }
        return new C16507l(c12220l, interfaceC14090lPro, ((C2183l) this.f13308l).pro(), c14726l, i, (C8876l) this.f13309l);
    }

    @Override // defpackage.InterfaceC12679l
    public int purchase() {
        int iPurchase;
        synchronized (this.f13303l) {
            iPurchase = ((InterfaceC12679l) this.f13308l).purchase();
        }
        return iPurchase;
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f13303l;
            if (i >= bArr.length) {
                this.f13305l = 0;
                this.f13306l = true;
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC12679l
    public InterfaceC11792l smaato() {
        C1282l c1282l;
        synchronized (this.f13303l) {
            InterfaceC11792l interfaceC11792lSmaato = ((InterfaceC12679l) this.f13308l).smaato();
            if (interfaceC11792lSmaato != null) {
                this.f13305l++;
                c1282l = new C1282l(interfaceC11792lSmaato);
                c1282l.yandex((C6986l) this.f13304l);
            } else {
                c1282l = null;
            }
        }
        return c1282l;
    }

    @Override // defpackage.InterfaceC12679l
    public void startapp() {
        synchronized (this.f13303l) {
            ((InterfaceC12679l) this.f13308l).startapp();
        }
    }

    @Override // defpackage.InterfaceC12679l
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public int mo1997strictfp() {
        int iMo1997strictfp;
        synchronized (this.f13303l) {
            iMo1997strictfp = ((InterfaceC12679l) this.f13308l).mo1997strictfp();
        }
        return iMo1997strictfp;
    }

    public void subs() {
        synchronized (this.f13303l) {
            try {
                this.f13306l = true;
                ((InterfaceC12679l) this.f13308l).startapp();
                if (this.f13305l == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.f13308l;
        if (i2 < 0) {
            C8339l.metrica("Can't have a negative input length!");
            return;
        }
        int i3 = this.f13305l;
        int i4 = 8 - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, (byte[]) this.f13303l, i3, i4);
            byte[] bArr3 = (byte[]) this.f13303l;
            byte[] bArr4 = new byte[bArr3.length];
            if (this.f13306l) {
                this.f13306l = false;
                byte[] bArr5 = (byte[]) this.f13309l;
                if (bArr5 != null) {
                    crashlytics(bArr3, 0, bArr5, bArr4);
                } else {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr2.length);
                }
            } else {
                crashlytics(bArr3, 0, bArr2, bArr4);
            }
            billing((int[]) this.f13307l, bArr4, bArr2);
            this.f13305l = 0;
            i2 -= i4;
            i += i4;
            while (i2 > 8) {
                crashlytics(bArr, i, bArr2, bArr4);
                billing((int[]) this.f13307l, bArr4, bArr2);
                i2 -= 8;
                i += 8;
            }
        }
        System.arraycopy(bArr, i, (byte[]) this.f13303l, this.f13305l, i2);
        this.f13305l += i2;
    }

    public C6344l(InterfaceC12679l interfaceC12679l) {
        this.f13303l = new Object();
        this.f13305l = 0;
        this.f13306l = false;
        this.f13304l = new C6986l(1, this);
        this.f13308l = interfaceC12679l;
        this.f13307l = interfaceC12679l.getSurface();
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        byte[] bArr = (byte[]) this.f13308l;
        int i = this.f13305l;
        byte[] bArr2 = (byte[]) this.f13303l;
        if (i == bArr2.length) {
            byte[] bArr3 = new byte[bArr2.length];
            if (this.f13306l) {
                this.f13306l = false;
                byte[] bArr4 = (byte[]) this.f13309l;
                if (bArr4 != null) {
                    crashlytics(bArr2, 0, bArr4, bArr3);
                } else {
                    System.arraycopy(bArr2, 0, bArr3, 0, bArr.length);
                }
            } else {
                crashlytics(bArr2, 0, bArr, bArr3);
            }
            billing((int[]) this.f13307l, bArr3, bArr);
            this.f13305l = 0;
        }
        byte[] bArr5 = (byte[]) this.f13303l;
        int i2 = this.f13305l;
        this.f13305l = i2 + 1;
        bArr5[i2] = b;
    }
}
