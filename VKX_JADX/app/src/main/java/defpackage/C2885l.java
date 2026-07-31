package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lؔۚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2885l extends AbstractC10545l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C8688l f6281l = new C8688l(new C6573l(21));

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final InterfaceC12932l f6282l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final InterfaceC12932l f6283l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C4708l f6284l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Map f6285l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Set f6286l = AbstractC8669l.m2407import(new InterfaceC17183l[]{C10837l.yandex, C15688l.yandex, C18042l.yandex});

    public C2885l(C4708l c4708l) {
        this.f6284l = c4708l;
        this.f6285l = DesugarCollections.synchronizedMap(new C5656l(new C15406l(1, this, C2885l.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0, 0, 9), new C1306l(15), c4708l.crashlytics));
        if (System.getProperty("kotlinx.io.pool.size.bytes") == null && AbstractC8576l.yandex(System.getProperty("java.vm.name"), "Dalvik") && Runtime.getRuntime().maxMemory() > 10000000) {
            System.setProperty("kotlinx.io.pool.size.bytes", "2097152");
        }
        InterfaceC12932l interfaceC12932lBilling = AbstractC10586l.billing(new C2993l(AbstractC11174l.mopub(super.vip())), new C16989l(C13772l.f26879l, 0));
        this.f6282l = interfaceC12932lBilling;
        this.f6283l = super.vip().mo246l(interfaceC12932lBilling);
        AbstractC10999l.billing(3, super.vip(), C1732l.f4136l, new C8912l(this, null, 29));
    }

    @Override // defpackage.AbstractC10545l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        ((C0462l) this.f6282l.mo245l(C1083l.f2996l)).m561l();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object mopub(C11610l c11610l, C17032l c17032l, InterfaceC12932l interfaceC12932l, C6472l c6472l, AbstractC0283l abstractC0283l) {
        C16066l c16066l;
        C8485l c8485l;
        InterfaceC12932l interfaceC12932l2;
        C6472l c6472l2 = c6472l;
        if (abstractC0283l instanceof C16066l) {
            c16066l = (C16066l) abstractC0283l;
            int i = c16066l.f31471l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16066l.f31471l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16066l = new C16066l(this, abstractC0283l);
            }
        } else {
            c16066l = new C16066l(this, abstractC0283l);
        }
        Object obj = c16066l.f31467l;
        int i2 = c16066l.f31471l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C8485l c8485lLoadAd = AbstractC7973l.loadAd(null);
            c16066l.f31470l = interfaceC12932l;
            c16066l.f31469l = c6472l2;
            c16066l.f31472l = c8485lLoadAd;
            c16066l.f31471l = 1;
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(c16066l));
            c2397l.license();
            C17778l c17778lYandex = c11610l.yandex(c17032l);
            ((InterfaceC7042l) interfaceC12932l.mo245l(C1083l.f2996l)).signatures(true, new C4193l(c17778lYandex, 2), true);
            c17778lYandex.purchase(new C13645l(c6472l2, c2397l, 6));
            Object objSignature = c2397l.Signature();
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSignature == enumC9342l) {
                return enumC9342l;
            }
            c8485l = c8485lLoadAd;
            interfaceC12932l2 = interfaceC12932l;
            obj = objSignature;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C8485l c8485l2 = c16066l.f31472l;
            c6472l2 = c16066l.f31469l;
            InterfaceC12932l interfaceC12932l3 = c16066l.f31470l;
            AbstractC2829l.crashlytics(obj);
            c8485l = c8485l2;
            interfaceC12932l2 = interfaceC12932l3;
        }
        C18389l c18389l = (C18389l) obj;
        AbstractC6897l abstractC6897l = c18389l.f35907l;
        AbstractC11174l.mopub(interfaceC12932l2).mo2154l(new C8250l(11, abstractC6897l));
        C4993l c4993l = AbstractC7572l.license(2, interfaceC12932l2, C1732l.f4136l, new C9874l(abstractC6897l.mo1516l(), interfaceC12932l2, c6472l2, null)).yandex;
        C2759l c2759l = new C2759l(c18389l.f35915l, c18389l.f35906l);
        int iOrdinal = c18389l.f35910l.ordinal();
        C2369l c2369l = C2369l.purchase;
        switch (iOrdinal) {
            case 0:
                c2369l = C2369l.mopub;
                break;
            case 1:
                c2369l = C2369l.billing;
                break;
            case 2:
                c2369l = C2369l.admob;
                break;
            case 3:
            case 4:
                break;
            case 5:
                c2369l = C2369l.subs;
                break;
            case 6:
                c2369l = C2369l.amazon;
                break;
            default:
                C18725l.billing();
                return null;
        }
        C2369l c2369l2 = c2369l;
        C5918l c5918l = new C5918l(c18389l.f35918l);
        if (!AbstractC2812l.advert(c4993l) || ((C17535l) c6472l2.f13510l).billing(AbstractC12323l.yandex) == null) {
            return new C3603l(c2759l, c8485l, c5918l, c2369l2, c4993l, interfaceC12932l2);
        }
        C18725l.loadAd();
        return null;
    }

    @Override // defpackage.AbstractC10545l, defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f6283l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object yandex(C6472l c6472l, AbstractC0283l abstractC0283l) {
        C2233l c2233l;
        C6472l c6472l2;
        Object obj;
        String strSignatures;
        String strSignatures2;
        C6472l c6472l3;
        AbstractC10033l abstractC10033lYandex;
        C12105l c12105lM674strictfp;
        String strValueOf;
        if (abstractC0283l instanceof C2233l) {
            c2233l = (C2233l) abstractC0283l;
            int i = c2233l.f4911l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2233l.f4911l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2233l = new C2233l(this, abstractC0283l);
            }
        } else {
            c2233l = new C2233l(this, abstractC0283l);
        }
        C2233l c2233l2 = c2233l;
        Object obj2 = c2233l2.f4912l;
        int i2 = c2233l2.f4911l;
        Object obj3 = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj2);
            c6472l2 = c6472l;
            c2233l2.f4913l = c6472l2;
            c2233l2.f4911l = 1;
            Set set = AbstractC16194l.yandex;
            obj = ((l) c2233l2.f1295l.mo245l(l.f845l)).f846l;
            if (obj != obj3) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(obj2);
                return obj2;
            }
            if (i2 == 3) {
                AbstractC2829l.crashlytics(obj2);
                return obj2;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C6472l c6472l4 = c2233l2.f4913l;
        AbstractC2829l.crashlytics(obj2);
        obj = obj2;
        c6472l2 = c6472l4;
        InterfaceC12932l interfaceC12932l = (InterfaceC12932l) obj;
        int i3 = 28;
        C11644l c11644l = new C11644l(28);
        C2540l c2540l = (C2540l) c6472l2.f13512l;
        AbstractC8870l abstractC8870l = (AbstractC8870l) c6472l2.f13514l;
        c11644l.m3157l(c2540l.f5525l);
        C17721l c17721l = (C17721l) c6472l2.f13509l;
        String str = c17721l.yandex;
        boolean z = AbstractC9569l.yandex.contains(c17721l) && (abstractC8870l instanceof AbstractC8503l);
        C3223l c3223l = (C3223l) c6472l2.f13515l;
        C1726l c1726l = new C1726l(z, c11644l);
        Set set2 = AbstractC16194l.yandex;
        C0090l c0090l = new C0090l(13);
        c0090l.m233l(c3223l);
        c0090l.m233l(abstractC8870l.crashlytics());
        Unit unit = Unit.INSTANCE;
        c0090l.m273l().isVip(new C1645l(i3, c1726l));
        if (c3223l.signatures("User-Agent") == null && abstractC8870l.crashlytics().signatures("User-Agent") == null) {
            boolean z2 = AbstractC4981l.yandex;
            c1726l.invoke("User-Agent", "ktor-client");
        }
        C5254l c5254lLoadAd = abstractC8870l.loadAd();
        if ((c5254lLoadAd == null || (strSignatures = c5254lLoadAd.toString()) == null) && (strSignatures = abstractC8870l.crashlytics().signatures("Content-Type")) == null) {
            strSignatures = c3223l.signatures("Content-Type");
        }
        Long lYandex = abstractC8870l.yandex();
        if (lYandex == null || (strValueOf = String.valueOf(lYandex.longValue())) == null) {
            strSignatures2 = abstractC8870l.crashlytics().signatures("Content-Length");
            if (strSignatures2 == null) {
                strSignatures2 = c3223l.signatures("Content-Length");
            }
        } else {
            strSignatures2 = strValueOf;
        }
        if (strSignatures != null) {
            c1726l.invoke("Content-Type", strSignatures);
        }
        if (strSignatures2 != null) {
            c1726l.invoke("Content-Length", strSignatures2);
        }
        if (AbstractC3670l.purchase(str)) {
            if (abstractC8870l instanceof AbstractC12972l) {
                byte[] bArrPurchase = ((AbstractC12972l) abstractC8870l).purchase();
                C11155l c11155l = C12105l.amazon;
                try {
                    c12105lM674strictfp = AbstractC0775l.m674strictfp(String.valueOf(abstractC8870l.loadAd()));
                } catch (IllegalArgumentException unused) {
                    c12105lM674strictfp = null;
                }
                abstractC10033lYandex = C15655l.yandex(bArrPurchase.length, c12105lM674strictfp, bArrPurchase);
            } else if (abstractC8870l instanceof AbstractC16869l) {
                abstractC10033lYandex = new C0221l(interfaceC12932l, abstractC8870l.yandex(), new C10740l(12, abstractC8870l));
            } else if (abstractC8870l instanceof C4940l) {
                abstractC10033lYandex = new C0221l(interfaceC12932l, abstractC8870l.yandex(), new C9810l(interfaceC12932l, abstractC8870l, i3));
            } else {
                if (!(abstractC8870l instanceof AbstractC8503l)) {
                    C18725l.billing();
                    return null;
                }
                c6472l3 = null;
                abstractC10033lYandex = C15655l.yandex(0, null, new byte[0]);
            }
            c6472l3 = null;
        } else {
            c6472l3 = null;
            abstractC10033lYandex = null;
        }
        c11644l.m3145l(str, abstractC10033lYandex);
        C17032l c17032l = new C17032l(c11644l);
        C11610l c11610l = (C11610l) this.f6285l.get(c6472l2.loadAd());
        if (c11610l == null) {
            C8339l.smaato("OkHttpClient can't be constructed because HttpTimeout plugin is not installed");
            return c6472l3;
        }
        C11911l c11911l = AbstractC12323l.yandex;
        c2233l2.f4913l = c6472l3;
        c2233l2.f4911l = 3;
        Object objMopub = mopub(c11610l, c17032l, interfaceC12932l, c6472l2, c2233l2);
        return objMopub == obj3 ? obj3 : objMopub;
    }
}
