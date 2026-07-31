package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: lؙ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17743l {
    public final boolean admob;
    public final List amazon;
    public final List billing;
    public final String crashlytics;
    public final String loadAd;
    public final List mopub;
    public final ArrayList purchase;
    public final AbstractC3292l subs;
    public final int yandex;

    public C17743l(int i, String str, String str2, List list, ArrayList arrayList, List list2, List list3, boolean z, AbstractC3292l abstractC3292l) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = list;
        this.purchase = arrayList;
        this.billing = list2;
        this.mopub = list3;
        this.admob = z;
        this.subs = abstractC3292l;
        if (i != 3 || (arrayList.isEmpty() && list.isEmpty() && list2.isEmpty())) {
            if (list2.size() == list3.size()) {
                return;
            }
            StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
            sb.append(list2.size());
            sb.append(") and javaGenericParameterTypesIfFunction.size (");
            sb.append(list3.size());
            sb.append(") must be equal. For member: '");
            C8936l.subs(AbstractC2812l.tapsense(sb, str, '\''));
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Inconsistent combination of EquatableCallableSignature values. kind: ");
        sb2.append(AbstractC0653l.advert(i));
        sb2.append(", kotlinParameterTypes.isEmpty(): ");
        sb2.append(arrayList.isEmpty());
        sb2.append(",typeParameters.isEmpty(): ");
        sb2.append(list.isEmpty());
        sb2.append(", javaParameterTypesIfFunction.isEmpty(): ");
        sb2.append(list2.isEmpty());
        sb2.append(".For member: '");
        C8936l.subs(AbstractC2812l.tapsense(sb2, str, '\''));
        throw null;
    }

    public final boolean equals(Object obj) {
        List list;
        C6702l c6702lYandex;
        if (this != obj) {
            if (obj instanceof C17743l) {
                C17743l c17743l = (C17743l) obj;
                List list2 = c17743l.amazon;
                List list3 = c17743l.billing;
                String str = c17743l.loadAd;
                ArrayList arrayList = c17743l.purchase;
                AbstractC3292l abstractC3292l = c17743l.subs;
                AbstractC3292l abstractC3292l2 = this.subs;
                boolean zEquals = abstractC3292l2.equals(abstractC3292l);
                String str2 = this.loadAd;
                if (!zEquals) {
                    C8936l.subs(AbstractC15560l.Signature("Equality modes must be the same for member '", str2, "'. Please recreate signatures on inheritance"));
                    return false;
                }
                int i = c17743l.yandex;
                int i2 = this.yandex;
                if (i2 == i && this.admob == c17743l.admob) {
                    ArrayList arrayList2 = this.purchase;
                    if (arrayList2.size() == arrayList.size()) {
                        if (!abstractC3292l2.equals(C10571l.crashlytics) || i2 != 1) {
                            boolean z = false;
                            if (!AbstractC8576l.yandex(str2, str) || (c6702lYandex = AbstractC4769l.yandex((list = this.amazon), list2)) == null) {
                                return false;
                            }
                            int size = list.size();
                            int i3 = 0;
                            while (i3 < size) {
                                AbstractC11726l abstractC11726l = (AbstractC11726l) list.get(i3);
                                AbstractC11726l abstractC11726l2 = (AbstractC11726l) list2.get(i3);
                                if (abstractC11726l.getUpperBounds().size() != abstractC11726l2.getUpperBounds().size()) {
                                    return z;
                                }
                                List<InterfaceC13012l> upperBounds = abstractC11726l.getUpperBounds();
                                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(upperBounds, 10));
                                for (InterfaceC13012l interfaceC13012l : upperBounds) {
                                    C6702l c6702l = C6702l.loadAd;
                                    InterfaceC13012l interfaceC13012l2 = c6702lYandex.yandex(1, interfaceC13012l).loadAd;
                                    if (interfaceC13012l2 == null) {
                                        AbstractC4769l.billing(str2);
                                        throw null;
                                    }
                                    arrayList3.add(interfaceC13012l2);
                                }
                                boolean z2 = z;
                                ArrayList<C8195l> arrayListM4226l = AbstractC16901l.m4226l(AbstractC16901l.m4243this(abstractC11726l2.getUpperBounds(), new C0323l(z2 ? 1 : 0, str)), AbstractC16901l.m4243this(arrayList3, new C0323l(z2 ? 1 : 0, str2)));
                                if (!arrayListM4226l.isEmpty()) {
                                    for (C8195l c8195l : arrayListM4226l) {
                                        InterfaceC13012l interfaceC13012l3 = (InterfaceC13012l) c8195l.f17098l;
                                        InterfaceC13012l interfaceC13012l4 = (InterfaceC13012l) c8195l.f17097l;
                                        if (!AbstractC0136l.admob(interfaceC13012l3, interfaceC13012l4) || !AbstractC0136l.admob(interfaceC13012l4, interfaceC13012l3)) {
                                            return false;
                                        }
                                    }
                                }
                                i3++;
                                z = false;
                            }
                            int size2 = arrayList2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                InterfaceC13012l interfaceC13012l5 = (InterfaceC13012l) arrayList2.get(i4);
                                C6702l c6702l2 = C6702l.loadAd;
                                InterfaceC13012l interfaceC13012l6 = c6702lYandex.yandex(1, interfaceC13012l5).loadAd;
                                if (interfaceC13012l6 == null) {
                                    AbstractC4769l.billing(str2);
                                    throw null;
                                }
                                InterfaceC13012l interfaceC13012l7 = (InterfaceC13012l) arrayList.get(i4);
                                if (!AbstractC0136l.admob(interfaceC13012l6, interfaceC13012l7) || !AbstractC0136l.admob(interfaceC13012l7, interfaceC13012l6)) {
                                    return false;
                                }
                            }
                        } else if (AbstractC8576l.yandex(this.crashlytics, c17743l.crashlytics)) {
                            List list4 = this.billing;
                            if (list4.size() == list3.size()) {
                                if (list4.size() != arrayList2.size()) {
                                    StringBuilder sb = new StringBuilder("javaParameterTypesIfFunction.size (");
                                    sb.append(list4.size());
                                    sb.append(") and kotlinParameterTypes.size (");
                                    sb.append(arrayList2.size());
                                    sb.append(") must be equal for member '");
                                    C8936l.subs(AbstractC2812l.tapsense(sb, str2, '\''));
                                    return false;
                                }
                                int size3 = list4.size();
                                for (int i5 = 0; i5 < size3; i5++) {
                                    Type type = (Type) this.mopub.get(i5);
                                    Class cls = (Class) list4.get(i5);
                                    Type type2 = (Type) c17743l.mopub.get(i5);
                                    Class cls2 = (Class) list3.get(i5);
                                    TypeVariable typeVariable = type instanceof TypeVariable ? (TypeVariable) type : null;
                                    boolean z3 = (typeVariable != null ? typeVariable.getGenericDeclaration() : null) instanceof Class;
                                    TypeVariable typeVariable2 = type2 instanceof TypeVariable ? (TypeVariable) type2 : null;
                                    boolean z4 = (typeVariable2 != null ? typeVariable2.getGenericDeclaration() : null) instanceof Class;
                                    if (z3 || z4) {
                                        if (cls.isPrimitive() != cls2.isPrimitive()) {
                                            return false;
                                        }
                                        InterfaceC13012l interfaceC13012lLoadAd = AbstractC4769l.loadAd((InterfaceC13012l) arrayList2.get(i5), str2);
                                        InterfaceC13012l interfaceC13012lLoadAd2 = AbstractC4769l.loadAd((InterfaceC13012l) arrayList.get(i5), str);
                                        if (!AbstractC0136l.admob(interfaceC13012lLoadAd, interfaceC13012lLoadAd2) || !AbstractC0136l.admob(interfaceC13012lLoadAd2, interfaceC13012lLoadAd)) {
                                            return false;
                                        }
                                    } else if (!AbstractC8576l.yandex(cls, cls2)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean zEquals = this.subs.equals(C10571l.crashlytics);
        int i = this.yandex;
        boolean z = zEquals && i == 1;
        boolean z2 = this.admob;
        ArrayList arrayList = this.purchase;
        if (!z) {
            if (!z) {
                return Arrays.hashCode(new Object[]{AbstractC5020l.admob(i), Integer.valueOf(arrayList.size()), Boolean.valueOf(z2), this.loadAd});
            }
            C18725l.billing();
            return 0;
        }
        Integer numValueOf = Integer.valueOf(arrayList.size());
        Boolean boolValueOf = Boolean.valueOf(z2);
        String str = this.crashlytics;
        if (str == null) {
            str = "";
        }
        return Arrays.hashCode(new Object[]{AbstractC5020l.admob(i), numValueOf, boolValueOf, str});
    }

    public final String toString() {
        return "EquatableCallableSignature(kind=" + AbstractC0653l.advert(this.yandex) + ", name=" + this.loadAd + ", jvmNameIfFunction=" + this.crashlytics + ", typeParameters=" + this.amazon + ", kotlinParameterTypes=" + this.purchase + ", javaParameterTypesIfFunction=" + this.billing + ", javaGenericParameterTypesIfFunction=" + this.mopub + ", isStatic=" + this.admob + ", equalityMode=" + this.subs + ')';
    }
}
