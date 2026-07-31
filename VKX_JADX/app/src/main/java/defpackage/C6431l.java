package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؙْٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6431l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C6431l f13450l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C2630l f13451l = new C2630l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f13452l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f13453l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f13454l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte f13455l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f13456l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f13457l;

    static {
        C6431l c6431l = new C6431l();
        f13450l = c6431l;
        c6431l.f13452l = 0;
        c6431l.f13456l = 0;
    }

    public C6431l(C1718l c1718l) {
        this.f13455l = (byte) -1;
        this.f13457l = -1;
        boolean z = false;
        this.f13452l = 0;
        this.f13456l = 0;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        if (iMetrica == 8) {
                            this.f13453l |= 1;
                            this.f13452l = c1718l.smaato();
                        } else if (iMetrica == 16) {
                            this.f13453l |= 2;
                            this.f13456l = c1718l.smaato();
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
                    this.f13454l = c6769l.mopub();
                }
                throw th;
            }
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f13454l = c6769l.mopub();
        }
    }

    public static C17112l subs(C6431l c6431l) {
        C17112l c17112l = new C17112l(1);
        c17112l.isPro(c6431l);
        return c17112l;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return new C17112l(1);
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f13453l & 1) == 1) {
            c11522l.m3097abstract(1, this.f13452l);
        }
        if ((this.f13453l & 2) == 2) {
            c11522l.m3097abstract(2, this.f13456l);
        }
        c11522l.m3129try(this.f13454l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f13457l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f13453l & 1) == 1 ? C11522l.vip(1, this.f13452l) : 0;
        if ((this.f13453l & 2) == 2) {
            iVip += C11522l.vip(2, this.f13456l);
        }
        int size = this.f13454l.size() + iVip;
        this.f13457l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        return subs(this);
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        if (this.f13455l == 1) {
            return true;
        }
        this.f13455l = (byte) 1;
        return true;
    }

    public C6431l() {
        this.f13455l = (byte) -1;
        this.f13457l = -1;
        this.f13454l = AbstractC7735l.f16231l;
    }

    public C6431l(C17112l c17112l) {
        this.f13455l = (byte) -1;
        this.f13457l = -1;
        this.f13454l = c17112l.f5168l;
    }
}
