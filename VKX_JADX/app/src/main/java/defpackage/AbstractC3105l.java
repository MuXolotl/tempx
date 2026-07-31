package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.security.GeneralSecurityException;

/* JADX INFO: renamed from: lؕؐۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3105l {
    public static C4986l billing;
    public static final C4733l yandex = new C4733l(C2385l.class, new C14377l(17));
    public static final C8873l loadAd = new C8873l("type.googleapis.com/google.crypto.tink.AesGcmSivKey", new C14377l(18));
    public static final C5773l crashlytics = new C5773l(C11716l.class, new C14377l(19));
    public static final C9439l amazon = new C9439l("type.googleapis.com/google.crypto.tink.AesGcmSivKey", new C14377l(20));
    public static final Object purchase = new Object();

    public static String adcel(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC17716l.mopub("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC17716l.mopub("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
        return null;
    }

    public static final boolean admob(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final double amazon(int i, int i2, int i3, int i4, int i5, C9192l c9192l) {
        double dMax;
        double d = i;
        double d2 = ((double) i3) / d;
        double d3 = i2;
        double d4 = ((double) i4) / d3;
        int iInmobi = AbstractC5020l.inmobi(i5);
        if (iInmobi == 0) {
            dMax = Math.max(d2, d4);
        } else {
            if (iInmobi != 1) {
                C18725l.billing();
                return 0.0d;
            }
            dMax = Math.min(d2, d4);
        }
        InterfaceC18382l interfaceC18382l = c9192l.yandex;
        if (interfaceC18382l instanceof C12881l) {
            double d5 = ((double) ((C12881l) interfaceC18382l).yandex) / d;
            if (dMax > d5) {
                dMax = d5;
            }
        }
        InterfaceC18382l interfaceC18382l2 = c9192l.loadAd;
        if (interfaceC18382l2 instanceof C12881l) {
            double d6 = ((double) ((C12881l) interfaceC18382l2).yandex) / d3;
            if (dMax > d6) {
                return d6;
            }
        }
        return dMax;
    }

    public static int billing(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final long crashlytics(int i, int i2, C9192l c9192l, int i3, C9192l c9192l2) {
        int i4;
        int i5;
        if (!AbstractC8576l.yandex(c9192l, C9192l.crashlytics)) {
            i = smaato(c9192l.yandex, i3);
            i2 = smaato(c9192l.loadAd, i3);
        }
        InterfaceC18382l interfaceC18382l = c9192l2.yandex;
        InterfaceC18382l interfaceC18382l2 = c9192l2.loadAd;
        if ((interfaceC18382l instanceof C12881l) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i5 = ((C12881l) interfaceC18382l).yandex)) {
            i = i5;
        }
        if ((interfaceC18382l2 instanceof C12881l) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i4 = ((C12881l) interfaceC18382l2).yandex)) {
            i2 = i4;
        }
        return AbstractC0555l.purchase(i, i2);
    }

    public static C9358l firebase(C16751l c16751l) {
        if (c16751l.equals(C16751l.f32753l)) {
            return C9358l.crashlytics;
        }
        if (c16751l == C16751l.f32755l) {
            return C9358l.billing;
        }
        if (c16751l == C16751l.f32754l) {
            return C9358l.purchase;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c16751l)));
    }

    public static ComponentName isPro(Context context, Intent intent) {
        synchronized (purchase) {
            try {
                yandex(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    billing.yandex();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void loadAd(Intent intent) {
        synchronized (purchase) {
            try {
                if (billing != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    billing.crashlytics();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void metrica(int i, int i2) {
        if (i < 0 || i > i2) {
            C18262l.adcel(adcel(i, i2, "index"));
        }
    }

    public static final boolean mopub(float f, float f2, C9902l c9902l) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        C9902l c9902lYandex = AbstractC3478l.yandex();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            AbstractC3478l.crashlytics("Invalid rectangle, make sure no value is NaN");
        }
        if (c9902lYandex.loadAd == null) {
            c9902lYandex.loadAd = new RectF();
        }
        c9902lYandex.loadAd.set(f3, f4, f5, f6);
        c9902lYandex.yandex.addRect(c9902lYandex.loadAd, AbstractC3478l.loadAd(1));
        C9902l c9902lYandex2 = AbstractC3478l.yandex();
        c9902lYandex2.mopub(c9902l, c9902lYandex, 1);
        boolean zIsEmpty = c9902lYandex2.yandex.isEmpty();
        c9902lYandex2.admob();
        c9902lYandex.admob();
        return !zIsEmpty;
    }

    public static long[] purchase(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        AbstractC12442l.billing(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static C16751l remoteconfig(C9358l c9358l) throws GeneralSecurityException {
        if (c9358l == C9358l.crashlytics) {
            return C16751l.f32753l;
        }
        C9358l c9358l2 = C9358l.billing;
        C16751l c16751l = C16751l.f32755l;
        if (c9358l == c9358l2 || c9358l == C9358l.amazon) {
            return c16751l;
        }
        if (c9358l == C9358l.purchase) {
            return C16751l.f32754l;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
    }

    public static int smaato(InterfaceC18382l interfaceC18382l, int i) {
        if (interfaceC18382l instanceof C12881l) {
            return ((C12881l) interfaceC18382l).yandex;
        }
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        if (iInmobi == 1) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        C18725l.billing();
        return 0;
    }

    public static void startapp(int i, int i2, int i3) {
        String strAdcel;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strAdcel = adcel(i, i3, "start index");
            } else {
                strAdcel = (i2 < 0 || i2 > i3) ? adcel(i2, i3, "end index") : AbstractC17716l.mopub("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strAdcel);
        }
    }

    public static void subs(Context context, ServiceConnectionC4922l serviceConnectionC4922l, Intent intent) {
        synchronized (purchase) {
            try {
                yandex(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    billing.yandex();
                }
                serviceConnectionC4922l.loadAd(intent).yandex(new C4568l(16, intent));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void vip(int i, int i2) {
        String strMopub;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strMopub = AbstractC17716l.mopub("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C8339l.metrica(AbstractC0653l.vip(i2, "negative size: "));
                    return;
                }
                strMopub = AbstractC17716l.mopub("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strMopub);
        }
    }

    public static void yandex(Context context) {
        if (billing == null) {
            C4986l c4986l = new C4986l(context);
            billing = c4986l;
            synchronized (c4986l.yandex) {
                c4986l.mopub = true;
            }
        }
    }
}
