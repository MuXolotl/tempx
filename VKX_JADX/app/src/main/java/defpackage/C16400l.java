package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lٖٕؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16400l extends AbstractC2597l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C16400l f32091l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C2630l f32092l = new C2630l(13);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f32093l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f32094l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC7735l f32095l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public List f32096l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f32097l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte f32098l;

    static {
        C16400l c16400l = new C16400l();
        f32091l = c16400l;
        c16400l.f32097l = 0;
        c16400l.f32096l = Collections.EMPTY_LIST;
    }

    public C16400l(C1718l c1718l, C3429l c3429l) {
        this.f32098l = (byte) -1;
        this.f32094l = -1;
        boolean z = false;
        this.f32097l = 0;
        this.f32096l = Collections.EMPTY_LIST;
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
                                this.f32093l |= 1;
                                this.f32097l = c1718l.smaato();
                            } else if (iMetrica == 18) {
                                if ((c & 2) != 2) {
                                    this.f32096l = new ArrayList();
                                    c = 2;
                                }
                                this.f32096l.add(c1718l.admob(C7899l.f16471l, c3429l));
                            } else if (!vip(c1718l, c11522lM3096volatile, c3429l, iMetrica)) {
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
                    this.f32096l = DesugarCollections.unmodifiableList(this.f32096l);
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f32095l = c6769l.mopub();
                }
                remoteconfig();
                throw th;
            }
        }
        if ((c & 2) == 2) {
            this.f32096l = DesugarCollections.unmodifiableList(this.f32096l);
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f32095l = c6769l.mopub();
        }
        remoteconfig();
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        C10684l c10684l = new C10684l();
        c10684l.f21689l = Collections.EMPTY_LIST;
        return c10684l;
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        C10023l c10023l = new C10023l(this);
        if ((this.f32093l & 1) == 1) {
            c11522l.m3097abstract(1, this.f32097l);
        }
        for (int i = 0; i < this.f32096l.size(); i++) {
            c11522l.m3120public(2, (AbstractC14080l) this.f32096l.get(i));
        }
        c10023l.m2827for(200, c11522l);
        c11522l.m3129try(this.f32095l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f32094l;
        if (i != -1) {
            return i;
        }
        int iVip = (this.f32093l & 1) == 1 ? C11522l.vip(1, this.f32097l) : 0;
        for (int i2 = 0; i2 < this.f32096l.size(); i2++) {
            iVip += C11522l.startapp(2, (AbstractC14080l) this.f32096l.get(i2));
        }
        int size = this.f32095l.size() + isPro() + iVip;
        this.f32094l = size;
        return size;
    }

    @Override // defpackage.InterfaceC8988l
    public final AbstractC14080l loadAd() {
        return f32091l;
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C10684l c10684l = new C10684l();
        c10684l.f21689l = Collections.EMPTY_LIST;
        c10684l.subs(this);
        return c10684l;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        byte b = this.f32098l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f32096l.size(); i++) {
            if (!((C7899l) this.f32096l.get(i)).yandex()) {
                this.f32098l = (byte) 0;
                return false;
            }
        }
        if (subs()) {
            this.f32098l = (byte) 1;
            return true;
        }
        this.f32098l = (byte) 0;
        return false;
    }

    public C16400l() {
        this.f32098l = (byte) -1;
        this.f32094l = -1;
        this.f32095l = AbstractC7735l.f16231l;
    }

    public C16400l(C10684l c10684l) {
        super(c10684l);
        this.f32098l = (byte) -1;
        this.f32094l = -1;
        this.f32095l = c10684l.f5168l;
    }
}
