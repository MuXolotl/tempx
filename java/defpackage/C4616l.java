package defpackage;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.HashSet;

/* JADX INFO: renamed from: lؗؓۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4616l extends AbstractC2058l {
    public final long billing;
    public static final Charset mopub = Charset.forName("UTF-16LE");
    public static final byte[] admob = {0, 0};

    static {
        new HashSet().add(C4421l.remoteconfig);
    }

    public C4616l(long j, BigInteger bigInteger, long j2) {
        super(C4421l.admob, j, bigInteger);
        this.billing = j2;
    }

    @Override // defpackage.AbstractC2058l, defpackage.C1109l
    public final String yandex(String str) {
        StringBuilder sbAdvert = AbstractC5020l.advert(str, "  | : Contains: \"");
        sbAdvert.append(this.billing);
        sbAdvert.append("\" chunks");
        sbAdvert.append(AbstractC3848l.yandex);
        return crashlytics(str, sbAdvert.toString());
    }
}
