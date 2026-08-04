package defpackage;

import android.os.Trace;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًؓؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7737l extends AbstractC14165l implements InterfaceC6752l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C13206l f16234l = new C13206l(19);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C7549l f16237l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C1008l f16238l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public AbstractC8939l f16239l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C1008l f16241l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C13204l f16242l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public InterfaceC7042l f16243l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public InterfaceC2262l f16245l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f16246l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public Function1 f16249l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public C11084l f16250l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C10086l f16247l = AbstractC8020l.smaato(null);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public float f16236l = 1.0f;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public long f16248l = 9205357640488583168L;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public Function1 f16235l = f16234l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public InterfaceC17030l f16244l = C4176l.loadAd;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public int f16240l = 1;

    public C7737l(C11084l c11084l) {
        this.f16250l = c11084l;
        this.f16241l = AbstractC11190l.yandex(c11084l);
        C1008l c1008lYandex = AbstractC11190l.yandex(C2528l.yandex);
        this.f16238l = c1008lYandex;
        this.f16237l = AbstractC0622l.yandex(c1008lYandex);
    }

    public static final C7819l firebase(C7737l c7737l, C7819l c7819l, boolean z) {
        C9477l c9477lYandex = C7819l.yandex(c7819l);
        c9477lYandex.amazon = new C0458l(c7819l, c7737l, 7);
        C7934l c7934l = c7819l.license;
        if (c7934l.admob == null) {
            c9477lYandex.adcel = InterfaceC0476l.f1732l;
        }
        if (c7934l.subs == 0) {
            InterfaceC17030l interfaceC17030l = c7737l.f16244l;
            int i = AbstractC1924l.loadAd;
            c9477lYandex.ads = (AbstractC8576l.yandex(interfaceC17030l, C4176l.loadAd) || AbstractC8576l.yandex(interfaceC17030l, C4176l.amazon)) ? 2 : 1;
        }
        if (c7934l.isPro == 0) {
            c9477lYandex.subscription = 2;
        }
        if (z) {
            C17218l c17218l = C17218l.f33421l;
            c9477lYandex.subs = c17218l;
            c9477lYandex.isPro = c17218l;
            c9477lYandex.firebase = c17218l;
        }
        return c9477lYandex.yandex();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void smaato(C7737l c7737l, InterfaceC4141l interfaceC4141l) {
        InterfaceC11509l interfaceC11509l;
        AbstractC14165l abstractC14165lYandex;
        Function1 function1;
        Object objYandex;
        InterfaceC6752l interfaceC6752l;
        InterfaceC6752l interfaceC6752l2;
        C1008l c1008l = c7737l.f16238l;
        InterfaceC4141l interfaceC4141l2 = (InterfaceC4141l) c1008l.getValue();
        InterfaceC4141l interfaceC4141l3 = (InterfaceC4141l) c7737l.f16235l.invoke(interfaceC4141l);
        c1008l.smaato(interfaceC4141l3);
        InterfaceC17030l interfaceC17030l = c7737l.f16244l;
        if (!(interfaceC4141l3 instanceof C16508l)) {
            if (interfaceC4141l3 instanceof C10710l) {
                interfaceC11509l = ((C10710l) interfaceC4141l3).loadAd;
            } else {
                abstractC14165lYandex = null;
            }
            if (abstractC14165lYandex == null) {
                abstractC14165lYandex = interfaceC4141l3.yandex();
            }
            c7737l.f16247l.setValue(abstractC14165lYandex);
            if (interfaceC4141l2.yandex() != interfaceC4141l3.yandex()) {
                objYandex = interfaceC4141l2.yandex();
                if (objYandex instanceof InterfaceC6752l) {
                    interfaceC6752l = (InterfaceC6752l) objYandex;
                } else {
                    interfaceC6752l = null;
                }
                if (interfaceC6752l != null) {
                    interfaceC6752l.loadAd();
                }
                Object objYandex2 = interfaceC4141l3.yandex();
                interfaceC6752l2 = objYandex2 instanceof InterfaceC6752l ? (InterfaceC6752l) objYandex2 : null;
                if (interfaceC6752l2 != null) {
                    interfaceC6752l2.crashlytics();
                }
            }
            function1 = c7737l.f16249l;
            if (function1 != null) {
                function1.invoke(interfaceC4141l3);
            }
        }
        interfaceC11509l = ((C16508l) interfaceC4141l3).loadAd;
        InterfaceC11152l interfaceC11152lYandex = ((InterfaceC3457l) AbstractC0532l.crashlytics(interfaceC11509l.billing(), AbstractC10413l.yandex)).yandex(AbstractC6689l.yandex, interfaceC11509l);
        if (interfaceC11152lYandex instanceof C10920l) {
            AbstractC14165l abstractC14165lYandex2 = interfaceC4141l2.yandex();
            if (!(interfaceC4141l2 instanceof C12477l)) {
                abstractC14165lYandex2 = null;
            }
            AbstractC14165l abstractC14165lYandex3 = interfaceC4141l3.yandex();
            C6760l c6760l = C9658l.f19699l;
            abstractC14165lYandex = new C14808l(abstractC14165lYandex2, abstractC14165lYandex3, interfaceC17030l, AbstractC15918l.tapsense(((C10920l) interfaceC11152lYandex).crashlytics, EnumC16636l.MILLISECONDS), ((interfaceC11509l instanceof C6165l) && ((C6165l) interfaceC11509l).mopub) ? false : true, ((Boolean) AbstractC0532l.crashlytics(interfaceC11509l.billing(), AbstractC6764l.loadAd)).booleanValue());
        } else {
            abstractC14165lYandex = null;
        }
        if (abstractC14165lYandex == null) {
            abstractC14165lYandex = interfaceC4141l3.yandex();
        }
        c7737l.f16247l.setValue(abstractC14165lYandex);
        if (interfaceC4141l2.yandex() != interfaceC4141l3.yandex()) {
            objYandex = interfaceC4141l2.yandex();
            if (objYandex instanceof InterfaceC6752l) {
                interfaceC6752l = (InterfaceC6752l) objYandex;
            } else {
                interfaceC6752l = null;
            }
            if (interfaceC6752l != null) {
                interfaceC6752l.loadAd();
            }
            Object objYandex3 = interfaceC4141l3.yandex();
            if (objYandex3 instanceof InterfaceC6752l) {
            }
            if (interfaceC6752l2 != null) {
                interfaceC6752l2.crashlytics();
            }
        }
        function1 = c7737l.f16249l;
        if (function1 != null) {
            function1.invoke(interfaceC4141l3);
        }
    }

    @Override // defpackage.AbstractC14165l
    public final boolean amazon(float f) {
        this.f16236l = f;
        return true;
    }

    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objRemoteconfig = remoteconfig();
            InterfaceC6752l interfaceC6752l = objRemoteconfig instanceof InterfaceC6752l ? (InterfaceC6752l) objRemoteconfig : null;
            if (interfaceC6752l != null) {
                interfaceC6752l.crashlytics();
            }
            vip();
            this.f16246l = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.AbstractC14165l
    public final void isPro(InterfaceC13349l interfaceC13349l) {
        long jAdmob = interfaceC13349l.admob();
        if (!C14174l.loadAd(this.f16248l, jAdmob)) {
            this.f16248l = jAdmob;
        }
        AbstractC14165l abstractC14165lRemoteconfig = remoteconfig();
        if (abstractC14165lRemoteconfig != null) {
            abstractC14165lRemoteconfig.mopub(interfaceC13349l, interfaceC13349l.admob(), this.f16236l, this.f16239l);
        }
    }

    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
        InterfaceC7042l interfaceC7042l = this.f16243l;
        if (interfaceC7042l != null) {
            interfaceC7042l.ads(null);
        }
        this.f16243l = null;
        Object objRemoteconfig = remoteconfig();
        InterfaceC6752l interfaceC6752l = objRemoteconfig instanceof InterfaceC6752l ? (InterfaceC6752l) objRemoteconfig : null;
        if (interfaceC6752l != null) {
            interfaceC6752l.loadAd();
        }
        this.f16246l = false;
    }

    public final void metrica(C11084l c11084l) {
        if (AbstractC8576l.yandex(this.f16250l, c11084l)) {
            return;
        }
        this.f16250l = c11084l;
        if (c11084l == null) {
            InterfaceC7042l interfaceC7042l = this.f16243l;
            if (interfaceC7042l != null) {
                interfaceC7042l.ads(null);
            }
            this.f16243l = null;
        } else if (this.f16246l) {
            vip();
        }
        if (c11084l != null) {
            C1008l c1008l = this.f16241l;
            c1008l.getClass();
            c1008l.remoteconfig(null, c11084l);
        }
    }

    @Override // defpackage.AbstractC14165l
    public final boolean purchase(AbstractC8939l abstractC8939l) {
        this.f16239l = abstractC8939l;
        return true;
    }

    public final AbstractC14165l remoteconfig() {
        return (AbstractC14165l) this.f16247l.getValue();
    }

    @Override // defpackage.AbstractC14165l
    public final long subs() {
        AbstractC14165l abstractC14165lRemoteconfig = remoteconfig();
        if (abstractC14165lRemoteconfig != null) {
            return abstractC14165lRemoteconfig.subs();
        }
        return 9205357640488583168L;
    }

    public final void vip() {
        C7504l c7504lBilling;
        C11084l c11084l = this.f16250l;
        if (c11084l == null) {
            return;
        }
        InterfaceC2262l interfaceC2262l = this.f16245l;
        InterfaceC14029l interfaceC14029l = null;
        if (interfaceC2262l == null) {
            interfaceC2262l = null;
        }
        C7641l c7641l = new C7641l(this, c11084l, interfaceC14029l, 11);
        InterfaceC12932l interfaceC12932lVip = interfaceC2262l.vip();
        int i = AbstractC1924l.loadAd;
        AbstractC1872l abstractC1872l = (AbstractC1872l) interfaceC12932lVip.mo245l(AbstractC1872l.f4294l);
        if (abstractC1872l == null || abstractC1872l.equals(AbstractC11463l.loadAd)) {
            c7504lBilling = AbstractC10999l.billing(4, AbstractC11463l.loadAd, interfaceC2262l, c7641l);
        } else {
            c7504lBilling = AbstractC10999l.billing(4, new C4295l(abstractC1872l), AbstractC11990l.yandex(new C18658l(interfaceC2262l.vip())), c7641l);
        }
        InterfaceC7042l interfaceC7042l = this.f16243l;
        if (interfaceC7042l != null) {
            interfaceC7042l.ads(null);
        }
        this.f16243l = c7504lBilling;
    }

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
        InterfaceC7042l interfaceC7042l = this.f16243l;
        if (interfaceC7042l != null) {
            interfaceC7042l.ads(null);
        }
        this.f16243l = null;
        Object objRemoteconfig = remoteconfig();
        InterfaceC6752l interfaceC6752l = objRemoteconfig instanceof InterfaceC6752l ? (InterfaceC6752l) objRemoteconfig : null;
        if (interfaceC6752l != null) {
            interfaceC6752l.yandex();
        }
        this.f16246l = false;
    }
}
