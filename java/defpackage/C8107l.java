package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lًٛؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8107l extends AbstractC4730l implements InterfaceC8988l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C8107l f16892l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C2630l f16893l = new C2630l(21);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public byte f16894l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC5258l f16895l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC7735l f16896l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f16897l;

    static {
        C8107l c8107l = new C8107l();
        f16892l = c8107l;
        c8107l.f16895l = C7088l.f14852l;
    }

    public C8107l(C1718l c1718l) {
        this.f16894l = (byte) -1;
        this.f16897l = -1;
        this.f16895l = C7088l.f14852l;
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
                            C7362l c7362lBilling = c1718l.billing();
                            if (!z2) {
                                this.f16895l = new C7088l();
                                z2 = true;
                            }
                            this.f16895l.subscription(c7362lBilling);
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
                    this.f16895l = this.f16895l.adcel();
                }
                try {
                    c11522lM3096volatile.m3104default();
                } catch (IOException unused) {
                } finally {
                    this.f16896l = c6769l.mopub();
                }
                throw th;
            }
        }
        if (z2) {
            this.f16895l = this.f16895l.adcel();
        }
        try {
            c11522lM3096volatile.m3104default();
        } catch (IOException unused2) {
        } finally {
            this.f16896l = c6769l.mopub();
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l amazon() {
        C3730l c3730l = new C3730l(3);
        c3730l.f7796l = C7088l.f14852l;
        return c3730l;
    }

    @Override // defpackage.AbstractC14080l
    public final void billing(C11522l c11522l) throws IOException {
        crashlytics();
        for (int i = 0; i < this.f16895l.size(); i++) {
            AbstractC7735l abstractC7735lStartapp = this.f16895l.startapp(i);
            c11522l.m3102const(1, 2);
            c11522l.m3130while(abstractC7735lStartapp.size());
            c11522l.m3129try(abstractC7735lStartapp);
        }
        c11522l.m3129try(this.f16896l);
    }

    @Override // defpackage.AbstractC14080l
    public final int crashlytics() {
        int i = this.f16897l;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int size = 0;
        while (true) {
            int size2 = this.f16895l.size();
            InterfaceC5258l interfaceC5258l = this.f16895l;
            if (i2 >= size2) {
                int size3 = this.f16896l.size() + interfaceC5258l.size() + size;
                this.f16897l = size3;
                return size3;
            }
            AbstractC7735l abstractC7735lStartapp = interfaceC5258l.startapp(i2);
            size += abstractC7735lStartapp.size() + C11522l.ads(abstractC7735lStartapp.size());
            i2++;
        }
    }

    @Override // defpackage.AbstractC14080l
    public final AbstractC2398l purchase() {
        C3730l c3730l = new C3730l(3);
        c3730l.f7796l = C7088l.f14852l;
        c3730l.remoteconfig(this);
        return c3730l;
    }

    @Override // defpackage.InterfaceC8988l
    public final boolean yandex() {
        if (this.f16894l == 1) {
            return true;
        }
        this.f16894l = (byte) 1;
        return true;
    }

    public C8107l() {
        this.f16894l = (byte) -1;
        this.f16897l = -1;
        this.f16896l = AbstractC7735l.f16231l;
    }

    public C8107l(C3730l c3730l) {
        this.f16894l = (byte) -1;
        this.f16897l = -1;
        this.f16896l = c3730l.f5168l;
    }
}
