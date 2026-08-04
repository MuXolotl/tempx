package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.ArrayList;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؚِۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7206l {
    public static boolean amazon;
    public static final ArrayList crashlytics;
    public static final SharedPreferences loadAd;
    public static final C7206l yandex = new C7206l();

    static {
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        loadAd = vKXApplication.getSharedPreferences("VKXHintSystem", 0);
        crashlytics = new ArrayList();
    }

    public static void amazon(EnumC10788l enumC10788l) {
        SharedPreferences.Editor editorEdit = loadAd.edit();
        editorEdit.putBoolean(enumC10788l.name(), true);
        editorEdit.apply();
    }

    public static boolean crashlytics(EnumC10788l enumC10788l) {
        return loadAd.getBoolean(enumC10788l.name(), false);
    }

    public final synchronized void loadAd() {
        ArrayList arrayList = crashlytics;
        if (arrayList.isEmpty()) {
            amazon = false;
            return;
        }
        C8195l c8195l = (C8195l) arrayList.remove(0);
        View view = (View) c8195l.f17098l;
        C5514l c5514l = new C5514l((EnumC10788l) c8195l.f17097l, view, 11);
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0254l(c5514l, view, 1));
        } else {
            c5514l.invoke();
        }
    }

    public final synchronized void yandex(View view, EnumC10788l enumC10788l) {
        if (crashlytics(enumC10788l)) {
            return;
        }
        VKXApplication.f36625l.post(new RunnableC10311l(view, enumC10788l, 19));
    }
}
