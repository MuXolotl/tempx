package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lَۚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10557l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21463l;

    public /* synthetic */ C10557l(int i) {
        this.f21463l = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C15012l c15012l;
        C9735l c9735l;
        C9735l c9735l2;
        int i = 0;
        switch (this.f21463l) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                while (i < size) {
                    Object obj2 = list.get(i);
                    arrayList.add((AbstractC8576l.yandex(obj2, Boolean.FALSE) || obj2 == null) ? null : (C9293l) ((Function1) AbstractC2896l.signatures.f26670l).invoke(obj2));
                    i++;
                }
                return new C10537l(arrayList);
            case 1:
                String str = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str);
                if (AbstractC8576l.yandex(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new C9293l(localeForLanguageTag);
            case 2:
                List list2 = (List) obj;
                Object obj3 = list2.get(0);
                String str2 = obj3 != null ? (String) obj3 : null;
                Object obj4 = list2.get(1);
                return new C7409l(str2, (AbstractC8576l.yandex(obj4, Boolean.FALSE) || obj4 == null) ? null : (C11244l) ((Function1) AbstractC2896l.isPro.f26670l).invoke(obj4), null);
            case 3:
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                float f = C15248l.loadAd;
                C11165l c11165l = AbstractC2896l.applovin;
                Boolean bool = Boolean.FALSE;
                AbstractC8576l.yandex(obj5, bool);
                float f2 = (obj5 != null ? (C15248l) c11165l.f22451l.invoke(obj5) : null).yandex;
                Object obj6 = list3.get(1);
                C11165l c11165l2 = AbstractC2896l.appmetrica;
                AbstractC8576l.yandex(obj6, bool);
                int i2 = (obj6 != null ? (C4872l) c11165l2.f22451l.invoke(obj6) : null).yandex;
                Object obj7 = list3.get(2);
                C11165l c11165l3 = AbstractC2896l.inmobi;
                AbstractC8576l.yandex(obj7, bool);
                return new C3183l(i2, f2, (obj7 != null ? (C4894l) c11165l3.f22451l.invoke(obj7) : null).yandex);
            case 4:
                float fFloatValue = ((Float) obj).floatValue();
                C15248l.yandex(fFloatValue);
                return new C15248l(fFloatValue);
            case 5:
                return new C4872l(((Integer) obj).intValue());
            case 6:
                List list4 = (List) obj;
                Object obj8 = list4.get(0);
                EnumC6092l enumC6092l = obj8 != null ? (EnumC6092l) obj8 : null;
                Object obj9 = list4.get(2);
                int iIntValue = (obj9 != null ? (Integer) obj9 : null).intValue();
                Object obj10 = list4.get(3);
                int iIntValue2 = (obj10 != null ? (Integer) obj10 : null).intValue();
                Object obj11 = list4.get(4);
                String str3 = obj11 != null ? (String) obj11 : null;
                switch (enumC6092l.ordinal()) {
                    case 0:
                        Object obj12 = list4.get(1);
                        c15012l = new C15012l(iIntValue, iIntValue2, (AbstractC8576l.yandex(obj12, Boolean.FALSE) || obj12 == null) ? null : (C9077l) ((Function1) AbstractC2896l.admob.f26670l).invoke(obj12), str3);
                        break;
                    case 1:
                        Object obj13 = list4.get(1);
                        c15012l = new C15012l(iIntValue, iIntValue2, (AbstractC8576l.yandex(obj13, Boolean.FALSE) || obj13 == null) ? null : (C14264l) ((Function1) AbstractC2896l.subs.f26670l).invoke(obj13), str3);
                        break;
                    case 2:
                        Object obj14 = list4.get(1);
                        c15012l = new C15012l(iIntValue, iIntValue2, (AbstractC8576l.yandex(obj14, Boolean.FALSE) || obj14 == null) ? null : (C3938l) ((Function1) AbstractC2896l.amazon.f26670l).invoke(obj14), str3);
                        break;
                    case 3:
                        Object obj15 = list4.get(1);
                        c15012l = new C15012l(iIntValue, iIntValue2, (AbstractC8576l.yandex(obj15, Boolean.FALSE) || obj15 == null) ? null : (C18005l) ((Function1) AbstractC2896l.purchase.f26670l).invoke(obj15), str3);
                        break;
                    case 4:
                        Object obj16 = list4.get(1);
                        c15012l = new C15012l(iIntValue, iIntValue2, (AbstractC8576l.yandex(obj16, Boolean.FALSE) || obj16 == null) ? null : (C14754l) ((Function1) AbstractC2896l.billing.f26670l).invoke(obj16), str3);
                        break;
                    case 5:
                        Object obj17 = list4.get(1);
                        c15012l = new C15012l(iIntValue, iIntValue2, (AbstractC8576l.yandex(obj17, Boolean.FALSE) || obj17 == null) ? null : (C7409l) ((Function1) AbstractC2896l.mopub.f26670l).invoke(obj17), str3);
                        break;
                    case 6:
                        Object obj18 = list4.get(1);
                        c15012l = new C15012l(iIntValue, iIntValue2, new C9891l(obj18 != null ? (String) obj18 : null), str3);
                        break;
                    default:
                        C18725l.billing();
                        return null;
                }
                return c15012l;
            case 7:
                return new C4894l(((Integer) obj).intValue());
            case 8:
                return new C3938l(obj != null ? (String) obj : null);
            case 9:
                return new C18005l(obj != null ? (String) obj : null);
            case 10:
                List list5 = (List) obj;
                Object obj19 = list5.get(0);
                C11165l c11165l4 = AbstractC2896l.ads;
                Boolean bool2 = Boolean.FALSE;
                AbstractC8576l.yandex(obj19, bool2);
                int i3 = (obj19 != null ? (C10258l) c11165l4.f22451l.invoke(obj19) : null).yandex;
                Object obj20 = list5.get(1);
                C11165l c11165l5 = AbstractC2896l.subscription;
                AbstractC8576l.yandex(obj20, bool2);
                int i4 = (obj20 != null ? (C16546l) c11165l5.f22451l.invoke(obj20) : null).yandex;
                Object obj21 = list5.get(2);
                C12735l[] c12735lArr = C1794l.loadAd;
                C11165l c11165l6 = AbstractC2896l.pro;
                AbstractC8576l.yandex(obj21, bool2);
                long j = (obj21 != null ? (C1794l) c11165l6.f22451l.invoke(obj21) : null).yandex;
                Object obj22 = list5.get(3);
                C13299l c13299l = C13299l.crashlytics;
                C13299l c13299l2 = (AbstractC8576l.yandex(obj22, bool2) || obj22 == null) ? null : (C13299l) ((Function1) AbstractC2896l.remoteconfig.f26670l).invoke(obj22);
                Object obj23 = list5.get(4);
                C4361l c4361l = (AbstractC8576l.yandex(obj23, bool2) || obj23 == null) ? null : (C4361l) ((Function1) AbstractC7840l.yandex.f26670l).invoke(obj23);
                Object obj24 = list5.get(5);
                C3183l c3183l = C3183l.amazon;
                C3183l c3183l2 = (AbstractC8576l.yandex(obj24, bool2) || obj24 == null) ? null : (C3183l) ((Function1) AbstractC2896l.premium.f26670l).invoke(obj24);
                Object obj25 = list5.get(6);
                int i5 = ((AbstractC8576l.yandex(obj25, bool2) || obj25 == null) ? null : (C17427l) ((Function1) AbstractC7840l.crashlytics.f26670l).invoke(obj25)).yandex;
                Object obj26 = list5.get(7);
                C11165l c11165l7 = AbstractC2896l.tapsense;
                AbstractC8576l.yandex(obj26, bool2);
                int i6 = (obj26 != null ? (C0106l) c11165l7.f22451l.invoke(obj26) : null).yandex;
                Object obj27 = list5.get(8);
                return new C9077l(i3, i4, j, c13299l2, c4361l, c3183l2, i5, i6, (AbstractC8576l.yandex(obj27, bool2) || obj27 == null) ? null : (C10068l) ((Function1) AbstractC7840l.amazon.f26670l).invoke(obj27));
            case 11:
                List list6 = (List) obj;
                Object obj28 = list6.get(0);
                int i7 = C9735l.smaato;
                C13645l c13645l = AbstractC2896l.yandex;
                Boolean bool3 = Boolean.FALSE;
                AbstractC8576l.yandex(obj28, bool3);
                if (obj28 != null) {
                    c9735l = AbstractC8576l.yandex(obj28, Boolean.FALSE) ? new C9735l(C9735l.firebase) : new C9735l(AbstractC12953l.loadAd(((Integer) obj28).intValue()));
                } else {
                    c9735l = null;
                }
                long j2 = c9735l.yandex;
                Object obj29 = list6.get(1);
                C12735l[] c12735lArr2 = C1794l.loadAd;
                Function1 function1 = AbstractC2896l.pro.f22451l;
                AbstractC8576l.yandex(obj29, bool3);
                long j3 = (obj29 != null ? (C1794l) function1.invoke(obj29) : null).yandex;
                Object obj30 = list6.get(2);
                C6886l c6886l = C6886l.f14421l;
                C6886l c6886l2 = (AbstractC8576l.yandex(obj30, bool3) || obj30 == null) ? null : (C6886l) ((Function1) AbstractC2896l.vip.f26670l).invoke(obj30);
                Object obj31 = list6.get(3);
                C11617l c11617l = (AbstractC8576l.yandex(obj31, bool3) || obj31 == null) ? null : (C11617l) ((Function1) AbstractC2896l.Signature.f26670l).invoke(obj31);
                Object obj32 = list6.get(4);
                C8689l c8689l = (AbstractC8576l.yandex(obj32, bool3) || obj32 == null) ? null : (C8689l) ((Function1) AbstractC2896l.license.f26670l).invoke(obj32);
                Object obj33 = list6.get(6);
                String str4 = obj33 != null ? (String) obj33 : null;
                Object obj34 = list6.get(7);
                AbstractC8576l.yandex(obj34, bool3);
                long j4 = (obj34 != null ? (C1794l) function1.invoke(obj34) : null).yandex;
                Object obj35 = list6.get(8);
                C10524l c10524l = (AbstractC8576l.yandex(obj35, bool3) || obj35 == null) ? null : (C10524l) ((Function1) AbstractC2896l.metrica.f26670l).invoke(obj35);
                Object obj36 = list6.get(9);
                C16810l c16810l = (AbstractC8576l.yandex(obj36, bool3) || obj36 == null) ? null : (C16810l) ((Function1) AbstractC2896l.smaato.f26670l).invoke(obj36);
                Object obj37 = list6.get(10);
                C10537l c10537l = C10537l.f21447l;
                C10537l c10537l2 = (AbstractC8576l.yandex(obj37, bool3) || obj37 == null) ? null : (C10537l) ((Function1) AbstractC2896l.isVip.f26670l).invoke(obj37);
                Object obj38 = list6.get(11);
                AbstractC8576l.yandex(obj38, bool3);
                if (obj38 != null) {
                    c9735l2 = AbstractC8576l.yandex(obj38, Boolean.FALSE) ? new C9735l(C9735l.firebase) : new C9735l(AbstractC12953l.loadAd(((Integer) obj38).intValue()));
                } else {
                    c9735l2 = null;
                }
                long j5 = c9735l2.yandex;
                Object obj39 = list6.get(12);
                C9867l c9867l = (AbstractC8576l.yandex(obj39, bool3) || obj39 == null) ? null : (C9867l) ((Function1) AbstractC2896l.firebase.f26670l).invoke(obj39);
                Object obj40 = list6.get(13);
                C0387l c0387l = C0387l.amazon;
                return new C14264l(j2, j3, c6886l2, c11617l, c8689l, null, str4, j4, c10524l, c16810l, c10537l2, j5, c9867l, (AbstractC8576l.yandex(obj40, bool3) || obj40 == null) ? null : (C0387l) ((Function1) AbstractC2896l.startapp.f26670l).invoke(obj40), 49184);
            case 12:
                List list7 = (List) obj;
                Object obj41 = list7.get(0);
                boolean zBooleanValue = (obj41 != null ? (Boolean) obj41 : null).booleanValue();
                Object obj42 = list7.get(1);
                return new C4361l(((AbstractC8576l.yandex(obj42, Boolean.FALSE) || obj42 == null) ? null : (C8405l) ((Function1) AbstractC7840l.loadAd.f26670l).invoke(obj42)).yandex, zBooleanValue);
            case 13:
                return new C8405l(((Integer) obj).intValue());
            case 14:
                return new C17427l(((Integer) obj).intValue());
            case 15:
                List list8 = (List) obj;
                Object obj43 = list8.get(0);
                int i8 = ((AbstractC8576l.yandex(obj43, Boolean.FALSE) || obj43 == null) ? null : (C11771l) ((Function1) AbstractC7840l.purchase.f26670l).invoke(obj43)).yandex;
                Object obj44 = list8.get(1);
                return new C10068l(i8, (obj44 != null ? (Boolean) obj44 : null).booleanValue());
            case 16:
                return new C11771l(((Integer) obj).intValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C11194l(((Integer) obj).intValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10829l c10829l = (C10829l) obj;
                if (c10829l != null && c10829l.yandex == 2) {
                    i = 1;
                }
                return Boolean.valueOf(i ^ 1);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Unit.INSTANCE;
            case 20:
                AbstractC3668l.remoteconfig((InterfaceC17593l) obj, 3);
                return Unit.INSTANCE;
            case 21:
                InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                C4707l c4707l = AbstractC0424l.purchase;
                Unit unit = Unit.INSTANCE;
                ((InterfaceC17593l) obj).amazon(c4707l, unit);
                return unit;
            case 22:
                C1187l c1187l = (C1187l) obj;
                long j6 = c1187l.yandex;
                return (9223372034707292159L & j6) != 9205357640488583168L ? new C15709l(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (4294967295L & c1187l.yandex))) : AbstractC3415l.yandex;
            case 23:
                C15709l c15709l = (C15709l) obj;
                return new C1187l((((long) Float.floatToRawIntBits(c15709l.loadAd)) & 4294967295L) | (((long) Float.floatToRawIntBits(c15709l.yandex)) << 32));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Long.valueOf(((C18329l) obj).yandex);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C11611l(((Long) obj).longValue());
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                List list9 = (List) obj;
                C17594l c17594l = new C17594l();
                List list10 = (List) list9.get(0);
                C13645l c13645l2 = C3625l.f7561l;
                ArrayList arrayList2 = new ArrayList(list10.size());
                int size2 = list10.size();
                while (i < size2) {
                    C3625l c3625l = (C3625l) ((Function1) c13645l2.f26670l).invoke(list10.get(i));
                    if (c3625l != null) {
                        arrayList2.add(c3625l);
                    }
                    i++;
                }
                c17594l.crashlytics.setValue(arrayList2);
                Object obj45 = list9.get(1);
                Integer num = obj45 instanceof Integer ? (Integer) obj45 : null;
                if (num != null) {
                    c17594l.yandex.setValue(new C3242l(new C15812l(AbstractC4338l.m1528else((String) list9.get(3)), ((Long) list9.get(2)).longValue(), num.intValue()), new C15812l(AbstractC4338l.m1528else((String) list9.get(6)), ((Long) list9.get(5)).longValue(), ((Integer) list9.get(4)).intValue()), ((Boolean) list9.get(7)).booleanValue()));
                }
                return c17594l;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((InterfaceC11075l) obj).iterator();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return obj;
            default:
                return ((Iterable) obj).iterator();
        }
    }
}
