package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٌّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8732l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C8732l f17964l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C2630l f17965l = new C2630l(4);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f17966l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public List f17967l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f17968l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f17969l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f17970l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f17971l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f17972l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f17973l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f17974l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public List f17975l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public EnumC8965l f17976l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public byte f17977l;

    static {
        C8732l c8732l = new C8732l();
        f17964l = c8732l;
        c8732l.f17966l = 1;
        c8732l.f17973l = 0;
        c8732l.f17972l = "";
        c8732l.f17976l = EnumC8965l.NONE;
        List list = Collections.EMPTY_LIST;
        c8732l.f17967l = list;
        c8732l.f17975l = list;
    }

    public C8732l(C1718l c1718l) {
        this.f17968l = -1;
        this.f17971l = -1;
        this.f17977l = (byte) -1;
        this.f17974l = -1;
        this.f17966l = 1;
        boolean z = false;
        this.f17973l = 0;
        this.f17972l = "";
        EnumC8965l enumC8965l = EnumC8965l.NONE;
        this.f17976l = enumC8965l;
        List list = Collections.EMPTY_LIST;
        this.f17967l = list;
        this.f17975l = list;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        if (iMetrica == 8) {
                            this.f17969l |= 1;
                            this.f17966l = c1718l.smaato();
                        } else if (iMetrica == 16) {
                            this.f17969l |= 2;
                            this.f17973l = c1718l.smaato();
                        } else if (iMetrica == 24) {
                            int iSmaato = c1718l.smaato();
                            EnumC8965l enumC8965l2 = iSmaato != 0 ? iSmaato != 1 ? iSmaato != 2 ? null : EnumC8965l.DESC_TO_CLASS_ID : EnumC8965l.INTERNAL_TO_CLASS_ID : enumC8965l;
                            if (enumC8965l2 == null) {
                                c11522lM3096volatile.m3130while(iMetrica);
                                c11522lM3096volatile.m3130while(iSmaato);
                            } else {
                                this.f17969l |= 8;
                                this.f17976l = enumC8965l2;
                            }
                        } else if (iMetrica == 32) {
                            if ((i & 16) != 16) {
                                this.f17967l = new ArrayList();
                                i |= 16;
                            }
                            this.f17967l.add(Integer.valueOf(c1718l.smaato()));
                        } else if (iMetrica == 34) {
                            int iPurchase = c1718l.purchase(c1718l.smaato());
                            if ((i & 16) != 16 && c1718l.crashlytics() > 0) {
                                this.f17967l = new ArrayList();
                                i |= 16;
                            }
                            while (c1718l.crashlytics() > 0) {
                                this.f17967l.add(Integer.valueOf(c1718l.smaato()));
                            }
                            c1718l.amazon(iPurchase);
                        } else if (iMetrica == 40) {
                            if ((i & 32) != 32) {
                                this.f17975l = new ArrayList();
                                i |= 32;
                            }
                            this.f17975l.add(Integer.valueOf(c1718l.smaato()));
                        } else if (iMetrica == 42) {
                            int iPurchase2 = c1718l.purchase(c1718l.smaato());
                            if ((i & 32) != 32 && c1718l.crashlytics() > 0) {
                                this.f17975l = new ArrayList();
                                i |= 32;
                            }
                            while (c1718l.crashlytics() > 0) {
                                this.f17975l.add(Integer.valueOf(c1718l.smaato()));
                            }
                            c1718l.amazon(iPurchase2);
                        } else if (iMetrica == 50) {
                            C7362l c7362lBilling = c1718l.billing();
                            this.f17969l |= 4;
                            this.f17972l = c7362lBilling;
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
                if ((i & 16) == 16) {
                    this.f17967l = DesugarCollections.unmodifiableList(this.f17967l);
                }
                if ((i & 32) == 32) {
                    this.f17975l = DesugarCollections.unmodifiableList(this.f17975l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f17970l = c6769l.mopub();
                }
                throw th;
            }
        }
        if ((i & 16) == 16) {
            this.f17967l = DesugarCollections.unmodifiableList(this.f17967l);
        }
        if ((i & 32) == 32) {
            this.f17975l = DesugarCollections.unmodifiableList(this.f17975l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f17970l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C3969l.admob();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        AbstractC7735l c7362l;
        crashlytics();
        if ((this.f17969l & 1) == 1) {
            c11522l.m3097abstract(1, this.f17966l);
        }
        if ((this.f17969l & 2) == 2) {
            c11522l.m3097abstract(2, this.f17973l);
        }
        if ((this.f17969l & 8) == 8) {
            c11522l.m3112import(3, this.f17976l.f18491l);
        }
        if (this.f17967l.size() > 0) {
            c11522l.m3130while(34);
            c11522l.m3130while(this.f17968l);
        }
        for (int i = 0; i < this.f17967l.size(); i++) {
            c11522l.m3113instanceof(((Integer) this.f17967l.get(i)).intValue());
        }
        if (this.f17975l.size() > 0) {
            c11522l.m3130while(42);
            c11522l.m3130while(this.f17971l);
        }
        for (int i2 = 0; i2 < this.f17975l.size(); i2++) {
            c11522l.m3113instanceof(((Integer) this.f17975l.get(i2)).intValue());
        }
        if ((this.f17969l & 4) == 4) {
            Object obj = this.f17972l;
            if (obj instanceof String) {
                try {
                    c7362l = new C7362l(((String) obj).getBytes("UTF-8"));
                    this.f17972l = c7362l;
                } catch (UnsupportedEncodingException e) {
                    C18073l.Signature("UTF-8 not supported?", e);
                    return;
                }
            } else {
                c7362l = (AbstractC7735l) obj;
            }
            c11522l.m3102const(6, 2);
            c11522l.m3130while(c7362l.size());
            c11522l.m3129try(c7362l);
        }
        c11522l.m3129try(this.f17970l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        List list;
        List list2;
        AbstractC7735l c7362l;
        int i = this.f17974l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f17969l & 1) == 1 ? C11522l.vip(1, this.f17966l) : 0;
        if ((this.f17969l & 2) == 2) {
            iVip += C11522l.vip(2, this.f17973l);
        }
        if ((this.f17969l & 8) == 8) {
            iVip += C11522l.remoteconfig(3, this.f17976l.f18491l);
        }
        int i2 = 0;
        int iMetrica = 0;
        while (true) {
            int size = this.f17967l.size();
            list = this.f17967l;
            if (i2 >= size) {
                break;
            }
            iMetrica += C11522l.metrica(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int iMetrica2 = iVip + iMetrica;
        if (!list.isEmpty()) {
            iMetrica2 = iMetrica2 + 1 + C11522l.metrica(iMetrica);
        }
        this.f17968l = iMetrica;
        int i3 = 0;
        int iMetrica3 = 0;
        while (true) {
            int size2 = this.f17975l.size();
            list2 = this.f17975l;
            if (i3 >= size2) {
                break;
            }
            iMetrica3 += C11522l.metrica(((Integer) list2.get(i3)).intValue());
            i3++;
        }
        int size3 = iMetrica2 + iMetrica3;
        if (!list2.isEmpty()) {
            size3 = size3 + 1 + C11522l.metrica(iMetrica3);
        }
        this.f17971l = iMetrica3;
        if ((this.f17969l & 4) == 4) {
            Object obj = this.f17972l;
            if (obj instanceof String) {
                try {
                    c7362l = new C7362l(((String) obj).getBytes("UTF-8"));
                    this.f17972l = c7362l;
                } catch (UnsupportedEncodingException e) {
                    C18073l.Signature("UTF-8 not supported?", e);
                    return 0;
                }
            } else {
                c7362l = (AbstractC7735l) obj;
            }
            size3 += c7362l.size() + C11522l.ads(c7362l.size()) + C11522l.tapsense(6);
        }
        int size4 = this.f17970l.size() + size3;
        this.f17974l = size4;
        return size4;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C3969l c3969lAdmob = C3969l.admob();
        c3969lAdmob.subs(this);
        return c3969lAdmob;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        if (this.f17977l == 1) {
            return true;
        }
        this.f17977l = (byte) 1;
        return true;
    }

    public C8732l() {
        this.f17968l = -1;
        this.f17971l = -1;
        this.f17977l = (byte) -1;
        this.f17974l = -1;
        this.f17970l = AbstractC7735l.f16231l;
    }

    public C8732l(C3969l c3969l) {
        this.f17968l = -1;
        this.f17971l = -1;
        this.f17977l = (byte) -1;
        this.f17974l = -1;
        this.f17970l = c3969l.f5168l;
    }
}
