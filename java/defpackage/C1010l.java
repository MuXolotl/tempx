package defpackage;

import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lّؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1010l {
    public static final C10060l purchase = new C10060l();
    public final C13562l amazon;
    public final SparseBooleanArray crashlytics = new SparseBooleanArray();
    public final C11154l loadAd = new C11154l(0);
    public final List yandex;

    public C1010l(ArrayList arrayList, List list) {
        this.yandex = list;
        int size = list.size();
        int i = RecyclerView.UNDEFINED_DURATION;
        C13562l c13562l = null;
        for (int i2 = 0; i2 < size; i2++) {
            C13562l c13562l2 = (C13562l) list.get(i2);
            int i3 = c13562l2.purchase;
            if (i3 > i) {
                c13562l = c13562l2;
                i = i3;
            }
        }
        this.amazon = c13562l;
    }
}
