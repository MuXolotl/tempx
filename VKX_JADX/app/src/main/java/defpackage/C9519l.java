package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٍؚْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9519l {
    public static final ArrayList amazon = new ArrayList();
    public WeakReference crashlytics;
    public SparseArray loadAd;
    public WeakHashMap yandex;

    public final View yandex(View view) {
        int size;
        WeakHashMap weakHashMap = this.yandex;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewYandex = yandex(viewGroup.getChildAt(childCount));
                    if (viewYandex != null) {
                        return viewYandex;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                arrayList.get(size).getClass();
                C18725l.loadAd();
            }
        }
        return null;
    }
}
