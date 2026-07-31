package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؙؕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3230l {
    public static final C15578l yandex = new C15578l(1488533819, false, new C11813l(19));
    public static final C15578l loadAd = new C15578l(1845180972, false, new C11813l(20));
    public static final C15578l crashlytics = new C15578l(-852672316, false, new C11813l(21));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object amazon(C12428l c12428l, Function0 function0, AbstractC0283l abstractC0283l) {
        C1967l c1967l;
        if (abstractC0283l instanceof C1967l) {
            c1967l = (C1967l) abstractC0283l;
            int i = c1967l.f4481l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1967l.f4481l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1967l = new C1967l(abstractC0283l);
            }
        } else {
            c1967l = new C1967l(abstractC0283l);
        }
        Object obj = c1967l.f4479l;
        int i2 = c1967l.f4481l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                if (c1967l.f1295l.mo245l(C1083l.f2996l) != c12428l) {
                    C8339l.smaato("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                c1967l.f4480l = function0;
                c1967l.f4481l = 1;
                C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c1967l));
                c2397l.license();
                c12428l.m3383l(new C2558l(c2397l, 3));
                Object objSignature = c2397l.Signature();
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objSignature == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function0 = c1967l.f4480l;
                AbstractC2829l.crashlytics(obj);
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    public static final String billing(int i, String str) {
        int iM3321extends;
        CharSequence charSequenceSubSequence;
        if (str.length() >= i + 12 && AbstractC12024l.inmobi("+-", str.charAt(0)) && (iM3321extends = AbstractC12024l.m3321extends(str, '-', 1, 4)) >= 12) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (str.charAt(i3) != '0') {
                    break;
                }
                i2 = i3;
            }
            if (iM3321extends - i2 < 12) {
                int i4 = iM3321extends - 10;
                if (i4 < 1) {
                    C18262l.adcel(AbstractC15560l.tapsense("End index (", i4, ") is less than start index (1)."));
                    return null;
                }
                if (i4 == 1) {
                    charSequenceSubSequence = str.subSequence(0, str.length());
                } else {
                    StringBuilder sb = new StringBuilder(str.length() - (iM3321extends - 11));
                    sb.append((CharSequence) str, 0, 1);
                    sb.append((CharSequence) str, i4, str.length());
                    charSequenceSubSequence = sb;
                }
                return charSequenceSubSequence.toString();
            }
        }
        return str;
    }

    public static final InterfaceC1286l crashlytics(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new C13028l(((BitmapDrawable) drawable).getBitmap()) : new C16688l(drawable);
    }

    public static final Drawable loadAd(InterfaceC1286l interfaceC1286l, Resources resources) {
        if (interfaceC1286l instanceof C16688l) {
            return ((C16688l) interfaceC1286l).yandex;
        }
        return interfaceC1286l instanceof C13028l ? new BitmapDrawable(resources, ((C13028l) interfaceC1286l).yandex) : new C3271l(1, interfaceC1286l);
    }

    public static final boolean purchase(char c) {
        return '0' <= c && c < ':';
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, Function1 function1, C6956l c6956l, int i) {
        c6956l.m2133new(1662841509);
        int i2 = (c6956l.admob(function1) ? 32 : 16) | i;
        int i3 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC3177l interfaceC3177l = (InterfaceC3177l) c6956l.isPro(AbstractC2431l.yandex);
            InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(interfaceC17242l, C9735l.loadAd, AbstractC16837l.yandex);
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lAmazon);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            boolean zAdmob = c6956l.admob(interfaceC3177l) | ((i2 & 112) == 32);
            Object objM2132native = c6956l.m2132native();
            int i5 = 27;
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new C0464l(interfaceC3177l, function1, i5);
                c6956l.m2147try(objM2132native);
            }
            Function1 function2 = (Function1) objM2132native;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f);
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C10351l(i5);
                c6956l.m2147try(objM2132native2);
            }
            Function1 function3 = (Function1) objM2132native2;
            Object objM2132native3 = c6956l.m2132native();
            if (objM2132native3 == c13863l) {
                objM2132native3 = new C10351l(28);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC11397l.loadAd(function2, interfaceC17242lCrashlytics, function3, (Function1) objM2132native3, c6956l, 27696, 4);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9772l(interfaceC17242l, function1, i, i3);
        }
    }
}
