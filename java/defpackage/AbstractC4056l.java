package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: lٌِؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4056l {
    public static final LinkedHashSet amazon;
    public static final HashMap crashlytics;
    public static final HashMap loadAd;
    public static final Set yandex;

    static {
        EnumC11882l[] enumC11882lArrValues = EnumC11882l.values();
        ArrayList arrayList = new ArrayList(enumC11882lArrValues.length);
        for (EnumC11882l enumC11882l : enumC11882lArrValues) {
            arrayList.add(enumC11882l.f23704l);
        }
        yandex = AbstractC16901l.m4229l(arrayList);
        EnumC5323l[] enumC5323lArrValues = EnumC5323l.values();
        ArrayList arrayList2 = new ArrayList(enumC5323lArrValues.length);
        for (EnumC5323l enumC5323l : enumC5323lArrValues) {
            arrayList2.add(enumC5323l.f11461l);
        }
        AbstractC16901l.m4229l(arrayList2);
        loadAd = new HashMap();
        crashlytics = new HashMap();
        AbstractC8676l.adcel(new HashMap(AbstractC2200l.firebase(4)), new C8195l[]{new C8195l(EnumC5323l.UBYTEARRAY, C3498l.purchase("ubyteArrayOf")), new C8195l(EnumC5323l.USHORTARRAY, C3498l.purchase("ushortArrayOf")), new C8195l(EnumC5323l.UINTARRAY, C3498l.purchase("uintArrayOf")), new C8195l(EnumC5323l.ULONGARRAY, C3498l.purchase("ulongArrayOf"))});
        EnumC11882l[] enumC11882lArrValues2 = EnumC11882l.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC11882l enumC11882l2 : enumC11882lArrValues2) {
            linkedHashSet.add(enumC11882l2.f23703l.billing());
        }
        amazon = linkedHashSet;
        for (EnumC11882l enumC11882l3 : EnumC11882l.values()) {
            HashMap map = loadAd;
            C3624l c3624l = enumC11882l3.f23703l;
            C3624l c3624l2 = enumC11882l3.f23705l;
            map.put(c3624l, c3624l2);
            crashlytics.put(c3624l2, enumC11882l3.f23703l);
        }
    }

    public static final boolean yandex(AbstractC18041l abstractC18041l) {
        InterfaceC15234l interfaceC15234lPro;
        if (AbstractC12008l.smaato(abstractC18041l) || (interfaceC15234lPro = abstractC18041l.mo1339native().pro()) == null) {
            return false;
        }
        InterfaceC8371l interfaceC8371lSignature = interfaceC15234lPro.Signature();
        return (interfaceC8371lSignature instanceof InterfaceC9921l) && AbstractC8576l.yandex(((AbstractC3740l) ((InterfaceC9921l) interfaceC8371lSignature)).f7826l, AbstractC3974l.firebase) && yandex.contains(interfaceC15234lPro.getName());
    }
}
