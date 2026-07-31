package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٕ٘ؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15743l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C15743l f30919l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C2630l f30920l = new C2630l(11);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte f30921l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public List f30922l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f30923l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f30924l;

    static {
        C15743l c15743l = new C15743l();
        f30919l = c15743l;
        c15743l.f30922l = Collections.EMPTY_LIST;
    }

    public C15743l(C1718l c1718l, C3429l c3429l) {
        this.f30921l = (byte) -1;
        this.f30924l = -1;
        this.f30922l = Collections.EMPTY_LIST;
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
                                this.f30922l = new ArrayList();
                                z2 = true;
                            }
                            this.f30922l.add(c1718l.admob(C9781l.f19939l, c3429l));
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
                    this.f30922l = DesugarCollections.unmodifiableList(this.f30922l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f30923l = c6769l.mopub();
                }
                throw th;
            }
        }
        if (z2) {
            this.f30922l = DesugarCollections.unmodifiableList(this.f30922l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f30923l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        C3730l c3730l = new C3730l(0);
        c3730l.f7796l = Collections.EMPTY_LIST;
        return c3730l;
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        for (int i = 0; i < this.f30922l.size(); i++) {
            c11522l.m3120public(1, (AbstractC14080l) this.f30922l.get(i));
        }
        c11522l.m3129try(this.f30923l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f30924l;
        if (i != -1) {
            return i;
        }
        int iStartapp = 0;
        for (int i2 = 0; i2 < this.f30922l.size(); i2++) {
            iStartapp += C11522l.startapp(1, (AbstractC14080l) this.f30922l.get(i2));
        }
        int size = this.f30923l.size() + iStartapp;
        this.f30924l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C3730l c3730l = new C3730l(0);
        c3730l.f7796l = Collections.EMPTY_LIST;
        c3730l.firebase(this);
        return c3730l;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f30921l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f30922l.size(); i++) {
            if (!((C9781l) this.f30922l.get(i)).yandex()) {
                this.f30921l = (byte) 0;
                return false;
            }
        }
        this.f30921l = (byte) 1;
        return true;
    }

    public C15743l() {
        this.f30921l = (byte) -1;
        this.f30924l = -1;
        this.f30923l = AbstractC7735l.f16231l;
    }

    public C15743l(C3730l c3730l) {
        this.f30921l = (byte) -1;
        this.f30924l = -1;
        this.f30923l = c3730l.f5168l;
    }
}
