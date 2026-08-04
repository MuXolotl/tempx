package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٍٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18426l extends AbstractC2597l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C2630l f35981l = new C2630l(27);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C18426l f35982l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f35983l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f35984l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f35985l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C18128l f35986l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7735l f35987l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public List f35988l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f35989l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f35990l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public byte f35991l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f35992l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C18128l f35993l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public C4207l f35994l;

    static {
        C18426l c18426l = new C18426l();
        f35982l = c18426l;
        c18426l.f35990l = 0;
        c18426l.f35989l = 0;
        C18128l c18128l = C18128l.f35421l;
        c18426l.f35993l = c18128l;
        c18426l.f35985l = 0;
        c18426l.f35986l = c18128l;
        c18426l.f35992l = 0;
        c18426l.f35988l = Collections.EMPTY_LIST;
        c18426l.f35994l = C4207l.f8622l;
    }

    public C18426l(C1718l c1718l, C3429l c3429l) {
        this.f35991l = (byte) -1;
        this.f35983l = -1;
        boolean z = false;
        this.f35990l = 0;
        this.f35989l = 0;
        C18128l c18128l = C18128l.f35421l;
        this.f35993l = c18128l;
        this.f35985l = 0;
        this.f35986l = c18128l;
        this.f35992l = 0;
        this.f35988l = Collections.EMPTY_LIST;
        this.f35994l = C4207l.f8622l;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        if (iMetrica == 8) {
                            this.f35984l |= 1;
                            this.f35990l = c1718l.smaato();
                        } else if (iMetrica != 16) {
                            C13836l c13836lIsPro = null;
                            C7699l c7699lAds = null;
                            C7699l c7699lAds2 = null;
                            if (iMetrica == 26) {
                                if ((this.f35984l & 4) == 4) {
                                    C18128l c18128l2 = this.f35993l;
                                    c18128l2.getClass();
                                    c7699lAds = C18128l.ads(c18128l2);
                                }
                                C18128l c18128l3 = (C18128l) c1718l.admob(C18128l.f35420l, c3429l);
                                this.f35993l = c18128l3;
                                if (c7699lAds != null) {
                                    c7699lAds.isPro(c18128l3);
                                    this.f35993l = c7699lAds.admob();
                                }
                                this.f35984l |= 4;
                            } else if (iMetrica == 34) {
                                if ((this.f35984l & 16) == 16) {
                                    C18128l c18128l4 = this.f35986l;
                                    c18128l4.getClass();
                                    c7699lAds2 = C18128l.ads(c18128l4);
                                }
                                C18128l c18128l5 = (C18128l) c1718l.admob(C18128l.f35420l, c3429l);
                                this.f35986l = c18128l5;
                                if (c7699lAds2 != null) {
                                    c7699lAds2.isPro(c18128l5);
                                    this.f35986l = c7699lAds2.admob();
                                }
                                this.f35984l |= 16;
                            } else if (iMetrica == 40) {
                                this.f35984l |= 8;
                                this.f35985l = c1718l.smaato();
                            } else if (iMetrica == 48) {
                                this.f35984l |= 32;
                                this.f35992l = c1718l.smaato();
                            } else if (iMetrica == 58) {
                                int i = (c == true ? 1 : 0) & '@';
                                c = c;
                                if (i != 64) {
                                    this.f35988l = new ArrayList();
                                    c = '@';
                                }
                                this.f35988l.add(c1718l.admob(C7899l.f16471l, c3429l));
                            } else if (iMetrica == 66) {
                                if ((this.f35984l & 64) == 64) {
                                    C4207l c4207l = this.f35994l;
                                    c4207l.getClass();
                                    c13836lIsPro = C4207l.isPro(c4207l);
                                }
                                C4207l c4207l2 = (C4207l) c1718l.admob(C4207l.f8623l, c3429l);
                                this.f35994l = c4207l2;
                                if (c13836lIsPro != null) {
                                    c13836lIsPro.subs(c4207l2);
                                    this.f35994l = c13836lIsPro.billing();
                                }
                                this.f35984l |= 64;
                            } else if (!vip(c1718l, c11522lM3096volatile, c3429l, iMetrica)) {
                            }
                        } else {
                            this.f35984l |= 2;
                            this.f35989l = c1718l.smaato();
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
                if (((c == true ? 1 : 0) & '@') == 64) {
                    this.f35988l = DesugarCollections.unmodifiableList(this.f35988l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f35987l = c6769l.mopub();
                }
                remoteconfig();
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & '@') == 64) {
            this.f35988l = DesugarCollections.unmodifiableList(this.f35988l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f35987l = c6769l.mopub();
        }
        remoteconfig();
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C9259l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        C10023l c10023l = new C10023l(this);
        if ((this.f35984l & 1) == 1) {
            c11522l.m3097abstract(1, this.f35990l);
        }
        if ((this.f35984l & 2) == 2) {
            c11522l.m3097abstract(2, this.f35989l);
        }
        if ((this.f35984l & 4) == 4) {
            c11522l.m3120public(3, this.f35993l);
        }
        if ((this.f35984l & 16) == 16) {
            c11522l.m3120public(4, this.f35986l);
        }
        if ((this.f35984l & 8) == 8) {
            c11522l.m3097abstract(5, this.f35985l);
        }
        if ((this.f35984l & 32) == 32) {
            c11522l.m3097abstract(6, this.f35992l);
        }
        for (int i = 0; i < this.f35988l.size(); i++) {
            c11522l.m3120public(7, (AbstractC14080l) this.f35988l.get(i));
        }
        if ((this.f35984l & 64) == 64) {
            c11522l.m3120public(8, this.f35994l);
        }
        c10023l.m2827for(200, c11522l);
        c11522l.m3129try(this.f35987l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f35983l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f35984l & 1) == 1 ? C11522l.vip(1, this.f35990l) : 0;
        if ((this.f35984l & 2) == 2) {
            iVip += C11522l.vip(2, this.f35989l);
        }
        if ((this.f35984l & 4) == 4) {
            iVip += C11522l.startapp(3, this.f35993l);
        }
        if ((this.f35984l & 16) == 16) {
            iVip += C11522l.startapp(4, this.f35986l);
        }
        if ((this.f35984l & 8) == 8) {
            iVip += C11522l.vip(5, this.f35985l);
        }
        if ((this.f35984l & 32) == 32) {
            iVip += C11522l.vip(6, this.f35992l);
        }
        for (int i2 = 0; i2 < this.f35988l.size(); i2++) {
            iVip += C11522l.startapp(7, (AbstractC14080l) this.f35988l.get(i2));
        }
        if ((this.f35984l & 64) == 64) {
            iVip += C11522l.startapp(8, this.f35994l);
        }
        int size = this.f35987l.size() + isPro() + iVip;
        this.f35983l = size;
        return size;
    }

    @Override // defpackage.InterfaceC8988l
    public final AbstractC14080l loadAd() {
        return f35982l;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C9259l c9259lSubs = C9259l.subs();
        c9259lSubs.isPro(this);
        return c9259lSubs;
    }

    public final C9259l startapp() {
        C9259l c9259lSubs = C9259l.subs();
        c9259lSubs.isPro(this);
        return c9259lSubs;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f35991l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f35984l;
        if ((i & 2) != 2) {
            this.f35991l = (byte) 0;
            return false;
        }
        if ((i & 4) == 4 && !this.f35993l.yandex()) {
            this.f35991l = (byte) 0;
            return false;
        }
        if ((this.f35984l & 16) == 16 && !this.f35986l.yandex()) {
            this.f35991l = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f35988l.size(); i2++) {
            if (!((C7899l) this.f35988l.get(i2)).yandex()) {
                this.f35991l = (byte) 0;
                return false;
            }
        }
        if ((this.f35984l & 64) == 64 && !this.f35994l.yandex()) {
            this.f35991l = (byte) 0;
            return false;
        }
        if (subs()) {
            this.f35991l = (byte) 1;
            return true;
        }
        this.f35991l = (byte) 0;
        return false;
    }

    public C18426l() {
        this.f35991l = (byte) -1;
        this.f35983l = -1;
        this.f35987l = AbstractC7735l.f16231l;
    }

    public C18426l(C9259l c9259l) {
        super(c9259l);
        this.f35991l = (byte) -1;
        this.f35983l = -1;
        this.f35987l = c9259l.f5168l;
    }
}
