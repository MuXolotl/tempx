package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؗۤٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5266l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f11353l;

    public /* synthetic */ C5266l(AbstractC15781l abstractC15781l) {
        this.f11353l = 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 7;
        c14264l = null;
        C14264l c14264l = null;
        switch (this.f11353l) {
            case 0:
                return Boolean.TRUE;
            case 1:
                return new C8974l();
            case 2:
                throw new C13165l();
            case 3:
                return ((C6980l) obj).yandex;
            case 4:
                return Boolean.valueOf(((String) obj).length() > 0);
            case 5:
                String str = (String) obj;
                return (AbstractC12024l.inmobi(str, '{') && AbstractC12024l.inmobi(str, '}')) ? new C6980l(str, 2) : new C6980l(AbstractC2208l.crashlytics(0, 0, 7, str), 1);
            case 6:
                return AbstractC16901l.m4210case((List) obj, " -> ", "  ", null, new C5266l(i), 28);
            case 7:
                return "\"" + ((C11202l) obj).yandex.f4915l + '\"';
            case 8:
                C6944l c6944l = (C6944l) obj;
                InterfaceC6272l interfaceC6272l = AbstractC5708l.loadAd;
                if (interfaceC6272l.admob()) {
                    ArrayList arrayList = c6944l.purchase;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c6944l.toString());
                    sb.append('\n');
                    C9611l c9611l = c6944l.crashlytics;
                    if (c9611l != null) {
                        c9611l.yandex(0, sb);
                    }
                    if (c6944l.amazon != null) {
                        sb.append("Matched routes:");
                        sb.append('\n');
                        if (arrayList.isEmpty()) {
                            sb.append("  No results");
                            sb.append('\n');
                        } else {
                            sb.append(AbstractC16901l.m4210case(arrayList, "\n", null, null, new C5266l(6), 30));
                            sb.append('\n');
                        }
                        sb.append("Routing resolve result:");
                        sb.append('\n');
                        StringBuilder sb2 = new StringBuilder("  ");
                        AbstractC2520l abstractC2520l = c6944l.amazon;
                        sb2.append(abstractC2520l != null ? abstractC2520l : null);
                        sb.append(sb2.toString());
                    }
                    interfaceC6272l.vip(sb.toString());
                }
                return Unit.INSTANCE;
            case 9:
                return new C8874l((Map) obj);
            case 10:
                return obj;
            case 11:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Function1 function1 = (Function1) AbstractC2896l.subs.f26670l;
                Boolean bool = Boolean.FALSE;
                C14264l c14264l2 = (AbstractC8576l.yandex(obj2, bool) || obj2 == null) ? null : (C14264l) function1.invoke(obj2);
                Object obj3 = list.get(1);
                C14264l c14264l3 = (AbstractC8576l.yandex(obj3, bool) || obj3 == null) ? null : (C14264l) function1.invoke(obj3);
                Object obj4 = list.get(2);
                C14264l c14264l4 = (AbstractC8576l.yandex(obj4, bool) || obj4 == null) ? null : (C14264l) function1.invoke(obj4);
                Object obj5 = list.get(3);
                if (!AbstractC8576l.yandex(obj5, bool) && obj5 != null) {
                    c14264l = (C14264l) function1.invoke(obj5);
                }
                return new C11244l(c14264l2, c14264l3, c14264l4, c14264l);
            case 12:
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (AbstractC8576l.yandex(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) AbstractC2896l.loadAd.f26670l).invoke(obj6);
                Object obj7 = list2.get(0);
                return new C3625l(list3, obj7 != null ? (String) obj7 : null);
            case 13:
                return new C9867l(((Integer) obj).intValue());
            case 14:
                List list4 = (List) obj;
                return new C16810l(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 15:
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                C12735l[] c12735lArr = C1794l.loadAd;
                Function1 function2 = AbstractC2896l.pro.f22451l;
                Boolean bool2 = Boolean.FALSE;
                AbstractC8576l.yandex(obj8, bool2);
                long j = (obj8 != null ? (C1794l) function2.invoke(obj8) : null).yandex;
                Object obj9 = list5.get(1);
                AbstractC8576l.yandex(obj9, bool2);
                return new C13299l(j, (obj9 != null ? (C1794l) function2.invoke(obj9) : null).yandex);
            case 16:
                return new C6886l(((Integer) obj).intValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C10524l(((Float) obj).floatValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                int iIntValue = (obj10 != null ? (Integer) obj10 : null).intValue();
                Object obj11 = list6.get(1);
                return new C12814l(AbstractC2296l.loadAd(iIntValue, (obj11 != null ? (Integer) obj11 : null).intValue()));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = C9735l.smaato;
                C13645l c13645l = AbstractC2896l.yandex;
                Boolean bool3 = Boolean.FALSE;
                AbstractC8576l.yandex(obj12, bool3);
                long j2 = (obj12 != null ? AbstractC8576l.yandex(obj12, Boolean.FALSE) ? new C9735l(C9735l.firebase) : new C9735l(AbstractC12953l.loadAd(((Integer) obj12).intValue())) : null).yandex;
                Object obj13 = list7.get(1);
                C11165l c11165l = AbstractC2896l.advert;
                AbstractC8576l.yandex(obj13, bool3);
                long j3 = (obj13 != null ? (C1187l) c11165l.f22451l.invoke(obj13) : null).yandex;
                Object obj14 = list7.get(2);
                return new C0387l(j2, j3, (obj14 != null ? (Float) obj14 : null).floatValue());
            case 20:
                return new C10258l(((Integer) obj).intValue());
            case 21:
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                Object obj16 = list8.get(1);
                return new C14754l(str2, (AbstractC8576l.yandex(obj16, Boolean.FALSE) || obj16 == null) ? null : (C11244l) ((Function1) AbstractC2896l.isPro.f26670l).invoke(obj16), null);
            case 22:
                return new C16546l(((Integer) obj).intValue());
            case 23:
                return new C0106l(((Integer) obj).intValue());
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                List list9 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list9.size());
                int size = list9.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj17 = list9.get(i3);
                    arrayList2.add((AbstractC8576l.yandex(obj17, Boolean.FALSE) || obj17 == null) ? null : (C15012l) ((Function1) AbstractC2896l.crashlytics.f26670l).invoke(obj17));
                }
                return arrayList2;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C11617l(((Integer) obj).intValue());
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C8689l(((Integer) obj).intValue());
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Boolean bool4 = Boolean.FALSE;
                if (AbstractC8576l.yandex(obj, bool4)) {
                    return new C1794l(C1794l.crashlytics);
                }
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                float fFloatValue = (obj18 != null ? (Float) obj18 : null).floatValue();
                Object obj19 = list10.get(1);
                C11165l c11165l2 = AbstractC2896l.ad;
                AbstractC8576l.yandex(obj19, bool4);
                return new C1794l(AbstractC7039l.firebase(fFloatValue, (obj19 != null ? (C12735l) c11165l2.f22451l.invoke(obj19) : null).yandex));
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                if (AbstractC8576l.yandex(obj, 0)) {
                    return new C12735l(8589934592L);
                }
                return AbstractC8576l.yandex(obj, 1) ? new C12735l(4294967296L) : new C12735l(0L);
            default:
                if (AbstractC8576l.yandex(obj, Boolean.FALSE)) {
                    return new C1187l(9205357640488583168L);
                }
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                float fFloatValue2 = (obj20 != null ? (Float) obj20 : null).floatValue();
                Object obj21 = list11.get(1);
                return new C1187l((((long) Float.floatToRawIntBits((obj21 != null ? (Float) obj21 : null).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32));
        }
    }

    public /* synthetic */ C5266l(int i) {
        this.f11353l = i;
    }
}
