package defpackage;

/* JADX INFO: renamed from: lۣٟٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14510l implements InterfaceC17094l {
    public int admob = 0;
    public final int amazon;
    public InterfaceC8979l billing;
    public final String crashlytics;
    public boolean firebase;
    public boolean isPro;
    public final C9892l loadAd;
    public String mopub;
    public final String purchase;
    public int remoteconfig;
    public long smaato;
    public int subs;
    public long vip;
    public final C13143l yandex;

    public C14510l(String str, int i, String str2) {
        C13143l c13143l = new C13143l(4);
        this.yandex = c13143l;
        c13143l.yandex[0] = -1;
        this.loadAd = new C9892l();
        this.vip = -9223372036854775807L;
        this.crashlytics = str;
        this.amazon = i;
        this.purchase = str2;
    }

    @Override // defpackage.InterfaceC17094l
    public final void billing() {
        this.admob = 0;
        this.subs = 0;
        this.firebase = false;
        this.vip = -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC17094l
    public final void mopub(InterfaceC2053l interfaceC2053l, Cstatic cstatic) {
        cstatic.yandex();
        cstatic.amazon();
        this.mopub = (String) cstatic.purchase;
        cstatic.amazon();
        this.billing = interfaceC2053l.startapp(cstatic.crashlytics, 1);
    }

    @Override // defpackage.InterfaceC17094l
    public final void purchase(C13143l c13143l) {
        this.billing.getClass();
        while (c13143l.yandex() > 0) {
            int i = this.admob;
            C13143l c13143l2 = this.yandex;
            if (i == 0) {
                byte[] bArr = c13143l.yandex;
                int i2 = c13143l.loadAd;
                int i3 = c13143l.crashlytics;
                while (true) {
                    if (i2 >= i3) {
                        c13143l.m3562for(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.firebase && (b & 224) == 224;
                    this.firebase = z;
                    if (z2) {
                        c13143l.m3562for(i2 + 1);
                        this.firebase = false;
                        c13143l2.yandex[1] = bArr[i2];
                        this.subs = 2;
                        this.admob = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(c13143l.yandex(), 4 - this.subs);
                c13143l.firebase(this.subs, iMin, c13143l2.yandex);
                int i4 = this.subs + iMin;
                this.subs = i4;
                if (i4 >= 4) {
                    c13143l2.m3562for(0);
                    int iRemoteconfig = c13143l2.remoteconfig();
                    C9892l c9892l = this.loadAd;
                    if (c9892l.yandex(iRemoteconfig)) {
                        this.remoteconfig = c9892l.loadAd;
                        if (!this.isPro) {
                            this.smaato = (((long) c9892l.billing) * 1000000) / ((long) c9892l.crashlytics);
                            C12984l c12984l = new C12984l();
                            c12984l.yandex = this.mopub;
                            c12984l.remoteconfig = AbstractC3825l.vip(this.purchase);
                            c12984l.vip = AbstractC3825l.vip((String) c9892l.mopub);
                            c12984l.metrica = 4096;
                            c12984l.f25447throws = c9892l.amazon;
                            c12984l.f25442package = c9892l.crashlytics;
                            c12984l.amazon = this.crashlytics;
                            c12984l.billing = this.amazon;
                            this.billing.mopub(new C5978l(c12984l));
                            this.isPro = true;
                        }
                        c13143l2.m3562for(0);
                        this.billing.purchase(4, c13143l2);
                        this.admob = 2;
                    } else {
                        this.subs = 0;
                        this.admob = 1;
                    }
                }
            } else {
                if (i != 2) {
                    C18073l.admob();
                    return;
                }
                int iMin2 = Math.min(c13143l.yandex(), this.remoteconfig - this.subs);
                this.billing.purchase(iMin2, c13143l);
                int i5 = this.subs + iMin2;
                this.subs = i5;
                if (i5 >= this.remoteconfig) {
                    AbstractC12442l.subscription(this.vip != -9223372036854775807L);
                    this.billing.yandex(this.vip, 1, this.remoteconfig, 0, null);
                    this.vip += this.smaato;
                    this.subs = 0;
                    this.admob = 0;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC17094l
    public final void subs(int i, long j) {
        this.vip = j;
    }

    @Override // defpackage.InterfaceC17094l
    public final void admob(boolean z) {
    }
}
