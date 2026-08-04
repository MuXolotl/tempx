package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؑ۟ۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0622l {
    public static final C15578l yandex = new C15578l(2050363127, false, new C1659l(19));

    public static final C14353l adcel(InterfaceC6942l interfaceC6942l, int i) {
        if (i > 0) {
            return new C14353l(interfaceC6942l, i);
        }
        C10754l.metrica(AbstractC15560l.tapsense("Requested element count ", i, " should be positive"));
        return null;
    }

    public static C2427l admob(String str, String str2, String str3, boolean z) {
        C0935l c0935l = new C0935l();
        C9258l c9258l = AbstractC1186l.f3181l;
        C13708l c13708l = C13708l.f26763l;
        List list = Collections.EMPTY_LIST;
        C13708l c13708l2 = C13708l.f26763l;
        C2410l c2410l = new C2410l();
        C11470l c11470l = C11470l.amazon;
        C3117l c3117l = new C3117l();
        c3117l.yandex = str2;
        c3117l.f6662synchronized = 20;
        c3117l.subscription = Boolean.valueOf(!z);
        c3117l.ads = Boolean.valueOf(z);
        c3117l.f6661strictfp = AbstractC1315l.loadAd(new C8195l("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str3), new C8195l("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2), new C8195l("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 2));
        return new C2427l(str, new C9202l(c0935l), null, new C7828l(c2410l), new C3852l(c3117l), c11470l);
    }

    public static final C4394l amazon(Function2 function2) {
        return new C4394l(function2, C17218l.f33421l, -2, 1);
    }

    public static final Object billing(InterfaceC6942l interfaceC6942l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        int i = AbstractC16600l.yandex;
        Object objYandex = loadAd(new C12867l(new C12207l(function2, (InterfaceC14029l) null, 1), interfaceC6942l, C17218l.f33421l, -2, 1), 0).yandex(C1077l.f2959l, interfaceC14029l);
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (objYandex != enumC9342l) {
            objYandex = Unit.INSTANCE;
        }
        return objYandex == enumC9342l ? objYandex : Unit.INSTANCE;
    }

    public static final long crashlytics(int i, int i2, C16328l c16328l) {
        int i3;
        C0209l c0209l;
        if (i == -1) {
            return (((long) i2) << 32) | 4294967295L;
        }
        boolean z = i > i2;
        C8610l c8610l = c16328l.amazon;
        C16535l c16535l = (c8610l == null || (c0209l = (C0209l) c8610l.getValue()) == null) ? null : c0209l.loadAd;
        long jYandex = c16535l != null ? c16535l.yandex(i, false) : AbstractC2296l.loadAd(i, i);
        long jBilling = c16328l.billing(jYandex);
        if (C12814l.amazon(jYandex) && C12814l.amazon(jBilling)) {
            i3 = 1;
        } else if (C12814l.amazon(jYandex) || C12814l.amazon(jBilling)) {
            i3 = (!C12814l.amazon(jYandex) || C12814l.amazon(jBilling)) ? 4 : 2;
        } else {
            i3 = 3;
        }
        int iInmobi = AbstractC5020l.inmobi(i3);
        if (iInmobi == 0) {
            return AbstractC16814l.mopub(i, z ? 1 : 2);
        }
        if (iInmobi == 1) {
            if (z) {
                return i == ((int) (jBilling >> 32)) ? AbstractC16814l.mopub(i, 1) : AbstractC16814l.mopub((int) (jBilling & 4294967295L), 2);
            }
            return i == ((int) (jBilling & 4294967295L)) ? AbstractC16814l.mopub(i, 2) : AbstractC16814l.mopub((int) (jBilling >> 32), 1);
        }
        if (iInmobi == 2) {
            return z ? AbstractC16814l.mopub((int) (jBilling & 4294967295L), 1) : AbstractC16814l.mopub((int) (jBilling >> 32), 2);
        }
        if (iInmobi == 3) {
            return (((long) i) << 32) | 4294967295L;
        }
        C18725l.billing();
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object firebase(InterfaceC6942l interfaceC6942l, InterfaceC14029l interfaceC14029l) {
        C13356l c13356l;
        C10700l c10700l;
        Cinstanceof e;
        C14703l c14703l;
        if (interfaceC14029l instanceof C13356l) {
            c13356l = (C13356l) interfaceC14029l;
            int i = c13356l.f26213l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13356l.f26213l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13356l = new C13356l(interfaceC14029l);
            }
        } else {
            c13356l = new C13356l(interfaceC14029l);
        }
        Object obj = c13356l.f26216l;
        int i2 = c13356l.f26213l;
        C9676l c9676l = AbstractC2878l.yandex;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c10700l = new C10700l();
            c10700l.f21708l = c9676l;
            C14703l c14703l2 = new C14703l(c10700l, 0);
            try {
                c13356l.f26215l = c10700l;
                c13356l.f26214l = c14703l2;
                c13356l.f26213l = 1;
                Object objYandex = interfaceC6942l.yandex(c14703l2, c13356l);
                Object obj2 = EnumC9342l.f19165l;
                if (objYandex == obj2) {
                    return obj2;
                }
            } catch (Cinstanceof e2) {
                e = e2;
                c14703l = c14703l2;
                if (e.f839l == c14703l) {
                    throw e;
                }
                AbstractC11174l.billing(c13356l.f1295l);
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c14703l = c13356l.f26214l;
            c10700l = c13356l.f26215l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Cinstanceof e3) {
                e = e3;
                if (e.f839l == c14703l) {
                    throw e;
                }
                AbstractC11174l.billing(c13356l.f1295l);
            }
        }
        Object obj3 = c10700l.f21708l;
        if (obj3 != c9676l) {
            return obj3;
        }
        C1759l.firebase("Expected at least one element");
        return null;
    }

    public static final InterfaceC6942l isPro(InterfaceC6942l interfaceC6942l) {
        return interfaceC6942l instanceof InterfaceC2478l ? interfaceC6942l : AbstractC3206l.amazon(interfaceC6942l, AbstractC3206l.yandex, AbstractC3206l.loadAd);
    }

    public static InterfaceC6942l loadAd(InterfaceC6942l interfaceC6942l, int i) {
        int i2;
        if (i < 0 && i != -2 && i != -1) {
            C10754l.metrica(AbstractC0653l.vip(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            i2 = 2;
        } else {
            i2 = 1;
        }
        int i3 = i;
        return interfaceC6942l instanceof InterfaceC5305l ? AbstractC2812l.admob((InterfaceC5305l) interfaceC6942l, null, i3, i2, 1) : new C5239l(interfaceC6942l, null, i3, i2, 2);
    }

    public static final InterfaceC6942l metrica(InterfaceC6942l interfaceC6942l, InterfaceC12932l interfaceC12932l) {
        if (interfaceC12932l.mo245l(C1083l.f2996l) != null) {
            C8936l.smaato(interfaceC12932l, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (interfaceC12932l.equals(C17218l.f33421l)) {
            return interfaceC6942l;
        }
        return interfaceC6942l instanceof InterfaceC5305l ? AbstractC2812l.admob((InterfaceC5305l) interfaceC6942l, interfaceC12932l, 0, 0, 6) : new C5239l(interfaceC6942l, interfaceC12932l, 0, 0, 12);
    }

    public static final void mopub(int i, int i2) {
        if (i <= i2) {
            return;
        }
        C18262l.adcel(AbstractC12589l.applovin(i, i2, "toIndex (", ") is greater than size (", ")."));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable purchase(InterfaceC6942l interfaceC6942l, InterfaceC9427l interfaceC9427l, AbstractC0283l abstractC0283l) throws Throwable {
        C13278l c13278l;
        C10700l c10700l;
        InterfaceC7042l interfaceC7042l;
        CancellationException cancellationExceptionMo2153default;
        if (abstractC0283l instanceof C13278l) {
            c13278l = (C13278l) abstractC0283l;
            int i = c13278l.f26063l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13278l.f26063l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13278l = new C13278l(abstractC0283l);
            }
        } else {
            c13278l = new C13278l(abstractC0283l);
        }
        Object obj = c13278l.f26061l;
        int i2 = c13278l.f26063l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C10700l c10700l2 = new C10700l();
            try {
                InterfaceC9427l c15215l = new C15215l(interfaceC9427l, c10700l2, 3);
                c13278l.f26062l = c10700l2;
                c13278l.f26063l = 1;
                Object objYandex = interfaceC6942l.yandex(c15215l, c13278l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                c10700l = c10700l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c10700l = c13278l.f26062l;
            try {
                AbstractC2829l.crashlytics(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) c10700l.f21708l;
        if ((th3 != null && th3.equals(th)) || ((interfaceC7042l = (InterfaceC7042l) c13278l.f1295l.mo245l(C1083l.f2996l)) != null && interfaceC7042l.isCancelled() && (cancellationExceptionMo2153default = interfaceC7042l.mo2153default()) != null && cancellationExceptionMo2153default.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            AbstractC11718l.yandex(th3, th);
            throw th3;
        }
        AbstractC11718l.yandex(th, th3);
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object remoteconfig(InterfaceC6942l interfaceC6942l, AbstractC0283l abstractC0283l) {
        C12190l c12190l;
        C10700l c10700l;
        Cinstanceof e;
        C14703l c14703l;
        if (abstractC0283l instanceof C12190l) {
            c12190l = (C12190l) abstractC0283l;
            int i = c12190l.f24211l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12190l.f24211l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12190l = new C12190l(abstractC0283l);
            }
        } else {
            c12190l = new C12190l(abstractC0283l);
        }
        Object obj = c12190l.f24214l;
        int i2 = c12190l.f24211l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c10700l = new C10700l();
            C14703l c14703l2 = new C14703l(c10700l, 1);
            try {
                c12190l.f24213l = c10700l;
                c12190l.f24212l = c14703l2;
                c12190l.f24211l = 1;
                Object objYandex = interfaceC6942l.yandex(c14703l2, c12190l);
                Object obj2 = EnumC9342l.f19165l;
                if (objYandex == obj2) {
                    return obj2;
                }
            } catch (Cinstanceof e2) {
                e = e2;
                c14703l = c14703l2;
                if (e.f839l == c14703l) {
                    throw e;
                }
                AbstractC11174l.billing(c12190l.f1295l);
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c14703l = c12190l.f24212l;
            c10700l = c12190l.f24213l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Cinstanceof e3) {
                e = e3;
                if (e.f839l == c14703l) {
                    throw e;
                }
                AbstractC11174l.billing(c12190l.f1295l);
            }
        }
        return c10700l.f21708l;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object smaato(InterfaceC6942l interfaceC6942l, Function2 function2, InterfaceC14029l interfaceC14029l) {
        C10048l c10048l;
        C10700l c10700l;
        Cinstanceof e;
        C10414l c10414l;
        if (interfaceC14029l instanceof C10048l) {
            c10048l = (C10048l) interfaceC14029l;
            int i = c10048l.f20494l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10048l.f20494l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10048l = new C10048l(interfaceC14029l);
            }
        } else {
            c10048l = new C10048l(interfaceC14029l);
        }
        Object obj = c10048l.f20497l;
        int i2 = c10048l.f20494l;
        C9676l c9676l = AbstractC2878l.yandex;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C10700l c10700l2 = new C10700l();
            c10700l2.f21708l = c9676l;
            C10414l c10414l2 = new C10414l(function2, c10700l2, 0);
            try {
                c10048l.f20496l = c10700l2;
                c10048l.f20495l = c10414l2;
                c10048l.f20494l = 1;
                Object objYandex = interfaceC6942l.yandex(c10414l2, c10048l);
                Object obj2 = EnumC9342l.f19165l;
                if (objYandex == obj2) {
                    return obj2;
                }
                c10700l = c10700l2;
            } catch (Cinstanceof e2) {
                c10700l = c10700l2;
                e = e2;
                c10414l = c10414l2;
                if (e.f839l == c10414l) {
                    throw e;
                }
                AbstractC11174l.billing(c10048l.f1295l);
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c10414l = c10048l.f20495l;
            c10700l = c10048l.f20496l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Cinstanceof e3) {
                e = e3;
                if (e.f839l == c10414l) {
                    throw e;
                }
                AbstractC11174l.billing(c10048l.f1295l);
            }
        }
        Object obj3 = c10700l.f21708l;
        if (obj3 != c9676l) {
            return obj3;
        }
        C1759l.firebase("Expected at least one element matching the predicate");
        return null;
    }

    public static final C7504l startapp(InterfaceC6942l interfaceC6942l, InterfaceC2262l interfaceC2262l) {
        return AbstractC10999l.mopub(interfaceC2262l, null, 0, new C8912l(interfaceC6942l, null, 1), 3);
    }

    public static final InterfaceC6942l subs(InterfaceC6942l interfaceC6942l, long j) {
        if (j < 0) {
            C8339l.metrica("Debounce timeout should not be negative");
            return null;
        }
        if (j == 0) {
            return interfaceC6942l;
        }
        return new C14970l(3, new C1640l(new C4199l(j, 5), interfaceC6942l, null));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object vip(InterfaceC6942l interfaceC6942l, Function2 function2, AbstractC0283l abstractC0283l) {
        C7432l c7432l;
        C10700l c10700l;
        Cinstanceof e;
        C10414l c10414l;
        if (abstractC0283l instanceof C7432l) {
            c7432l = (C7432l) abstractC0283l;
            int i = c7432l.f15388l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7432l.f15388l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7432l = new C7432l(abstractC0283l);
            }
        } else {
            c7432l = new C7432l(abstractC0283l);
        }
        Object obj = c7432l.f15391l;
        int i2 = c7432l.f15388l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C10700l c10700l2 = new C10700l();
            C10414l c10414l2 = new C10414l(function2, c10700l2, 1);
            try {
                c7432l.f15390l = c10700l2;
                c7432l.f15389l = c10414l2;
                c7432l.f15388l = 1;
                Object objYandex = interfaceC6942l.yandex(c10414l2, c7432l);
                Object obj2 = EnumC9342l.f19165l;
                if (objYandex == obj2) {
                    return obj2;
                }
                c10700l = c10700l2;
            } catch (Cinstanceof e2) {
                c10700l = c10700l2;
                e = e2;
                c10414l = c10414l2;
                if (e.f839l == c10414l) {
                    throw e;
                }
                AbstractC11174l.billing(c7432l.f1295l);
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c10414l = c7432l.f15389l;
            c10700l = c7432l.f15390l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Cinstanceof e3) {
                e = e3;
                if (e.f839l == c10414l) {
                    throw e;
                }
                AbstractC11174l.billing(c7432l.f1295l);
            }
        }
        return c10700l.f21708l;
    }

    public static final C7549l yandex(C1008l c1008l) {
        return new C7549l(c1008l, null);
    }
}
