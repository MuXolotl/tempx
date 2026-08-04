package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lُؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0971l extends InputStream {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cstatic f2676l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InputStream f2677l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public isVip f2678l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public boolean f2675l = true;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f2674l = 0;

    public C0971l(Cstatic cstatic) {
        this.f2676l = cstatic;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.f2677l == null) {
            if (!this.f2675l) {
                return -1;
            }
            isVip isvipYandex = yandex();
            this.f2678l = isvipYandex;
            if (isvipYandex == null) {
                return -1;
            }
            this.f2675l = false;
            this.f2677l = isvipYandex.admob();
        }
        while (true) {
            int i4 = this.f2677l.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.f2674l = this.f2678l.firebase();
                isVip isvipYandex2 = yandex();
                this.f2678l = isvipYandex2;
                if (isvipYandex2 == null) {
                    this.f2677l = null;
                    if (i3 < 1) {
                        return -1;
                    }
                    return i3;
                }
                this.f2677l = isvipYandex2.admob();
            }
        }
    }

    public final isVip yandex() throws IOException {
        Cstatic cstatic = this.f2676l;
        int i = ((AbstractC10410l) cstatic.amazon).read();
        applovin applovinVarLoadAd = i < 0 ? null : cstatic.loadAd(i);
        if (applovinVarLoadAd == null) {
            return null;
        }
        if (!(applovinVarLoadAd instanceof isVip)) {
            C11467l.smaato(applovinVarLoadAd.getClass(), "unknown object encountered: ");
            return null;
        }
        if (this.f2674l == 0) {
            return (isVip) applovinVarLoadAd;
        }
        C18262l.metrica("only the last nested bitstring can have padding");
        return null;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f2677l == null) {
            if (this.f2675l) {
                isVip isvipYandex = yandex();
                this.f2678l = isvipYandex;
                if (isvipYandex != null) {
                    this.f2675l = false;
                    this.f2677l = isvipYandex.admob();
                }
            }
            return -1;
        }
        while (true) {
            int i = this.f2677l.read();
            if (i >= 0) {
                return i;
            }
            this.f2674l = this.f2678l.firebase();
            isVip isvipYandex2 = yandex();
            this.f2678l = isvipYandex2;
            if (isvipYandex2 == null) {
                this.f2677l = null;
                return -1;
            }
            this.f2677l = isvipYandex2.admob();
        }
    }
}
