package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lؒٙۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1140l implements isVip {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f3102l = 0;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9774l f3103l;

    public C1140l(C9774l c9774l) {
        this.f3103l = c9774l;
    }

    @Override // defpackage.isVip
    public final InputStream admob() {
        String str;
        C9774l c9774l = this.f3103l;
        int i = c9774l.f19918l;
        if (i >= 1) {
            int i2 = c9774l.read();
            this.f3102l = i2;
            if (i2 > 0) {
                if (i < 2) {
                    str = "zero length data with non-zero pad bits";
                } else if (i2 > 7) {
                    str = "pad bits cannot be greater than 7 or less than 0";
                }
            }
            return c9774l;
        }
        str = "content octets cannot be empty";
        C8339l.smaato(str);
        return null;
    }

    @Override // defpackage.applovin
    public final Ccase billing() {
        try {
            return smaato();
        } catch (IOException e) {
            throw new Celse(AbstractC5020l.adcel(e, new StringBuilder("IOException converting stream to byte array: ")), e, 0);
        }
    }

    @Override // defpackage.isVip
    public final int firebase() {
        return this.f3102l;
    }

    @Override // defpackage.InterfaceC12254l
    public final Ccase smaato() {
        return advert.premium(this.f3103l.billing());
    }
}
