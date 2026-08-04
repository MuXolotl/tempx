package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٌٔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14780l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C14780l f28897l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C2630l f28898l = new C2630l(6);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f28899l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f28900l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f28901l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte f28902l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C4207l f28903l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f28904l;

    static {
        C14780l c14780l = new C14780l();
        f28897l = c14780l;
        c14780l.f28899l = 0;
        c14780l.f28903l = C4207l.f8622l;
    }

    public C14780l(C1718l c1718l, C3429l c3429l) {
        C13836l c13836lIsPro;
        this.f28902l = (byte) -1;
        this.f28904l = -1;
        boolean z = false;
        this.f28899l = 0;
        this.f28903l = C4207l.f8622l;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iMetrica = c1718l.metrica();
                        if (iMetrica != 0) {
                            if (iMetrica == 8) {
                                this.f28900l |= 1;
                                this.f28899l = c1718l.smaato();
                            } else if (iMetrica == 18) {
                                if ((this.f28900l & 2) == 2) {
                                    C4207l c4207l = this.f28903l;
                                    c4207l.getClass();
                                    c13836lIsPro = C4207l.isPro(c4207l);
                                } else {
                                    c13836lIsPro = null;
                                }
                                C4207l c4207l2 = (C4207l) c1718l.admob(C4207l.f8623l, c3429l);
                                this.f28903l = c4207l2;
                                if (c13836lIsPro != null) {
                                    c13836lIsPro.subs(c4207l2);
                                    this.f28903l = c13836lIsPro.billing();
                                }
                                this.f28900l |= 2;
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
                    this.f28901l = c6769l.mopub();
                }
                throw th;
            }
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f28901l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        C4252l c4252l = new C4252l(0);
        c4252l.f8727l = C4207l.f8622l;
        return c4252l;
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f28900l & 1) == 1) {
            c11522l.m3097abstract(1, this.f28899l);
        }
        if ((this.f28900l & 2) == 2) {
            c11522l.m3120public(2, this.f28903l);
        }
        c11522l.m3129try(this.f28901l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f28904l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f28900l & 1) == 1 ? C11522l.vip(1, this.f28899l) : 0;
        if ((this.f28900l & 2) == 2) {
            iVip += C11522l.startapp(2, this.f28903l);
        }
        int size = this.f28901l.size() + iVip;
        this.f28904l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C4252l c4252l = new C4252l(0);
        c4252l.f8727l = C4207l.f8622l;
        c4252l.subs(this);
        return c4252l;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f28902l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f28900l;
        if ((i & 1) != 1) {
            this.f28902l = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.f28902l = (byte) 0;
            return false;
        }
        if (this.f28903l.yandex()) {
            this.f28902l = (byte) 1;
            return true;
        }
        this.f28902l = (byte) 0;
        return false;
    }

    public C14780l() {
        this.f28902l = (byte) -1;
        this.f28904l = -1;
        this.f28901l = AbstractC7735l.f16231l;
    }

    public C14780l(C4252l c4252l) {
        this.f28902l = (byte) -1;
        this.f28904l = -1;
        this.f28901l = c4252l.f5168l;
    }
}
