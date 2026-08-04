package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٟؔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2326l extends C8779l {
    @Override // defpackage.C16489l, defpackage.C2654l, defpackage.AbstractC0559l
    public void loadAd(C11404l c11404l, C11404l c11404l2, Window window, View view, boolean z, boolean z2) {
        AbstractC0593l c6736l;
        AbstractC2829l.yandex(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof AbstractC14374l)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        C1770l c1770l = new C1770l(view);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            c6736l = new C1492l(window, c1770l);
        } else if (i3 >= 30) {
            c6736l = new C10196l(window, c1770l);
        } else {
            c6736l = i3 >= 26 ? new C6736l(window, c1770l) : new C16280l(window, c1770l);
        }
        c6736l.purchase(!z);
        c6736l.amazon(!z2);
    }
}
