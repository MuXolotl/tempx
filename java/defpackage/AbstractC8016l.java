package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8016l {
    public static final C15578l yandex = new C15578l(-1697580388, false, new C11112l(1));

    public static final InterfaceC13789l admob(InterfaceC13789l interfaceC13789l, InterfaceC13789l interfaceC13789l2) {
        AbstractC4317l abstractC4317lBilling;
        C13772l c13772l = C13772l.f26883l;
        AbstractC15211l abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l);
        if (abstractC15211lMopub == null && ((abstractC4317lBilling = AbstractC13095l.billing(interfaceC13789l)) == null || (abstractC15211lMopub = AbstractC13095l.m3532case(abstractC4317lBilling)) == null)) {
            abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l);
        }
        if (AbstractC13095l.Signature(AbstractC13095l.m3542import(abstractC15211lMopub)) != null) {
            return AbstractC13095l.m3545native(interfaceC13789l) ? c13772l.m3760l(interfaceC13789l2) : interfaceC13789l2;
        }
        InterfaceC0218l interfaceC0218l = (InterfaceC0218l) AbstractC16901l.m4208abstract(AbstractC13095l.vip(interfaceC13789l));
        if (AbstractC1136l.yandex[AbstractC5020l.inmobi(AbstractC13095l.pro(interfaceC0218l))] == 1) {
            c13772l.subs();
            throw null;
        }
        if (admob(AbstractC13095l.tapsense(c13772l, interfaceC0218l), interfaceC13789l2) instanceof AbstractC18041l) {
            c13772l.subs();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(c13772l);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC0653l.metrica(AbstractC18202l.yandex, c13772l.getClass(), sb).toString());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final void billing(C12095l c12095l, C16328l c16328l, C10312l c10312l, C14966l c14966l, C0382l c0382l, C9495l c9495l, InterfaceC5995l interfaceC5995l, InterfaceC3114l interfaceC3114l, C6438l c6438l, AbstractC0283l abstractC0283l) {
        C14955l c14955l;
        C0554l c13560l;
        if (abstractC0283l instanceof C14955l) {
            c14955l = (C14955l) abstractC0283l;
            int i = c14955l.f29428l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14955l.f29428l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14955l = new C14955l(abstractC0283l);
            }
        } else {
            c14955l = new C14955l(abstractC0283l);
        }
        C14955l c14955l2 = c14955l;
        Object obj = c14955l2.f29429l;
        int i2 = c14955l2.f29428l;
        if (i2 != 0) {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                AbstractC2829l.crashlytics(obj);
                C17132l.firebase();
                return;
            }
        }
        AbstractC2829l.crashlytics(obj);
        View view = c12095l.f24022l;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            c13560l = new C10582l(view);
        } else {
            c13560l = i3 >= 24 ? new C13560l(view) : new C0554l(view);
        }
        C0554l c0554l = c13560l;
        c14955l2.f29428l = 1;
        mopub(c12095l, c16328l, c10312l, c14966l, c0382l, c9495l, c0554l, interfaceC5995l, interfaceC3114l, c6438l, c14955l2);
    }

    public static final C1062l crashlytics(Context context) {
        C3224l c3224l;
        AbstractC1051l.isPro(context, "Context must not be null");
        C1062l c1062l = new C1062l(context, C1062l.smaato, null, C1308l.crashlytics);
        C11154l c11154l = C3224l.amazon;
        synchronized (C3224l.class) {
            try {
                C14672l c14672l = new C14672l(c1062l);
                C11154l c11154l2 = C3224l.amazon;
                if (!c11154l2.containsKey(c14672l)) {
                    c11154l2.put(c14672l, new C3224l());
                }
                c3224l = (C3224l) c11154l2.get(c14672l);
            } catch (Throwable th) {
                throw th;
            }
        }
        c1062l.firebase = c3224l;
        return c1062l;
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196  */
    /* JADX WARN: Code duplicated, block: B:78:0x019c  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x01be  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c5  */
    public static final InterfaceC13789l loadAd(InterfaceC13789l interfaceC13789l, HashSet hashSet) {
        AbstractC15211l abstractC15211l;
        InterfaceC13199l interfaceC13199lYandex;
        InterfaceC13789l interfaceC13789lAdmob;
        InterfaceC13789l interfaceC13789lLoadAd;
        InterfaceC1925l interfaceC1925lMetrica;
        C13772l c13772l = C13772l.f26883l;
        InterfaceC2224l interfaceC2224lMo1219this = c13772l.mo1219this(interfaceC13789l);
        if (hashSet.add(interfaceC2224lMo1219this)) {
            InterfaceC16902l interfaceC16902lSignature = AbstractC13095l.Signature(interfaceC2224lMo1219this);
            int i = 1;
            int i2 = 0;
            if (interfaceC16902lSignature != null) {
                InterfaceC13789l interfaceC13789lSubscription = AbstractC13095l.subscription(interfaceC16902lSignature);
                InterfaceC13789l interfaceC13789lLoadAd2 = loadAd(interfaceC13789lSubscription, hashSet);
                if (interfaceC13789lLoadAd2 != null) {
                    if (!AbstractC13095l.m3556throws(c13772l.mo1219this(interfaceC13789lSubscription)) && (!(interfaceC13789lSubscription instanceof InterfaceC6913l) || !AbstractC13095l.m3548private((InterfaceC6913l) interfaceC13789lSubscription))) {
                        i = 0;
                    }
                    if ((interfaceC13789lLoadAd2 instanceof InterfaceC6913l) && AbstractC13095l.m3548private((InterfaceC6913l) interfaceC13789lLoadAd2) && AbstractC13095l.m3545native(interfaceC13789l) && i != 0) {
                        return c13772l.m3760l(interfaceC13789lSubscription);
                    }
                    return (AbstractC13095l.m3545native(interfaceC13789lLoadAd2) || !AbstractC13095l.m3551strictfp(interfaceC13789l)) ? interfaceC13789lLoadAd2 : c13772l.m3760l(interfaceC13789lLoadAd2);
                }
            } else {
                if (!AbstractC13095l.m3556throws(interfaceC2224lMo1219this)) {
                    return interfaceC13789l;
                }
                List<InterfaceC13199l> listAds = AbstractC13095l.ads(c13772l.mo1219this(interfaceC13789l));
                List listVip = AbstractC13095l.vip(interfaceC13789l);
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listVip, 10));
                for (Object obj : listVip) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC14055l.subscription();
                        throw null;
                    }
                    InterfaceC13789l interfaceC13789lTapsense = AbstractC13095l.tapsense(c13772l, (InterfaceC0218l) obj);
                    if (interfaceC13789lTapsense == null) {
                        interfaceC13789lTapsense = AbstractC13095l.subscription((InterfaceC13199l) listAds.get(i2));
                    }
                    arrayList.add(interfaceC13789lTapsense);
                    i2 = i3;
                }
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(listAds, 10));
                for (InterfaceC13199l interfaceC13199l : listAds) {
                    if (interfaceC13199l instanceof InterfaceC16902l) {
                        interfaceC1925lMetrica = ((InterfaceC16902l) interfaceC13199l).metrica();
                    } else {
                        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb.append(interfaceC13199l);
                        sb.append(", ");
                        C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13199l.getClass(), sb));
                        interfaceC1925lMetrica = null;
                    }
                    arrayList2.add(interfaceC1925lMetrica);
                }
                Map mapSubscription = AbstractC8676l.subscription(AbstractC16901l.m4226l(arrayList, arrayList2));
                ArrayList arrayList3 = new ArrayList(mapSubscription.size());
                for (Map.Entry entry : mapSubscription.entrySet()) {
                    arrayList3.add(new C8195l((InterfaceC1925l) ((InterfaceC2224l) entry.getKey()), new C10636l(1, (AbstractC18041l) ((InterfaceC13789l) entry.getValue()))));
                }
                C2201l c2201l = new C2201l(new C13105l(i, AbstractC8676l.subscription(arrayList3)));
                if (interfaceC13789l instanceof AbstractC18041l) {
                    int i4 = AbstractC6245l.yandex;
                    InterfaceC15234l interfaceC15234lPro = ((AbstractC18041l) interfaceC13789l).mo1339native().pro();
                    InterfaceC17477l interfaceC17477l = interfaceC15234lPro instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC15234lPro : null;
                    if (interfaceC17477l != null) {
                        int i5 = AbstractC3759l.yandex;
                        AbstractC5645l abstractC5645lMo753l = interfaceC17477l.mo753l();
                        C6065l c6065l = abstractC5645lMo753l instanceof C6065l ? (C6065l) abstractC5645lMo753l : null;
                        abstractC15211l = c6065l != null ? (AbstractC15211l) c6065l.loadAd : null;
                    }
                    if (abstractC15211l == null) {
                        interfaceC13789lAdmob = null;
                    } else {
                        interfaceC13199lYandex = yandex(abstractC15211l);
                        if (interfaceC13199lYandex == null) {
                            interfaceC13789lAdmob = AbstractC13095l.m3539final(c2201l, abstractC15211l);
                        } else {
                            interfaceC13789lAdmob = admob(abstractC15211l, AbstractC13095l.m3539final(c2201l, AbstractC13095l.subscription(interfaceC13199lYandex)));
                        }
                    }
                    if (interfaceC13789lAdmob != null && (interfaceC13789lLoadAd = loadAd(interfaceC13789lAdmob, hashSet)) != null) {
                        if (!AbstractC13095l.m3545native(interfaceC13789l)) {
                            return interfaceC13789lLoadAd;
                        }
                        if (AbstractC13095l.m3545native(interfaceC13789lLoadAd)) {
                            return interfaceC13789l;
                        }
                        return ((interfaceC13789lLoadAd instanceof InterfaceC6913l) || !AbstractC13095l.m3548private((InterfaceC6913l) interfaceC13789lLoadAd)) ? c13772l.m3760l(interfaceC13789lLoadAd) : interfaceC13789l;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(interfaceC13789l);
                    sb2.append(", ");
                    C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb2));
                }
                if (abstractC15211l == null) {
                    interfaceC13789lAdmob = null;
                } else {
                    interfaceC13199lYandex = yandex(abstractC15211l);
                    if (interfaceC13199lYandex == null) {
                        interfaceC13789lAdmob = AbstractC13095l.m3539final(c2201l, abstractC15211l);
                    } else {
                        interfaceC13789lAdmob = admob(abstractC15211l, AbstractC13095l.m3539final(c2201l, AbstractC13095l.subscription(interfaceC13199lYandex)));
                    }
                }
                if (interfaceC13789lAdmob != null) {
                    if (!AbstractC13095l.m3545native(interfaceC13789l)) {
                        return interfaceC13789lLoadAd;
                    }
                    if (AbstractC13095l.m3545native(interfaceC13789lLoadAd)) {
                        return interfaceC13789l;
                    }
                    if (interfaceC13789lLoadAd instanceof InterfaceC6913l) {
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final void mopub(C12095l c12095l, C16328l c16328l, C10312l c10312l, C14966l c14966l, Function1 function1, Function0 function0, C0554l c0554l, InterfaceC5995l interfaceC5995l, InterfaceC3114l interfaceC3114l, Function1 function2, AbstractC0283l abstractC0283l) {
        C5878l c5878l;
        if (abstractC0283l instanceof C5878l) {
            c5878l = (C5878l) abstractC0283l;
            int i = c5878l.f12377l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5878l.f12377l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5878l = new C5878l(abstractC0283l);
            }
        } else {
            c5878l = new C5878l(abstractC0283l);
        }
        Object obj = c5878l.f12378l;
        int i2 = c5878l.f12377l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C1874l c1874l = new C1874l(interfaceC5995l, c16328l, c10312l, c0554l, c12095l, c14966l, function1, function0, interfaceC3114l, function2, null);
            c5878l.f12377l = 1;
            if (AbstractC11990l.admob(c1874l, c5878l) == EnumC9342l.f19165l) {
                return;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC2829l.crashlytics(obj);
        }
        C17132l.firebase();
    }

    public static final InterfaceC13199l yandex(InterfaceC13789l interfaceC13789l) {
        boolean zAdvert;
        AbstractC14318l abstractC14318lMo3847class;
        AbstractC4317l abstractC4317lBilling;
        AbstractC15211l abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l);
        if (abstractC15211lMopub == null && ((abstractC4317lBilling = AbstractC13095l.billing(interfaceC13789l)) == null || (abstractC15211lMopub = AbstractC13095l.m3532case(abstractC4317lBilling)) == null)) {
            abstractC15211lMopub = AbstractC13095l.mopub(interfaceC13789l);
        }
        InterfaceC16902l interfaceC16902lSignature = AbstractC13095l.Signature(AbstractC13095l.m3542import(abstractC15211lMopub));
        if (interfaceC16902lSignature != null) {
            return interfaceC16902lSignature;
        }
        if (interfaceC13789l instanceof AbstractC18041l) {
            zAdvert = AbstractC16860l.advert((AbstractC18041l) interfaceC13789l);
        } else {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC13789l);
            sb.append(", ");
            C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC13789l.getClass(), sb));
            zAdvert = false;
        }
        if (zAdvert) {
            InterfaceC0218l interfaceC0218l = (InterfaceC0218l) AbstractC16901l.m4208abstract(AbstractC13095l.vip(interfaceC13789l));
            if (AbstractC13095l.m3540for(interfaceC0218l)) {
                abstractC14318lMo3847class = null;
            } else {
                if (!(interfaceC0218l instanceof AbstractC4946l)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(interfaceC0218l);
                    sb2.append(", ");
                    C10754l.metrica(AbstractC0653l.metrica(AbstractC18202l.yandex, interfaceC0218l.getClass(), sb2));
                    return null;
                }
                abstractC14318lMo3847class = ((AbstractC4946l) interfaceC0218l).loadAd().mo3847class();
            }
            if (abstractC14318lMo3847class != null) {
                return yandex(abstractC14318lMo3847class);
            }
        }
        return null;
    }

    public abstract void amazon(int i);

    public abstract void purchase(Typeface typeface, boolean z);
}
