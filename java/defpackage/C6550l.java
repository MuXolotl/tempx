package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lؙٜٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6550l extends AbstractC1387l {
    public static final C6550l amazon = new C6550l(0, 2, 1);

    @Override // defpackage.AbstractC1387l
    public final void amazon(C12676l c12676l, InterfaceC3770l interfaceC3770l, C13006l c13006l, C15389l c15389l, InterfaceC3928l interfaceC3928l) {
        int i = ((C6467l) c12676l.admob(0)).yandex;
        List list = (List) c12676l.admob(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            interfaceC3770l.billing(i3, obj);
            interfaceC3770l.Signature(i3, obj);
        }
    }
}
