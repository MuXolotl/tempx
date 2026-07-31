package defpackage;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: renamed from: lٜؑؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0444l {
    public static final C0444l crashlytics = new C0444l(C2237l.loadAd, C10675l.signatures());
    public final C10675l loadAd;
    public final C2237l yandex;

    public C0444l(C2237l c2237l, C10675l c10675l) {
        c2237l.getClass();
        this.yandex = c2237l;
        this.loadAd = c10675l;
    }

    public static C0444l yandex(AbstractC9284l abstractC9284l, boolean z) throws C9893l {
        C2237l c2237lYandex;
        int iMo1089super = abstractC9284l.mo1089super();
        if (iMo1089super > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iMo1089super).length() + 44);
            sb.append("Unsupported version: ");
            sb.append(iMo1089super);
            sb.append(". Current version is: 1");
            throw new C9893l(sb.toString());
        }
        abstractC9284l.mo1089super();
        int iIsVip = abstractC9284l.isVip(abstractC9284l.mo1084new());
        C11337l c11337l = C11337l.yandex;
        int i = AbstractC5004l.yandex;
        C10675l c10675lIsVip = C10675l.isVip(abstractC9284l, C11337l.loadAd);
        abstractC9284l.signatures(iIsVip);
        C9804l c9804l = new C9804l();
        Inflater inflater = (Inflater) c9804l.f19982l;
        try {
            if (z) {
                int iIsVip2 = abstractC9284l.isVip(abstractC9284l.mo1084new());
                int iPremium = abstractC9284l.premium();
                try {
                    c2237lYandex = C2237l.yandex(AbstractC9284l.m2630package(new InflaterInputStream(new C11270l(c9804l, abstractC9284l), inflater, iPremium < 0 ? 4096 : Math.min(iPremium, 4096)), 4096));
                    inflater.reset();
                    if (abstractC9284l.premium() != 0) {
                        throw new C9893l("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    abstractC9284l.signatures(iIsVip2);
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            } else {
                inflater.setInput(abstractC9284l.mo1076final());
                try {
                    c2237lYandex = C2237l.yandex(AbstractC9284l.m2630package(new C11270l(5, c9804l), 4096));
                    inflater.reset();
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            c9804l.close();
            return new C0444l(c2237lYandex, c10675lIsVip);
        } catch (Throwable th3) {
            try {
                c9804l.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
