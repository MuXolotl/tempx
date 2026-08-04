package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lًٍؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9391l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C9365l f19234l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f19235l;

    public /* synthetic */ C9391l(C9365l c9365l, int i) {
        this.f19235l = i;
        this.f19234l = c9365l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strYandex;
        int i = this.f19235l;
        final C9365l c9365l = this.f19234l;
        boolean z = false;
        z = false;
        final int i2 = 1;
        switch (i) {
            case 0:
                if (!((Boolean) obj).booleanValue() || (strYandex = C13140l.yandex(c9365l.f34617l)) == null) {
                    z = true;
                } else if (AbstractC16648l.isVip(strYandex, "Permission", false)) {
                    c9365l.f19196l.setValue(Boolean.TRUE);
                } else {
                    AbstractC11708l.yandex(new C15245l(0, c9365l.isVip(), "Устройство не поддерживает данную функцию."));
                }
                return Boolean.valueOf(z);
            default:
                C1336l c1336l = (C1336l) obj;
                final int i3 = z ? 1 : 0;
                final int i4 = 3;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-2072280959, true, new Function3() { // from class: lٕٟۢ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i5 = i3;
                        C9365l c9365l2 = c9365l;
                        C4346l c4346l = C4346l.f8873l;
                        C13863l c13863l = C1867l.yandex;
                        boolean z2 = false;
                        switch (i5) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l3 = c9365l;
                                    boolean zAdmob = c6956l.admob(c9365l3);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C4936l c4936l = new C4936l(0, c9365l3, C9365l.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 12);
                                        c6956l.m2147try(c4936l);
                                        objM2132native = c4936l;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob2 = c6956l2.admob(c9365l2);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        objM2132native2 = new C12389l(c9365l2, 3);
                                        c6956l2.m2147try(objM2132native2);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob3 = c6956l3.admob(c9365l2);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        objM2132native3 = new C12389l(c9365l2, 2);
                                        c6956l3.m2147try(objM2132native3);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native3, 15), null, AbstractC15011l.mopub, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            case 3:
                                C6956l c6956l4 = (C6956l) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l4 = c9365l;
                                    boolean zAdmob4 = c6956l4.admob(c9365l4);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C4936l c4936l2 = new C4936l(0, c9365l4, C9365l.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 13);
                                        c6956l4.m2147try(c4936l2);
                                        objM2132native4 = c4936l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.subs, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC15011l.isPro, null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                            case 4:
                                C6956l c6956l5 = (C6956l) obj3;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.subs;
                                    C9365l c9365l5 = c9365l;
                                    boolean zAdmob5 = c6956l5.admob(c9365l5);
                                    Object objM2132native5 = c6956l5.m2132native();
                                    if (zAdmob5 || objM2132native5 == c13863l) {
                                        C15406l c15406l = new C15406l(1, c9365l5, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 22);
                                        c6956l5.m2147try(c15406l);
                                        objM2132native5 = c15406l;
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native5), c6956l5, 0, 6);
                                } else {
                                    c6956l5.m2124else();
                                }
                                break;
                            case 5:
                                C6956l c6956l6 = (C6956l) obj3;
                                int iIntValue6 = ((Integer) obj4).intValue();
                                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    C4348l c4348l2 = AbstractC8619l.startapp;
                                    C9365l c9365l6 = c9365l;
                                    boolean zAdmob6 = c6956l6.admob(c9365l6);
                                    Object objM2132native6 = c6956l6.m2132native();
                                    if (zAdmob6 || objM2132native6 == c13863l) {
                                        C15406l c15406l2 = new C15406l(1, c9365l6, C9365l.class, "requestRestart", "requestRestart(Z)V", 0, 0, 23);
                                        c6956l6.m2147try(c15406l2);
                                        objM2132native6 = c15406l2;
                                    }
                                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native6), c6956l6, 0, 6);
                                } else {
                                    c6956l6.m2124else();
                                }
                                break;
                            case 6:
                                C6956l c6956l7 = (C6956l) obj3;
                                int iIntValue7 = ((Integer) obj4).intValue();
                                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    C4348l c4348l3 = AbstractC8619l.isPro;
                                    C9365l c9365l7 = c9365l;
                                    boolean zAdmob7 = c6956l7.admob(c9365l7);
                                    Object objM2132native7 = c6956l7.m2132native();
                                    if (zAdmob7 || objM2132native7 == c13863l) {
                                        C15406l c15406l3 = new C15406l(1, c9365l7, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c6956l7.m2147try(c15406l3);
                                        objM2132native7 = c15406l3;
                                    }
                                    AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native7), c6956l7, 0, 6);
                                } else {
                                    c6956l7.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l8 = (C6956l) obj3;
                                int iIntValue8 = ((Integer) obj4).intValue();
                                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    C4348l c4348l4 = AbstractC8619l.purchase;
                                    boolean zAmazon = AbstractC11173l.amazon(3);
                                    C9365l c9365l8 = c9365l;
                                    boolean zAdmob8 = c6956l8.admob(c9365l8);
                                    Object objM2132native8 = c6956l8.m2132native();
                                    if (zAdmob8 || objM2132native8 == c13863l) {
                                        C15406l c15406l4 = new C15406l(1, c9365l8, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 25);
                                        c6956l8.m2147try(c15406l4);
                                        objM2132native8 = c15406l4;
                                    }
                                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native8;
                                    boolean zAdmob9 = c6956l8.admob(c9365l8);
                                    Object objM2132native9 = c6956l8.m2132native();
                                    Object obj5 = objM2132native9;
                                    if (zAdmob9 || objM2132native9 == c13863l) {
                                        C9391l c9391l = new C9391l(c9365l8, z2 ? 1 : 0);
                                        c6956l8.m2147try(c9391l);
                                        obj5 = c9391l;
                                    }
                                    AbstractC2991l.purchase(c4348l4, zAmazon, (Function1) obj5, (Function1) interfaceC5059l, c6956l8, 0, 0);
                                } else {
                                    c6956l8.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1358432618, true, new Function3() { // from class: lٕٟۢ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i5 = i2;
                        C9365l c9365l2 = c9365l;
                        C4346l c4346l = C4346l.f8873l;
                        C13863l c13863l = C1867l.yandex;
                        boolean z2 = false;
                        switch (i5) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l3 = c9365l;
                                    boolean zAdmob = c6956l.admob(c9365l3);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C4936l c4936l = new C4936l(0, c9365l3, C9365l.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 12);
                                        c6956l.m2147try(c4936l);
                                        objM2132native = c4936l;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob2 = c6956l2.admob(c9365l2);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        objM2132native2 = new C12389l(c9365l2, 3);
                                        c6956l2.m2147try(objM2132native2);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob3 = c6956l3.admob(c9365l2);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        objM2132native3 = new C12389l(c9365l2, 2);
                                        c6956l3.m2147try(objM2132native3);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native3, 15), null, AbstractC15011l.mopub, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            case 3:
                                C6956l c6956l4 = (C6956l) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l4 = c9365l;
                                    boolean zAdmob4 = c6956l4.admob(c9365l4);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C4936l c4936l2 = new C4936l(0, c9365l4, C9365l.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 13);
                                        c6956l4.m2147try(c4936l2);
                                        objM2132native4 = c4936l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.subs, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC15011l.isPro, null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                            case 4:
                                C6956l c6956l5 = (C6956l) obj3;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.subs;
                                    C9365l c9365l5 = c9365l;
                                    boolean zAdmob5 = c6956l5.admob(c9365l5);
                                    Object objM2132native5 = c6956l5.m2132native();
                                    if (zAdmob5 || objM2132native5 == c13863l) {
                                        C15406l c15406l = new C15406l(1, c9365l5, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 22);
                                        c6956l5.m2147try(c15406l);
                                        objM2132native5 = c15406l;
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native5), c6956l5, 0, 6);
                                } else {
                                    c6956l5.m2124else();
                                }
                                break;
                            case 5:
                                C6956l c6956l6 = (C6956l) obj3;
                                int iIntValue6 = ((Integer) obj4).intValue();
                                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    C4348l c4348l2 = AbstractC8619l.startapp;
                                    C9365l c9365l6 = c9365l;
                                    boolean zAdmob6 = c6956l6.admob(c9365l6);
                                    Object objM2132native6 = c6956l6.m2132native();
                                    if (zAdmob6 || objM2132native6 == c13863l) {
                                        C15406l c15406l2 = new C15406l(1, c9365l6, C9365l.class, "requestRestart", "requestRestart(Z)V", 0, 0, 23);
                                        c6956l6.m2147try(c15406l2);
                                        objM2132native6 = c15406l2;
                                    }
                                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native6), c6956l6, 0, 6);
                                } else {
                                    c6956l6.m2124else();
                                }
                                break;
                            case 6:
                                C6956l c6956l7 = (C6956l) obj3;
                                int iIntValue7 = ((Integer) obj4).intValue();
                                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    C4348l c4348l3 = AbstractC8619l.isPro;
                                    C9365l c9365l7 = c9365l;
                                    boolean zAdmob7 = c6956l7.admob(c9365l7);
                                    Object objM2132native7 = c6956l7.m2132native();
                                    if (zAdmob7 || objM2132native7 == c13863l) {
                                        C15406l c15406l3 = new C15406l(1, c9365l7, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c6956l7.m2147try(c15406l3);
                                        objM2132native7 = c15406l3;
                                    }
                                    AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native7), c6956l7, 0, 6);
                                } else {
                                    c6956l7.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l8 = (C6956l) obj3;
                                int iIntValue8 = ((Integer) obj4).intValue();
                                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    C4348l c4348l4 = AbstractC8619l.purchase;
                                    boolean zAmazon = AbstractC11173l.amazon(3);
                                    C9365l c9365l8 = c9365l;
                                    boolean zAdmob8 = c6956l8.admob(c9365l8);
                                    Object objM2132native8 = c6956l8.m2132native();
                                    if (zAdmob8 || objM2132native8 == c13863l) {
                                        C15406l c15406l4 = new C15406l(1, c9365l8, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 25);
                                        c6956l8.m2147try(c15406l4);
                                        objM2132native8 = c15406l4;
                                    }
                                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native8;
                                    boolean zAdmob9 = c6956l8.admob(c9365l8);
                                    Object objM2132native9 = c6956l8.m2132native();
                                    Object obj5 = objM2132native9;
                                    if (zAdmob9 || objM2132native9 == c13863l) {
                                        C9391l c9391l = new C9391l(c9365l8, z2 ? 1 : 0);
                                        c6956l8.m2147try(c9391l);
                                        obj5 = c9391l;
                                    }
                                    AbstractC2991l.purchase(c4348l4, zAmazon, (Function1) obj5, (Function1) interfaceC5059l, c6956l8, 0, 0);
                                } else {
                                    c6956l8.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final int i5 = 2;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1057008055, true, new Function3() { // from class: lٕٟۢ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i6 = i5;
                        C9365l c9365l2 = c9365l;
                        C4346l c4346l = C4346l.f8873l;
                        C13863l c13863l = C1867l.yandex;
                        boolean z2 = false;
                        switch (i6) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l3 = c9365l;
                                    boolean zAdmob = c6956l.admob(c9365l3);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C4936l c4936l = new C4936l(0, c9365l3, C9365l.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 12);
                                        c6956l.m2147try(c4936l);
                                        objM2132native = c4936l;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob2 = c6956l2.admob(c9365l2);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        objM2132native2 = new C12389l(c9365l2, 3);
                                        c6956l2.m2147try(objM2132native2);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob3 = c6956l3.admob(c9365l2);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        objM2132native3 = new C12389l(c9365l2, 2);
                                        c6956l3.m2147try(objM2132native3);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native3, 15), null, AbstractC15011l.mopub, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            case 3:
                                C6956l c6956l4 = (C6956l) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l4 = c9365l;
                                    boolean zAdmob4 = c6956l4.admob(c9365l4);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C4936l c4936l2 = new C4936l(0, c9365l4, C9365l.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 13);
                                        c6956l4.m2147try(c4936l2);
                                        objM2132native4 = c4936l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.subs, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC15011l.isPro, null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                            case 4:
                                C6956l c6956l5 = (C6956l) obj3;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.subs;
                                    C9365l c9365l5 = c9365l;
                                    boolean zAdmob5 = c6956l5.admob(c9365l5);
                                    Object objM2132native5 = c6956l5.m2132native();
                                    if (zAdmob5 || objM2132native5 == c13863l) {
                                        C15406l c15406l = new C15406l(1, c9365l5, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 22);
                                        c6956l5.m2147try(c15406l);
                                        objM2132native5 = c15406l;
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native5), c6956l5, 0, 6);
                                } else {
                                    c6956l5.m2124else();
                                }
                                break;
                            case 5:
                                C6956l c6956l6 = (C6956l) obj3;
                                int iIntValue6 = ((Integer) obj4).intValue();
                                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    C4348l c4348l2 = AbstractC8619l.startapp;
                                    C9365l c9365l6 = c9365l;
                                    boolean zAdmob6 = c6956l6.admob(c9365l6);
                                    Object objM2132native6 = c6956l6.m2132native();
                                    if (zAdmob6 || objM2132native6 == c13863l) {
                                        C15406l c15406l2 = new C15406l(1, c9365l6, C9365l.class, "requestRestart", "requestRestart(Z)V", 0, 0, 23);
                                        c6956l6.m2147try(c15406l2);
                                        objM2132native6 = c15406l2;
                                    }
                                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native6), c6956l6, 0, 6);
                                } else {
                                    c6956l6.m2124else();
                                }
                                break;
                            case 6:
                                C6956l c6956l7 = (C6956l) obj3;
                                int iIntValue7 = ((Integer) obj4).intValue();
                                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    C4348l c4348l3 = AbstractC8619l.isPro;
                                    C9365l c9365l7 = c9365l;
                                    boolean zAdmob7 = c6956l7.admob(c9365l7);
                                    Object objM2132native7 = c6956l7.m2132native();
                                    if (zAdmob7 || objM2132native7 == c13863l) {
                                        C15406l c15406l3 = new C15406l(1, c9365l7, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c6956l7.m2147try(c15406l3);
                                        objM2132native7 = c15406l3;
                                    }
                                    AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native7), c6956l7, 0, 6);
                                } else {
                                    c6956l7.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l8 = (C6956l) obj3;
                                int iIntValue8 = ((Integer) obj4).intValue();
                                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    C4348l c4348l4 = AbstractC8619l.purchase;
                                    boolean zAmazon = AbstractC11173l.amazon(3);
                                    C9365l c9365l8 = c9365l;
                                    boolean zAdmob8 = c6956l8.admob(c9365l8);
                                    Object objM2132native8 = c6956l8.m2132native();
                                    if (zAdmob8 || objM2132native8 == c13863l) {
                                        C15406l c15406l4 = new C15406l(1, c9365l8, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 25);
                                        c6956l8.m2147try(c15406l4);
                                        objM2132native8 = c15406l4;
                                    }
                                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native8;
                                    boolean zAdmob9 = c6956l8.admob(c9365l8);
                                    Object objM2132native9 = c6956l8.m2132native();
                                    Object obj5 = objM2132native9;
                                    if (zAdmob9 || objM2132native9 == c13863l) {
                                        C9391l c9391l = new C9391l(c9365l8, z2 ? 1 : 0);
                                        c6956l8.m2147try(c9391l);
                                        obj5 = c9391l;
                                    }
                                    AbstractC2991l.purchase(c4348l4, zAmazon, (Function1) obj5, (Function1) interfaceC5059l, c6956l8, 0, 0);
                                } else {
                                    c6956l8.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                C16287l.yandex.getClass();
                if (C16287l.yandex()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15011l.admob, 3);
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(131836015, true, new Function3() { // from class: lٕٟۢ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i6 = i4;
                            C9365l c9365l2 = c9365l;
                            C4346l c4346l = C4346l.f8873l;
                            C13863l c13863l = C1867l.yandex;
                            boolean z2 = false;
                            switch (i6) {
                                case 0:
                                    C6956l c6956l = (C6956l) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                        C9365l c9365l3 = c9365l;
                                        boolean zAdmob = c6956l.admob(c9365l3);
                                        Object objM2132native = c6956l.m2132native();
                                        if (zAdmob || objM2132native == c13863l) {
                                            C4936l c4936l = new C4936l(0, c9365l3, C9365l.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 12);
                                            c6956l.m2147try(c4936l);
                                            objM2132native = c4936l;
                                        }
                                        AbstractC13319l.yandex(AbstractC15011l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                case 1:
                                    C6956l c6956l2 = (C6956l) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                        boolean zAdmob2 = c6956l2.admob(c9365l2);
                                        Object objM2132native2 = c6956l2.m2132native();
                                        if (zAdmob2 || objM2132native2 == c13863l) {
                                            objM2132native2 = new C12389l(c9365l2, 3);
                                            c6956l2.m2147try(objM2132native2);
                                        }
                                        AbstractC13319l.yandex(AbstractC15011l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, null, null, null, null, c6956l2, 6, 508);
                                    } else {
                                        c6956l2.m2124else();
                                    }
                                    break;
                                case 2:
                                    C6956l c6956l3 = (C6956l) obj3;
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                        boolean zAdmob3 = c6956l3.admob(c9365l2);
                                        Object objM2132native3 = c6956l3.m2132native();
                                        if (zAdmob3 || objM2132native3 == c13863l) {
                                            objM2132native3 = new C12389l(c9365l2, 2);
                                            c6956l3.m2147try(objM2132native3);
                                        }
                                        AbstractC13319l.yandex(AbstractC15011l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native3, 15), null, AbstractC15011l.mopub, null, null, null, c6956l3, 3078, 500);
                                    } else {
                                        c6956l3.m2124else();
                                    }
                                    break;
                                case 3:
                                    C6956l c6956l4 = (C6956l) obj3;
                                    int iIntValue4 = ((Integer) obj4).intValue();
                                    if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                        C9365l c9365l4 = c9365l;
                                        boolean zAdmob4 = c6956l4.admob(c9365l4);
                                        Object objM2132native4 = c6956l4.m2132native();
                                        if (zAdmob4 || objM2132native4 == c13863l) {
                                            C4936l c4936l2 = new C4936l(0, c9365l4, C9365l.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 13);
                                            c6956l4.m2147try(c4936l2);
                                            objM2132native4 = c4936l2;
                                        }
                                        AbstractC13319l.yandex(AbstractC15011l.subs, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC15011l.isPro, null, null, null, c6956l4, 3078, 500);
                                    } else {
                                        c6956l4.m2124else();
                                    }
                                    break;
                                case 4:
                                    C6956l c6956l5 = (C6956l) obj3;
                                    int iIntValue5 = ((Integer) obj4).intValue();
                                    if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        C4348l c4348l = AbstractC8619l.subs;
                                        C9365l c9365l5 = c9365l;
                                        boolean zAdmob5 = c6956l5.admob(c9365l5);
                                        Object objM2132native5 = c6956l5.m2132native();
                                        if (zAdmob5 || objM2132native5 == c13863l) {
                                            C15406l c15406l = new C15406l(1, c9365l5, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 22);
                                            c6956l5.m2147try(c15406l);
                                            objM2132native5 = c15406l;
                                        }
                                        AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native5), c6956l5, 0, 6);
                                    } else {
                                        c6956l5.m2124else();
                                    }
                                    break;
                                case 5:
                                    C6956l c6956l6 = (C6956l) obj3;
                                    int iIntValue6 = ((Integer) obj4).intValue();
                                    if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                        C4348l c4348l2 = AbstractC8619l.startapp;
                                        C9365l c9365l6 = c9365l;
                                        boolean zAdmob6 = c6956l6.admob(c9365l6);
                                        Object objM2132native6 = c6956l6.m2132native();
                                        if (zAdmob6 || objM2132native6 == c13863l) {
                                            C15406l c15406l2 = new C15406l(1, c9365l6, C9365l.class, "requestRestart", "requestRestart(Z)V", 0, 0, 23);
                                            c6956l6.m2147try(c15406l2);
                                            objM2132native6 = c15406l2;
                                        }
                                        AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native6), c6956l6, 0, 6);
                                    } else {
                                        c6956l6.m2124else();
                                    }
                                    break;
                                case 6:
                                    C6956l c6956l7 = (C6956l) obj3;
                                    int iIntValue7 = ((Integer) obj4).intValue();
                                    if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                        C4348l c4348l3 = AbstractC8619l.isPro;
                                        C9365l c9365l7 = c9365l;
                                        boolean zAdmob7 = c6956l7.admob(c9365l7);
                                        Object objM2132native7 = c6956l7.m2132native();
                                        if (zAdmob7 || objM2132native7 == c13863l) {
                                            C15406l c15406l3 = new C15406l(1, c9365l7, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                            c6956l7.m2147try(c15406l3);
                                            objM2132native7 = c15406l3;
                                        }
                                        AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native7), c6956l7, 0, 6);
                                    } else {
                                        c6956l7.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l8 = (C6956l) obj3;
                                    int iIntValue8 = ((Integer) obj4).intValue();
                                    if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                        C4348l c4348l4 = AbstractC8619l.purchase;
                                        boolean zAmazon = AbstractC11173l.amazon(3);
                                        C9365l c9365l8 = c9365l;
                                        boolean zAdmob8 = c6956l8.admob(c9365l8);
                                        Object objM2132native8 = c6956l8.m2132native();
                                        if (zAdmob8 || objM2132native8 == c13863l) {
                                            C15406l c15406l4 = new C15406l(1, c9365l8, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 25);
                                            c6956l8.m2147try(c15406l4);
                                            objM2132native8 = c15406l4;
                                        }
                                        InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native8;
                                        boolean zAdmob9 = c6956l8.admob(c9365l8);
                                        Object objM2132native9 = c6956l8.m2132native();
                                        Object obj5 = objM2132native9;
                                        if (zAdmob9 || objM2132native9 == c13863l) {
                                            C9391l c9391l = new C9391l(c9365l8, z2 ? 1 : 0);
                                            c6956l8.m2147try(c9391l);
                                            obj5 = c9391l;
                                        }
                                        AbstractC2991l.purchase(c4348l4, zAmazon, (Function1) obj5, (Function1) interfaceC5059l, c6956l8, 0, 0);
                                    } else {
                                        c6956l8.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                }
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15011l.firebase, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15011l.smaato, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15011l.remoteconfig, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15011l.vip, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15011l.metrica, 3);
                final int i6 = 4;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1630217091, true, new Function3() { // from class: lٕٟۢ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i7 = i6;
                        C9365l c9365l2 = c9365l;
                        C4346l c4346l = C4346l.f8873l;
                        C13863l c13863l = C1867l.yandex;
                        boolean z2 = false;
                        switch (i7) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l3 = c9365l;
                                    boolean zAdmob = c6956l.admob(c9365l3);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C4936l c4936l = new C4936l(0, c9365l3, C9365l.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 12);
                                        c6956l.m2147try(c4936l);
                                        objM2132native = c4936l;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob2 = c6956l2.admob(c9365l2);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        objM2132native2 = new C12389l(c9365l2, 3);
                                        c6956l2.m2147try(objM2132native2);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob3 = c6956l3.admob(c9365l2);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        objM2132native3 = new C12389l(c9365l2, 2);
                                        c6956l3.m2147try(objM2132native3);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native3, 15), null, AbstractC15011l.mopub, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            case 3:
                                C6956l c6956l4 = (C6956l) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l4 = c9365l;
                                    boolean zAdmob4 = c6956l4.admob(c9365l4);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C4936l c4936l2 = new C4936l(0, c9365l4, C9365l.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 13);
                                        c6956l4.m2147try(c4936l2);
                                        objM2132native4 = c4936l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.subs, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC15011l.isPro, null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                            case 4:
                                C6956l c6956l5 = (C6956l) obj3;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.subs;
                                    C9365l c9365l5 = c9365l;
                                    boolean zAdmob5 = c6956l5.admob(c9365l5);
                                    Object objM2132native5 = c6956l5.m2132native();
                                    if (zAdmob5 || objM2132native5 == c13863l) {
                                        C15406l c15406l = new C15406l(1, c9365l5, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 22);
                                        c6956l5.m2147try(c15406l);
                                        objM2132native5 = c15406l;
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native5), c6956l5, 0, 6);
                                } else {
                                    c6956l5.m2124else();
                                }
                                break;
                            case 5:
                                C6956l c6956l6 = (C6956l) obj3;
                                int iIntValue6 = ((Integer) obj4).intValue();
                                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    C4348l c4348l2 = AbstractC8619l.startapp;
                                    C9365l c9365l6 = c9365l;
                                    boolean zAdmob6 = c6956l6.admob(c9365l6);
                                    Object objM2132native6 = c6956l6.m2132native();
                                    if (zAdmob6 || objM2132native6 == c13863l) {
                                        C15406l c15406l2 = new C15406l(1, c9365l6, C9365l.class, "requestRestart", "requestRestart(Z)V", 0, 0, 23);
                                        c6956l6.m2147try(c15406l2);
                                        objM2132native6 = c15406l2;
                                    }
                                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native6), c6956l6, 0, 6);
                                } else {
                                    c6956l6.m2124else();
                                }
                                break;
                            case 6:
                                C6956l c6956l7 = (C6956l) obj3;
                                int iIntValue7 = ((Integer) obj4).intValue();
                                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    C4348l c4348l3 = AbstractC8619l.isPro;
                                    C9365l c9365l7 = c9365l;
                                    boolean zAdmob7 = c6956l7.admob(c9365l7);
                                    Object objM2132native7 = c6956l7.m2132native();
                                    if (zAdmob7 || objM2132native7 == c13863l) {
                                        C15406l c15406l3 = new C15406l(1, c9365l7, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c6956l7.m2147try(c15406l3);
                                        objM2132native7 = c15406l3;
                                    }
                                    AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native7), c6956l7, 0, 6);
                                } else {
                                    c6956l7.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l8 = (C6956l) obj3;
                                int iIntValue8 = ((Integer) obj4).intValue();
                                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    C4348l c4348l4 = AbstractC8619l.purchase;
                                    boolean zAmazon = AbstractC11173l.amazon(3);
                                    C9365l c9365l8 = c9365l;
                                    boolean zAdmob8 = c6956l8.admob(c9365l8);
                                    Object objM2132native8 = c6956l8.m2132native();
                                    if (zAdmob8 || objM2132native8 == c13863l) {
                                        C15406l c15406l4 = new C15406l(1, c9365l8, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 25);
                                        c6956l8.m2147try(c15406l4);
                                        objM2132native8 = c15406l4;
                                    }
                                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native8;
                                    boolean zAdmob9 = c6956l8.admob(c9365l8);
                                    Object objM2132native9 = c6956l8.m2132native();
                                    Object obj5 = objM2132native9;
                                    if (zAdmob9 || objM2132native9 == c13863l) {
                                        C9391l c9391l = new C9391l(c9365l8, z2 ? 1 : 0);
                                        c6956l8.m2147try(c9391l);
                                        obj5 = c9391l;
                                    }
                                    AbstractC2991l.purchase(c4348l4, zAmazon, (Function1) obj5, (Function1) interfaceC5059l, c6956l8, 0, 0);
                                } else {
                                    c6956l8.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final int i7 = 5;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-785223582, true, new Function3() { // from class: lٕٟۢ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i8 = i7;
                        C9365l c9365l2 = c9365l;
                        C4346l c4346l = C4346l.f8873l;
                        C13863l c13863l = C1867l.yandex;
                        boolean z2 = false;
                        switch (i8) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l3 = c9365l;
                                    boolean zAdmob = c6956l.admob(c9365l3);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C4936l c4936l = new C4936l(0, c9365l3, C9365l.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 12);
                                        c6956l.m2147try(c4936l);
                                        objM2132native = c4936l;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob2 = c6956l2.admob(c9365l2);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        objM2132native2 = new C12389l(c9365l2, 3);
                                        c6956l2.m2147try(objM2132native2);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob3 = c6956l3.admob(c9365l2);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        objM2132native3 = new C12389l(c9365l2, 2);
                                        c6956l3.m2147try(objM2132native3);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native3, 15), null, AbstractC15011l.mopub, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            case 3:
                                C6956l c6956l4 = (C6956l) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l4 = c9365l;
                                    boolean zAdmob4 = c6956l4.admob(c9365l4);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C4936l c4936l2 = new C4936l(0, c9365l4, C9365l.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 13);
                                        c6956l4.m2147try(c4936l2);
                                        objM2132native4 = c4936l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.subs, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC15011l.isPro, null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                            case 4:
                                C6956l c6956l5 = (C6956l) obj3;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.subs;
                                    C9365l c9365l5 = c9365l;
                                    boolean zAdmob5 = c6956l5.admob(c9365l5);
                                    Object objM2132native5 = c6956l5.m2132native();
                                    if (zAdmob5 || objM2132native5 == c13863l) {
                                        C15406l c15406l = new C15406l(1, c9365l5, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 22);
                                        c6956l5.m2147try(c15406l);
                                        objM2132native5 = c15406l;
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native5), c6956l5, 0, 6);
                                } else {
                                    c6956l5.m2124else();
                                }
                                break;
                            case 5:
                                C6956l c6956l6 = (C6956l) obj3;
                                int iIntValue6 = ((Integer) obj4).intValue();
                                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    C4348l c4348l2 = AbstractC8619l.startapp;
                                    C9365l c9365l6 = c9365l;
                                    boolean zAdmob6 = c6956l6.admob(c9365l6);
                                    Object objM2132native6 = c6956l6.m2132native();
                                    if (zAdmob6 || objM2132native6 == c13863l) {
                                        C15406l c15406l2 = new C15406l(1, c9365l6, C9365l.class, "requestRestart", "requestRestart(Z)V", 0, 0, 23);
                                        c6956l6.m2147try(c15406l2);
                                        objM2132native6 = c15406l2;
                                    }
                                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native6), c6956l6, 0, 6);
                                } else {
                                    c6956l6.m2124else();
                                }
                                break;
                            case 6:
                                C6956l c6956l7 = (C6956l) obj3;
                                int iIntValue7 = ((Integer) obj4).intValue();
                                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    C4348l c4348l3 = AbstractC8619l.isPro;
                                    C9365l c9365l7 = c9365l;
                                    boolean zAdmob7 = c6956l7.admob(c9365l7);
                                    Object objM2132native7 = c6956l7.m2132native();
                                    if (zAdmob7 || objM2132native7 == c13863l) {
                                        C15406l c15406l3 = new C15406l(1, c9365l7, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c6956l7.m2147try(c15406l3);
                                        objM2132native7 = c15406l3;
                                    }
                                    AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native7), c6956l7, 0, 6);
                                } else {
                                    c6956l7.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l8 = (C6956l) obj3;
                                int iIntValue8 = ((Integer) obj4).intValue();
                                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    C4348l c4348l4 = AbstractC8619l.purchase;
                                    boolean zAmazon = AbstractC11173l.amazon(3);
                                    C9365l c9365l8 = c9365l;
                                    boolean zAdmob8 = c6956l8.admob(c9365l8);
                                    Object objM2132native8 = c6956l8.m2132native();
                                    if (zAdmob8 || objM2132native8 == c13863l) {
                                        C15406l c15406l4 = new C15406l(1, c9365l8, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 25);
                                        c6956l8.m2147try(c15406l4);
                                        objM2132native8 = c15406l4;
                                    }
                                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native8;
                                    boolean zAdmob9 = c6956l8.admob(c9365l8);
                                    Object objM2132native9 = c6956l8.m2132native();
                                    Object obj5 = objM2132native9;
                                    if (zAdmob9 || objM2132native9 == c13863l) {
                                        C9391l c9391l = new C9391l(c9365l8, z2 ? 1 : 0);
                                        c6956l8.m2147try(c9391l);
                                        obj5 = c9391l;
                                    }
                                    AbstractC2991l.purchase(c4348l4, zAmazon, (Function1) obj5, (Function1) interfaceC5059l, c6956l8, 0, 0);
                                } else {
                                    c6956l8.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final int i8 = 6;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-584251928, true, new Function3() { // from class: lٕٟۢ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i9 = i8;
                        C9365l c9365l2 = c9365l;
                        C4346l c4346l = C4346l.f8873l;
                        C13863l c13863l = C1867l.yandex;
                        boolean z2 = false;
                        switch (i9) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l3 = c9365l;
                                    boolean zAdmob = c6956l.admob(c9365l3);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C4936l c4936l = new C4936l(0, c9365l3, C9365l.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 12);
                                        c6956l.m2147try(c4936l);
                                        objM2132native = c4936l;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob2 = c6956l2.admob(c9365l2);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        objM2132native2 = new C12389l(c9365l2, 3);
                                        c6956l2.m2147try(objM2132native2);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob3 = c6956l3.admob(c9365l2);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        objM2132native3 = new C12389l(c9365l2, 2);
                                        c6956l3.m2147try(objM2132native3);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native3, 15), null, AbstractC15011l.mopub, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            case 3:
                                C6956l c6956l4 = (C6956l) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l4 = c9365l;
                                    boolean zAdmob4 = c6956l4.admob(c9365l4);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C4936l c4936l2 = new C4936l(0, c9365l4, C9365l.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 13);
                                        c6956l4.m2147try(c4936l2);
                                        objM2132native4 = c4936l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.subs, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC15011l.isPro, null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                            case 4:
                                C6956l c6956l5 = (C6956l) obj3;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.subs;
                                    C9365l c9365l5 = c9365l;
                                    boolean zAdmob5 = c6956l5.admob(c9365l5);
                                    Object objM2132native5 = c6956l5.m2132native();
                                    if (zAdmob5 || objM2132native5 == c13863l) {
                                        C15406l c15406l = new C15406l(1, c9365l5, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 22);
                                        c6956l5.m2147try(c15406l);
                                        objM2132native5 = c15406l;
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native5), c6956l5, 0, 6);
                                } else {
                                    c6956l5.m2124else();
                                }
                                break;
                            case 5:
                                C6956l c6956l6 = (C6956l) obj3;
                                int iIntValue6 = ((Integer) obj4).intValue();
                                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    C4348l c4348l2 = AbstractC8619l.startapp;
                                    C9365l c9365l6 = c9365l;
                                    boolean zAdmob6 = c6956l6.admob(c9365l6);
                                    Object objM2132native6 = c6956l6.m2132native();
                                    if (zAdmob6 || objM2132native6 == c13863l) {
                                        C15406l c15406l2 = new C15406l(1, c9365l6, C9365l.class, "requestRestart", "requestRestart(Z)V", 0, 0, 23);
                                        c6956l6.m2147try(c15406l2);
                                        objM2132native6 = c15406l2;
                                    }
                                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native6), c6956l6, 0, 6);
                                } else {
                                    c6956l6.m2124else();
                                }
                                break;
                            case 6:
                                C6956l c6956l7 = (C6956l) obj3;
                                int iIntValue7 = ((Integer) obj4).intValue();
                                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    C4348l c4348l3 = AbstractC8619l.isPro;
                                    C9365l c9365l7 = c9365l;
                                    boolean zAdmob7 = c6956l7.admob(c9365l7);
                                    Object objM2132native7 = c6956l7.m2132native();
                                    if (zAdmob7 || objM2132native7 == c13863l) {
                                        C15406l c15406l3 = new C15406l(1, c9365l7, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c6956l7.m2147try(c15406l3);
                                        objM2132native7 = c15406l3;
                                    }
                                    AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native7), c6956l7, 0, 6);
                                } else {
                                    c6956l7.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l8 = (C6956l) obj3;
                                int iIntValue8 = ((Integer) obj4).intValue();
                                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    C4348l c4348l4 = AbstractC8619l.purchase;
                                    boolean zAmazon = AbstractC11173l.amazon(3);
                                    C9365l c9365l8 = c9365l;
                                    boolean zAdmob8 = c6956l8.admob(c9365l8);
                                    Object objM2132native8 = c6956l8.m2132native();
                                    if (zAdmob8 || objM2132native8 == c13863l) {
                                        C15406l c15406l4 = new C15406l(1, c9365l8, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 25);
                                        c6956l8.m2147try(c15406l4);
                                        objM2132native8 = c15406l4;
                                    }
                                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native8;
                                    boolean zAdmob9 = c6956l8.admob(c9365l8);
                                    Object objM2132native9 = c6956l8.m2132native();
                                    Object obj5 = objM2132native9;
                                    if (zAdmob9 || objM2132native9 == c13863l) {
                                        C9391l c9391l = new C9391l(c9365l8, z2 ? 1 : 0);
                                        c6956l8.m2147try(c9391l);
                                        obj5 = c9391l;
                                    }
                                    AbstractC2991l.purchase(c4348l4, zAmazon, (Function1) obj5, (Function1) interfaceC5059l, c6956l8, 0, 0);
                                } else {
                                    c6956l8.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15011l.startapp, 3);
                final int i9 = 7;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1120165978, true, new Function3() { // from class: lٕٟۢ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i10 = i9;
                        C9365l c9365l2 = c9365l;
                        C4346l c4346l = C4346l.f8873l;
                        C13863l c13863l = C1867l.yandex;
                        boolean z2 = false;
                        switch (i10) {
                            case 0:
                                C6956l c6956l = (C6956l) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l3 = c9365l;
                                    boolean zAdmob = c6956l.admob(c9365l3);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C4936l c4936l = new C4936l(0, c9365l3, C9365l.class, "callEqualizerScreen", "callEqualizerScreen()V", 0, 0, 12);
                                        c6956l.m2147try(c4936l);
                                        objM2132native = c4936l;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.crashlytics, AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) ((InterfaceC5059l) objM2132native), 15), null, null, null, null, null, c6956l, 6, 508);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon2 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob2 = c6956l2.admob(c9365l2);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        objM2132native2 = new C12389l(c9365l2, 3);
                                        c6956l2.m2147try(objM2132native2);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.amazon, AbstractC9151l.loadAd(interfaceC17242lAmazon2, false, null, (Function0) objM2132native2, 15), null, null, null, null, null, c6956l2, 6, 508);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            case 2:
                                C6956l c6956l3 = (C6956l) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon3 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    boolean zAdmob3 = c6956l3.admob(c9365l2);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        objM2132native3 = new C12389l(c9365l2, 2);
                                        c6956l3.m2147try(objM2132native3);
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.billing, AbstractC9151l.loadAd(interfaceC17242lAmazon3, false, null, (Function0) objM2132native3, 15), null, AbstractC15011l.mopub, null, null, null, c6956l3, 3078, 500);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                            case 3:
                                C6956l c6956l4 = (C6956l) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                if (c6956l4.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    InterfaceC17242l interfaceC17242lAmazon4 = AbstractC0080l.amazon(c4346l, 1.0f);
                                    C9365l c9365l4 = c9365l;
                                    boolean zAdmob4 = c6956l4.admob(c9365l4);
                                    Object objM2132native4 = c6956l4.m2132native();
                                    if (zAdmob4 || objM2132native4 == c13863l) {
                                        C4936l c4936l2 = new C4936l(0, c9365l4, C9365l.class, "requestTokenRefresh", "requestTokenRefresh()V", 0, 0, 13);
                                        c6956l4.m2147try(c4936l2);
                                        objM2132native4 = c4936l2;
                                    }
                                    AbstractC13319l.yandex(AbstractC15011l.subs, AbstractC9151l.loadAd(interfaceC17242lAmazon4, false, null, (Function0) ((InterfaceC5059l) objM2132native4), 15), null, AbstractC15011l.isPro, null, null, null, c6956l4, 3078, 500);
                                } else {
                                    c6956l4.m2124else();
                                }
                                break;
                            case 4:
                                C6956l c6956l5 = (C6956l) obj3;
                                int iIntValue5 = ((Integer) obj4).intValue();
                                if (c6956l5.m2127for(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.subs;
                                    C9365l c9365l5 = c9365l;
                                    boolean zAdmob5 = c6956l5.admob(c9365l5);
                                    Object objM2132native5 = c6956l5.m2132native();
                                    if (zAdmob5 || objM2132native5 == c13863l) {
                                        C15406l c15406l = new C15406l(1, c9365l5, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 22);
                                        c6956l5.m2147try(c15406l);
                                        objM2132native5 = c15406l;
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native5), c6956l5, 0, 6);
                                } else {
                                    c6956l5.m2124else();
                                }
                                break;
                            case 5:
                                C6956l c6956l6 = (C6956l) obj3;
                                int iIntValue6 = ((Integer) obj4).intValue();
                                if (c6956l6.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    C4348l c4348l2 = AbstractC8619l.startapp;
                                    C9365l c9365l6 = c9365l;
                                    boolean zAdmob6 = c6956l6.admob(c9365l6);
                                    Object objM2132native6 = c6956l6.m2132native();
                                    if (zAdmob6 || objM2132native6 == c13863l) {
                                        C15406l c15406l2 = new C15406l(1, c9365l6, C9365l.class, "requestRestart", "requestRestart(Z)V", 0, 0, 23);
                                        c6956l6.m2147try(c15406l2);
                                        objM2132native6 = c15406l2;
                                    }
                                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native6), c6956l6, 0, 6);
                                } else {
                                    c6956l6.m2124else();
                                }
                                break;
                            case 6:
                                C6956l c6956l7 = (C6956l) obj3;
                                int iIntValue7 = ((Integer) obj4).intValue();
                                if (c6956l7.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    C4348l c4348l3 = AbstractC8619l.isPro;
                                    C9365l c9365l7 = c9365l;
                                    boolean zAdmob7 = c6956l7.admob(c9365l7);
                                    Object objM2132native7 = c6956l7.m2132native();
                                    if (zAdmob7 || objM2132native7 == c13863l) {
                                        C15406l c15406l3 = new C15406l(1, c9365l7, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 24);
                                        c6956l7.m2147try(c15406l3);
                                        objM2132native7 = c15406l3;
                                    }
                                    AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native7), c6956l7, 0, 6);
                                } else {
                                    c6956l7.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l8 = (C6956l) obj3;
                                int iIntValue8 = ((Integer) obj4).intValue();
                                if (c6956l8.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    C4348l c4348l4 = AbstractC8619l.purchase;
                                    boolean zAmazon = AbstractC11173l.amazon(3);
                                    C9365l c9365l8 = c9365l;
                                    boolean zAdmob8 = c6956l8.admob(c9365l8);
                                    Object objM2132native8 = c6956l8.m2132native();
                                    if (zAdmob8 || objM2132native8 == c13863l) {
                                        C15406l c15406l4 = new C15406l(1, c9365l8, C9365l.class, "requestPlaybackPrefsReload", "requestPlaybackPrefsReload(Z)V", 0, 0, 25);
                                        c6956l8.m2147try(c15406l4);
                                        objM2132native8 = c15406l4;
                                    }
                                    InterfaceC5059l interfaceC5059l = (InterfaceC5059l) objM2132native8;
                                    boolean zAdmob9 = c6956l8.admob(c9365l8);
                                    Object objM2132native9 = c6956l8.m2132native();
                                    Object obj5 = objM2132native9;
                                    if (zAdmob9 || objM2132native9 == c13863l) {
                                        C9391l c9391l = new C9391l(c9365l8, z2 ? 1 : 0);
                                        c6956l8.m2147try(c9391l);
                                        obj5 = c9391l;
                                    }
                                    AbstractC2991l.purchase(c4348l4, zAmazon, (Function1) obj5, (Function1) interfaceC5059l, c6956l8, 0, 0);
                                } else {
                                    c6956l8.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15011l.adcel, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC15011l.ads, 3);
                return Unit.INSTANCE;
        }
    }
}
