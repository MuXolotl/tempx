package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lُؕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3617l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C2630l f7539l = new C2630l(28);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C3617l f7540l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f7541l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f7542l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public EnumC7053l f7543l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f7544l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f7545l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f7546l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EnumC11471l f7547l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f7548l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public byte f7549l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7550l;

    static {
        C3617l c3617l = new C3617l();
        f7540l = c3617l;
        c3617l.f7541l = 0;
        c3617l.f7548l = 0;
        c3617l.f7547l = EnumC11471l.ERROR;
        c3617l.f7550l = 0;
        c3617l.f7542l = 0;
        c3617l.f7543l = EnumC7053l.LANGUAGE_VERSION;
    }

    public C3617l(C1718l c1718l) {
        this.f7549l = (byte) -1;
        this.f7546l = -1;
        boolean z = false;
        this.f7541l = 0;
        this.f7548l = 0;
        EnumC11471l enumC11471l = EnumC11471l.ERROR;
        this.f7547l = enumC11471l;
        this.f7550l = 0;
        this.f7542l = 0;
        EnumC7053l enumC7053l = EnumC7053l.LANGUAGE_VERSION;
        this.f7543l = enumC7053l;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        if (iMetrica == 8) {
                            this.f7544l |= 1;
                            this.f7541l = c1718l.smaato();
                        } else if (iMetrica != 16) {
                            EnumC7053l enumC7053l2 = null;
                            EnumC11471l enumC11471l2 = null;
                            if (iMetrica == 24) {
                                int iSmaato = c1718l.smaato();
                                if (iSmaato == 0) {
                                    enumC11471l2 = EnumC11471l.WARNING;
                                } else if (iSmaato == 1) {
                                    enumC11471l2 = enumC11471l;
                                } else if (iSmaato == 2) {
                                    enumC11471l2 = EnumC11471l.HIDDEN;
                                }
                                if (enumC11471l2 == null) {
                                    c11522lM3096volatile.m3130while(iMetrica);
                                    c11522lM3096volatile.m3130while(iSmaato);
                                } else {
                                    this.f7544l |= 4;
                                    this.f7547l = enumC11471l2;
                                }
                            } else if (iMetrica == 32) {
                                this.f7544l |= 8;
                                this.f7550l = c1718l.smaato();
                            } else if (iMetrica == 40) {
                                this.f7544l |= 16;
                                this.f7542l = c1718l.smaato();
                            } else if (iMetrica == 48) {
                                int iSmaato2 = c1718l.smaato();
                                if (iSmaato2 == 0) {
                                    enumC7053l2 = enumC7053l;
                                } else if (iSmaato2 == 1) {
                                    enumC7053l2 = EnumC7053l.COMPILER_VERSION;
                                } else if (iSmaato2 == 2) {
                                    enumC7053l2 = EnumC7053l.API_VERSION;
                                }
                                if (enumC7053l2 == null) {
                                    c11522lM3096volatile.m3130while(iMetrica);
                                    c11522lM3096volatile.m3130while(iSmaato2);
                                } else {
                                    this.f7544l |= 32;
                                    this.f7543l = enumC7053l2;
                                }
                            } else if (!c1718l.ads(iMetrica, c11522lM3096volatile)) {
                            }
                        } else {
                            this.f7544l |= 2;
                            this.f7548l = c1718l.smaato();
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
                    this.f7545l = c6769l.mopub();
                }
                throw th;
            }
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f7545l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C11382l.admob();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f7544l & 1) == 1) {
            c11522l.m3097abstract(1, this.f7541l);
        }
        if ((this.f7544l & 2) == 2) {
            c11522l.m3097abstract(2, this.f7548l);
        }
        if ((this.f7544l & 4) == 4) {
            c11522l.m3112import(3, this.f7547l.f23058l);
        }
        if ((this.f7544l & 8) == 8) {
            c11522l.m3097abstract(4, this.f7550l);
        }
        if ((this.f7544l & 16) == 16) {
            c11522l.m3097abstract(5, this.f7542l);
        }
        if ((this.f7544l & 32) == 32) {
            c11522l.m3112import(6, this.f7543l.f14790l);
        }
        c11522l.m3129try(this.f7545l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f7546l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f7544l & 1) == 1 ? C11522l.vip(1, this.f7541l) : 0;
        if ((this.f7544l & 2) == 2) {
            iVip += C11522l.vip(2, this.f7548l);
        }
        if ((this.f7544l & 4) == 4) {
            iVip += C11522l.remoteconfig(3, this.f7547l.f23058l);
        }
        if ((this.f7544l & 8) == 8) {
            iVip += C11522l.vip(4, this.f7550l);
        }
        if ((this.f7544l & 16) == 16) {
            iVip += C11522l.vip(5, this.f7542l);
        }
        if ((this.f7544l & 32) == 32) {
            iVip += C11522l.remoteconfig(6, this.f7543l.f14790l);
        }
        int size = this.f7545l.size() + iVip;
        this.f7546l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C11382l c11382lAdmob = C11382l.admob();
        c11382lAdmob.subs(this);
        return c11382lAdmob;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        if (this.f7549l == 1) {
            return true;
        }
        this.f7549l = (byte) 1;
        return true;
    }

    public C3617l() {
        this.f7549l = (byte) -1;
        this.f7546l = -1;
        this.f7545l = AbstractC7735l.f16231l;
    }

    public C3617l(C11382l c11382l) {
        this.f7549l = (byte) -1;
        this.f7546l = -1;
        this.f7545l = c11382l.f5168l;
    }
}
