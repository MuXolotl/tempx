package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;

/* JADX INFO: renamed from: lؖٛؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4229l extends C5074l {
    public static final HashSet mopub;

    static {
        HashSet hashSet = new HashSet();
        mopub = hashSet;
        hashSet.add("BANNER_IMAGE");
        hashSet.add("BANNER_IMAGE_TYPE");
        hashSet.add("BANNER_IMAGE_URL");
        hashSet.add("COPYRIGHT_URL");
    }

    @Override // defpackage.C5074l
    public final boolean admob(C12645l c12645l) {
        return mopub.contains(c12645l.f24877l) && super.admob(c12645l);
    }

    @Override // defpackage.C5074l
    public final long amazon() {
        return ((long) crashlytics(1, "BANNER_IMAGE").f24875l.length) + 40 + ((long) mopub("BANNER_IMAGE_URL").length()) + ((long) mopub("COPYRIGHT_URL").length());
    }

    @Override // defpackage.C5074l
    public final long isPro(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        long jAmazon = amazon();
        byteArrayOutputStream.write(this.loadAd.yandex());
        AbstractC3848l.subs(jAmazon, byteArrayOutputStream);
        if (billing("BANNER_IMAGE_TYPE").isEmpty()) {
            C12645l c12645l = new C12645l(EnumC0678l.CONTENT_BRANDING, "BANNER_IMAGE_TYPE", 3, 0);
            c12645l.billing(0L);
            loadAd(c12645l);
        }
        AbstractC3848l.admob(crashlytics(0, "BANNER_IMAGE_TYPE").crashlytics(), byteArrayOutputStream);
        byte[] bArrAmazon = crashlytics(1, "BANNER_IMAGE").amazon();
        AbstractC3848l.admob(bArrAmazon.length, byteArrayOutputStream);
        byteArrayOutputStream.write(bArrAmazon);
        AbstractC3848l.admob(mopub("BANNER_IMAGE_URL").length(), byteArrayOutputStream);
        String strMopub = mopub("BANNER_IMAGE_URL");
        Charset charset = AbstractC12379l.yandex;
        byteArrayOutputStream.write(strMopub.getBytes(charset));
        AbstractC3848l.admob(mopub("COPYRIGHT_URL").length(), byteArrayOutputStream);
        byteArrayOutputStream.write(mopub("COPYRIGHT_URL").getBytes(charset));
        return jAmazon;
    }
}
