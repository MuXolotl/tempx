package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lؚؒۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1339l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C1339l f3429l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C2630l f3430l = new C2630l(29);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte f3431l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public List f3432l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f3433l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f3434l;

    static {
        C1339l c1339l = new C1339l();
        f3429l = c1339l;
        c1339l.f3432l = Collections.EMPTY_LIST;
    }

    public C1339l(C1718l c1718l, C3429l c3429l) {
        this.f3431l = (byte) -1;
        this.f3434l = -1;
        this.f3432l = Collections.EMPTY_LIST;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iMetrica = c1718l.metrica();
                    if (iMetrica != 0) {
                        if (iMetrica == 10) {
                            if (!z2) {
                                this.f3432l = new ArrayList();
                                z2 = true;
                            }
                            this.f3432l.add(c1718l.admob(C3617l.f7539l, c3429l));
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
                if (z2) {
                    this.f3432l = DesugarCollections.unmodifiableList(this.f3432l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f3433l = c6769l.mopub();
                }
                throw th;
            }
        }
        if (z2) {
            this.f3432l = DesugarCollections.unmodifiableList(this.f3432l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f3433l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        C3730l c3730l = new C3730l(2);
        c3730l.f7796l = Collections.EMPTY_LIST;
        return c3730l;
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        for (int i = 0; i < this.f3432l.size(); i++) {
            c11522l.m3120public(1, (AbstractC14080l) this.f3432l.get(i));
        }
        c11522l.m3129try(this.f3433l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f3434l;
        if (i != -1) {
            return i;
        }
        int iStartapp = 0;
        for (int i2 = 0; i2 < this.f3432l.size(); i2++) {
            iStartapp += C11522l.startapp(1, (AbstractC14080l) this.f3432l.get(i2));
        }
        int size = this.f3433l.size() + iStartapp;
        this.f3434l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C3730l c3730l = new C3730l(2);
        c3730l.f7796l = Collections.EMPTY_LIST;
        c3730l.vip(this);
        return c3730l;
    }

    public final C3730l subs() {
        C3730l c3730l = new C3730l(2);
        c3730l.f7796l = Collections.EMPTY_LIST;
        c3730l.vip(this);
        return c3730l;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        if (this.f3431l == 1) {
            return true;
        }
        this.f3431l = (byte) 1;
        return true;
    }

    public C1339l() {
        this.f3431l = (byte) -1;
        this.f3434l = -1;
        this.f3433l = AbstractC7735l.f16231l;
    }

    public C1339l(C3730l c3730l) {
        this.f3431l = (byte) -1;
        this.f3434l = -1;
        this.f3433l = c3730l.f5168l;
    }
}
