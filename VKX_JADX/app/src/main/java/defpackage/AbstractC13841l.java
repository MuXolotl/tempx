package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٓؐؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13841l {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object amazon(C14249l c14249l, AbstractC0283l abstractC0283l) {
        C13040l c13040l;
        if (abstractC0283l instanceof C13040l) {
            c13040l = (C13040l) abstractC0283l;
            int i = c13040l.f25545l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13040l.f25545l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13040l = new C13040l(abstractC0283l);
            }
        } else {
            c13040l = new C13040l(abstractC0283l);
        }
        Object objPremium = c13040l.f25543l;
        int i2 = c13040l.f25545l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objPremium);
            if (c14249l instanceof C18134l) {
                return c14249l;
            }
            AbstractC10022l abstractC10022l = c14249l.f27845l;
            if (abstractC10022l == null) {
                abstractC10022l = null;
            }
            InterfaceC9354l interfaceC9354lCrashlytics = abstractC10022l.crashlytics();
            c13040l.f25544l = c14249l;
            c13040l.f25545l = 1;
            objPremium = AbstractC10310l.premium(interfaceC9354lCrashlytics, c13040l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPremium == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c14249l = c13040l.f25544l;
            AbstractC2829l.crashlytics(objPremium);
        }
        byte[] bArrSubs = AbstractC10733l.subs((InterfaceC14189l) objPremium, -1);
        C16864l c16864l = c14249l.f27847l;
        InterfaceC1814l interfaceC1814l = c14249l.f27846l;
        if (interfaceC1814l == null) {
            interfaceC1814l = null;
        }
        AbstractC10022l abstractC10022l2 = c14249l.f27845l;
        return new C18134l(c16864l, interfaceC1814l, abstractC10022l2 != null ? abstractC10022l2 : null, bArrSubs);
    }

    public static void billing(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C6541l.subs(str.concat(" must not be null"));
    }

    public static final C11194l crashlytics(C6956l c6956l) {
        Object[] objArr = new Object[0];
        boolean zAmazon = c6956l.amazon(0);
        Object objM2132native = c6956l.m2132native();
        if (zAmazon || objM2132native == C1867l.yandex) {
            objM2132native = new C5146l(10);
            c6956l.m2147try(objM2132native);
        }
        return (C11194l) AbstractC0825l.smaato(objArr, C11194l.firebase, (Function0) objM2132native, c6956l, 0);
    }

    public static final Object loadAd(Function1 function1, AbstractC0283l abstractC0283l) {
        return !AbstractC16828l.yandex() ? function1.invoke(abstractC0283l) : AbstractC10999l.firebase(abstractC0283l.metrica().mo246l(new C7725l()), new C3289l(0, null, function1), abstractC0283l);
    }

    public static InterfaceC17242l purchase(InterfaceC17242l interfaceC17242l, C11194l c11194l, boolean z) {
        EnumC7283l enumC7283l = EnumC7283l.f15126l;
        EnumC7283l enumC7283l2 = z ? enumC7283l : EnumC7283l.f15125l;
        C2403l c2403l = c11194l.purchase;
        C4346l c4346l = C4346l.f8873l;
        return interfaceC17242l.premium(enumC7283l2 == enumC7283l ? AbstractC0019l.crashlytics(c4346l, C9946l.crashlytics) : AbstractC0019l.crashlytics(c4346l, C9946l.loadAd)).premium(new C3907l(null, null, null, c2403l, enumC7283l2, c11194l, true, true)).premium(new C2535l(c11194l, z));
    }

    public static final int yandex(InterfaceC3074l interfaceC3074l, Object obj, int i) {
        int iPurchase;
        return (obj == null || interfaceC3074l.yandex() == 0 || (i < interfaceC3074l.yandex() && obj.equals(interfaceC3074l.loadAd(i))) || (iPurchase = interfaceC3074l.purchase(obj)) == -1) ? i : iPurchase;
    }
}
