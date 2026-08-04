package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l٘ٞۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18092l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C2630l f35376l = new C2630l(14);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C18092l f35377l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f35378l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f35379l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public List f35380l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f35381l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f35382l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public byte f35383l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public EnumC16055l f35384l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f35385l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f35386l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C18128l f35387l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f35388l;

    static {
        C18092l c18092l = new C18092l();
        f35377l = c18092l;
        c18092l.f35378l = 0;
        c18092l.f35385l = 0;
        c18092l.f35384l = EnumC16055l.TRUE;
        c18092l.f35387l = C18128l.f35421l;
        c18092l.f35379l = 0;
        List list = Collections.EMPTY_LIST;
        c18092l.f35380l = list;
        c18092l.f35386l = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18092l(C1718l c1718l, C3429l c3429l) {
        EnumC16055l enumC16055l;
        this.f35383l = (byte) -1;
        this.f35388l = -1;
        boolean z = false;
        this.f35378l = 0;
        this.f35385l = 0;
        EnumC16055l enumC16055l2 = EnumC16055l.TRUE;
        this.f35384l = enumC16055l2;
        this.f35387l = C18128l.f35421l;
        this.f35379l = 0;
        List list = Collections.EMPTY_LIST;
        this.f35380l = list;
        this.f35386l = list;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iMetrica = c1718l.metrica();
                        if (iMetrica != 0) {
                            if (iMetrica == 8) {
                                this.f35381l |= 1;
                                this.f35378l = c1718l.smaato();
                            } else if (iMetrica != 16) {
                                Object objAds = null;
                                if (iMetrica == 24) {
                                    int iSmaato = c1718l.smaato();
                                    if (iSmaato != 0) {
                                        if (iSmaato == 1) {
                                            objAds = EnumC16055l.FALSE;
                                        } else if (iSmaato == 2) {
                                            objAds = EnumC16055l.NULL;
                                        }
                                        enumC16055l = objAds;
                                    } else {
                                        enumC16055l = enumC16055l2;
                                    }
                                    if (enumC16055l == 0) {
                                        c11522lM3096volatile.m3130while(iMetrica);
                                        c11522lM3096volatile.m3130while(iSmaato);
                                    } else {
                                        this.f35381l |= 4;
                                        this.f35384l = enumC16055l;
                                    }
                                } else if (iMetrica == 34) {
                                    if ((this.f35381l & 8) == 8) {
                                        C18128l c18128l = this.f35387l;
                                        c18128l.getClass();
                                        objAds = C18128l.ads(c18128l);
                                    }
                                    C7699l c7699l = objAds;
                                    C18128l c18128l2 = (C18128l) c1718l.admob(C18128l.f35420l, c3429l);
                                    this.f35387l = c18128l2;
                                    if (c7699l != 0) {
                                        c7699l.isPro(c18128l2);
                                        this.f35387l = c7699l.admob();
                                    }
                                    this.f35381l |= 8;
                                } else if (iMetrica != 40) {
                                    C2630l c2630l = f35376l;
                                    if (iMetrica == 50) {
                                        if ((i & 32) != 32) {
                                            this.f35380l = new ArrayList();
                                            i |= 32;
                                        }
                                        this.f35380l.add(c1718l.admob(c2630l, c3429l));
                                    } else if (iMetrica == 58) {
                                        if ((i & 64) != 64) {
                                            this.f35386l = new ArrayList();
                                            i |= 64;
                                        }
                                        this.f35386l.add(c1718l.admob(c2630l, c3429l));
                                    } else if (!c1718l.ads(iMetrica, c11522lM3096volatile)) {
                                    }
                                } else {
                                    this.f35381l |= 16;
                                    this.f35379l = c1718l.smaato();
                                }
                            } else {
                                this.f35381l |= 2;
                                this.f35385l = c1718l.smaato();
                            }
                        }
                        z = true;
                    } catch (C12383l e) {
                        e.f24472l = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    C12383l c12383l = new C12383l(e2.getMessage());
                    c12383l.f24472l = this;
                    throw c12383l;
                }
            } catch (Throwable th) {
                if ((i & 32) == 32) {
                    this.f35380l = DesugarCollections.unmodifiableList(this.f35380l);
                }
                if ((i & 64) == 64) {
                    this.f35386l = DesugarCollections.unmodifiableList(this.f35386l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f35382l = c6769l.mopub();
                }
                throw th;
            }
        }
        if ((i & 32) == 32) {
            this.f35380l = DesugarCollections.unmodifiableList(this.f35380l);
        }
        if ((i & 64) == 64) {
            this.f35386l = DesugarCollections.unmodifiableList(this.f35386l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f35382l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C12063l.admob();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f35381l & 1) == 1) {
            c11522l.m3097abstract(1, this.f35378l);
        }
        if ((this.f35381l & 2) == 2) {
            c11522l.m3097abstract(2, this.f35385l);
        }
        if ((this.f35381l & 4) == 4) {
            c11522l.m3112import(3, this.f35384l.f31456l);
        }
        if ((this.f35381l & 8) == 8) {
            c11522l.m3120public(4, this.f35387l);
        }
        if ((this.f35381l & 16) == 16) {
            c11522l.m3097abstract(5, this.f35379l);
        }
        for (int i = 0; i < this.f35380l.size(); i++) {
            c11522l.m3120public(6, (AbstractC14080l) this.f35380l.get(i));
        }
        for (int i2 = 0; i2 < this.f35386l.size(); i2++) {
            c11522l.m3120public(7, (AbstractC14080l) this.f35386l.get(i2));
        }
        c11522l.m3129try(this.f35382l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f35388l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f35381l & 1) == 1 ? C11522l.vip(1, this.f35378l) : 0;
        if ((this.f35381l & 2) == 2) {
            iVip += C11522l.vip(2, this.f35385l);
        }
        if ((this.f35381l & 4) == 4) {
            iVip += C11522l.remoteconfig(3, this.f35384l.f31456l);
        }
        if ((this.f35381l & 8) == 8) {
            iVip += C11522l.startapp(4, this.f35387l);
        }
        if ((this.f35381l & 16) == 16) {
            iVip += C11522l.vip(5, this.f35379l);
        }
        for (int i2 = 0; i2 < this.f35380l.size(); i2++) {
            iVip += C11522l.startapp(6, (AbstractC14080l) this.f35380l.get(i2));
        }
        for (int i3 = 0; i3 < this.f35386l.size(); i3++) {
            iVip += C11522l.startapp(7, (AbstractC14080l) this.f35386l.get(i3));
        }
        int size = this.f35382l.size() + iVip;
        this.f35388l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C12063l c12063lAdmob = C12063l.admob();
        c12063lAdmob.subs(this);
        return c12063lAdmob;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f35383l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f35381l & 8) == 8 && !this.f35387l.yandex()) {
            this.f35383l = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f35380l.size(); i++) {
            if (!((C18092l) this.f35380l.get(i)).yandex()) {
                this.f35383l = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f35386l.size(); i2++) {
            if (!((C18092l) this.f35386l.get(i2)).yandex()) {
                this.f35383l = (byte) 0;
                return false;
            }
        }
        this.f35383l = (byte) 1;
        return true;
    }

    public C18092l() {
        this.f35383l = (byte) -1;
        this.f35388l = -1;
        this.f35382l = AbstractC7735l.f16231l;
    }

    public C18092l(C12063l c12063l) {
        this.f35383l = (byte) -1;
        this.f35388l = -1;
        this.f35382l = c12063l.f5168l;
    }
}
