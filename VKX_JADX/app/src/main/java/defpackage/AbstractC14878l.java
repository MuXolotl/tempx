package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٔٓؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14878l {
    public static final C3797l yandex = C3797l.appmetrica("x", "y");

    public static float amazon(AbstractC9542l abstractC9542l) {
        int iMo1287synchronized = abstractC9542l.mo1287synchronized();
        int iInmobi = AbstractC5020l.inmobi(iMo1287synchronized);
        if (iInmobi != 0) {
            if (iInmobi == 6) {
                return (float) abstractC9542l.signatures();
            }
            C8339l.metrica("Unknown value for token of type ".concat(AbstractC2812l.applovin(iMo1287synchronized)));
            return 0.0f;
        }
        abstractC9542l.yandex();
        float fSignatures = (float) abstractC9542l.signatures();
        while (abstractC9542l.ads()) {
            abstractC9542l.mo1275continue();
        }
        abstractC9542l.mopub();
        return fSignatures;
    }

    public static ArrayList crashlytics(AbstractC9542l abstractC9542l, float f) {
        ArrayList arrayList = new ArrayList();
        abstractC9542l.yandex();
        while (abstractC9542l.mo1287synchronized() == 1) {
            abstractC9542l.yandex();
            arrayList.add(loadAd(abstractC9542l, f));
            abstractC9542l.mopub();
        }
        abstractC9542l.mopub();
        return arrayList;
    }

    public static PointF loadAd(AbstractC9542l abstractC9542l, float f) {
        int iInmobi = AbstractC5020l.inmobi(abstractC9542l.mo1287synchronized());
        if (iInmobi == 0) {
            abstractC9542l.yandex();
            float fSignatures = (float) abstractC9542l.signatures();
            float fSignatures2 = (float) abstractC9542l.signatures();
            while (abstractC9542l.mo1287synchronized() != 2) {
                abstractC9542l.mo1275continue();
            }
            abstractC9542l.mopub();
            return new PointF(fSignatures * f, fSignatures2 * f);
        }
        if (iInmobi != 2) {
            if (iInmobi != 6) {
                C8339l.metrica("Unknown point starts with ".concat(AbstractC2812l.applovin(abstractC9542l.mo1287synchronized())));
                return null;
            }
            float fSignatures3 = (float) abstractC9542l.signatures();
            float fSignatures4 = (float) abstractC9542l.signatures();
            while (abstractC9542l.ads()) {
                abstractC9542l.mo1275continue();
            }
            return new PointF(fSignatures3 * f, fSignatures4 * f);
        }
        abstractC9542l.billing();
        float fAmazon = 0.0f;
        float fAmazon2 = 0.0f;
        while (abstractC9542l.ads()) {
            int iMo1288throw = abstractC9542l.mo1288throw(yandex);
            if (iMo1288throw == 0) {
                fAmazon = amazon(abstractC9542l);
            } else if (iMo1288throw != 1) {
                abstractC9542l.mo1286switch();
                abstractC9542l.mo1275continue();
            } else {
                fAmazon2 = amazon(abstractC9542l);
            }
        }
        abstractC9542l.vip();
        return new PointF(fAmazon * f, fAmazon2 * f);
    }

    public static int yandex(AbstractC9542l abstractC9542l) {
        abstractC9542l.yandex();
        int iSignatures = (int) (abstractC9542l.signatures() * 255.0d);
        int iSignatures2 = (int) (abstractC9542l.signatures() * 255.0d);
        int iSignatures3 = (int) (abstractC9542l.signatures() * 255.0d);
        while (abstractC9542l.ads()) {
            abstractC9542l.mo1275continue();
        }
        abstractC9542l.mopub();
        return Color.argb(255, iSignatures, iSignatures2, iSignatures3);
    }
}
