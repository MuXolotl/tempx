package defpackage;

import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؗ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4951l implements Function2 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f10095l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f10096l;

    public /* synthetic */ C4951l(int i, Object obj) {
        this.f10096l = i;
        this.f10095l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: all -> 0x006f, LOOP:0: B:11:0x0037->B:28:0x007c, LOOP_END, TryCatch #0 {all -> 0x006f, blocks: (B:4:0x0011, B:6:0x0021, B:8:0x0028, B:11:0x0037, B:13:0x0047, B:15:0x0053, B:17:0x005c, B:19:0x0065, B:24:0x0071, B:25:0x0074, B:28:0x007c, B:38:0x00a1, B:29:0x007f, B:30:0x0085, B:32:0x008b, B:34:0x0093, B:37:0x009d), top: B:48:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1 A[EDGE_INSN: B:51:0x00a1->B:38:0x00a1 BREAK  A[LOOP:0: B:11:0x0037->B:28:0x007c], SYNTHETIC] */
    private final Object yandex(Object obj, Object obj2) {
        InterfaceC4305l interfaceC4305lAppmetrica;
        C4791l c4791l = (C4791l) this.f10095l;
        Set set = (Set) obj;
        synchronized (c4791l.amazon) {
            try {
                if (((EnumC6767l) c4791l.license.getValue()).compareTo(EnumC6767l.f14181l) >= 0) {
                    C6295l c6295l = c4791l.subs;
                    if (set instanceof C16927l) {
                        C6295l c6295l2 = ((C16927l) set).f33011l;
                        Object[] objArr = c6295l2.loadAd;
                        long[] jArr = c6295l2.yandex;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            Object obj3 = objArr[(i << 3) + i3];
                                            if (!(obj3 instanceof AbstractC6998l) || ((AbstractC6998l) obj3).crashlytics(1)) {
                                                c6295l.yandex(obj3);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                    if (i != length) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                    } else {
                        for (Object obj4 : set) {
                            if (!(obj4 instanceof AbstractC6998l) || ((AbstractC6998l) obj4).crashlytics(1)) {
                                c6295l.yandex(obj4);
                            }
                        }
                    }
                    interfaceC4305lAppmetrica = c4791l.appmetrica();
                } else {
                    interfaceC4305lAppmetrica = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC4305lAppmetrica != null) {
            ((C2397l) interfaceC4305lAppmetrica).subs(Unit.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x004f  */
    /* JADX WARN: Code duplicated, block: B:237:0x0826 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:238:0x0828 A[Catch: all -> 0x0846, LOOP:4: B:228:0x07f3->B:238:0x0828, LOOP_END, TryCatch #0 {, blocks: (B:225:0x07da, B:228:0x07f3, B:230:0x0803, B:232:0x080f, B:234:0x0818, B:235:0x0820, B:238:0x0828, B:239:0x082b, B:241:0x0831, B:243:0x0838), top: B:371:0x07da }] */
    /* JADX WARN: Code duplicated, block: B:385:0x082b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0033  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x004f, please report this as an issue */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i;
        C6956l c6956l;
        boolean z3;
        int i2;
        DynamicMutableRealmObject dynamicMutableRealmObject;
        String str;
        C11183l c11183l;
        InterfaceC7042l interfaceC7042l = null;
        char c = 2;
        switch (this.f10096l) {
            case 0:
                ((Integer) obj2).getClass();
                ((C13138l) this.f10095l).yandex((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((C11663l) this.f10095l).mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 2:
                C1059l c1059l = (C1059l) this.f10095l;
                C6956l c6956l2 = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zAdmob = c6956l2.admob(c1059l);
                    Object objM2132native = c6956l2.m2132native();
                    if (zAdmob || objM2132native == C1867l.yandex) {
                        objM2132native = new C7730l(21, c1059l);
                        c6956l2.m2147try(objM2132native);
                    }
                    AbstractC3383l.loadAd((Function0) objM2132native, AbstractC3605l.startapp(AbstractC3605l.vip(AbstractC0080l.amazon(C4346l.f8873l, 1.0f), 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), false, null, null, null, null, AbstractC17948l.yandex, c6956l2, 100663344, 252);
                } else {
                    c6956l2.m2124else();
                }
                return Unit.INSTANCE;
            case 3:
                C17731l c17731l = (C17731l) this.f10095l;
                C6956l c6956l3 = (C6956l) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C4346l c4346l = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lSubscription = AbstractC2697l.subscription(AbstractC3605l.startapp(c4346l, 0.0f, 0.0f, 0.0f, ((C15700l) c6956l3.isPro(AbstractC18678l.yandex)).yandex(c6956l3), 7), AbstractC2697l.purchase);
                    C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36034l, c6956l3, 48);
                    long j = c6956l3.f14595continue;
                    int i3 = (int) (j ^ (j >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato = c6956l3.smaato();
                    InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l3, interfaceC17242lSubscription);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l = C3438l.loadAd;
                    c6956l3.m2140super();
                    if (c6956l3.f14603switch) {
                        c6956l3.firebase(c16395l);
                    } else {
                        c6956l3.m2136protected();
                    }
                    AbstractC8182l.billing(c6956l3, c1853lYandex, C3438l.mopub);
                    AbstractC8182l.billing(c6956l3, interfaceC18556lSmaato, C3438l.billing);
                    AbstractC8182l.billing(c6956l3, Integer.valueOf(i3), C3438l.isPro);
                    AbstractC8182l.purchase(c6956l3, C3438l.firebase);
                    AbstractC8182l.billing(c6956l3, interfaceC17242lBilling, C3438l.amazon);
                    C6168l.f12997l.crashlytics(null, 0.0f, 0.0f, null, 0L, c6956l3, 196608, 31);
                    String strPurchase = AbstractC11999l.purchase(c6956l3, c17731l.f34552l);
                    C10707l c10707l = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(strPurchase, AbstractC0080l.amazon(c4346l, 1.0f), ((C14370l) c6956l3.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, new C10258l(3), 0L, 0, false, 0, 0, ((C14370l) c6956l3.isPro(c10707l)).loadAd.purchase, c6956l3, 48, 0, 130040);
                    AbstractC9334l.yandex(c6956l3, AbstractC0080l.purchase(c4346l, 16.0f));
                    boolean zAdmob2 = c6956l3.admob(c17731l);
                    Object objM2132native2 = c6956l3.m2132native();
                    if (zAdmob2 || objM2132native2 == C1867l.yandex) {
                        objM2132native2 = new C17015l(28, c17731l);
                        c6956l3.m2147try(objM2132native2);
                    }
                    AbstractC16336l.yandex(null, null, null, null, null, null, false, null, (Function1) objM2132native2, c6956l3, 0, 511);
                    c6956l3.startapp(true);
                } else {
                    c6956l3.m2124else();
                }
                return Unit.INSTANCE;
            case 4:
                ((InterfaceC2077l) this.f10095l).purchase(((C1187l) obj2).yandex);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((C5636l) this.f10095l).mo271new((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 6:
                C6143l c6143l = (C6143l) this.f10095l;
                C6956l c6956l4 = (C6956l) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c6956l4.m2127for(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC13010l.loadAd(c6143l.yandex, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l4, 0, 0, 262142);
                } else {
                    c6956l4.m2124else();
                }
                return Unit.INSTANCE;
            case 7:
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) ((C17251l) this.f10095l).invoke((C15543l) obj, obj2)).entrySet()) {
                    arrayList.add(entry.getKey());
                    arrayList.add(entry.getValue());
                }
                return arrayList;
            case 8:
                ((Integer) obj2).getClass();
                ((C2999l) this.f10095l).yandex((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 9:
                EnumC6863l enumC6863l = (EnumC6863l) this.f10095l;
                C6956l c6956l5 = (C6956l) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (c6956l5.m2127for(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l5, enumC6863l.f14356l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l5, 0, 0, 262142);
                } else {
                    c6956l5.m2124else();
                }
                return Unit.INSTANCE;
            case 10:
                C16385l c16385l = (C16385l) this.f10095l;
                C6956l c6956l6 = (C6956l) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (c6956l6.m2127for(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    if (c16385l.m4174const()) {
                        c6956l6.m2123default(-147322677);
                        z = false;
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check_circle_16, 0, c6956l6), null, null, ((C14370l) c6956l6.isPro(AbstractC16964l.yandex)).yandex.yandex, c6956l6, 56, 4);
                    } else {
                        z = false;
                        c6956l6.m2123default(-153656473);
                    }
                    c6956l6.startapp(z);
                } else {
                    c6956l6.m2124else();
                }
                return Unit.INSTANCE;
            case 11:
                C9502l c9502l = (C9502l) this.f10095l;
                C6956l c6956l7 = (C6956l) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (c6956l7.m2127for(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    if (((Boolean) c9502l.f19381l.getValue()).booleanValue()) {
                        c6956l7.m2123default(-309078291);
                        z2 = false;
                        AbstractC4597l.loadAd(AbstractC16759l.crashlytics(R.drawable.ic_check_circle_16, 0, c6956l7), null, null, ((C14370l) c6956l7.isPro(AbstractC16964l.yandex)).yandex.yandex, c6956l7, 56, 4);
                    } else {
                        z2 = false;
                        c6956l7.m2123default(-312620599);
                    }
                    c6956l7.startapp(z2);
                } else {
                    c6956l7.m2124else();
                }
                return Unit.INSTANCE;
            case 12:
                EnumC9700l enumC9700l = (EnumC9700l) this.f10095l;
                C6956l c6956l8 = (C6956l) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (c6956l8.m2127for(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.purchase(c6956l8, enumC9700l.f19783l), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l8, 0, 0, 262142);
                } else {
                    c6956l8.m2124else();
                }
                return Unit.INSTANCE;
            case 13:
                C3242l c3242l = (C3242l) this.f10095l;
                C3737l c3737l = (C3737l) obj;
                ((Boolean) obj2).getClass();
                return c3242l.crashlytics ? c3737l.crashlytics(c3737l.billing.yandex.yandex.f7563l.length(), 0) : c3737l.crashlytics(0, c3737l.billing.yandex.yandex.f7563l.length());
            case 14:
                C11265l c11265l = (C11265l) this.f10095l;
                Set set = (Set) obj;
                C10700l c10700l = new C10700l();
                synchronized (c11265l.yandex) {
                    C13660l c13660l = c11265l.loadAd;
                    Ctransient ctransient = new Ctransient(set, c11265l, c10700l, 27);
                    AbstractC9464l.purchase(1, ctransient);
                    Object[] objArr = c13660l.loadAd;
                    long[] jArr = c13660l.yandex;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j2 = jArr[i4];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if ((255 & j2) < 128) {
                                        ctransient.invoke(objArr[(i4 << 3) + i6]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i5 == 8) {
                                    if (i4 != length) {
                                        i4++;
                                    }
                                }
                            } else if (i4 != length) {
                                i4++;
                            }
                        }
                    }
                    List list = (List) c10700l.f21708l;
                    if (list != null) {
                        int size = list.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((InterfaceC0389l) list.get(i7)).amazon(Unit.INSTANCE);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((C0524l) this.f10095l).yandex((C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                AbstractC15042l.remoteconfig((C13450l) this.f10095l, (C6956l) obj, AbstractC0545l.purchase(1));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                EnumC12501l enumC12501l = (EnumC12501l) this.f10095l;
                C6956l c6956l9 = (C6956l) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (c6956l9.m2127for(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    AbstractC14165l abstractC14165lCrashlytics = AbstractC16759l.crashlytics(enumC12501l == EnumC12501l.f24639l ? R.drawable.player_repeat_one : R.drawable.player_repeat, 0, c6956l9);
                    int iOrdinal = enumC12501l.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.now_playing_repeat_to_playlist;
                    } else if (iOrdinal == 1) {
                        i = R.string.now_playing_repeat_to_track;
                    } else {
                        if (iOrdinal != 2) {
                            C18725l.billing();
                            return null;
                        }
                        i = R.string.now_playing_repeat_disable;
                    }
                    AbstractC4597l.loadAd(abstractC14165lCrashlytics, AbstractC11999l.purchase(c6956l9, i), AbstractC0080l.isPro(C4346l.f8873l, 28.0f), 0L, c6956l9, 392, 8);
                } else {
                    c6956l9.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC3082l interfaceC3082l = (InterfaceC3082l) this.f10095l;
                C6956l c6956l10 = (C6956l) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (c6956l10.m2127for(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    C4346l c4346l2 = C4346l.f8873l;
                    InterfaceC17242l interfaceC17242lRemoteconfig = AbstractC0080l.remoteconfig(AbstractC8532l.loadAd(c4346l2, null, 3), 32.0f, 4.0f, 0.0f, 0.0f, 12);
                    InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
                    long j3 = c6956l10.f14595continue;
                    int i8 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC18556l interfaceC18556lSmaato2 = c6956l10.smaato();
                    InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l10, interfaceC17242lRemoteconfig);
                    InterfaceC8801l.firebase.getClass();
                    C16395l c16395l2 = C3438l.loadAd;
                    c6956l10.m2140super();
                    if (c6956l10.f14603switch) {
                        c6956l10.firebase(c16395l2);
                    } else {
                        c6956l10.m2136protected();
                    }
                    C6415l c6415l = C3438l.mopub;
                    AbstractC8182l.billing(c6956l10, interfaceC10835lAmazon, c6415l);
                    C6415l c6415l2 = C3438l.billing;
                    AbstractC8182l.billing(c6956l10, interfaceC18556lSmaato2, c6415l2);
                    Integer numValueOf = Integer.valueOf(i8);
                    C6415l c6415l3 = C3438l.isPro;
                    AbstractC8182l.billing(c6956l10, numValueOf, c6415l3);
                    C11192l c11192l = C3438l.firebase;
                    AbstractC8182l.purchase(c6956l10, c11192l);
                    C6415l c6415l4 = C3438l.amazon;
                    AbstractC8182l.billing(c6956l10, interfaceC17242lBilling2, c6415l4);
                    if (AbstractC8576l.yandex(interfaceC3082l, C17123l.yandex)) {
                        c6956l10.m2123default(1835162760);
                        c6956l10.startapp(false);
                        c6956l = c6956l10;
                        z3 = true;
                    } else {
                        if (!(interfaceC3082l instanceof C10419l)) {
                            throw AbstractC12900l.billing(-633538319, c6956l10, false);
                        }
                        c6956l10.m2123default(1835247142);
                        C0086l c0086l = C18450l.f36040l;
                        InterfaceC17242l interfaceC17242lSmaato = AbstractC3605l.smaato(AbstractC0080l.amazon(c4346l2, 1.0f), 16.0f);
                        C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, c0086l, c6956l10, 48);
                        long j4 = c6956l10.f14595continue;
                        int i9 = (int) (j4 ^ (j4 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato3 = c6956l10.smaato();
                        InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l10, interfaceC17242lSmaato);
                        c6956l10.m2140super();
                        if (c6956l10.f14603switch) {
                            c6956l10.firebase(c16395l2);
                        } else {
                            c6956l10.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l10, c5062lYandex, c6415l);
                        AbstractC8182l.billing(c6956l10, interfaceC18556lSmaato3, c6415l2);
                        AbstractC11043l.isPro(i9, c6956l10, c6415l3, c6956l10, c11192l);
                        AbstractC8182l.billing(c6956l10, interfaceC17242lBilling3, c6415l4);
                        C9247l c9247l = new C9247l(1.0f, true);
                        C1853l c1853lYandex2 = AbstractC1001l.yandex(new C7537l(2.0f, true, new C8339l(12)), C18450l.f36046l, c6956l10, 6);
                        long j5 = c6956l10.f14595continue;
                        int i10 = (int) (j5 ^ (j5 >>> 32));
                        InterfaceC18556l interfaceC18556lSmaato4 = c6956l10.smaato();
                        InterfaceC17242l interfaceC17242lBilling4 = AbstractC17541l.billing(c6956l10, c9247l);
                        c6956l10.m2140super();
                        if (c6956l10.f14603switch) {
                            c6956l10.firebase(c16395l2);
                        } else {
                            c6956l10.m2136protected();
                        }
                        AbstractC8182l.billing(c6956l10, c1853lYandex2, c6415l);
                        AbstractC8182l.billing(c6956l10, interfaceC18556lSmaato4, c6415l2);
                        AbstractC11043l.isPro(i10, c6956l10, c6415l3, c6956l10, c11192l);
                        AbstractC8182l.billing(c6956l10, interfaceC17242lBilling4, c6415l4);
                        C10419l c10419l = (C10419l) interfaceC3082l;
                        String str2 = c10419l.yandex;
                        C10707l c10707l2 = AbstractC16964l.yandex;
                        AbstractC13010l.loadAd(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l10.isPro(c10707l2)).loadAd.mopub, c6956l10, 0, 0, 131070);
                        c6956l = c6956l10;
                        AbstractC13010l.loadAd(c10419l.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l.isPro(c10707l2)).loadAd.firebase, c6956l10, 0, 0, 131070);
                        z3 = true;
                        c6956l.startapp(true);
                        c6956l.m2123default(-1088486097);
                        c6956l.startapp(false);
                        c6956l.startapp(true);
                        c6956l.startapp(false);
                    }
                    c6956l.startapp(z3);
                } else {
                    c6956l10.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC0582l interfaceC0582l = (InterfaceC0582l) this.f10095l;
                C6956l c6956l11 = (C6956l) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (c6956l11.m2127for(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    AbstractC13010l.loadAd(((C6143l) interfaceC0582l).yandex, null, 0L, 0L, null, null, AbstractC1193l.yandex, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l11.isPro(AbstractC16964l.yandex)).loadAd.isPro, c6956l11, 12582912, 0, 130942);
                } else {
                    c6956l11.m2124else();
                }
                return Unit.INSTANCE;
            case 20:
                C15764l c15764l = (C15764l) this.f10095l;
                C6956l c6956l12 = (C6956l) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (c6956l12.m2127for(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    long j6 = ((C18718l) c6956l12.isPro(AbstractC5992l.yandex)).yandex;
                    boolean zPurchase = c6956l12.purchase(j6);
                    Object objM2132native3 = c6956l12.m2132native();
                    if (zPurchase || objM2132native3 == C1867l.yandex) {
                        objM2132native3 = new C9735l(AbstractC12953l.vip(j6) > 0.5f ? AbstractC12953l.remoteconfig(j6, C9735l.loadAd, 0.5f) : AbstractC12953l.remoteconfig(j6, C9735l.purchase, 0.5f));
                        c6956l12.m2147try(objM2132native3);
                    }
                    AbstractC6363l.crashlytics(c15764l, null, AbstractC14566l.amazon(1890734184, new C9035l(((C9735l) objM2132native3).yandex, 1), c6956l12), c6956l12, 390);
                } else {
                    c6956l12.m2124else();
                }
                return Unit.INSTANCE;
            case 21:
                C1682l c1682l = (C1682l) this.f10095l;
                C6956l c6956l13 = (C6956l) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (c6956l13.m2127for(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    AbstractC13010l.loadAd(AbstractC11999l.amazon(R.string.settings_proxy_remove_dialog, new Object[]{c1682l.f4050l + ':' + c1682l.f4045l}, c6956l13), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l13, 0, 0, 262142);
                } else {
                    c6956l13.m2124else();
                }
                return Unit.INSTANCE;
            case 22:
                C12708l c12708l = (C12708l) this.f10095l;
                C6956l c6956l14 = (C6956l) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (c6956l14.m2127for(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    String str3 = c12708l.billing;
                    C10707l c10707l3 = AbstractC16964l.yandex;
                    AbstractC13010l.loadAd(str3, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), ((C14370l) c6956l14.isPro(c10707l3)).yandex.subscription, 0L, null, null, null, 0L, new C10258l(3), 0L, 2, false, 1, 0, ((C14370l) c6956l14.isPro(c10707l3)).loadAd.firebase, c6956l14, 48, 24960, 109560);
                } else {
                    c6956l14.m2124else();
                }
                return Unit.INSTANCE;
            case 23:
                C15184l c15184l = (C15184l) this.f10095l;
                C6956l c6956l15 = (C6956l) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                C9885l c9885l = C9885l.yandex;
                if (c6956l15.m2127for(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    if (AbstractC13542l.yandex) {
                        c6956l15.m2123default(1956106322);
                        AbstractC1889l.yandex(AbstractC1789l.crashlytics(AbstractC13542l.yandex(AbstractC5573l.purchase(c9885l).billing(new C9768l(((C16592l) c6956l15.isPro(AbstractC9404l.purchase)).signatures)).billing(C8479l.yandex), c6956l15), c15184l), null, AbstractC8441l.loadAd, c6956l15, 384, 2);
                        i2 = 0;
                        c6956l15.startapp(false);
                    } else {
                        c6956l15.m2123default(1956583040);
                        C10053l.yandex(new C7552l(R.drawable.widget_background_round), null, AbstractC1789l.crashlytics(AbstractC5573l.purchase(c9885l), c15184l), 0, new C2607l(new C12922l(((C16592l) c6956l15.isPro(AbstractC9404l.purchase)).signatures)), c6956l15, 32816, 0);
                        c6956l15 = c6956l15;
                        i2 = 0;
                        c6956l15.startapp(false);
                    }
                    AbstractC3872l.yandex(null, 1, AbstractC8441l.crashlytics, c6956l15, 3072, 3);
                    AbstractC3324l.yandex(null, c6956l15, i2, 1);
                } else {
                    c6956l15.m2124else();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C7473l c7473l = (C7473l) this.f10095l;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                c7473l.purchase.subs(fFloatValue);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C6659l c6659l = (C6659l) this.f10095l;
                InterfaceC11343l interfaceC11343l = (InterfaceC11343l) obj;
                DynamicMutableRealmObject dynamicMutableRealmObject2 = (DynamicMutableRealmObject) obj2;
                if (dynamicMutableRealmObject2 != null) {
                    C2336l c2336l = AbstractC18202l.yandex;
                    String str4 = (String) interfaceC11343l.tapsense(c2336l.loadAd(String.class), "uid");
                    if (str4 != null && (dynamicMutableRealmObject = (DynamicMutableRealmObject) AbstractC11356l.loadAd(c6659l.m2063l("CachedTrack", "albumFullId == $0", str4))) != null) {
                        DynamicMutableRealmObject dynamicMutableRealmObject3 = (DynamicMutableRealmObject) AbstractC16901l.m4217extends(dynamicMutableRealmObject.firebase("mainArtists"));
                        if (dynamicMutableRealmObject3 == null || (str = (String) dynamicMutableRealmObject3.smaato(c2336l.loadAd(String.class), "name")) == null) {
                            str = (String) dynamicMutableRealmObject.smaato(c2336l.loadAd(String.class), "artist");
                        }
                        dynamicMutableRealmObject2.admob(str, "artist");
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return yandex(obj, obj2);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                InterfaceC10315l interfaceC10315l = (InterfaceC10315l) this.f10095l;
                C15543l c15543l = (C15543l) obj;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj2;
                if (!(interfaceC8714l instanceof InterfaceC0938l)) {
                    C8339l.metrica("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                    return null;
                }
                InterfaceC0938l interfaceC0938l = (InterfaceC0938l) interfaceC8714l;
                Object objSubs = interfaceC10315l.subs(c15543l, interfaceC0938l.getValue());
                if (objSubs != null) {
                    return new C10086l(objSubs, interfaceC0938l.loadAd());
                }
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C13713l c13713l = (C13713l) this.f10095l;
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                C11925l c11925l = (C11925l) obj2;
                C11183l c11183l2 = c13713l.yandex;
                C10417l c10417l = c11183l2.f22487l;
                float f = c11183l2.f22500l;
                if (c10417l == null) {
                    if (c13713l.loadAd == null || (c11183l2.f22490l & 907003) != 0) {
                        c11183l = c11183l2;
                        c13713l.loadAd = AbstractC13958l.loadAd(c11183l, 0.0f, 0.0f, null, 0.0f, null, null, 1023);
                    } else {
                        c11183l = c11183l2;
                    }
                    c11925l.subs(c13713l.loadAd);
                    c11925l.billing(c11183l.f22500l);
                    AbstractC2576l.loadAd(interfaceC13349l, c11925l);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    c11925l.subs(AbstractC13958l.loadAd(c11183l2, 0.0f, 0.0f, null, 0.0f, null, c10417l, 767));
                    c11925l.billing(f);
                    AbstractC2576l.loadAd(interfaceC13349l, c11925l);
                } else {
                    List listBilling = AbstractC13958l.billing(c11183l2);
                    float fPurchase = AbstractC13958l.purchase(c11183l2);
                    float fAmazon = AbstractC13958l.amazon(c11183l2);
                    if (Float.isNaN(fAmazon)) {
                        fAmazon = 0.0f;
                    }
                    float fYandex = AbstractC13958l.yandex(c11183l2) * fAmazon;
                    float fMo868instanceof = interfaceC13349l.mo2065break().m4560volatile().mo868instanceof(64.0f);
                    long j7 = c10417l.loadAd;
                    long j8 = c10417l.crashlytics;
                    long jAdmob = interfaceC13349l.admob();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j8 >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jAdmob >> 32));
                    if (fIntBitsToFloat3 > fIntBitsToFloat4) {
                        fIntBitsToFloat3 = fIntBitsToFloat4;
                    }
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j8 & 4294967295L));
                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jAdmob & 4294967295L));
                    if (fIntBitsToFloat5 > fIntBitsToFloat6) {
                        fIntBitsToFloat5 = fIntBitsToFloat6;
                    }
                    int iCeil = (int) Math.ceil(((float) Math.hypot(fIntBitsToFloat3 - fIntBitsToFloat, fIntBitsToFloat5 - fIntBitsToFloat2)) / fMo868instanceof);
                    if (iCeil < 2) {
                        iCeil = 2;
                    }
                    int iAmazon = AbstractC17764l.amazon(iCeil, 0, -1);
                    if (iAmazon <= iCeil) {
                        int i11 = iCeil;
                        while (true) {
                            float f2 = i11;
                            float f3 = iCeil;
                            float fPurchase2 = AbstractC14231l.purchase(1.0f, 0.0f, c10417l.yandex.yandex(f2 / f3));
                            float fMin = Math.min(1.0f, 0.0f);
                            float fMax = Math.max(1.0f, 0.0f);
                            Float fValueOf = Float.valueOf(AbstractC14231l.purchase(fMin, fMax, (f2 - 2.0f) / f3));
                            char c2 = c;
                            long j9 = C9735l.isPro;
                            C13713l c13713l2 = c13713l;
                            C8195l c8195l = new C8195l(fValueOf, new C9735l(j9));
                            Float fValueOf2 = Float.valueOf(AbstractC14231l.purchase(fMin, fMax, (f2 - 1.0f) / f3));
                            C11925l c11925l2 = c11925l;
                            long j10 = C9735l.loadAd;
                            InterfaceC13349l interfaceC13349l2 = interfaceC13349l;
                            C8195l c8195l2 = new C8195l(fValueOf2, new C9735l(j10));
                            C8195l c8195l3 = new C8195l(Float.valueOf(AbstractC14231l.purchase(fMin, fMax, (f2 + 0.0f) / f3)), new C9735l(j10));
                            C8195l c8195l4 = new C8195l(Float.valueOf(AbstractC14231l.purchase(fMin, fMax, (f2 + 1.0f) / f3)), new C9735l(j9));
                            C8195l[] c8195lArr = new C8195l[4];
                            c8195lArr[0] = c8195l;
                            c8195lArr[1] = c8195l2;
                            c8195lArr[c2] = c8195l3;
                            c8195lArr[3] = c8195l4;
                            long j11 = c10417l.loadAd;
                            long j12 = c10417l.crashlytics;
                            ArrayList arrayList2 = new ArrayList(4);
                            for (int i12 = 0; i12 < 4; i12++) {
                                arrayList2.add(new C9735l(((C9735l) c8195lArr[i12].f17097l).yandex));
                            }
                            ArrayList arrayList3 = new ArrayList(4);
                            for (int i13 = 0; i13 < 4; i13++) {
                                arrayList3.add(Float.valueOf(((Number) c8195lArr[i13].f17098l).floatValue()));
                            }
                            C15505l c15505l = new C15505l(interfaceC13349l2, c11925l2, c13713l2, fYandex, fPurchase2, fPurchase, listBilling, new C6906l(arrayList2, arrayList3, j11, j12));
                            c13713l = c13713l2;
                            AbstractC3586l.mopub(c11183l2, c15505l);
                            Unit unit = Unit.INSTANCE;
                            if (i11 != iAmazon) {
                                i11--;
                                interfaceC13349l = interfaceC13349l2;
                                c11925l = c11925l2;
                                c = c2;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                C10412l c10412l = (C10412l) this.f10095l;
                int iIntValue15 = ((Integer) obj).intValue();
                InterfaceC5763l interfaceC5763l = (InterfaceC5763l) obj2;
                InterfaceC15446l key = interfaceC5763l.getKey();
                InterfaceC5763l interfaceC5763lMo245l = c10412l.f21230l.mo245l(key);
                if (key == C1083l.f2996l) {
                    InterfaceC7042l interfaceC7042l2 = (InterfaceC7042l) interfaceC5763lMo245l;
                    InterfaceC7042l parent = (InterfaceC7042l) interfaceC5763l;
                    while (parent != null) {
                        if (parent != interfaceC7042l2 && (parent instanceof C14274l)) {
                            InterfaceC4367l interfaceC4367l = (InterfaceC4367l) C14750l.f28821l.get((C14274l) parent);
                            parent = interfaceC4367l != null ? interfaceC4367l.getParent() : null;
                        } else {
                            interfaceC7042l = parent;
                            if (interfaceC7042l == interfaceC7042l2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC7042l + ", expected child of " + interfaceC7042l2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (interfaceC7042l2 != null) {
                                iIntValue15++;
                            }
                        }
                    }
                    if (interfaceC7042l == interfaceC7042l2) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC7042l + ", expected child of " + interfaceC7042l2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (interfaceC7042l2 != null) {
                        iIntValue15++;
                    }
                } else if (interfaceC5763l != interfaceC5763lMo245l) {
                    iIntValue15 = RecyclerView.UNDEFINED_DURATION;
                } else {
                    iIntValue15++;
                }
                return Integer.valueOf(iIntValue15);
        }
    }

    public /* synthetic */ C4951l(Object obj, int i, int i2) {
        this.f10096l = i2;
        this.f10095l = obj;
    }
}
