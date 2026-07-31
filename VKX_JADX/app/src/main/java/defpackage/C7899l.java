package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lًٍۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7899l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C7899l f16470l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C2630l f16471l = new C2630l(5);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f16472l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f16473l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f16474l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public byte f16475l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public List f16476l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f16477l;

    static {
        C7899l c7899l = new C7899l();
        f16470l = c7899l;
        c7899l.f16472l = 0;
        c7899l.f16476l = Collections.EMPTY_LIST;
    }

    public C7899l(C1718l c1718l, C3429l c3429l) {
        this.f16475l = (byte) -1;
        this.f16477l = -1;
        boolean z = false;
        this.f16472l = 0;
        this.f16476l = Collections.EMPTY_LIST;
        C6769l c6769l = new C6769l();
        C11522l c11522lM3096volatile = C11522l.m3096volatile(c6769l, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    try {
                        int iMetrica = c1718l.metrica();
                        if (iMetrica != 0) {
                            if (iMetrica == 8) {
                                this.f16473l |= 1;
                                this.f16472l = c1718l.smaato();
                            } else if (iMetrica == 18) {
                                if ((c & 2) != 2) {
                                    this.f16476l = new ArrayList();
                                    c = 2;
                                }
                                this.f16476l.add(c1718l.admob(C14780l.f28898l, c3429l));
                            } else if (!c1718l.ads(iMetrica, c11522lM3096volatile)) {
                            }
                        }
                        z = true;
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
                if ((c & 2) == 2) {
                    this.f16476l = DesugarCollections.unmodifiableList(this.f16476l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f16474l = c6769l.mopub();
                }
                throw th;
            }
        }
        if ((c & 2) == 2) {
            this.f16476l = DesugarCollections.unmodifiableList(this.f16476l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f16474l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        C10657l c10657l = new C10657l(0);
        c10657l.f21625l = Collections.EMPTY_LIST;
        return c10657l;
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        if ((this.f16473l & 1) == 1) {
            c11522l.m3097abstract(1, this.f16472l);
        }
        for (int i = 0; i < this.f16476l.size(); i++) {
            c11522l.m3120public(2, (AbstractC14080l) this.f16476l.get(i));
        }
        c11522l.m3129try(this.f16474l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f16477l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f16473l & 1) == 1 ? C11522l.vip(1, this.f16472l) : 0;
        for (int i2 = 0; i2 < this.f16476l.size(); i2++) {
            iVip += C11522l.startapp(2, (AbstractC14080l) this.f16476l.get(i2));
        }
        int size = this.f16474l.size() + iVip;
        this.f16477l = size;
        return size;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C10657l c10657l = new C10657l(0);
        c10657l.f21625l = Collections.EMPTY_LIST;
        c10657l.isPro(this);
        return c10657l;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f16475l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f16473l & 1) != 1) {
            this.f16475l = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f16476l.size(); i++) {
            if (!((C14780l) this.f16476l.get(i)).yandex()) {
                this.f16475l = (byte) 0;
                return false;
            }
        }
        this.f16475l = (byte) 1;
        return true;
    }

    public C7899l() {
        this.f16475l = (byte) -1;
        this.f16477l = -1;
        this.f16474l = AbstractC7735l.f16231l;
    }

    public C7899l(C10657l c10657l) {
        this.f16475l = (byte) -1;
        this.f16477l = -1;
        this.f16474l = c10657l.f5168l;
    }
}
