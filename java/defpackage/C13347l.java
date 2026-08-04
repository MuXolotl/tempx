package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lْْۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13347l extends AbstractC2597l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C2630l f26199l = new C2630l(10);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C13347l f26200l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f26201l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f26202l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public List f26203l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7735l f26204l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f26205l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f26206l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f26207l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public byte f26208l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public List f26209l;

    static {
        C13347l c13347l = new C13347l();
        f26200l = c13347l;
        c13347l.f26207l = 6;
        List list = Collections.EMPTY_LIST;
        c13347l.f26206l = list;
        c13347l.f26209l = list;
        c13347l.f26202l = list;
        c13347l.f26203l = list;
    }

    public C13347l(C1718l c1718l, C3429l c3429l) {
        this.f26208l = (byte) -1;
        this.f26205l = -1;
        this.f26207l = 6;
        List list = Collections.EMPTY_LIST;
        this.f26206l = list;
        this.f26209l = list;
        this.f26202l = list;
        this.f26203l = list;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        if (iMetrica == 8) {
                            this.f26201l |= 1;
                            this.f26207l = c1718l.smaato();
                        } else if (iMetrica == 18) {
                            if ((i & 2) != 2) {
                                this.f26206l = new ArrayList();
                                i |= 2;
                            }
                            this.f26206l.add(c1718l.admob(C18426l.f35981l, c3429l));
                        } else if (iMetrica == 26) {
                            if ((i & 16) != 16) {
                                this.f26203l = new ArrayList();
                                i |= 16;
                            }
                            this.f26203l.add(c1718l.admob(C7899l.f16471l, c3429l));
                        } else if (iMetrica == 248) {
                            if ((i & 4) != 4) {
                                this.f26209l = new ArrayList();
                                i |= 4;
                            }
                            this.f26209l.add(Integer.valueOf(c1718l.smaato()));
                        } else if (iMetrica == 250) {
                            int iPurchase = c1718l.purchase(c1718l.smaato());
                            if ((i & 4) != 4 && c1718l.crashlytics() > 0) {
                                this.f26209l = new ArrayList();
                                i |= 4;
                            }
                            while (c1718l.crashlytics() > 0) {
                                this.f26209l.add(Integer.valueOf(c1718l.smaato()));
                            }
                            c1718l.amazon(iPurchase);
                        } else if (iMetrica == 258) {
                            if ((i & 8) != 8) {
                                this.f26202l = new ArrayList();
                                i |= 8;
                            }
                            this.f26202l.add(c1718l.admob(C4987l.f10218l, c3429l));
                        } else if (!vip(c1718l, c11522lM3096volatile, c3429l, iMetrica)) {
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
                if ((i & 2) == 2) {
                    this.f26206l = DesugarCollections.unmodifiableList(this.f26206l);
                }
                if ((i & 16) == 16) {
                    this.f26203l = DesugarCollections.unmodifiableList(this.f26203l);
                }
                if ((i & 4) == 4) {
                    this.f26209l = DesugarCollections.unmodifiableList(this.f26209l);
                }
                if ((i & 8) == 8) {
                    this.f26202l = DesugarCollections.unmodifiableList(this.f26202l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f26204l = c6769l.mopub();
                }
                remoteconfig();
                throw th;
            }
        }
        if ((i & 2) == 2) {
            this.f26206l = DesugarCollections.unmodifiableList(this.f26206l);
        }
        if ((i & 16) == 16) {
            this.f26203l = DesugarCollections.unmodifiableList(this.f26203l);
        }
        if ((i & 4) == 4) {
            this.f26209l = DesugarCollections.unmodifiableList(this.f26209l);
        }
        if ((i & 8) == 8) {
            this.f26202l = DesugarCollections.unmodifiableList(this.f26202l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f26204l = c6769l.mopub();
        }
        remoteconfig();
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C12453l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        C10023l c10023l = new C10023l(this);
        if ((this.f26201l & 1) == 1) {
            c11522l.m3097abstract(1, this.f26207l);
        }
        for (int i = 0; i < this.f26206l.size(); i++) {
            c11522l.m3120public(2, (AbstractC14080l) this.f26206l.get(i));
        }
        for (int i2 = 0; i2 < this.f26203l.size(); i2++) {
            c11522l.m3120public(3, (AbstractC14080l) this.f26203l.get(i2));
        }
        for (int i3 = 0; i3 < this.f26209l.size(); i3++) {
            c11522l.m3097abstract(31, ((Integer) this.f26209l.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.f26202l.size(); i4++) {
            c11522l.m3120public(32, (AbstractC14080l) this.f26202l.get(i4));
        }
        c10023l.m2827for(19000, c11522l);
        c11522l.m3129try(this.f26204l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        List list;
        int i = this.f26205l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f26201l & 1) == 1 ? C11522l.vip(1, this.f26207l) : 0;
        for (int i2 = 0; i2 < this.f26206l.size(); i2++) {
            iVip += C11522l.startapp(2, (AbstractC14080l) this.f26206l.get(i2));
        }
        for (int i3 = 0; i3 < this.f26203l.size(); i3++) {
            iVip += C11522l.startapp(3, (AbstractC14080l) this.f26203l.get(i3));
        }
        int i4 = 0;
        int iMetrica = 0;
        while (true) {
            int size = this.f26209l.size();
            list = this.f26209l;
            if (i4 >= size) {
                break;
            }
            iMetrica += C11522l.metrica(((Integer) list.get(i4)).intValue());
            i4++;
        }
        int size2 = (list.size() * 2) + iVip + iMetrica;
        for (int i5 = 0; i5 < this.f26202l.size(); i5++) {
            size2 += C11522l.startapp(32, (AbstractC14080l) this.f26202l.get(i5));
        }
        int size3 = this.f26204l.size() + isPro() + size2;
        this.f26205l = size3;
        return size3;
    }

    @Override // defpackage.InterfaceC8988l
    public final AbstractC14080l loadAd() {
        return f26200l;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C12453l c12453lSubs = C12453l.subs();
        c12453lSubs.isPro(this);
        return c12453lSubs;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f26208l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f26206l.size(); i++) {
            if (!((C18426l) this.f26206l.get(i)).yandex()) {
                this.f26208l = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f26202l.size(); i2++) {
            if (!((C4987l) this.f26202l.get(i2)).yandex()) {
                this.f26208l = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f26203l.size(); i3++) {
            if (!((C7899l) this.f26203l.get(i3)).yandex()) {
                this.f26208l = (byte) 0;
                return false;
            }
        }
        if (subs()) {
            this.f26208l = (byte) 1;
            return true;
        }
        this.f26208l = (byte) 0;
        return false;
    }

    public C13347l() {
        this.f26208l = (byte) -1;
        this.f26205l = -1;
        this.f26204l = AbstractC7735l.f16231l;
    }

    public C13347l(C12453l c12453l) {
        super(c12453l);
        this.f26208l = (byte) -1;
        this.f26205l = -1;
        this.f26204l = c12453l.f5168l;
    }
}
