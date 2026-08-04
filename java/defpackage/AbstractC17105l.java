package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lْٗٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC17105l {
    public static final Map yandex = AbstractC8676l.remoteconfig(new C8195l("PACKAGE", EnumSet.noneOf(EnumC6021l.class)), new C8195l("TYPE", EnumSet.of(EnumC6021l.CLASS, EnumC6021l.FILE)), new C8195l("ANNOTATION_TYPE", EnumSet.of(EnumC6021l.ANNOTATION_CLASS)), new C8195l("TYPE_PARAMETER", EnumSet.of(EnumC6021l.TYPE_PARAMETER)), new C8195l("FIELD", EnumSet.of(EnumC6021l.FIELD)), new C8195l("LOCAL_VARIABLE", EnumSet.of(EnumC6021l.LOCAL_VARIABLE)), new C8195l("PARAMETER", EnumSet.of(EnumC6021l.VALUE_PARAMETER)), new C8195l("CONSTRUCTOR", EnumSet.of(EnumC6021l.CONSTRUCTOR)), new C8195l("METHOD", EnumSet.of(EnumC6021l.FUNCTION, EnumC6021l.PROPERTY_GETTER, EnumC6021l.PROPERTY_SETTER)), new C8195l("TYPE_USE", EnumSet.of(EnumC6021l.TYPE)));
    public static final Map loadAd = AbstractC8676l.remoteconfig(new C8195l("RUNTIME", EnumC10693l.f21704l), new C8195l("CLASS", EnumC10693l.f21703l), new C8195l("SOURCE", EnumC10693l.f21702l));

    public static C14005l yandex(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C15917l) {
                arrayList.add(obj);
            }
        }
        ArrayList<EnumC6021l> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) yandex.get(C3498l.purchase(((C15917l) it.next()).loadAd.name()).loadAd());
            if (iterable == null) {
                iterable = C5746l.f12138l;
            }
            AbstractC3984l.license(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
        for (EnumC6021l enumC6021l : arrayList2) {
            C2312l c2312l = AbstractC3333l.Signature;
            arrayList3.add(new C17452l(new C3624l(c2312l.loadAd(), c2312l.yandex.mopub()), C3498l.purchase(enumC6021l.name())));
        }
        return new C14005l(arrayList3, C2100l.f4711l);
    }
}
