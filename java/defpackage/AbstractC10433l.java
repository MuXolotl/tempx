package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lََٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10433l {
    public static final C15578l yandex = new C15578l(-1601489719, false, new C10721l(9));

    public static final float admob(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float amazon(long j, long j2) {
        return (admob(j2) * admob(j)) + (mopub(j2) * mopub(j));
    }

    public static final float billing(long j) {
        return (float) Math.sqrt((admob(j) * admob(j)) + (mopub(j) * mopub(j)));
    }

    public static final long crashlytics(float f, long j) {
        return C9699l.yandex(mopub(j) / f, admob(j) / f);
    }

    public static final long firebase(long j, long j2) {
        return C9699l.yandex(mopub(j2) + mopub(j), admob(j2) + admob(j));
    }

    public static C2369l isPro(CharSequence charSequence) {
        if (!charSequence.equals("HTTP/1.1")) {
            if (!charSequence.equals("HTTP/1.0")) {
                if (!charSequence.equals("HTTP/2.0")) {
                    if (!charSequence.equals("HTTP/3.0")) {
                        List listM3338public = AbstractC12024l.m3338public(charSequence, new String[]{"/", "."}, 6);
                        if (listM3338public.size() != 3) {
                            C18073l.firebase(charSequence, "Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: ");
                            return null;
                        }
                        String str = (String) listM3338public.get(0);
                        String str2 = (String) listM3338public.get(1);
                        String str3 = (String) listM3338public.get(2);
                        int i = Integer.parseInt(str2);
                        int i2 = Integer.parseInt(str3);
                        if (!str.equals("HTTP") || i != 1 || i2 != 0) {
                            if (!str.equals("HTTP") || i != 1 || i2 != 1) {
                                if (!str.equals("HTTP") || i != 2 || i2 != 0) {
                                    if (!str.equals("HTTP") || i != 3 || i2 != 0) {
                                        return new C2369l(str, i, i2);
                                    }
                                }
                            }
                        }
                    }
                    return C2369l.amazon;
                }
                return C2369l.purchase;
            }
            return C2369l.mopub;
        }
        return C2369l.billing;
    }

    public static final void loadAd(InterfaceC8639l interfaceC8639l) {
        AbstractC7572l.amazon(new C2176l(1, interfaceC8639l, InterfaceC8639l.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 17));
    }

    public static final float mopub(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final Object purchase(InterfaceC8639l interfaceC8639l, AbstractC0283l abstractC0283l) {
        Throwable thLoadAd = interfaceC8639l.loadAd();
        if (thLoadAd != null) {
            throw thLoadAd;
        }
        if (!interfaceC8639l.subs()) {
            C18476l c18476lPurchase = interfaceC8639l.purchase();
            c18476lPurchase.crashlytics();
            if (((int) c18476lPurchase.f36079l) < 1048576) {
                return Unit.INSTANCE;
            }
        }
        Object objCrashlytics = interfaceC8639l.crashlytics(abstractC0283l);
        return objCrashlytics == EnumC9342l.f19165l ? objCrashlytics : Unit.INSTANCE;
    }

    public static final long remoteconfig(float f, long j) {
        return C9699l.yandex(mopub(j) * f, admob(j) * f);
    }

    public static final void smaato(C13056l c13056l, C13056l c13056l2) {
        c13056l.amazon = c13056l2.amazon;
        c13056l.yandex = c13056l2.yandex;
        c13056l.purchase(c13056l2.crashlytics);
        c13056l.admob = c13056l2.admob;
        c13056l.purchase = c13056l2.purchase;
        c13056l.billing = c13056l2.billing;
        C10954l c10954l = new C10954l(13);
        AbstractC7720l.yandex(c10954l, c13056l2.subs);
        c13056l.subs = c10954l;
        c13056l.isPro = new C6921l(c10954l);
        c13056l.mopub = c13056l2.mopub;
        c13056l.loadAd = c13056l2.loadAd;
    }

    public static final long subs(long j, long j2) {
        return C9699l.yandex(mopub(j) - mopub(j2), admob(j) - admob(j2));
    }

    public static final C2540l yandex(String str) {
        C13056l c13056l = new C13056l();
        AbstractC10701l.loadAd(c13056l, str);
        return c13056l.loadAd();
    }
}
