package defpackage;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: lٟؔٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2812l {
    public static StringBuilder Signature(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static void ad(EnumC13290l enumC13290l, EnumC7005l enumC7005l, C13476l c13476l, EnumC13290l enumC13290l2, EnumC7005l enumC7005l2) {
        c13476l.yandex(C2582l.tapsense(enumC13290l, enumC7005l));
        c13476l.yandex(C2582l.tapsense(enumC13290l2, enumC7005l2));
    }

    public static Object adcel(HashMap map, Uri uri, Uri uri2) {
        AbstractC12442l.subscription(map.containsKey(uri));
        return map.get(uri2);
    }

    public static /* synthetic */ InterfaceC6942l admob(InterfaceC5305l interfaceC5305l, InterfaceC12932l interfaceC12932l, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            interfaceC12932l = C17218l.f33421l;
        }
        if ((i3 & 2) != 0) {
            i = -3;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return interfaceC5305l.loadAd(interfaceC12932l, i, i2);
    }

    public static String ads(long j, String str) {
        return str + j;
    }

    public static /* synthetic */ boolean advert(Object obj) {
        return obj != null;
    }

    public static float amazon(long j, InterfaceC13490l interfaceC13490l) {
        float fCrashlytics;
        float fMo873super;
        if (!C12735l.yandex(C1794l.loadAd(j), 4294967296L)) {
            AbstractC10280l.loadAd("Only Sp can convert to Px");
        }
        float[] fArr = AbstractC5443l.yandex;
        if (interfaceC13490l.mo873super() >= 1.03f) {
            InterfaceC8917l interfaceC8917lYandex = AbstractC5443l.yandex(interfaceC13490l.mo873super());
            fCrashlytics = C1794l.crashlytics(j);
            if (interfaceC8917lYandex != null) {
                return interfaceC8917lYandex.loadAd(fCrashlytics);
            }
            fMo873super = interfaceC13490l.mo873super();
        } else {
            fCrashlytics = C1794l.crashlytics(j);
            fMo873super = interfaceC13490l.mo873super();
        }
        return fMo873super * fCrashlytics;
    }

    public static /* synthetic */ String applovin(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object billing(C2885l c2885l, C6472l c6472l, AbstractC0283l abstractC0283l) {
        C3220l c3220l;
        if (abstractC0283l instanceof C3220l) {
            c3220l = (C3220l) abstractC0283l;
            int i = c3220l.f6921l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3220l.f6921l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3220l = new C3220l(c2885l, abstractC0283l);
            }
        } else {
            c3220l = new C3220l(c2885l, abstractC0283l);
        }
        Object objMo246l = c3220l.f6922l;
        int i2 = c3220l.f6921l;
        int i3 = 2;
        InterfaceC14029l interfaceC14029l = null;
        Object obj = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objMo246l);
            InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c6472l.f13516l;
            c3220l.f6923l = c6472l;
            c3220l.f6921l = 1;
            C0499l c0499l = AbstractC1285l.yandex;
            C0462l c0462l = new C0462l(interfaceC7042l);
            objMo246l = c2885l.f6283l.mo246l(c0462l).mo246l(AbstractC1285l.yandex);
            InterfaceC7042l interfaceC7042l2 = (InterfaceC7042l) c3220l.f1295l.mo245l(C1083l.f2996l);
            if (interfaceC7042l2 != null) {
                c0462l.mo2154l(new C17330l(14, interfaceC7042l2.signatures(true, new C17330l(15, c0462l), true)));
            }
            if (objMo246l != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(objMo246l);
                return objMo246l;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c6472l = c3220l.f6923l;
        AbstractC2829l.crashlytics(objMo246l);
        InterfaceC12932l interfaceC12932l = (InterfaceC12932l) objMo246l;
        C11268l c11268lCrashlytics = AbstractC10999l.crashlytics(2, interfaceC12932l.mo246l(new l(interfaceC12932l)), c2885l, new C15559l(c2885l, c6472l, interfaceC14029l, i3));
        c3220l.f6923l = null;
        c3220l.f6921l = 2;
        Object objFirebase = c11268lCrashlytics.firebase(c3220l);
        return objFirebase == obj ? obj : objFirebase;
    }

    public static InterfaceC12001l crashlytics(InterfaceC12001l interfaceC12001l, InterfaceC12001l interfaceC12001l2) {
        return interfaceC12001l2 == C9885l.yandex ? interfaceC12001l : new C3139l(interfaceC12001l, interfaceC12001l2);
    }

    public static C8195l firebase(int i, int i2, Integer num) {
        return new C8195l(new C18738l(i, i2), num);
    }

    public static int isPro(InterfaceC6347l interfaceC6347l, int i, int i2) {
        return (interfaceC6347l.hashCode() + i) * i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LinkedHashSet isVip(String str, String str2, C0396l c0396l, Object obj) {
        return AbstractC9905l.admob(obj, AbstractC7694l.isPro(str, str2, c0396l).getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LinkedHashSet license(String str, String str2, C0396l c0396l, Object obj) {
        return AbstractC9905l.admob(obj, AbstractC7694l.purchase(str, str2, c0396l).getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C14649l loadAd(InterfaceC13079l interfaceC13079l, InterfaceC1388l interfaceC1388l, String str, Object... objArr) {
        C12125l c12125l = (C12125l) ((AbstractC17054l) interfaceC13079l).f33215l;
        return new C14649l(interfaceC13079l.remoteconfig(), interfaceC13079l.remoteconfig().mo1847l().crashlytics(c12125l.billing.m1826while(interfaceC1388l).yandex()).loadAd, interfaceC1388l, c12125l.billing, str, objArr);
    }

    public static C13476l metrica(EnumC13290l enumC13290l, EnumC7005l enumC7005l, C13476l c13476l, ArrayList arrayList, C13476l c13476l2) {
        c13476l.yandex(C2582l.tapsense(enumC13290l, enumC7005l));
        arrayList.add(c13476l2);
        return new C13476l();
    }

    public static void mopub(InterfaceC6497l interfaceC6497l) {
        ((C15552l) interfaceC6497l).loadAd(8, false, true);
    }

    public static /* synthetic */ String premium(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static void pro(int i, C15578l c15578l, C6956l c6956l, boolean z) {
        c15578l.invoke(c6956l, Integer.valueOf(i));
        c6956l.startapp(z);
    }

    public static long purchase(InterfaceC13490l interfaceC13490l, float f) {
        float[] fArr = AbstractC5443l.yandex;
        if (interfaceC13490l.mo873super() < 1.03f) {
            return AbstractC7039l.firebase(f / interfaceC13490l.mo873super(), 4294967296L);
        }
        InterfaceC8917l interfaceC8917lYandex = AbstractC5443l.yandex(interfaceC13490l.mo873super());
        return AbstractC7039l.firebase(interfaceC8917lYandex != null ? interfaceC8917lYandex.yandex(f) : f / interfaceC13490l.mo873super(), 4294967296L);
    }

    public static C8195l remoteconfig(int i, C13848l c13848l) {
        return new C8195l(c13848l, new C13719l(i));
    }

    public static C8195l smaato(int i, C2420l c2420l) {
        return new C8195l(c2420l, new C8471l(i));
    }

    public static C13476l startapp(ArrayList arrayList, C13476l c13476l) {
        arrayList.add(c13476l);
        return new C13476l();
    }

    public static /* synthetic */ boolean subs(int i) {
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw null;
    }

    public static String subscription(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String tapsense(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static C8195l vip(int i, C14820l c14820l) {
        return new C8195l(c14820l, new C8471l(i));
    }

    public static C15421l yandex(InterfaceC0048l interfaceC0048l) {
        C15421l c15421l = (C15421l) interfaceC0048l.smaato(InterfaceC16352l.signatures, C15421l.crashlytics);
        c15421l.getClass();
        return c15421l;
    }
}
