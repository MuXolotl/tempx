package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٗٝۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17284l extends AbstractC11801l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f33537l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C1008l f33538l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C1008l f33539l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f33540l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C10086l f33541l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10086l f33542l;

    public C17284l() {
        super(0);
        this.f33541l = AbstractC8020l.smaato(C4065l.billing);
        Boolean bool = Boolean.FALSE;
        this.f33542l = AbstractC8020l.smaato(bool);
        AbstractC8020l.smaato(bool);
        this.f33540l = AbstractC8020l.smaato(bool);
        this.f33539l = AbstractC11190l.yandex(EnumC9736l.Playlists);
        this.f33538l = AbstractC11190l.yandex(EnumC17214l.Default);
        this.f33537l = AbstractC8020l.smaato(bool);
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final void m4292abstract(String str, String str2, C15578l c15578l, InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        int i2;
        c6956l.m2133new(348894502);
        if ((i & 6) == 0) {
            i2 = (c6956l.billing(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l.billing(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c6956l.admob(c15578l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= c6956l.billing(interfaceC17242l) ? 2048 : 1024;
        }
        if (c6956l.m2127for(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = AbstractC15548l.yandex;
            AbstractC13319l.yandex(AbstractC14566l.amazon(-1506247292, new C4210l(str, 9), c6956l), interfaceC17242l, null, AbstractC14566l.amazon(-2036868537, new C4210l(str2, 10), c6956l), c15578l, null, AbstractC15548l.yandex(C9735l.isPro, 0L, 0L, 0L, c6956l, 510), c6956l, ((i2 >> 6) & 112) | 3078 | ((i2 << 6) & 57344), 420);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5418l(this, str, str2, c15578l, interfaceC17242l, i, 4);
        }
    }

    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void m4293finally(C6956l c6956l, int i) {
        c6956l.m2133new(-1330550992);
        int i2 = 2;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            AbstractC3274l.yandex(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), null, 0L, 0L, 2.0f, 0.0f, null, AbstractC14566l.amazon(-411862773, new C5491l(this), c6956l), c6956l, 12607494, 110);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5491l(this, i, i2);
        }
    }

    /* JADX INFO: renamed from: import, reason: not valid java name */
    public final void m4294import(C6956l c6956l, int i) {
        int i2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(-1753908162);
        int i3 = i | (c6956l2.admob(this) ? 4 : 2);
        if (c6956l2.m2127for(i3 & 1, (i3 & 3) != 2)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(c4346l, 1.0f);
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
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i4);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(c4346l, C18450l.f36043l), 16.0f, 0.0f, 2);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
            long j2 = c6956l2.f14595continue;
            int i5 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i5, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            if (((Boolean) this.f33537l.getValue()).booleanValue()) {
                c6956l2.m2123default(1215900392);
                AbstractC8960l.loadAd(null, 0L, null, c6956l2, 0, 7);
                String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.cache_db_migration_started);
                C10707l c10707l = AbstractC16964l.yandex;
                AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.remoteconfig, c6956l, 0, 0, 130042);
                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.cache_db_migration_started_desc), null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, c6956l, 0, 0, 130042);
                c6956l2 = c6956l;
                c6956l2.startapp(false);
                i2 = 0;
            } else {
                c6956l2.m2123default(1216634658);
                AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_download_outline_28, 0, c6956l2);
                C10707l c10707l2 = AbstractC16964l.yandex;
                AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC0080l.isPro(c4346l, 36.0f), ((C14370l) c6956l2.isPro(c10707l2)).yandex.subscription, c6956l, 440, 0);
                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.ph_cache_title), null, ((C14370l) c6956l.isPro(c10707l2)).yandex.adcel, AbstractC7039l.isPro(15), null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l, 24576, 0, 261098);
                AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.ph_cache_desc), null, ((C14370l) c6956l.isPro(c10707l2)).yandex.subscription, AbstractC7039l.isPro(13), null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, null, c6956l, 24576, 0, 261098);
                c6956l2 = c6956l;
                i2 = 0;
                c6956l2.startapp(false);
            }
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            i2 = 0;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5491l(this, i, i2);
        }
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m4295instanceof(String str, int i, C6956l c6956l, int i2) {
        c6956l.m2133new(-1761422903);
        int i3 = (c6956l.billing(str) ? 4 : 2) | i2 | (c6956l.amazon(i) ? 32 : 16) | (c6956l.admob(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 112) == 32;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                objM2132native = AbstractC13273l.loadAd(isVip(), i);
                c6956l.m2147try(objM2132native);
            }
            AbstractC14165l abstractC14165lYandex = AbstractC7041l.yandex((Drawable) objM2132native, c6956l);
            AbstractC7741l.purchase(str, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 64.0f), ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).crashlytics.loadAd), abstractC14165lYandex, abstractC14165lYandex, C4176l.yandex, c6956l, (i3 & 14) | 36912, 6, 31712);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(this, str, i, i2);
        }
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(176633057);
        int i2 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C15571l(this, null, 0);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            C4065l c4065l = (C4065l) this.f33541l.getValue();
            C1008l c1008l = this.f33539l;
            C5268l c5268l = this.f34614l;
            InterfaceC8714l interfaceC8714lPurchase = AbstractC3700l.purchase(c1008l, c5268l, c6956l);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(2115843997, new C3158l(this, interfaceC8714lPurchase, 17), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(178639730, new C2669l(this, interfaceC8714lPurchase, AbstractC3700l.crashlytics(c4065l.yandex, C0617l.yandex, c5268l, c6956l, 48, 12), AbstractC3700l.crashlytics(c4065l.loadAd, C10797l.yandex, c5268l, c6956l, 48, 12), AbstractC3700l.crashlytics(c4065l.crashlytics, C16614l.yandex, c5268l, c6956l, 48, 12), AbstractC3700l.crashlytics(c4065l.purchase, new C5086l(), c5268l, c6956l, 0, 12), 2), c6956l), c6956l, 805306416, 253);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5491l(this, i, 3);
        }
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        InterfaceC14029l interfaceC14029l = null;
        C14019l c14019l = new C14019l(this, interfaceC14029l, 3);
        C8490l c8490l = AbstractC6025l.yandex;
        C8084l c8084l = AbstractC6025l.loadAd;
        C2347l c2347l = new C2347l(new C10424l(c8084l, 28), new C5888l(c14019l, interfaceC14029l, 19), 2);
        C5268l c5268l = this.f34614l;
        EnumC8981l enumC8981l = EnumC8981l.f18524l;
        AbstractC0622l.startapp(AbstractC14024l.startapp(c2347l, c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
        AbstractC0622l.startapp(AbstractC14024l.startapp(new C2347l(new C10424l(c8084l, 29), new C5888l(new C15571l(this, null, 1), interfaceC14029l, 21), 2), c5268l, enumC8981l), AbstractC11738l.yandex(c5268l));
    }

    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void m4296public(final int i, final int i2, final int i3, final InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i4) {
        String strMopub;
        c6956l.m2133new(-1281978929);
        int i5 = (c6956l.amazon(i) ? 4 : 2) | i4 | (c6956l.amazon(i2) ? 32 : 16) | (c6956l.amazon(i3) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c6956l.billing(interfaceC17242l) ? 2048 : 1024) | (c6956l.admob(this) ? 16384 : 8192);
        byte b = 0;
        if (c6956l.m2127for(i5 & 1, (i5 & 9363) != 9362)) {
            if (i2 > 0) {
                c6956l.m2123default(-584889542);
                strMopub = ((Resources) c6956l.isPro(AbstractC1242l.crashlytics)).getQuantityString(R.plurals.cache_entry_desc, i2, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                c6956l.startapp(false);
            } else {
                strMopub = AbstractC12900l.mopub(c6956l, -584795829, R.string.cache_library_none, c6956l, false);
            }
            m4292abstract(AbstractC11999l.purchase(c6956l, i), strMopub, AbstractC14566l.amazon(612780686, new C4314l(i3, 17, b), c6956l), interfaceC17242l, c6956l, (i5 & 7168) | 384 | (i5 & 57344));
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2(i, i2, i3, interfaceC17242l, i4) { // from class: lًؒۙ

                /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
                public final /* synthetic */ int f3341l;

                /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                public final /* synthetic */ int f3342l;

                /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC17242l f3344l;

                /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
                public final /* synthetic */ int f3345l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(1);
                    this.f3343l.m4296public(this.f3342l, this.f3341l, this.f3345l, this.f3344l, (C6956l) obj, iPurchase);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final void m4297this(C6956l c6956l, int i) {
        c6956l.m2133new(1218256207);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            boolean zBooleanValue = ((Boolean) this.f33542l.getValue()).booleanValue();
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C11762l(this, 1);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16727l.yandex(zBooleanValue, (Function0) objM2132native, null, 0L, null, null, null, 0L, 0.0f, AbstractC14566l.amazon(-1538972086, new C16561l(7, this), c6956l), c6956l, 0, 2044);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5491l(this, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: try, reason: not valid java name */
    public final Object m4298try(AbstractC0283l abstractC0283l) {
        C18577l c18577l;
        C5198l c5198l;
        C17284l c17284l;
        if (abstractC0283l instanceof C18577l) {
            c18577l = (C18577l) abstractC0283l;
            int i = c18577l.f36273l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c18577l.f36273l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c18577l = new C18577l(this, abstractC0283l);
            }
        } else {
            c18577l = new C18577l(this, abstractC0283l);
        }
        Object objM3168l = c18577l.f36276l;
        int i2 = c18577l.f36273l;
        int i3 = 1;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l c6336l = C6336l.yandex;
            c18577l.f36273l = 1;
            objM3168l = C6336l.loadAd.m3168l(c18577l);
            if (objM3168l != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i2 == 1) {
            AbstractC2829l.crashlytics(objM3168l);
        } else {
            if (i2 != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c17284l = c18577l.f36274l;
            c5198l = c18577l.f36275l;
            AbstractC2829l.crashlytics(objM3168l);
        }
        Boolean bool = (Boolean) objM3168l;
        bool.getClass();
        c17284l.f33540l.setValue(bool);
        StringBuilder sb = new StringBuilder();
        C16287l.yandex.getClass();
        sb.append(C16287l.crashlytics());
        sb.append("_-1337");
        Object[] objArr = {sb.toString()};
        C2336l c2336l = AbstractC18202l.yandex;
        C14194l c14194l = new C14194l(AbstractC4338l.startapp(c5198l.m1735l(c2336l.loadAd(CachedPlaylist.class), "uid == $0", Arrays.copyOf(objArr, 1)).purchase()), 0);
        C14194l c14194l2 = new C14194l(AbstractC4338l.startapp(c5198l.m1735l(c2336l.loadAd(CachedLibrary.class), "uid == $0", Arrays.copyOf(new Object[]{new Long(C16287l.crashlytics())}, 1)).purchase()), i3);
        C10424l c10424l = new C10424l(c5198l.m1735l(c2336l.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).loadAd("uid", new String[0]).yandex().ads(), 27);
        C14970l c14970l = new C14970l(7, new C2606l(new InterfaceC6942l[]{AbstractC4338l.adcel(c5198l.m1735l(c2336l.loadAd(CachedPlaylist.class), "uid != $0", Arrays.copyOf(new Object[]{C16287l.crashlytics() + "_-1337"}, 1)).loadAd("uid", new String[0])), AbstractC4338l.adcel(c5198l.m1735l(c2336l.loadAd(CachedAlbum.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).loadAd("uid", new String[0])), this.f33539l}, new C5752l(4, interfaceC14029l), 2));
        C16552l c16552l = AbstractC11463l.yandex;
        ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
        InterfaceC6942l interfaceC6942lMetrica = AbstractC0622l.metrica(c14970l, executorC6708l);
        this.f33541l.setValue(new C4065l(c14194l, c14194l2, c10424l, interfaceC6942lMetrica, AbstractC0622l.metrica(new C8766l(interfaceC6942lMetrica, this.f33538l, new C13749l(3, interfaceC14029l, 6), i3), executorC6708l)));
        return Unit.INSTANCE;
        C5198l c5198l2 = (C5198l) objM3168l;
        C1461l c1461l = C1461l.f3654l;
        c18577l.f36275l = c5198l2;
        c18577l.f36274l = this;
        c18577l.f36273l = 2;
        Object objAdvert = c1461l.advert(c18577l);
        if (objAdvert != enumC9342l) {
            c5198l = c5198l2;
            objM3168l = objAdvert;
            c17284l = this;
            Boolean bool2 = (Boolean) objM3168l;
            bool2.getClass();
            c17284l.f33540l.setValue(bool2);
            StringBuilder sb2 = new StringBuilder();
            C16287l.yandex.getClass();
            sb2.append(C16287l.crashlytics());
            sb2.append("_-1337");
            Object[] objArr2 = {sb2.toString()};
            C2336l c2336l2 = AbstractC18202l.yandex;
            C14194l c14194l3 = new C14194l(AbstractC4338l.startapp(c5198l.m1735l(c2336l2.loadAd(CachedPlaylist.class), "uid == $0", Arrays.copyOf(objArr2, 1)).purchase()), 0);
            C14194l c14194l4 = new C14194l(AbstractC4338l.startapp(c5198l.m1735l(c2336l2.loadAd(CachedLibrary.class), "uid == $0", Arrays.copyOf(new Object[]{new Long(C16287l.crashlytics())}, 1)).purchase()), i3);
            C10424l c10424l2 = new C10424l(c5198l.m1735l(c2336l2.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).loadAd("uid", new String[0]).yandex().ads(), 27);
            C14970l c14970l2 = new C14970l(7, new C2606l(new InterfaceC6942l[]{AbstractC4338l.adcel(c5198l.m1735l(c2336l2.loadAd(CachedPlaylist.class), "uid != $0", Arrays.copyOf(new Object[]{C16287l.crashlytics() + "_-1337"}, 1)).loadAd("uid", new String[0])), AbstractC4338l.adcel(c5198l.m1735l(c2336l2.loadAd(CachedAlbum.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).loadAd("uid", new String[0])), this.f33539l}, new C5752l(4, interfaceC14029l), 2));
            C16552l c16552l2 = AbstractC11463l.yandex;
            ExecutorC6708l executorC6708l2 = ExecutorC6708l.f14063l;
            InterfaceC6942l interfaceC6942lMetrica2 = AbstractC0622l.metrica(c14970l2, executorC6708l2);
            this.f33541l.setValue(new C4065l(c14194l3, c14194l4, c10424l2, interfaceC6942lMetrica2, AbstractC0622l.metrica(new C8766l(interfaceC6942lMetrica2, this.f33538l, new C13749l(3, interfaceC14029l, 6), i3), executorC6708l2)));
            return Unit.INSTANCE;
        }
        return enumC9342l;
    }
}
