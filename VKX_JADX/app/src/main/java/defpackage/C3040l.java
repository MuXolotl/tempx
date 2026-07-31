package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: lؔۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3040l extends WindowInsetsAnimation$Callback {
    public final HashMap amazon;
    public ArrayList crashlytics;
    public List loadAd;
    public final AbstractC15029l yandex;

    public C3040l(AbstractC15029l abstractC15029l) {
        super(abstractC15029l.f29555l);
        this.amazon = new HashMap();
        this.yandex = abstractC15029l;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.yandex.smaato(yandex(windowInsetsAnimation));
        this.amazon.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.yandex.remoteconfig(yandex(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.crashlytics;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.crashlytics = arrayList2;
            this.loadAd = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            C12902l c12902lYandex = yandex(windowInsetsAnimation);
            c12902lYandex.yandex.amazon(windowInsetsAnimation.getFraction());
            this.crashlytics.add(c12902lYandex);
        }
        return this.yandex.vip(C1473l.admob(windowInsets, null), this.loadAd).mopub();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C13645l c13645lMetrica = this.yandex.metrica(yandex(windowInsetsAnimation), new C13645l(bounds));
        c13645lMetrica.getClass();
        AbstractC14817l.crashlytics();
        return AbstractC14817l.yandex(((C15496l) c13645lMetrica.f26671l).amazon(), ((C15496l) c13645lMetrica.f26670l).amazon());
    }

    public final C12902l yandex(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.amazon;
        C12902l c12902l = (C12902l) map.get(windowInsetsAnimation);
        if (c12902l != null) {
            return c12902l;
        }
        C12902l c12902l2 = new C12902l(0, null, 0L);
        c12902l2.yandex = new C13499l(windowInsetsAnimation);
        map.put(windowInsetsAnimation, c12902l2);
        return c12902l2;
    }
}
