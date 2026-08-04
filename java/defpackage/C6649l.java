package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: renamed from: lؙٟٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6649l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f13969l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f13970l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f13971l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f13972l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f13973l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Object f13974l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Object f13975l;

    public C6649l(int i) {
        C7092l c7092l = new C7092l(1);
        if (i == 32) {
            c7092l.f34569l = C17748l.f34565l;
        } else if (i == 64) {
            c7092l.f34569l = C17748l.f34568l;
        } else {
            if (i != 128) {
                C8339l.metrica(AbstractC0653l.vip(i, "Unsupported length: "));
                throw null;
            }
            c7092l.f34569l = C17748l.f34566l;
        }
        this.f13974l = c7092l;
        this.f13972l = i;
        int i2 = i / 32;
        this.f13973l = new int[i2];
        this.f13975l = new int[i2 + 1];
    }

    public void crashlytics(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.f13973l;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            int[] iArr2 = (int[]) this.f13975l;
            int i4 = this.f13971l + i2;
            int i5 = iArr2[i4 % iArr2.length];
            if (i != 0) {
                i5 = (i5 << i) | (iArr2[(i4 + 1) % iArr2.length] >>> (32 - i));
            }
            iArr[i2] = i3 ^ i5;
            i2++;
        }
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        int i2 = (this.f13969l + 1) % 4;
        this.f13969l = i2;
        if (i2 == 0) {
            this.f13971l = (this.f13971l + 1) % ((int[]) this.f13975l).length;
        }
        crashlytics(i2 * 8);
        int i3 = 0;
        while (true) {
            int[] iArr = (int[]) this.f13973l;
            if (i3 >= iArr.length) {
                reset();
                return getMacSize();
            }
            C10739l.firebase(iArr[i3], i3 * 4, bArr);
            i3++;
        }
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return "Zuc256Mac-" + this.f13972l;
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return this.f13972l / 8;
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        C7092l c7092l = (C7092l) this.f13974l;
        c7092l.init(true, interfaceC9719l);
        this.f13970l = new C17748l(c7092l);
        loadAd();
    }

    public void loadAd() {
        C7092l c7092l = (C7092l) this.f13974l;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.f13973l;
            if (i2 >= iArr.length) {
                break;
            }
            iArr[i2] = c7092l.remoteconfig();
            i2++;
        }
        while (true) {
            int[] iArr2 = (int[]) this.f13975l;
            if (i >= iArr2.length - 1) {
                this.f13971l = iArr2.length - 1;
                this.f13969l = 3;
                return;
            } else {
                iArr2[i] = c7092l.remoteconfig();
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        C17748l c17748l = (C17748l) this.f13970l;
        if (c17748l != null) {
            ((C7092l) this.f13974l).loadAd(c17748l);
        }
        loadAd();
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        int[] iArr = (int[]) this.f13975l;
        int i = (this.f13969l + 1) % 4;
        this.f13969l = i;
        if (i == 0) {
            iArr[this.f13971l] = ((C7092l) this.f13974l).remoteconfig();
            this.f13971l = (this.f13971l + 1) % iArr.length;
        }
        int i2 = this.f13969l * 8;
        int i3 = 128;
        int i4 = 0;
        while (i3 > 0) {
            if ((b & i3) != 0) {
                crashlytics(i2 + i4);
            }
            i3 >>= 1;
            i4++;
        }
    }

    public VolumeProvider yandex() {
        C6649l c6649l;
        if (((VolumeProvider) this.f13973l) != null) {
            c6649l = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            c6649l = this;
            c6649l.f13973l = new C14755l(c6649l, this.f13972l, this.f13971l, this.f13969l, (String) this.f13974l, 0);
        } else {
            c6649l = this;
            c6649l.f13973l = new C14464l(c6649l, c6649l.f13972l, c6649l.f13971l, c6649l.f13969l, 0);
        }
        return (VolumeProvider) c6649l.f13973l;
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }

    public C6649l(int i, int i2, int i3, String str, Handler handler, C18602l c18602l) {
        this.f13975l = handler;
        this.f13970l = c18602l;
        this.f13972l = i;
        this.f13971l = i2;
        this.f13969l = i3;
        this.f13974l = str;
    }
}
