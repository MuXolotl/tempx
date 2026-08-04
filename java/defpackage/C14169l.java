package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٕٓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14169l {
    public Object admob;
    public final Object amazon;
    public final Object billing;
    public final Object crashlytics;
    public final Object loadAd;
    public final Object mopub;
    public final Object purchase;
    public final Object yandex;

    public C14169l(int i) {
        switch (i) {
            case 4:
                Boolean bool = Boolean.FALSE;
                this.yandex = AbstractC8020l.smaato(bool);
                this.loadAd = new C13765l(1.0f);
                this.crashlytics = AbstractC8020l.smaato(bool);
                this.amazon = new C13765l(1.0f);
                this.purchase = AbstractC8020l.smaato(bool);
                this.billing = AbstractC8020l.smaato(new C1723l(C1723l.loadAd));
                this.mopub = AbstractC8020l.smaato(bool);
                this.admob = AbstractC8020l.smaato(new C9735l(C9735l.isPro));
                break;
            default:
                this.yandex = new int[16];
                this.loadAd = new int[16];
                this.crashlytics = new int[16];
                this.amazon = new int[16];
                this.purchase = new int[16];
                this.billing = new int[16];
                this.mopub = new int[16];
                this.admob = new int[16];
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object crashlytics(String str, int i, long j, C9049l c9049l, C14894l c14894l, AbstractC0283l abstractC0283l) throws Throwable {
        C18175l c18175l;
        C9049l c9049l2;
        C14894l c14894l2;
        long j2;
        int i2;
        String str2;
        if (abstractC0283l instanceof C18175l) {
            c18175l = (C18175l) abstractC0283l;
            int i3 = c18175l.f35610l;
            if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18175l.f35610l = i3 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18175l = new C18175l(this, abstractC0283l);
            }
        } else {
            c18175l = new C18175l(this, abstractC0283l);
        }
        Object objFirebase = c18175l.f35608l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i4 = c18175l.f35610l;
        int i5 = 1;
        InterfaceC14029l interfaceC14029l = null;
        if (i4 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            InterfaceC18322l interfaceC18322l = (InterfaceC18322l) this.loadAd;
            c18175l.f35607l = str;
            c18175l.f35606l = c9049l;
            c18175l.f35609l = c14894l;
            c18175l.f35603l = i;
            c18175l.f35604l = j;
            c18175l.f35610l = 1;
            C10596l c10596l = (C10596l) interfaceC18322l;
            synchronized (c10596l.billing) {
                InterfaceC5389l interfaceC5389l = (InterfaceC5389l) c10596l.billing.get(str);
                if (interfaceC5389l != null) {
                    objFirebase = interfaceC5389l;
                } else {
                    Unit unit = Unit.INSTANCE;
                    objFirebase = AbstractC10999l.firebase(c10596l.loadAd.amazon, new C13624l(c10596l, str, interfaceC14029l, 8), c18175l);
                }
            }
            if (objFirebase != enumC9342l) {
                c9049l2 = c9049l;
                c14894l2 = c14894l;
                j2 = j;
                i2 = i;
                str2 = str;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                AbstractC2829l.crashlytics(objFirebase);
                return objFirebase;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = c18175l.f35604l;
        int i6 = c18175l.f35603l;
        C14894l c14894l3 = c18175l.f35609l;
        C9049l c9049l3 = c18175l.f35606l;
        String str3 = c18175l.f35607l;
        AbstractC2829l.crashlytics(objFirebase);
        c14894l2 = c14894l3;
        j2 = j3;
        c9049l2 = c9049l3;
        str2 = str3;
        i2 = i6;
        C3945l c3945l = (C3945l) this.purchase;
        C10393l c10393l = (C10393l) this.crashlytics;
        C8409l c8409l = (C8409l) this.amazon;
        C11969l c11969l = (C11969l) this.mopub;
        C9066l c9066l = (C9066l) this.billing;
        C3649l c3649l = new C3649l(this, str2, new C12747l(str2, (InterfaceC5389l) objFirebase, i2, j2, c3945l, c10393l, c9049l2, c8409l, c11969l, c14894l2, c9066l.yandex, c9066l.loadAd), (InterfaceC14029l) null);
        c18175l.f35607l = null;
        c18175l.f35606l = null;
        c18175l.f35609l = null;
        c18175l.f35610l = 2;
        C16063l c16063l = new C16063l(c18175l.metrica(), c18175l, i5);
        Object objBilling = AbstractC1163l.billing(c16063l, true, c16063l, c3649l);
        return objBilling == enumC9342l ? enumC9342l : objBilling;
    }

    public void loadAd(InterfaceC3393l interfaceC3393l) {
        C1008l c1008l = (C1008l) this.yandex;
        c1008l.getClass();
        c1008l.remoteconfig(null, interfaceC3393l);
    }

    public void yandex(InterfaceC1507l interfaceC1507l, InterfaceC1507l interfaceC1507l2) {
        this.admob = (Function0) ((Function1) this.billing).invoke(interfaceC1507l);
        ((C11919l) this.mopub).subscription(((Function2) this.loadAd).invoke(interfaceC1507l, ((C0554l) this.yandex).inmobi()));
        ((C7442l) this.amazon).invoke(interfaceC1507l, interfaceC1507l2, Boolean.valueOf(((Function0) this.admob) != null));
    }

    public C14169l(InterfaceC2262l interfaceC2262l) {
        C1008l c1008lYandex = AbstractC11190l.yandex(C1946l.yandex);
        this.yandex = c1008lYandex;
        C1008l c1008lYandex2 = AbstractC11190l.yandex(null);
        this.loadAd = c1008lYandex2;
        this.crashlytics = AbstractC11190l.yandex(null);
        C1008l c1008lYandex3 = AbstractC11190l.yandex(null);
        this.amazon = c1008lYandex3;
        this.purchase = AbstractC0622l.yandex(c1008lYandex);
        this.billing = AbstractC0622l.yandex(c1008lYandex2);
        this.mopub = AbstractC0622l.yandex(c1008lYandex3);
        C2606l c2606l = new C2606l(c1008lYandex2, this, 5);
        Boolean bool = Boolean.FALSE;
        C11522l c11522lAmazon = AbstractC16829l.amazon(c2606l);
        C1008l c1008lYandex4 = AbstractC11190l.yandex(bool);
        this.admob = new C7549l(c1008lYandex4, AbstractC10999l.billing(1, (InterfaceC12932l) c11522lAmazon.purchase, interfaceC2262l, new C0384l(C16110l.yandex, (InterfaceC6942l) c11522lAmazon.amazon, c1008lYandex4, bool, (InterfaceC14029l) null, 20)));
    }

    public C14169l(C0554l c0554l, Function2 function2, Function2 function3, C7442l c7442l, Function3 function4, Function1 function1) {
        this.yandex = c0554l;
        this.loadAd = function2;
        this.crashlytics = function3;
        this.amazon = c7442l;
        this.purchase = function4;
        this.billing = function1;
        this.mopub = new C11919l(function2.invoke((InterfaceC1507l) c0554l.f1957l, c0554l.inmobi()));
        Function0 function0 = (Function0) function1.invoke((InterfaceC1507l) c0554l.f1957l);
        this.admob = function0;
        c7442l.invoke((InterfaceC1507l) c0554l.f1957l, null, Boolean.valueOf(function0 != null));
    }

    public C14169l(C18595l c18595l, InterfaceC18322l interfaceC18322l, C10393l c10393l, C8409l c8409l, C3945l c3945l, C9066l c9066l, C11969l c11969l) {
        this.yandex = c18595l;
        this.loadAd = interfaceC18322l;
        this.crashlytics = c10393l;
        this.amazon = c8409l;
        this.purchase = c3945l;
        this.billing = c9066l;
        this.mopub = c11969l;
        this.admob = new C9426l();
    }
}
