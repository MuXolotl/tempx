package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: lؘۙۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5946l extends AbstractC1994l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f12535l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f12536l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C2432l f12537l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public byte[] f12538l;

    @Override // defpackage.InterfaceC14090l
    public final void close() {
        if (this.f12538l != null) {
            this.f12538l = null;
            startapp();
        }
        this.f12537l = null;
    }

    @Override // defpackage.InterfaceC14090l
    public final long crashlytics(C2432l c2432l) throws C12126l, C17655l {
        adcel();
        this.f12537l = c2432l;
        Uri uri = c2432l.yandex;
        long j = c2432l.mopub;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC12442l.isPro("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = AbstractC15323l.yandex;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new C17655l("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f12538l = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new C17655l(AbstractC14814l.startapp("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.f12538l = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = c2432l.billing;
        byte[] bArr = this.f12538l;
        if (j2 > bArr.length) {
            this.f12538l = null;
            throw new C12126l(2008);
        }
        int i = (int) j2;
        this.f12535l = i;
        int length = bArr.length - i;
        this.f12536l = length;
        if (j != -1) {
            this.f12536l = (int) Math.min(length, j);
        }
        ads(c2432l);
        return j != -1 ? j : this.f12536l;
    }

    @Override // defpackage.InterfaceC5802l
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f12536l;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f12538l;
        String str = AbstractC15323l.yandex;
        System.arraycopy(bArr2, this.f12535l, bArr, i, iMin);
        this.f12535l += iMin;
        this.f12536l -= iMin;
        firebase(iMin);
        return iMin;
    }

    @Override // defpackage.InterfaceC14090l
    public final Uri vip() {
        C2432l c2432l = this.f12537l;
        if (c2432l != null) {
            return c2432l.yandex;
        }
        return null;
    }
}
