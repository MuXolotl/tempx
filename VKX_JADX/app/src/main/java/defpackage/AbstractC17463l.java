package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* JADX INFO: renamed from: lٗ۠ۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17463l {
    public static final char[] yandex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static boolean admob(Context context, int i, boolean z) {
        TypedValue typedValueMopub = mopub(context, i);
        if (typedValueMopub == null || typedValueMopub.type != 18) {
            return z;
        }
        return typedValueMopub.data != 0;
    }

    public static final void amazon(long j, long j2, long j3) {
        if (j2 < 0 || j2 > j || j - j2 < j3 || j3 < 0) {
            StringBuilder sbSignature = AbstractC0653l.Signature(j2, "offset (", ") and byteCount (");
            sbSignature.append(j3);
            sbSignature.append(") are not within the range [0..size(");
            sbSignature.append(j);
            sbSignature.append("))");
            throw new IllegalArgumentException(sbSignature.toString());
        }
    }

    public static final boolean billing(int i, long j, int i2) {
        int iIsPro = C15519l.isPro(j);
        if (i > C15519l.admob(j) || iIsPro > i) {
            return false;
        }
        return i2 <= C15519l.mopub(j) && C15519l.subs(j) <= i2;
    }

    public static final void crashlytics(long j, long j2, long j3) {
        if (j2 >= 0 && j3 <= j) {
            if (j2 <= j3) {
                return;
            }
            C8339l.metrica(AbstractC12900l.smaato(AbstractC0653l.Signature(j2, "startIndex (", ") > endIndex ("), j3, ')'));
        } else {
            StringBuilder sbSignature = AbstractC0653l.Signature(j2, "startIndex (", ") and endIndex (");
            sbSignature.append(j3);
            sbSignature.append(") are not within the range [0..size(");
            sbSignature.append(j);
            sbSignature.append("))");
            throw new IndexOutOfBoundsException(sbSignature.toString());
        }
    }

    public static final InterfaceC17242l loadAd(InterfaceC17242l interfaceC17242l, boolean z) {
        return interfaceC17242l.premium(new C10286l(z));
    }

    public static TypedValue mopub(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final void purchase(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C10754l.metrica(i != i2 ? AbstractC12589l.applovin(i, i2, "Both size ", " and step ", " must be greater than zero.") : AbstractC15560l.tapsense("size ", i, " must be greater than zero."));
        }
    }

    public static C15294l yandex() {
        return new C15294l(1.0f, 1.0f);
    }
}
