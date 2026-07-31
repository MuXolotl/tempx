package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lٕۨؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16093l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C16093l f31531l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C2630l f31532l = new C2630l(23);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public EnumC14176l f31533l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f31534l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f31535l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f31536l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f31537l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C18128l f31538l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte f31539l;

    static {
        C16093l c16093l = new C16093l();
        f31531l = c16093l;
        c16093l.f31533l = EnumC14176l.INV;
        c16093l.f31538l = C18128l.f35421l;
        c16093l.f31537l = 0;
    }

    public C16093l(C1718l c1718l, C3429l c3429l) {
        this.f31539l = (byte) -1;
        this.f31534l = -1;
        EnumC14176l enumC14176l = EnumC14176l.INV;
        this.f31533l = enumC14176l;
        this.f31538l = C18128l.f35421l;
        boolean z = false;
        this.f31537l = 0;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        C7699l c7699lAds = null;
                        EnumC14176l enumC14176l2 = null;
                        if (iMetrica == 8) {
                            int iSmaato = c1718l.smaato();
                            if (iSmaato == 0) {
                                enumC14176l2 = EnumC14176l.IN;
                            } else if (iSmaato == 1) {
                                enumC14176l2 = EnumC14176l.OUT;
                            } else if (iSmaato == 2) {
                                enumC14176l2 = enumC14176l;
                            } else if (iSmaato == 3) {
                                enumC14176l2 = EnumC14176l.STAR;
                            }
                            if (enumC14176l2 == null) {
                                c11522lM3096volatile.m3130while(iMetrica);
                                c11522lM3096volatile.m3130while(iSmaato);
                            } else {
                                this.f31535l |= 1;
                                this.f31533l = enumC14176l2;
                            }
                        } else if (iMetrica == 18) {
                            if ((this.f31535l & 2) == 2) {
                                C18128l c18128l = this.f31538l;
                                c18128l.getClass();
                                c7699lAds = C18128l.ads(c18128l);
                            }
                            C18128l c18128l2 = (C18128l) c1718l.admob(C18128l.f35420l, c3429l);
                            this.f31538l = c18128l2;
                            if (c7699lAds != null) {
                                c7699lAds.isPro(c18128l2);
                                this.f31538l = c7699lAds.admob();
                            }
                            this.f31535l |= 2;
                        } else if (iMetrica == 24) {
                            this.f31535l |= 4;
                            this.f31537l = c1718l.smaato();
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
                    this.f31536l = c6769l.mopub();
                }
                throw th;
            }
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f31536l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C2135l.admob();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f31535l & 1) == 1) {
            c11522l.m3112import(1, this.f31533l.f27762l);
        }
        if ((this.f31535l & 2) == 2) {
            c11522l.m3120public(2, this.f31538l);
        }
        if ((this.f31535l & 4) == 4) {
            c11522l.m3097abstract(3, this.f31537l);
        }
        c11522l.m3129try(this.f31536l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f31534l;
        if (i != -1) {
            return i;
        }
        int iRemoteconfig = (this.f31535l & 1) == 1 ? C11522l.remoteconfig(1, this.f31533l.f27762l) : 0;
        if ((this.f31535l & 2) == 2) {
            iRemoteconfig += C11522l.startapp(2, this.f31538l);
        }
        if ((this.f31535l & 4) == 4) {
            iRemoteconfig += C11522l.vip(3, this.f31537l);
        }
        int size = this.f31536l.size() + iRemoteconfig;
        this.f31534l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C2135l c2135lAdmob = C2135l.admob();
        c2135lAdmob.subs(this);
        return c2135lAdmob;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f31539l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f31535l & 2) != 2 || this.f31538l.yandex()) {
            this.f31539l = (byte) 1;
            return true;
        }
        this.f31539l = (byte) 0;
        return false;
    }

    public C16093l() {
        this.f31539l = (byte) -1;
        this.f31534l = -1;
        this.f31536l = AbstractC7735l.f16231l;
    }

    public C16093l(C2135l c2135l) {
        this.f31539l = (byte) -1;
        this.f31534l = -1;
        this.f31536l = c2135l.f5168l;
    }
}
