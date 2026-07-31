package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.car.app.model.Alert;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.bouncycastle.jcajce.provider.asymmetric.EC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: renamed from: lٍؘٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC9361l {
    public static final int yandex = 1;

    public static String Signature(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String ad(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static /* synthetic */ void adcel(InterfaceC13349l interfaceC13349l, long j, long j2, long j3, long j4, AbstractC3239l abstractC3239l, int i) {
        long j5 = (i & 2) != 0 ? 0L : j2;
        interfaceC13349l.mo2064abstract(j, j5, (i & 4) != 0 ? purchase(interfaceC13349l.admob(), j5) : j3, j4, (i & 16) != 0 ? C5053l.yandex : abstractC3239l);
    }

    public static /* synthetic */ void admob(InterfaceC13349l interfaceC13349l, long j, float f, long j2, AbstractC3239l abstractC3239l, int i) {
        if ((i & 4) != 0) {
            j2 = interfaceC13349l.mo2070l();
        }
        long j3 = j2;
        if ((i & 16) != 0) {
            abstractC3239l = C5053l.yandex;
        }
        interfaceC13349l.mo2066else(j, f, j3, abstractC3239l);
    }

    public static /* synthetic */ int ads(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static String advert(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static long amazon(long j, InterfaceC13490l interfaceC13490l) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo868instanceof = interfaceC13490l.mo868instanceof(C2261l.loadAd(j));
        float fMo868instanceof2 = interfaceC13490l.mo868instanceof(C2261l.yandex(j));
        return (((long) Float.floatToRawIntBits(fMo868instanceof)) << 32) | (((long) Float.floatToRawIntBits(fMo868instanceof2)) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void applovin(Cursor cursor) throws Exception {
        if (cursor instanceof AutoCloseable) {
            cursor.close();
            return;
        }
        if (cursor instanceof ExecutorService) {
            AbstractC14238l.vip((ExecutorService) cursor);
            return;
        }
        if (cursor instanceof TypedArray) {
            ((TypedArray) cursor).recycle();
            return;
        }
        if (cursor instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) cursor).release();
            return;
        }
        if (cursor instanceof MediaDrm) {
            ((MediaDrm) cursor).release();
            return;
        }
        if (cursor instanceof DrmManagerClient) {
            ((DrmManagerClient) cursor).release();
        } else if (cursor instanceof ContentProviderClient) {
            ((ContentProviderClient) cursor).release();
        } else {
            C11983l.crashlytics();
        }
    }

    public static void appmetrica(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static final AbstractC7532l billing(int i) {
        int iInmobi = AbstractC5020l.inmobi(i);
        if (iInmobi == 0) {
            return AbstractC7532l.firebase;
        }
        if (iInmobi == 1) {
            return AbstractC7532l.smaato;
        }
        if (iInmobi == 2) {
            return AbstractC7532l.metrica;
        }
        if (iInmobi == 3) {
            return AbstractC7532l.subs;
        }
        C18725l.billing();
        return null;
    }

    public static float crashlytics(long j, InterfaceC13490l interfaceC13490l) {
        if (!C12735l.yandex(C1794l.loadAd(j), 4294967296L)) {
            AbstractC10280l.loadAd("Only Sp can convert to Px");
        }
        return interfaceC13490l.mo868instanceof(interfaceC13490l.inmobi(j));
    }

    public static void inmobi(C13815l c13815l) {
        c13815l.getClass();
        c13815l.yandex.yandex(new C9182l(new C9695l(new C17111l(2))));
    }

    public static /* synthetic */ void isPro(InterfaceC13349l interfaceC13349l, C14115l c14115l, long j, float f, AbstractC8939l abstractC8939l, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 16) != 0) {
            abstractC8939l = null;
        }
        interfaceC13349l.mo2067finally(c14115l, j2, f2, abstractC8939l, (i & 32) != 0 ? 3 : 0);
    }

    public static Map isVip(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2, EC.generalEcAttributes);
        configurableProvider.addAlgorithm(str3, str4, EC.generalEcAttributes);
        return EC.generalEcAttributes;
    }

    public static String license(String str, Cfor cfor) {
        return str + cfor;
    }

    public static long loadAd(long j, InterfaceC13490l interfaceC13490l) {
        if (j != 9205357640488583168L) {
            return AbstractC9027l.yandex(interfaceC13490l.mo867final(Float.intBitsToFloat((int) (j >> 32))), interfaceC13490l.mo867final(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static /* synthetic */ void metrica(InterfaceC13349l interfaceC13349l, long j, long j2, long j3, float f, C0404l c0404l, AbstractC8939l abstractC8939l, int i, int i2) {
        long j4 = (i2 & 2) != 0 ? 0L : j2;
        interfaceC13349l.mo2072l(j, j4, (i2 & 4) != 0 ? purchase(interfaceC13349l.admob(), j4) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? C5053l.yandex : c0404l, (i2 & 32) != 0 ? null : abstractC8939l, (i2 & 64) != 0 ? 3 : i);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static void m2636package(C13815l c13815l) {
        c13815l.getClass();
        c13815l.yandex.yandex(new C9695l(new C16822l(2)));
    }

    public static void premium(int i, String str, HashMap map, String str2) {
        map.put(str2, new C15205l(i, str));
    }

    public static String pro(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static long purchase(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static /* synthetic */ void remoteconfig(InterfaceC13349l interfaceC13349l, C9902l c9902l, long j, float f, AbstractC3239l abstractC3239l, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            abstractC3239l = C5053l.yandex;
        }
        interfaceC13349l.firebase(c9902l, j, f2, abstractC3239l);
    }

    public static AbstractC2426l signatures(AbstractC2426l abstractC2426l, AbstractC2426l abstractC2426l2, AbstractC2426l abstractC2426l3) {
        return abstractC2426l.license().amazon(abstractC2426l2).amazon(abstractC2426l3);
    }

    public static /* synthetic */ void smaato(InterfaceC13349l interfaceC13349l, C9902l c9902l, AbstractC9544l abstractC9544l, float f, C0404l c0404l, AbstractC8939l abstractC8939l, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        AbstractC3239l abstractC3239l = c0404l;
        if ((i & 8) != 0) {
            abstractC3239l = C5053l.yandex;
        }
        AbstractC3239l abstractC3239l2 = abstractC3239l;
        if ((i & 16) != 0) {
            abstractC8939l = null;
        }
        interfaceC13349l.advert(c9902l, abstractC9544l, f2, abstractC3239l2, abstractC8939l, (i & 32) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void startapp(InterfaceC13349l interfaceC13349l, AbstractC9544l abstractC9544l, long j, long j2, long j3, float f, AbstractC3239l abstractC3239l, AbstractC8939l abstractC8939l, int i) {
        long j4 = (i & 2) != 0 ? 0L : j;
        interfaceC13349l.mo2068l(abstractC9544l, j4, (i & 4) != 0 ? purchase(interfaceC13349l.admob(), j4) : j2, j3, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? C5053l.yandex : abstractC3239l, (i & 64) != 0 ? null : abstractC8939l, (i & 128) != 0 ? 3 : 0);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static /* synthetic */ String m2637strictfp(int i) {
        switch (i) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static void subs(InterfaceC13349l interfaceC13349l, C14115l c14115l, long j, long j2, float f, AbstractC8939l abstractC8939l, int i, int i2) {
        interfaceC13349l.mo2069l(c14115l, 0L, j, (i2 & 16) != 0 ? j : j2, (i2 & 32) != 0 ? 1.0f : f, abstractC8939l, (i2 & AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? 1 : i);
    }

    public static /* synthetic */ int subscription(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 5;
        }
        throw null;
    }

    public static InterfaceC1835l tapsense(Class cls, String str, String str2, int i, C2336l c2336l) {
        return c2336l.admob(new C0544l(cls, str, str2, i));
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static void m2639throws(C13815l c13815l) {
        c13815l.getClass();
        c13815l.yandex.yandex(new C9695l(new C10400l(2)));
    }

    public static /* synthetic */ void vip(InterfaceC13349l interfaceC13349l, AbstractC9544l abstractC9544l, long j, long j2, float f, AbstractC3239l abstractC3239l, AbstractC8939l abstractC8939l, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        interfaceC13349l.mo2071l(abstractC9544l, j3, (i2 & 4) != 0 ? purchase(interfaceC13349l.admob(), j3) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? C5053l.yandex : abstractC3239l, (i2 & 32) != 0 ? null : abstractC8939l, (i2 & 64) != 0 ? 3 : i);
    }

    public static int yandex(InterfaceC13490l interfaceC13490l, float f) {
        float fMo868instanceof = interfaceC13490l.mo868instanceof(f);
        return Float.isInfinite(fMo868instanceof) ? Alert.DURATION_SHOW_INDEFINITELY : Math.round(fMo868instanceof);
    }
}
