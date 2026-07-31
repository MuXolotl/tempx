package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: lؕ۠ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3692l extends C5074l {
    public static final HashSet mopub = new HashSet(Arrays.asList("AUTHOR", "COPYRIGHT", "DESCRIPTION", "RATING", "TITLE"));

    @Override // defpackage.C5074l
    public final boolean admob(C12645l c12645l) {
        return mopub.contains(c12645l.f24877l) && super.admob(c12645l);
    }

    @Override // defpackage.C5074l
    public final long amazon() {
        return ((long) (mopub("AUTHOR").length() * 2)) + 44 + ((long) (mopub("DESCRIPTION").length() * 2)) + ((long) (mopub("RATING").length() * 2)) + ((long) (mopub("TITLE").length() * 2)) + ((long) (mopub("COPYRIGHT").length() * 2));
    }

    @Override // defpackage.C5074l
    public final long isPro(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        long jAmazon = amazon();
        byteArrayOutputStream.write(this.loadAd.yandex());
        AbstractC3848l.subs(amazon(), byteArrayOutputStream);
        AbstractC3848l.mopub((mopub("TITLE").length() * 2) + 2, byteArrayOutputStream);
        AbstractC3848l.mopub((mopub("AUTHOR").length() * 2) + 2, byteArrayOutputStream);
        AbstractC3848l.mopub((mopub("COPYRIGHT").length() * 2) + 2, byteArrayOutputStream);
        AbstractC3848l.mopub((mopub("DESCRIPTION").length() * 2) + 2, byteArrayOutputStream);
        AbstractC3848l.mopub((mopub("RATING").length() * 2) + 2, byteArrayOutputStream);
        String strMopub = mopub("TITLE");
        Charset charset = C4616l.mopub;
        byteArrayOutputStream.write(AbstractC3848l.loadAd(strMopub, charset));
        byte[] bArr = C4616l.admob;
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(AbstractC3848l.loadAd(mopub("AUTHOR"), charset));
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(AbstractC3848l.loadAd(mopub("COPYRIGHT"), charset));
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(AbstractC3848l.loadAd(mopub("DESCRIPTION"), charset));
        byteArrayOutputStream.write(bArr);
        byteArrayOutputStream.write(AbstractC3848l.loadAd(mopub("RATING"), charset));
        byteArrayOutputStream.write(bArr);
        return jAmazon;
    }

    @Override // defpackage.C5074l, defpackage.C1109l
    public final String yandex(String str) {
        StringBuilder sb = new StringBuilder(super.yandex(str));
        sb.append(str);
        sb.append("  |->Title      : ");
        sb.append(mopub("TITLE"));
        String str2 = AbstractC3848l.yandex;
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Author     : ");
        sb.append(mopub("AUTHOR"));
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Copyright  : ");
        sb.append(mopub("COPYRIGHT"));
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Description: ");
        sb.append(mopub("DESCRIPTION"));
        sb.append(str2);
        sb.append(str);
        sb.append("  |->Rating     :");
        sb.append(mopub("RATING"));
        sb.append(str2);
        return sb.toString();
    }
}
