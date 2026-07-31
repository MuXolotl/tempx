package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؘۗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5908l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f12452l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f12453l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f12454l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f12455l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f12456l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Object f12457l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f12458l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Object f12459l;

    public C5908l(C1540l c1540l, int i, C9912l c9912l) {
        if (i % 8 != 0) {
            C8339l.metrica("MAC size must be multiple of 8");
            throw null;
        }
        this.f12457l = new C4998l(c1540l);
        this.f12459l = c9912l;
        this.f12455l = i / 8;
        this.f12452l = new byte[8];
        this.f12458l = new byte[8];
        this.f12456l = 0;
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        int i2 = this.f12455l;
        byte[] bArr2 = (byte[]) this.f12458l;
        byte[] bArr3 = (byte[]) this.f12452l;
        C4998l c4998l = (C4998l) this.f12457l;
        int iLicense = c4998l.f10232l.license();
        InterfaceC12684l interfaceC12684l = (InterfaceC12684l) this.f12459l;
        if (interfaceC12684l == null) {
            while (true) {
                int i3 = this.f12456l;
                if (i3 >= iLicense) {
                    break;
                }
                bArr2[i3] = 0;
                this.f12456l = i3 + 1;
            }
        } else {
            if (this.f12456l == iLicense) {
                c4998l.tapsense(0, 0, bArr2, bArr3);
                this.f12456l = 0;
            }
            interfaceC12684l.crashlytics(this.f12456l, bArr2);
        }
        c4998l.tapsense(0, 0, bArr2, bArr3);
        C1540l c1540l = new C1540l();
        c1540l.init(false, (C13886l) this.f12453l);
        c1540l.tapsense(0, 0, bArr3, bArr3);
        c1540l.init(true, (C13886l) this.f12454l);
        c1540l.tapsense(0, 0, bArr3, bArr3);
        System.arraycopy(bArr3, 0, bArr, 0, i2);
        reset();
        return i2;
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return this.f12455l;
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        C13886l c13886l;
        reset();
        boolean z = interfaceC9719l instanceof C13886l;
        if (!z && !(interfaceC9719l instanceof C0272l)) {
            C8339l.metrica("params must be an instance of KeyParameter or ParametersWithIV");
            return;
        }
        byte[] bArr = (z ? (C13886l) interfaceC9719l : (C13886l) ((C0272l) interfaceC9719l).f1272l).f27156l;
        if (bArr.length == 16) {
            c13886l = new C13886l(bArr, 0, 8);
            this.f12453l = new C13886l(bArr, 8, 8);
            this.f12454l = c13886l;
        } else if (bArr.length != 24) {
            C8339l.metrica("Key must be either 112 or 168 bit long");
            return;
        } else {
            c13886l = new C13886l(bArr, 0, 8);
            this.f12453l = new C13886l(bArr, 8, 8);
            this.f12454l = new C13886l(bArr, 16, 8);
        }
        boolean z2 = interfaceC9719l instanceof C0272l;
        C4998l c4998l = (C4998l) this.f12457l;
        if (z2) {
            c4998l.init(true, new C0272l(c13886l, ((C0272l) interfaceC9719l).f1273l));
        } else {
            c4998l.init(true, c13886l);
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f12458l;
            if (i >= bArr.length) {
                this.f12456l = 0;
                ((C4998l) this.f12457l).reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.f12452l;
        byte[] bArr3 = (byte[]) this.f12458l;
        C4998l c4998l = (C4998l) this.f12457l;
        if (i2 < 0) {
            C8339l.metrica("Can't have a negative input length!");
            return;
        }
        int iLicense = c4998l.f10232l.license();
        int i3 = this.f12456l;
        int i4 = iLicense - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, bArr3, i3, i4);
            c4998l.tapsense(0, 0, bArr3, bArr2);
            this.f12456l = 0;
            i2 -= i4;
            i += i4;
            while (i2 > iLicense) {
                c4998l.tapsense(i, 0, bArr, bArr2);
                i2 -= iLicense;
                i += iLicense;
            }
        }
        System.arraycopy(bArr, i, bArr3, this.f12456l, i2);
        this.f12456l += i2;
    }

    public C5908l(C15980l c15980l) {
        this.f12456l = 0;
        this.f12455l = -1;
        this.f12452l = null;
        this.f12458l = null;
        this.f12459l = null;
        this.f12453l = null;
        this.f12454l = null;
        this.f12457l = c15980l;
    }

    public C5908l() {
        this.f12452l = null;
        this.f12458l = null;
        this.f12457l = null;
        this.f12459l = Collections.EMPTY_LIST;
        this.f12453l = null;
        this.f12456l = 0;
        this.f12455l = 0;
        this.f12454l = Bundle.EMPTY;
    }

    public C5908l(C13052l c13052l, C16830l c16830l, C8937l c8937l, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.f12452l = c13052l;
        this.f12458l = c16830l;
        this.f12457l = c8937l;
        list.getClass();
        this.f12459l = list;
        this.f12453l = charSequence;
        this.f12456l = i;
        this.f12455l = i2;
        this.f12454l = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        int i = this.f12456l;
        byte[] bArr = (byte[]) this.f12458l;
        if (i == bArr.length) {
            ((C4998l) this.f12457l).tapsense(0, 0, bArr, (byte[]) this.f12452l);
            this.f12456l = 0;
        }
        int i2 = this.f12456l;
        this.f12456l = i2 + 1;
        bArr[i2] = b;
    }
}
