package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؕۛۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3647l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C3647l f7625l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C2630l f7626l = new C2630l(26);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public List f7627l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f7628l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f7629l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte f7630l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f7631l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f7632l;

    static {
        C3647l c3647l = new C3647l();
        f7625l = c3647l;
        c3647l.f7627l = Collections.EMPTY_LIST;
        c3647l.f7631l = -1;
    }

    public C3647l(C1718l c1718l, C3429l c3429l) {
        this.f7630l = (byte) -1;
        this.f7632l = -1;
        this.f7627l = Collections.EMPTY_LIST;
        this.f7631l = -1;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iMetrica = c1718l.metrica();
                        if (iMetrica != 0) {
                            if (iMetrica == 10) {
                                if (!z2) {
                                    this.f7627l = new ArrayList();
                                    z2 = true;
                                }
                                this.f7627l.add(c1718l.admob(C18128l.f35420l, c3429l));
                            } else if (iMetrica == 16) {
                                this.f7628l |= 1;
                                this.f7631l = c1718l.smaato();
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
                if (z2) {
                    this.f7627l = DesugarCollections.unmodifiableList(this.f7627l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f7629l = c6769l.mopub();
                }
                throw th;
            }
        }
        if (z2) {
            this.f7627l = DesugarCollections.unmodifiableList(this.f7627l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f7629l = c6769l.mopub();
        }
    }

    public static C10657l subs(C3647l c3647l) {
        C10657l c10657lSubs = C10657l.subs();
        c10657lSubs.firebase(c3647l);
        return c10657lSubs;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        return C10657l.subs();
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        for (int i = 0; i < this.f7627l.size(); i++) {
            c11522l.m3120public(1, (AbstractC14080l) this.f7627l.get(i));
        }
        if ((this.f7628l & 1) == 1) {
            c11522l.m3097abstract(2, this.f7631l);
        }
        c11522l.m3129try(this.f7629l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f7632l;
        if (i != -1) {
            return i;
        }
        int iVip = 0;
        for (int i2 = 0; i2 < this.f7627l.size(); i2++) {
            iVip += C11522l.startapp(1, (AbstractC14080l) this.f7627l.get(i2));
        }
        if ((this.f7628l & 1) == 1) {
            iVip += C11522l.vip(2, this.f7631l);
        }
        int size = this.f7629l.size() + iVip;
        this.f7632l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        return subs(this);
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f7630l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f7627l.size(); i++) {
            if (!((C18128l) this.f7627l.get(i)).yandex()) {
                this.f7630l = (byte) 0;
                return false;
            }
        }
        this.f7630l = (byte) 1;
        return true;
    }

    public C3647l() {
        this.f7630l = (byte) -1;
        this.f7632l = -1;
        this.f7629l = AbstractC7735l.f16231l;
    }

    public C3647l(C10657l c10657l) {
        this.f7630l = (byte) -1;
        this.f7632l = -1;
        this.f7629l = c10657l.f5168l;
    }
}
