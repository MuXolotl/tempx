package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٌْؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13095l {
    public static InterfaceC16902l Signature(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            InterfaceC15234l interfaceC15234lPro = ((InterfaceC1925l) interfaceC2224l).pro();
            if (interfaceC15234lPro instanceof InterfaceC16902l) {
                return (InterfaceC16902l) interfaceC15234lPro;
            }
            return null;
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return null;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static AbstractC15211l m3531abstract(InterfaceC5272l interfaceC5272l) {
        if (interfaceC5272l instanceof AbstractC4317l) {
            return ((AbstractC4317l) interfaceC5272l).f8856l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC5272l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC5272l.getClass(), sb));
        return null;
    }

    public static int ad(InterfaceC13199l interfaceC13199l) {
        if (interfaceC13199l instanceof InterfaceC16902l) {
            return AbstractC17457l.isPro(((InterfaceC16902l) interfaceC13199l).mo2182l());
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13199l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13199l.getClass(), sb));
        return 0;
    }

    public static InterfaceC13199l adcel(InterfaceC2224l interfaceC2224l, int i) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            return (InterfaceC13199l) ((InterfaceC1925l) interfaceC2224l).getParameters().get(i);
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return null;
    }

    public static C10636l admob(InterfaceC13789l interfaceC13789l) {
        if (interfaceC13789l instanceof AbstractC18041l) {
            return new C10636l(1, (AbstractC18041l) interfaceC13789l);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13789l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
        return null;
    }

    public static List ads(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            return ((InterfaceC1925l) interfaceC2224l).getParameters();
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return null;
    }

    public static boolean advert(InterfaceC13199l interfaceC13199l, InterfaceC2224l interfaceC2224l) {
        if (!(interfaceC13199l instanceof InterfaceC16902l)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC13199l);
            sb.append(", ");
            C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13199l.getClass(), sb));
            return false;
        }
        InterfaceC16902l interfaceC16902l = (InterfaceC16902l) interfaceC13199l;
        if (interfaceC2224l == null ? true : interfaceC2224l instanceof InterfaceC1925l) {
            return AbstractC12300l.admob(interfaceC16902l, (InterfaceC1925l) interfaceC2224l, null);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC16902l);
        sb2.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC16902l.getClass(), sb2));
        return false;
    }

    public static InterfaceC13340l amazon(InterfaceC12954l interfaceC12954l, InterfaceC6913l interfaceC6913l) {
        if (interfaceC6913l instanceof AbstractC15211l) {
            if (interfaceC6913l instanceof C7287l) {
                return interfaceC12954l.mo1171interface(((C7287l) interfaceC6913l).f15136l);
            }
            if (interfaceC6913l instanceof C16597l) {
                return (C16597l) interfaceC6913l;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC6913l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC6913l.getClass(), sb));
        return null;
    }

    public static boolean applovin(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            InterfaceC15234l interfaceC15234lPro = ((InterfaceC1925l) interfaceC2224l).pro();
            InterfaceC17477l interfaceC17477l = interfaceC15234lPro instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro : null;
            return (interfaceC17477l == null || interfaceC17477l.startapp() != 1 || interfaceC17477l.mo752l() == 3 || interfaceC17477l.mo752l() == 4 || interfaceC17477l.mo752l() == 5) ? false : true;
        }
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ")));
        return false;
    }

    public static boolean appmetrica(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            return ((InterfaceC1925l) interfaceC2224l).premium();
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return false;
    }

    public static AbstractC4317l billing(InterfaceC13789l interfaceC13789l) {
        if (interfaceC13789l instanceof AbstractC18041l) {
            AbstractC14318l abstractC14318lMo3847class = ((AbstractC18041l) interfaceC13789l).mo3847class();
            if (abstractC14318lMo3847class instanceof AbstractC4317l) {
                return (AbstractC4317l) abstractC14318lMo3847class;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13789l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public static AbstractC15211l m3532case(InterfaceC5272l interfaceC5272l) {
        if (interfaceC5272l instanceof AbstractC4317l) {
            return ((AbstractC4317l) interfaceC5272l).f8857l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC5272l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC5272l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public static void m3533catch(InterfaceC0583l interfaceC0583l) {
        if (interfaceC0583l instanceof AbstractC15211l) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0583l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l.getClass(), sb));
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public static int m3534class(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            return ((InterfaceC1925l) interfaceC2224l).getParameters().size();
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return 0;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public static AbstractC14318l m3535continue(InterfaceC13789l interfaceC13789l) {
        if (interfaceC13789l instanceof AbstractC14318l) {
            return AbstractC14506l.billing((AbstractC14318l) interfaceC13789l, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13789l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
        return null;
    }

    public static InterfaceC6440l crashlytics(InterfaceC0583l interfaceC0583l) {
        if (interfaceC0583l instanceof AbstractC15211l) {
            return (InterfaceC6440l) interfaceC0583l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0583l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final String[] m3536default(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 != null) {
            return strArrD1;
        }
        throw new C14612l("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public static final InterfaceC17242l m3537else(InterfaceC17242l interfaceC17242l, Function3 function3) {
        return interfaceC17242l.premium(new C2845l(function3));
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public static boolean m3538extends(InterfaceC13340l interfaceC13340l) {
        if (interfaceC13340l instanceof C16597l) {
            return ((C16597l) interfaceC13340l).f32571l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13340l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13340l.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public static AbstractC18041l m3539final(C2201l c2201l, InterfaceC13789l interfaceC13789l) {
        if (!(interfaceC13789l instanceof AbstractC14318l)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC13789l);
            sb.append(", ");
            C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
            return null;
        }
        if (c2201l instanceof C2201l) {
            return c2201l.billing(1, (AbstractC18041l) interfaceC13789l);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(c2201l);
        sb2.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, c2201l.getClass(), sb2));
        return null;
    }

    public static AbstractC14318l firebase(InterfaceC12954l interfaceC12954l, InterfaceC0583l interfaceC0583l, InterfaceC0583l interfaceC0583l2) {
        if (!(interfaceC0583l instanceof AbstractC15211l)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC12954l);
            sb.append(", ");
            C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC12954l.getClass(), sb));
            return null;
        }
        if (interfaceC0583l2 instanceof AbstractC15211l) {
            return AbstractC3605l.subs((AbstractC15211l) interfaceC0583l, (AbstractC15211l) interfaceC0583l2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC12954l);
        sb2.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC12954l.getClass(), sb2));
        return null;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public static boolean m3540for(InterfaceC0218l interfaceC0218l) {
        if (interfaceC0218l instanceof AbstractC4946l) {
            return ((AbstractC4946l) interfaceC0218l).crashlytics();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0218l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0218l.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public static Collection m3541goto(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            return ((InterfaceC1925l) interfaceC2224l).yandex();
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return null;
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static InterfaceC1925l m3542import(InterfaceC0583l interfaceC0583l) {
        if (interfaceC0583l instanceof AbstractC15211l) {
            return ((AbstractC15211l) interfaceC0583l).mo1339native();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0583l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l.getClass(), sb));
        return null;
    }

    public static boolean inmobi(InterfaceC13789l interfaceC13789l) {
        if (interfaceC13789l instanceof AbstractC18041l) {
            return AbstractC11748l.subs((AbstractC18041l) interfaceC13789l);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13789l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
        return false;
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static InterfaceC13789l m3543instanceof(InterfaceC12954l interfaceC12954l, InterfaceC13789l interfaceC13789l) {
        if (interfaceC13789l instanceof InterfaceC0583l) {
            return interfaceC12954l.isPro((InterfaceC0583l) interfaceC13789l);
        }
        if (interfaceC13789l instanceof InterfaceC5272l) {
            InterfaceC5272l interfaceC5272l = (InterfaceC5272l) interfaceC13789l;
            return interfaceC12954l.mo1194l(interfaceC12954l.isPro((InterfaceC0583l) interfaceC12954l.smaato(interfaceC5272l)), interfaceC12954l.isPro((InterfaceC0583l) interfaceC12954l.firebase(interfaceC5272l)));
        }
        C8339l.smaato("sealed");
        return null;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public static Collection m3544interface(InterfaceC12954l interfaceC12954l, InterfaceC0583l interfaceC0583l) {
        InterfaceC2224l interfaceC2224lMo1209package = interfaceC12954l.mo1209package(interfaceC0583l);
        if (interfaceC2224lMo1209package instanceof C13183l) {
            return ((C13183l) interfaceC2224lMo1209package).f25797l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0583l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l.getClass(), sb));
        return null;
    }

    public static int isPro(InterfaceC13340l interfaceC13340l) {
        if (interfaceC13340l instanceof C16597l) {
            return ((C16597l) interfaceC13340l).f32572l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13340l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13340l.getClass(), sb));
        return 0;
    }

    public static boolean isVip(InterfaceC0583l interfaceC0583l, InterfaceC0583l interfaceC0583l2) {
        if (!(interfaceC0583l instanceof AbstractC15211l)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC0583l);
            sb.append(", ");
            C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l.getClass(), sb));
            return false;
        }
        if (interfaceC0583l2 instanceof AbstractC15211l) {
            return ((AbstractC15211l) interfaceC0583l).inmobi() == ((AbstractC15211l) interfaceC0583l2).inmobi();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(interfaceC0583l2);
        sb2.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l2.getClass(), sb2));
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object license(C7644l c7644l, long j, AbstractC0283l abstractC0283l) {
        C13548l c13548l;
        if (abstractC0283l instanceof C13548l) {
            c13548l = (C13548l) abstractC0283l;
            int i = c13548l.f26567l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13548l.f26567l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13548l = new C13548l(abstractC0283l);
            }
        } else {
            c13548l = new C13548l(abstractC0283l);
        }
        Object objBilling = c13548l.f26568l;
        int i2 = c13548l.f26567l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objBilling);
            C17464l c17464l = new C17464l("users.get", C6928l.f14510l);
            c17464l.yandex("fields", "photo_100");
            c17464l.crashlytics(j, "user_id");
            c13548l.f26567l = 1;
            objBilling = c7644l.billing(c17464l, c13548l);
            Object obj = EnumC9342l.f19165l;
            if (objBilling == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objBilling);
        }
        return AbstractC10802l.admob((AbstractC14237l) objBilling, C9235l.f18989l);
    }

    public static int loadAd(InterfaceC13789l interfaceC13789l) {
        if (interfaceC13789l instanceof AbstractC18041l) {
            return ((AbstractC18041l) interfaceC13789l).inmobi().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13789l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
        return 0;
    }

    public static final Method metrica(InterfaceC5059l interfaceC5059l) {
        InterfaceC16148l interfaceC16148lIsPro;
        InterfaceC18672l interfaceC18672lYandex = AbstractC5592l.yandex(interfaceC5059l);
        Member memberLoadAd = (interfaceC18672lYandex == null || (interfaceC16148lIsPro = interfaceC18672lYandex.isPro()) == null) ? null : interfaceC16148lIsPro.loadAd();
        if (memberLoadAd instanceof Method) {
            return (Method) memberLoadAd;
        }
        return null;
    }

    public static AbstractC15211l mopub(InterfaceC13789l interfaceC13789l) {
        if (interfaceC13789l instanceof AbstractC18041l) {
            AbstractC14318l abstractC14318lMo3847class = ((AbstractC18041l) interfaceC13789l).mo3847class();
            if (abstractC14318lMo3847class instanceof AbstractC15211l) {
                return (AbstractC15211l) abstractC14318lMo3847class;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13789l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static boolean m3545native(InterfaceC13789l interfaceC13789l) {
        if (interfaceC13789l instanceof AbstractC18041l) {
            return AbstractC12008l.purchase((AbstractC18041l) interfaceC13789l);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13789l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static C3231l m3546new(InterfaceC12954l interfaceC12954l, InterfaceC0583l interfaceC0583l) {
        if (interfaceC0583l instanceof AbstractC15211l) {
            AbstractC18041l abstractC18041l = (AbstractC18041l) interfaceC0583l;
            return new C3231l(interfaceC12954l, new C2201l(AbstractC1124l.loadAd.vip(abstractC18041l.mo1339native(), abstractC18041l.inmobi())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0583l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static boolean m3547package(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            return interfaceC2224l instanceof C13183l;
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return false;
    }

    public static boolean premium(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            return ((InterfaceC1925l) interfaceC2224l).pro() instanceof InterfaceC17477l;
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static boolean m3548private(InterfaceC6913l interfaceC6913l) {
        if (interfaceC6913l instanceof AbstractC18041l) {
            return AbstractC16860l.m4207throws((AbstractC18041l) interfaceC6913l);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC6913l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC6913l.getClass(), sb));
        return false;
    }

    public static int pro(InterfaceC0218l interfaceC0218l) {
        if (interfaceC0218l instanceof AbstractC4946l) {
            return AbstractC17457l.isPro(((AbstractC4946l) interfaceC0218l).yandex());
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0218l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0218l.getClass(), sb));
        return 0;
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public static AbstractC15211l m3549public(InterfaceC0583l interfaceC0583l, boolean z) {
        if (interfaceC0583l instanceof AbstractC15211l) {
            return ((AbstractC15211l) interfaceC0583l).mo8static(z);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0583l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l.getClass(), sb));
        return null;
    }

    public static C15110l purchase(InterfaceC0583l interfaceC0583l) {
        if (interfaceC0583l instanceof AbstractC15211l) {
            if (interfaceC0583l instanceof C15110l) {
                return (C15110l) interfaceC0583l;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0583l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l.getClass(), sb));
        return null;
    }

    public static InterfaceC0218l remoteconfig(InterfaceC13789l interfaceC13789l, int i) {
        if (interfaceC13789l instanceof AbstractC18041l) {
            return (InterfaceC0218l) ((AbstractC18041l) interfaceC13789l).inmobi().get(i);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13789l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
        return null;
    }

    public static boolean signatures(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            return AbstractC16860l.m4206synchronized((InterfaceC1925l) interfaceC2224l, AbstractC3333l.yandex);
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return false;
    }

    public static final InterfaceC5059l smaato(Collection collection, Method method) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC6902l interfaceC6902l = (InterfaceC6902l) it.next();
            if (interfaceC6902l instanceof InterfaceC5059l) {
                InterfaceC5059l interfaceC5059l = (InterfaceC5059l) interfaceC6902l;
                if (AbstractC8576l.yandex(interfaceC5059l.getName(), method.getName()) && AbstractC8576l.yandex(metrica(interfaceC5059l), method)) {
                    return interfaceC5059l;
                }
            }
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            InterfaceC6902l interfaceC6902l2 = (InterfaceC6902l) it2.next();
            if (interfaceC6902l2 instanceof InterfaceC5059l) {
                InterfaceC5059l interfaceC5059l2 = (InterfaceC5059l) interfaceC6902l2;
                if (!AbstractC8576l.yandex(interfaceC5059l2.getName(), method.getName()) && AbstractC8576l.yandex(metrica(interfaceC5059l2), method)) {
                    return interfaceC5059l2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object startapp(C7644l c7644l, String str, AbstractC0283l abstractC0283l) {
        C2364l c2364l;
        if (abstractC0283l instanceof C2364l) {
            c2364l = (C2364l) abstractC0283l;
            int i = c2364l.f5125l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2364l.f5125l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2364l = new C2364l(abstractC0283l);
            }
        } else {
            c2364l = new C2364l(abstractC0283l);
        }
        Object objBilling = c2364l.f5126l;
        int i2 = c2364l.f5125l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objBilling);
            C17464l c17464l = new C17464l("users.get", C2782l.f6060l);
            c17464l.yandex("fields", "photo_100");
            c17464l.yandex("access_token", str);
            c2364l.f5125l = 1;
            objBilling = c7644l.billing(c17464l, c2364l);
            Object obj = EnumC9342l.f19165l;
            if (objBilling == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objBilling);
        }
        return AbstractC10802l.admob((AbstractC14237l) objBilling, C0937l.f2616l);
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public static AbstractC4946l m3550static(InterfaceC1633l interfaceC1633l) {
        if (interfaceC1633l instanceof C2314l) {
            return ((C2314l) interfaceC1633l).f5025l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC1633l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC1633l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static boolean m3551strictfp(InterfaceC13789l interfaceC13789l) {
        return (interfaceC13789l instanceof AbstractC15211l) && ((AbstractC15211l) interfaceC13789l).mo1342throw();
    }

    public static AbstractC15211l subs(InterfaceC0583l interfaceC0583l) {
        List listInmobi;
        ArrayList arrayList;
        C12426l c12426l = null;
        if (!(interfaceC0583l instanceof AbstractC15211l)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC0583l);
            sb.append(", ");
            C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l.getClass(), sb));
            return null;
        }
        AbstractC15211l abstractC15211l = (AbstractC15211l) interfaceC0583l;
        C13231l c13231l = C13231l.purchase;
        if (abstractC15211l.inmobi().size() == abstractC15211l.mo1339native().getParameters().size() && ((listInmobi = abstractC15211l.inmobi()) == null || !listInmobi.isEmpty())) {
            Iterator it = listInmobi.iterator();
            while (it.hasNext()) {
                if (((AbstractC4946l) it.next()).yandex() != 1) {
                    ArrayList<C8195l> arrayListM4226l = AbstractC16901l.m4226l(abstractC15211l.mo1339native().getParameters(), listInmobi);
                    arrayList = new ArrayList(AbstractC14055l.billing(arrayListM4226l, 10));
                    for (C8195l c8195l : arrayListM4226l) {
                        AbstractC4946l c10636l = (AbstractC4946l) c8195l.f17098l;
                        InterfaceC16902l interfaceC16902l = (InterfaceC16902l) c8195l.f17097l;
                        if (c10636l.yandex() != 1) {
                            c10636l = new C10636l(1, new C16597l(1, new C2314l(c10636l, c12426l, interfaceC16902l, 6), (c10636l.crashlytics() || c10636l.yandex() != 2) ? null : c10636l.loadAd().mo3847class(), (C16017l) null, false, 56));
                        }
                        arrayList.add(c10636l);
                    }
                    C2201l c2201l = new C2201l(AbstractC1124l.loadAd.vip(abstractC15211l.mo1339native(), arrayList));
                    int size = listInmobi.size();
                    for (int i = 0; i < size; i++) {
                        AbstractC4946l abstractC4946l = (AbstractC4946l) listInmobi.get(i);
                        AbstractC4946l abstractC4946l2 = (AbstractC4946l) arrayList.get(i);
                        if (abstractC4946l.yandex() != 1) {
                            List upperBounds = ((InterfaceC16902l) abstractC15211l.mo1339native().getParameters().get(i)).getUpperBounds();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(c13231l.admob(c2201l.billing(1, (AbstractC18041l) it2.next()).mo3847class()));
                            }
                            if (!abstractC4946l.crashlytics() && abstractC4946l.yandex() == 3) {
                                arrayList2.add(c13231l.admob(abstractC4946l.loadAd().mo3847class()));
                            }
                            C2314l c2314l = ((C16597l) abstractC4946l2.loadAd()).f32570l;
                            c2314l.getClass();
                            c2314l.f5024l = new C12426l(2, arrayList2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return AbstractC3605l.ads(abstractC15211l.mo1340package(), abstractC15211l.mo1339native(), arrayList, abstractC15211l.mo1342throw());
        }
        return null;
    }

    public static AbstractC18041l subscription(InterfaceC13199l interfaceC13199l) {
        if (interfaceC13199l instanceof InterfaceC16902l) {
            return AbstractC12300l.mopub((InterfaceC16902l) interfaceC13199l);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13199l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13199l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public static C2314l m3552super(InterfaceC13340l interfaceC13340l) {
        if (interfaceC13340l instanceof C16597l) {
            return ((C16597l) interfaceC13340l).f32570l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13340l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13340l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public static AbstractC14318l m3553switch(InterfaceC13340l interfaceC13340l) {
        if (interfaceC13340l instanceof C16597l) {
            return ((C16597l) interfaceC13340l).f32574l;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13340l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13340l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static boolean m3554synchronized(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            return interfaceC2224l instanceof C11794l;
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return false;
    }

    public static AbstractC14318l tapsense(InterfaceC12954l interfaceC12954l, InterfaceC0218l interfaceC0218l) {
        if (interfaceC12954l.vip(interfaceC0218l)) {
            return null;
        }
        if (interfaceC0218l instanceof AbstractC4946l) {
            return ((AbstractC4946l) interfaceC0218l).loadAd().mo3847class();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0218l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0218l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public static void m3555throw(InterfaceC0583l interfaceC0583l) {
        if (interfaceC0583l instanceof AbstractC15211l) {
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0583l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0583l.getClass(), sb));
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static boolean m3556throws(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            InterfaceC15234l interfaceC15234lPro = ((InterfaceC1925l) interfaceC2224l).pro();
            InterfaceC17477l interfaceC17477l = interfaceC15234lPro instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro : null;
            return (interfaceC17477l != null ? interfaceC17477l.mo753l() : null) instanceof C6065l;
        }
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ")));
        return false;
    }

    public static List vip(InterfaceC13789l interfaceC13789l) {
        if (interfaceC13789l instanceof AbstractC18041l) {
            return ((AbstractC18041l) interfaceC13789l).inmobi();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC13789l);
        sb.append(", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
        return null;
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static boolean m3557volatile(InterfaceC2224l interfaceC2224l) {
        if (interfaceC2224l instanceof InterfaceC1925l) {
            return AbstractC16860l.m4206synchronized((InterfaceC1925l) interfaceC2224l, AbstractC3333l.loadAd);
        }
        StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
        return false;
    }

    public static boolean yandex(InterfaceC2224l interfaceC2224l, InterfaceC2224l interfaceC2224l2) {
        if (!(interfaceC2224l instanceof InterfaceC1925l)) {
            StringBuilder sbSignature = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l, ", ");
            C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l.getClass(), sbSignature));
            return false;
        }
        if (interfaceC2224l2 instanceof InterfaceC1925l) {
            return interfaceC2224l.equals(interfaceC2224l2);
        }
        StringBuilder sbSignature2 = AbstractC14814l.Signature("ClassicTypeSystemContext couldn't handle: ", interfaceC2224l2, ", ");
        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC2224l2.getClass(), sbSignature2));
        return false;
    }
}
