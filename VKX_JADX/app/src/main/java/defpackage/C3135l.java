package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lؕؒۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3135l extends InputStream {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InputStream f6736l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f6737l = true;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cstatic f6738l;

    public C3135l(Cstatic cstatic) {
        this.f6738l = cstatic;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Ccatch ccatchYandex;
        int i3 = 0;
        if (this.f6736l == null) {
            if (!this.f6737l || (ccatchYandex = yandex()) == null) {
                return -1;
            }
            this.f6737l = false;
            this.f6736l = ccatchYandex.amazon();
        }
        while (true) {
            int i4 = this.f6736l.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                Ccatch ccatchYandex2 = yandex();
                if (ccatchYandex2 == null) {
                    this.f6736l = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f6736l = ccatchYandex2.amazon();
            }
        }
    }

    public final Ccatch yandex() throws IOException {
        Cstatic cstatic = this.f6738l;
        int i = ((AbstractC10410l) cstatic.amazon).read();
        applovin applovinVarLoadAd = i < 0 ? null : cstatic.loadAd(i);
        if (applovinVarLoadAd == null) {
            return null;
        }
        if (applovinVarLoadAd instanceof Ccatch) {
            return (Ccatch) applovinVarLoadAd;
        }
        C11467l.smaato(applovinVarLoadAd.getClass(), "unknown object encountered: ");
        return null;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Ccatch ccatchYandex;
        if (this.f6736l == null) {
            if (!this.f6737l || (ccatchYandex = yandex()) == null) {
                return -1;
            }
            this.f6737l = false;
            this.f6736l = ccatchYandex.amazon();
        }
        while (true) {
            int i = this.f6736l.read();
            if (i >= 0) {
                return i;
            }
            Ccatch ccatchYandex2 = yandex();
            if (ccatchYandex2 == null) {
                this.f6736l = null;
                return -1;
            }
            this.f6736l = ccatchYandex2.amazon();
        }
    }
}
