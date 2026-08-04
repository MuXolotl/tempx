package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؗٚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4987l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C4987l f10217l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C2630l f10218l = new C2630l(9);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f10219l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f10220l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f10221l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte f10222l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C7362l f10223l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f10224l;

    static {
        C4987l c4987l = new C4987l();
        f10217l = c4987l;
        c4987l.f10219l = 0;
        c4987l.f10223l = AbstractC7735l.f16231l;
    }

    public C4987l(C1718l c1718l) {
        this.f10222l = (byte) -1;
        this.f10224l = -1;
        boolean z = false;
        this.f10219l = 0;
        this.f10223l = AbstractC7735l.f16231l;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iMetrica = c1718l.metrica();
                        if (iMetrica != 0) {
                            if (iMetrica == 8) {
                                this.f10220l |= 1;
                                this.f10219l = c1718l.smaato();
                            } else if (iMetrica == 18) {
                                this.f10220l |= 2;
                                this.f10223l = c1718l.billing();
                            } else if (!c1718l.ads(iMetrica, c11522lM3096volatile)) {
                            }
                        }
                        z = true;
                    } catch (IOException e) {
                        C12383l c12383l = new C12383l(e.getMessage());
                        c12383l.f24472l = this;
                        throw c12383l;
                    }
                } catch (C12383l e2) {
                    e2.f24472l = this;
                    throw e2;
                }
            } catch (Throwable th) {
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f10221l = c6769l.mopub();
                }
                throw th;
            }
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f10221l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        C4252l c4252l = new C4252l(1);
        c4252l.f8727l = AbstractC7735l.f16231l;
        return c4252l;
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f10220l & 1) == 1) {
            c11522l.m3097abstract(1, this.f10219l);
        }
        if ((this.f10220l & 2) == 2) {
            C7362l c7362l = this.f10223l;
            c11522l.m3102const(2, 2);
            c11522l.m3130while(c7362l.size());
            c11522l.m3129try(c7362l);
        }
        c11522l.m3129try(this.f10221l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f10224l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f10220l & 1) == 1 ? C11522l.vip(1, this.f10219l) : 0;
        if ((this.f10220l & 2) == 2) {
            C7362l c7362l = this.f10223l;
            iVip += c7362l.size() + C11522l.ads(c7362l.size()) + C11522l.tapsense(2);
        }
        int size = this.f10221l.size() + iVip;
        this.f10224l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C4252l c4252l = new C4252l(1);
        c4252l.f8727l = AbstractC7735l.f16231l;
        c4252l.isPro(this);
        return c4252l;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f10222l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f10220l;
        if ((i & 1) != 1) {
            this.f10222l = (byte) 0;
            return false;
        }
        if ((i & 2) == 2) {
            this.f10222l = (byte) 1;
            return true;
        }
        this.f10222l = (byte) 0;
        return false;
    }

    public C4987l() {
        this.f10222l = (byte) -1;
        this.f10224l = -1;
        this.f10221l = AbstractC7735l.f16231l;
    }

    public C4987l(C4252l c4252l) {
        this.f10222l = (byte) -1;
        this.f10224l = -1;
        this.f10221l = c4252l.f5168l;
    }
}
