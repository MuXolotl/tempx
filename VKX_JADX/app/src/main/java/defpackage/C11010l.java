package defpackage;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: renamed from: lُْؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11010l implements PublicKey, Key {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public transient C0856l f22179l;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11010l)) {
            return false;
        }
        C10237l c10237l = this.f22179l.f2509l;
        byte[] bArrMopub = AbstractC14024l.mopub(c10237l.yandex, c10237l.loadAd);
        C10237l c10237l2 = ((C11010l) obj).f22179l.f2509l;
        return Arrays.equals(bArrMopub, AbstractC14024l.mopub(c10237l2.yandex, c10237l2.loadAd));
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS+-".concat(AbstractC9008l.mopub(((C18535l) this.f22179l.f16541l).loadAd));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        try {
            return AbstractC18323l.crashlytics(this.f22179l).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        C10237l c10237l = this.f22179l.f2509l;
        return AbstractC14024l.ads(AbstractC14024l.mopub(c10237l.yandex, c10237l.loadAd));
    }
}
