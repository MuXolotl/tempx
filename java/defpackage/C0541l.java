package defpackage;

import android.graphics.drawable.Drawable;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioContentCard;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؑۘٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0541l implements Function3 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f1857l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f1858l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1859l;

    public /* synthetic */ C0541l(C13072l c13072l, AbstractC11801l abstractC11801l, int i) {
        this.f1859l = i;
        this.f1857l = c13072l;
        this.f1858l = abstractC11801l;
    }

    private final Object Signature(Object obj, Object obj2, Object obj3) {
        C8583l c8583l = (C8583l) this.f1858l;
        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        ((Integer) obj3).getClass();
        InterfaceC17734l interfaceC17734l = (InterfaceC17734l) ((C18625l) obj).loadAd;
        boolean z = interfaceC17734l instanceof C0281l;
        C13863l c13863l = C1867l.yandex;
        if (z) {
            c6956l.m2123default(-238245793);
            C5803l c5803l = ((C0281l) interfaceC17734l).yandex;
            InterfaceC13238l interfaceC13238l = (InterfaceC13238l) interfaceC12244l.getValue();
            boolean zBilling = c6956l.billing(interfaceC13238l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == c13863l) {
                objM2132native = new C15406l(1, interfaceC13238l, InterfaceC13238l.class, "contains", "contains(Ljava/lang/Object;)Z", 0, 0, 15);
                c6956l.m2147try(objM2132native);
            }
            Function1 function1 = (Function1) ((InterfaceC5059l) objM2132native);
            boolean zAdmob = c6956l.admob(c5803l);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob || objM2132native2 == c13863l) {
                C15406l c15406l = new C15406l(1, c5803l, C5803l.class, "onAudioClicked", "onAudioClicked(Lbruhcollective/itaysonlab/vkx/decompose/components/pick_audios/PickAudiosEntry$AudioTrack;)V", 0, 0, 16);
                c6956l.m2147try(c15406l);
                objM2132native2 = c15406l;
            }
            Function1 function2 = (Function1) ((InterfaceC5059l) objM2132native2);
            boolean zAdmob2 = c6956l.admob(c8583l);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob2 || objM2132native3 == c13863l) {
                C15406l c15406l2 = new C15406l(1, c8583l, C8583l.class, "requestSnippet", "requestSnippet(Lbruhcollective/itaysonlab/vkx/decompose/components/pick_audios/PickAudiosEntry$AudioTrack;)V", 0, 0, 17);
                c6956l.m2147try(c15406l2);
                objM2132native3 = c15406l2;
            }
            AbstractC5473l.purchase(c5803l, function1, function2, (Function1) ((InterfaceC5059l) objM2132native3), c6956l, 0);
            c6956l.startapp(false);
        } else if (interfaceC17734l instanceof C6324l) {
            c6956l.m2123default(-237822178);
            C13242l c13242l = ((C6324l) interfaceC17734l).yandex;
            InterfaceC13238l interfaceC13238l2 = (InterfaceC13238l) interfaceC12244l.getValue();
            boolean zBilling2 = c6956l.billing(interfaceC13238l2);
            Object objM2132native4 = c6956l.m2132native();
            if (zBilling2 || objM2132native4 == c13863l) {
                objM2132native4 = new C15406l(1, interfaceC13238l2, InterfaceC13238l.class, "contains", "contains(Ljava/lang/Object;)Z", 0, 0, 18);
                c6956l.m2147try(objM2132native4);
            }
            Function1 function3 = (Function1) ((InterfaceC5059l) objM2132native4);
            boolean zAdmob3 = c6956l.admob(c13242l);
            Object objM2132native5 = c6956l.m2132native();
            if (zAdmob3 || objM2132native5 == c13863l) {
                C15406l c15406l3 = new C15406l(1, c13242l, C13242l.class, "onAudioClicked", "onAudioClicked(Lbruhcollective/itaysonlab/vkx/decompose/components/pick_audios/PickAudiosEntry$AudioTrack;)V", 0, 0, 19);
                c6956l.m2147try(c15406l3);
                objM2132native5 = c15406l3;
            }
            Function1 function4 = (Function1) ((InterfaceC5059l) objM2132native5);
            boolean zAdmob4 = c6956l.admob(c8583l);
            Object objM2132native6 = c6956l.m2132native();
            if (zAdmob4 || objM2132native6 == c13863l) {
                C15406l c15406l4 = new C15406l(1, c8583l, C8583l.class, "requestSnippet", "requestSnippet(Lbruhcollective/itaysonlab/vkx/decompose/components/pick_audios/PickAudiosEntry$AudioTrack;)V", 0, 0, 20);
                c6956l.m2147try(c15406l4);
                objM2132native6 = c15406l4;
            }
            AbstractC14412l.loadAd(c13242l, function3, function4, (Function1) ((InterfaceC5059l) objM2132native6), c6956l, 0);
            c6956l.startapp(false);
        } else {
            if (!(interfaceC17734l instanceof C4284l)) {
                throw AbstractC12900l.billing(-838971898, c6956l, false);
            }
            c6956l.m2123default(-237408824);
            AbstractC7837l.loadAd(((C4284l) interfaceC17734l).yandex, c6956l, 0);
            c6956l.startapp(false);
        }
        return Unit.INSTANCE;
    }

    private final Object adcel(Object obj, Object obj2, Object obj3) {
        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f1858l;
        C9270l c9270l = (C9270l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zBilling = c6956l.billing(interfaceC12244l) | c6956l.admob(c9270l);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C8652l(c9270l, interfaceC12244l);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC2130l.purchase, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, AbstractC2130l.billing, null, AbstractC14566l.amazon(-749136434, new C3158l(c9270l, interfaceC12244l, 23), c6956l), null, c6956l, 199686, 468);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object admob(Object obj, Object obj2, Object obj3) {
        C6001l c6001l = (C6001l) this.f1858l;
        C11749l c11749l = (C11749l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            switch (c6001l.yandex.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 5:
                case 6:
                case 8:
                    c6956l.m2123default(-479661719);
                    c11749l.pro(c6001l, c6956l, 0);
                    c6956l.startapp(false);
                    break;
                case 3:
                    c6956l.m2123default(-479659928);
                    c11749l.m3239package(c6001l, c6956l, 0);
                    c6956l.startapp(false);
                    break;
                case 4:
                    c6956l.m2123default(-479655956);
                    c11749l.inmobi(c6001l, c6956l, 0);
                    c6956l.startapp(false);
                    break;
                case 7:
                    c6956l.m2123default(-479653715);
                    c11749l.premium(c6001l, c6956l, 0);
                    c6956l.startapp(false);
                    break;
                case 9:
                default:
                    c6956l.m2123default(-479650036);
                    c11749l.m3240synchronized(c6001l, c6956l, 0);
                    c6956l.startapp(false);
                    break;
                case 10:
                    c6956l.m2123default(-479658002);
                    c11749l.m3241throws(c6001l, c6956l, 0);
                    c6956l.startapp(false);
                    break;
            }
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object ads(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f1858l;
        String str2 = (String) this.f1857l;
        InterfaceC15451l interfaceC15451l = (InterfaceC15451l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(interfaceC15451l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            AbstractC0133l.loadAd(interfaceC15451l, AbstractC14566l.amazon(-330926706, new C4210l(str, 11), c6956l), AbstractC14566l.amazon(1616803727, new C4210l(str2, 12), c6956l), c6956l, (iIntValue & 14) | 432);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object billing(Object obj, Object obj2, Object obj3) {
        InterfaceC3102l interfaceC3102l = (InterfaceC3102l) this.f1857l;
        C1463l c1463l = (C1463l) this.f1858l;
        InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), interfaceC11780l), interfaceC3102l.loadAd(), null);
            boolean zAdmob = c6956l.admob(c1463l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C8250l(9, c1463l);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 510);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object isPro(Object obj, Object obj2, Object obj3) {
        C17284l c17284l;
        C17284l c17284l2 = (C17284l) this.f1858l;
        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            InterfaceC11609l interfaceC11609l = (InterfaceC11609l) interfaceC12244l.getValue();
            C8344l c8344l = interfaceC11609l instanceof C8344l ? (C8344l) interfaceC11609l : null;
            int i = c8344l != null ? c8344l.loadAd : 0;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(c17284l2);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                c17284l = c17284l2;
                C5735l c5735l = new C5735l(0, c17284l, C17284l.class, "navigateToMyLibrary", "navigateToMyLibrary()V", 0, 0, 24);
                c6956l.m2147try(c5735l);
                objM2132native = c5735l;
            } else {
                c17284l = c17284l2;
            }
            c17284l.m4296public(R.string.cache_library_header, i, R.drawable.ic_profile_28, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object license(Object obj, Object obj2, Object obj3) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f1858l;
        AbstractC13264l abstractC13264l = (AbstractC13264l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        ((Integer) obj3).getClass();
        C10707l c10707l = AbstractC16964l.yandex;
        long j = ((C14370l) c6956l.isPro(c10707l)).yandex.loadAd;
        InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0019l.crashlytics(C4346l.f8873l, AbstractC7497l.yandex), ((C14370l) c6956l.isPro(c10707l)).yandex.yandex, AbstractC16837l.yandex);
        boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.billing(abstractC13264l);
        Object objM2132native = c6956l.m2132native();
        if (zAdmob || objM2132native == C1867l.yandex) {
            objM2132native = new C16154l(interfaceC2262l, abstractC13264l, 6);
            c6956l.m2147try(objM2132native);
        }
        AbstractC13010l.loadAd("x1", AbstractC3605l.vip(AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), 8.0f, 0.0f, 2), j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 6, 0, 262136);
        return Unit.INSTANCE;
    }

    private final Object metrica(Object obj, Object obj2, Object obj3) {
        C18306l c18306l = (C18306l) this.f1858l;
        C12708l c12708l = (C12708l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            c18306l.m4520transient(c12708l.crashlytics, c12708l.yandex.mopub, AbstractC14566l.amazon(-1405875730, new C3158l(c18306l, c12708l, 19), c6956l), AbstractC14566l.amazon(-173744435, new C4951l(22, c12708l), c6956l), c6956l, 3456);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object mopub(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f1858l;
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zBilling = c6956l.billing(function0);
            Object objM2132native = c6956l.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                objM2132native = new C9810l(function0, interfaceC8714l, 20);
                c6956l.m2147try(objM2132native);
            }
            AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC11156l.purchase, c6956l, 805306368, 510);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object pro(Object obj, Object obj2, Object obj3) {
        InterfaceC3102l interfaceC3102l = (InterfaceC3102l) this.f1857l;
        C9365l c9365l = (C9365l) this.f1858l;
        InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
        }
        int i = 1;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
            InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(C4346l.f8873l, 1.0f), interfaceC11780l), interfaceC3102l.loadAd(), null);
            boolean zAdmob = c6956l.admob(c9365l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C9391l(c9365l, i);
                c6956l.m2147try(objM2132native);
            }
            AbstractC16336l.yandex(interfaceC17242lMopub, null, null, null, null, null, false, null, (Function1) objM2132native, c6956l, 0, 510);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object remoteconfig(Object obj, Object obj2, Object obj3) {
        C17284l c17284l;
        C5969l c5969l = (C5969l) this.f1858l;
        C17284l c17284l2 = (C17284l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            int i = c5969l.yandex;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(c17284l2);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                c17284l = c17284l2;
                C5735l c5735l = new C5735l(0, c17284l, C17284l.class, "navigateToAllTracks", "navigateToAllTracks()V", 0, 0, 26);
                c6956l.m2147try(c5735l);
                objM2132native = c5735l;
            } else {
                c17284l = c17284l2;
            }
            c17284l.m4296public(R.string.fake_catalog_tracks_all, i, R.drawable.ic_article_outline_28, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object smaato(Object obj, Object obj2, Object obj3) {
        C17284l c17284l;
        C17152l c17152l = (C17152l) this.f1858l;
        C17284l c17284l2 = (C17284l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            int i = c17152l.loadAd;
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(c17284l2);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                c17284l = c17284l2;
                C5735l c5735l = new C5735l(0, c17284l, C17284l.class, "navigateToCachedTracks", "navigateToCachedTracks()V", 0, 0, 25);
                c6956l.m2147try(c5735l);
                objM2132native = c5735l;
            } else {
                c17284l = c17284l2;
            }
            c17284l.m4296public(R.string.cache_library_title_virtual, i, R.drawable.ic_download_outline_28, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), c6956l, 0);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object startapp(Object obj, Object obj2, Object obj3) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f1858l;
        C9270l c9270l = (C9270l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = 0;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.admob(c9270l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C8652l(interfaceC2262l, c9270l, i);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC2130l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, null, null, null, c6956l, 6, 508);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    private final Object subs(Object obj, Object obj2, Object obj3) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f1858l;
        InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean z = ((C3278l) interfaceC12244l.getValue()).f7019l;
            boolean zAdmob = c6956l.admob(interfaceC2262l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C15299l(interfaceC2262l, 18);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13402l.yandex(z, (Function1) objM2132native, AbstractC3605l.smaato(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f), c6956l, 384);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    private final Object subscription(Object obj, Object obj2, Object obj3) {
        AbstractC13264l abstractC13264l = (AbstractC13264l) this.f1858l;
        EnumC9931l enumC9931l = (EnumC9931l) this.f1857l;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        float fFloatValue3 = ((Float) obj3).floatValue();
        boolean zCrashlytics = AbstractC17185l.crashlytics(abstractC13264l, fFloatValue);
        char c = 0;
        if (abstractC13264l.firebase().purchase != EnumC7283l.f15126l && enumC9931l != EnumC9931l.f20223l) {
            zCrashlytics = !zCrashlytics;
        }
        int i = abstractC13264l.firebase().loadAd;
        float fYandex = i == 0 ? 0.0f : AbstractC17185l.yandex(abstractC13264l) / i;
        float f = fYandex - ((int) fYandex);
        if (Math.abs(fFloatValue) >= abstractC13264l.vip.mo868instanceof(400.0f)) {
            c = fFloatValue > 0.0f ? (char) 1 : (char) 2;
        }
        if (c == 0) {
            if (Math.abs(f) <= 0.5f) {
                float fAbs = Math.abs(fYandex);
                InterfaceC13490l interfaceC13490l = abstractC13264l.vip;
                C6157l c6157l = AbstractC10521l.yandex;
                if (fAbs < Math.abs(Math.min(interfaceC13490l.mo868instanceof(56.0f), abstractC13264l.remoteconfig() / 2.0f) / abstractC13264l.remoteconfig()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zCrashlytics) {
                    fFloatValue2 = fFloatValue3;
                }
            } else if (zCrashlytics) {
                fFloatValue2 = fFloatValue3;
            }
        } else if (c == 1) {
            fFloatValue2 = fFloatValue3;
        } else if (c != 2) {
            fFloatValue2 = 0.0f;
        }
        return Float.valueOf(fFloatValue2);
    }

    private final Object yandex(Object obj, Object obj2, Object obj3) {
        Function0 function0 = (Function0) this.f1858l;
        Function0 function1 = (Function0) this.f1857l;
        C6956l c6956l = (C6956l) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        byte b = 0;
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC9151l.loadAd(c4346l, false, null, function0, 15), 16.0f);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(16.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
            long j = c6956l.f14595continue;
            int i = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lSmaato);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l, 48);
            long j2 = c6956l.f14595continue;
            int i2 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i2, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.yandex(C11090l.yandex(((C14370l) c6956l.isPro(c10707l)).loadAd.remoteconfig, ((C14370l) c6956l.isPro(c10707l)).yandex.adcel, 0L, null, null, 0L, 0L, null, null, 16777214), AbstractC14566l.amazon(-2049493487, new C12513l(b, 27), c6956l), c6956l, 48);
            AbstractC9334l.yandex(c6956l, new C9247l(1.0f, true));
            AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(R.drawable.ic_dismiss_24, 0, c6956l);
            C10210l c10210lYandex = AbstractC13609l.yandex(4, 20.0f);
            Object objM2132native = c6956l.m2132native();
            if (objM2132native == C1867l.yandex) {
                objM2132native = AbstractC14814l.isPro(c6956l);
            }
            AbstractC4597l.loadAd(abstractC14165lCrashlytics, null, AbstractC9151l.yandex(c4346l, (C2403l) objM2132native, c10210lYandex, false, new C6402l(0), function1, 12), 0L, c6956l, 56, 8);
            c6956l.startapp(true);
            AbstractC13010l.yandex(((C14370l) c6956l.isPro(c10707l)).loadAd.firebase, AbstractC14566l.amazon(-307005387, new C12513l(b, 28), c6956l), c6956l, 48);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = this.f1859l;
        int i2 = 14;
        int i3 = 16;
        boolean z2 = false;
        int i4 = 12;
        C4346l c4346l = C4346l.f8873l;
        int i5 = 6;
        C13863l c13863l = C1867l.yandex;
        Object obj4 = this.f1857l;
        Object obj5 = this.f1858l;
        switch (i) {
            case 0:
                C7246l c7246l = (C7246l) obj5;
                InterfaceC3102l interfaceC3102l = (InterfaceC3102l) obj4;
                InterfaceC11780l interfaceC11780l = (InterfaceC11780l) obj;
                C6956l c6956l = (C6956l) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c6956l.billing(interfaceC11780l) ? 4 : 2;
                }
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 19) != 18)) {
                    InterfaceC4156l interfaceC4156l = (InterfaceC4156l) c7246l.f15076l.getValue();
                    if (AbstractC8576l.yandex(interfaceC4156l, C11046l.yandex)) {
                        c6956l.m2123default(-1584562846);
                        AbstractC7209l.yandex(AbstractC3605l.firebase(c4346l, interfaceC11780l), false, 0L, c6956l, 0, 6);
                        c6956l.startapp(false);
                    } else {
                        if (!(interfaceC4156l instanceof C16102l)) {
                            throw AbstractC12900l.billing(-1575130746, c6956l, false);
                        }
                        c6956l.m2123default(-1584217258);
                        C16102l c16102l = (C16102l) interfaceC4156l;
                        if (c16102l.yandex > 0) {
                            c6956l.m2123default(-1584201014);
                            C7537l c7537l = new C7537l(8.0f, true, new C8339l(12));
                            InterfaceC17242l interfaceC17242lMopub = AbstractC16422l.mopub(c4346l, interfaceC3102l.loadAd(), null);
                            boolean zAdmob = c6956l.admob(interfaceC4156l) | c6956l.admob(c7246l);
                            Object objM2132native = c6956l.m2132native();
                            if (zAdmob || objM2132native == c13863l) {
                                objM2132native = new C3005l(c16102l, c7246l, i4);
                                c6956l.m2147try(objM2132native);
                            }
                            AbstractC16336l.yandex(interfaceC17242lMopub, null, interfaceC11780l, c7537l, null, null, false, null, (Function1) objM2132native, c6956l, ((iIntValue << 6) & 896) | 24576, 490);
                            z = false;
                            c6956l.startapp(false);
                        } else {
                            c6956l.m2123default(-1578870812);
                            InterfaceC17242l interfaceC17242lFirebase = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l);
                            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                            long j = c6956l.f14595continue;
                            int i6 = (int) (j ^ (j >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
                            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lFirebase);
                            InterfaceC8801l.firebase.getClass();
                            C16395l c16395l = C3438l.loadAd;
                            c6956l.m2140super();
                            if (c6956l.f14603switch) {
                                c6956l.firebase(c16395l);
                            } else {
                                c6956l.m2136protected();
                            }
                            C6415l c6415l = C3438l.mopub;
                            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
                            C6415l c6415l2 = C3438l.billing;
                            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
                            Integer numValueOf = Integer.valueOf(i6);
                            C6415l c6415l3 = C3438l.isPro;
                            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
                            C11192l c11192l = C3438l.firebase;
                            AbstractC8182l.purchase(c6956l, c11192l);
                            C6415l c6415l4 = C3438l.amazon;
                            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
                            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(C16170l.yandex.yandex(c4346l, C18450l.f36043l), 16.0f, 0.0f, 2);
                            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l, 54);
                            long j2 = c6956l.f14595continue;
                            int i7 = (int) (j2 ^ (j2 >>> 32));
                            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
                            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lVip);
                            c6956l.m2140super();
                            if (c6956l.f14603switch) {
                                c6956l.firebase(c16395l);
                            } else {
                                c6956l.m2136protected();
                            }
                            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
                            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
                            AbstractC11043l.isPro(i7, c6956l, c6415l3, c6956l, c11192l);
                            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
                            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.find_duplicates_nothing), null, 0L, 0L, null, C6886l.f14424l, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 1572864, 0, 262078);
                            AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l, R.string.find_duplicates_nothing_text), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
                            z = false;
                            AbstractC12900l.ads(c6956l, true, true, false);
                        }
                        c6956l.startapp(z);
                    }
                } else {
                    c6956l.m2124else();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC4138l interfaceC4138l = (InterfaceC4138l) obj5;
                AbstractC11383l abstractC11383l = (AbstractC11383l) obj4;
                InterfaceC11780l interfaceC11780l2 = (InterfaceC11780l) obj;
                C6956l c6956l2 = (C6956l) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c6956l2.billing(interfaceC11780l2) ? 4 : 2;
                }
                if (!c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    c6956l2.m2124else();
                } else if (AbstractC8576l.yandex(interfaceC4138l.amazon(), C17306l.yandex)) {
                    c6956l2.m2123default(574655864);
                    boolean zBooleanValue = ((Boolean) abstractC11383l.f22961l.getValue()).booleanValue();
                    boolean zAdmob2 = c6956l2.admob(abstractC11383l);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new C14350l(abstractC11383l, 3);
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC9256l.loadAd(zBooleanValue, (Function0) objM2132native2, AbstractC3605l.firebase(c4346l, interfaceC11780l2), null, null, null, false, 0.0f, AbstractC14566l.amazon(1081571949, new C9672l(abstractC11383l, 1), c6956l2), c6956l2, 100663296, 248);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2123default(576869388);
                    InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(AbstractC3605l.smaato(AbstractC3605l.firebase(c4346l, interfaceC11780l2), 16.0f), 1.0f);
                    C14855l c14855l = C18450l.f36043l;
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(c14855l, false);
                    long j3 = c6956l2.f14595continue;
                    int i8 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato3 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l2, interfaceC17242lCrashlytics);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    C6415l c6415l5 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, c6415l5);
                    C6415l c6415l6 = C3438l.billing;
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato3, c6415l6);
                    Integer numValueOf2 = Integer.valueOf(i8);
                    C6415l c6415l7 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l2, numValueOf2, c6415l7);
                    C11192l c11192l2 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l2, c11192l2);
                    C6415l c6415l8 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling3, c6415l8);
                    InterfaceC17242l interfaceC17242lVip2 = AbstractC3605l.vip(AbstractC0080l.amazon(C16170l.yandex.yandex(c4346l, c14855l), 1.0f), 16.0f, 0.0f, 2);
                    C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36034l, c6956l2, 54);
                    long j4 = c6956l2.f14595continue;
                    int i9 = (int) (j4 ^ (j4 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato4 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l2, interfaceC17242lVip2);
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, c1853lYandex2, c6415l5);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato4, c6415l6);
                    AbstractC11043l.isPro(i9, c6956l2, c6415l7, c6956l2, c11192l2);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling4, c6415l8);
                    AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_music_outline_28, 0, c6956l2), null, AbstractC0080l.isPro(c4346l, 56.0f), 0L, c6956l2, 440, 8);
                    String strPurchase = AbstractC11999l.purchase(c6956l2, R.string.auth2_qr_code_camera_permission);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, null, 0L, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.billing, c6956l2, 0, 0, 130046);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l2, R.string.local_audio_perm), null, 0L, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.firebase, c6956l2, 0, 0, 130046);
                    boolean zBilling = c6956l2.billing(interfaceC4138l);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zBilling || objM2132native3 == c13863l) {
                        C13246l c13246l = new C13246l(0, interfaceC4138l, InterfaceC4138l.class, "launchPermissionRequest", "launchPermissionRequest()V", 0, 0, 11);
                        c6956l2.m2147try(c13246l);
                        objM2132native3 = c13246l;
                    }
                    AbstractC17457l.mopub((Function0) ((InterfaceC5059l) objM2132native3), null, false, null, null, null, AbstractC16357l.crashlytics, c6956l2, 805306368, 510);
                    AbstractC12900l.ads(c6956l2, true, true, false);
                }
                return Unit.INSTANCE;
            case 2:
                C6956l c6956l3 = (C6956l) obj2;
                ((Integer) obj3).getClass();
                c6956l3.m2123default(-353972293);
                ((InterfaceC2186l) obj5).yandex((C2403l) obj4, c6956l3);
                C6928l c6928l = C6928l.f14505l;
                boolean zBilling2 = c6956l3.billing(c6928l);
                Object objM2132native4 = c6956l3.m2132native();
                Object obj6 = objM2132native4;
                if (zBilling2 || objM2132native4 == c13863l) {
                    C11881l c11881l = new C11881l(c6928l);
                    c6956l3.m2147try(c11881l);
                    obj6 = c11881l;
                }
                C11881l c11881l2 = (C11881l) obj6;
                c6956l3.startapp(false);
                return c11881l2;
            case 3:
                InterfaceC3102l interfaceC3102l2 = (InterfaceC3102l) obj4;
                C15414l c15414l = (C15414l) obj5;
                InterfaceC11780l interfaceC11780l3 = (InterfaceC11780l) obj;
                C6956l c6956l4 = (C6956l) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= c6956l4.billing(interfaceC11780l3) ? 4 : 2;
                }
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lMopub2 = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l3), interfaceC3102l2.loadAd(), null);
                    boolean zAdmob3 = c6956l4.admob(c15414l);
                    Object objM2132native5 = c6956l4.m2132native();
                    if (zAdmob3 || objM2132native5 == c13863l) {
                        objM2132native5 = new C17015l(i4, c15414l);
                        c6956l4.m2147try(objM2132native5);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub2, null, null, null, null, null, false, null, (Function1) objM2132native5, c6956l4, 0, 510);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                C17984l c17984l = (C17984l) obj5;
                EnumC0442l enumC0442l = (EnumC0442l) obj4;
                InterfaceC11780l interfaceC11780l4 = (InterfaceC11780l) obj;
                C6956l c6956l5 = (C6956l) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= c6956l5.billing(interfaceC11780l4) ? 4 : 2;
                }
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lFirebase2 = AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l4);
                    InterfaceC10835l interfaceC10835lAmazon3 = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j5 = c6956l5.f14595continue;
                    int i10 = (int) (j5 ^ (j5 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato5 = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling5 = AbstractC17541l.billing(c6956l5, interfaceC17242lFirebase2);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l3 = C3438l.loadAd;
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l3);
                    } else {
                        c6956l5.m2136protected();
                    }
                    C6415l c6415l9 = C3438l.mopub;
                    AbstractC8182l.billing(c6956l5, interfaceC10835lAmazon3, c6415l9);
                    C6415l c6415l10 = C3438l.billing;
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato5, c6415l10);
                    Integer numValueOf3 = Integer.valueOf(i10);
                    C6415l c6415l11 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l5, numValueOf3, c6415l11);
                    C11192l c11192l3 = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l5, c11192l3);
                    C6415l c6415l12 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling5, c6415l12);
                    C15089l c15089l = C18450l.f36034l;
                    InterfaceC17242l interfaceC17242lVip3 = AbstractC3605l.vip(c4346l, 16.0f, 0.0f, 2);
                    C1853l c1853lYandex3 = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), c15089l, c6956l5, 54);
                    long j6 = c6956l5.f14595continue;
                    int i11 = (int) (j6 ^ (j6 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato6 = c6956l5.smaato();
                    InterfaceC17242l interfaceC17242lBilling6 = AbstractC17541l.billing(c6956l5, interfaceC17242lVip3);
                    c6956l5.m2140super();
                    if (c6956l5.f14603switch) {
                        c6956l5.firebase(c16395l3);
                    } else {
                        c6956l5.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l5, c1853lYandex3, c6415l9);
                    AbstractC8182l.billing(c6956l5, interfaceC18556lSmaato6, c6415l10);
                    AbstractC11043l.isPro(i11, c6956l5, c6415l11, c6956l5, c11192l3);
                    AbstractC8182l.billing(c6956l5, interfaceC17242lBilling6, c6415l12);
                    Object objM2132native6 = c6956l5.m2132native();
                    if (objM2132native6 == c13863l) {
                        objM2132native6 = AbstractC13273l.loadAd(c17984l.isVip(), enumC0442l.f1619l);
                        c6956l5.m2147try(objM2132native6);
                    }
                    C12371l.yandex(AbstractC7041l.yandex((Drawable) objM2132native6, c6956l5), AbstractC3605l.startapp(AbstractC0080l.isPro(c4346l, 52.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), null, null, 0.0f, c6956l5, 440, 120);
                    String strPurchase2 = AbstractC11999l.purchase(c6956l5, R.string.int_lg);
                    C10707l c10707l2 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase2, null, 0L, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l5.isPro(c10707l2)).loadAd.billing, c6956l5, 0, 0, 130046);
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, R.string.int_lg_sub), null, ((C14370l) c6956l5.isPro(c10707l2)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l5.isPro(c10707l2)).loadAd.firebase, c6956l5, 0, 0, 130042);
                    c6956l5.startapp(true);
                    c6956l5.startapp(true);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 5:
                C9554l c9554l = (C9554l) obj5;
                InterfaceC1982l interfaceC1982l = (InterfaceC1982l) obj4;
                AudioContentCard audioContentCard = (AudioContentCard) obj;
                C6956l c6956l6 = (C6956l) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? c6956l6.billing(audioContentCard) : c6956l6.admob(audioContentCard) ? 4 : 2;
                }
                if (c6956l6.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    boolean zAdmob4 = c6956l6.admob(c9554l);
                    Object objM2132native7 = c6956l6.m2132native();
                    if (zAdmob4 || objM2132native7 == c13863l) {
                        objM2132native7 = new C7730l(23, c9554l);
                        c6956l6.m2147try(objM2132native7);
                    }
                    Function0 function0 = (Function0) objM2132native7;
                    boolean zAdmob5 = c6956l6.admob(interfaceC1982l);
                    Object objM2132native8 = c6956l6.m2132native();
                    if (zAdmob5 || objM2132native8 == c13863l) {
                        objM2132native8 = new C7730l(24, interfaceC1982l);
                        c6956l6.m2147try(objM2132native8);
                    }
                    AbstractC12225l.yandex(audioContentCard, function0, (Function0) objM2132native8, false, c6956l6, 3080 | (iIntValue5 & 14));
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 6:
                C13695l c13695l = (C13695l) obj5;
                InterfaceC3102l interfaceC3102l3 = (InterfaceC3102l) obj4;
                InterfaceC11780l interfaceC11780l5 = (InterfaceC11780l) obj;
                C6956l c6956l7 = (C6956l) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= c6956l7.billing(interfaceC11780l5) ? 4 : 2;
                }
                if (!c6956l7.m2127for(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    c6956l7.m2124else();
                } else if (((Boolean) c13695l.f26740l.getValue()).booleanValue()) {
                    c6956l7.m2123default(1037974636);
                    AbstractC7209l.yandex(AbstractC3605l.firebase(c4346l, interfaceC11780l5), false, 0L, c6956l7, 0, 6);
                    c6956l7.startapp(false);
                } else {
                    c6956l7.m2123default(1038167549);
                    InterfaceC17242l interfaceC17242lMopub3 = AbstractC16422l.mopub(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l5), interfaceC3102l3.loadAd(), null);
                    boolean zAdmob6 = c6956l7.admob(c13695l);
                    Object objM2132native9 = c6956l7.m2132native();
                    if (zAdmob6 || objM2132native9 == c13863l) {
                        objM2132native9 = new C17015l(26, c13695l);
                        c6956l7.m2147try(objM2132native9);
                    }
                    AbstractC16336l.yandex(interfaceC17242lMopub3, null, null, null, null, null, false, null, (Function1) objM2132native9, c6956l7, 0, 510);
                    c6956l7.startapp(false);
                }
                return Unit.INSTANCE;
            case 7:
                AbstractC18082l abstractC18082l = (AbstractC18082l) obj5;
                Function1 function1 = (Function1) obj4;
                C9398l c9398l = (C9398l) obj;
                C6956l c6956l8 = (C6956l) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= c6956l8.billing(c9398l) ? 4 : 2;
                }
                if (c6956l8.m2127for(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    InterfaceC17242l interfaceC17242lYandex = c9398l.yandex(AbstractC3605l.smaato(c4346l, 4.0f), 1.0f, true);
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC4927l.amazon(AbstractC0019l.crashlytics(interfaceC17242lYandex, ((C14370l) c6956l8.isPro(c10707l3)).crashlytics.crashlytics), ((C14370l) c6956l8.isPro(c10707l3)).yandex.f2308package, AbstractC16837l.yandex);
                    ListIterator listIterator = abstractC18082l.listIterator(0);
                    while (listIterator.hasNext()) {
                        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) listIterator.next();
                        c6956l8.m2121class(1180339721, customCatalogBlockItem.admob);
                        boolean zBilling3 = c6956l8.billing(function1) | c6956l8.admob(customCatalogBlockItem);
                        Object objM2132native10 = c6956l8.m2132native();
                        if (zBilling3 || objM2132native10 == c13863l) {
                            objM2132native10 = new C9810l(function1, customCatalogBlockItem, i5);
                            c6956l8.m2147try(objM2132native10);
                        }
                        AbstractC18037l.amazon(customCatalogBlockItem, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native10, 15), c6956l8, 0);
                        c6956l8.startapp(false);
                    }
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 8:
                C16385l c16385l = (C16385l) obj5;
                Function0 function2 = (Function0) obj4;
                C6956l c6956l9 = (C6956l) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                if (c6956l9.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    c6956l9.m2123default(1205200615);
                    C11521l c11521l = new C11521l(0, EnumC6863l.f14355l);
                    while (c11521l.hasNext()) {
                        EnumC6863l enumC6863l = (EnumC6863l) c11521l.next();
                        C15578l c15578lAmazon = AbstractC14566l.amazon(-712872615, new C4951l(9, enumC6863l), c6956l9);
                        boolean zAdmob7 = c6956l9.admob(c16385l) | c6956l9.amazon(enumC6863l.ordinal()) | c6956l9.billing(function2);
                        Object objM2132native11 = c6956l9.m2132native();
                        if (zAdmob7 || objM2132native11 == c13863l) {
                            objM2132native11 = new Cfinally(c16385l, enumC6863l, function2, 20);
                            c6956l9.m2147try(objM2132native11);
                        }
                        AbstractC16727l.loadAd(c15578lAmazon, (Function0) objM2132native11, null, null, AbstractC14566l.amazon(-832688035, new C14601l(enumC6863l, c16385l, 29), c6956l9), false, null, null, c6956l9, 24582, 492);
                    }
                    c6956l9.startapp(false);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l9, 0, 7);
                    boolean zAdmob8 = c6956l9.admob(c16385l) | c6956l9.billing(function2);
                    Object objM2132native12 = c6956l9.m2132native();
                    if (zAdmob8 || objM2132native12 == c13863l) {
                        objM2132native12 = new C9810l(c16385l, function2, 13);
                        c6956l9.m2147try(objM2132native12);
                    }
                    AbstractC16727l.loadAd(AbstractC0622l.yandex, (Function0) objM2132native12, null, null, AbstractC14566l.amazon(2144667387, new C4951l(10, c16385l), c6956l9), false, null, null, c6956l9, 24582, 492);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case 9:
                C9502l c9502l = (C9502l) obj5;
                Function0 function3 = (Function0) obj4;
                C6956l c6956l10 = (C6956l) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                if (c6956l10.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    boolean zAdmob9 = c6956l10.admob(c9502l) | c6956l10.billing(function3);
                    Object objM2132native13 = c6956l10.m2132native();
                    if (zAdmob9 || objM2132native13 == c13863l) {
                        objM2132native13 = new C9810l(c9502l, function3, 15);
                        c6956l10.m2147try(objM2132native13);
                    }
                    AbstractC16727l.loadAd(AbstractC2296l.loadAd, (Function0) objM2132native13, null, null, AbstractC14566l.amazon(-1322337255, new C4951l(11, c9502l), c6956l10), false, null, null, c6956l10, 24582, 492);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C16385l c16385l2 = (C16385l) obj5;
                Function0 function4 = (Function0) obj4;
                C6956l c6956l11 = (C6956l) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                if (c6956l11.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    c6956l11.m2123default(-1670571729);
                    C11521l c11521l2 = new C11521l(0, EnumC9700l.f19782l);
                    while (c11521l2.hasNext()) {
                        EnumC9700l enumC9700l = (EnumC9700l) c11521l2.next();
                        C15578l c15578lAmazon2 = AbstractC14566l.amazon(-514747999, new C4951l(i4, enumC9700l), c6956l11);
                        boolean zAdmob10 = c6956l11.admob(c16385l2) | c6956l11.amazon(enumC9700l.ordinal()) | c6956l11.billing(function4);
                        Object objM2132native14 = c6956l11.m2132native();
                        if (zAdmob10 || objM2132native14 == c13863l) {
                            objM2132native14 = new Cfinally(c16385l2, enumC9700l, function4, 21);
                            c6956l11.m2147try(objM2132native14);
                        }
                        AbstractC16727l.loadAd(c15578lAmazon2, (Function0) objM2132native14, null, null, AbstractC14566l.amazon(-634563419, new C3158l(enumC9700l, c16385l2, 3), c6956l11), false, null, null, c6956l11, 24582, 492);
                    }
                    c6956l11.startapp(false);
                    AbstractC0555l.loadAd(null, 0.0f, 0L, c6956l11, 0, 7);
                    boolean zAdmob11 = c6956l11.admob(c16385l2) | c6956l11.billing(function4);
                    Object objM2132native15 = c6956l11.m2132native();
                    if (zAdmob11 || objM2132native15 == c13863l) {
                        objM2132native15 = new C9810l(c16385l2, function4, i3);
                        c6956l11.m2147try(objM2132native15);
                    }
                    AbstractC16727l.loadAd(AbstractC8069l.yandex, (Function0) objM2132native15, null, null, AbstractC14566l.amazon(-1952175293, new C0259l(c16385l2), c6956l11), false, null, null, c6956l11, 24582, 492);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                return yandex(obj, obj2, obj3);
            case 12:
                C11655l c11655l = (C11655l) obj5;
                CachedTrack cachedTrack = (CachedTrack) obj4;
                C6956l c6956l12 = (C6956l) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                if (c6956l12.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    boolean z3 = c11655l.m2931abstract() == EnumC11447l.f23032l;
                    AbstractC18643l abstractC18643lM2933instanceof = c11655l.m2933instanceof();
                    C2287l.loadAd(z3, AbstractC8576l.yandex(abstractC18643lM2933instanceof != null ? abstractC18643lM2933instanceof.startapp() : null, cachedTrack.premium()), AbstractC14566l.amazon(-826371006, new C14219l(cachedTrack, i5), c6956l12), c6956l12, 384);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case 13:
                C11655l c11655l2 = (C11655l) obj5;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) obj4;
                InterfaceC11780l interfaceC11780l6 = (InterfaceC11780l) obj;
                C6956l c6956l13 = (C6956l) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= c6956l13.billing(interfaceC11780l6) ? 4 : 2;
                }
                if (c6956l13.m2127for(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    AbstractC3274l.yandex(AbstractC3605l.firebase(AbstractC0080l.crashlytics(c4346l, 1.0f), interfaceC11780l6), AbstractC7497l.loadAd(12), ((C14370l) c6956l13.isPro(AbstractC16964l.yandex)).yandex.ads, 0L, 0.0f, 0.0f, null, AbstractC14566l.amazon(1576686389, new C3158l(c11655l2, interfaceC12244l, 8), c6956l13), c6956l13, 12582912, 120);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 14:
                return billing(obj, obj2, obj3);
            case 15:
                return mopub(obj, obj2, obj3);
            case 16:
                return admob(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return subs(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return isPro(obj, obj2, obj3);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return smaato(obj, obj2, obj3);
            case 20:
                return remoteconfig(obj, obj2, obj3);
            case 21:
                return metrica(obj, obj2, obj3);
            case 22:
                return startapp(obj, obj2, obj3);
            case 23:
                return adcel(obj, obj2, obj3);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ads(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return subscription(obj, obj2, obj3);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Signature(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return license(obj, obj2, obj3);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return pro(obj, obj2, obj3);
            default:
                C4261l c4261l = (C4261l) obj5;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) obj4;
                C7091l c7091l = (C7091l) obj;
                C6956l c6956l14 = (C6956l) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= c6956l14.billing(c7091l) ? 4 : 2;
                }
                if (c6956l14.m2127for(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    Unit unit = Unit.INSTANCE;
                    boolean zAdmob12 = c6956l14.admob(c4261l) | c6956l14.billing(interfaceC12244l2);
                    Object objM2132native16 = c6956l14.m2132native();
                    if (zAdmob12 || objM2132native16 == c13863l) {
                        objM2132native16 = new C17949l(c4261l, interfaceC12244l2, z2 ? 1 : 0, i2);
                        c6956l14.m2147try(objM2132native16);
                    }
                    AbstractC12311l.amazon(c6956l14, unit, (Function2) objM2132native16);
                    InterfaceC17242l interfaceC17242lSmaato = AbstractC5020l.smaato(c7091l, AbstractC3605l.smaato(c4346l, 16.0f));
                    InterfaceC10835l interfaceC10835lAmazon4 = AbstractC9383l.amazon(C18450l.f36043l, false);
                    long j7 = c6956l14.f14595continue;
                    int i12 = (int) (j7 ^ (j7 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato7 = c6956l14.smaato();
                    InterfaceC17242l interfaceC17242lBilling7 = AbstractC17541l.billing(c6956l14, interfaceC17242lSmaato);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l4 = C3438l.loadAd;
                    c6956l14.m2140super();
                    if (c6956l14.f14603switch) {
                        c6956l14.firebase(c16395l4);
                    } else {
                        c6956l14.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l14, interfaceC10835lAmazon4, C3438l.mopub);
                    AbstractC8182l.billing(c6956l14, interfaceC18556lSmaato7, C3438l.billing);
                    AbstractC8182l.billing(c6956l14, Integer.valueOf(i12), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l14, C3438l.firebase);
                    AbstractC8182l.billing(c6956l14, interfaceC17242lBilling7, C3438l.amazon);
                    AbstractC8960l.loadAd(null, 0L, null, c6956l14, 0, 7);
                    c6956l14.startapp(true);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0541l(Object obj, Object obj2, int i) {
        this.f1859l = i;
        this.f1858l = obj;
        this.f1857l = obj2;
    }
}
