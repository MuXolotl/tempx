package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘٕٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C15505l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ float f30297l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f30298l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f30299l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f30300l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30301l = 1;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ List f30302l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ float f30303l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f30304l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f30305l;

    public /* synthetic */ C15505l(float f, InterfaceC8714l interfaceC8714l, float f2, float f3, InterfaceC8714l interfaceC8714l2, List list, InterfaceC8714l interfaceC8714l3, InterfaceC8714l interfaceC8714l4) {
        this.f30300l = f;
        this.f30305l = interfaceC8714l;
        this.f30297l = f2;
        this.f30303l = f3;
        this.f30298l = interfaceC8714l2;
        this.f30302l = list;
        this.f30299l = interfaceC8714l3;
        this.f30304l = interfaceC8714l4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f30301l;
        Object obj2 = this.f30304l;
        Object obj3 = this.f30299l;
        Object obj4 = this.f30298l;
        Object obj5 = this.f30305l;
        float f = this.f30300l;
        switch (i) {
            case 0:
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj5;
                C11925l c11925l = (C11925l) obj4;
                C11925l c11925l2 = (C11925l) obj;
                interfaceC13349l.subscription(c11925l.Signature, c11925l2, new C16931l(10, c11925l));
                C11183l c11183l = ((C13713l) obj3).yandex;
                float f2 = this.f30297l;
                c11925l2.subs(AbstractC13958l.loadAd(c11183l, f * f2, this.f30303l, this.f30302l, f2, (AbstractC9544l) obj2, null, 865));
                c11925l2.billing(c11183l.f22500l);
                AbstractC2576l.loadAd(interfaceC13349l, c11925l2);
                break;
            default:
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) obj5;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) obj4;
                InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) obj3;
                InterfaceC8714l interfaceC8714l4 = (InterfaceC8714l) obj2;
                InterfaceC13349l interfaceC13349l2 = (InterfaceC13349l) obj;
                boolean z = interfaceC13349l2.getLayoutDirection() == EnumC9931l.f20222l;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l2.mo2070l() & 4294967295L)))) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l2.admob() >> 32)) - f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l2.mo2070l() & 4294967295L)))) & 4294967295L);
                long j = jFloatToRawIntBits2;
                if (!z) {
                    jFloatToRawIntBits2 = jFloatToRawIntBits;
                }
                if (z) {
                    j = jFloatToRawIntBits;
                }
                long j2 = ((C9735l) interfaceC8714l.getValue()).yandex;
                float f3 = this.f30297l;
                interfaceC13349l2.mo2074volatile(j2, jFloatToRawIntBits2, j, f3, (496 & 16) != 0 ? 0 : 1);
                long j3 = jFloatToRawIntBits2;
                int i2 = (int) (j3 >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i2);
                int i3 = (int) (j >> 32);
                float fIntBitsToFloat2 = Float.intBitsToFloat(i3) - Float.intBitsToFloat(i2);
                float f4 = this.f30303l;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l2.mo2070l() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits((fIntBitsToFloat2 * f4) + fIntBitsToFloat)) << 32);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l2.mo2070l() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(((Float.intBitsToFloat(i3) - Float.intBitsToFloat(i2)) * 0.0f) + Float.intBitsToFloat(i2))) << 32);
                long j4 = j;
                interfaceC13349l2.mo2074volatile(((C9735l) interfaceC8714l2.getValue()).yandex, jFloatToRawIntBits4, jFloatToRawIntBits3, f3, (496 & 16) != 0 ? 0 : 1);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj6 : this.f30302l) {
                    float fFloatValue = ((Number) obj6).floatValue();
                    Boolean boolValueOf = Boolean.valueOf(fFloatValue > f4 || fFloatValue < 0.0f);
                    Object arrayList = linkedHashMap.get(boolValueOf);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(boolValueOf, arrayList);
                    }
                    ((List) arrayList).add(obj6);
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(list.size());
                    int size = list.size();
                    int i4 = 0;
                    while (i4 < size) {
                        arrayList2.add(new C1187l((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (AbstractC2296l.billing(j3, j4, ((Number) list.get(i4)).floatValue()) >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC13349l2.mo2070l() & 4294967295L)))) & 4294967295L)));
                        i4++;
                        it = it;
                        j4 = j4;
                    }
                    Iterator it2 = it;
                    long j5 = j4;
                    interfaceC13349l2.mo2073l(arrayList2, ((C9735l) (zBooleanValue ? interfaceC8714l3 : interfaceC8714l4).getValue()).yandex, f3);
                    it = it2;
                    j4 = j5;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C15505l(InterfaceC13349l interfaceC13349l, C11925l c11925l, C13713l c13713l, float f, float f2, float f3, List list, AbstractC9544l abstractC9544l) {
        this.f30305l = interfaceC13349l;
        this.f30298l = c11925l;
        this.f30299l = c13713l;
        this.f30300l = f;
        this.f30297l = f2;
        this.f30303l = f3;
        this.f30302l = list;
        this.f30304l = abstractC9544l;
    }
}
