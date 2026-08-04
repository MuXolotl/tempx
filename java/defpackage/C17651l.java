package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: l٘ؔؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17651l implements InterfaceC10952l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f34334l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f34335l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f34336l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f34337l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Serializable f34338l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f34339l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f34340l;

    public static C8642l loadAd(ArrayDeque arrayDeque, int i, boolean z) {
        C8642l c8642l;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c8642l = null;
                break;
            }
            c8642l = (C8642l) it.next();
            if (c8642l.yandex == i && c8642l.crashlytics == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C8642l c8642l2 = (C8642l) it.next();
            if (z) {
                c8642l2.loadAd--;
            } else {
                c8642l2.loadAd++;
            }
        }
        return c8642l;
    }

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        return ((InterfaceC10952l) this.f34335l).getAlgorithmName().concat("/OpenPGPCFB");
    }

    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        this.f34334l = z;
        reset();
        ((InterfaceC10952l) this.f34335l).init(true, interfaceC9719l);
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        return ((InterfaceC10952l) this.f34335l).license();
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
        this.f34337l = 0;
        byte[] bArr = (byte[]) this.f34339l;
        byte[] bArr2 = (byte[]) this.f34338l;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        ((InterfaceC10952l) this.f34335l).reset();
    }

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3 = this.f34336l;
        byte[] bArr3 = (byte[]) this.f34338l;
        InterfaceC10952l interfaceC10952l = (InterfaceC10952l) this.f34335l;
        boolean z = this.f34334l;
        byte[] bArr4 = (byte[]) this.f34340l;
        int i4 = 0;
        int i5 = 2;
        if (z) {
            if (i + i3 > bArr.length) {
                C10754l.ad("input buffer too short");
                return 0;
            }
            if (i2 + i3 > bArr2.length) {
                C18073l.ad("output buffer too short");
                return 0;
            }
            int i6 = this.f34337l;
            if (i6 > i3) {
                int i7 = i3 - 2;
                byte bYandex = yandex(bArr[i], i7);
                bArr2[i2] = bYandex;
                bArr3[i7] = bYandex;
                int i8 = i3 - 1;
                byte bYandex2 = yandex(bArr[i + 1], i8);
                bArr2[i2 + 1] = bYandex2;
                bArr3[i8] = bYandex2;
                interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
                while (i5 < i3) {
                    int i9 = i5 - 2;
                    byte bYandex3 = yandex(bArr[i + i5], i9);
                    bArr2[i2 + i5] = bYandex3;
                    bArr3[i9] = bYandex3;
                    i5++;
                }
            } else {
                if (i6 == 0) {
                    interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
                    while (i4 < i3) {
                        byte bYandex4 = yandex(bArr[i + i4], i4);
                        bArr2[i2 + i4] = bYandex4;
                        bArr3[i4] = bYandex4;
                        i4++;
                    }
                    this.f34337l += i3;
                    return i3;
                }
                if (i6 == i3) {
                    interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
                    bArr2[i2] = yandex(bArr[i], 0);
                    bArr2[i2 + 1] = yandex(bArr[i + 1], 1);
                    int i10 = i3 - 2;
                    System.arraycopy(bArr3, 2, bArr3, 0, i10);
                    System.arraycopy(bArr2, i2, bArr3, i10, 2);
                    interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
                    while (i5 < i3) {
                        int i11 = i5 - 2;
                        byte bYandex5 = yandex(bArr[i + i5], i11);
                        bArr2[i2 + i5] = bYandex5;
                        bArr3[i11] = bYandex5;
                        i5++;
                    }
                    this.f34337l += i3;
                }
            }
            return i3;
        }
        if (i + i3 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 + i3 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        int i12 = this.f34337l;
        if (i12 > i3) {
            byte b = bArr[i];
            int i13 = i3 - 2;
            bArr3[i13] = b;
            bArr2[i2] = yandex(b, i13);
            byte b2 = bArr[i + 1];
            int i14 = i3 - 1;
            bArr3[i14] = b2;
            bArr2[i2 + 1] = yandex(b2, i14);
            interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
            while (i5 < i3) {
                byte b3 = bArr[i + i5];
                int i15 = i5 - 2;
                bArr3[i15] = b3;
                bArr2[i2 + i5] = yandex(b3, i15);
                i5++;
            }
        } else {
            if (i12 == 0) {
                interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
                while (i4 < i3) {
                    int i16 = i + i4;
                    bArr3[i4] = bArr[i16];
                    bArr2[i2 + i4] = yandex(bArr[i16], i4);
                    i4++;
                }
                this.f34337l += i3;
                return i3;
            }
            if (i12 == i3) {
                interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
                byte b4 = bArr[i];
                byte b5 = bArr[i + 1];
                bArr2[i2] = yandex(b4, 0);
                bArr2[i2 + 1] = yandex(b5, 1);
                int i17 = i3 - 2;
                System.arraycopy(bArr3, 2, bArr3, 0, i17);
                bArr3[i17] = b4;
                bArr3[i3 - 1] = b5;
                interfaceC10952l.tapsense(0, 0, bArr3, bArr4);
                while (i5 < i3) {
                    byte b6 = bArr[i + i5];
                    int i18 = i5 - 2;
                    bArr3[i18] = b6;
                    bArr2[i2 + i5] = yandex(b6, i18);
                    i5++;
                }
                this.f34337l += i3;
            }
        }
        return i3;
    }

    public byte yandex(byte b, int i) {
        return (byte) (((byte[]) this.f34340l)[i] ^ b);
    }
}
