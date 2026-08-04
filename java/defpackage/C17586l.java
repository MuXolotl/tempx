package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l٘ؐؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17586l extends AbstractC2597l {

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C2630l f34234l = new C2630l(25);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C17586l f34235l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f34236l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f34237l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public EnumC1630l f34238l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public List f34239l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7735l f34240l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f34241l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f34242l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f34243l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public byte f34244l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f34245l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f34246l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public List f34247l;

    static {
        C17586l c17586l = new C17586l();
        f34235l = c17586l;
        c17586l.f34243l = 0;
        c17586l.f34242l = 0;
        c17586l.f34246l = false;
        c17586l.f34238l = EnumC1630l.INV;
        List list = Collections.EMPTY_LIST;
        c17586l.f34239l = list;
        c17586l.f34245l = list;
        c17586l.f34247l = list;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    public C17586l(C1718l c1718l, C3429l c3429l) {
        this.f34241l = -1;
        this.f34244l = (byte) -1;
        this.f34236l = -1;
        this.f34243l = 0;
        this.f34242l = 0;
        this.f34246l = false;
        EnumC1630l enumC1630l = EnumC1630l.INV;
        this.f34238l = enumC1630l;
        List list = Collections.EMPTY_LIST;
        this.f34239l = list;
        this.f34245l = list;
        this.f34247l = list;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iMetrica = c1718l.metrica();
                        if (iMetrica == 0) {
                            z = true;
                        } else if (iMetrica == 8) {
                            this.f34237l |= 1;
                            this.f34243l = c1718l.smaato();
                        } else if (iMetrica == 16) {
                            this.f34237l |= 2;
                            this.f34242l = c1718l.smaato();
                        } else if (iMetrica == 24) {
                            this.f34237l |= 4;
                            this.f34246l = c1718l.remoteconfig() != 0;
                        } else if (iMetrica == 32) {
                            int iSmaato = c1718l.smaato();
                            EnumC1630l enumC1630l2 = iSmaato != 0 ? iSmaato != 1 ? iSmaato != 2 ? null : enumC1630l : EnumC1630l.OUT : EnumC1630l.IN;
                            if (enumC1630l2 == null) {
                                c11522lM3096volatile.m3130while(iMetrica);
                                c11522lM3096volatile.m3130while(iSmaato);
                            } else {
                                this.f34237l |= 8;
                                this.f34238l = enumC1630l2;
                            }
                        } else if (iMetrica == 42) {
                            if ((i & 16) != 16) {
                                this.f34239l = new ArrayList();
                                i |= 16;
                            }
                            this.f34239l.add(c1718l.admob(C18128l.f35420l, c3429l));
                        } else if (iMetrica == 48) {
                            if ((i & 32) != 32) {
                                this.f34245l = new ArrayList();
                                i |= 32;
                            }
                            this.f34245l.add(Integer.valueOf(c1718l.smaato()));
                        } else if (iMetrica == 50) {
                            int iPurchase = c1718l.purchase(c1718l.smaato());
                            if ((i & 32) != 32 && c1718l.crashlytics() > 0) {
                                this.f34245l = new ArrayList();
                                i |= 32;
                            }
                            while (c1718l.crashlytics() > 0) {
                                this.f34245l.add(Integer.valueOf(c1718l.smaato()));
                            }
                            c1718l.amazon(iPurchase);
                        } else if (iMetrica == 802) {
                            if ((i & 64) != 64) {
                                this.f34247l = new ArrayList();
                                i |= 64;
                            }
                            this.f34247l.add(c1718l.admob(C7899l.f16471l, c3429l));
                        } else if (!vip(c1718l, c11522lM3096volatile, c3429l, iMetrica)) {
                            z = true;
                        }
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
                if ((i & 16) == 16) {
                    this.f34239l = DesugarCollections.unmodifiableList(this.f34239l);
                }
                if ((i & 32) == 32) {
                    this.f34245l = DesugarCollections.unmodifiableList(this.f34245l);
                }
                if ((i & 64) == 64) {
                    this.f34247l = DesugarCollections.unmodifiableList(this.f34247l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f34240l = c6769l.mopub();
                }
                remoteconfig();
                throw th;
            }
        }
        if ((i & 16) == 16) {
            this.f34239l = DesugarCollections.unmodifiableList(this.f34239l);
        }
        if ((i & 32) == 32) {
            this.f34245l = DesugarCollections.unmodifiableList(this.f34245l);
        }
        if ((i & 64) == 64) {
            this.f34247l = DesugarCollections.unmodifiableList(this.f34247l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f34240l = c6769l.mopub();
        }
        remoteconfig();
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C12678l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        C10023l c10023l = new C10023l(this);
        if ((this.f34237l & 1) == 1) {
            c11522l.m3097abstract(1, this.f34243l);
        }
        if ((this.f34237l & 2) == 2) {
            c11522l.m3097abstract(2, this.f34242l);
        }
        if ((this.f34237l & 4) == 4) {
            boolean z = this.f34246l;
            c11522l.m3102const(3, 0);
            c11522l.m3125this(z ? 1 : 0);
        }
        if ((this.f34237l & 8) == 8) {
            c11522l.m3112import(4, this.f34238l.f3962l);
        }
        for (int i = 0; i < this.f34239l.size(); i++) {
            c11522l.m3120public(5, (AbstractC14080l) this.f34239l.get(i));
        }
        if (this.f34245l.size() > 0) {
            c11522l.m3130while(50);
            c11522l.m3130while(this.f34241l);
        }
        for (int i2 = 0; i2 < this.f34245l.size(); i2++) {
            c11522l.m3113instanceof(((Integer) this.f34245l.get(i2)).intValue());
        }
        for (int i3 = 0; i3 < this.f34247l.size(); i3++) {
            c11522l.m3120public(100, (AbstractC14080l) this.f34247l.get(i3));
        }
        c10023l.m2827for(1000, c11522l);
        c11522l.m3129try(this.f34240l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        List list;
        int i = this.f34236l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f34237l & 1) == 1 ? C11522l.vip(1, this.f34243l) : 0;
        if ((this.f34237l & 2) == 2) {
            iVip += C11522l.vip(2, this.f34242l);
        }
        if ((this.f34237l & 4) == 4) {
            iVip += C11522l.tapsense(3) + 1;
        }
        if ((this.f34237l & 8) == 8) {
            iVip += C11522l.remoteconfig(4, this.f34238l.f3962l);
        }
        for (int i2 = 0; i2 < this.f34239l.size(); i2++) {
            iVip += C11522l.startapp(5, (AbstractC14080l) this.f34239l.get(i2));
        }
        int i3 = 0;
        int iMetrica = 0;
        while (true) {
            int size = this.f34245l.size();
            list = this.f34245l;
            if (i3 >= size) {
                break;
            }
            iMetrica += C11522l.metrica(((Integer) list.get(i3)).intValue());
            i3++;
        }
        int iStartapp = iVip + iMetrica;
        if (!list.isEmpty()) {
            iStartapp = iStartapp + 1 + C11522l.metrica(iMetrica);
        }
        this.f34241l = iMetrica;
        for (int i4 = 0; i4 < this.f34247l.size(); i4++) {
            iStartapp += C11522l.startapp(100, (AbstractC14080l) this.f34247l.get(i4));
        }
        int size2 = this.f34240l.size() + isPro() + iStartapp;
        this.f34236l = size2;
        return size2;
    }

    @Override // defpackage.InterfaceC8988l
    public final AbstractC14080l loadAd() {
        return f34235l;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C12678l c12678lSubs = C12678l.subs();
        c12678lSubs.isPro(this);
        return c12678lSubs;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f34244l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f34237l;
        if ((i & 1) != 1) {
            this.f34244l = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.f34244l = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f34239l.size(); i2++) {
            if (!((C18128l) this.f34239l.get(i2)).yandex()) {
                this.f34244l = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f34247l.size(); i3++) {
            if (!((C7899l) this.f34247l.get(i3)).yandex()) {
                this.f34244l = (byte) 0;
                return false;
            }
        }
        if (subs()) {
            this.f34244l = (byte) 1;
            return true;
        }
        this.f34244l = (byte) 0;
        return false;
    }

    public C17586l() {
        this.f34241l = -1;
        this.f34244l = (byte) -1;
        this.f34236l = -1;
        this.f34240l = AbstractC7735l.f16231l;
    }

    public C17586l(C12678l c12678l) {
        super(c12678l);
        this.f34241l = -1;
        this.f34244l = (byte) -1;
        this.f34236l = -1;
        this.f34240l = c12678l.f5168l;
    }
}
