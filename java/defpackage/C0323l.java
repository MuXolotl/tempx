package defpackage;

import android.util.Rational;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؑٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0323l implements Comparator {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f1367l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f1368l;

    public C0323l(Comparator comparator) {
        this.f1368l = 6;
        this.f1367l = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Class<?> cls;
        String strCrashlytics;
        String strCrashlytics2;
        int i = this.f1368l;
        Object obj3 = this.f1367l;
        switch (i) {
            case 0:
                String str = (String) obj3;
                InterfaceC1122l interfaceC1122lMo1616package = ((InterfaceC13012l) obj).mo1616package();
                if (interfaceC1122lMo1616package == null) {
                    C1759l.subs(39, str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (!(interfaceC1122lMo1616package instanceof InterfaceC1388l)) {
                    if (interfaceC1122lMo1616package instanceof AbstractC11726l) {
                        strCrashlytics = ((AbstractC11726l) interfaceC1122lMo1616package).crashlytics();
                    } else {
                        cls = interfaceC1122lMo1616package.getClass();
                    }
                    C11983l.advert(AbstractC18202l.yandex.loadAd(cls), "Unknown upper bound classifier: ");
                    return 0;
                }
                strCrashlytics = ((InterfaceC13937l) ((InterfaceC1388l) interfaceC1122lMo1616package)).mo1730private().getName();
                InterfaceC1122l interfaceC1122lMo1616package2 = ((InterfaceC13012l) obj2).mo1616package();
                if (interfaceC1122lMo1616package2 == null) {
                    C1759l.subs(39, str, "Upper bounds are always denotable. Upper bounds appear non-denotable for member: '");
                    return 0;
                }
                if (interfaceC1122lMo1616package2 instanceof InterfaceC1388l) {
                    strCrashlytics2 = ((InterfaceC13937l) ((InterfaceC1388l) interfaceC1122lMo1616package2)).mo1730private().getName();
                } else {
                    if (!(interfaceC1122lMo1616package2 instanceof AbstractC11726l)) {
                        cls = interfaceC1122lMo1616package2.getClass();
                        C11983l.advert(AbstractC18202l.yandex.loadAd(cls), "Unknown upper bound classifier: ");
                        return 0;
                    }
                    strCrashlytics2 = ((AbstractC11726l) interfaceC1122lMo1616package2).crashlytics();
                }
                return AbstractC2920l.crashlytics(strCrashlytics, strCrashlytics2);
            case 1:
                Function1 function1 = (Function1) obj3;
                return AbstractC2920l.crashlytics(function1.invoke((AbstractC18041l) obj).toString(), function1.invoke((AbstractC18041l) obj2).toString());
            case 2:
                Rational rational = (Rational) obj2;
                Rational rational2 = (Rational) obj3;
                float fFloatValue = ((Rational) obj).floatValue();
                float fFloatValue2 = rational2.floatValue();
                float f = fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
                float fFloatValue3 = rational.floatValue();
                float fFloatValue4 = rational2.floatValue();
                return Float.compare(fFloatValue3 > fFloatValue4 ? fFloatValue4 / fFloatValue3 : fFloatValue3 / fFloatValue4, f);
            case 3:
                int iCompare = ((C15696l) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                C5254l c5254l = ((C15524l) obj).yandex;
                int i2 = AbstractC8576l.yandex(c5254l.f11337l, "*") ? 2 : 0;
                if (AbstractC8576l.yandex(c5254l.f11336l, "*")) {
                    i2++;
                }
                Integer numValueOf = Integer.valueOf(i2);
                C5254l c5254l2 = ((C15524l) obj2).yandex;
                int i3 = AbstractC8576l.yandex(c5254l2.f11337l, "*") ? 2 : 0;
                if (AbstractC8576l.yandex(c5254l2.f11336l, "*")) {
                    i3++;
                }
                return AbstractC2920l.crashlytics(numValueOf, Integer.valueOf(i3));
            case 4:
                int iCompare2 = ((C0323l) obj3).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : AbstractC2920l.crashlytics(Integer.valueOf(((List) ((C15524l) obj2).yandex.f33214l).size()), Integer.valueOf(((List) ((C15524l) obj).yandex.f33214l).size()));
            case 5:
                C17248l c17248l = (C17248l) obj3;
                return AbstractC2920l.crashlytics(Integer.valueOf(c17248l.crashlytics(((Number) obj).longValue())), Integer.valueOf(c17248l.crashlytics(((Number) obj2).longValue())));
            case 6:
                int iCompare3 = ((Comparator) obj3).compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                return C3654l.f7666l.compare(((C18666l) obj).crashlytics, ((C18666l) obj2).crashlytics);
            case 7:
                int iCompare4 = ((C0323l) obj3).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : AbstractC2920l.crashlytics(Integer.valueOf(((C18666l) obj).billing), Integer.valueOf(((C18666l) obj2).billing));
            case 8:
                ArrayList arrayList = ((C5664l) obj3).f12037l;
                Iterator it = ((C11304l) obj).smaato.iterator();
                if (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(arrayList.indexOf((C9494l) it.next()));
                    while (it.hasNext()) {
                        Integer numValueOf3 = Integer.valueOf(arrayList.indexOf((C9494l) it.next()));
                        if (numValueOf2.compareTo(numValueOf3) > 0) {
                            numValueOf2 = numValueOf3;
                        }
                    }
                    Iterator it2 = ((C11304l) obj2).smaato.iterator();
                    if (it2.hasNext()) {
                        Integer numValueOf4 = Integer.valueOf(arrayList.indexOf((C9494l) it2.next()));
                        while (it2.hasNext()) {
                            Integer numValueOf5 = Integer.valueOf(arrayList.indexOf((C9494l) it2.next()));
                            if (numValueOf4.compareTo(numValueOf5) > 0) {
                                numValueOf4 = numValueOf5;
                            }
                        }
                        return AbstractC2920l.crashlytics(numValueOf2, numValueOf4);
                    }
                }
                C4875l.firebase();
                return 0;
            default:
                C17914l c17914l = (C17914l) obj3;
                return AbstractC2920l.crashlytics((Comparable) ((HashMap) c17914l.amazon()).get((C14997l) obj), (Comparable) ((HashMap) c17914l.amazon()).get((C14997l) obj2));
        }
    }

    public /* synthetic */ C0323l(int i, Object obj) {
        this.f1368l = i;
        this.f1367l = obj;
    }
}
