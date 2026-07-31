package defpackage;

import android.os.Trace;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓؗٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13958l {
    public static final InterfaceC1220l yandex = AbstractC9968l.crashlytics(3, new C8241l(10));

    public static final float amazon(C11183l c11183l) {
        float f = c11183l.f22496l;
        if (Float.isNaN(f)) {
            f = c11183l.f22481l.crashlytics;
        }
        return !Float.isNaN(f) ? f : c11183l.f22482l.crashlytics;
    }

    public static final List billing(C11183l c11183l) {
        List list = c11183l.f22499l;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            list = c11183l.f22481l.loadAd;
            if (list.isEmpty()) {
                list = null;
            }
            if (list == null) {
                List list2 = c11183l.f22482l.loadAd;
                List list3 = list2.isEmpty() ? null : list2;
                return list3 == null ? C2580l.f5619l : list3;
            }
        }
        return list;
    }

    public static final boolean crashlytics(C11183l c11183l) {
        if (c11183l.f22502l) {
            return c11183l.f22489l;
        }
        return ((Boolean) c11183l.f22495l.loadAd.getValue()).booleanValue();
    }

    public static C6312l loadAd(C11183l c11183l, float f, float f2, List list, float f3, AbstractC9544l abstractC9544l, C10417l c10417l, int i) {
        float fAmazon;
        AbstractC9544l abstractC9544l2;
        float fYandex = yandex(c11183l);
        if ((i & 2) != 0) {
            fAmazon = amazon(c11183l);
            if (Float.isNaN(fAmazon)) {
                fAmazon = 0.0f;
            }
        } else {
            fAmazon = f;
        }
        float fPurchase = (i & 4) != 0 ? purchase(c11183l) : f2;
        List listBilling = (i & 8) != 0 ? billing(c11183l) : list;
        float f4 = (i & 16) != 0 ? 1.0f : f3;
        long j = c11183l.f22497l;
        long j2 = c11183l.f22492l;
        C6312l c6312l = null;
        if ((i & 128) != 0) {
            c11183l.getClass();
            abstractC9544l2 = null;
        } else {
            abstractC9544l2 = abstractC9544l;
        }
        C10417l c10417l2 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : c10417l;
        int i2 = AbstractC8576l.yandex(c11183l.f22480l, null) ? 3 : 0;
        Trace.beginSection("HazeEffectNode-getOrCreateRenderEffect");
        try {
            C13153l c13153l = new C13153l(fAmazon, fPurchase, fYandex, j, j2, listBilling, f4, abstractC9544l2, c10417l2, i2);
            InterfaceC1220l interfaceC1220l = yandex;
            C6312l c6312l2 = (C6312l) ((C1579l) interfaceC1220l.getValue()).loadAd(c13153l);
            if (c6312l2 != null) {
                c6312l = c6312l2;
            } else {
                C6312l c6312lCrashlytics = AbstractC2847l.crashlytics(c11183l, c13153l);
                if (c6312lCrashlytics != null) {
                    ((C1579l) interfaceC1220l.getValue()).crashlytics(c13153l, c6312lCrashlytics);
                    c6312l = c6312lCrashlytics;
                }
            }
            return c6312l;
        } finally {
            Trace.endSection();
        }
    }

    public static final float purchase(C11183l c11183l) {
        float f = c11183l.f22501l;
        if (0.0f > f || f > 1.0f) {
            f = c11183l.f22481l.amazon;
        }
        return (0.0f > f || f > 1.0f) ? c11183l.f22482l.amazon : f;
    }

    public static float yandex(C11183l c11183l) {
        float fAmazon = amazon(c11183l);
        InterfaceC16339l interfaceC16339l = c11183l.f22483l;
        if (AbstractC8576l.yandex(interfaceC16339l, C11284l.yandex)) {
            return 1.0f;
        }
        if (!AbstractC8576l.yandex(interfaceC16339l, C18501l.yandex)) {
            C18725l.billing();
            return 0.0f;
        }
        if (C14467l.yandex(fAmazon, 7.0f) < 0) {
            return 1.0f;
        }
        return c11183l.f22487l != null ? 0.5f : 0.3334f;
    }
}
