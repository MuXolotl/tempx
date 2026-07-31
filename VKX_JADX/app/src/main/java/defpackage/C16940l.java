package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؘٗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16940l implements InterfaceC10835l {
    public final float admob;
    public final C10643l amazon;
    public final C10643l billing;
    public final AbstractC17824l crashlytics;
    public final boolean loadAd;
    public final InterfaceC11780l mopub;
    public final C10643l purchase;
    public final Function1 yandex;

    public C16940l(Function1 function1, boolean z, AbstractC17824l abstractC17824l, C10643l c10643l, C10643l c10643l2, C10643l c10643l3, InterfaceC11780l interfaceC11780l, float f) {
        this.yandex = function1;
        this.loadAd = z;
        this.crashlytics = abstractC17824l;
        this.amazon = c10643l;
        this.purchase = c10643l2;
        this.billing = c10643l3;
        this.mopub = interfaceC11780l;
        this.admob = f;
    }

    public static final int isPro(int i, C16940l c16940l, int i2, int i3, AbstractC10113l abstractC10113l, AbstractC10113l abstractC10113l2) {
        if (c16940l.loadAd) {
            i3 = Math.round(((i2 - abstractC10113l2.f20591l) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (abstractC10113l != null ? abstractC10113l.f20591l : 0) / 2);
    }

    public final int admob(InterfaceC12822l interfaceC12822l, List list, int i, Function2 function2) {
        Object obj;
        int iMetrica;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        C16940l c16940l = this;
        float fInvoke = c16940l.amazon.invoke();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj), "Leading")) {
                break;
            }
            i2++;
        }
        InterfaceC6357l interfaceC6357l = (InterfaceC6357l) obj;
        if (interfaceC6357l != null) {
            iMetrica = AbstractC1019l.metrica(i, interfaceC6357l.metrica(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue = ((Number) function2.invoke(interfaceC6357l, Integer.valueOf(i))).intValue();
        } else {
            iMetrica = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) obj2;
        if (interfaceC6357l2 != null) {
            iMetrica = AbstractC1019l.metrica(iMetrica, interfaceC6357l2.metrica(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue2 = ((Number) function2.invoke(interfaceC6357l2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj3), "Label")) {
                break;
            }
            i4++;
        }
        InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) obj3;
        int iIntValue5 = interfaceC6357l3 != null ? ((Number) function2.invoke(interfaceC6357l3, Integer.valueOf(AbstractC7572l.smaato(iMetrica, fInvoke, i)))).intValue() : 0;
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj4), "Prefix")) {
                break;
            }
            i5++;
        }
        InterfaceC6357l interfaceC6357l4 = (InterfaceC6357l) obj4;
        if (interfaceC6357l4 != null) {
            iIntValue3 = ((Number) function2.invoke(interfaceC6357l4, Integer.valueOf(iMetrica))).intValue();
            iMetrica = AbstractC1019l.metrica(iMetrica, interfaceC6357l4.metrica(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i6);
            if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj5), "Suffix")) {
                break;
            }
            i6++;
        }
        InterfaceC6357l interfaceC6357l5 = (InterfaceC6357l) obj5;
        if (interfaceC6357l5 != null) {
            iIntValue4 = ((Number) function2.invoke(interfaceC6357l5, Integer.valueOf(iMetrica))).intValue();
            iMetrica = AbstractC1019l.metrica(iMetrica, interfaceC6357l5.metrica(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj8 = list.get(i7);
            if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj8), "TextField")) {
                int iIntValue6 = ((Number) function2.invoke(obj8, Integer.valueOf(iMetrica))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                InterfaceC6357l interfaceC6357l6 = (InterfaceC6357l) obj6;
                int iIntValue7 = interfaceC6357l6 != null ? ((Number) function2.invoke(interfaceC6357l6, Integer.valueOf(iMetrica))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                InterfaceC6357l interfaceC6357l7 = (InterfaceC6357l) obj7;
                return c16940l.billing(interfaceC12822l, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, interfaceC6357l7 != null ? ((Number) function2.invoke(interfaceC6357l7, Integer.valueOf(i))).intValue() : 0, AbstractC7563l.loadAd(0, 0, 0, 0, 15), fInvoke);
            }
            i7++;
            iIntValue4 = iIntValue4;
            c16940l = this;
            iIntValue3 = iIntValue3;
        }
        AbstractC2066l.loadAd("Collection contains no element matching the predicate.");
        C17132l.firebase();
        return 0;
    }

    @Override // defpackage.InterfaceC10835l
    public final int amazon(InterfaceC12822l interfaceC12822l, List list, int i) {
        return admob(interfaceC12822l, list, i, new C8163l(7));
    }

    public final int billing(InterfaceC12822l interfaceC12822l, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, AbstractC7572l.smaato(i6, f, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        InterfaceC11780l interfaceC11780l = this.mopub;
        float fMo868instanceof = interfaceC12822l.mo868instanceof(interfaceC11780l.amazon());
        return AbstractC7563l.billing(Math.max(i, Math.max(i2, AbstractC5573l.ads(AbstractC7572l.firebase(fMo868instanceof, Math.max(fMo868instanceof, i6 / 2.0f), f) + i5 + interfaceC12822l.mo868instanceof(interfaceC11780l.yandex())))) + i8, j);
    }

    @Override // defpackage.InterfaceC10835l
    public final int crashlytics(InterfaceC12822l interfaceC12822l, List list, int i) {
        return subs(interfaceC12822l, list, i, new C8163l(4));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v17 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.InterfaceC10835l
    public final defpackage.InterfaceC17792l loadAd(defpackage.InterfaceC7448l r44, java.util.List r45, long r46) {
        /*
            Method dump skipped, instruction units count: 1133
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16940l.loadAd(lؚۖۦ, java.util.List, long):lٌٟ٘");
    }

    public final int mopub(InterfaceC12822l interfaceC12822l, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, AbstractC7572l.smaato(i6, f, 0))) + i + i2;
        InterfaceC11780l interfaceC11780l = this.mopub;
        EnumC9931l enumC9931l = EnumC9931l.f20223l;
        return AbstractC7563l.mopub(Math.max(iMax, AbstractC5573l.ads((i6 + interfaceC12822l.mo868instanceof(interfaceC11780l.crashlytics(enumC9931l) + interfaceC11780l.loadAd(enumC9931l))) * f)), j);
    }

    @Override // defpackage.InterfaceC10835l
    public final int purchase(InterfaceC12822l interfaceC12822l, List list, int i) {
        return admob(interfaceC12822l, list, i, new C8163l(6));
    }

    public final int subs(InterfaceC12822l interfaceC12822l, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj7), "TextField")) {
                int iIntValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                InterfaceC6357l interfaceC6357l = (InterfaceC6357l) obj2;
                int iIntValue2 = interfaceC6357l != null ? ((Number) function2.invoke(interfaceC6357l, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                InterfaceC6357l interfaceC6357l2 = (InterfaceC6357l) obj3;
                int iIntValue3 = interfaceC6357l2 != null ? ((Number) function2.invoke(interfaceC6357l2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                InterfaceC6357l interfaceC6357l3 = (InterfaceC6357l) obj4;
                int iIntValue4 = interfaceC6357l3 != null ? ((Number) function2.invoke(interfaceC6357l3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                InterfaceC6357l interfaceC6357l4 = (InterfaceC6357l) obj5;
                int iIntValue5 = interfaceC6357l4 != null ? ((Number) function2.invoke(interfaceC6357l4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                InterfaceC6357l interfaceC6357l5 = (InterfaceC6357l) obj6;
                int iIntValue6 = interfaceC6357l5 != null ? ((Number) function2.invoke(interfaceC6357l5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (AbstractC8576l.yandex(AbstractC1019l.purchase((InterfaceC6357l) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                InterfaceC6357l interfaceC6357l6 = (InterfaceC6357l) obj;
                return mopub(interfaceC12822l, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, interfaceC6357l6 != null ? ((Number) function2.invoke(interfaceC6357l6, Integer.valueOf(i))).intValue() : 0, AbstractC7563l.loadAd(0, 0, 0, 0, 15), this.amazon.invoke());
            }
        }
        AbstractC2066l.loadAd("Collection contains no element matching the predicate.");
        C17132l.firebase();
        return 0;
    }

    @Override // defpackage.InterfaceC10835l
    public final int yandex(InterfaceC12822l interfaceC12822l, List list, int i) {
        return subs(interfaceC12822l, list, i, new C8163l(5));
    }
}
