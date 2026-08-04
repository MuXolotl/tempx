package defpackage;

import android.os.Parcelable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙِٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11990l {
    public static final C5125l yandex = new C5125l(1);
    public static final C5098l loadAd = new C5098l();

    public static final Object admob(Function2 function2, InterfaceC14029l interfaceC14029l) {
        C14274l c14274l = new C14274l(interfaceC14029l, interfaceC14029l.metrica());
        return AbstractC1163l.billing(c14274l, true, c14274l, function2);
    }

    public static final C15812l amazon(final InterfaceC9988l interfaceC9988l, final C3737l c3737l, C15812l c15812l) {
        final int i = interfaceC9988l.yandex() ? c3737l.crashlytics : c3737l.amazon;
        int iFirebase = interfaceC9988l.yandex() ? interfaceC9988l.firebase() : interfaceC9988l.billing();
        int i2 = c3737l.loadAd;
        C0327l c0327l = c3737l.billing;
        int i3 = c3737l.purchase;
        if (iFirebase != i2) {
            return c3737l.yandex(i);
        }
        final InterfaceC1220l interfaceC1220lCrashlytics = AbstractC9968l.crashlytics(3, new C8803l(c3737l, i, 7));
        final int i4 = interfaceC9988l.yandex() ? c3737l.amazon : c3737l.crashlytics;
        InterfaceC1220l interfaceC1220lCrashlytics2 = AbstractC9968l.crashlytics(3, new Function0() { // from class: lّۛۙ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int iIntValue = ((Number) interfaceC1220lCrashlytics.getValue()).intValue();
                InterfaceC9988l interfaceC9988l2 = interfaceC9988l;
                boolean zYandex = interfaceC9988l2.yandex();
                boolean z = interfaceC9988l2.subs() == 1;
                C3737l c3737l2 = c3737l;
                C0327l c0327l2 = c3737l2.billing;
                int i5 = i;
                long jSmaato = c0327l2.smaato(i5);
                C0327l c0327l3 = c3737l2.billing;
                C6222l c6222l = c0327l3.loadAd;
                int i6 = C12814l.crashlytics;
                int iSubs = (int) (jSmaato >> 32);
                int iAmazon = c6222l.amazon(iSubs);
                int i7 = c6222l.billing;
                if (iAmazon != iIntValue) {
                    iSubs = iIntValue >= i7 ? c0327l3.subs(i7 - 1) : c0327l3.subs(iIntValue);
                }
                int iCrashlytics = (int) (jSmaato & 4294967295L);
                if (c6222l.amazon(iCrashlytics) != iIntValue) {
                    iCrashlytics = iIntValue >= i7 ? c6222l.crashlytics(i7 - 1, false) : c6222l.crashlytics(iIntValue, false);
                }
                int i8 = i4;
                if (iSubs == i8) {
                    return c3737l2.yandex(iCrashlytics);
                }
                if (iCrashlytics == i8) {
                    return c3737l2.yandex(iSubs);
                }
                if (!(zYandex ^ z) ? i5 >= iSubs : i5 > iCrashlytics) {
                    iSubs = iCrashlytics;
                }
                return c3737l2.yandex(iSubs);
            }
        });
        if (c3737l.yandex != c15812l.crashlytics) {
            return (C15812l) interfaceC1220lCrashlytics2.getValue();
        }
        if (i == i3) {
            return c15812l;
        }
        if (((Number) interfaceC1220lCrashlytics.getValue()).intValue() != c0327l.loadAd.amazon(i3)) {
            return (C15812l) interfaceC1220lCrashlytics2.getValue();
        }
        int i5 = c15812l.loadAd;
        long jSmaato = c0327l.smaato(i5);
        boolean zYandex = interfaceC9988l.yandex();
        if (i3 != -1) {
            if (i != i3) {
                if (!(zYandex ^ (c3737l.loadAd() == 1))) {
                }
            }
            return c3737l.yandex(i);
        }
        int i6 = C12814l.crashlytics;
        return (i5 == ((int) (jSmaato >> 32)) || i5 == ((int) (jSmaato & 4294967295L))) ? (C15812l) interfaceC1220lCrashlytics2.getValue() : c3737l.yandex(i);
    }

    public static final void billing(InterfaceC2262l interfaceC2262l, CancellationException cancellationException) {
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) interfaceC2262l.vip().mo245l(C1083l.f2996l);
        if (interfaceC7042l != null) {
            interfaceC7042l.ads(cancellationException);
        } else {
            C17132l.metrica(interfaceC2262l, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final C3242l crashlytics(InterfaceC9988l interfaceC9988l, InterfaceC14713l interfaceC14713l) {
        boolean z = interfaceC9988l.subs() == 1;
        return new C3242l(purchase(interfaceC9988l.isPro(), z, true, interfaceC9988l.firebase(), interfaceC14713l), purchase(interfaceC9988l.admob(), z, false, interfaceC9988l.billing(), interfaceC14713l), z);
    }

    public static final C18351l firebase(InterfaceC3177l interfaceC3177l) {
        return AbstractC11738l.yandex(interfaceC3177l.loadAd());
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004  */
    public static final C3242l isPro(C3242l c3242l, InterfaceC9988l interfaceC9988l) {
        boolean z;
        boolean z2 = false;
        if (c3242l == null) {
            z = true;
        } else {
            C15812l c15812l = c3242l.yandex;
            long j = c15812l.crashlytics;
            C15812l c15812l2 = c3242l.loadAd;
            if (j != c15812l2.crashlytics) {
                boolean z3 = c3242l.crashlytics;
                if ((z3 ? c15812l : c15812l2).loadAd == 0) {
                    if (z3) {
                        c15812l = c15812l2;
                    }
                    if (interfaceC9988l.purchase().billing.yandex.yandex.f7563l.length() == c15812l.loadAd) {
                        C9122l c9122l = new C9122l();
                        c9122l.f18750l = true;
                        interfaceC9988l.smaato(new C16931l(20, c9122l));
                        z = c9122l.f18750l;
                    }
                }
            } else if (c15812l.loadAd == c15812l2.loadAd) {
                z = true;
            }
            z = false;
        }
        if (!z) {
            return c3242l;
        }
        String str = interfaceC9988l.loadAd().billing.yandex.yandex.f7563l;
        if (interfaceC9988l.mopub() > 1 || interfaceC9988l.amazon() == null) {
            return c3242l;
        }
        if (str.length() == 0) {
            return c3242l;
        }
        C3737l c3737lLoadAd = interfaceC9988l.loadAd();
        String str2 = c3737lLoadAd.billing.yandex.yandex.f7563l;
        int i = c3737lLoadAd.crashlytics;
        int length = str2.length();
        if (i == 0) {
            int iYandex = AbstractC9679l.yandex(0, str2);
            return interfaceC9988l.yandex() ? C3242l.yandex(c3242l, mopub(c3242l.yandex, c3737lLoadAd, iYandex), null, true, 2) : C3242l.yandex(c3242l, null, mopub(c3242l.loadAd, c3737lLoadAd, iYandex), false, 1);
        }
        if (i == length) {
            int iLoadAd = AbstractC9679l.loadAd(length, str2);
            return interfaceC9988l.yandex() ? C3242l.yandex(c3242l, mopub(c3242l.yandex, c3737lLoadAd, iLoadAd), null, false, 2) : C3242l.yandex(c3242l, null, mopub(c3242l.loadAd, c3737lLoadAd, iLoadAd), true, 1);
        }
        C3242l c3242lAmazon = interfaceC9988l.amazon();
        if (c3242lAmazon != null && c3242lAmazon.crashlytics) {
            z2 = true;
        }
        int iLoadAd2 = interfaceC9988l.yandex() ^ z2 ? AbstractC9679l.loadAd(i, str2) : AbstractC9679l.yandex(i, str2);
        return interfaceC9988l.yandex() ? C3242l.yandex(c3242l, mopub(c3242l.yandex, c3737lLoadAd, iLoadAd2), null, z2, 2) : C3242l.yandex(c3242l, null, mopub(c3242l.loadAd, c3737lLoadAd, iLoadAd2), z2, 1);
    }

    public static final C18662l loadAd() {
        C2993l c2993lCrashlytics = AbstractC1295l.crashlytics();
        C16552l c16552l = AbstractC11463l.yandex;
        return new C18662l(AbstractC10586l.billing(c2993lCrashlytics, AbstractC17278l.yandex));
    }

    public static final C15812l mopub(C15812l c15812l, C3737l c3737l, int i) {
        return new C15812l(c3737l.billing.yandex(i), c15812l.crashlytics, i);
    }

    public static final C15812l purchase(C3737l c3737l, boolean z, boolean z2, int i, InterfaceC14713l interfaceC14713l) {
        long j;
        int i2 = z2 ? c3737l.crashlytics : c3737l.amazon;
        if (i != c3737l.loadAd) {
            return c3737l.yandex(i2);
        }
        long jMopub = interfaceC14713l.mopub(c3737l, i2);
        if (z ^ z2) {
            int i3 = C12814l.crashlytics;
            j = jMopub >> 32;
        } else {
            int i4 = C12814l.crashlytics;
            j = 4294967295L & jMopub;
        }
        return c3737l.yandex((int) j);
    }

    public static C3448l remoteconfig() {
        C17913l c17913l = new C17913l(-1, -1, 0, true);
        Parcelable.Creator<C3448l> creator = C3448l.CREATOR;
        C3448l c3448l = new C3448l(c17913l, false);
        c3448l.f7323l = false;
        return c3448l;
    }

    public static final boolean smaato(InterfaceC2262l interfaceC2262l) {
        InterfaceC7042l interfaceC7042l = (InterfaceC7042l) interfaceC2262l.vip().mo245l(C1083l.f2996l);
        if (interfaceC7042l != null) {
            return interfaceC7042l.mopub();
        }
        return true;
    }

    public static final void subs(InterfaceC2262l interfaceC2262l) {
        AbstractC11174l.billing(interfaceC2262l.vip());
    }

    public static final C18662l yandex(InterfaceC12932l interfaceC12932l) {
        if (interfaceC12932l.mo245l(C1083l.f2996l) == null) {
            interfaceC12932l = interfaceC12932l.mo246l(AbstractC11174l.yandex());
        }
        return new C18662l(interfaceC12932l);
    }
}
