package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lًۥۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8400l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C8400l f17361l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C2630l f17362l = new C2630l(20);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f17363l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f17364l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f17365l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f17366l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EnumC9653l f17367l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f17368l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte f17369l;

    static {
        C8400l c8400l = new C8400l();
        f17361l = c8400l;
        c8400l.f17363l = -1;
        c8400l.f17368l = 0;
        c8400l.f17367l = EnumC9653l.PACKAGE;
    }

    public C8400l(C1718l c1718l) {
        this.f17369l = (byte) -1;
        this.f17364l = -1;
        this.f17363l = -1;
        boolean z = false;
        this.f17368l = 0;
        EnumC9653l enumC9653l = EnumC9653l.PACKAGE;
        this.f17367l = enumC9653l;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        if (iMetrica == 8) {
                            this.f17365l |= 1;
                            this.f17363l = c1718l.smaato();
                        } else if (iMetrica == 16) {
                            this.f17365l |= 2;
                            this.f17368l = c1718l.smaato();
                        } else if (iMetrica == 24) {
                            int iSmaato = c1718l.smaato();
                            EnumC9653l enumC9653l2 = iSmaato != 0 ? iSmaato != 1 ? iSmaato != 2 ? null : EnumC9653l.LOCAL : enumC9653l : EnumC9653l.CLASS;
                            if (enumC9653l2 == null) {
                                c11522lM3096volatile.m3130while(iMetrica);
                                c11522lM3096volatile.m3130while(iSmaato);
                            } else {
                                this.f17365l |= 4;
                                this.f17367l = enumC9653l2;
                            }
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
                    this.f17366l = c6769l.mopub();
                }
                throw th;
            }
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f17366l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C5873l.admob();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f17365l & 1) == 1) {
            c11522l.m3097abstract(1, this.f17363l);
        }
        if ((this.f17365l & 2) == 2) {
            c11522l.m3097abstract(2, this.f17368l);
        }
        if ((this.f17365l & 4) == 4) {
            c11522l.m3112import(3, this.f17367l.f19695l);
        }
        c11522l.m3129try(this.f17366l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f17364l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f17365l & 1) == 1 ? C11522l.vip(1, this.f17363l) : 0;
        if ((this.f17365l & 2) == 2) {
            iVip += C11522l.vip(2, this.f17368l);
        }
        if ((this.f17365l & 4) == 4) {
            iVip += C11522l.remoteconfig(3, this.f17367l.f19695l);
        }
        int size = this.f17366l.size() + iVip;
        this.f17364l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C5873l c5873lAdmob = C5873l.admob();
        c5873lAdmob.subs(this);
        return c5873lAdmob;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f17369l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f17365l & 2) == 2) {
            this.f17369l = (byte) 1;
            return true;
        }
        this.f17369l = (byte) 0;
        return false;
    }

    public C8400l() {
        this.f17369l = (byte) -1;
        this.f17364l = -1;
        this.f17366l = AbstractC7735l.f16231l;
    }

    public C8400l(C5873l c5873l) {
        this.f17369l = (byte) -1;
        this.f17364l = -1;
        this.f17366l = c5873l.f5168l;
    }
}
