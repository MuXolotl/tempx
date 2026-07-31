package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: renamed from: lَْۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13273l {
    public static SharedPreferences billing;
    public static final C15578l yandex = new C15578l(-1958188147, false, new C12851l(16));
    public static final C15578l loadAd = new C15578l(1020729356, false, new C12851l(17));
    public static final C15578l crashlytics = new C15578l(-1687805325, false, new C11891l(3));
    public static final C15578l amazon = new C15578l(605932873, false, new C8918l(15));
    public static final C15578l purchase = new C15578l(1845345280, false, new C8918l(16));

    public static C18595l crashlytics(C13143l c13143l) {
        c13143l.m3568throw(1);
        int iAppmetrica = c13143l.appmetrica();
        long j = ((long) c13143l.loadAd) + ((long) iAppmetrica);
        int i = iAppmetrica / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jSignature = c13143l.Signature();
            if (jSignature == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jSignature;
            jArrCopyOf2[i2] = c13143l.Signature();
            c13143l.m3568throw(2);
        }
        c13143l.m3568throw((int) (j - ((long) c13143l.loadAd)));
        return new C18595l(jArrCopyOf, jArrCopyOf2, 24);
    }

    public static Drawable loadAd(Context context, int i) {
        return C7521l.amazon().billing(context, i);
    }

    public static String yandex(AbstractC16071l abstractC16071l) {
        StringBuilder sb = new StringBuilder(abstractC16071l.size());
        for (int i = 0; i < abstractC16071l.size(); i++) {
            byte bAmazon = abstractC16071l.amazon(i);
            if (bAmazon == 34) {
                sb.append("\\\"");
            } else if (bAmazon == 39) {
                sb.append("\\'");
            } else if (bAmazon != 92) {
                switch (bAmazon) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bAmazon < 32 || bAmazon > 126) {
                            sb.append('\\');
                            sb.append((char) (((bAmazon >>> 6) & 3) + 48));
                            sb.append((char) (((bAmazon >>> 3) & 7) + 48));
                            sb.append((char) ((bAmazon & 7) + 48));
                        } else {
                            sb.append((char) bAmazon);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
