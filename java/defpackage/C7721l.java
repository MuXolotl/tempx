package defpackage;

import android.content.Context;
import android.media.AudioManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lًؚؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7721l extends AbstractC11801l implements InterfaceC17091l, InterfaceC2262l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C10086l f16198l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C15308l f16199l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C18396l f16200l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C11362l f16201l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C10086l f16202l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C11362l f16203l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f16204l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C10086l f16205l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C10086l f16206l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final C14970l f16207l;

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C10086l f16208l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final C8688l f16209l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final Function2 f16210l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C15308l f16211l;

    public C7721l(Function2 function2) {
        super(0);
        this.f16204l = AbstractC11990l.loadAd();
        this.f16210l = function2;
        this.f16203l = new C11362l();
        this.f16201l = new C11362l();
        this.f16200l = new C18396l(new C1412l(8, this));
        this.f16199l = new C15308l(-1);
        this.f16211l = new C15308l(-1);
        Boolean bool = Boolean.FALSE;
        this.f16202l = AbstractC8020l.smaato(bool);
        this.f16206l = AbstractC8020l.smaato(bool);
        this.f16208l = AbstractC8020l.smaato(bool);
        this.f16198l = AbstractC8020l.smaato(bool);
        this.f16205l = AbstractC8020l.smaato(bool);
        this.f16207l = new C14970l(8, new C5163l(this, null, 3));
        this.f16209l = new C8688l(new C14870l(this, 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public static final Object m2203instanceof(C7721l c7721l, AbstractC0283l abstractC0283l) {
        C13035l c13035l;
        C11362l c11362l;
        Throwable th;
        Object c18435l;
        if (abstractC0283l instanceof C13035l) {
            c13035l = (C13035l) abstractC0283l;
            int i = c13035l.f25533l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13035l.f25533l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13035l = new C13035l(c7721l, abstractC0283l);
            }
        } else {
            c13035l = new C13035l(c7721l, abstractC0283l);
        }
        Object obj = c13035l.f25534l;
        int i2 = c13035l.f25533l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C11362l c11362l2 = c7721l.f16203l;
            try {
                Function2 function2 = c7721l.f16210l;
                Integer num = new Integer(c11362l2.size());
                c13035l.f25535l = c11362l2;
                c13035l.f25533l = 1;
                Object objInvoke = function2.invoke(num, c13035l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objInvoke == enumC9342l) {
                    return enumC9342l;
                }
                c11362l = c11362l2;
                obj = objInvoke;
            } catch (Throwable th2) {
                c11362l = c11362l2;
                th = th2;
                c18435l = new C18435l(th);
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c11362l = c13035l.f25535l;
            try {
                AbstractC2829l.crashlytics(obj);
            } catch (Throwable th3) {
                th = th3;
                c18435l = new C18435l(th);
            }
        }
        c18435l = (List) obj;
        Collection collection = (List) (c18435l instanceof C18435l ? null : c18435l);
        if (collection == null) {
            collection = C2580l.f5619l;
        }
        c7721l.f16205l.setValue(Boolean.valueOf(!collection.isEmpty()));
        AbstractC3984l.license(c11362l, collection);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m2204abstract(AudioTrack audioTrack, final C2887l c2887l, final int i, final boolean z, final InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i2) {
        int i3;
        C16395l c16395l;
        boolean z2;
        final AudioTrack audioTrack2 = audioTrack;
        C6956l c6956l2 = c6956l;
        C16557l c16557l = c2887l.amazon;
        c6956l2.m2133new(-1154194600);
        if ((i2 & 6) == 0) {
            i3 = (c6956l2.billing(audioTrack2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c6956l2.billing(c2887l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c6956l2.amazon(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c6956l2.mopub(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= c6956l2.billing(interfaceC17242l) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= c6956l2.admob(this) ? 131072 : 65536;
        }
        int i4 = i3;
        if (c6956l2.m2127for(i4 & 1, (i4 & 74899) != 74898)) {
            C9477l c9477l = new C9477l((Context) c6956l2.isPro(AbstractC1242l.loadAd));
            c9477l.crashlytics = audioTrack2;
            AbstractC10413l.yandex(c9477l, true);
            c9477l.crashlytics(600);
            C7819l c7819lYandex = c9477l.yandex();
            float fAdmob = ((C13765l) c16557l.f32505l).admob() + (((C15308l) c16557l.f32506l).admob() - i);
            float fAmazon = 1.0f - AbstractC8576l.amazon(Math.abs(fAdmob), 0.0f, 1.0f);
            boolean zContains = this.f16201l.contains(AbstractC16676l.mopub(audioTrack2));
            C14855l c14855l = C18450l.f36043l;
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(c14855l, false);
            long j = c6956l2.f14595continue;
            int i5 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l2 = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l2);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i5);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            boolean zCrashlytics = c6956l2.crashlytics(fAdmob);
            Object objM2132native = c6956l2.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zCrashlytics || objM2132native == c13863l) {
                objM2132native = new C14157l(0, fAdmob);
                c6956l2.m2147try(objM2132native);
            }
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lAdmob = AbstractC10409l.admob(AbstractC7477l.loadAd(c4346l, (Function1) objM2132native), 1);
            C15089l c15089l = C18450l.f36046l;
            C11485l c11485l = AbstractC8313l.crashlytics;
            C1853l c1853lYandex = AbstractC1001l.yandex(c11485l, c15089l, c6956l2, 0);
            long j2 = c6956l2.f14595continue;
            int i6 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lAdmob);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l2);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i6, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            InterfaceC17242l interfaceC17242lPremium = AbstractC17463l.loadAd(AbstractC0019l.crashlytics(c4346l, AbstractC13106l.billing(c6956l2).crashlytics), false).premium(new C9247l(1.0f, true));
            InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j3 = c6956l2.f14595continue;
            int i7 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242lPremium);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l2);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i7, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l4);
            AbstractC7741l.purchase(c7819lYandex, null, AbstractC6660l.subs(AbstractC0080l.crashlytics(c4346l, 1.0f), 8.0f, AbstractC13106l.billing(c6956l2).crashlytics, false, 28), new C18627l(AbstractC13106l.purchase(c6956l2).startapp), new C18627l(AbstractC13106l.purchase(c6956l2).startapp), null, c6956l2, 36912, 0, 32736);
            boolean zBooleanValue = z ? ((Boolean) this.f16202l.getValue()).booleanValue() : false;
            boolean zBooleanValue2 = z ? ((Boolean) this.f16206l.getValue()).booleanValue() : false;
            long jLoadAd = C9735l.loadAd(0.5f, C9735l.loadAd);
            InterfaceC17242l interfaceC17242lYandex = AbstractC15788l.yandex(C16170l.yandex.yandex(c4346l, c14855l), fAmazon);
            boolean zAdmob = c6956l2.admob(this);
            Object objM2132native2 = c6956l2.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                objM2132native2 = new C14870l(this, 0);
                c6956l2.m2147try(objM2132native2);
            }
            AbstractC1497l.yandex((Function0) objM2132native2, zBooleanValue, zBooleanValue2, interfaceC17242lYandex, jLoadAd, 0L, 0.0f, c6956l, 24576);
            c6956l.startapp(true);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 8.0f));
            InterfaceC17242l interfaceC17242lYandex2 = AbstractC15788l.yandex(AbstractC0080l.amazon(c4346l, 1.0f), fAmazon);
            C0086l c0086l = C18450l.f36040l;
            C1083l c1083l = AbstractC8313l.yandex;
            C5062l c5062lYandex = AbstractC7001l.yandex(c1083l, c0086l, c6956l, 48);
            long j4 = c6956l.f14595continue;
            int i8 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato4 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l, interfaceC17242lYandex2);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c16395l = c16395l2;
                c6956l.firebase(c16395l);
            } else {
                c16395l = c16395l2;
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato4, c6415l2);
            AbstractC11043l.isPro(i8, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling4, c6415l4);
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(new C9247l(1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            C1853l c1853lYandex2 = AbstractC1001l.yandex(c11485l, c15089l, c6956l, 0);
            long j5 = c6956l.f14595continue;
            int i9 = (int) (j5 ^ (j5 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato5 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l, interfaceC17242lStartapp);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato5, c6415l2);
            AbstractC11043l.isPro(i9, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling5, c6415l4);
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob2 || objM2132native3 == c13863l) {
                objM2132native3 = new C14870l(this, 1);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(c4346l, false, null, (Function0) objM2132native3, 15);
            C5062l c5062lYandex2 = AbstractC7001l.yandex(c1083l, c0086l, c6956l, 48);
            long j6 = c6956l.f14595continue;
            int i10 = (int) (j6 ^ (j6 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato6 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l, interfaceC17242lLoadAd);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex2, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato6, c6415l2);
            AbstractC11043l.isPro(i10, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling6, c6415l4);
            audioTrack2 = audioTrack;
            String str = audioTrack2.amazon;
            long j7 = C9735l.purchase;
            AbstractC13010l.loadAd(str, null, j7, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC13106l.admob(c6956l).firebase, c6956l, 384, 24960, 110586);
            if (audioTrack2.mopub) {
                c6956l.m2123default(252805637);
                AbstractC9334l.yandex(c6956l, AbstractC0080l.vip(c4346l, 4.0f));
                AbstractC5889l.amazon(AbstractC0080l.isPro(c4346l, 16.0f), 0L, c6956l, 6, 2);
                z2 = false;
            } else {
                z2 = false;
                c6956l.m2123default(230711844);
            }
            c6956l.startapp(z2);
            AbstractC4597l.yandex(AbstractC15929l.crashlytics(), null, null, 0L, c6956l, 48, 12);
            c6956l.startapp(true);
            AbstractC13010l.loadAd(audioTrack2.yandex, null, C9735l.loadAd(0.75f, j7), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, AbstractC13106l.admob(c6956l).smaato, c6956l, 384, 24960, 110586);
            c6956l.startapp(true);
            long jLoadAd2 = C9735l.loadAd(0.25f, j7);
            long j8 = C9735l.firebase;
            C17076l c17076lYandex = AbstractC12442l.ad(((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex).yandex(jLoadAd2, j7, j8, j8);
            InterfaceC17242l interfaceC17242lMopub = AbstractC7574l.mopub(0.9f);
            boolean zMopub = c6956l.mopub(zContains) | c6956l.admob(this) | ((i4 & 14) == 4);
            Object objM2132native4 = c6956l.m2132native();
            if (zMopub || objM2132native4 == c13863l) {
                objM2132native4 = new C1027l(zContains, this, audioTrack2, 0);
                c6956l.m2147try(objM2132native4);
            }
            c6956l2 = c6956l;
            AbstractC7470l.crashlytics((Function0) objM2132native4, interfaceC17242lMopub, false, null, c17076lYandex, AbstractC14566l.amazon(-200916094, new C4584l(zContains, 1), c6956l), c6956l2, 1572912);
            AbstractC12900l.ads(c6956l2, true, true, true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٍٙٛ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f19663l.m2204abstract(audioTrack2, c2887l, i, z, interfaceC17242l, (C6956l) obj, AbstractC0545l.purchase(i2 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        m2205finally();
        m2209this().release();
        AbstractC11990l.billing(this, null);
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m2205finally() {
        m2209this().mo2753continue(false);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        Context applicationContext = vKXApplication.getApplicationContext();
        C18396l c18396l = this.f16200l;
        c18396l.getClass();
        AbstractC13950l.loadAd((AudioManager) applicationContext.getSystemService("audio"), (C1750l) c18396l.f35933l);
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m2206import(boolean z, AudioSnippetEntry audioSnippetEntry, C6956l c6956l, int i) {
        Object c0519l;
        C2887l c2887l;
        C7721l c7721l = this;
        boolean z2 = z;
        c6956l.m2133new(1257735730);
        int i2 = i | (c6956l.mopub(z2) ? 4 : 2) | (c6956l.admob(audioSnippetEntry) ? 32 : 16) | (c6956l.admob(c7721l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            boolean zAdmob = c6956l.admob(audioSnippetEntry);
            Object objM2132native = c6956l.m2132native();
            Object obj = C1867l.yandex;
            if (zAdmob || objM2132native == obj) {
                objM2132native = new C9636l(14, audioSnippetEntry);
                c6956l.m2147try(objM2132native);
            }
            C2887l c2887lLoadAd = AbstractC10521l.loadAd(0, (Function0) objM2132native, c6956l, 0, 3);
            AudioTrack audioTrack = (AudioTrack) audioSnippetEntry.mopub.get(((C15308l) c2887lLoadAd.amazon.f32506l).admob());
            InterfaceC8714l interfaceC8714lCrashlytics = AbstractC3700l.crashlytics(c7721l.f16207l, Float.valueOf(0.0f), c7721l.f34614l, c6956l, 48, 12);
            Boolean boolValueOf = Boolean.valueOf(z2);
            Integer numValueOf = Integer.valueOf(c2887lLoadAd.metrica());
            int i3 = 14 & i2;
            boolean zAdmob2 = (i3 == 4) | c6956l.admob(c7721l) | c6956l.admob(audioSnippetEntry) | c6956l.billing(c2887lLoadAd);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == obj) {
                c2887l = c2887lLoadAd;
                c0519l = new C0519l(z2, c7721l, audioSnippetEntry, c2887l, (InterfaceC14029l) null);
                z2 = z2;
                c7721l = c7721l;
                c6956l.m2147try(c0519l);
            } else {
                c0519l = objM2132native2;
                c2887l = c2887lLoadAd;
            }
            AbstractC12311l.purchase(boolValueOf, numValueOf, (Function2) c0519l, c6956l);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            Boolean bool = (Boolean) c7721l.f16198l.getValue();
            bool.getClass();
            boolean zAdmob3 = c6956l.admob(c7721l) | (i3 == 4) | c6956l.billing(c2887l);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob3 || objM2132native3 == obj) {
                objM2132native3 = new C8122l(z2, c7721l, c2887l, (InterfaceC14029l) null);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC12311l.purchase(boolValueOf2, bool, (Function2) objM2132native3, c6956l);
            AbstractC3383l.yandex(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), null, null, null, null, AbstractC14566l.amazon(-1886681216, new C9572l(audioTrack, c2887l, audioSnippetEntry, c7721l, z2, interfaceC8714lCrashlytics), c6956l), c6956l, 196614, 30);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16693l(this, z, audioSnippetEntry, i, 1);
        }
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC17777l
    public final void inmobi() {
        super.inmobi();
        m2205finally();
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(-413058088);
        int i2 = 2;
        int i3 = i | (c6956l.admob(this) ? 4 : 2);
        int i4 = 1;
        byte b = 0;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            int i5 = 3;
            Object obj = C1867l.yandex;
            if (zAdmob || objM2132native == obj) {
                objM2132native = new C14870l(this, i5);
                c6956l.m2147try(objM2132native);
            }
            C2887l c2887lLoadAd = AbstractC10521l.loadAd(0, (Function0) objM2132native, c6956l, 0, 3);
            AbstractC11028l.subs(c6956l, 6);
            if (((Boolean) this.f16206l.getValue()).booleanValue()) {
                c6956l.m2123default(-331747996);
                AbstractC11028l.billing(c6956l, 0);
            } else {
                c6956l.m2123default(-340363702);
            }
            c6956l.startapp(false);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            InterfaceC14029l interfaceC14029l = null;
            if (zAdmob2 || objM2132native2 == obj) {
                objM2132native2 = new C6586l(this, interfaceC14029l, b);
                c6956l.m2147try(objM2132native2);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native2);
            Boolean bool = (Boolean) this.f16208l.getValue();
            bool.getClass();
            boolean zAdmob3 = c6956l.admob(this) | c6956l.billing(c2887lLoadAd);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob3 || objM2132native3 == obj) {
                objM2132native3 = new C5163l(this, c2887lLoadAd, interfaceC14029l, i4);
                c6956l.m2147try(objM2132native3);
            }
            AbstractC12311l.amazon(c6956l, bool, (Function2) objM2132native3);
            Integer numValueOf = Integer.valueOf(c2887lLoadAd.metrica());
            boolean zBilling = c6956l.billing(c2887lLoadAd) | c6956l.admob(this);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling || objM2132native4 == obj) {
                objM2132native4 = new C5163l(c2887lLoadAd, this, interfaceC14029l, i2);
                c6956l.m2147try(objM2132native4);
            }
            AbstractC12311l.amazon(c6956l, numValueOf, (Function2) objM2132native4);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-120537708, new C1119l(this, b, b), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1257747799, new C7442l(this, c2887lLoadAd, 9), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1119l(this, i);
        }
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m2207public() {
        if (((AppActivity) isVip()).f5599l.getCurrentFragment() instanceof C7721l) {
            m2209this().mo2753continue(true);
            VKXApplication.Companion companion = VKXApplication.f36628l;
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            this.f16200l.m4530volatile(vKXApplication.getApplicationContext());
        }
    }

    @Override // defpackage.InterfaceC17091l
    public final void startapp() {
        m2205finally();
    }

    @Override // defpackage.AbstractC11801l, defpackage.AbstractC17777l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final void mo2208synchronized() {
        super.mo2208synchronized();
        m2207public();
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final C17804l m2209this() {
        return (C17804l) this.f16209l.getValue();
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f16204l.f36440l;
    }

    public C7721l() {
        this(new C18160l(2, null, 1));
    }
}
