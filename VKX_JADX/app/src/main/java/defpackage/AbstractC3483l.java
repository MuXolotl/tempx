package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Bundle;
import android.os.SystemClock;
import java.io.File;
import java.math.RoundingMode;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lًؕٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3483l {
    public static final C4733l yandex = new C4733l(C6023l.class, new C3010l(26));
    public static final C8873l loadAd = new C8873l("type.googleapis.com/google.crypto.tink.AesCmacKey", new C3010l(27));
    public static final C5773l crashlytics = new C5773l(C6533l.class, new C3010l(28));
    public static final C9439l amazon = new C9439l("type.googleapis.com/google.crypto.tink.AesCmacKey", new C3010l(29));
    public static final C0010l purchase = new C0010l(new C12176l(21), new C10949l(8));
    public static final C0010l billing = new C0010l(new C12176l(22), new C12176l(23));
    public static final C0010l mopub = new C0010l(new C12176l(24), new C12176l(25));
    public static final C0010l admob = new C0010l(new C12176l(26), new C12176l(27));
    public static final C0010l subs = new C0010l(new C12176l(28), new C12176l(29));
    public static final C0010l isPro = new C0010l(new C10949l(0), new C10949l(1));
    public static final C0010l firebase = new C0010l(new C10949l(2), new C10949l(3));
    public static final C0010l smaato = new C0010l(new C10949l(4), new C10949l(5));
    public static final C0010l remoteconfig = new C0010l(new C10949l(6), new C10949l(7));

    public static long admob(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long amazon(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (AbstractC13397l.yandex[roundingMode.ordinal()]) {
            case 1:
                AbstractC9464l.admob(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                C11586l.yandex();
                return 0L;
        }
    }

    public static long billing(long j, long j2) {
        AbstractC9464l.mopub(j, "a");
        AbstractC9464l.mopub(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static final Object crashlytics(C7026l c7026l, InterfaceC16588l interfaceC16588l, String str, C13975l c13975l) {
        C3718l c3718l = new C3718l(c7026l, str, c13975l);
        try {
            return interfaceC16588l.loadAd(c3718l);
        } catch (C9850l unused) {
            C11315l c11315l = c3718l.billing;
            c11315l.clear();
            C11315l c11315l2 = c3718l.mopub;
            c11315l2.clear();
            c3718l.admob = 0;
            c11315l.addLast(str);
            c11315l2.addLast(0);
            return null;
        }
    }

    public static C1693l firebase(C9358l c9358l) throws GeneralSecurityException {
        if (c9358l == C9358l.crashlytics) {
            return C1693l.f4068l;
        }
        if (c9358l == C9358l.billing) {
            return C1693l.f4073l;
        }
        if (c9358l == C9358l.amazon) {
            return C1693l.f4072l;
        }
        if (c9358l == C9358l.purchase) {
            return C1693l.f4075l;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(String.valueOf(c9358l)));
    }

    public static C9358l isPro(C1693l c1693l) {
        if (c1693l.equals(C1693l.f4068l)) {
            return C9358l.crashlytics;
        }
        if (c1693l == C1693l.f4073l) {
            return C9358l.billing;
        }
        if (c1693l == C1693l.f4075l) {
            return C9358l.purchase;
        }
        if (c1693l == C1693l.f4072l) {
            return C9358l.amazon;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(c1693l)));
    }

    public static long loadAd(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(AbstractC15560l.ads(j2, ")", AbstractC0653l.Signature(j, "overflow: checkedAdd(", ", ")));
    }

    public static void mopub(C7026l c7026l, InterfaceC16588l interfaceC16588l, String str) {
        C17878l c17878l = new C17878l(c7026l, str, AbstractC10651l.yandex);
        interfaceC16588l.loadAd(c17878l);
        Iterator it = c17878l.billing.iterator();
        while (it.hasNext()) {
            c17878l.crashlytics.inmobi((String) it.next());
        }
    }

    public static C13708l purchase(InterfaceC17302l interfaceC17302l, List list) {
        C16971l c16971lMetrica = AbstractC1186l.metrica();
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = (Bundle) list.get(i);
            bundle.getClass();
            c16971lMetrica.crashlytics(interfaceC17302l.apply(bundle));
        }
        return c16971lMetrica.mopub();
    }

    public static File smaato(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        C8339l.smaato("getFilesDir returned null twice.");
        return null;
    }

    public static ArrayList subs(Collection collection, InterfaceC17302l interfaceC17302l) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) interfaceC17302l.apply(it.next()));
        }
        return arrayList;
    }

    public static void yandex(StringBuilder sb, String str, Map map) {
        String name;
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str.concat("\n"));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof CameraCharacteristics.Key) {
                name = ((CameraCharacteristics.Key) key).getName();
            } else if (key instanceof CaptureRequest.Key) {
                name = ((CaptureRequest.Key) key).getName();
            } else {
                name = key instanceof CaptureResult.Key ? ((CaptureResult.Key) key).getName() : String.valueOf(key);
            }
            Object value = entry.getValue();
            arrayList.add(new C8195l(name, value instanceof Object[] ? AbstractC8669l.m2416switch((Object[]) value, null, "[", "]", new C4741l(5), 25) : String.valueOf(value)));
        }
        for (C8195l c8195l : AbstractC16901l.m4243this(arrayList, new C13617l(17))) {
            sb.append("  " + AbstractC12024l.m3329interface(50, (String) c8195l.f17098l) + ' ' + ((String) c8195l.f17097l) + '\n');
        }
    }
}
