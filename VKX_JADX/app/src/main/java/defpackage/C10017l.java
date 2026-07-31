package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: renamed from: lَؑۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10017l extends AbstractC13890l {
    public final /* synthetic */ int admob;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10017l(int i, List list) {
        super(list);
        this.admob = i;
    }

    public static float isPro(C4529l c4529l, float f) {
        Object obj = c4529l.loadAd;
        if (obj == null || c4529l.crashlytics == null) {
            C8339l.smaato("Missing values for keyframe.");
            return 0.0f;
        }
        if (c4529l.subs == -3987645.8f) {
            c4529l.subs = ((Float) obj).floatValue();
        }
        float f2 = c4529l.subs;
        if (c4529l.isPro == -3987645.8f) {
            c4529l.isPro = ((Float) c4529l.crashlytics).floatValue();
        }
        return AbstractC7484l.purchase(f2, c4529l.isPro, f);
    }

    public int firebase(C4529l c4529l, float f) {
        if (c4529l.loadAd == null || c4529l.crashlytics == null) {
            C8339l.smaato("Missing values for keyframe.");
            return 0;
        }
        return AbstractC17307l.subs(((Integer) c4529l.loadAd).intValue(), AbstractC7484l.loadAd(f, 0.0f, 1.0f), ((Integer) c4529l.crashlytics).intValue());
    }

    @Override // defpackage.AbstractC4383l
    public final Object purchase(C4529l c4529l, float f) {
        int i;
        Object obj;
        switch (this.admob) {
            case 0:
                return Integer.valueOf(firebase(c4529l, f));
            case 1:
                return Float.valueOf(isPro(c4529l, f));
            case 2:
                Object obj2 = c4529l.loadAd;
                if (obj2 == null) {
                    C8339l.smaato("Missing values for keyframe.");
                    return null;
                }
                Object obj3 = c4529l.crashlytics;
                if (obj3 == null) {
                    if (c4529l.firebase == 784923401) {
                        c4529l.firebase = ((Integer) obj2).intValue();
                    }
                    i = c4529l.firebase;
                } else {
                    if (c4529l.smaato == 784923401) {
                        c4529l.smaato = ((Integer) obj3).intValue();
                    }
                    i = c4529l.smaato;
                }
                if (c4529l.firebase == 784923401) {
                    c4529l.firebase = ((Integer) obj2).intValue();
                }
                int i2 = c4529l.firebase;
                PointF pointF = AbstractC7484l.yandex;
                return Integer.valueOf((int) ((f * (i - i2)) + i2));
            default:
                return (f != 1.0f || (obj = c4529l.crashlytics) == null) ? (C8253l) c4529l.loadAd : (C8253l) obj;
        }
    }

    public float subs() {
        return isPro(this.crashlytics.crashlytics(), loadAd());
    }
}
