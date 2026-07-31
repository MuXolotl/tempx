package defpackage;

import android.content.res.AssetManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؚٝ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7403l implements InterfaceC12184l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final byte[] f15335l = {74, -35, -94, 44, 121, -24, 33, 5};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f15336l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f15337l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f15338l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f15339l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public Object f15340l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f15341l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f15342l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f15343l;

    public C7403l(InterfaceC3588l interfaceC3588l, C14965l c14965l, C5557l c5557l, boolean z, C7403l c7403l, List list) {
        this.f15342l = interfaceC3588l;
        this.f15341l = c14965l;
        this.f15343l = c5557l;
        this.f15339l = z;
        this.f15340l = c7403l;
        this.f15336l = list;
        this.f15337l = new LinkedHashMap();
        InterfaceC12157l.yandex.getClass();
        this.f15338l = C17744l.yandex();
    }

    public static int loadAd(int[] iArr, int[] iArr2) {
        int iYandex = yandex(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == iYandex) {
                iMin = Math.min(iMin, iArr2[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    public static int yandex(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 <= 0) {
                return 0;
            }
            if (i > i2) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public FileInputStream amazon(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((InterfaceC8170l) this.f15341l).ads();
            return null;
        }
    }

    public C7403l billing(List list) {
        C7403l c7403l = new C7403l((InterfaceC3588l) this.f15342l, (C14965l) this.f15341l, (C5557l) this.f15343l, this.f15339l, this, (List) this.f15336l);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17586l c17586l = (C17586l) it.next();
            ((LinkedHashMap) c7403l.f15337l).put(Integer.valueOf(c17586l.f34242l), Integer.valueOf(c17586l.f34243l));
        }
        return c7403l;
    }

    public Integer crashlytics(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.f15337l).get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        C7403l c7403l = (C7403l) this.f15340l;
        if (c7403l != null) {
            return c7403l.crashlytics(i);
        }
        return null;
    }

    @Override // defpackage.InterfaceC12184l
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // defpackage.InterfaceC12184l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        this.f15339l = z;
        this.f15342l = new C4998l(new C7110l(0, 0 == true ? 1 : 0));
        if (interfaceC9719l instanceof C6114l) {
            C6114l c6114l = (C6114l) interfaceC9719l;
            this.f15337l = c6114l.f12904l;
            interfaceC9719l = c6114l.f12903l;
        } else {
            this.f15337l = AbstractC8776l.loadAd();
        }
        if (!(interfaceC9719l instanceof C0272l)) {
            this.f15341l = interfaceC9719l;
            if (this.f15339l) {
                byte[] bArr = new byte[8];
                this.f15340l = bArr;
                ((SecureRandom) this.f15337l).nextBytes(bArr);
                this.f15343l = new C0272l((InterfaceC9719l) this.f15341l, (byte[]) this.f15340l);
                return;
            }
            return;
        }
        C0272l c0272l = (C0272l) interfaceC9719l;
        this.f15343l = c0272l;
        byte[] bArr2 = c0272l.f1273l;
        this.f15340l = bArr2;
        this.f15341l = c0272l.f1272l;
        if (!this.f15339l) {
            C8339l.metrica("You should not supply an IV for unwrapping");
        } else if (bArr2 == null || bArr2.length != 8) {
            C8339l.metrica("IV is not 8 octets");
        }
    }

    public void purchase(int i, Serializable serializable) {
        ((Executor) this.f15342l).execute(new RunnableC2027l(this, i, serializable, 3));
    }

    @Override // defpackage.InterfaceC12184l
    public byte[] unwrap(byte[] bArr, int i, int i2) throws C10352l {
        if (this.f15339l) {
            C8339l.smaato("Not set for unwrapping");
            return null;
        }
        if (bArr == null) {
            C11467l.remoteconfig("Null pointer as ciphertext");
            return null;
        }
        if (i2 % ((C4998l) this.f15342l).f10232l.license() != 0) {
            throw new C10352l("Ciphertext not multiple of " + ((C4998l) this.f15342l).f10232l.license());
        }
        ((C4998l) this.f15342l).init(false, new C0272l((InterfaceC9719l) this.f15341l, f15335l, 0, 8));
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        for (int i3 = 0; i3 < i2 / ((C4998l) this.f15342l).f10232l.license(); i3++) {
            int iLicense = ((C4998l) this.f15342l).f10232l.license() * i3;
            ((C4998l) this.f15342l).tapsense(iLicense, iLicense, bArr2, bArr2);
        }
        byte[] bArr3 = new byte[i2];
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i4 + 1;
            bArr3[i4] = bArr2[i2 - i5];
            i4 = i5;
        }
        byte[] bArr4 = new byte[8];
        this.f15340l = bArr4;
        int i6 = i2 - 8;
        byte[] bArr5 = new byte[i6];
        System.arraycopy(bArr3, 0, bArr4, 0, 8);
        System.arraycopy(bArr3, 8, bArr5, 0, i6);
        C0272l c0272l = new C0272l((InterfaceC9719l) this.f15341l, (byte[]) this.f15340l);
        this.f15343l = c0272l;
        ((C4998l) this.f15342l).init(false, c0272l);
        byte[] bArr6 = new byte[i6];
        System.arraycopy(bArr5, 0, bArr6, 0, i6);
        for (int i7 = 0; i7 < i6 / ((C4998l) this.f15342l).f10232l.license(); i7++) {
            int iLicense2 = ((C4998l) this.f15342l).f10232l.license() * i7;
            ((C4998l) this.f15342l).tapsense(iLicense2, iLicense2, bArr6, bArr6);
        }
        int i8 = i2 - 16;
        byte[] bArr7 = new byte[i8];
        byte[] bArr8 = new byte[8];
        System.arraycopy(bArr6, 0, bArr7, 0, i8);
        System.arraycopy(bArr6, i8, bArr8, 0, 8);
        byte[] bArr9 = new byte[8];
        C0655l c0655l = (C0655l) this.f15338l;
        c0655l.update(bArr7, 0, i8);
        byte[] bArr10 = (byte[]) this.f15336l;
        c0655l.doFinal(bArr10, 0);
        System.arraycopy(bArr10, 0, bArr9, 0, 8);
        if (!AbstractC14024l.smaato(bArr9, bArr8)) {
            C11467l.remoteconfig("Checksum inside ciphertext is corrupted");
            return null;
        }
        int i9 = bArr7[0];
        if (i8 - ((i9 & 255) + 1) <= 7) {
            byte[] bArr11 = new byte[i9];
            System.arraycopy(bArr7, 1, bArr11, 0, i9);
            return bArr11;
        }
        throw new C10352l("too many pad bytes (" + (i8 - ((bArr7[0] & 255) + 1)) + ")");
    }

    @Override // defpackage.InterfaceC12184l
    public byte[] wrap(byte[] bArr, int i, int i2) {
        String str;
        if (this.f15339l) {
            int i3 = i2 + 1;
            int i4 = i3 % 8;
            int i5 = i4 != 0 ? (8 - i4) + i3 : i3;
            byte[] bArr2 = new byte[i5];
            bArr2[0] = (byte) i2;
            System.arraycopy(bArr, 0, bArr2, 1, i2);
            int i6 = (i5 - i2) - 1;
            byte[] bArr3 = new byte[i6];
            if (i6 > 0) {
                ((SecureRandom) this.f15337l).nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr2, i3, i6);
            }
            byte[] bArr4 = new byte[8];
            C0655l c0655l = (C0655l) this.f15338l;
            c0655l.update(bArr2, 0, i5);
            byte[] bArr5 = (byte[]) this.f15336l;
            c0655l.doFinal(bArr5, 0);
            System.arraycopy(bArr5, 0, bArr4, 0, 8);
            int i7 = i5 + 8;
            byte[] bArr6 = new byte[i7];
            System.arraycopy(bArr2, 0, bArr6, 0, i5);
            System.arraycopy(bArr4, 0, bArr6, i5, 8);
            byte[] bArr7 = new byte[i7];
            System.arraycopy(bArr6, 0, bArr7, 0, i7);
            int iLicense = i7 / ((C4998l) this.f15342l).f10232l.license();
            if (i7 % ((C4998l) this.f15342l).f10232l.license() == 0) {
                ((C4998l) this.f15342l).init(true, (C0272l) this.f15343l);
                for (int i8 = 0; i8 < iLicense; i8++) {
                    int iLicense2 = ((C4998l) this.f15342l).f10232l.license() * i8;
                    ((C4998l) this.f15342l).tapsense(iLicense2, iLicense2, bArr7, bArr7);
                }
                byte[] bArr8 = (byte[]) this.f15340l;
                int length = bArr8.length + i7;
                byte[] bArr9 = new byte[length];
                System.arraycopy(bArr8, 0, bArr9, 0, bArr8.length);
                System.arraycopy(bArr7, 0, bArr9, ((byte[]) this.f15340l).length, i7);
                byte[] bArr10 = new byte[length];
                int i9 = 0;
                while (i9 < length) {
                    int i10 = i9 + 1;
                    bArr10[i9] = bArr9[length - i10];
                    i9 = i10;
                }
                ((C4998l) this.f15342l).init(true, new C0272l((InterfaceC9719l) this.f15341l, f15335l, 0, 8));
                for (int i11 = 0; i11 < iLicense + 1; i11++) {
                    int iLicense3 = ((C4998l) this.f15342l).f10232l.license() * i11;
                    ((C4998l) this.f15342l).tapsense(iLicense3, iLicense3, bArr10, bArr10);
                }
                return bArr10;
            }
            str = "Not multiple of block length";
        } else {
            str = "Not initialized for wrapping";
        }
        C8339l.smaato(str);
        return null;
    }

    public /* synthetic */ C7403l(InterfaceC3588l interfaceC3588l, C14965l c14965l, C5557l c5557l, boolean z, List list, int i) {
        this(interfaceC3588l, c14965l, c5557l, z, (C7403l) null, (i & 32) != 0 ? C2580l.f5619l : list);
    }
}
