package defpackage;

import android.view.View;
import kotlin.Unit;

/* JADX INFO: renamed from: lٕؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1068l {
    public static final float[] yandex = new float[91];
    public static final char[] loadAd = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final boolean amazon(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && AbstractC7712l.smaato(str.charAt(i + 1)) != -1 && AbstractC7712l.smaato(str.charAt(i3)) != -1;
    }

    public static final View billing(InterfaceC8605l interfaceC8605l) {
        if (!((AbstractC14971l) interfaceC8605l).f29454l.f29462l) {
            AbstractC0081l.crashlytics("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) AbstractC5672l.yandex(AbstractC5573l.metrica(interfaceC8605l));
    }

    public static C10164l crashlytics(long j, long j2, long j3, long j4, long j5, C6956l c6956l, int i, int i2) {
        long j6 = (i2 & 1) != 0 ? ((C9735l) ((C10236l) c6956l.isPro(AbstractC17200l.yandex)).yandex.getValue()).yandex : j;
        C10707l c10707l = AbstractC17200l.yandex;
        long j7 = ((C9735l) ((C10236l) c6956l.isPro(c10707l)).firebase.getValue()).yandex;
        long j8 = ((C9735l) c6956l.isPro(AbstractC11892l.yandex)).yandex;
        if (((C10236l) c6956l.isPro(c10707l)).yandex()) {
            AbstractC12953l.vip(j8);
        } else {
            AbstractC12953l.vip(j8);
        }
        long jFirebase = AbstractC12953l.firebase(C9735l.loadAd(0.38f, j7), ((C9735l) ((C10236l) c6956l.isPro(c10707l)).billing.getValue()).yandex);
        long j9 = (i2 & 4) != 0 ? ((C9735l) ((C10236l) c6956l.isPro(c10707l)).yandex.getValue()).yandex : j2;
        long jLoadAd = (i2 & 8) != 0 ? C9735l.loadAd(0.24f, j9) : j3;
        long jLoadAd2 = C9735l.loadAd(0.32f, ((C9735l) ((C10236l) c6956l.isPro(c10707l)).firebase.getValue()).yandex);
        long jLoadAd3 = C9735l.loadAd(0.12f, jLoadAd2);
        long jLoadAd4 = (i2 & 64) != 0 ? C9735l.loadAd(0.54f, AbstractC17200l.yandex(j9, c6956l)) : j4;
        return new C10164l(j6, jFirebase, j9, jLoadAd, jLoadAd2, jLoadAd3, jLoadAd4, (i2 & 128) != 0 ? C9735l.loadAd(0.54f, j9) : j5, C9735l.loadAd(0.12f, jLoadAd4), C9735l.loadAd(0.12f, jLoadAd3));
    }

    public static String loadAd(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        char c;
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || AbstractC12024l.inmobi(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !amazon(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                C0869l c0869l = new C0869l();
                c0869l.m721l(i4, iCharCount, str);
                C0869l c0869l2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (z5 && (iCodePointAt2 == 9 || iCodePointAt2 == 10 || iCodePointAt2 == 12 || iCodePointAt2 == 13)) {
                        Unit unit = Unit.INSTANCE;
                    } else {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            c0869l.m718l("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            c0869l.m718l(z5 ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z7) || AbstractC12024l.inmobi(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !amazon(iCharCount, length, str)))))) {
                                if (c0869l2 == null) {
                                    c0869l2 = new C0869l();
                                }
                                c0869l2.m720l(iCodePointAt2);
                                while (!c0869l2.subs()) {
                                    byte b = c0869l2.readByte();
                                    c0869l.m709instanceof(37);
                                    char[] cArr = loadAd;
                                    c0869l.m709instanceof(cArr[((b & 255) >> 4) & 15]);
                                    c0869l.m709instanceof(cArr[b & 15]);
                                }
                                c = '%';
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                c0869l.m720l(iCodePointAt2);
                            }
                            iCharCount += Character.charCount(iCodePointAt2);
                            i5 = 128;
                        }
                    }
                    c = '%';
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                }
                return c0869l.m703continue();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    public static String purchase(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C0869l c0869l = new C0869l();
                c0869l.m721l(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iSmaato = AbstractC7712l.smaato(str.charAt(iCharCount + 1));
                        int iSmaato2 = AbstractC7712l.smaato(str.charAt(i4));
                        if (iSmaato == -1 || iSmaato2 == -1) {
                            c0869l.m720l(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c0869l.m709instanceof((iSmaato << 4) + iSmaato2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c0869l.m709instanceof(32);
                        iCharCount++;
                    } else {
                        c0869l.m720l(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c0869l.m703continue();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    public static String yandex(int i, int i2, int i3, String str, String str2) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return loadAd(str, i4, i2, str2, (i3 & 8) == 0, (i3 & 16) == 0, (i3 & 32) == 0, (i3 & 64) == 0, 128);
    }

    public abstract C11421l admob(int i);

    public abstract Object isPro(C11421l c11421l);

    public abstract int mopub();

    public abstract Object subs(int i);
}
