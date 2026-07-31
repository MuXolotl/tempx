package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lًٕۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8250l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f17146l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17147l;

    public /* synthetic */ C8250l(int i, Object obj) {
        this.f17147l = i;
        this.f17146l = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, lٌْٙ] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f17147l;
        int i2 = 14;
        final int i3 = 2;
        final ?? r7 = 0;
        final int i4 = 1;
        Object obj2 = this.f17146l;
        switch (i) {
            case 0:
                final C6143l c6143l = (C6143l) obj2;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1344222098, true, new Function3() { // from class: lِٟؑ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i5 = i4;
                        C6143l c6143l2 = c6143l;
                        switch (i5) {
                            case 0:
                                C6956l c6956l = (C6956l) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    AbstractC13010l.loadAd(c6143l2.loadAd, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 48, 0, 262140);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l2 = (C6956l) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    AbstractC18263l.yandex(48, AbstractC14566l.amazon(-1635227221, new C4951l(6, c6143l2), c6956l2), c6956l2, null);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                String str = c6143l.loadAd;
                if (str != null && str.length() > 0) {
                    AbstractC1757l.appmetrica(c1336l, null, null, AbstractC5646l.loadAd, 3);
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1072876964, true, new Function3() { // from class: lِٟؑ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i5 = r7;
                            C6143l c6143l2 = c6143l;
                            switch (i5) {
                                case 0:
                                    C6956l c6956l = (C6956l) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        AbstractC13010l.loadAd(c6143l2.loadAd, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 48, 0, 262140);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l2 = (C6956l) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        AbstractC18263l.yandex(48, AbstractC14566l.amazon(-1635227221, new C4951l(6, c6143l2), c6956l2), c6956l2, null);
                                    } else {
                                        c6956l2.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                }
                return Unit.INSTANCE;
            case 1:
                C8125l c8125l = (C8125l) obj2;
                ?? r10 = (List) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (r10.size() % 2 != 0) {
                    C8339l.smaato("non-zero remainder");
                    return null;
                }
                while (r7 < r10.size()) {
                    linkedHashMap.put((String) r10.get(r7), r10.get(r7 + 1));
                    r7 += 2;
                }
                return c8125l.invoke(linkedHashMap);
            case 2:
                C8157l c8157l = (C8157l) obj2;
                c8157l.subs(c8157l.vip.mo1368apply(obj));
                return Unit.INSTANCE;
            case 3:
                return ((C7067l) obj2).ad(((Integer) obj).intValue());
            case 4:
                DialogC0608l dialogC0608l = (DialogC0608l) obj2;
                dialogC0608l.show();
                return new C9582l(i2, dialogC0608l);
            case 5:
                C16042l c16042l = (C16042l) obj2;
                C10086l c10086l = c16042l.f31434l;
                C1336l c1336l2 = (C1336l) obj;
                if (((Boolean) c16042l.f31435l.getValue()).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l2, null, null, AbstractC16829l.loadAd, 3);
                }
                if (!((InterfaceC13238l) c10086l.getValue()).isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(1082843197, true, new C12640l(c16042l, i4)), 3);
                    ?? r0 = (InterfaceC13238l) c10086l.getValue();
                    c1336l2.firebase(((AbstractC7095l) r0).pro(), null, new C5640l(r0, 9, r7), new C15578l(802480018, true, new C6780l(r0, c16042l, i2)));
                }
                return Unit.INSTANCE;
            case 6:
                return new C7761l(AbstractC3234l.purchase((C18662l) obj2), (File) obj);
            case 7:
                C11864l c11864l = (C11864l) obj2;
                if (((Throwable) obj) == null) {
                    ((C14740l) c11864l.yandex.m3884native()).purchase();
                }
                return Unit.INSTANCE;
            case 8:
                ((C4910l) obj2).billing(null);
                return Unit.INSTANCE;
            case 9:
                final C1463l c1463l = (C1463l) obj2;
                C1336l c1336l3 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l3, null, null, AbstractC12396l.crashlytics, 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(1932520938, true, new Function3() { // from class: lًَؚ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i5 = r7;
                        C13863l c13863l = C1867l.yandex;
                        switch (i5) {
                            case 0:
                                C6956l c6956l = (C6956l) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.mopub;
                                    C1463l c1463l2 = c1463l;
                                    boolean zAdmob = c6956l.admob(c1463l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C15406l c15406l = new C15406l(1, c1463l2, C1463l.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 6);
                                        c6956l.m2147try(c15406l);
                                        objM2132native = c15406l;
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native), c6956l, 0, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    C4348l c4348l2 = AbstractC8619l.admob;
                                    C1463l c1463l3 = c1463l;
                                    boolean zAdmob2 = c6956l2.admob(c1463l3);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        C15406l c15406l2 = new C15406l(1, c1463l3, C1463l.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 7);
                                        c6956l2.m2147try(c15406l2);
                                        objM2132native2 = c15406l2;
                                    }
                                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native2), c6956l2, 0, 6);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l3 = (C6956l) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    C4348l c4348l3 = AbstractC8619l.billing;
                                    C1463l c1463l4 = c1463l;
                                    boolean zAdmob3 = c6956l3.admob(c1463l4);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        C15406l c15406l3 = new C15406l(1, c1463l4, C1463l.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 8);
                                        c6956l3.m2147try(c15406l3);
                                        objM2132native3 = c15406l3;
                                    }
                                    AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native3), c6956l3, 0, 6);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(1690823625, true, new Function3() { // from class: lًَؚ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i5 = i4;
                        C13863l c13863l = C1867l.yandex;
                        switch (i5) {
                            case 0:
                                C6956l c6956l = (C6956l) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.mopub;
                                    C1463l c1463l2 = c1463l;
                                    boolean zAdmob = c6956l.admob(c1463l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C15406l c15406l = new C15406l(1, c1463l2, C1463l.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 6);
                                        c6956l.m2147try(c15406l);
                                        objM2132native = c15406l;
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native), c6956l, 0, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    C4348l c4348l2 = AbstractC8619l.admob;
                                    C1463l c1463l3 = c1463l;
                                    boolean zAdmob2 = c6956l2.admob(c1463l3);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        C15406l c15406l2 = new C15406l(1, c1463l3, C1463l.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 7);
                                        c6956l2.m2147try(c15406l2);
                                        objM2132native2 = c15406l2;
                                    }
                                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native2), c6956l2, 0, 6);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l3 = (C6956l) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    C4348l c4348l3 = AbstractC8619l.billing;
                                    C1463l c1463l4 = c1463l;
                                    boolean zAdmob3 = c6956l3.admob(c1463l4);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        C15406l c15406l3 = new C15406l(1, c1463l4, C1463l.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 8);
                                        c6956l3.m2147try(c15406l3);
                                        objM2132native3 = c15406l3;
                                    }
                                    AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native3), c6956l3, 0, 6);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(1449126312, true, new Function3() { // from class: lًَؚ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i5 = i3;
                        C13863l c13863l = C1867l.yandex;
                        switch (i5) {
                            case 0:
                                C6956l c6956l = (C6956l) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    C4348l c4348l = AbstractC8619l.mopub;
                                    C1463l c1463l2 = c1463l;
                                    boolean zAdmob = c6956l.admob(c1463l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == c13863l) {
                                        C15406l c15406l = new C15406l(1, c1463l2, C1463l.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 6);
                                        c6956l.m2147try(c15406l);
                                        objM2132native = c15406l;
                                    }
                                    AbstractC2991l.purchase(c4348l, false, null, (Function1) ((InterfaceC5059l) objM2132native), c6956l, 0, 6);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                C6956l c6956l2 = (C6956l) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    C4348l c4348l2 = AbstractC8619l.admob;
                                    C1463l c1463l3 = c1463l;
                                    boolean zAdmob2 = c6956l2.admob(c1463l3);
                                    Object objM2132native2 = c6956l2.m2132native();
                                    if (zAdmob2 || objM2132native2 == c13863l) {
                                        C15406l c15406l2 = new C15406l(1, c1463l3, C1463l.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 7);
                                        c6956l2.m2147try(c15406l2);
                                        objM2132native2 = c15406l2;
                                    }
                                    AbstractC2991l.purchase(c4348l2, false, null, (Function1) ((InterfaceC5059l) objM2132native2), c6956l2, 0, 6);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l3 = (C6956l) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                if (c6956l3.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    C4348l c4348l3 = AbstractC8619l.billing;
                                    C1463l c1463l4 = c1463l;
                                    boolean zAdmob3 = c6956l3.admob(c1463l4);
                                    Object objM2132native3 = c6956l3.m2132native();
                                    if (zAdmob3 || objM2132native3 == c13863l) {
                                        C15406l c15406l3 = new C15406l(1, c1463l4, C1463l.class, "requestReloadNotification", "requestReloadNotification(Z)V", 0, 0, 8);
                                        c6956l3.m2147try(c15406l3);
                                        objM2132native3 = c15406l3;
                                    }
                                    AbstractC2991l.purchase(c4348l3, false, null, (Function1) ((InterfaceC5059l) objM2132native3), c6956l3, 0, 6);
                                } else {
                                    c6956l3.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                return Unit.INSTANCE;
            case 10:
                final InterfaceC0582l interfaceC0582l = (InterfaceC0582l) obj2;
                C1336l c1336l4 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l4, null, null, AbstractC11156l.yandex, 3);
                AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(398056348, true, new Function3() { // from class: lًُۢ
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        int i5 = r7;
                        InterfaceC0582l interfaceC0582l2 = interfaceC0582l;
                        switch (i5) {
                            case 0:
                                C6956l c6956l = (C6956l) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    AbstractC18263l.yandex(48, AbstractC14566l.amazon(-776531073, new C4951l(19, interfaceC0582l2), c6956l), c6956l, null);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                C6956l c6956l2 = (C6956l) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    AbstractC13010l.loadAd(((C6143l) interfaceC0582l2).loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.firebase, c6956l2, 0, 0, 131070);
                                } else {
                                    c6956l2.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                if (((C6143l) interfaceC0582l).loadAd != null) {
                    AbstractC1757l.appmetrica(c1336l4, null, null, AbstractC11156l.loadAd, 3);
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(1401992311, true, new Function3() { // from class: lًُۢ
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i5 = i4;
                            InterfaceC0582l interfaceC0582l2 = interfaceC0582l;
                            switch (i5) {
                                case 0:
                                    C6956l c6956l = (C6956l) obj4;
                                    int iIntValue = ((Integer) obj5).intValue();
                                    if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        AbstractC18263l.yandex(48, AbstractC14566l.amazon(-776531073, new C4951l(19, interfaceC0582l2), c6956l), c6956l, null);
                                    } else {
                                        c6956l.m2124else();
                                    }
                                    break;
                                default:
                                    C6956l c6956l2 = (C6956l) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (c6956l2.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        AbstractC13010l.loadAd(((C6143l) interfaceC0582l2).loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).loadAd.firebase, c6956l2, 0, 0, 131070);
                                    } else {
                                        c6956l2.m2124else();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }), 3);
                }
                AbstractC1757l.appmetrica(c1336l4, null, null, AbstractC11156l.crashlytics, 3);
                return Unit.INSTANCE;
            case 11:
                ((AbstractC6897l) obj2).close();
                return Unit.INSTANCE;
            case 12:
                ((C4983l) obj2).purchase(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 13:
                for (C1167l c1167l : ((C6513l) obj2).crashlytics) {
                    c1167l.yandex.yandex(obj, c1167l.loadAd);
                }
                return Unit.INSTANCE;
            case 14:
                C18306l c18306l = (C18306l) obj2;
                String str2 = ((MainArtist) obj).yandex;
                if (str2 == null) {
                    return Unit.INSTANCE;
                }
                c18306l.m4125private(new C13379l(str2));
                return Unit.INSTANCE;
            case 15:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                C16287l.yandex.getClass();
                C16287l.crashlytics.advert(C16287l.loadAd[0], bool);
                ((C9270l) obj2).f19058l.setValue(bool);
                return Unit.INSTANCE;
            case 16:
                float fFloatValue = ((Float) obj).floatValue();
                AbstractC13264l abstractC13264l = ((C8221l) obj2).loadAd;
                abstractC13264l.adcel.subs(abstractC13264l.isPro(((C15308l) abstractC13264l.amazon.f32506l).admob() + AbstractC5573l.ads(abstractC13264l.vip() != 0 ? fFloatValue / abstractC13264l.vip() : 0.0f)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C8583l c8583l = (C8583l) obj2;
                c8583l.f17698l.invoke((List) obj);
                c8583l.purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C9111l) obj2).yandex.setValue(Boolean.valueOf(((Float) obj).floatValue() == 1.0f));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                PlaybackService playbackService = (PlaybackService) obj2;
                C17804l c17804l = (C17804l) obj;
                int i5 = PlaybackService.f36828l;
                c17804l.m4415l();
                if (!c17804l.f34688l) {
                    c17804l.mo2796l(playbackService.f36833l);
                    c17804l.release();
                }
                return Unit.INSTANCE;
            case 20:
                C14050l c14050l = (C14050l) obj2;
                C17804l c17804l2 = (C17804l) obj;
                c17804l2.mo2748break(new C13736l(2, 0, 1, 1, 0, false, true), c14050l.yandex);
                c17804l2.m4419l(c14050l.loadAd);
                return Unit.INSTANCE;
            case 21:
                InterfaceC18035l interfaceC18035l = (InterfaceC18035l) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return interfaceC18035l.admob(iIntValue) + ": " + interfaceC18035l.isPro(iIntValue).yandex();
            case 22:
                C18225l c18225l = (C18225l) obj2;
                C14416l c14416l = (C14416l) obj;
                c14416l.yandex(C0194l.loadAd, "type");
                c14416l.yandex(AbstractC16814l.purchase("kotlinx.serialization.Polymorphic<" + c18225l.yandex.license() + '>', C10155l.amazon, new InterfaceC18035l[0]), "value");
                c14416l.loadAd = c18225l.loadAd;
                return Unit.INSTANCE;
            case 23:
                ((C11315l) ((C11644l) obj2).f23362l).addLast(obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C1008l c1008l = ((C4261l) obj2).f8751l;
                c1008l.getClass();
                c1008l.remoteconfig(null, (String) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C16995l c16995l = (C16995l) obj2;
                long jLongValue = ((Long) obj).longValue();
                InterfaceC11185l interfaceC11185l = (InterfaceC11185l) c16995l.crashlytics;
                C16995l c16995l2 = (C16995l) c16995l.loadAd;
                c16995l2.yandex();
                float f = jLongValue;
                long length = ((File) c16995l2.crashlytics).length();
                if (length < 1) {
                    length = 1;
                }
                interfaceC11185l.loadAd(((Number) AbstractC8576l.admob(Float.valueOf(f / length), new C12015l(0.0f, 1.0f))).floatValue());
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                Unit unit = Unit.INSTANCE;
                ((C9426l) obj2).m3885new(unit);
                return unit;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C9426l c9426l = ((C2996l) obj2).loadAd;
                Unit unit2 = Unit.INSTANCE;
                c9426l.m3885new(unit2);
                return unit2;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C7119l) ((C2182l) obj2).purchase.f3604l).amazon(new C18459l((C12151l) obj));
                return Unit.INSTANCE;
            default:
                ((C11315l) ((C1424l) obj2).f3606l).addLast(obj);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C8250l(Object obj, Object obj2, int i) {
        this.f17147l = i;
        this.f17146l = obj;
    }
}
