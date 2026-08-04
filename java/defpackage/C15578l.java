package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

/* JADX INFO: renamed from: lٍؚٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15578l implements Function2, Function3, Function4, Function5, Function6, Function7, Function8, Function9, Function10, Function11, Function13, Function14, Function15, Function16, Function17, Function18, Function19, Function20, Function21 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC14328l f30420l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f30421l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f30422l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public ArrayList f30423l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C4224l f30424l;

    public C15578l(int i, boolean z, InterfaceC14328l interfaceC14328l) {
        this.f30422l = i;
        this.f30421l = z;
        this.f30420l = interfaceC14328l;
    }

    public final Object Signature(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, C6956l c6956l, final int i, final int i2) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 13) : AbstractC14566l.yandex(1, 13);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(16, interfaceC14328l);
        Object objInvoke = ((Function16) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, c6956l, Integer.valueOf(i), Integer.valueOf(i2 | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٌؘ۟
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj14, Object obj15) {
                    ((Integer) obj15).getClass();
                    int iPurchase = AbstractC0545l.purchase(i) | 1;
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    this.f17723l.Signature(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, (C6956l) obj14, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public final Object ad(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, final Object obj16, C6956l c6956l, final int i, final int i2) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 16) : AbstractC14566l.yandex(1, 16);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(19, interfaceC14328l);
        Object objInvoke = ((Function19) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, c6956l, Integer.valueOf(i), Integer.valueOf(i2 | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؚۡؒ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj17, Object obj18) {
                    ((Integer) obj18).getClass();
                    int iPurchase = AbstractC0545l.purchase(i) | 1;
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    this.f15568l.ad(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, (C6956l) obj17, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public final Object adcel(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, C6956l c6956l, final int i, int i2) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 10) : AbstractC14566l.yandex(1, 10);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(13, interfaceC14328l);
        Object objInvoke = ((Function13) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, c6956l, Integer.valueOf(i), Integer.valueOf(i2 | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؔٝ۟
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    ((Integer) obj12).getClass();
                    int i3 = i;
                    this.f6037l.adcel(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, (C6956l) obj11, i3 | 1, i3);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public final Object admob(Object obj, Object obj2, Object obj3, C6956l c6956l, int i) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 3) : AbstractC14566l.yandex(1, 3);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(5, interfaceC14328l);
        Object objInvoke = ((Function5) interfaceC14328l).invoke(obj, obj2, obj3, c6956l, Integer.valueOf(iYandex | i));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17983l(this, obj, obj2, obj3, i, 5);
        }
        return objInvoke;
    }

    public final Object ads(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, C6956l c6956l, final int i, final int i2) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 11) : AbstractC14566l.yandex(1, 11);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(14, interfaceC14328l);
        Object objInvoke = ((Function14) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, c6956l, Integer.valueOf(i), Integer.valueOf(i2 | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds == null) {
            return objInvoke;
        }
        c4224lAds.amazon = new Function2() { // from class: lؙؖؒ
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj12, Object obj13) {
                ((Integer) obj13).getClass();
                int iPurchase = AbstractC0545l.purchase(i) | 1;
                int iPurchase2 = AbstractC0545l.purchase(i2);
                this.f13190l.ads(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, (C6956l) obj12, iPurchase, iPurchase2);
                return Unit.INSTANCE;
            }
        };
        return objInvoke;
    }

    public final Object advert(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, final Object obj16, final Object obj17, C6956l c6956l, final int i, final int i2) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 17) : AbstractC14566l.yandex(1, 17);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(20, interfaceC14328l);
        Object objInvoke = ((Function20) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, c6956l, Integer.valueOf(i), Integer.valueOf(i2 | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؔۖۤ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj18, Object obj19) {
                    ((Integer) obj19).getClass();
                    int iPurchase = AbstractC0545l.purchase(i) | 1;
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    this.f6175l.advert(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, (C6956l) obj18, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public final Object billing(Object obj, C6956l c6956l, int i) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 1) : AbstractC14566l.yandex(1, 1);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(3, interfaceC14328l);
        Object objInvoke = ((Function3) interfaceC14328l).invoke(obj, c6956l, Integer.valueOf(iYandex | i));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(this, obj, i, 4);
        }
        return objInvoke;
    }

    @Override // kotlin.jvm.functions.Function21
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        return isVip(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, (C6956l) obj19, ((Number) obj20).intValue(), ((Number) obj21).intValue());
    }

    public final Object isPro(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, C6956l c6956l, int i) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 5) : AbstractC14566l.yandex(1, 5);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(7, interfaceC14328l);
        Object objInvoke = ((Function7) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, c6956l, Integer.valueOf(i | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4227l(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return objInvoke;
    }

    public final Object isVip(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, final Object obj16, final Object obj17, final Object obj18, C6956l c6956l, final int i, final int i2) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 18) : AbstractC14566l.yandex(1, 18);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(21, interfaceC14328l);
        Object objInvoke = ((Function21) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, c6956l, Integer.valueOf(i), Integer.valueOf(i2 | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lّٜؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj19, Object obj20) {
                    ((Integer) obj20).getClass();
                    int iPurchase = AbstractC0545l.purchase(i) | 1;
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    this.f25059l.isVip(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, (C6956l) obj19, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public final Object license(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, C6956l c6956l, final int i, final int i2) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 14) : AbstractC14566l.yandex(1, 14);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(17, interfaceC14328l);
        Object objInvoke = ((Function17) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, c6956l, Integer.valueOf(i), Integer.valueOf(i2 | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٌٍٕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj15, Object obj16) {
                    ((Integer) obj16).getClass();
                    int iPurchase = AbstractC0545l.purchase(i) | 1;
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    this.f17876l.license(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, (C6956l) obj15, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public final Object metrica(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, C6956l c6956l, int i) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 8) : AbstractC14566l.yandex(1, 8);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(10, interfaceC14328l);
        Object objInvoke = ((Function10) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, c6956l, Integer.valueOf(i | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16333l(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, i, 1);
        }
        return objInvoke;
    }

    public final Object mopub(Object obj, Object obj2, C6956l c6956l, int i) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 2) : AbstractC14566l.yandex(1, 2);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(4, interfaceC14328l);
        Object objInvoke = ((Function4) interfaceC14328l).invoke(obj, obj2, c6956l, Integer.valueOf(iYandex | i));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4810l(this, obj, obj2, i, 8);
        }
        return objInvoke;
    }

    public final void premium(C6956l c6956l) {
        C4224l c4224lPro;
        if (!this.f30421l || (c4224lPro = c6956l.pro()) == null) {
            return;
        }
        c4224lPro.loadAd |= 1;
        if (AbstractC14566l.purchase(this.f30424l, c4224lPro)) {
            this.f30424l = c4224lPro;
            return;
        }
        ArrayList arrayList = this.f30423l;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f30423l = arrayList2;
            arrayList2.add(c4224lPro);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC14566l.purchase((C4224l) arrayList.get(i), c4224lPro)) {
                arrayList.set(i, c4224lPro);
                return;
            }
        }
        arrayList.add(c4224lPro);
    }

    public final Object pro(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, final Object obj13, final Object obj14, final Object obj15, C6956l c6956l, final int i, final int i2) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 15) : AbstractC14566l.yandex(1, 15);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(18, interfaceC14328l);
        Object objInvoke = ((Function18) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, c6956l, Integer.valueOf(i), Integer.valueOf(i2 | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lؑؒؒ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj16, Object obj17) {
                    ((Integer) obj17).getClass();
                    int iPurchase = AbstractC0545l.purchase(i) | 1;
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    this.f888l.pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, (C6956l) obj16, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public final Object remoteconfig(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, C6956l c6956l, final int i) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 7) : AbstractC14566l.yandex(1, 7);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(9, interfaceC14328l);
        Object objInvoke = ((Function9) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, c6956l, Integer.valueOf(i | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٌٖۚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    this.f32591l.remoteconfig(obj, obj2, obj3, obj4, obj5, obj6, obj7, (C6956l) obj8, AbstractC0545l.purchase(i) | 1);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public final Object smaato(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, C6956l c6956l, int i) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 6) : AbstractC14566l.yandex(1, 6);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(8, interfaceC14328l);
        Object objInvoke = ((Function8) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, c6956l, Integer.valueOf(i | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C18599l(this, obj, obj2, obj3, obj4, obj5, obj6, i);
        }
        return objInvoke;
    }

    public final Object startapp(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, C6956l c6956l, final int i) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 9) : AbstractC14566l.yandex(1, 9);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(11, interfaceC14328l);
        Object objInvoke = ((Function11) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, c6956l, Integer.valueOf(i | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٌِٚ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj10, Object obj11) {
                    ((Integer) obj11).getClass();
                    this.f17947l.startapp(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (C6956l) obj10, AbstractC0545l.purchase(i) | 1);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public final Object subs(Object obj, Object obj2, Object obj3, Object obj4, C6956l c6956l, int i) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 4) : AbstractC14566l.yandex(1, 4);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(6, interfaceC14328l);
        Object objInvoke = ((Function6) interfaceC14328l).invoke(obj, obj2, obj3, obj4, c6956l, Integer.valueOf(i | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C5418l(this, obj, obj2, obj3, obj4, i, 1);
        }
        return objInvoke;
    }

    public final Object subscription(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, C6956l c6956l, final int i, final int i2) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = c6956l.billing(this) ? AbstractC14566l.yandex(2, 12) : AbstractC14566l.yandex(1, 12);
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(15, interfaceC14328l);
        Object objInvoke = ((Function15) interfaceC14328l).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, c6956l, Integer.valueOf(i), Integer.valueOf(i2 | iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٌٓۘ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj13, Object obj14) {
                    ((Integer) obj14).getClass();
                    int iPurchase = AbstractC0545l.purchase(i) | 1;
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    this.f27344l.subscription(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, (C6956l) obj13, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
        return objInvoke;
    }

    public final Object yandex(C6956l c6956l, int i) {
        c6956l.m2133new(this.f30422l);
        premium(c6956l);
        int iYandex = i | (c6956l.billing(this) ? AbstractC14566l.yandex(2, 0) : AbstractC14566l.yandex(1, 0));
        InterfaceC14328l interfaceC14328l = this.f30420l;
        AbstractC9464l.purchase(2, interfaceC14328l);
        Object objInvoke = ((Function2) interfaceC14328l).invoke(c6956l, Integer.valueOf(iYandex));
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C11491l(2, this, C15578l.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return billing(obj, (C6956l) obj2, ((Number) obj3).intValue());
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return mopub(obj, obj2, (C6956l) obj3, ((Number) obj4).intValue());
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return admob(obj, obj2, obj3, (C6956l) obj4, ((Number) obj5).intValue());
    }

    @Override // kotlin.jvm.functions.Function6
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return subs(obj, obj2, obj3, obj4, (C6956l) obj5, ((Number) obj6).intValue());
    }

    @Override // kotlin.jvm.functions.Function7
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return isPro(obj, obj2, obj3, obj4, obj5, (C6956l) obj6, ((Number) obj7).intValue());
    }

    @Override // kotlin.jvm.functions.Function8
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return smaato(obj, obj2, obj3, obj4, obj5, obj6, (C6956l) obj7, ((Number) obj8).intValue());
    }

    @Override // kotlin.jvm.functions.Function9
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return remoteconfig(obj, obj2, obj3, obj4, obj5, obj6, obj7, (C6956l) obj8, ((Number) obj9).intValue());
    }

    @Override // kotlin.jvm.functions.Function10
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return metrica(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (C6956l) obj9, ((Number) obj10).intValue());
    }

    @Override // kotlin.jvm.functions.Function11
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return startapp(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, (C6956l) obj10, ((Number) obj11).intValue());
    }

    @Override // kotlin.jvm.functions.Function13
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        return adcel(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, (C6956l) obj11, ((Number) obj12).intValue(), ((Number) obj13).intValue());
    }

    @Override // kotlin.jvm.functions.Function14
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        return ads(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, (C6956l) obj12, ((Number) obj13).intValue(), ((Number) obj14).intValue());
    }

    @Override // kotlin.jvm.functions.Function15
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        return subscription(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, (C6956l) obj13, ((Number) obj14).intValue(), ((Number) obj15).intValue());
    }

    @Override // kotlin.jvm.functions.Function16
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        return Signature(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, (C6956l) obj14, ((Number) obj15).intValue(), ((Number) obj16).intValue());
    }

    @Override // kotlin.jvm.functions.Function17
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        return license(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, (C6956l) obj15, ((Number) obj16).intValue(), ((Number) obj17).intValue());
    }

    @Override // kotlin.jvm.functions.Function18
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        return pro(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, (C6956l) obj16, ((Number) obj17).intValue(), ((Number) obj18).intValue());
    }

    @Override // kotlin.jvm.functions.Function19
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        return ad(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, (C6956l) obj17, ((Number) obj18).intValue(), ((Number) obj19).intValue());
    }

    @Override // kotlin.jvm.functions.Function20
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        return advert(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, (C6956l) obj18, ((Number) obj19).intValue(), ((Number) obj20).intValue());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return yandex((C6956l) obj, ((Number) obj2).intValue());
    }
}
