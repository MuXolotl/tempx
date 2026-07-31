package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lَٞٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10459l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C10459l f21274l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C2630l f21275l = new C2630l(2);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C17113l f21276l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C6431l f21277l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte f21278l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f21279l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f21280l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C6431l f21281l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C6431l f21282l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f21283l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C6431l f21284l;

    static {
        C10459l c10459l = new C10459l();
        f21274l = c10459l;
        c10459l.f21276l = C17113l.f33277l;
        C6431l c6431l = C6431l.f13450l;
        c10459l.f21282l = c6431l;
        c10459l.f21281l = c6431l;
        c10459l.f21284l = c6431l;
        c10459l.f21277l = c6431l;
    }

    public C10459l(C1718l c1718l, C3429l c3429l) {
        this.f21278l = (byte) -1;
        this.f21283l = -1;
        this.f21276l = C17113l.f33277l;
        C6431l c6431l = C6431l.f13450l;
        this.f21282l = c6431l;
        this.f21281l = c6431l;
        this.f21284l = c6431l;
        this.f21277l = c6431l;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        int i = 0;
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        C17112l c17112lSubs = null;
                        if (iMetrica == 10) {
                            if ((this.f21279l & 1) == 1) {
                                C17113l c17113l = this.f21276l;
                                c17113l.getClass();
                                c17112lSubs = new C17112l(i);
                                c17112lSubs.subs(c17113l);
                            }
                            C17113l c17113l2 = (C17113l) c1718l.admob(C17113l.f33278l, c3429l);
                            this.f21276l = c17113l2;
                            if (c17112lSubs != null) {
                                c17112lSubs.subs(c17113l2);
                                this.f21276l = c17112lSubs.billing();
                            }
                            this.f21279l |= 1;
                        } else if (iMetrica == 18) {
                            if ((this.f21279l & 2) == 2) {
                                C6431l c6431l2 = this.f21282l;
                                c6431l2.getClass();
                                c17112lSubs = C6431l.subs(c6431l2);
                            }
                            C6431l c6431l3 = (C6431l) c1718l.admob(C6431l.f13451l, c3429l);
                            this.f21282l = c6431l3;
                            if (c17112lSubs != null) {
                                c17112lSubs.isPro(c6431l3);
                                this.f21282l = c17112lSubs.admob();
                            }
                            this.f21279l |= 2;
                        } else if (iMetrica == 26) {
                            if ((this.f21279l & 4) == 4) {
                                C6431l c6431l4 = this.f21281l;
                                c6431l4.getClass();
                                c17112lSubs = C6431l.subs(c6431l4);
                            }
                            C6431l c6431l5 = (C6431l) c1718l.admob(C6431l.f13451l, c3429l);
                            this.f21281l = c6431l5;
                            if (c17112lSubs != null) {
                                c17112lSubs.isPro(c6431l5);
                                this.f21281l = c17112lSubs.admob();
                            }
                            this.f21279l |= 4;
                        } else if (iMetrica == 34) {
                            if ((this.f21279l & 8) == 8) {
                                C6431l c6431l6 = this.f21284l;
                                c6431l6.getClass();
                                c17112lSubs = C6431l.subs(c6431l6);
                            }
                            C6431l c6431l7 = (C6431l) c1718l.admob(C6431l.f13451l, c3429l);
                            this.f21284l = c6431l7;
                            if (c17112lSubs != null) {
                                c17112lSubs.isPro(c6431l7);
                                this.f21284l = c17112lSubs.admob();
                            }
                            this.f21279l |= 8;
                        } else if (iMetrica == 42) {
                            if ((this.f21279l & 16) == 16) {
                                C6431l c6431l8 = this.f21277l;
                                c6431l8.getClass();
                                c17112lSubs = C6431l.subs(c6431l8);
                            }
                            C6431l c6431l9 = (C6431l) c1718l.admob(C6431l.f13451l, c3429l);
                            this.f21277l = c6431l9;
                            if (c17112lSubs != null) {
                                c17112lSubs.isPro(c6431l9);
                                this.f21277l = c17112lSubs.admob();
                            }
                            this.f21279l |= 16;
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
                    this.f21280l = c6769l.mopub();
                }
                throw th;
            }
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f21280l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C18463l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f21279l & 1) == 1) {
            c11522l.m3120public(1, this.f21276l);
        }
        if ((this.f21279l & 2) == 2) {
            c11522l.m3120public(2, this.f21282l);
        }
        if ((this.f21279l & 4) == 4) {
            c11522l.m3120public(3, this.f21281l);
        }
        if ((this.f21279l & 8) == 8) {
            c11522l.m3120public(4, this.f21284l);
        }
        if ((this.f21279l & 16) == 16) {
            c11522l.m3120public(5, this.f21277l);
        }
        c11522l.m3129try(this.f21280l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f21283l;
        if (i != -1) {
            return i;
        }
        int iStartapp = (this.f21279l & 1) == 1 ? C11522l.startapp(1, this.f21276l) : 0;
        if ((this.f21279l & 2) == 2) {
            iStartapp += C11522l.startapp(2, this.f21282l);
        }
        if ((this.f21279l & 4) == 4) {
            iStartapp += C11522l.startapp(3, this.f21281l);
        }
        if ((this.f21279l & 8) == 8) {
            iStartapp += C11522l.startapp(4, this.f21284l);
        }
        if ((this.f21279l & 16) == 16) {
            iStartapp += C11522l.startapp(5, this.f21277l);
        }
        int size = this.f21280l.size() + iStartapp;
        this.f21283l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C18463l c18463lSubs = C18463l.subs();
        c18463lSubs.firebase(this);
        return c18463lSubs;
    }

    public final boolean subs() {
        return (this.f21279l & 4) == 4;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        if (this.f21278l == 1) {
            return true;
        }
        this.f21278l = (byte) 1;
        return true;
    }

    public C10459l() {
        this.f21278l = (byte) -1;
        this.f21283l = -1;
        this.f21280l = AbstractC7735l.f16231l;
    }

    public C10459l(C18463l c18463l) {
        this.f21278l = (byte) -1;
        this.f21283l = -1;
        this.f21280l = c18463l.f5168l;
    }
}
