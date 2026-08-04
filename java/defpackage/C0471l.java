package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.methods.podcasts.PodcastGetProfilePage$PodcastPage;

/* JADX INFO: renamed from: lؑٞؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0471l extends AbstractC11801l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f1723l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f1724l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f1725l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f1726l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f1727l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final long f1728l;

    public C0471l(long j) {
        super(0);
        this.f1727l = AbstractC11990l.loadAd();
        this.f1728l = j;
        this.f1726l = AbstractC8020l.smaato(C17202l.yandex);
        this.f1725l = AbstractC8020l.smaato(new PodcastGetProfilePage$PodcastPage(null, null, null, 7));
        Boolean bool = Boolean.FALSE;
        this.f1724l = AbstractC8020l.smaato(bool);
        this.f1723l = AbstractC8020l.smaato(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final Object m562abstract(C0471l c0471l, AbstractC0283l abstractC0283l) {
        C0199l c0199l;
        C0471l c0471l2;
        Throwable th;
        Object c15140l;
        if (abstractC0283l instanceof C0199l) {
            c0199l = (C0199l) abstractC0283l;
            int i = c0199l.f1142l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0199l.f1142l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0199l = new C0199l(c0471l, abstractC0283l);
            }
        } else {
            c0199l = new C0199l(c0471l, abstractC0283l);
        }
        Object obj = c0199l.f1145l;
        int i2 = c0199l.f1142l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            try {
                c0471l.f1726l.setValue(C0473l.yandex);
                c0199l.f1144l = c0471l;
                c0199l.f1143l = c0471l;
                c0199l.f1142l = 1;
                Object objM567this = c0471l.m567this(c0199l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM567this == enumC9342l) {
                    return enumC9342l;
                }
                c0471l2 = c0471l;
            } catch (Throwable th2) {
                c0471l2 = c0471l;
                th = th2;
                c15140l = new C15140l(th);
                c0471l = c0471l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0471l = c0199l.f1143l;
            c0471l2 = c0199l.f1144l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th3) {
                th = th3;
                c15140l = new C15140l(th);
                c0471l = c0471l2;
            }
        }
        c15140l = C7199l.yandex;
        c0471l.f1726l.setValue(c15140l);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static final Object m563instanceof(C0471l c0471l, AbstractC0283l abstractC0283l) {
        C16375l c16375l;
        C0471l c0471l2;
        Throwable th;
        Object c15140l;
        if (abstractC0283l instanceof C16375l) {
            c16375l = (C16375l) abstractC0283l;
            int i = c16375l.f32022l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16375l.f32022l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16375l = new C16375l(c0471l, abstractC0283l);
            }
        } else {
            c16375l = new C16375l(c0471l, abstractC0283l);
        }
        Object obj = c16375l.f32025l;
        int i2 = c16375l.f32022l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            try {
                c0471l.f1726l.setValue(new C15842l(c0471l.m564finally()));
                c16375l.f32024l = c0471l;
                c16375l.f32023l = c0471l;
                c16375l.f32022l = 1;
                Object objM567this = c0471l.m567this(c16375l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM567this == enumC9342l) {
                    return enumC9342l;
                }
                c0471l2 = c0471l;
            } catch (Throwable th2) {
                c0471l2 = c0471l;
                th = th2;
                c15140l = new C15140l(th);
                c0471l = c0471l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0471l = c16375l.f32023l;
            c0471l2 = c16375l.f32024l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th3) {
                th = th3;
                c15140l = new C15140l(th);
                c0471l = c0471l2;
            }
        }
        c15140l = C7199l.yandex;
        c0471l.f1726l.setValue(c15140l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final InterfaceC0220l m564finally() {
        return (InterfaceC0220l) this.f1726l.getValue();
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m565import(String str, C6956l c6956l, int i) {
        String str2 = str;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(571351299);
        int i2 = i | (c6956l2.billing(str2) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C4346l.f8873l, 16.0f, 0.0f, 2);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36040l, c6956l2, 54);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd("Все эпизоды", null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, C6886l.f14420l, AbstractC1193l.loadAd, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.admob, c6956l, 14155782, 0, 130874);
            str2 = str;
            AbstractC13010l.loadAd(str2, null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, (i2 >> 3) & 14, 0, 262138);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10848l(this, str2, i, 2);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        InterfaceC0220l interfaceC0220lM564finally;
        C2663l c2663l;
        boolean z;
        C4346l c4346l;
        C6956l c6956l2;
        C6956l c6956l3 = c6956l;
        c6956l3.m2133new(-158159967);
        int i2 = i | (c6956l3.admob(this) ? 4 : 2);
        int i3 = 0;
        if (c6956l3.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l3.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l3);
                c6956l3.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l3);
            C2663l c2663lPurchase = AbstractC0831l.purchase(c6956l3);
            boolean z2 = m564finally() instanceof C15842l;
            boolean zAdmob = c6956l3.admob(interfaceC2262l) | c6956l3.admob(this);
            Object objM2132native2 = c6956l3.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C1717l(interfaceC2262l, this, 1);
                c6956l3.m2147try(objM2132native2);
            }
            C7473l c7473lRemoteconfig = AbstractC14289l.remoteconfig(z2, (Function0) objM2132native2, c6956l3);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob2 = c6956l3.admob(this);
            Object objM2132native3 = c6956l3.m2132native();
            if (zAdmob2 || objM2132native3 == c13863l) {
                objM2132native3 = new C8100l(this, null, 0);
                c6956l3.m2147try(objM2132native3);
            }
            AbstractC12311l.amazon(c6956l3, unit, (Function2) objM2132native3);
            InterfaceC0220l interfaceC0220lM564finally2 = m564finally();
            C15842l c15842l = interfaceC0220lM564finally2 instanceof C15842l ? (C15842l) interfaceC0220lM564finally2 : null;
            if (c15842l == null || (interfaceC0220lM564finally = c15842l.yandex) == null) {
                interfaceC0220lM564finally = m564finally();
            }
            boolean zYandex = AbstractC8576l.yandex(interfaceC0220lM564finally, C17202l.yandex);
            C4346l c4346l2 = C4346l.f8873l;
            if (zYandex || AbstractC8576l.yandex(interfaceC0220lM564finally, C0473l.yandex)) {
                c6956l3.m2123default(-163701712);
                AbstractC7209l.yandex(AbstractC0080l.crashlytics(c4346l2, 1.0f), true, 0L, c6956l3, 54, 4);
                c6956l3.startapp(false);
            } else if (interfaceC0220lM564finally instanceof C15140l) {
                c6956l3.m2123default(-163533320);
                InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(AbstractC14707l.amazon(AbstractC2697l.subscription(c4346l2, AbstractC2697l.amazon), c7473lRemoteconfig), 1.0f);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                long j = c6956l3.f14595continue;
                int i4 = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lCrashlytics);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l3.m2140super();
                if (c6956l3.f14603switch) {
                    c6956l3.firebase(c16395l);
                } else {
                    c6956l3.m2136protected();
                }
                AbstractC8182l.billing(c6956l3, interfaceC10835lAmazon, C3438l.mopub);
                AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l3, Integer.valueOf(i4), C3438l.isPro);
                AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0080l.crashlytics(c4346l2, 1.0f), AbstractC13841l.crashlytics(c6956l3), true);
                InterfaceC5475l interfaceC5475lMetrica = C6168l.metrica(((C15140l) interfaceC0220lM564finally).yandex);
                boolean zAdmob3 = c6956l3.admob(interfaceC2262l) | c6956l3.admob(this);
                Object objM2132native4 = c6956l3.m2132native();
                if (zAdmob3 || objM2132native4 == c13863l) {
                    objM2132native4 = new C1717l(interfaceC2262l, this, 2);
                    c6956l3.m2147try(objM2132native4);
                }
                AbstractC0124l.loadAd(interfaceC5475lMetrica, (Function0) objM2132native4, interfaceC17242lPurchase, false, c6956l, 0, 8);
                c6956l3 = c6956l;
                c6956l3.startapp(true);
                c6956l3.startapp(false);
            } else {
                c6956l3.m2123default(-162324382);
                boolean zBilling = c6956l3.billing(m566public().yandex);
                Object objM2132native5 = c6956l3.m2132native();
                if (zBilling || objM2132native5 == c13863l) {
                    objM2132native5 = m566public().yandex.billing.yandex("a");
                    c6956l3.m2147try(objM2132native5);
                }
                String str = (String) objM2132native5;
                boolean zBilling2 = c6956l3.billing(m566public().yandex);
                Object objM2132native6 = c6956l3.m2132native();
                if (zBilling2 || objM2132native6 == c13863l) {
                    objM2132native6 = m566public().yandex.billing.yandex("e");
                    c6956l3.m2147try(objM2132native6);
                }
                String str2 = (String) objM2132native6;
                C10707l c10707l = AbstractC16964l.yandex;
                long j2 = ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp;
                if (((Boolean) this.f1724l.getValue()).booleanValue()) {
                    c6956l3.m2123default(-162451079);
                    boolean zAdmob4 = c6956l3.admob(this);
                    Object objM2132native7 = c6956l3.m2132native();
                    if (zAdmob4 || objM2132native7 == c13863l) {
                        objM2132native7 = new C16439l(this, 3);
                        c6956l3.m2147try(objM2132native7);
                    }
                    c2663l = c2663lPurchase;
                    z = false;
                    c4346l = c4346l2;
                    AbstractC2426l.crashlytics((Function0) objM2132native7, null, null, 0.0f, false, null, ((C14370l) c6956l3.isPro(c10707l)).yandex.startapp, ((C14370l) c6956l3.isPro(c10707l)).yandex.adcel, 0L, null, null, null, AbstractC14566l.amazon(-820684953, new C4385l(this, i3), c6956l3), c6956l, 0, 7998);
                    c6956l2 = c6956l;
                } else {
                    c2663l = c2663lPurchase;
                    z = false;
                    c4346l = c4346l2;
                    c6956l2 = c6956l3;
                    c6956l2.m2123default(-170075839);
                }
                c6956l2.startapp(z);
                C2663l c2663l2 = c2663l;
                AbstractC15497l.loadAd(AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC14566l.amazon(-1102668164, new C2519l(c2663l2, this), c6956l2), null, null, null, 0, 0L, 0L, null, AbstractC14566l.amazon(263744721, new C14333l(this, interfaceC2262l, c2663l2, str2, j2, str, iAdmob), c6956l2), c6956l2, 805306422, 508);
                c6956l3 = c6956l2;
                c6956l3.startapp(z);
            }
        } else {
            c6956l3.m2124else();
        }
        C4224l c4224lAds = c6956l3.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15864l(this, i);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final PodcastGetProfilePage$PodcastPage m566public() {
        return (PodcastGetProfilePage$PodcastPage) this.f1725l.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final Object m567this(AbstractC0283l abstractC0283l) {
        C9255l c9255l;
        C0471l c0471l;
        if (abstractC0283l instanceof C9255l) {
            c9255l = (C9255l) abstractC0283l;
            int i = c9255l.f19022l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9255l.f19022l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9255l = new C9255l(this, abstractC0283l);
            }
        } else {
            c9255l = new C9255l(this, abstractC0283l);
        }
        Object objAdmob = c9255l.f19023l;
        int i2 = c9255l.f19022l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            C12772l c12772l = new C12772l(this.f1728l, 25, (byte) 0);
            c9255l.f19024l = this;
            c9255l.f19022l = 1;
            objAdmob = AbstractC8189l.admob(c12772l, c9255l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
            c0471l = this;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0471l = c9255l.f19024l;
            AbstractC2829l.crashlytics(objAdmob);
        }
        PodcastGetProfilePage$PodcastPage podcastGetProfilePage$PodcastPage = (PodcastGetProfilePage$PodcastPage) objAdmob;
        this.f1723l.setValue(Boolean.valueOf(podcastGetProfilePage$PodcastPage.yandex.admob));
        c0471l.f1725l.setValue(podcastGetProfilePage$PodcastPage);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f1727l.f36440l;
    }
}
