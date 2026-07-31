package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lُؕؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3186l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C3186l f6843l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C2630l f6844l = new C2630l(3);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public List f6845l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public List f6846l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f6847l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte f6848l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f6849l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f6850l;

    static {
        C3186l c3186l = new C3186l();
        f6843l = c3186l;
        List list = Collections.EMPTY_LIST;
        c3186l.f6846l = list;
        c3186l.f6845l = list;
    }

    public C3186l(C1718l c1718l, C3429l c3429l) {
        this.f6849l = -1;
        this.f6848l = (byte) -1;
        this.f6850l = -1;
        List list = Collections.EMPTY_LIST;
        this.f6846l = list;
        this.f6845l = list;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iMetrica = c1718l.metrica();
                        if (iMetrica != 0) {
                            if (iMetrica == 10) {
                                if ((i & 1) != 1) {
                                    this.f6846l = new ArrayList();
                                    i |= 1;
                                }
                                this.f6846l.add(c1718l.admob(C8732l.f17965l, c3429l));
                            } else if (iMetrica == 40) {
                                if ((i & 2) != 2) {
                                    this.f6845l = new ArrayList();
                                    i |= 2;
                                }
                                this.f6845l.add(Integer.valueOf(c1718l.smaato()));
                            } else if (iMetrica == 42) {
                                int iPurchase = c1718l.purchase(c1718l.smaato());
                                if ((i & 2) != 2 && c1718l.crashlytics() > 0) {
                                    this.f6845l = new ArrayList();
                                    i |= 2;
                                }
                                while (c1718l.crashlytics() > 0) {
                                    this.f6845l.add(Integer.valueOf(c1718l.smaato()));
                                }
                                c1718l.amazon(iPurchase);
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
                if ((i & 1) == 1) {
                    this.f6846l = DesugarCollections.unmodifiableList(this.f6846l);
                }
                if ((i & 2) == 2) {
                    this.f6845l = DesugarCollections.unmodifiableList(this.f6845l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f6847l = c6769l.mopub();
                }
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.f6846l = DesugarCollections.unmodifiableList(this.f6846l);
        }
        if ((i & 2) == 2) {
            this.f6845l = DesugarCollections.unmodifiableList(this.f6845l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f6847l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        C2274l c2274l = new C2274l();
        List list = Collections.EMPTY_LIST;
        c2274l.f4962l = list;
        c2274l.f4964l = list;
        return c2274l;
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        for (int i = 0; i < this.f6846l.size(); i++) {
            c11522l.m3120public(1, (AbstractC14080l) this.f6846l.get(i));
        }
        if (this.f6845l.size() > 0) {
            c11522l.m3130while(42);
            c11522l.m3130while(this.f6849l);
        }
        for (int i2 = 0; i2 < this.f6845l.size(); i2++) {
            c11522l.m3113instanceof(((Integer) this.f6845l.get(i2)).intValue());
        }
        c11522l.m3129try(this.f6847l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        List list;
        int i = this.f6850l;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int iStartapp = 0;
        for (int i3 = 0; i3 < this.f6846l.size(); i3++) {
            iStartapp += C11522l.startapp(1, (AbstractC14080l) this.f6846l.get(i3));
        }
        int iMetrica = 0;
        while (true) {
            int size = this.f6845l.size();
            list = this.f6845l;
            if (i2 >= size) {
                break;
            }
            iMetrica += C11522l.metrica(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iMetrica2 = iStartapp + iMetrica;
        if (!list.isEmpty()) {
            iMetrica2 = iMetrica2 + 1 + C11522l.metrica(iMetrica);
        }
        this.f6849l = iMetrica;
        int size2 = this.f6847l.size() + iMetrica2;
        this.f6850l = size2;
        return size2;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C2274l c2274l = new C2274l();
        List list = Collections.EMPTY_LIST;
        c2274l.f4962l = list;
        c2274l.f4964l = list;
        c2274l.admob(this);
        return c2274l;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        if (this.f6848l == 1) {
            return true;
        }
        this.f6848l = (byte) 1;
        return true;
    }

    public C3186l() {
        this.f6849l = -1;
        this.f6848l = (byte) -1;
        this.f6850l = -1;
        this.f6847l = AbstractC7735l.f16231l;
    }

    public C3186l(C2274l c2274l) {
        this.f6849l = -1;
        this.f6848l = (byte) -1;
        this.f6850l = -1;
        this.f6847l = c2274l.f5168l;
    }
}
