package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Base64;
import android.widget.PopupWindow;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.catalogkit.objects.Catalog2ReplacementOption;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lِۦؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12242l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f24295l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f24296l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24297l;

    public /* synthetic */ C12242l(Object obj, Object obj2, int i) {
        this.f24297l = i;
        this.f24296l = obj;
        this.f24295l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0485  */
    /* JADX WARN: Code duplicated, block: B:187:0x04a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [lؔ۠ٝ] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C7695l c7695lM2834volatile;
        ?? r9;
        List listM4232new;
        C5296l c5296lMopub;
        long jYandex;
        String[] strArrNames;
        int i = 22;
        ?? c2954l = 0;
        c0374lArr = null;
        C0374l[] c0374lArr = null;
        switch (this.f24297l) {
            case 0:
                ((Function1) this.f24296l).invoke(((C10731l) this.f24295l).amazon);
                return Unit.INSTANCE;
            case 1:
                ((Function1) this.f24296l).invoke(((C13966l) this.f24295l).amazon);
                return Unit.INSTANCE;
            case 2:
                return new C8119l((C14378l) ((Function0) this.f24296l).invoke(), (Function2) this.f24295l);
            case 3:
                Function1 function1 = (Function1) this.f24296l;
                C0554l c0554l = (C0554l) this.f24295l;
                C7695l c7695l = (C7695l) function1.invoke((InterfaceC1507l) c0554l.f1957l);
                if (c7695l == null) {
                    return null;
                }
                ArrayList<InterfaceC7901l> arrayList = ((C13366l) c0554l.f1956l).yandex;
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(arrayList, 10));
                for (InterfaceC7901l interfaceC7901l : arrayList) {
                    String key = interfaceC7901l.getKey();
                    if (interfaceC7901l instanceof C3217l) {
                        c7695lM2834volatile = ((C3217l) interfaceC7901l).purchase.m2834volatile();
                    } else {
                        if (!(interfaceC7901l instanceof C8126l)) {
                            C18725l.billing();
                            return null;
                        }
                        c7695lM2834volatile = ((C8126l) interfaceC7901l).crashlytics;
                    }
                    arrayList2.add(new C2755l(key, c7695lM2834volatile));
                }
                return new C8091l(c7695l, arrayList2);
            case 4:
                ((C14843l) this.f24296l).purchase.invoke((C4456l) this.f24295l);
                return Unit.INSTANCE;
            case 5:
                return Collections.singletonList(new C8195l((InterfaceC0914l) this.f24296l, (InterfaceC1388l) this.f24295l));
            case 6:
                Function0 function0 = (Function0) this.f24296l;
                C18449l c18449l = (C18449l) this.f24295l;
                function0.invoke();
                PopupWindow popupWindow = (PopupWindow) c18449l.f36012l;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                return Unit.INSTANCE;
            case 7:
                C13154l c13154l = (C13154l) this.f24296l;
                Object obj = this.f24295l;
                C6956l c6956l = c13154l.f25750l;
                C2859l c2859l = c6956l.crashlytics;
                C5296l c5296lMopub2 = c2859l.mopub();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < c2859l.f6220l) {
                            if (c5296lMopub2.smaato(i2)) {
                                Object objVip = c5296lMopub2.vip(i2);
                                if (objVip != obj) {
                                    InterfaceC17142l interfaceC17142l = objVip instanceof InterfaceC17142l ? (InterfaceC17142l) objVip : null;
                                    if ((interfaceC17142l != null ? ((C6031l) interfaceC17142l).yandex : null) == obj) {
                                    }
                                }
                                C2954l c2954l2 = new C2954l(i2, null);
                                c5296lMopub2.crashlytics();
                                r9 = c2954l2;
                                if (r9 != 0) {
                                    int i3 = r9.yandex;
                                    Integer num = r9.loadAd;
                                    c5296lMopub = c2859l.mopub();
                                    try {
                                        ArrayList arrayListSubs = AbstractC15096l.subs(c5296lMopub, i3, num);
                                        c5296lMopub.crashlytics();
                                        listM4232new = AbstractC16901l.m4232new(arrayListSubs, c6956l.appmetrica());
                                    } catch (Throwable th) {
                                        c5296lMopub.crashlytics();
                                        throw th;
                                    }
                                } else {
                                    listM4232new = C2580l.f5619l;
                                }
                                return new C10097l(listM4232new, c6956l.applovin);
                            }
                            int[] iArr = c5296lMopub2.loadAd;
                            int i4 = i2 + 1;
                            int iLoadAd = (i4 < c5296lMopub2.crashlytics ? iArr[(i4 * 5) + 4] : c5296lMopub2.purchase) - AbstractC0736l.loadAd(iArr, i2);
                            int i5 = 0;
                            while (true) {
                                if (i5 >= iLoadAd) {
                                    i2 = i4;
                                } else {
                                    Object objAdmob = c5296lMopub2.admob(i2, i5);
                                    if (objAdmob != obj) {
                                        InterfaceC17142l interfaceC17142l2 = objAdmob instanceof InterfaceC17142l ? (InterfaceC17142l) objAdmob : null;
                                        if ((interfaceC17142l2 != null ? ((C6031l) interfaceC17142l2).yandex : null) != obj) {
                                            i5++;
                                        }
                                    }
                                    c2954l = new C2954l(i2, Integer.valueOf(i5));
                                }
                            }
                        } else {
                            Unit unit = Unit.INSTANCE;
                        }
                        c5296lMopub2.crashlytics();
                        r9 = c2954l;
                        if (r9 != 0) {
                            int i6 = r9.yandex;
                            Integer num2 = r9.loadAd;
                            c5296lMopub = c2859l.mopub();
                            ArrayList arrayListSubs2 = AbstractC15096l.subs(c5296lMopub, i6, num2);
                            c5296lMopub.crashlytics();
                            listM4232new = AbstractC16901l.m4232new(arrayListSubs2, c6956l.appmetrica());
                        } else {
                            listM4232new = C2580l.f5619l;
                        }
                        return new C10097l(listM4232new, c6956l.applovin);
                    } catch (Throwable th2) {
                        c5296lMopub2.crashlytics();
                        throw th2;
                    }
                }
            case 8:
                C10655l c10655l = (C10655l) this.f24296l;
                C16179l c16179l = (C16179l) this.f24295l;
                c10655l.purchase();
                c16179l.crashlytics.invoke((AppActivity) c10655l.f5081l);
                return Unit.INSTANCE;
            case 9:
                AbstractC10999l.mopub((InterfaceC2262l) this.f24296l, null, 0, new C11039l((C13765l) this.f24295l, c2954l, 18), 3);
                return Unit.INSTANCE;
            case 10:
                C18673l c18673l = (C18673l) this.f24296l;
                Context context = (Context) this.f24295l;
                String str = C14025l.f27330l;
                return C6162l.adcel(AbstractC2632l.amazon(context, c18673l.yandex).getAbsolutePath(), false);
            case 11:
                AbstractC10999l.mopub((InterfaceC2262l) this.f24296l, null, 0, new C11039l((C1050l) this.f24295l, c2954l, 20), 3);
                return Unit.INSTANCE;
            case 12:
                return new C5177l(AbstractC3383l.isPro(((InterfaceC15209l) this.f24296l).smaato((InterfaceC18212l) ((Function0) this.f24295l).invoke())));
            case 13:
                ((C5249l) this.f24296l).amazon.invoke((InterfaceC5912l) this.f24295l);
                return Unit.INSTANCE;
            case 14:
                C11562l c11562l = (C11562l) this.f24296l;
                String string = ((C10178l) this.f24295l).loadAd().f12057l.toString();
                c11562l.f23237l.setValue("");
                c11562l.f23236l.setValue(Boolean.TRUE);
                AbstractC10999l.mopub(AbstractC11990l.firebase(c11562l), null, 0, new C18731l(string, c11562l, c2954l, i), 3);
                return Unit.INSTANCE;
            case 15:
                C5301l c5301l = (C5301l) this.f24296l;
                String str2 = (String) this.f24295l;
                C4955l c4955l = (C4955l) c5301l.crashlytics;
                if (c4955l == null) {
                    Enum[] enumArr = (Enum[]) c5301l.loadAd;
                    c4955l = new C4955l(str2, enumArr.length);
                    for (Enum r0 : enumArr) {
                        c4955l.smaato(r0.name(), false);
                    }
                }
                return c4955l;
            case 16:
                ((HashMap) ((C10023l) this.f24296l).f20418l).remove((InterfaceC11947l) this.f24295l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C10700l) this.f24296l).f21708l = AbstractC13402l.loadAd((C12044l) this.f24295l, AbstractC1629l.yandex);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C2979l) this.f24296l).f6486l.m2719const(((Catalog2ReplacementOption) this.f24295l).yandex);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C0936l c0936l = (C0936l) this.f24296l;
                AbstractC10999l.mopub(AbstractC11990l.firebase(c0936l), null, 0, new C16083l((EnumC3503l) ((InterfaceC8714l) this.f24295l).getValue(), c0936l, null), 3);
                return Unit.INSTANCE;
            case 20:
                C8050l c8050l = (C8050l) this.f24296l;
                C0374l c0374l = (C0374l) this.f24295l;
                try {
                    c8050l.f16763l.loadAd(c0374l);
                    break;
                } catch (IOException e) {
                    AbstractC16844l abstractC16844l = AbstractC16844l.yandex;
                    AbstractC16844l.yandex.subs(4, "Http2Connection.Listener failure for " + c8050l.f16755l, e);
                    try {
                        c0374l.crashlytics(2, e);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return Unit.INSTANCE;
            case 21:
                C0340l c0340l = (C0340l) this.f24296l;
                C8463l c8463l = (C8463l) this.f24295l;
                C10700l c10700l = new C10700l();
                C8050l c8050l2 = (C8050l) c0340l.f1392l;
                synchronized (c8050l2.f16777l) {
                    synchronized (c8050l2) {
                        try {
                            C8463l c8463l2 = c8050l2.f16776l;
                            C8463l c8463l3 = new C8463l();
                            for (int i7 = 0; i7 < 10; i7++) {
                                if (((1 << i7) & c8463l2.yandex) != 0) {
                                    c8463l3.loadAd(i7, c8463l2.loadAd[i7]);
                                }
                            }
                            for (int i8 = 0; i8 < 10; i8++) {
                                if (((1 << i8) & c8463l.yandex) != 0) {
                                    c8463l3.loadAd(i8, c8463l.loadAd[i8]);
                                }
                            }
                            c10700l.f21708l = c8463l3;
                            jYandex = ((long) c8463l3.yandex()) - ((long) c8463l2.yandex());
                            if (jYandex != 0 && !c8050l2.f16762l.isEmpty()) {
                                c0374lArr = (C0374l[]) c8050l2.f16762l.values().toArray(new C0374l[0]);
                            }
                            c8050l2.f16776l = (C8463l) c10700l.f21708l;
                            C7522l.crashlytics(c8050l2.f16767l, c8050l2.f16755l + " onSettings", 0L, new C12242l(c8050l2, c10700l, i), 6);
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    try {
                        c8050l2.f16777l.yandex((C8463l) c10700l.f21708l);
                    } catch (IOException e2) {
                        c8050l2.yandex(2, 2, e2);
                    }
                    Unit unit3 = Unit.INSTANCE;
                    break;
                }
                if (c0374lArr != null) {
                    for (C0374l c0374l2 : c0374lArr) {
                        synchronized (c0374l2) {
                            c0374l2.f1456l += jYandex;
                            if (jYandex > 0) {
                                c0374l2.notifyAll();
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 22:
                ((C8050l) this.f24296l).f16763l.yandex((C8463l) ((C10700l) this.f24295l).f21708l);
                return Unit.INSTANCE;
            case 23:
                AbstractC10999l.mopub((InterfaceC2262l) this.f24296l, null, 0, new C8912l((C1474l) this.f24295l, c2954l, 8), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C17984l c17984l = (C17984l) this.f24296l;
                ((InterfaceC8714l) this.f24295l).setValue(Boolean.FALSE);
                C6782l.yandex.getClass();
                SharedPreferences sharedPreferences = AbstractC3957l.amazon;
                SharedPreferences.Editor editorEdit = (sharedPreferences != null ? sharedPreferences : null).edit();
                editorEdit.putBoolean("misc_donatepopup", true);
                editorEdit.apply();
                c17984l.isVip().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(new String(Base64.decode(Base64.decode("YUhSMGNITTZMeTkwTG0xbEwzWnJlR05w", 2), 2), Charset.defaultCharset()))));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                InterfaceC18035l interfaceC18035l = (InterfaceC18035l) this.f24296l;
                AbstractC8237l abstractC8237l = (AbstractC8237l) this.f24295l;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C17752l c17752l = abstractC8237l.yandex;
                AbstractC3644l.amazon(abstractC8237l, interfaceC18035l);
                int iMopub = interfaceC18035l.mopub();
                for (int i9 = 0; i9 < iMopub; i9++) {
                    List listSubs = interfaceC18035l.subs(i9);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : listSubs) {
                        if (obj2 instanceof InterfaceC3816l) {
                            arrayList3.add(obj2);
                        }
                    }
                    InterfaceC3816l interfaceC3816l = (InterfaceC3816l) AbstractC16901l.m4236public(arrayList3);
                    if (interfaceC3816l != null && (strArrNames = interfaceC3816l.names()) != null) {
                        for (String str3 : strArrNames) {
                            String str4 = AbstractC8576l.yandex(interfaceC18035l.billing(), C2374l.amazon) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str3)) {
                                throw new C5114l(AbstractC2238l.crashlytics(-1, "The suggested name '" + str3 + "' for " + str4 + ' ' + interfaceC18035l.admob(i9) + " is already one of the names for " + str4 + ' ' + interfaceC18035l.admob(((Number) AbstractC8676l.smaato(str3, linkedHashMap)).intValue()) + " in " + interfaceC18035l, null, null, null));
                            }
                            linkedHashMap.put(str3, Integer.valueOf(i9));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? C14054l.f27396l : linkedHashMap;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C8610l c8610l = (C8610l) this.f24296l;
                C8232l c8232l = (C8232l) this.f24295l;
                C13964l c13964l = (C13964l) c8610l.getValue();
                return new C13994l(c8232l, c13964l, new C13698l((C8934l) c8232l.amazon.billing.getValue(), c13964l));
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C8610l c8610l2 = (C8610l) this.f24296l;
                AbstractC13264l abstractC13264l = (AbstractC13264l) this.f24295l;
                C1843l c1843l = (C1843l) c8610l2.getValue();
                return new C7212l(abstractC13264l, c1843l, new C13698l((C8934l) ((C0536l) abstractC13264l.amazon.f32507l).getValue(), c1843l));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C10641l((InterfaceC2449l) this.f24296l, C14054l.f27396l, (InterfaceC17865l) this.f24295l);
            default:
                C8610l c8610l3 = (C8610l) this.f24296l;
                C7583l c7583l = (C7583l) this.f24295l;
                C14543l c14543l = (C14543l) c8610l3.getValue();
                return new C11862l(c7583l, c14543l, new C13698l((C8934l) ((C0536l) c7583l.crashlytics.f15338l).getValue(), c14543l));
        }
    }
}
