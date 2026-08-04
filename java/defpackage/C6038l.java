package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastInfo;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؘۡۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6038l extends AbstractC11801l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f12811l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final long f12812l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f12813l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final int f12814l;

    public C6038l(int i, long j) {
        super(0);
        this.f12813l = AbstractC11990l.loadAd();
        this.f12814l = i;
        this.f12812l = j;
        this.f12811l = AbstractC8020l.smaato(C15846l.yandex);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final Object m1920abstract(C6038l c6038l, AbstractC0283l abstractC0283l) {
        C10904l c10904l;
        C6038l c6038l2;
        Throwable th;
        Object c7657l;
        if (abstractC0283l instanceof C10904l) {
            c10904l = (C10904l) abstractC0283l;
            int i = c10904l.f22026l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10904l.f22026l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10904l = new C10904l(c6038l, abstractC0283l);
            }
        } else {
            c10904l = new C10904l(c6038l, abstractC0283l);
        }
        Object objM1924public = c10904l.f22029l;
        int i2 = c10904l.f22026l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM1924public);
            try {
                c6038l.f12811l.setValue(new C6598l(c6038l.m1923instanceof()));
                c10904l.f22028l = c6038l;
                c10904l.f22027l = c6038l;
                c10904l.f22026l = 1;
                objM1924public = c6038l.m1924public(c10904l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM1924public == enumC9342l) {
                    return enumC9342l;
                }
                c6038l2 = c6038l;
            } catch (Throwable th2) {
                c6038l2 = c6038l;
                th = th2;
                c7657l = new C7657l(th);
                c6038l = c6038l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6038l = c10904l.f22027l;
            c6038l2 = c10904l.f22028l;
            try {
                AbstractC2829l.crashlytics(objM1924public);
            } catch (Throwable th3) {
                th = th3;
                c7657l = new C7657l(th);
                c6038l = c6038l2;
            }
        }
        c7657l = (InterfaceC2646l) objM1924public;
        c6038l.f12811l.setValue(c7657l);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final Object m1921import(C6038l c6038l, AbstractC0283l abstractC0283l) {
        C4827l c4827l;
        C6038l c6038l2;
        Throwable th;
        Object c7657l;
        if (abstractC0283l instanceof C4827l) {
            c4827l = (C4827l) abstractC0283l;
            int i = c4827l.f9872l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4827l.f9872l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4827l = new C4827l(c6038l, abstractC0283l);
            }
        } else {
            c4827l = new C4827l(c6038l, abstractC0283l);
        }
        Object objM1924public = c4827l.f9875l;
        int i2 = c4827l.f9872l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM1924public);
            try {
                c6038l.f12811l.setValue(C1009l.yandex);
                c4827l.f9874l = c6038l;
                c4827l.f9873l = c6038l;
                c4827l.f9872l = 1;
                objM1924public = c6038l.m1924public(c4827l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objM1924public == enumC9342l) {
                    return enumC9342l;
                }
                c6038l2 = c6038l;
            } catch (Throwable th2) {
                c6038l2 = c6038l;
                th = th2;
                c7657l = new C7657l(th);
                c6038l = c6038l2;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6038l = c4827l.f9873l;
            c6038l2 = c4827l.f9874l;
            try {
                AbstractC2829l.crashlytics(objM1924public);
            } catch (Throwable th3) {
                th = th3;
                c7657l = new C7657l(th);
                c6038l = c6038l2;
            }
        }
        c7657l = (InterfaceC2646l) objM1924public;
        c6038l.f12811l.setValue(c7657l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m1922finally(long j, String str) {
        AbstractC9092l.crashlytics((AppActivity) isVip(), new C7839l(this.f12812l, this.f12814l, str), new C13305l(null, j * 1000, null, false, true, false, 109));
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final InterfaceC2646l m1923instanceof() {
        return (InterfaceC2646l) this.f12811l.getValue();
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        InterfaceC2646l interfaceC2646lM1923instanceof;
        Integer num;
        Integer num2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(2139082997);
        int i2 = i | (c6956l2.admob(this) ? 4 : 2);
        int i3 = 1;
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = AbstractC12311l.isPro(c6956l2);
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native;
            AbstractC6363l.admob(0, 1, c6956l2);
            boolean z = m1923instanceof() instanceof C6598l;
            boolean zAdmob = c6956l2.admob(interfaceC2262l) | c6956l2.admob(this);
            Object objM2132native2 = c6956l2.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C17257l(interfaceC2262l, this, 1);
                c6956l2.m2147try(objM2132native2);
            }
            C7473l c7473lRemoteconfig = AbstractC14289l.remoteconfig(z, (Function0) objM2132native2, c6956l2);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob2 = c6956l2.admob(this);
            Object objM2132native3 = c6956l2.m2132native();
            if (zAdmob2 || objM2132native3 == c13863l) {
                objM2132native3 = new C11638l(this, null, 0);
                c6956l2.m2147try(objM2132native3);
            }
            AbstractC12311l.amazon(c6956l2, unit, (Function2) objM2132native3);
            InterfaceC2646l interfaceC2646lM1923instanceof2 = m1923instanceof();
            C6598l c6598l = interfaceC2646lM1923instanceof2 instanceof C6598l ? (C6598l) interfaceC2646lM1923instanceof2 : null;
            if (c6598l == null || (interfaceC2646lM1923instanceof = c6598l.yandex) == null) {
                interfaceC2646lM1923instanceof = m1923instanceof();
            }
            boolean zYandex = AbstractC8576l.yandex(interfaceC2646lM1923instanceof, C15846l.yandex);
            C4346l c4346l = C4346l.f8873l;
            if (zYandex || AbstractC8576l.yandex(interfaceC2646lM1923instanceof, C1009l.yandex)) {
                c6956l2.m2123default(992472924);
                AbstractC7209l.yandex(AbstractC0080l.crashlytics(c4346l, 1.0f), true, 0L, c6956l2, 54, 4);
                c6956l2.startapp(false);
            } else if (interfaceC2646lM1923instanceof instanceof C7657l) {
                c6956l2.m2123default(992641316);
                InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(AbstractC14707l.amazon(AbstractC2697l.subscription(c4346l, AbstractC2697l.amazon), c7473lRemoteconfig), 1.0f);
                InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                long j = c6956l2.f14595continue;
                int i4 = (int) (j ^ (j >>> 32));
                InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lCrashlytics);
                InterfaceC8801l.firebase.getClass();
                C16395l c16395l = C3438l.loadAd;
                c6956l2.m2140super();
                if (c6956l2.f14603switch) {
                    c6956l2.firebase(c16395l);
                } else {
                    c6956l2.m2136protected();
                }
                AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, C3438l.mopub);
                AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
                AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
                AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                InterfaceC17242l interfaceC17242lPurchase = AbstractC13841l.purchase(AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC13841l.crashlytics(c6956l2), true);
                InterfaceC5475l interfaceC5475lMetrica = C6168l.metrica(((C7657l) interfaceC2646lM1923instanceof).yandex);
                boolean zAdmob3 = c6956l2.admob(interfaceC2262l) | c6956l2.admob(this);
                Object objM2132native4 = c6956l2.m2132native();
                if (zAdmob3 || objM2132native4 == c13863l) {
                    objM2132native4 = new C17257l(interfaceC2262l, this, 2);
                    c6956l2.m2147try(objM2132native4);
                }
                AbstractC0124l.loadAd(interfaceC5475lMetrica, (Function0) objM2132native4, interfaceC17242lPurchase, false, c6956l, 0, 8);
                c6956l.startapp(true);
                c6956l.startapp(false);
                c6956l2 = c6956l;
            } else if (interfaceC2646lM1923instanceof instanceof C5750l) {
                c6956l2.m2123default(993613476);
                AudioTrack audioTrack = ((C5750l) interfaceC2646lM1923instanceof).yandex;
                PodcastInfo podcastInfo = audioTrack.advert;
                int i5 = audioTrack.purchase;
                boolean zBilling = c6956l2.billing(podcastInfo);
                Object objM2132native5 = c6956l2.m2132native();
                if (zBilling || objM2132native5 == c13863l) {
                    objM2132native5 = Integer.valueOf((podcastInfo == null || (num = podcastInfo.purchase) == null) ? 0 : num.intValue());
                    c6956l2.m2147try(objM2132native5);
                }
                int iIntValue = ((Number) objM2132native5).intValue();
                boolean zAmazon = c6956l2.amazon(i5) | c6956l2.billing(podcastInfo);
                Object objM2132native6 = c6956l2.m2132native();
                if (zAmazon || objM2132native6 == c13863l) {
                    int iIntValue2 = i5 - ((podcastInfo == null || (num2 = podcastInfo.purchase) == null) ? 0 : num2.intValue());
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    objM2132native6 = Integer.valueOf(iIntValue2);
                    c6956l2.m2147try(objM2132native6);
                }
                int iIntValue3 = ((Number) objM2132native6).intValue();
                boolean zAmazon2 = c6956l2.amazon(iIntValue3);
                Object objM2132native7 = c6956l2.m2132native();
                if (zAmazon2 || objM2132native7 == c13863l) {
                    DecimalFormat decimalFormat = C15638l.yandex;
                    objM2132native7 = AbstractC14205l.amazon(iIntValue3, false);
                    c6956l2.m2147try(objM2132native7);
                }
                String str = (String) objM2132native7;
                boolean zAmazon3 = c6956l2.amazon(iIntValue) | c6956l2.amazon(i5);
                Object objM2132native8 = c6956l2.m2132native();
                if (zAmazon3 || objM2132native8 == c13863l) {
                    objM2132native8 = Float.valueOf(iIntValue / i5);
                    c6956l2.m2147try(objM2132native8);
                }
                AbstractC15497l.loadAd(AbstractC0080l.crashlytics(c4346l, 1.0f), AbstractC14566l.amazon(-1759642383, new C7900l(this, i3, (byte) 0), c6956l2), null, null, null, 0, 0L, 0L, null, AbstractC14566l.amazon(847953926, new C15195l(this, interfaceC2262l, audioTrack, iIntValue, ((Number) objM2132native8).floatValue(), iIntValue3, str), c6956l2), c6956l2, 805306422, 508);
                c6956l2 = c6956l2;
                c6956l2.startapp(false);
            } else {
                c6956l2 = c6956l2;
                c6956l2.m2123default(1002501021);
                c6956l2.startapp(false);
            }
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C7900l(this, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final Object m1924public(AbstractC0283l abstractC0283l) {
        C3894l c3894l;
        if (abstractC0283l instanceof C3894l) {
            c3894l = (C3894l) abstractC0283l;
            int i = c3894l.f8038l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3894l.f8038l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3894l = new C3894l(this, abstractC0283l);
            }
        } else {
            c3894l = new C3894l(this, abstractC0283l);
        }
        Object objAdmob = c3894l.f8037l;
        int i2 = c3894l.f8038l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAdmob);
            C12772l c12772l = new C12772l(this.f12812l, this.f12814l);
            c3894l.f8038l = 1;
            objAdmob = AbstractC8189l.admob(c12772l, c3894l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAdmob == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAdmob);
        }
        return new C5750l((AudioTrack) objAdmob);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f12813l.f36440l;
    }
}
