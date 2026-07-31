package defpackage;

import android.graphics.Color;
import android.net.ConnectivityManager;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: finally, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Cfinally implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f825l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f826l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f827l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f828l;

    public /* synthetic */ Cfinally(Object obj, Object obj2, Object obj3, int i) {
        this.f827l = i;
        this.f826l = obj;
        this.f825l = obj2;
        this.f828l = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x039e A[PHI: r6
  0x039e: PHI (r6v14 lٌؙؕ) = (r6v12 lٌؙؕ), (r6v17 lٌؙؕ) binds: [B:121:0x038d, B:123:0x039b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        C3276l c3276l;
        boolean z;
        boolean zM1313l;
        Object c18435l;
        int i2 = this.f827l;
        int i3 = 0;
        InterfaceC14029l interfaceC14029l = null;
        Object obj = this.f828l;
        Object obj2 = this.f825l;
        Object obj3 = this.f826l;
        switch (i2) {
            case 0:
                C7659l c7659l = (C7659l) obj2;
                C18196l c18196l = (C18196l) obj;
                Object obj4 = ((C12823l) obj3).f25198l;
                if (AbstractC8576l.yandex((String) obj4, "chat")) {
                    new C16942l(false, 3).Signature(c7659l.isVip());
                } else {
                    c18196l.yandex((String) obj4);
                }
                return Unit.INSTANCE;
            case 1:
                CatalogArtist catalogArtist = (CatalogArtist) obj;
                InterfaceC1982l interfaceC1982l = (InterfaceC1982l) ((Function0) obj3).invoke();
                String str = ((Catalog2Button) obj2).amazon;
                if (str == null) {
                    return Unit.INSTANCE;
                }
                interfaceC1982l.Signature(new C7108l(str, catalogArtist.yandex), false);
                return Unit.INSTANCE;
            case 2:
                ((AbstractC7910l) obj3).yandex();
                C12633l c12633l = (C12633l) ((C11644l) obj2).f23361l;
                int i4 = ((C9987l) obj).f20387l;
                do {
                    i = c12633l.get();
                } while (!c12633l.compareAndSet(i, ((i >>> 27) & 15) == i4 ? i - 1 : i));
                return Unit.INSTANCE;
            case 3:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj2;
                C8954l c8954l = (C8954l) obj;
                if (((Boolean) ((C8954l) obj3).amazon.invoke(EnumC9129l.f18764l)).booleanValue()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C12328l(c8954l, interfaceC14029l, 4), 3);
                }
                return Boolean.TRUE;
            case 4:
                C8954l c8954l2 = (C8954l) obj3;
                c8954l2.admob = (InterfaceC17807l) obj2;
                c8954l2.subs = (InterfaceC17807l) obj;
                return Unit.INSTANCE;
            case 5:
                C1252l c1252l = (C1252l) obj3;
                C8896l c8896lM856l = C1252l.m856l(c1252l, (AbstractC18026l) obj2, (C4307l) obj);
                if (c8896lM856l == null) {
                    return null;
                }
                C3276l c3276l2 = c1252l.f3277l;
                if (C4999l.loadAd(c3276l2.f7003l, -1L)) {
                    AbstractC14825l.crashlytics("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return c8896lM856l.vip(c3276l2.m1314l(c8896lM856l, c3276l2.m1315l(), 0L) ^ (-9223372034707292160L));
            case 6:
                C9987l c9987l = (C9987l) obj2;
                int i5 = c9987l.f20387l + 1;
                c9987l.f20387l = i5;
                ((Function2) obj3).invoke(Integer.valueOf(i5), Integer.valueOf(((C9173l) obj).yandex.size()));
                return Unit.INSTANCE;
            case 7:
                return ((C14511l) obj3).loadAd.yandex(((C12919l) obj).admob.amazon, ((C13478l) obj2).yandex());
            case 8:
                C3276l c3276l3 = (C3276l) obj3;
                C2643l c2643l = (C2643l) obj2;
                InterfaceC14447l interfaceC14447l = (InterfaceC14447l) obj;
                C1770l c1770l = c3276l3.f7005l;
                while (true) {
                    C17893l c17893l = (C17893l) c1770l.f4179l;
                    int i6 = c17893l.f34846l;
                    if (i6 == 0) {
                        c3276l = c3276l3;
                    } else {
                        if (i6 == 0) {
                            C1759l.firebase("MutableVector is empty.");
                            return null;
                        }
                        C8896l c8896l = (C8896l) ((C8439l) c17893l.f34848l[i6 - 1]).yandex.invoke();
                        if (c8896l == null) {
                            c3276l = c3276l3;
                            zM1313l = true;
                        } else {
                            c3276l = c3276l3;
                            zM1313l = C3276l.m1313l(c3276l, c8896l, 0L, 0L, 3);
                        }
                        if (zM1313l) {
                            C17893l c17893l2 = (C17893l) c1770l.f4179l;
                            ((C8439l) c17893l2.vip(c17893l2.f34846l - 1)).loadAd.subs(Unit.INSTANCE);
                            c3276l3 = c3276l;
                        }
                    }
                }
                if (c3276l.f7004l) {
                    C8896l c8896l2 = (C8896l) c3276l.f7007l.invoke();
                    if (c8896l2 != null) {
                        C3276l c3276l4 = c3276l;
                        c3276l = c3276l4;
                        z = C3276l.m1313l(c3276l4, c8896l2, 0L, 0L, 3);
                    }
                    if (z) {
                        c3276l.f7004l = false;
                    }
                }
                c2643l.purchase = C3276l.m1312l(c3276l, interfaceC14447l, 0L);
                return Unit.INSTANCE;
            case 9:
                Function1 function1 = (Function1) obj3;
                ((InterfaceC8714l) obj2).setValue(Boolean.FALSE);
                Float fMetrica = AbstractC12673l.metrica(((C0639l) ((InterfaceC8714l) obj).getValue()).yandex.f7563l);
                if (fMetrica != null) {
                    function1.invoke(fMetrica);
                }
                return Unit.INSTANCE;
            case 10:
                InterfaceC8533l interfaceC8533l = (InterfaceC8533l) obj3;
                C16854l c16854l = (C16854l) obj2;
                C10178l c10178l = (C10178l) obj;
                if (interfaceC8533l != null) {
                    ((C4666l) interfaceC8533l).yandex();
                }
                String string = c10178l.loadAd().f12057l.toString();
                c16854l.m4203public(true);
                c16854l.m4202instanceof("");
                AbstractC10999l.mopub(AbstractC11990l.firebase(c16854l), null, 0, new C18731l(c16854l, string, interfaceC14029l, 19), 3);
                return Unit.INSTANCE;
            case 11:
                InterfaceC8533l interfaceC8533l2 = (InterfaceC8533l) obj3;
                C4560l c4560l = (C4560l) obj2;
                C10178l c10178l2 = (C10178l) obj;
                if (interfaceC8533l2 != null) {
                    ((C4666l) interfaceC8533l2).yandex();
                }
                String string2 = c10178l2.loadAd().f12057l.toString();
                c4560l.f9230l.setValue(Boolean.TRUE);
                c4560l.f9236l.setValue("");
                AbstractC10999l.mopub(AbstractC11990l.firebase(c4560l), null, 0, new C18731l(c4560l, string2, interfaceC14029l, 20), 3);
                return Unit.INSTANCE;
            case 12:
                InterfaceC8533l interfaceC8533l3 = (InterfaceC8533l) obj3;
                C0996l c0996l = (C0996l) obj2;
                C10178l c10178l3 = (C10178l) obj;
                if (interfaceC8533l3 != null) {
                    ((C4666l) interfaceC8533l3).yandex();
                }
                String string3 = c10178l3.loadAd().f12057l.toString();
                c0996l.f2743l.setValue(Boolean.TRUE);
                c0996l.f2742l.setValue("");
                AbstractC10999l.mopub(AbstractC11990l.firebase(c0996l), null, 0, new C18731l(c0996l, string3, interfaceC14029l, 21), 3);
                return Unit.INSTANCE;
            case 13:
                ((Function1) obj3).invoke(C11359l.yandex((C11359l) obj2, null, ((C0639l) ((InterfaceC8714l) obj).getValue()).yandex.f7563l, 29));
                return Unit.INSTANCE;
            case 14:
                C6956l c6956l = (C6956l) obj3;
                C9552l c9552l = (C9552l) obj2;
                C5296l c5296l = (C5296l) obj;
                C11275l c11275l = c6956l.f14597extends;
                C9552l c9552l2 = c11275l.loadAd;
                try {
                    c11275l.loadAd = c9552l;
                    C5296l c5296l2 = c6956l.f14600package;
                    int[] iArr = c6956l.metrica;
                    C16977l c16977l = c6956l.license;
                    c6956l.metrica = null;
                    c6956l.license = null;
                    try {
                        c6956l.f14600package = c5296l;
                        boolean z2 = c11275l.purchase;
                        try {
                            c11275l.purchase = false;
                            throw null;
                        } catch (Throwable th) {
                            c11275l.purchase = z2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        c6956l.f14600package = c5296l2;
                        c6956l.metrica = iArr;
                        c6956l.license = c16977l;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c11275l.loadAd = c9552l2;
                    throw th3;
                }
            case 15:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                C10447l c10447l = (C10447l) obj;
                if (((C9122l) obj3).f18750l) {
                    C14513l.tapsense().vip(AbstractC10076l.yandex, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(c10447l);
                }
                return Unit.INSTANCE;
            case 16:
                AbstractC16584l.loadAd().purchase(((C15050l) obj3).yandex);
                ((InterfaceC8714l) obj).setValue(null);
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C1843l((Function4) ((InterfaceC8714l) obj3).getValue(), (Function1) ((InterfaceC8714l) obj2).getValue(), ((Number) ((Function0) obj).invoke()).intValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C5866l c5866l = (C5866l) obj2;
                C1336l c1336l = (C1336l) ((C8610l) obj3).getValue();
                return new C17602l(c5866l, c1336l, (C7091l) obj, new C13698l((C8934l) c5866l.purchase.billing.getValue(), c1336l));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list = (List) obj2;
                C9735l[] c9735lArr = (C9735l[]) obj;
                for (Object obj5 : (List) obj3) {
                    int i7 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC14055l.subscription();
                        throw null;
                    }
                    c9735lArr[i3] = ((C5616l) obj5).amazon();
                    i3 = i7;
                }
                return list;
            case 20:
                C16385l c16385l = (C16385l) obj3;
                EnumC6863l enumC6863l = (EnumC6863l) obj2;
                c16385l.f32037l.setValue(enumC6863l);
                AbstractC0968l.crashlytics.loadAd(enumC6863l);
                c16385l.f32038l.setValue(Boolean.FALSE);
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 21:
                C16385l c16385l2 = (C16385l) obj3;
                EnumC9700l enumC9700l = (EnumC9700l) obj2;
                c16385l2.f32037l.setValue(enumC9700l);
                AbstractC0968l.yandex.loadAd(enumC9700l);
                c16385l2.f32038l.setValue(Boolean.FALSE);
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 22:
                C12317l c12317l = (C12317l) obj3;
                C13006l c13006l = (C13006l) obj2;
                InterfaceC3928l interfaceC3928l = (InterfaceC3928l) obj;
                if (c12317l != null) {
                    c13006l.yandex(c13006l.crashlytics(c12317l) - c13006l.tapsense);
                }
                List listYandex = AbstractC15096l.yandex(c13006l, null, c13006l.tapsense, null);
                C15253l c15253l = (C15253l) AbstractC16901l.m4212class(listYandex);
                Integer num = c15253l != null ? c15253l.loadAd : null;
                List listAdmob = interfaceC3928l.admob(num);
                if (num != null && !listAdmob.isEmpty()) {
                    listAdmob = AbstractC16901l.m4232new(Collections.singletonList(new C15253l(((C15253l) AbstractC16901l.m4231native(listAdmob)).yandex, null, num)), AbstractC16901l.m4233package(1, listAdmob));
                }
                return new C10097l(AbstractC16901l.m4232new(listYandex, listAdmob), interfaceC3928l.remoteconfig());
            case 23:
                ((Function1) obj3).invoke((C1682l) obj2);
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC10999l.mopub((InterfaceC2262l) obj3, null, 0, new C5888l((AbstractC13264l) obj2, (AbstractC13264l) obj, interfaceC14029l, 24), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC10999l.mopub((InterfaceC2262l) obj3, null, 0, new C7226l((C4261l) obj2, (InterfaceC12244l) obj, interfaceC14029l, 6), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C0130l c0130l = (C0130l) obj3;
                C9894l c9894l = (C9894l) obj2;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj;
                c0130l.purchase();
                VKXApplication vKXApplication = VKXApplication.f36631l;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                AbstractC10999l.mopub(vKXApplication, null, 0, new C10359l(c0130l, c9894l, interfaceC8714l, null), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C17310l c17310l = (C17310l) obj3;
                String str2 = (String) obj2;
                ((InterfaceC8714l) obj).setValue(Boolean.FALSE);
                c17310l.crashlytics.setValue(str2);
                c17310l.yandex.edit().putString("autocache", str2).apply();
                c17310l.loadAd.invoke(str2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                EnumC17214l enumC17214l = (EnumC17214l) obj3;
                C8994l.yandex.getClass();
                C8994l.isPro.loadAd(enumC17214l);
                ((C6111l) obj2).f12900l.smaato(enumC17214l);
                ((InterfaceC8714l) obj).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj3;
                InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) obj2;
                InterfaceC8714l interfaceC8714l4 = (InterfaceC8714l) obj;
                if (((Boolean) interfaceC8714l2.getValue()).booleanValue()) {
                    try {
                        C13645l c13645l = C12818l.purchase;
                        c18435l = AbstractC2133l.admob(AbstractC12953l.loadAd(Color.parseColor("#" + ((String) interfaceC8714l3.getValue()))));
                    } catch (Throwable th4) {
                        c18435l = new C18435l(th4);
                    }
                    if (!(c18435l instanceof C18435l)) {
                        interfaceC8714l4.setValue((C12818l) c18435l);
                    }
                    break;
                }
                interfaceC8714l2.setValue(Boolean.valueOf(!((Boolean) interfaceC8714l2.getValue()).booleanValue()));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Cfinally(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f827l = i;
        this.f826l = obj;
        this.f825l = obj2;
        this.f828l = obj3;
    }
}
