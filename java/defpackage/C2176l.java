package defpackage;

import android.content.SharedPreferences;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lٕؓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2176l extends C1538l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4816l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2176l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f4816l = i4;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0278 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x027a A[LOOP:1: B:81:0x0231->B:93:0x027a, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [lًَٓ] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC1507l interfaceC1507l;
        int i = 3;
        int i2 = 2;
        int i3 = 0;
        ?? r5 = 0;
        ?? r6 = 0;
        ?? r7 = 0;
        switch (this.f4816l) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0483l c0483l = (C0483l) this.f26698l;
                c0483l.getClass();
                c0483l.loadAd.setValue(zBooleanValue ? EnumC6302l.f13254l : EnumC6302l.f13255l);
                return Unit.INSTANCE;
            case 1:
                ((Boolean) obj).getClass();
                C9879l c9879l = (C9879l) this.f26698l;
                c9879l.getClass();
                new C14472l(new C10056l(), 6).Signature(c9879l.yandex);
                return Unit.INSTANCE;
            case 2:
                ((Boolean) obj).getClass();
                C9879l c9879l2 = (C9879l) this.f26698l;
                c9879l2.getClass();
                String str = c9879l2.firebase().firebase;
                if (str == null) {
                    str = "common";
                }
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                InterfaceC17817l interfaceC17817l = c16076l.f31521l.amazon;
                C3086l c3086l = interfaceC17817l instanceof C3086l ? (C3086l) interfaceC17817l : null;
                r7 = c3086l != null ? c3086l.crashlytics : 0;
                if (r7 == 0) {
                    r7 = C14054l.f27396l;
                }
                new C17517l(str, r7).Signature(c9879l2.yandex);
                return Unit.INSTANCE;
            case 3:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C0483l c0483l2 = (C0483l) this.f26698l;
                c0483l2.getClass();
                c0483l2.loadAd.setValue(zBooleanValue2 ? EnumC6302l.f13253l : EnumC6302l.f13255l);
                return Unit.INSTANCE;
            case 4:
                ((Boolean) obj).booleanValue();
                C9879l c9879l3 = (C9879l) this.f26698l;
                c9879l3.remoteconfig(c9879l3.isPro());
                return Unit.INSTANCE;
            case 5:
                int iIntValue = ((Number) obj).intValue();
                ((C9879l) this.f26698l).getClass();
                C16076l c16076l2 = VKXApplication.f36632l;
                if (c16076l2 == null) {
                    c16076l2 = null;
                }
                if (c16076l2.f31521l.admob(Integer.valueOf(iIntValue)) != null) {
                    c16076l2.subs(new C15127l(iIntValue, r7, i2, r5 == true ? 1 : 0));
                }
                return Unit.INSTANCE;
            case 6:
                int iIntValue2 = ((Number) obj).intValue();
                C12362l c12362l = (C12362l) this.f26698l;
                c12362l.billing.subs(iIntValue2);
                C16076l c16076l3 = VKXApplication.f36632l;
                if (c16076l3 == null) {
                    c16076l3 = null;
                }
                long jYandex = ((InterfaceC9265l) c12362l.loadAd.get(iIntValue2)).yandex();
                c16076l3.getClass();
                C16076l c16076l4 = VKXApplication.f36632l;
                (c16076l4 != null ? c16076l4 : null).smaato();
                return Unit.INSTANCE;
            case 7:
                C10507l c10507l = (C10507l) obj;
                ((C9879l) this.f26698l).getClass();
                C16076l c16076l5 = VKXApplication.f36632l;
                if (c16076l5 == null) {
                    c16076l5 = null;
                }
                c16076l5.getClass();
                AbstractC10999l.mopub(c16076l5, AbstractC11463l.yandex, 0, new C5888l(c16076l5, c10507l, r7, 25), 2);
                return Unit.INSTANCE;
            case 8:
                ((C9879l) this.f26698l).remoteconfig((C10507l) obj);
                return Unit.INSTANCE;
            case 9:
                ((C9879l) this.f26698l).getClass();
                C9879l.smaato((C10507l) obj);
                return Unit.INSTANCE;
            case 10:
                int iIntValue3 = ((Number) obj).intValue();
                ((C9879l) this.f26698l).getClass();
                C9879l.startapp(iIntValue3);
                return Unit.INSTANCE;
            case 11:
                int iIntValue4 = ((Number) obj).intValue();
                ((C9879l) this.f26698l).getClass();
                C9879l.startapp(iIntValue4);
                return Unit.INSTANCE;
            case 12:
                int iIntValue5 = ((Number) obj).intValue();
                ((C9879l) this.f26698l).getClass();
                C16076l c16076l6 = VKXApplication.f36632l;
                if (c16076l6 == null) {
                    c16076l6 = null;
                }
                if (c16076l6.f31521l.admob(Integer.valueOf(iIntValue5)) != null) {
                    c16076l6.subs(new C15127l(iIntValue5, r7, i2, r6 == true ? 1 : 0));
                }
                return Unit.INSTANCE;
            case 13:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                AbstractC14569l abstractC14569l = (AbstractC14569l) this.f26698l;
                C18730l c18730l = abstractC14569l.f28521l;
                if (zBooleanValue3) {
                    abstractC14569l.m3868l();
                } else {
                    if (abstractC14569l.f28520l != null) {
                        Object[] objArr = c18730l.crashlytics;
                        long[] jArr = c18730l.yandex;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j) < 128) {
                                            AbstractC10999l.mopub(abstractC14569l.m3914l(), null, 0, new C18030l(abstractC14569l, (C12951l) objArr[(i4 << 3) + i7], r7, i3), 3);
                                        }
                                        j >>= i5;
                                        i7++;
                                        i5 = i5;
                                    }
                                    if (i6 == i5) {
                                        if (i4 != length) {
                                            i4++;
                                        }
                                    }
                                } else if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                        C12951l c12951l = abstractC14569l.f28512l;
                        if (c12951l != null) {
                            AbstractC10999l.mopub(abstractC14569l.m3914l(), null, 0, new C18030l(abstractC14569l, c12951l, r7, 1), 3);
                        }
                    }
                    c18730l.yandex();
                    abstractC14569l.f28512l = null;
                    abstractC14569l.mo1982l();
                }
                return Unit.INSTANCE;
            case 14:
                ((C0324l) this.f26698l).admob.subscription((String) obj);
                return Unit.INSTANCE;
            case 15:
                return Boolean.valueOf(((C13660l) this.f26698l).crashlytics((String) obj));
            case 16:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue4 = bool.booleanValue();
                AppActivity appActivity = (AppActivity) this.f26698l;
                appActivity.getClass();
                SharedPreferences sharedPreferences = AbstractC3630l.yandex;
                EnumC14530l enumC14530l = EnumC14530l.f28446l;
                AbstractC3630l.yandex.edit().putBoolean("LEGACY_DOCK", zBooleanValue4).apply();
                AbstractC3630l.loadAd.put(enumC14530l, bool);
                ((NextDockView) appActivity.f36640l.f15742l).setLegacyMode(zBooleanValue4);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((InterfaceC8639l) this.f26698l).billing((InterfaceC14029l) obj);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C11864l) this.f26698l).yandex((InterfaceC14029l) obj);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C11864l) this.f26698l).yandex((InterfaceC14029l) obj);
            case 20:
                ((C9430l) this.f26698l).f19281l.smaato((String) obj);
                return Unit.INSTANCE;
            case 21:
                ((C9430l) this.f26698l).f19281l.smaato((String) obj);
                return Unit.INSTANCE;
            case 22:
                return ((AbstractC5921l) this.f26698l).mo694private((C14025l) obj);
            case 23:
                InterfaceC2456l interfaceC2456l = (InterfaceC2456l) obj;
                C10885l c10885l = (C10885l) this.f26698l;
                c10885l.getClass();
                C8688l c8688l = AbstractC16635l.yandex;
                C4116l c4116l = C4116l.crashlytics;
                if (C4116l.crashlytics.yandex) {
                    C8688l c8688l2 = AbstractC16635l.yandex;
                    if (((Long) c8688l2.getValue()) != null) {
                        long id = Thread.currentThread().getId();
                        Long l = (Long) c8688l2.getValue();
                        if (l == null || id != l.longValue()) {
                            Function1 function1 = C4116l.crashlytics.loadAd;
                            String name = Thread.currentThread().getName();
                            if (name == null) {
                                name = "unknown";
                            }
                            function1.invoke(new C10756l("Expected to be called on the main thread, but was ".concat(name), 9));
                        }
                    }
                }
                if (interfaceC2456l instanceof C10529l) {
                    C14169l c14169l = c10885l.loadAd;
                    if (c14169l != null) {
                        Object obj2 = ((C10529l) interfaceC2456l).yandex;
                        C0554l c0554l = (C0554l) c14169l.yandex;
                        InterfaceC1507l interfaceC1507l2 = (InterfaceC1507l) c0554l.f1957l;
                        InterfaceC1507l interfaceC1507l3 = (InterfaceC1507l) ((Function2) c14169l.crashlytics).invoke(interfaceC1507l2, obj2);
                        c0554l.m639static(interfaceC1507l3.getChildren());
                        c0554l.f1957l = interfaceC1507l3;
                        c14169l.yandex(interfaceC1507l3, interfaceC1507l2);
                        ((Function3) c14169l.purchase).invoke(obj2, interfaceC1507l3, interfaceC1507l2);
                    } else {
                        c10885l.yandex.add(((C10529l) interfaceC2456l).yandex);
                    }
                } else if (interfaceC2456l instanceof C8879l) {
                    C14169l c14169l2 = c10885l.loadAd;
                    if (c14169l2 != null) {
                        C0554l c0554l2 = (C0554l) c14169l2.yandex;
                        Function0 function0 = (Function0) c14169l2.admob;
                        if (function0 != null && (interfaceC1507l = (InterfaceC1507l) function0.invoke()) != null) {
                            InterfaceC1507l interfaceC1507l4 = (InterfaceC1507l) c0554l2.f1957l;
                            c0554l2.m639static(interfaceC1507l.getChildren());
                            c0554l2.f1957l = interfaceC1507l;
                            c14169l2.yandex(interfaceC1507l, interfaceC1507l4);
                        }
                    }
                } else {
                    if (!(interfaceC2456l instanceof C4794l)) {
                        C18725l.billing();
                        return null;
                    }
                    C14169l c14169l3 = ((C4794l) interfaceC2456l).yandex;
                    c10885l.loadAd = c14169l3;
                    for (Object obj3 : c10885l.yandex) {
                        C0554l c0554l3 = (C0554l) c14169l3.yandex;
                        InterfaceC1507l interfaceC1507l5 = (InterfaceC1507l) c0554l3.f1957l;
                        InterfaceC1507l interfaceC1507l6 = (InterfaceC1507l) ((Function2) c14169l3.crashlytics).invoke(interfaceC1507l5, obj3);
                        c0554l3.m639static(interfaceC1507l6.getChildren());
                        c0554l3.f1957l = interfaceC1507l6;
                        c14169l3.yandex(interfaceC1507l6, interfaceC1507l5);
                        ((Function3) c14169l3.purchase).invoke(obj3, interfaceC1507l6, interfaceC1507l5);
                    }
                    c10885l.yandex.clear();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C6167l) this.f26698l).firebase((C0187l) obj);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C6167l) this.f26698l).firebase((C0187l) obj);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C6167l) this.f26698l).firebase((C0187l) obj);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C6167l) this.f26698l).firebase((C0187l) obj);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C6167l) this.f26698l).firebase((C0187l) obj);
            default:
                return ((C6167l) this.f26698l).firebase((C0187l) obj);
        }
    }
}
