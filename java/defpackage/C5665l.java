package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؘٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5665l extends AbstractC2597l {

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C2630l f12044l = new C2630l(16);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C5665l f12045l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f12046l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C3647l f12047l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C1339l f12048l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7735l f12049l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f12050l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f12051l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f12052l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public byte f12053l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public List f12054l;

    static {
        C5665l c5665l = new C5665l();
        f12045l = c5665l;
        List list = Collections.EMPTY_LIST;
        c5665l.f12052l = list;
        c5665l.f12051l = list;
        c5665l.f12054l = list;
        c5665l.f12047l = C3647l.f7625l;
        c5665l.f12048l = C1339l.f3429l;
    }

    public C5665l(C1718l c1718l, C3429l c3429l) {
        this.f12053l = (byte) -1;
        this.f12050l = -1;
        List list = Collections.EMPTY_LIST;
        this.f12052l = list;
        this.f12051l = list;
        this.f12054l = list;
        this.f12047l = C3647l.f7625l;
        this.f12048l = C1339l.f3429l;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = 2;
            if (z) {
                break;
            }
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        if (iMetrica == 26) {
                            int i3 = (i == true ? 1 : 0) & 1;
                            i = i;
                            if (i3 != 1) {
                                this.f12052l = new ArrayList();
                                i = (i == true ? 1 : 0) | 1;
                            }
                            this.f12052l.add(c1718l.admob(C14036l.f27355l, c3429l));
                        } else if (iMetrica == 34) {
                            int i4 = (i == true ? 1 : 0) & 2;
                            i = i;
                            if (i4 != 2) {
                                this.f12051l = new ArrayList();
                                i = (i == true ? 1 : 0) | 2;
                            }
                            this.f12051l.add(c1718l.admob(C13146l.f25712l, c3429l));
                        } else if (iMetrica != 42) {
                            C3730l c3730l = null;
                            C10657l c10657lSubs = null;
                            if (iMetrica == 242) {
                                if ((this.f12046l & 1) == 1) {
                                    C3647l c3647l = this.f12047l;
                                    c3647l.getClass();
                                    c10657lSubs = C3647l.subs(c3647l);
                                }
                                C3647l c3647l2 = (C3647l) c1718l.admob(C3647l.f7626l, c3429l);
                                this.f12047l = c3647l2;
                                if (c10657lSubs != null) {
                                    c10657lSubs.firebase(c3647l2);
                                    this.f12047l = c10657lSubs.admob();
                                }
                                this.f12046l |= 1;
                            } else if (iMetrica == 258) {
                                if ((this.f12046l & 2) == 2) {
                                    C1339l c1339l = this.f12048l;
                                    c1339l.getClass();
                                    c3730l = new C3730l(i2);
                                    c3730l.f7796l = Collections.EMPTY_LIST;
                                    c3730l.vip(c1339l);
                                }
                                C1339l c1339l2 = (C1339l) c1718l.admob(C1339l.f3430l, c3429l);
                                this.f12048l = c1339l2;
                                if (c3730l != null) {
                                    c3730l.vip(c1339l2);
                                    this.f12048l = c3730l.isPro();
                                }
                                this.f12046l |= 2;
                            } else if (!vip(c1718l, c11522lM3096volatile, c3429l, iMetrica)) {
                            }
                        } else {
                            int i5 = (i == true ? 1 : 0) & 4;
                            i = i;
                            if (i5 != 4) {
                                this.f12054l = new ArrayList();
                                i = (i == true ? 1 : 0) | 4;
                            }
                            this.f12054l.add(c1718l.admob(C1512l.f3767l, c3429l));
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
                if (((i == true ? 1 : 0) & 1) == 1) {
                    this.f12052l = DesugarCollections.unmodifiableList(this.f12052l);
                }
                if (((i == true ? 1 : 0) & 2) == 2) {
                    this.f12051l = DesugarCollections.unmodifiableList(this.f12051l);
                }
                if (((i == true ? 1 : 0) & 4) == 4) {
                    this.f12054l = DesugarCollections.unmodifiableList(this.f12054l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f12049l = c6769l.mopub();
                }
                remoteconfig();
                throw th;
            }
        }
        if (((i == true ? 1 : 0) & 1) == 1) {
            this.f12052l = DesugarCollections.unmodifiableList(this.f12052l);
        }
        if (((i == true ? 1 : 0) & 2) == 2) {
            this.f12051l = DesugarCollections.unmodifiableList(this.f12051l);
        }
        if (((i == true ? 1 : 0) & 4) == 4) {
            this.f12054l = DesugarCollections.unmodifiableList(this.f12054l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f12049l = c6769l.mopub();
        }
        remoteconfig();
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C14643l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        C10023l c10023l = new C10023l(this);
        for (int i = 0; i < this.f12052l.size(); i++) {
            c11522l.m3120public(3, (AbstractC14080l) this.f12052l.get(i));
        }
        for (int i2 = 0; i2 < this.f12051l.size(); i2++) {
            c11522l.m3120public(4, (AbstractC14080l) this.f12051l.get(i2));
        }
        for (int i3 = 0; i3 < this.f12054l.size(); i3++) {
            c11522l.m3120public(5, (AbstractC14080l) this.f12054l.get(i3));
        }
        if ((this.f12046l & 1) == 1) {
            c11522l.m3120public(30, this.f12047l);
        }
        if ((this.f12046l & 2) == 2) {
            c11522l.m3120public(32, this.f12048l);
        }
        c10023l.m2827for(200, c11522l);
        c11522l.m3129try(this.f12049l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f12050l;
        if (i != -1) {
            return i;
        }
        int iStartapp = 0;
        for (int i2 = 0; i2 < this.f12052l.size(); i2++) {
            iStartapp += C11522l.startapp(3, (AbstractC14080l) this.f12052l.get(i2));
        }
        for (int i3 = 0; i3 < this.f12051l.size(); i3++) {
            iStartapp += C11522l.startapp(4, (AbstractC14080l) this.f12051l.get(i3));
        }
        for (int i4 = 0; i4 < this.f12054l.size(); i4++) {
            iStartapp += C11522l.startapp(5, (AbstractC14080l) this.f12054l.get(i4));
        }
        if ((this.f12046l & 1) == 1) {
            iStartapp += C11522l.startapp(30, this.f12047l);
        }
        if ((this.f12046l & 2) == 2) {
            iStartapp += C11522l.startapp(32, this.f12048l);
        }
        int size = this.f12049l.size() + isPro() + iStartapp;
        this.f12050l = size;
        return size;
    }

    @Override // defpackage.InterfaceC8988l
    public final AbstractC14080l loadAd() {
        return f12045l;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C14643l c14643lSubs = C14643l.subs();
        c14643lSubs.isPro(this);
        return c14643lSubs;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f12053l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f12052l.size(); i++) {
            if (!((C14036l) this.f12052l.get(i)).yandex()) {
                this.f12053l = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f12051l.size(); i2++) {
            if (!((C13146l) this.f12051l.get(i2)).yandex()) {
                this.f12053l = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f12054l.size(); i3++) {
            if (!((C1512l) this.f12054l.get(i3)).yandex()) {
                this.f12053l = (byte) 0;
                return false;
            }
        }
        if ((this.f12046l & 1) == 1 && !this.f12047l.yandex()) {
            this.f12053l = (byte) 0;
            return false;
        }
        if (subs()) {
            this.f12053l = (byte) 1;
            return true;
        }
        this.f12053l = (byte) 0;
        return false;
    }

    public C5665l() {
        this.f12053l = (byte) -1;
        this.f12050l = -1;
        this.f12049l = AbstractC7735l.f16231l;
    }

    public C5665l(C14643l c14643l) {
        super(c14643l);
        this.f12053l = (byte) -1;
        this.f12050l = -1;
        this.f12049l = c14643l.f5168l;
    }
}
