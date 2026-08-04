package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٔ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14959l extends C1538l implements Function2 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29432l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14959l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f29432l = i4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0363  */
    /* JADX WARN: Code duplicated, block: B:102:0x036e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0375 A[LOOP:2: B:101:0x036c->B:105:0x0375, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0434  */
    /* JADX WARN: Code duplicated, block: B:156:0x0436 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0438  */
    /* JADX WARN: Code duplicated, block: B:158:0x043a  */
    /* JADX WARN: Code duplicated, block: B:170:0x045f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0468  */
    /* JADX WARN: Code duplicated, block: B:176:0x047a  */
    /* JADX WARN: Code duplicated, block: B:177:0x047d  */
    /* JADX WARN: Code duplicated, block: B:340:0x0381 A[EDGE_INSN: B:340:0x0381->B:107:0x0381 BREAK  A[LOOP:2: B:101:0x036c->B:105:0x0375], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0378 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        boolean zLoadAd;
        boolean zLoadAd2;
        int size;
        int size2;
        int i;
        int i2;
        int i3;
        int length;
        int i4 = this.f29432l;
        int i5 = 17;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i6 = 6;
        int i7 = 4;
        int i8 = 3;
        int i9 = 2;
        boolean z = true;
        int iMin = 0;
        C15920l c15920l = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        Object obj3 = this.f26698l;
        switch (i4) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                ((C9879l) obj3).getClass();
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                c16076l.getClass();
                c16076l.subs(new C11131l(iIntValue, iIntValue2, b == true ? 1 : 0, 0));
                return Unit.INSTANCE;
            case 1:
                ((C13626l) obj3).getClass();
                Object objFirebase = AbstractC10999l.firebase(AbstractC11463l.yandex, new C5003l((Context) obj, b2 == true ? 1 : 0, z ? 1 : 0), (InterfaceC14029l) obj2);
                return objFirebase == enumC9342l ? objFirebase : Unit.INSTANCE;
            case 2:
                ((C8207l) obj3).getClass();
                Object objLoadAd = AbstractC3803l.yandex((Context) obj).loadAd(new C2051l(i9, b3 == true ? 1 : 0, i6), (InterfaceC14029l) obj2);
                return objLoadAd == enumC9342l ? objLoadAd : Unit.INSTANCE;
            case 3:
                EnumC11822l enumC11822l = (EnumC11822l) obj;
                EnumC11822l enumC11822l2 = (EnumC11822l) obj2;
                C10789l c10789l = (C10789l) obj3;
                if (c10789l.f29462l && (zLoadAd = enumC11822l2.loadAd()) != enumC11822l.loadAd()) {
                    if (zLoadAd) {
                        C10700l c10700l = new C10700l();
                        AbstractC3700l.admob(c10789l, new C4307l(c10700l, c10789l, i7));
                        C15920l c15920l2 = (C15920l) c10700l.f21708l;
                        if (c15920l2 != null) {
                            c15920l2.yandex();
                            c15920l = c15920l2;
                        }
                        c10789l.f21815l = c15920l;
                    } else {
                        C15920l c15920l3 = c10789l.f21815l;
                        if (c15920l3 != null) {
                            c15920l3.loadAd();
                        }
                        c10789l.f21815l = null;
                    }
                }
                return Unit.INSTANCE;
            case 4:
                EnumC11822l enumC11822l3 = (EnumC11822l) obj;
                EnumC11822l enumC11822l4 = (EnumC11822l) obj2;
                C12044l c12044l = (C12044l) obj3;
                if (c12044l.f29462l && (zLoadAd2 = enumC11822l4.loadAd()) != enumC11822l3.loadAd()) {
                    Function1 function1 = c12044l.f23970l;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(zLoadAd2));
                    }
                    C16222l c16222l = AbstractC8340l.f17267l;
                    if (zLoadAd2) {
                        AbstractC10999l.mopub(c12044l.m3914l(), null, 0, new C8912l(c12044l, b4 == true ? 1 : 0, i9), 3);
                        C10700l c10700l2 = new C10700l();
                        AbstractC3700l.admob(c12044l, new C12242l(c10700l2, c12044l, i5));
                        C15920l c15920l4 = (C15920l) c10700l2.f21708l;
                        if (c15920l4 != null) {
                            c15920l4.yandex();
                        } else {
                            c15920l4 = null;
                        }
                        c12044l.f23967l = c15920l4;
                        InterfaceC18212l interfaceC18212l = c12044l.f23966l;
                        if (interfaceC18212l != null && interfaceC18212l.mopub() && c12044l.f29462l) {
                            AbstractC13359l.purchase(c12044l, c16222l);
                        }
                    } else {
                        C15920l c15920l5 = c12044l.f23967l;
                        if (c15920l5 != null) {
                            c15920l5.loadAd();
                        }
                        c12044l.f23967l = null;
                        if (c12044l.f29462l) {
                            AbstractC13359l.purchase(c12044l, c16222l);
                        }
                    }
                    AbstractC18037l.purchase(c12044l);
                    C2403l c2403l = c12044l.f23969l;
                    if (c2403l != null) {
                        C7008l c7008l = c12044l.f23968l;
                        if (zLoadAd2) {
                            if (c7008l != null) {
                                c12044l.m3355l(c2403l, new C17768l(c7008l));
                                c12044l.f23968l = null;
                            }
                            C7008l c7008l2 = new C7008l();
                            c12044l.m3355l(c2403l, c7008l2);
                            c12044l.f23968l = c7008l2;
                        } else if (c7008l != null) {
                            c12044l.m3355l(c2403l, new C17768l(c7008l));
                            c12044l.f23968l = null;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 5:
                List list = (List) obj;
                InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
                C14517l c14517l = (C14517l) obj3;
                c14517l.getClass();
                C15305l c15305l = C15305l.crashlytics;
                C15305l c15305l2 = C15305l.loadAd;
                C15305l c15305l3 = C15305l.yandex;
                C15305l c15305l4 = C15305l.amazon;
                if (list.size() == 1) {
                    size = 0;
                } else {
                    size = list.size() - 1;
                    if (size >= 0) {
                        int i10 = -1;
                        while (true) {
                            int i11 = size - 1;
                            InterfaceC12641l interfaceC12641l = (InterfaceC12641l) list.get(size);
                            if (!AbstractC8576l.yandex(interfaceC12641l, c15305l3) && !AbstractC8576l.yandex(interfaceC12641l, c15305l2) && !AbstractC8576l.yandex(interfaceC12641l, c15305l4) && !AbstractC8576l.yandex(interfaceC12641l, c15305l)) {
                                if ((interfaceC12641l instanceof C10916l) && i10 < 0) {
                                    i10 = size;
                                }
                                if (i11 < 0) {
                                    size = i10;
                                } else {
                                    size = i11;
                                }
                            }
                        }
                    } else {
                        size = -1;
                    }
                    if (size < 0) {
                        int size3 = list.size();
                        int i12 = -1;
                        int i13 = -1;
                        for (int i14 = 0; i14 < size3; i14++) {
                            InterfaceC12641l interfaceC12641l2 = (InterfaceC12641l) list.get(i14);
                            if (interfaceC12641l2 instanceof C4122l) {
                                i12 = i14;
                            } else if (interfaceC12641l2 instanceof AbstractC0054l) {
                                i13 = i14;
                            } else if (!(interfaceC12641l2 instanceof C12253l)) {
                                if (i12 >= 0) {
                                    size = i12;
                                } else if (i13 >= 0) {
                                    size = i13;
                                } else if (c14517l.f28408l == null && c14517l.f28415l.loadAd()) {
                                    int size4 = list.size();
                                    size = 0;
                                    while (true) {
                                        if (size < size4) {
                                            InterfaceC12641l interfaceC12641l3 = (InterfaceC12641l) list.get(size);
                                            if (!(interfaceC12641l3 instanceof AbstractC2137l) && !(interfaceC12641l3 instanceof C1879l)) {
                                                size++;
                                            }
                                        } else {
                                            size2 = list.size();
                                            i2 = -1;
                                            while (i < size2) {
                                                i2 = i;
                                            }
                                            if (i2 >= 0) {
                                                size = i2;
                                            } else {
                                                size = 0;
                                            }
                                        }
                                    }
                                } else {
                                    size2 = list.size();
                                    i2 = -1;
                                    for (i = 0; i < size2 && (((InterfaceC12641l) list.get(i)) instanceof C12253l); i++) {
                                        i2 = i;
                                    }
                                    if (i2 >= 0) {
                                        size = i2;
                                    } else {
                                        size = 0;
                                    }
                                }
                            }
                        }
                        if (i12 >= 0) {
                            size = i12;
                        } else if (i13 >= 0) {
                            size = i13;
                        } else if (c14517l.f28408l == null) {
                            size2 = list.size();
                            i2 = -1;
                            while (i < size2) {
                                i2 = i;
                            }
                            if (i2 >= 0) {
                                size = i2;
                            } else {
                                size = 0;
                            }
                        } else {
                            size2 = list.size();
                            i2 = -1;
                            while (i < size2) {
                                i2 = i;
                            }
                            if (i2 >= 0) {
                                size = i2;
                            } else {
                                size = 0;
                            }
                        }
                    }
                }
                InterfaceC12641l interfaceC12641l4 = (InterfaceC12641l) list.get(size);
                if (AbstractC8576l.yandex(interfaceC12641l4, c15305l2)) {
                    list.remove(size);
                } else {
                    if (AbstractC8576l.yandex(interfaceC12641l4, c15305l)) {
                        Object objIsVip = c14517l.isVip(list, interfaceC14029l);
                        return objIsVip == enumC9342l ? objIsVip : Unit.INSTANCE;
                    }
                    if (AbstractC8576l.yandex(interfaceC12641l4, c15305l3)) {
                        C9598l c9598l = c14517l.f28400l;
                        if (c9598l != null) {
                            c9598l.amazon();
                        }
                        c14517l.f28408l = null;
                        list.remove(size);
                        int i15 = 0;
                        while (i15 < size) {
                            InterfaceC12641l interfaceC12641l5 = (InterfaceC12641l) list.get(i15);
                            if (!AbstractC8576l.yandex(interfaceC12641l5, c15305l4) && !AbstractC8576l.yandex(interfaceC12641l5, c15305l3) && !(interfaceC12641l5 instanceof C12253l) && !(interfaceC12641l5 instanceof C1879l)) {
                                if (interfaceC12641l5 instanceof AbstractC2137l) {
                                    c14517l.yandex(null);
                                } else {
                                    i15++;
                                }
                            }
                            list.remove(i15);
                            size--;
                        }
                    } else if (AbstractC8576l.yandex(interfaceC12641l4, c15305l4)) {
                        C9598l c9598l2 = c14517l.f28400l;
                        if (c9598l2 != null) {
                            c9598l2.m2697for();
                        }
                        c14517l.f28408l = null;
                        list.remove(size);
                        int i16 = 0;
                        while (i16 < size) {
                            InterfaceC12641l interfaceC12641l6 = (InterfaceC12641l) list.get(i16);
                            if (AbstractC8576l.yandex(interfaceC12641l6, c15305l4) || (interfaceC12641l6 instanceof C12253l)) {
                                list.remove(i16);
                                size--;
                            } else {
                                i16++;
                            }
                        }
                    } else {
                        if (interfaceC12641l4 instanceof C10916l) {
                            Object objAds = c14517l.ads(list, size, (C10916l) interfaceC12641l4, interfaceC14029l);
                            return objAds == enumC9342l ? objAds : Unit.INSTANCE;
                        }
                        if (interfaceC12641l4 instanceof AbstractC2137l) {
                            c14517l.vip(list, size, (AbstractC2137l) interfaceC12641l4, true);
                        } else if (interfaceC12641l4 instanceof C1879l) {
                            c14517l.signatures(list, size, (C1879l) interfaceC12641l4);
                        } else if (interfaceC12641l4 instanceof C4122l) {
                            C4122l c4122l = (C4122l) interfaceC12641l4;
                            Map mapCrashlytics = c14517l.f28398l;
                            c14517l.f28402l = c4122l.yandex;
                            Map map = c4122l.loadAd;
                            c14517l.f28406l = map;
                            if (!map.isEmpty()) {
                                C17963l c17963l = new C17963l();
                                c17963l.putAll(map);
                                c17963l.putAll(mapCrashlytics);
                                mapCrashlytics = c17963l.crashlytics();
                            }
                            c14517l.f28416l = mapCrashlytics;
                            list.remove(size);
                            int i17 = 0;
                            while (i17 < size) {
                                if (((InterfaceC12641l) list.get(i17)) instanceof C4122l) {
                                    list.remove(i17);
                                    size--;
                                } else {
                                    i17++;
                                }
                            }
                            c14517l.inmobi();
                        } else if (interfaceC12641l4 instanceof AbstractC0054l) {
                            c14517l.f28405l = AbstractC16901l.m4245throws(AbstractC16901l.m4232new(null, c14517l.f28410l));
                            list.remove(size);
                            int i18 = 0;
                            while (i18 < size) {
                                if (((InterfaceC12641l) list.get(i18)) instanceof AbstractC0054l) {
                                    list.remove(i18);
                                    size--;
                                } else {
                                    i18++;
                                }
                            }
                            c14517l.inmobi();
                        } else {
                            if (!(interfaceC12641l4 instanceof C12253l)) {
                                C18725l.billing();
                                return null;
                            }
                            c14517l.adcel(list, size, true);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 6:
                InterfaceC18035l interfaceC18035l = (InterfaceC18035l) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C16387l c16387l = (C16387l) obj3;
                c16387l.getClass();
                z = !interfaceC18035l.firebase(iIntValue3) && interfaceC18035l.isPro(iIntValue3).crashlytics();
                c16387l.loadAd = z;
                return Boolean.valueOf(z);
            case 7:
                int iIntValue4 = ((Number) obj).intValue();
                int iIntValue5 = ((Number) obj2).intValue();
                C7583l c7583l = (C7583l) obj3;
                C13698l c13698l = c7583l.purchase;
                int[] iArr = new int[iIntValue5];
                if (((C16122l) c7583l.amazon.getValue()).isPro.inmobi(iIntValue4)) {
                    AbstractC8669l.m2411package(iIntValue4, 0, 6, iArr);
                } else {
                    c13698l.Signature(iIntValue4 + iIntValue5);
                    int iInmobi = c13698l.inmobi(iIntValue4);
                    if (iInmobi != -2 && iInmobi != -1) {
                        if (iInmobi < 0) {
                            AbstractC14825l.yandex("Expected positive lane number, got " + iInmobi + " instead.");
                        }
                        iMin = Math.min(iInmobi, iIntValue5);
                    }
                    int iPro = iIntValue4;
                    for (int i19 = iMin - 1; -1 < i19; i19--) {
                        iPro = c13698l.pro(iPro, i19);
                        iArr[i19] = iPro;
                        if (iPro == -1) {
                            AbstractC8669l.m2411package(-1, i19, 2, iArr);
                            iArr[iMin] = iIntValue4;
                            for (i3 = iMin + 1; i3 < iIntValue5; i3++) {
                                iIntValue4++;
                                length = c13698l.f26744l + ((int[]) c13698l.f26743l).length;
                                while (true) {
                                    if (iIntValue4 < length) {
                                        iIntValue4 = c13698l.f26744l + ((int[]) c13698l.f26743l).length;
                                    }
                                    if (c13698l.remoteconfig(iIntValue4, i3)) {
                                    }
                                    iIntValue4++;
                                    break;
                                    break;
                                }
                                iArr[i3] = iIntValue4;
                            }
                        }
                    }
                    iArr[iMin] = iIntValue4;
                    while (i3 < iIntValue5) {
                        iIntValue4++;
                        length = c13698l.f26744l + ((int[]) c13698l.f26743l).length;
                        while (true) {
                            if (iIntValue4 < length) {
                                iIntValue4 = c13698l.f26744l + ((int[]) c13698l.f26743l).length;
                            }
                            if (c13698l.remoteconfig(iIntValue4, i3)) {
                            }
                            iIntValue4++;
                            break;
                            break;
                        }
                        iArr[i3] = iIntValue4;
                    }
                }
                return iArr;
            case 8:
                String str = (String) obj;
                String str2 = (String) obj2;
                ((C15285l) obj3).getClass();
                AppActivity appActivity = C8183l.loadAd;
                if (appActivity != null) {
                    appActivity.license(new C6038l(Integer.parseInt(str2), Long.parseLong(str)));
                }
                return Unit.INSTANCE;
            case 9:
                return ((Function1) obj3).invoke((C3259l) obj);
            case 10:
                Context context = (Context) obj;
                ((C17064l) obj3).getClass();
                try {
                    context.startActivity(new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse("package:" + context.getPackageName())));
                    break;
                } catch (Exception unused) {
                    context.startActivity(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"));
                }
                return Unit.INSTANCE;
            case 11:
                ((C2059l) obj3).getClass();
                ((Context) obj).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/vkxfaq")));
                return Unit.INSTANCE;
            case 12:
                InterfaceC17842l interfaceC17842l = (InterfaceC17842l) obj2;
                C8585l c8585l = (C8585l) obj3;
                C3151l c3151l = c8585l.crashlytics;
                C3151l c3151l2 = c8585l.loadAd;
                int iOrdinal = ((EnumC9157l) obj).ordinal();
                if (iOrdinal == 0) {
                    return new C0740l(interfaceC17842l, iMin);
                }
                if (iOrdinal == 1) {
                    return new C17723l(new C1712l(i5), c3151l2, c3151l, interfaceC17842l);
                }
                if (iOrdinal == 2) {
                    return new C17723l(new C1712l(16), c3151l2, c3151l, interfaceC17842l);
                }
                if (iOrdinal == 3) {
                    return new C7324l(interfaceC17842l);
                }
                if (iOrdinal == 4) {
                    return new C0740l(interfaceC17842l, z ? 1 : 0);
                }
                C18725l.billing();
                return null;
            case 13:
                AbstractC18041l abstractC18041l = (AbstractC18041l) obj;
                AbstractC18041l abstractC18041l2 = (AbstractC18041l) obj2;
                ((C13030l) obj3).getClass();
                InterfaceC11175l.loadAd.getClass();
                C5215l c5215l = C11900l.loadAd;
                return Boolean.valueOf(c5215l.loadAd(abstractC18041l, abstractC18041l2) && !c5215l.loadAd(abstractC18041l2, abstractC18041l));
            case 14:
                return Boolean.valueOf(((C5215l) obj3).yandex((AbstractC18041l) obj, (AbstractC18041l) obj2));
            case 15:
                InterfaceC13160l interfaceC13160l = (InterfaceC13160l) obj;
                InterfaceC17842l interfaceC17842l2 = (InterfaceC17842l) obj2;
                C10610l c10610l = (C10610l) obj3;
                C17928l c17928l = c10610l.purchase;
                if (interfaceC13160l.equals(C6564l.INSTANCE)) {
                    int i20 = 0;
                    int i21 = 0;
                    return new C0281l(new C5803l(interfaceC17842l2, new C3151l(1, c10610l, C10610l.class, "onAudioClicked", "onAudioClicked(Lbruhcollective/itaysonlab/vkx/decompose/components/pick_audios/PickAudiosEntry$AudioTrack;)V", i21, i20, 14), new C5834l(0, c10610l, C10610l.class, "onPlaylistLinkClicked", "onPlaylistLinkClicked()V", i21, i20, 11), c10610l.crashlytics));
                }
                if (interfaceC13160l.equals(C5452l.INSTANCE)) {
                    return new C4284l(new C0324l(interfaceC17842l2, false, new C15231l(4, c10610l, C10610l.class, "onPlaylistClicked", "onPlaylistClicked(IJLjava/lang/String;Ljava/lang/String;)V", 0, 0), new C10239l(0, c17928l, AbstractC6873l.class, "pop", "pop(Lcom/arkivanov/decompose/router/stack/StackNavigator;Lkotlin/jvm/functions/Function1;)V", 1, 5)));
                }
                if (interfaceC13160l instanceof C7671l) {
                    C7671l c7671l = (C7671l) interfaceC13160l;
                    return new C6324l(new C13242l(c7671l.crashlytics, c7671l.yandex, c7671l.loadAd, interfaceC17842l2, new C3151l(1, c10610l, C10610l.class, "onAudioClicked", "onAudioClicked(Lbruhcollective/itaysonlab/vkx/decompose/components/pick_audios/PickAudiosEntry$AudioTrack;)V", 0, 0, 15), new C10239l(0, c17928l, AbstractC6873l.class, "pop", "pop(Lcom/arkivanov/decompose/router/stack/StackNavigator;Lkotlin/jvm/functions/Function1;)V", 1, 4)));
                }
                C18725l.billing();
                return null;
            default:
                InterfaceC0564l interfaceC0564l = (InterfaceC0564l) obj;
                InterfaceC17842l interfaceC17842l3 = (InterfaceC17842l) obj2;
                C3095l c3095l = (C3095l) obj3;
                c3095l.getClass();
                if (interfaceC0564l.equals(C8505l.INSTANCE)) {
                    return new C0956l(new C0783l(29, c3095l), new C7424l(c3095l, i9), interfaceC17842l3);
                }
                if (interfaceC0564l.equals(C15990l.INSTANCE)) {
                    return new C6003l(new C7424l(c3095l, i8), new C7424l(c3095l, i7), interfaceC17842l3);
                }
                if (interfaceC0564l.equals(C14369l.INSTANCE)) {
                    return new C13550l(interfaceC17842l3, c3095l.crashlytics, new C7424l(c3095l, 5));
                }
                if (interfaceC0564l.equals(C1598l.INSTANCE)) {
                    return new C0776l(new C10239l(0, c3095l.amazon, AbstractC6873l.class, "pop", "pop(Lcom/arkivanov/decompose/router/stack/StackNavigator;Lkotlin/jvm/functions/Function1;)V", 1, 6), interfaceC17842l3);
                }
                if (interfaceC0564l.equals(C18130l.INSTANCE)) {
                    return new C7324l(new C7424l(c3095l, i6), interfaceC17842l3);
                }
                if (interfaceC0564l.equals(C4526l.INSTANCE)) {
                    return new C0740l(interfaceC17842l3, i9);
                }
                if (interfaceC0564l.equals(C17720l.INSTANCE)) {
                    int i22 = 0;
                    int i23 = 1;
                    int i24 = 0;
                    return new C8585l(interfaceC17842l3, new C3151l(i23, c3095l, C3095l.class, "onPlaylistOpen", "onPlaylistOpen(Lua/itaysonlab/vkxtv/components/playlist/TvPlaylistComponent$PlaylistScreenArgs;)V", i24, i22, 20), new C3151l(i23, c3095l, C3095l.class, "onCatalogSectionOpen", "onCatalogSectionOpen(Ljava/lang/String;)V", i24, i22, 21));
                }
                if (interfaceC0564l instanceof C18046l) {
                    int i25 = 0;
                    int i26 = 1;
                    int i27 = 0;
                    return new C17723l(new C13932l(11, interfaceC0564l), new C3151l(i26, c3095l, C3095l.class, "onPlaylistOpen", "onPlaylistOpen(Lua/itaysonlab/vkxtv/components/playlist/TvPlaylistComponent$PlaylistScreenArgs;)V", i27, i25, 18), new C3151l(i26, c3095l, C3095l.class, "onCatalogSectionOpen", "onCatalogSectionOpen(Ljava/lang/String;)V", i27, i25, 19), interfaceC17842l3);
                }
                if (interfaceC0564l instanceof C5017l) {
                    return new C7324l(((C5017l) interfaceC0564l).yandex, interfaceC17842l3);
                }
                C18725l.billing();
                return null;
        }
    }
}
