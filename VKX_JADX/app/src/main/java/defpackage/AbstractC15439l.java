package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٕؕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15439l {
    public static final C15578l yandex = new C15578l(-12572889, false, new C12851l(12));
    public static final C15578l loadAd = new C15578l(2086651555, false, new C12851l(13));
    public static final C15578l crashlytics = new C15578l(464923664, false, new C12851l(14));
    public static final C15578l amazon = new C15578l(-815014772, false, new C12851l(15));
    public static final C15578l purchase = new C15578l(-1021780412, false, new C8918l(12));
    public static final C15578l billing = new C15578l(-157323023, false, new C8918l(13));
    public static final C15578l mopub = new C15578l(1413149557, false, new C8918l(14));

    public static final C4348l admob(String str, boolean z, int i) {
        return new C4348l(str, i, null, z);
    }

    public static final C3625l amazon(C0639l c0639l, int i) {
        C3625l c3625l = c0639l.yandex;
        C3625l c3625l2 = c0639l.yandex;
        long j = c0639l.loadAd;
        int iBilling = C12814l.billing(j);
        int iBilling2 = C12814l.billing(j);
        int length = iBilling2 + i;
        if (((i ^ length) & (iBilling2 ^ length)) < 0) {
            length = c3625l2.f7563l.length();
        }
        return c3625l.subSequence(iBilling, Math.min(length, c3625l2.f7563l.length()));
    }

    public static void billing(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final C3625l crashlytics(C0639l c0639l) {
        C3625l c3625l = c0639l.yandex;
        long j = c0639l.loadAd;
        c3625l.getClass();
        return c3625l.subSequence(C12814l.mopub(j), C12814l.billing(j));
    }

    public static boolean loadAd(C13143l c13143l, C5478l c5478l, int i, C1014l c1014l) {
        long jApplovin = c13143l.applovin();
        long j = jApplovin >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jApplovin >> 12) & 15);
        int i3 = (int) ((jApplovin >> 8) & 15);
        int i4 = (int) ((jApplovin >> 4) & 15);
        int i5 = (int) ((jApplovin >> 1) & 7);
        boolean z2 = (jApplovin & 1) == 1;
        if (i4 <= 7) {
            if (i4 != c5478l.mopub - 1) {
                return false;
            }
        } else if (i4 > 10 || c5478l.mopub != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == c5478l.subs) || z2) {
            return false;
        }
        try {
            long jM3566strictfp = c13143l.m3566strictfp();
            if (!z) {
                jM3566strictfp *= (long) c5478l.loadAd;
            }
            long j2 = c5478l.isPro;
            if (j2 != 0 && jM3566strictfp > j2) {
                return false;
            }
            c1014l.f2761l = jM3566strictfp;
            int iMopub = mopub(i2, c13143l);
            long j3 = c5478l.isPro;
            boolean z3 = j3 == 0 || jM3566strictfp + ((long) iMopub) >= j3;
            if (iMopub == -1) {
                return false;
            }
            if ((!z3 && iMopub < c5478l.yandex) || iMopub > c5478l.loadAd) {
                return false;
            }
            int i6 = c5478l.purchase;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != c5478l.billing) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iM3567synchronized = c13143l.m3567synchronized();
                    if (i3 == 14) {
                        iM3567synchronized *= 10;
                    }
                    if (iM3567synchronized != i6) {
                        return false;
                    }
                } else if (c13143l.signatures() * 1000 != i6) {
                    return false;
                }
            }
            int iSignatures = c13143l.signatures();
            int i7 = c13143l.loadAd;
            byte[] bArr = c13143l.yandex;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = c13143l.loadAd; i10 < i8; i10++) {
                i9 = AbstractC15323l.smaato[i9 ^ (bArr[i10] & 255)];
            }
            String str = AbstractC15323l.yandex;
            if (iSignatures != i9) {
                return false;
            }
            if (c13143l.yandex() != 0) {
                int iIsPro = c13143l.isPro();
                if ((iIsPro & 128) != 0) {
                    return false;
                }
                int i11 = (iIsPro & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    AbstractC6427l.firebase("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int mopub(int i, C13143l c13143l) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return c13143l.signatures() + 1;
            case 7:
                return c13143l.m3567synchronized() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return PSKKeyManager.MAX_KEY_LENGTH_BYTES << (i - 8);
            default:
                return -1;
        }
    }

    public static final C3625l purchase(C0639l c0639l, int i) {
        C3625l c3625l = c0639l.yandex;
        long j = c0639l.loadAd;
        int iMopub = C12814l.mopub(j);
        int i2 = iMopub - i;
        if (((iMopub ^ i2) & (i ^ iMopub)) < 0) {
            i2 = 0;
        }
        return c3625l.subSequence(Math.max(0, i2), C12814l.mopub(j));
    }

    public static final C11897l yandex(String str) {
        return new C11897l(str, new C15655l(6), Boolean.FALSE);
    }
}
