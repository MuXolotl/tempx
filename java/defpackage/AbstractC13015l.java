package defpackage;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lّۧۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC13015l {
    static {
        SparseArray sparseArray = InterfaceC6697l.yandex;
    }

    public static void loadAd(int i, final Class cls, final InterfaceC6697l interfaceC6697l) {
        SparseArray sparseArray = InterfaceC6697l.yandex;
        List arrayList = (List) sparseArray.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i, arrayList);
        }
        arrayList.add(new InterfaceC6697l() { // from class: lًۘ٘
            @Override // defpackage.InterfaceC6697l
            public final void yandex(View view, int i2) {
                if (cls.isInstance(view)) {
                    interfaceC6697l.yandex(view, i2);
                }
            }
        });
    }

    public static void yandex(int i, InterfaceC6697l interfaceC6697l) {
        SparseArray sparseArray = InterfaceC6697l.yandex;
        List arrayList = (List) sparseArray.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList();
            sparseArray.put(i, arrayList);
        }
        arrayList.add(interfaceC6697l);
    }
}
