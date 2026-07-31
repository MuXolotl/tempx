package defpackage;

/* JADX INFO: renamed from: lٌٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8501l {
    public int admob;
    public C9267l amazon;
    public int billing;
    public final C5978l isPro;
    public int mopub;
    public C16610l purchase;
    public boolean remoteconfig;
    public int subs;
    public final InterfaceC8979l yandex;
    public final C16142l loadAd = new C16142l();
    public final C13143l crashlytics = new C13143l();
    public final C13143l firebase = new C13143l(1);
    public final C13143l smaato = new C13143l();

    public C8501l(InterfaceC8979l interfaceC8979l, C9267l c9267l, C16610l c16610l, C5978l c5978l) {
        this.yandex = interfaceC8979l;
        this.amazon = c9267l;
        this.purchase = c16610l;
        this.isPro = c5978l;
        this.amazon = c9267l;
        this.purchase = c16610l;
        interfaceC8979l.mopub(c5978l);
        purchase();
    }

    public final int amazon(int i, int i2) {
        C13143l c13143l;
        C4098l c4098lLoadAd = loadAd();
        if (c4098lLoadAd == null) {
            return 0;
        }
        int length = c4098lLoadAd.amazon;
        C16142l c16142l = this.loadAd;
        if (length != 0) {
            c13143l = c16142l.vip;
        } else {
            byte[] bArr = c4098lLoadAd.purchase;
            String str = AbstractC15323l.yandex;
            int length2 = bArr.length;
            C13143l c13143l2 = this.smaato;
            c13143l2.m3565private(length2, bArr);
            length = bArr.length;
            c13143l = c13143l2;
        }
        boolean z = c16142l.firebase && c16142l.smaato[this.billing];
        boolean z2 = z || i2 != 0;
        C13143l c13143l3 = this.firebase;
        c13143l3.yandex[0] = (byte) ((z2 ? 128 : 0) | length);
        c13143l3.m3562for(0);
        InterfaceC8979l interfaceC8979l = this.yandex;
        interfaceC8979l.loadAd(c13143l3, 1, 1);
        interfaceC8979l.loadAd(c13143l, length, 1);
        if (!z2) {
            return length + 1;
        }
        C13143l c13143l4 = this.crashlytics;
        if (!z) {
            c13143l4.m3563native(8);
            byte[] bArr2 = c13143l4.yandex;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            interfaceC8979l.loadAd(c13143l4, 8, 1);
            return length + 9;
        }
        C13143l c13143l5 = c16142l.vip;
        int iM3567synchronized = c13143l5.m3567synchronized();
        c13143l5.m3568throw(-2);
        int i3 = (iM3567synchronized * 6) + 2;
        if (i2 != 0) {
            c13143l4.m3563native(i3);
            byte[] bArr3 = c13143l4.yandex;
            c13143l5.firebase(0, i3, bArr3);
            int i4 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i4 >> 8) & 255);
            bArr3[3] = (byte) (i4 & 255);
        } else {
            c13143l4 = c13143l5;
        }
        interfaceC8979l.loadAd(c13143l4, i3, 1);
        return length + 1 + i3;
    }

    public final boolean crashlytics() {
        this.billing++;
        if (!this.remoteconfig) {
            return false;
        }
        int i = this.mopub + 1;
        this.mopub = i;
        int[] iArr = this.loadAd.mopub;
        int i2 = this.admob;
        if (i != iArr[i2]) {
            return true;
        }
        this.admob = i2 + 1;
        this.mopub = 0;
        return false;
    }

    public final C4098l loadAd() {
        if (!this.remoteconfig) {
            return null;
        }
        C16142l c16142l = this.loadAd;
        C16610l c16610l = c16142l.yandex;
        String str = AbstractC15323l.yandex;
        int i = c16610l.yandex;
        C4098l c4098l = c16142l.remoteconfig;
        if (c4098l == null) {
            c4098l = this.amazon.yandex.smaato[i];
        }
        if (c4098l == null || !c4098l.yandex) {
            return null;
        }
        return c4098l;
    }

    public final void purchase() {
        C16142l c16142l = this.loadAd;
        c16142l.amazon = 0;
        c16142l.startapp = 0L;
        c16142l.adcel = false;
        c16142l.firebase = false;
        c16142l.metrica = false;
        c16142l.remoteconfig = null;
        this.billing = 0;
        this.admob = 0;
        this.mopub = 0;
        this.subs = 0;
        this.remoteconfig = false;
    }

    public final int yandex() {
        int i;
        if (this.remoteconfig) {
            i = this.loadAd.isPro[this.billing] ? 1 : 0;
        } else {
            i = this.amazon.mopub[this.billing];
        }
        return loadAd() != null ? 1073741824 | i : i;
    }
}
