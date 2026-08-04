package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lؒۤۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1459l extends C0544l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C1459l f3643l = new C1459l(AbstractC7741l.class, "superclasses", "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;", 1);

    @Override // defpackage.C0544l, defpackage.InterfaceC1835l
    public final Object get(Object obj) {
        List listYandex = ((InterfaceC1388l) obj).yandex();
        ArrayList arrayList = new ArrayList();
        Iterator it = listYandex.iterator();
        while (it.hasNext()) {
            InterfaceC1122l interfaceC1122lMo1616package = ((InterfaceC13012l) it.next()).mo1616package();
            InterfaceC1388l interfaceC1388l = interfaceC1122lMo1616package instanceof InterfaceC1388l ? (InterfaceC1388l) interfaceC1122lMo1616package : null;
            if (interfaceC1388l != null) {
                arrayList.add(interfaceC1388l);
            }
        }
        return arrayList;
    }
}
