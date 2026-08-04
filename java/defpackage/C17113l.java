package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٗٓٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17113l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C17113l f33277l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C2630l f33278l = new C2630l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f33279l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f33280l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f33281l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte f33282l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f33283l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f33284l;

    static {
        C17113l c17113l = new C17113l();
        f33277l = c17113l;
        c17113l.f33279l = 0;
        c17113l.f33283l = 0;
    }

    public C17113l(C1718l c1718l) {
        this.f33282l = (byte) -1;
        this.f33284l = -1;
        boolean z = false;
        this.f33279l = 0;
        this.f33283l = 0;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        if (iMetrica == 8) {
                            this.f33280l |= 1;
                            this.f33279l = c1718l.smaato();
                        } else if (iMetrica == 16) {
                            this.f33280l |= 2;
                            this.f33283l = c1718l.smaato();
                        } else if (!c1718l.ads(iMetrica, c11522lM3096volatile)) {
                        }
                    }
                    z = true;
                } catch (C12383l e) {
                    e.f24472l = this;
                    throw e;
                } catch (IOException e2) {
                    C12383l c12383l = new C12383l(e2.getMessage());
                    c12383l.f24472l = this;
                    throw c12383l;
                }
            } catch (Throwable th) {
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f33281l = c6769l.mopub();
                }
                throw th;
            }
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f33281l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return new C17112l(0);
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f33280l & 1) == 1) {
            c11522l.m3097abstract(1, this.f33279l);
        }
        if ((this.f33280l & 2) == 2) {
            c11522l.m3097abstract(2, this.f33283l);
        }
        c11522l.m3129try(this.f33281l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f33284l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f33280l & 1) == 1 ? C11522l.vip(1, this.f33279l) : 0;
        if ((this.f33280l & 2) == 2) {
            iVip += C11522l.vip(2, this.f33283l);
        }
        int size = this.f33281l.size() + iVip;
        this.f33284l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C17112l c17112l = new C17112l(0);
        c17112l.subs(this);
        return c17112l;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        if (this.f33282l == 1) {
            return true;
        }
        this.f33282l = (byte) 1;
        return true;
    }

    public C17113l() {
        this.f33282l = (byte) -1;
        this.f33284l = -1;
        this.f33281l = AbstractC7735l.f16231l;
    }

    public C17113l(C17112l c17112l) {
        this.f33282l = (byte) -1;
        this.f33284l = -1;
        this.f33281l = c17112l.f5168l;
    }
}
