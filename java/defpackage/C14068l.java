package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lَۣٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14068l implements InterfaceC14058l {
    public static final C14068l yandex = new C14068l();

    @Override // defpackage.InterfaceC14058l
    public final Object crashlytics(InterfaceC14029l interfaceC14029l, Object obj) {
        return Boolean.valueOf(((C7814l) obj).f16331l.size() != EnumC14435l.f28276l.pro());
    }

    @Override // defpackage.InterfaceC14058l
    public final Object loadAd(Object obj, C11797l c11797l) {
        boolean z;
        C7814l c7814l = (C7814l) obj;
        List<EnumC14435l> listM4240super = AbstractC16901l.m4240super(EnumC14435l.f28276l);
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listM4240super, 10));
        for (EnumC14435l enumC14435l : listM4240super) {
            int iOrdinal = enumC14435l.ordinal();
            if (iOrdinal != 0) {
                z = true;
                if (iOrdinal == 1) {
                    z = c7814l.f16329l;
                } else if (iOrdinal == 2) {
                    z = c7814l.f16330l;
                } else if (iOrdinal == 3) {
                    z = c7814l.f16326l;
                }
            } else {
                z = c7814l.f16333l;
            }
            arrayList.add(new C18233l(enumC14435l, z, C3844l.f7950l));
        }
        return C7814l.loadAd(c7814l, arrayList, null, 0L, null, 1007);
    }

    @Override // defpackage.InterfaceC14058l
    public final Unit yandex() {
        return Unit.INSTANCE;
    }
}
