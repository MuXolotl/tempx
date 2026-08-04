package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18163l {
    public final ExecutorC6708l admob;
    public final C9426l amazon;
    public final C6335l billing;
    public final C4297l crashlytics;
    public final C0462l isPro;
    public final C1770l loadAd;
    public final ExecutorC6708l mopub;
    public final C4481l purchase;
    private volatile InterfaceC7042l serverJob;
    public final C9426l subs;
    public final C10038l yandex;

    public C18163l(C10038l c10038l, C1770l c1770l, boolean z, C4481l c4481l, C6335l c6335l) throws C10756l {
        String str;
        C2494l c2494l = (C2494l) c10038l.f20466l;
        C4297l c4297l = new C4297l(z);
        C18396l c18396lM1204l = c2494l.m1204l("ktor.deployment.shutdown.url");
        int i = 0;
        if (c18396lM1204l != null && (str = (String) ((Map) c18396lM1204l.f35933l).get((String) c18396lM1204l.f35934l)) != null) {
            AbstractC0007l.amazon(c4297l, C6635l.f13877l, new C6908l(str, i));
        }
        int i2 = 3;
        InterfaceC14029l interfaceC14029l = null;
        c4297l.firebase(C4297l.f8784l, new C7306l(i2, interfaceC14029l, i));
        this.yandex = c10038l;
        this.loadAd = c1770l;
        this.crashlytics = c4297l;
        C9426l c9426l = new C9426l();
        this.amazon = c9426l;
        C8807l c8807l = new C8807l();
        c8807l.yandex = true;
        TimeZone timeZone = AbstractC7973l.yandex;
        c8807l.loadAd = System.currentTimeMillis();
        C11911l c11911l = C12210l.f24263l;
        c4297l.f8787l.firebase(C8403l.f17387l, new C7690l(i2, interfaceC14029l, 1));
        c4297l.firebase(C4297l.f8785l, new C14688l((InterfaceC6272l) c10038l.f20462l, c4297l.f8788l, null));
        c1770l.subscription(AbstractC2749l.yandex, new C0464l(c8807l, c4297l, 14));
        c1770l.subscription(AbstractC2749l.amazon, new C0464l(c8807l, c10038l, 15));
        this.purchase = c4481l;
        this.billing = c6335l;
        C16552l c16552l = AbstractC11463l.yandex;
        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
        this.mopub = executorC6708l;
        this.admob = executorC6708l;
        C9426l c9426l2 = new C9426l();
        this.subs = c9426l2;
        C0462l c0462lYandex = AbstractC11174l.yandex();
        this.isPro = c0462lYandex;
        this.serverJob = AbstractC11174l.yandex();
        this.serverJob = AbstractC10999l.mopub(AbstractC11990l.yandex(((C14187l) c6335l.invoke()).f27781l.mo246l(executorC6708l)), null, 2, new C18146l(this, c9426l, c0462lYandex, c9426l2, c10038l, null), 1);
        this.serverJob.mo2154l(new C1412l(19, this));
    }

    public static final C13823l loadAd(C18163l c18163l, InterfaceC2262l interfaceC2262l, InterfaceC10011l interfaceC10011l) {
        String strCrashlytics = interfaceC10011l.crashlytics();
        int iLoadAd = interfaceC10011l.loadAd();
        long j = c18163l.purchase.amazon;
        C11023l c11023l = new C11023l(j, iLoadAd, strCrashlytics);
        InterfaceC14029l interfaceC14029l = null;
        C14082l c14082l = new C14082l(c18163l, interfaceC14029l, 1);
        InterfaceC6272l interfaceC6272l = AbstractC7098l.yandex;
        C9426l c9426l = new C9426l();
        C0462l c0462lYandex = AbstractC11174l.yandex();
        C7504l c7504lBilling = AbstractC10999l.billing(4, new C0499l("server-root-" + c11023l), interfaceC2262l, new C8912l(c0462lYandex, interfaceC14029l, 7));
        C9268l c9268l = new C9268l(interfaceC2262l.vip());
        C6760l c6760l = C9658l.f19699l;
        long jSignature = AbstractC15918l.Signature(j, EnumC16636l.SECONDS);
        C7504l c7504lMopub = AbstractC10999l.mopub(interfaceC2262l, AbstractC10586l.billing(c7504lBilling, new C0499l("accept-" + c11023l)), 0, new C18621l(c9268l, c11023l, c9426l, new C2993l(c7504lBilling), jSignature, c14082l, null), 2);
        c7504lMopub.mo2154l(new C3005l(c0462lYandex, c9426l, 21));
        c7504lBilling.mo2154l(new C17015l(6, c9268l));
        return new C13823l(c7504lBilling, c7504lMopub, c9426l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object amazon(long j, long j2, AbstractC0283l abstractC0283l) {
        C12346l c12346l;
        if (abstractC0283l instanceof C12346l) {
            c12346l = (C12346l) abstractC0283l;
            int i = c12346l.f24442l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12346l.f24442l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12346l = new C12346l(this, abstractC0283l);
            }
        } else {
            c12346l = new C12346l(this, abstractC0283l);
        }
        Object objAdmob = c12346l.f24445l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c12346l.f24442l;
        int i3 = 2;
        int i4 = 1;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            this.isPro.m561l();
            C11271l c11271l = new C11271l(this, interfaceC14029l, i3);
            c12346l.f24444l = j;
            c12346l.f24443l = j2;
            c12346l.f24442l = 1;
            objAdmob = AbstractC15342l.admob(j, c11271l, c12346l);
            if (objAdmob != enumC9342l) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(objAdmob);
                return objAdmob;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = c12346l.f24443l;
        j = c12346l.f24444l;
        AbstractC2829l.crashlytics(objAdmob);
        if (((Boolean) objAdmob) != null) {
            return Unit.INSTANCE;
        }
        this.serverJob.ads(null);
        C11271l c11271l2 = new C11271l(this, interfaceC14029l, i4);
        c12346l.f24444l = j;
        c12346l.f24443l = j2;
        c12346l.f24442l = 2;
        Object objAdmob2 = AbstractC15342l.admob(j2 - j, c11271l2, c12346l);
        return objAdmob2 == enumC9342l ? enumC9342l : objAdmob2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(boolean z, AbstractC0283l abstractC0283l) {
        C0257l c0257l;
        C1770l c1770l;
        C0847l c0847l;
        C10038l c10038l;
        InterfaceC6272l interfaceC6272l;
        if (abstractC0283l instanceof C0257l) {
            c0257l = (C0257l) abstractC0283l;
            int i = c0257l.f1248l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0257l.f1248l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0257l = new C0257l(this, abstractC0283l);
            }
        } else {
            c0257l = new C0257l(this, abstractC0283l);
        }
        Object obj = c0257l.f1249l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c0257l.f1248l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(obj);
                this.serverJob.start();
                C9426l c9426l = this.subs;
                c0257l.f1250l = z;
                c0257l.f1248l = 1;
                if (c9426l.firebase(c0257l) != enumC9342l) {
                }
                return enumC9342l;
            }
            if (i2 == 1) {
                z = c0257l.f1250l;
                AbstractC2829l.crashlytics(obj);
            } else {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            return this;
            c1770l.vip(c0847l, c10038l);
        } catch (Throwable th) {
            if (interfaceC6272l != null) {
                interfaceC6272l.amazon("Some handlers have thrown an exception", th);
            }
        }
        c1770l = this.loadAd;
        c0847l = AbstractC2749l.purchase;
        c10038l = this.yandex;
        interfaceC6272l = (InterfaceC6272l) c10038l.f20462l;
        if (z) {
            InterfaceC7042l interfaceC7042l = this.serverJob;
            c0257l.f1250l = z;
            c0257l.f1248l = 2;
            if (interfaceC7042l.mo2158switch(c0257l) == enumC9342l) {
                return enumC9342l;
            }
        }
        return this;
    }
}
