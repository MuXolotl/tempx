package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٖٕٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16385l extends AbstractC11383l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final /* synthetic */ int f32035l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C10086l f32036l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public final C10086l f32037l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final C10086l f32038l;

    public C16385l(int i) {
        this.f32035l = i;
        switch (i) {
            case 1:
                this.f32036l = AbstractC8020l.smaato(AbstractC0968l.loadAd.yandex());
                this.f32037l = AbstractC8020l.smaato(AbstractC0968l.yandex.yandex());
                this.f32038l = AbstractC8020l.smaato(Boolean.FALSE);
                break;
            default:
                this.f32036l = AbstractC8020l.smaato(AbstractC0968l.amazon.yandex());
                this.f32037l = AbstractC8020l.smaato(AbstractC0968l.crashlytics.yandex());
                this.f32038l = AbstractC8020l.smaato(Boolean.FALSE);
                break;
        }
    }

    /* JADX INFO: renamed from: const, reason: not valid java name */
    public boolean m4174const() {
        return ((Boolean) this.f32036l.getValue()).booleanValue();
    }

    @Override // defpackage.AbstractC11383l
    /* JADX INFO: renamed from: finally */
    public final void mo2666finally(int i, int i2, C6956l c6956l) {
        Object c18435l;
        Object c18435l2;
        C6956l c6956l2 = c6956l;
        int i3 = this.f32035l;
        C13863l c13863l = C1867l.yandex;
        switch (i3) {
            case 0:
                c6956l2.m2133new(512526969);
                int i4 = i2 | (c6956l2.amazon(i) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
                if (c6956l2.m2127for(i4 & 1, (i4 & 19) != 18)) {
                    boolean z = (i4 & 14) == 4;
                    Object objM2132native = c6956l2.m2132native();
                    if (z || objM2132native == c13863l) {
                        Context context = this.f34617l;
                        try {
                            c18435l = (context != null ? context.getResources() : null).getQuantityString(R.plurals.albums, i, Integer.valueOf(i));
                        } catch (Throwable th) {
                            c18435l = new C18435l(th);
                        }
                        if (C1171l.yandex(c18435l) != null) {
                            c18435l = String.valueOf(i);
                        }
                        objM2132native = (String) c18435l;
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC13010l.loadAd((String) objM2132native, null, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
                } else {
                    c6956l.m2124else();
                }
                C4224l c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C1674l(this, i, i2, 7);
                }
                break;
            default:
                c6956l2.m2133new(710651585);
                int i5 = i2 | (c6956l2.amazon(i) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
                if (c6956l2.m2127for(i5 & 1, (i5 & 19) != 18)) {
                    boolean z2 = (i5 & 14) == 4;
                    Object objM2132native2 = c6956l2.m2132native();
                    if (z2 || objM2132native2 == c13863l) {
                        Context context2 = this.f34617l;
                        try {
                            c18435l2 = (context2 != null ? context2.getResources() : null).getQuantityString(R.plurals.tracks, i, Integer.valueOf(i));
                        } catch (Throwable th2) {
                            c18435l2 = new C18435l(th2);
                        }
                        if (C1171l.yandex(c18435l2) != null) {
                            c18435l2 = String.valueOf(i);
                        }
                        objM2132native2 = (String) c18435l2;
                        c6956l2.m2147try(objM2132native2);
                    }
                    AbstractC13010l.loadAd((String) objM2132native2, null, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
                    c6956l2 = c6956l;
                } else {
                    c6956l2.m2124else();
                }
                C4224l c4224lAds2 = c6956l2.ads();
                if (c4224lAds2 != null) {
                    c4224lAds2.amazon = new C1674l(this, i, i2, 9);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: implements, reason: not valid java name */
    public void m4175implements(C16820l c16820l, C6956l c6956l, int i) {
        C16820l c16820l2;
        C6956l c6956l2;
        c6956l.m2133new(893161285);
        int i2 = 4;
        int i3 = (c6956l.billing(c16820l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            EnumC11447l enumC11447lM2931abstract = m2931abstract();
            AbstractC18643l abstractC18643lM2933instanceof = m2933instanceof();
            String strStartapp = abstractC18643lM2933instanceof != null ? abstractC18643lM2933instanceof.startapp() : null;
            int i4 = i3 & 14;
            boolean zAdmob = c6956l.admob(this) | (i4 == 4);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C9810l(this, c16820l, 17);
                c6956l.m2147try(objM2132native);
            }
            c16820l2 = c16820l;
            c6956l2 = c6956l;
            AbstractC10114l.yandex(c16820l2, enumC11447lM2931abstract, strStartapp, (Function0) objM2132native, c6956l2, i4);
        } else {
            c16820l2 = c16820l;
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(this, c16820l2, i, i2);
        }
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public void m4176protected(final C14286l c14286l, C6956l c6956l, int i) {
        c6956l.m2133new(-177889106);
        final int i2 = 2;
        int i3 = (c6956l.admob(c14286l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        final int i4 = 0;
        final int i5 = 1;
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            boolean zAdmob = c6956l.admob(this) | c6956l.admob(c14286l);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C9810l(this, c14286l, 12);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-1930952180, new Function2() { // from class: lٖۥٞ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    C14286l c14286l2 = c14286l;
                    switch (i6) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(c14286l2.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        case 1:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AbstractC13010l.loadAd(c14286l2.amazon, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l4 = (C6956l) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                C10707l c10707l = AbstractC16964l.yandex;
                                AbstractC7741l.purchase(c14286l2.subs, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 48.0f), ((C14370l) c6956l4.isPro(c10707l)).crashlytics.amazon), new C18627l(((C14370l) c6956l4.isPro(c10707l)).yandex.signatures), new C18627l(((C14370l) c6956l4.isPro(c10707l)).yandex.signatures), C4176l.yandex, c6956l4, 36912, 6, 31712);
                            } else {
                                c6956l4.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, AbstractC14566l.amazon(-1183116977, new Function2() { // from class: lٖۥٞ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    C14286l c14286l2 = c14286l;
                    switch (i6) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(c14286l2.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        case 1:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AbstractC13010l.loadAd(c14286l2.amazon, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l4 = (C6956l) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                C10707l c10707l = AbstractC16964l.yandex;
                                AbstractC7741l.purchase(c14286l2.subs, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 48.0f), ((C14370l) c6956l4.isPro(c10707l)).crashlytics.amazon), new C18627l(((C14370l) c6956l4.isPro(c10707l)).yandex.signatures), new C18627l(((C14370l) c6956l4.isPro(c10707l)).yandex.signatures), C4176l.yandex, c6956l4, 36912, 6, 31712);
                            } else {
                                c6956l4.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), AbstractC14566l.amazon(-933838576, new Function2() { // from class: lٖۥٞ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i2;
                    C14286l c14286l2 = c14286l;
                    switch (i6) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(c14286l2.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        case 1:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                AbstractC13010l.loadAd(c14286l2.amazon, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l3, 0, 0, 262142);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l4 = (C6956l) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                C10707l c10707l = AbstractC16964l.yandex;
                                AbstractC7741l.purchase(c14286l2.subs, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 48.0f), ((C14370l) c6956l4.isPro(c10707l)).crashlytics.amazon), new C18627l(((C14370l) c6956l4.isPro(c10707l)).yandex.signatures), new C18627l(((C14370l) c6956l4.isPro(c10707l)).yandex.signatures), C4176l.yandex, c6956l4, 36912, 6, 31712);
                            } else {
                                c6956l4.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), null, null, c6956l, 27654, 484);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(this, c14286l, i, i4);
        }
    }

    @Override // defpackage.AbstractC11383l
    /* JADX INFO: renamed from: public */
    public final void mo2668public(Function0 function0, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        int i2 = this.f32035l;
        C10086l c10086l = this.f32038l;
        C4346l c4346l = C4346l.f8873l;
        C13863l c13863l = C1867l.yandex;
        int i3 = 2;
        final int i4 = 0;
        final int i5 = 1;
        switch (i2) {
            case 0:
                c6956l2.m2133new(-450273550);
                int i6 = i | (c6956l2.admob(function0) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
                if (c6956l2.m2127for(i6 & 1, (i6 & 19) != 18)) {
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j = c6956l2.f14595continue;
                    int i7 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
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
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i7), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
                    boolean zAdmob = c6956l2.admob(this);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == c13863l) {
                        objM2132native = new Function0(this) { // from class: lَؕٛ

                            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                            public final /* synthetic */ C16385l f20549l;

                            {
                                this.f20549l = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i4;
                                C16385l c16385l = this.f20549l;
                                switch (i8) {
                                    case 0:
                                        c16385l.f32038l.setValue(Boolean.TRUE);
                                        break;
                                    default:
                                        c16385l.f32038l.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native, null, false, null, null, null, AbstractC14566l.amazon(973346447, new C16561l(i4, this), c6956l2), c6956l2, 805306368, 510);
                    boolean zBooleanValue = ((Boolean) c10086l.getValue()).booleanValue();
                    boolean zAdmob2 = c6956l2.admob(this);
                    Object objM2132native2 = c6956l2.m2132native();
                    if (zAdmob2 || objM2132native2 == c13863l) {
                        objM2132native2 = new Function0(this) { // from class: lَؕٛ

                            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                            public final /* synthetic */ C16385l f20549l;

                            {
                                this.f20549l = this;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i5;
                                C16385l c16385l = this.f20549l;
                                switch (i8) {
                                    case 0:
                                        c16385l.f32038l.setValue(Boolean.TRUE);
                                        break;
                                    default:
                                        c16385l.f32038l.setValue(Boolean.FALSE);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        c6956l2.m2147try(objM2132native2);
                    }
                    C15578l c15578lAmazon = AbstractC14566l.amazon(-1965224153, new C0541l(this, function0, 8), c6956l2);
                    c6956l2 = c6956l;
                    AbstractC16727l.yandex(zBooleanValue, (Function0) objM2132native2, null, 0L, null, null, null, 0L, 0.0f, c15578lAmazon, c6956l2, 0, 2044);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                C4224l c4224lAds = c6956l2.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C14601l(this, function0, i, 28);
                }
                break;
            default:
                c6956l2.m2133new(-252148934);
                int i8 = i | (c6956l2.admob(function0) ? 4 : 2) | (c6956l2.admob(this) ? 32 : 16);
                if (c6956l2.m2127for(i8 & 1, (i8 & 19) != 18)) {
                    InterfaceC10835l interfaceC10835lAmazon2 = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j2 = c6956l2.f14595continue;
                    int i9 = (int) (j2 ^ (j2 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l2.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l2, c4346l);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l2.m2140super();
                    if (c6956l2.f14603switch) {
                        c6956l2.firebase(c16395l2);
                    } else {
                        c6956l2.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l2, interfaceC10835lAmazon2, C3438l.mopub);
                    AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato2, C3438l.billing);
                    AbstractC8182l.billing(c6956l2, Integer.valueOf(i9), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l2, C3438l.firebase);
                    AbstractC8182l.billing(c6956l2, interfaceC17242lBilling2, C3438l.amazon);
                    boolean zAdmob3 = c6956l2.admob(this);
                    Object objM2132native3 = c6956l2.m2132native();
                    if (zAdmob3 || objM2132native3 == c13863l) {
                        objM2132native3 = new C16669l(this, i5);
                        c6956l2.m2147try(objM2132native3);
                    }
                    AbstractC17457l.mopub((Function0) objM2132native3, null, false, null, null, null, AbstractC14566l.amazon(1171471063, new C16561l(i5, this), c6956l2), c6956l2, 805306368, 510);
                    boolean zBooleanValue2 = ((Boolean) c10086l.getValue()).booleanValue();
                    boolean zAdmob4 = c6956l2.admob(this);
                    Object objM2132native4 = c6956l2.m2132native();
                    if (zAdmob4 || objM2132native4 == c13863l) {
                        objM2132native4 = new C16669l(this, i3);
                        c6956l2.m2147try(objM2132native4);
                    }
                    C15578l c15578lAmazon2 = AbstractC14566l.amazon(-1767099537, new C0541l(this, function0, 10), c6956l2);
                    c6956l2 = c6956l;
                    AbstractC16727l.yandex(zBooleanValue2, (Function0) objM2132native4, null, 0L, null, null, null, 0L, 0.0f, c15578lAmazon2, c6956l2, 0, 2044);
                    c6956l2.startapp(true);
                } else {
                    c6956l2.m2124else();
                }
                C4224l c4224lAds2 = c6956l2.ads();
                if (c4224lAds2 != null) {
                    c4224lAds2.amazon = new C3158l(this, function0, i, 5);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public boolean m4177return() {
        return ((Boolean) this.f32036l.getValue()).booleanValue();
    }

    @Override // defpackage.AbstractC11383l
    /* JADX INFO: renamed from: this */
    public final /* bridge */ /* synthetic */ void mo2669this(InterfaceC12360l interfaceC12360l, C6956l c6956l) {
        switch (this.f32035l) {
            case 0:
                m4176protected((C14286l) interfaceC12360l, c6956l, 0);
                break;
            default:
                m4175implements((C16820l) interfaceC12360l, c6956l, 0);
                break;
        }
    }

    @Override // defpackage.AbstractC11383l
    /* JADX INFO: renamed from: transient */
    public final Object mo2670transient(String str) {
        C11318l c11318l;
        C11318l c11318l2;
        int i = this.f32035l;
        C10086l c10086l = this.f32037l;
        switch (i) {
            case 0:
                if (C14965l.f29439l == null) {
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    C14965l.f29439l = new C14965l(vKXApplication.getApplicationContext().getContentResolver());
                }
                C14965l c14965l = C14965l.f29439l;
                if (c14965l == null) {
                    c14965l = null;
                }
                C8392l c8392l = new C8392l(0);
                int iOrdinal = ((EnumC6863l) c10086l.getValue()).ordinal();
                if (iOrdinal == 0) {
                    c11318l = new C11318l(m4174const(), 2);
                } else if (iOrdinal == 1) {
                    c11318l = new C11318l("artist", m4174const());
                } else if (iOrdinal == 2) {
                    c11318l = new C11318l("numsongs", !m4174const());
                } else {
                    if (iOrdinal != 3) {
                        C18725l.billing();
                        return null;
                    }
                    c11318l = new C11318l("album", m4174const());
                }
                return AbstractC10000l.ad(c14965l, new C0554l(c8392l, c11318l, new AbstractC1401l[]{new C2645l("album != ''"), str.length() == 0 ? new C2616l() : new C2645l(AbstractC15560l.Signature("album LIKE '%", str, "%'"))}));
            default:
                if (C14965l.f29439l == null) {
                    VKXApplication vKXApplication2 = VKXApplication.f36631l;
                    if (vKXApplication2 == null) {
                        vKXApplication2 = null;
                    }
                    C14965l.f29439l = new C14965l(vKXApplication2.getApplicationContext().getContentResolver());
                }
                C14965l c14965l2 = C14965l.f29439l;
                if (c14965l2 == null) {
                    c14965l2 = null;
                }
                C8392l c8392l2 = new C8392l(2);
                int iOrdinal2 = ((EnumC9700l) c10086l.getValue()).ordinal();
                if (iOrdinal2 == 0) {
                    c11318l2 = new C11318l(m4177return(), 9);
                } else if (iOrdinal2 == 1) {
                    c11318l2 = new C11318l("artist", m4177return());
                } else if (iOrdinal2 == 2) {
                    c11318l2 = new C11318l("album", m4177return());
                } else if (iOrdinal2 == 3) {
                    c11318l2 = new C11318l("date_added", m4177return());
                } else {
                    if (iOrdinal2 != 4) {
                        C18725l.billing();
                        return null;
                    }
                    c11318l2 = new C11318l("year", m4177return());
                }
                return AbstractC10000l.ad(c14965l2, new C0554l(c8392l2, c11318l2, new AbstractC1401l[]{new C2645l(), new C2645l("title != ''"), new C2645l("duration > 15000"), str.length() == 0 ? new C2616l() : new C2645l(AbstractC15560l.Signature("title LIKE '%", str, "%'"))}));
        }
    }

    @Override // defpackage.AbstractC11383l
    /* JADX INFO: renamed from: try */
    public void mo3076try(C6956l c6956l, int i) {
        switch (this.f32035l) {
            case 1:
                c6956l.m2133new(714230096);
                int i2 = (c6956l.admob(this) ? 4 : 2) | i;
                int i3 = 0;
                if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
                    boolean zAdmob = c6956l.admob(this);
                    Object objM2132native = c6956l.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C16669l(this, i3);
                        c6956l.m2147try(objM2132native);
                    }
                    AbstractC13319l.yandex(AbstractC8069l.loadAd, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, AbstractC8069l.crashlytics, null, null, c6956l, 24582, 492);
                } else {
                    c6956l.m2124else();
                }
                C4224l c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C0259l(this, i);
                }
                break;
            default:
                super.mo3076try(c6956l, i);
                break;
        }
    }
}
