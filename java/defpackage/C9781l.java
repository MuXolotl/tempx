package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٍۙؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9781l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C9781l f19938l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C2630l f19939l = new C2630l(12);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public EnumC6955l f19940l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public EnumC11623l f19941l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public byte f19942l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f19943l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f19944l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C18092l f19945l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f19946l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f19947l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public EnumC8359l f19948l;

    static {
        C9781l c9781l = new C9781l();
        f19938l = c9781l;
        c9781l.f19940l = EnumC6955l.RETURNS_CONSTANT;
        c9781l.f19946l = Collections.EMPTY_LIST;
        c9781l.f19945l = C18092l.f35377l;
        c9781l.f19948l = EnumC8359l.AT_MOST_ONCE;
        c9781l.f19941l = EnumC11623l.CONCLUSION_CONDITION;
    }

    public C9781l(C1718l c1718l, C3429l c3429l) {
        this.f19942l = (byte) -1;
        this.f19947l = -1;
        EnumC6955l enumC6955l = EnumC6955l.RETURNS_CONSTANT;
        this.f19940l = enumC6955l;
        this.f19946l = Collections.EMPTY_LIST;
        this.f19945l = C18092l.f35377l;
        EnumC8359l enumC8359l = EnumC8359l.AT_MOST_ONCE;
        this.f19948l = enumC8359l;
        EnumC11623l enumC11623l = EnumC11623l.CONCLUSION_CONDITION;
        this.f19941l = enumC11623l;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        EnumC11623l enumC11623l2 = null;
                        EnumC6955l enumC6955l2 = null;
                        C12063l c12063lAdmob = null;
                        EnumC8359l enumC8359l2 = null;
                        if (iMetrica == 8) {
                            int iSmaato = c1718l.smaato();
                            if (iSmaato == 0) {
                                enumC6955l2 = enumC6955l;
                            } else if (iSmaato == 1) {
                                enumC6955l2 = EnumC6955l.CALLS;
                            } else if (iSmaato == 2) {
                                enumC6955l2 = EnumC6955l.RETURNS_NOT_NULL;
                            }
                            if (enumC6955l2 == null) {
                                c11522lM3096volatile.m3130while(iMetrica);
                                c11522lM3096volatile.m3130while(iSmaato);
                            } else {
                                this.f19943l |= 1;
                                this.f19940l = enumC6955l2;
                            }
                        } else if (iMetrica == 18) {
                            int i = (c == true ? 1 : 0) & 2;
                            c = c;
                            if (i != 2) {
                                this.f19946l = new ArrayList();
                                c = 2;
                            }
                            this.f19946l.add(c1718l.admob(C18092l.f35376l, c3429l));
                        } else if (iMetrica == 26) {
                            if ((this.f19943l & 2) == 2) {
                                C18092l c18092l = this.f19945l;
                                c18092l.getClass();
                                c12063lAdmob = C12063l.admob();
                                c12063lAdmob.subs(c18092l);
                            }
                            C18092l c18092l2 = (C18092l) c1718l.admob(C18092l.f35376l, c3429l);
                            this.f19945l = c18092l2;
                            if (c12063lAdmob != null) {
                                c12063lAdmob.subs(c18092l2);
                                this.f19945l = c12063lAdmob.billing();
                            }
                            this.f19943l |= 2;
                        } else if (iMetrica == 32) {
                            int iSmaato2 = c1718l.smaato();
                            if (iSmaato2 == 0) {
                                enumC8359l2 = enumC8359l;
                            } else if (iSmaato2 == 1) {
                                enumC8359l2 = EnumC8359l.EXACTLY_ONCE;
                            } else if (iSmaato2 == 2) {
                                enumC8359l2 = EnumC8359l.AT_LEAST_ONCE;
                            }
                            if (enumC8359l2 == null) {
                                c11522lM3096volatile.m3130while(iMetrica);
                                c11522lM3096volatile.m3130while(iSmaato2);
                            } else {
                                this.f19943l |= 4;
                                this.f19948l = enumC8359l2;
                            }
                        } else if (iMetrica == 40) {
                            int iSmaato3 = c1718l.smaato();
                            if (iSmaato3 == 0) {
                                enumC11623l2 = enumC11623l;
                            } else if (iSmaato3 == 1) {
                                enumC11623l2 = EnumC11623l.RETURNS_CONDITION;
                            } else if (iSmaato3 == 2) {
                                enumC11623l2 = EnumC11623l.HOLDSIN_CONDITION;
                            }
                            if (enumC11623l2 == null) {
                                c11522lM3096volatile.m3130while(iMetrica);
                                c11522lM3096volatile.m3130while(iSmaato3);
                            } else {
                                this.f19943l |= 8;
                                this.f19941l = enumC11623l2;
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
                if (((c == true ? 1 : 0) & 2) == 2) {
                    this.f19946l = DesugarCollections.unmodifiableList(this.f19946l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f19944l = c6769l.mopub();
                }
                throw th;
            }
        }
        if (((c == true ? 1 : 0) & 2) == 2) {
            this.f19946l = DesugarCollections.unmodifiableList(this.f19946l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f19944l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C18463l.isPro();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f19943l & 1) == 1) {
            c11522l.m3112import(1, this.f19940l.f14591l);
        }
        for (int i = 0; i < this.f19946l.size(); i++) {
            c11522l.m3120public(2, (AbstractC14080l) this.f19946l.get(i));
        }
        if ((this.f19943l & 2) == 2) {
            c11522l.m3120public(3, this.f19945l);
        }
        if ((this.f19943l & 4) == 4) {
            c11522l.m3112import(4, this.f19948l.f17310l);
        }
        if ((this.f19943l & 8) == 8) {
            c11522l.m3112import(5, this.f19941l.f23346l);
        }
        c11522l.m3129try(this.f19944l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f19947l;
        if (i != -1) {
            return i;
        }
        int iRemoteconfig = (this.f19943l & 1) == 1 ? C11522l.remoteconfig(1, this.f19940l.f14591l) : 0;
        for (int i2 = 0; i2 < this.f19946l.size(); i2++) {
            iRemoteconfig += C11522l.startapp(2, (AbstractC14080l) this.f19946l.get(i2));
        }
        if ((this.f19943l & 2) == 2) {
            iRemoteconfig += C11522l.startapp(3, this.f19945l);
        }
        if ((this.f19943l & 4) == 4) {
            iRemoteconfig += C11522l.remoteconfig(4, this.f19948l.f17310l);
        }
        if ((this.f19943l & 8) == 8) {
            iRemoteconfig += C11522l.remoteconfig(5, this.f19941l.f23346l);
        }
        int size = this.f19944l.size() + iRemoteconfig;
        this.f19947l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C18463l c18463lIsPro = C18463l.isPro();
        c18463lIsPro.smaato(this);
        return c18463lIsPro;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f19942l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f19946l.size(); i++) {
            if (!((C18092l) this.f19946l.get(i)).yandex()) {
                this.f19942l = (byte) 0;
                return false;
            }
        }
        if ((this.f19943l & 2) != 2 || this.f19945l.yandex()) {
            this.f19942l = (byte) 1;
            return true;
        }
        this.f19942l = (byte) 0;
        return false;
    }

    public C9781l() {
        this.f19942l = (byte) -1;
        this.f19947l = -1;
        this.f19944l = AbstractC7735l.f16231l;
    }

    public C9781l(C18463l c18463l) {
        this.f19942l = (byte) -1;
        this.f19947l = -1;
        this.f19944l = c18463l.f5168l;
    }
}
