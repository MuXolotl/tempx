package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* JADX INFO: renamed from: lؘؒۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1295l {
    public static final C15578l yandex = new C15578l(954879418, false, new C13982l(24));
    public static final C15578l loadAd = new C15578l(1918065384, false, new C13982l(25));

    public static final boolean admob(InterfaceC18035l interfaceC18035l) {
        List annotations = interfaceC18035l.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof InterfaceC4545l) {
                return true;
            }
        }
        return false;
    }

    public static final Long amazon(InterfaceC18035l interfaceC18035l, int i) {
        Object next;
        Iterator it = interfaceC18035l.subs(i).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Annotation) next) instanceof InterfaceC13186l));
        InterfaceC13186l interfaceC13186l = (InterfaceC13186l) next;
        if (interfaceC13186l != null) {
            return Long.valueOf(interfaceC13186l.label());
        }
        return null;
    }

    public static final long[] billing(InterfaceC18035l interfaceC18035l) {
        List annotations = interfaceC18035l.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (Object obj : annotations) {
            if (obj instanceof InterfaceC7407l) {
                arrayList.add(obj);
            }
        }
        InterfaceC7407l interfaceC7407l = (InterfaceC7407l) AbstractC16901l.m4217extends(arrayList);
        if (interfaceC7407l != null) {
            return interfaceC7407l.tags();
        }
        return null;
    }

    public static C2993l crashlytics() {
        return new C2993l(null);
    }

    public static final void loadAd(CustomCatalogBlockItem customCatalogBlockItem, Function0 function0, C6956l c6956l, int i) {
        CustomCatalogBlockItem customCatalogBlockItem2 = customCatalogBlockItem;
        C6956l c6956l2 = c6956l;
        List list = customCatalogBlockItem2.crashlytics;
        c6956l2.m2133new(1713628547);
        int i2 = i | (c6956l2.admob(customCatalogBlockItem2) ? 4 : 2) | (c6956l2.admob(function0) ? 32 : 16);
        if (c6956l2.m2127for(i2 & 1, (i2 & 19) != 18)) {
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lLoadAd = AbstractC9151l.loadAd(AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f), false, null, function0, 15);
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l2, 48);
            long j = c6956l2.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, interfaceC17242lLoadAd);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            boolean zBilling = c6956l2.billing(list);
            Object objM2132native = c6956l2.m2132native();
            if (zBilling || objM2132native == C1867l.yandex) {
                String strCrashlytics = list != null ? AbstractC8320l.crashlytics(list) : null;
                c6956l2.m2147try(strCrashlytics);
                objM2132native = strCrashlytics;
            }
            String str = (String) objM2132native;
            InterfaceC17242l interfaceC17242lIsPro = AbstractC0080l.isPro(AbstractC0019l.crashlytics(c4346l, AbstractC7497l.yandex), 48.0f);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC7741l.purchase(str, null, interfaceC17242lIsPro, new C18627l(((C14370l) c6956l2.isPro(c10707l)).yandex.signatures), null, C4176l.yandex, c6956l2, 4144, 6, 31728);
            AbstractC9334l.yandex(c6956l2, AbstractC0080l.vip(c4346l, 16.0f));
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l2, 0);
            long j2 = c6956l2.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l2, c6415l3, c6956l2, c11192l);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, c6415l4);
            customCatalogBlockItem2 = customCatalogBlockItem;
            AbstractC13010l.loadAd(customCatalogBlockItem2.yandex, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
            AbstractC13010l.loadAd(customCatalogBlockItem2.loadAd, null, ((C14370l) c6956l.isPro(c10707l)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
            c6956l2 = c6956l;
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(customCatalogBlockItem2, function0, i, 6);
        }
    }

    public static final long[] mopub(InterfaceC18035l interfaceC18035l, int i) {
        Object next;
        Iterator it = interfaceC18035l.subs(i).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Annotation) next) instanceof InterfaceC14463l));
        InterfaceC14463l interfaceC14463l = (InterfaceC14463l) next;
        if (interfaceC14463l != null) {
            return interfaceC14463l.tags();
        }
        return null;
    }

    public static final long[] purchase(InterfaceC18035l interfaceC18035l, int i) {
        Object next;
        Iterator it = interfaceC18035l.subs(i).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Annotation) next) instanceof InterfaceC14429l));
        InterfaceC14429l interfaceC14429l = (InterfaceC14429l) next;
        if (interfaceC14429l != null) {
            return interfaceC14429l.tags();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x001f A[RETURN] */
    public static final boolean subs(InterfaceC18035l interfaceC18035l, int i) {
        for (Object obj : interfaceC18035l.subs(i)) {
            if (((Annotation) obj) instanceof InterfaceC2174l) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static final void yandex(InterfaceC17242l interfaceC17242l, C12818l c12818l, Function1 function1, C6956l c6956l, int i) {
        c6956l.m2133new(1127677005);
        if ((((c6956l.billing(c12818l) ? 32 : 16) | i | (c6956l.billing(function1) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128)) & 731) == 146 && c6956l.isVip()) {
            c6956l.m2124else();
        } else {
            c6956l.m2125final(1157296644);
            boolean zBilling = c6956l.billing(c12818l);
            Object objM2132native = c6956l.m2132native();
            int i2 = 1;
            Object obj = C1867l.yandex;
            int i3 = 0;
            if (zBilling || objM2132native == obj) {
                objM2132native = C1083l.startapp(AbstractC14055l.remoteconfig(new C9735l(C12818l.yandex(c12818l, 0.0f, 0.0f, 0.0f, 1.0f, 7).loadAd()), new C9735l(AbstractC12953l.loadAd(16777215))));
                c6956l.m2147try(objM2132native);
            }
            c6956l.startapp(false);
            AbstractC9544l abstractC9544l = (AbstractC9544l) objM2132native;
            InterfaceC17242l interfaceC17242lCrashlytics = AbstractC0080l.crashlytics(interfaceC17242l, 1.0f);
            Unit unit = Unit.INSTANCE;
            c6956l.m2125final(1157296644);
            boolean zBilling2 = c6956l.billing(function1);
            Object objM2132native2 = c6956l.m2132native();
            if (zBilling2 || objM2132native2 == obj) {
                objM2132native2 = new C15908l(i2, null, function1);
                c6956l.m2147try(objM2132native2);
            }
            c6956l.startapp(false);
            InterfaceC17242l interfaceC17242lPremium = interfaceC17242lCrashlytics.premium(new C8110l(unit, null, null, new C15463l((Function2) objM2132native2), 6));
            c6956l.m2125final(511388516);
            boolean zBilling3 = c6956l.billing(abstractC9544l) | c6956l.billing(c12818l);
            Object objM2132native3 = c6956l.m2132native();
            if (zBilling3 || objM2132native3 == obj) {
                objM2132native3 = new C7105l(abstractC9544l, c12818l, i3);
                c6956l.m2147try(objM2132native3);
            }
            c6956l.startapp(false);
            AbstractC12155l.yandex(interfaceC17242lPremium, (Function1) objM2132native3, c6956l, 0);
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds == null) {
            return;
        }
        c4224lAds.amazon = new C3443l(interfaceC17242l, c12818l, function1, i, 0);
    }
}
