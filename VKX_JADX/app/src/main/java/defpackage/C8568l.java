package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.util.Base64;
import androidx.recyclerview.widget.subs;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2Replacement;
import ua.itaysonlab.catalogkit.objects.Catalog2Replacements;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8568l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f17676l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f17677l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f17678l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f17679l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8568l(Object obj, Object obj2, Object obj3, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f17678l = i;
        this.f17679l = obj;
        this.f17676l = obj2;
        this.f17677l = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x03eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Exception {
        Throwable th;
        LinkedHashMap linkedHashMap;
        VKProfile vKProfile;
        int i;
        Iterator c1477l;
        Throwable th2;
        Unit unit;
        InterfaceC9473l interfaceC9473lMo1516l;
        Throwable th3;
        C10507l c10507lIsPro;
        AbstractC18643l abstractC18643l;
        String yandex;
        Bitmap bitmapDecodeStream;
        int i2 = this.f17678l;
        int i3 = 2;
        int i4 = 0;
        ?? r12 = 1;
        ?? r13 = 1;
        ?? r14 = 0;
        num = null;
        num = null;
        num = null;
        Integer num = null;
        Throwable th4 = null;
        r14 = 0;
        Object obj2 = this.f17677l;
        Object obj3 = this.f17676l;
        switch (i2) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                ((Handler) this.f17679l).removeCallbacksAndMessages(null);
                ((DialogC0230l) obj3).dismiss();
                InterfaceC7042l interfaceC7042l = (InterfaceC7042l) ((C10700l) obj2).f21708l;
                if (interfaceC7042l != null) {
                    interfaceC7042l.ads(null);
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f17679l;
                AbstractC2829l.crashlytics(obj);
                C14025l c14025l = (C14025l) obj3;
                C6705l c6705l = (C6705l) obj2;
                new Exception("This should not be visible here!");
                int i5 = 0;
                while (true) {
                    try {
                        C12382l c12382l = AbstractC5921l.f12465l;
                        c12382l.adcel(c14025l, false);
                        C7167l c7167l = new C7167l(c12382l.mo691continue(c14025l, false));
                        try {
                            VKXApplication.Companion companion = VKXApplication.f36628l;
                            C11610l c11610l = AbstractC3629l.yandex;
                            if (c11610l == null) {
                                c11610l = null;
                            }
                            C11644l c11644l = new C11644l(28);
                            c11644l.f23358l = c6705l;
                            InterfaceC9473l interfaceC9473lMo1516l2 = c11610l.yandex(new C17032l(c11644l)).billing().f35907l.mo1516l();
                            while (AbstractC11990l.smaato(interfaceC2262l) && interfaceC9473lMo1516l2.ad(c7167l.f14998l, 65536L) != -1) {
                                try {
                                    c7167l.yandex();
                                } catch (Throwable th5) {
                                    try {
                                        throw th5;
                                    } catch (Throwable th6) {
                                        AbstractC7876l.loadAd(interfaceC9473lMo1516l2, th5);
                                        throw th6;
                                    }
                                }
                            }
                            Unit unit2 = Unit.INSTANCE;
                            AbstractC7876l.loadAd(interfaceC9473lMo1516l2, null);
                            try {
                                c7167l.close();
                                th = null;
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (Throwable th8) {
                            try {
                                c7167l.close();
                            } catch (Throwable th9) {
                                AbstractC11718l.yandex(th8, th9);
                            }
                            th = th8;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (i5 == 3) {
                            e.printStackTrace();
                            throw e;
                        }
                        i5++;
                    }
                }
                if (th == null) {
                    return Unit.INSTANCE;
                }
                throw th;
            case 2:
                AbstractC2829l.crashlytics(obj);
                AbstractC9694l abstractC9694l = ((C13983l) this.f17679l).f27282l;
                VKProfile vKProfile2 = (VKProfile) obj3;
                long j = vKProfile2.yandex;
                boolean z = !vKProfile2.billing.booleanValue();
                C9554l c9554l = abstractC9694l.f19774l;
                if (c9554l != null && (linkedHashMap = c9554l.isPro) != null && (vKProfile = (VKProfile) linkedHashMap.get(String.valueOf(j))) != null) {
                    vKProfile.billing = Boolean.valueOf(z);
                }
                Boolean boolValueOf = Boolean.valueOf(!vKProfile2.billing.booleanValue());
                vKProfile2.billing = boolValueOf;
                ((C10390l) obj2).f21210l.setIconResource(AbstractC8576l.yandex(boolValueOf, Boolean.TRUE) ? R.drawable.ic_unfavorite_outline_28 : R.drawable.ic_favorite_outline_28);
                return Unit.INSTANCE;
            case 3:
                AbstractC2829l.crashlytics(obj);
                C11270l c11270l = new C11270l(i4, (InterfaceC9354l) this.f17679l);
                InterfaceC13012l interfaceC13012l = ((C0861l) ((C11310l) obj3).loadAd.mo1617throws().get(0)).loadAd;
                AbstractC8237l abstractC8237l = (AbstractC8237l) obj2;
                InterfaceC16588l interfaceC16588lPurchase = AbstractC0135l.purchase(abstractC8237l.loadAd, new C11310l((InterfaceC1388l) interfaceC13012l.mo1616package(), interfaceC13012l));
                C13101l c13101l = new C13101l(new C5008l(c11270l), new char[16384], abstractC8237l.yandex);
                int iInmobi = AbstractC5020l.inmobi(3);
                if (iInmobi == 0) {
                    i = 1;
                } else {
                    if (iInmobi != 1) {
                        if (iInmobi != 2) {
                            C18725l.billing();
                            return null;
                        }
                        if (c13101l.advert() == 8) {
                            c13101l.subs((byte) 8);
                        } else {
                            i = 1;
                        }
                    } else {
                        if (c13101l.advert() != 8) {
                            String strMopub = AbstractC14205l.mopub((byte) 8);
                            int i6 = c13101l.f1972l;
                            int i7 = i6 > 0 ? i6 - 1 : i6;
                            C7475l c7475l = c13101l.f25629l;
                            AbstractC0576l.tapsense(c13101l, AbstractC14814l.ads("Expected ", strMopub, ", but had '", (i6 == c7475l.f15477l || i7 < 0) ? "EOF" : String.valueOf(c7475l.f15478l[i7]), "' instead"), i7, null, 4);
                            throw null;
                        }
                        c13101l.subs((byte) 8);
                    }
                    i = 2;
                }
                int iInmobi2 = AbstractC5020l.inmobi(i);
                if (iInmobi2 == 0) {
                    c1477l = new C1477l(abstractC8237l, c13101l, interfaceC16588lPurchase);
                } else {
                    if (iInmobi2 != 1) {
                        if (iInmobi2 != 2) {
                            C18725l.billing();
                            return null;
                        }
                        C8339l.smaato("AbstractJsonLexer.determineFormat must be called beforehand.");
                        return null;
                    }
                    c1477l = new C14445l(abstractC8237l, c13101l, interfaceC16588lPurchase);
                }
                return new C6714l(new C17374l(c1477l, 0));
            case 4:
                AbstractC2829l.crashlytics(obj);
                AbstractC9694l abstractC9694l2 = (AbstractC9694l) obj3;
                Catalog2Response catalog2Response = (Catalog2Response) obj2;
                abstractC9694l2.f19774l.yandex(catalog2Response);
                Catalog2Replacements catalog2Replacements = catalog2Response.amazon;
                String str = catalog2Replacements.loadAd;
                abstractC9694l2.f19777l = str;
                abstractC9694l2.f23160l = str != null;
                ?? arrayList = new ArrayList();
                for (Catalog2Replacement catalog2Replacement : catalog2Replacements.yandex) {
                    ArrayList arrayList2 = abstractC9694l2.f19773l;
                    ?? r4 = abstractC9694l2.f19775l;
                    Iterator it = arrayList2.iterator();
                    int i8 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i8 = -1;
                        } else if (!AbstractC8576l.yandex(((Catalog2Block) it.next()).getYandex(), catalog2Replacement.yandex.get(0))) {
                            i8++;
                        }
                    }
                    List<String> list = catalog2Replacement.yandex;
                    List list2 = catalog2Replacement.loadAd;
                    for (String str2 : list) {
                        if (!arrayList.contains(str2) && r4.containsKey(str2)) {
                            AbstractC3984l.ad(arrayList2, new C6908l(str2, 14));
                            abstractC9694l2.m1338try().premium((subs) r4.get(str2));
                            r4.remove(str2);
                        }
                    }
                    arrayList2.addAll(i8, list2);
                    abstractC9694l2.m2720implements(list2, new Integer(i8));
                    ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((Catalog2Block) it2.next()).getYandex());
                    }
                    arrayList.addAll(arrayList3);
                }
                return Unit.INSTANCE;
            case 5:
                AbstractC2829l.crashlytics(obj);
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f17679l;
                InterfaceC6843l interfaceC6843l = (InterfaceC6843l) obj3;
                InterfaceC2077l interfaceC2077l = (InterfaceC2077l) obj2;
                AbstractC10999l.mopub(interfaceC2262l2, null, 4, new C9837l(interfaceC6843l, interfaceC2077l, r14, r12 == true ? 1 : 0), 1);
                return AbstractC10999l.mopub(interfaceC2262l2, null, 4, new C9837l(interfaceC6843l, interfaceC2077l, r14, i3), 1);
            case 6:
                InterfaceC2262l interfaceC2262l3 = (InterfaceC2262l) this.f17679l;
                AbstractC2829l.crashlytics(obj);
                C10094l c10094l = new C10094l();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                c10094l.ad = AbstractC11432l.loadAd(15L, timeUnit);
                c10094l.isVip = AbstractC11432l.loadAd(240L, timeUnit);
                c10094l.advert = AbstractC11432l.loadAd(240L, timeUnit);
                c10094l.amazon.add(new C15181l((C4568l) obj3));
                C11610l c11610l2 = new C11610l(c10094l);
                C14025l c14025lCrashlytics = AbstractC1804l.loadAd().crashlytics();
                if (c14025lCrashlytics != null) {
                    AbstractC5921l.f12465l.mopub(c14025lCrashlytics);
                }
                C12382l c12382l2 = AbstractC5921l.f12465l;
                c12382l2.adcel(AbstractC1804l.loadAd(), false);
                String str3 = (String) obj2;
                C7167l c7167l2 = new C7167l(c12382l2.mo691continue(AbstractC1804l.loadAd(), false));
                try {
                    C11644l c11644l2 = new C11644l(28);
                    c11644l2.m3157l(str3);
                    AbstractC6897l abstractC6897l = c11610l2.yandex(new C17032l(c11644l2)).billing().f35907l;
                    if (abstractC6897l == null || (interfaceC9473lMo1516l = abstractC6897l.mo1516l()) == null) {
                        unit = null;
                    } else {
                        while (AbstractC11990l.smaato(interfaceC2262l3) && interfaceC9473lMo1516l.ad(c7167l2.f14998l, 65536L) != -1) {
                            try {
                                c7167l2.yandex();
                            } catch (Throwable th10) {
                                try {
                                    interfaceC9473lMo1516l.close();
                                } catch (Throwable th11) {
                                    AbstractC11718l.yandex(th10, th11);
                                }
                                th3 = th10;
                            }
                            break;
                        }
                        Unit unit3 = Unit.INSTANCE;
                        try {
                            interfaceC9473lMo1516l.close();
                            th3 = null;
                        } catch (Throwable th12) {
                            th3 = th12;
                        }
                        if (th3 != null) {
                            throw th3;
                        }
                        unit = Unit.INSTANCE;
                    }
                    try {
                        c7167l2.close();
                    } catch (Throwable th13) {
                        th4 = th13;
                    }
                    Throwable th14 = th4;
                    r14 = unit;
                    th2 = th14;
                    break;
                } catch (Throwable th15) {
                    th2 = th15;
                    try {
                        c7167l2.close();
                    } catch (Throwable th16) {
                        AbstractC11718l.yandex(th2, th16);
                    }
                    break;
                }
                if (th2 == null) {
                    return r14;
                }
                throw th2;
            case 7:
                C16811l c16811l = (C16811l) this.f17679l;
                AbstractC2829l.crashlytics(obj);
                String str4 = (String) obj2;
                C2258l c2258l = ((C16076l) obj3).f31521l;
                int iSubs = c2258l.subs.subs(str4);
                Integer numValueOf = Integer.valueOf(iSubs);
                if (iSubs < 0) {
                    numValueOf = null;
                }
                if (numValueOf != null && (c10507lIsPro = c2258l.isPro(str4)) != null && (abstractC18643l = c10507lIsPro.loadAd) != null && (yandex = abstractC18643l.getYandex()) != null) {
                    c2258l.purchase.smaato(yandex);
                    c2258l.billing.smaato(yandex);
                    num = numValueOf;
                }
                if (num != null) {
                    c16811l.mo2756extends(num.intValue());
                }
                return Unit.INSTANCE;
            case 8:
                AbstractC2829l.crashlytics(obj);
                for (C3547l c3547l : ((HashMap) ((C10712l) this.f17679l).crashlytics()).values()) {
                    Bitmap bitmap = c3547l.billing;
                    String str5 = c3547l.amazon;
                    if (bitmap == null && AbstractC16648l.isVip(str5, "data:", false) && AbstractC12024l.m3324for(str5, "base64,", 0, false, 6) > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(str5.substring(AbstractC12024l.m3321extends(str5, ',', 0, 6) + 1), 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            c3547l.billing = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e2) {
                            AbstractC17968l.crashlytics("data URL did not have correct base64 format.", e2);
                        }
                    }
                    Context context = (Context) obj3;
                    String str6 = (String) obj2;
                    if (c3547l.billing == null && str6 != null) {
                        try {
                            InputStream inputStreamOpen = context.getAssets().open(str6 + str5);
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options2);
                            } catch (IllegalArgumentException e3) {
                                AbstractC17968l.crashlytics("Unable to decode image.", e3);
                                bitmapDecodeStream = null;
                            }
                            if (bitmapDecodeStream != null) {
                                c3547l.billing = AbstractC4218l.amazon(bitmapDecodeStream, c3547l.yandex, c3547l.loadAd);
                            }
                        } catch (IOException e4) {
                            AbstractC17968l.crashlytics("Unable to open asset.", e4);
                        }
                        break;
                    }
                    break;
                }
                return Unit.INSTANCE;
            case 9:
                AbstractC2829l.crashlytics(obj);
                C11446l c11446l = (C11446l) this.f17679l;
                if (((Boolean) c11446l.isPro.getValue()).booleanValue()) {
                    ((C15552l) ((InterfaceC6497l) obj3)).loadAd(8, true, true);
                    C6523l.loadAd((C6523l) obj2);
                }
                c11446l.isPro.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 10:
                String str7 = (String) this.f17679l;
                AbstractC2829l.crashlytics(obj);
                if (((Boolean) ((InterfaceC12244l) obj2).getValue()).booleanValue()) {
                    ((C11446l) obj3).purchase.invoke(str7);
                }
                return Unit.INSTANCE;
            case 11:
                AbstractC2829l.crashlytics(obj);
                InterfaceC2262l interfaceC2262l4 = (InterfaceC2262l) this.f17679l;
                C4240l c4240l = (C4240l) obj3;
                C12217l c12217l = c4240l.f8681l;
                InterfaceC6843l interfaceC6843l2 = (InterfaceC6843l) obj2;
                C5514l c5514l = new C5514l(c12217l, c4240l, i3);
                InterfaceC14029l interfaceC14029l = null;
                AbstractC10999l.mopub(interfaceC2262l4, null, 4, new C14317l(c12217l, interfaceC6843l2, interfaceC14029l, i4), 1);
                AbstractC10999l.mopub(interfaceC2262l4, null, 4, new C8036l(c4240l, c12217l, interfaceC6843l2, c5514l, null, 9), 1);
                AbstractC10999l.mopub(interfaceC2262l4, null, 4, new C0932l(c12217l, interfaceC6843l2, c5514l, interfaceC14029l, 3), 1);
                return Unit.INSTANCE;
            case 12:
                AbstractC2829l.crashlytics(obj);
                InterfaceC2262l interfaceC2262l5 = (InterfaceC2262l) this.f17679l;
                C12217l c12217l2 = (C12217l) obj3;
                InterfaceC6843l interfaceC6843l3 = (InterfaceC6843l) obj2;
                AbstractC10999l.mopub(interfaceC2262l5, null, 4, new C14317l(c12217l2, interfaceC6843l3, r14, r13 == true ? 1 : 0), 1);
                AbstractC10999l.mopub(interfaceC2262l5, null, 4, new C14317l(c12217l2, interfaceC6843l3, r14, i3), 1);
                return AbstractC10999l.mopub(interfaceC2262l5, null, 4, new C14317l(interfaceC6843l3, c12217l2, null), 1);
            default:
                C13939l c13939l = (C13939l) this.f17679l;
                AbstractC2829l.crashlytics(obj);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c13939l.f27227l);
                C7968l c7968l = (C7968l) obj3;
                String str8 = (String) obj2;
                if (c7968l != null) {
                    linkedHashMap2.put(str8, c7968l);
                } else {
                    linkedHashMap2.remove(str8);
                }
                Unit unit4 = Unit.INSTANCE;
                return C13939l.loadAd(c13939l, null, null, null, linkedHashMap2, 23);
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f17678l;
        Object obj2 = this.f17677l;
        Object obj3 = this.f17676l;
        switch (i) {
            case 0:
                return new C8568l((Handler) this.f17679l, (DialogC0230l) obj3, (C10700l) obj2, interfaceC14029l, 0);
            case 1:
                C8568l c8568l = new C8568l((C14025l) obj3, (C6705l) obj2, interfaceC14029l, 1);
                c8568l.f17679l = obj;
                return c8568l;
            case 2:
                return new C8568l((C13983l) this.f17679l, (VKProfile) obj3, (C10390l) obj2, interfaceC14029l, 2);
            case 3:
                return new C8568l((InterfaceC9354l) this.f17679l, (C11310l) obj3, (AbstractC8237l) obj2, interfaceC14029l, 3);
            case 4:
                C8568l c8568l2 = new C8568l((AbstractC9694l) obj3, (Catalog2Response) obj2, interfaceC14029l, 4);
                c8568l2.f17679l = obj;
                return c8568l2;
            case 5:
                C8568l c8568l3 = new C8568l((InterfaceC6843l) obj3, (InterfaceC2077l) obj2, interfaceC14029l, 5);
                c8568l3.f17679l = obj;
                return c8568l3;
            case 6:
                C8568l c8568l4 = new C8568l((C4568l) obj3, (String) obj2, interfaceC14029l, 6);
                c8568l4.f17679l = obj;
                return c8568l4;
            case 7:
                C8568l c8568l5 = new C8568l((C16076l) obj3, (String) obj2, interfaceC14029l, 7);
                c8568l5.f17679l = obj;
                return c8568l5;
            case 8:
                return new C8568l((C10712l) this.f17679l, (Context) obj3, (String) obj2, interfaceC14029l, 8);
            case 9:
                return new C8568l((C11446l) this.f17679l, (InterfaceC6497l) obj3, (C6523l) obj2, interfaceC14029l, 9);
            case 10:
                C8568l c8568l6 = new C8568l((C11446l) obj3, (InterfaceC12244l) obj2, interfaceC14029l, 10);
                c8568l6.f17679l = obj;
                return c8568l6;
            case 11:
                C8568l c8568l7 = new C8568l((C4240l) obj3, (InterfaceC6843l) obj2, interfaceC14029l, 11);
                c8568l7.f17679l = obj;
                return c8568l7;
            case 12:
                C8568l c8568l8 = new C8568l((C12217l) obj3, (InterfaceC6843l) obj2, interfaceC14029l, 12);
                c8568l8.f17679l = obj;
                return c8568l8;
            default:
                C8568l c8568l9 = new C8568l((C7968l) obj3, (String) obj2, interfaceC14029l, 13);
                c8568l9.f17679l = obj;
                return c8568l9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17678l) {
            case 0:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C8568l) ads((InterfaceC14029l) obj2, (C16811l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C8568l) ads((InterfaceC14029l) obj2, (String) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C8568l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C8568l) ads((InterfaceC14029l) obj2, (C13939l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8568l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f17678l = i;
        this.f17676l = obj;
        this.f17677l = obj2;
    }
}
