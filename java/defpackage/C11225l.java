package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.ui.ThemedRecyclerView;
import ua.itaysonlab.vkxreborn.ui.ThemedScrollView;
import ua.itaysonlab.vkxreborn.ui.ThemedViewPager;

/* JADX INFO: renamed from: lُٟٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11225l implements InterfaceC17639l {
    public static final C11225l yandex = new C11225l();

    @Override // defpackage.InterfaceC17639l
    public final void yandex(Context context) throws Throwable {
        Throwable th;
        C4757l c4757l;
        int i = 1;
        int i2 = 0;
        AbstractC8317l.startapp = (context.getResources().getConfiguration().uiMode & 48) == 32;
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        if (vKXApplication == null) {
            VKXApplication vKXApplication2 = C9967l.f20323l;
            Log.w("LiquidNavigation", "You are passing a non-application for initialization, this can lead to memory leaks");
        }
        C9967l.f20323l = vKXApplication;
        AbstractC12930l.yandex = vKXApplication;
        AbstractC12930l.loadAd = vKXApplication.getResources();
        LayoutInflater.from(vKXApplication);
        LayoutInflater.from(AbstractC12930l.yandex);
        Handler handler = AbstractC13209l.yandex;
        vKXApplication.getDir("themes", 0).mkdirs();
        AbstractC13209l.mopub = vKXApplication.getSharedPreferences("liquidengine", 0);
        ArrayList<C16449l> arrayList = AbstractC13209l.amazon;
        arrayList.clear();
        arrayList.add(C16449l.purchase);
        arrayList.addAll(AbstractC13209l.billing);
        String string = AbstractC13209l.mopub.getString("selected_theme", null);
        if (string != null) {
            for (C16449l c16449l : arrayList) {
                if (c16449l.loadAd.equals(string) && !AbstractC13209l.purchase.loadAd.equals(c16449l.loadAd)) {
                    AbstractC13209l.loadAd(c16449l, null, false);
                    break;
                }
            }
        }
        Iterator it = AbstractC13209l.admob.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
        AbstractC11790l.loadAd = vKXApplication.getSharedPreferences("liquid_system_theme", 0);
        C12463l c12463l = AbstractC6145l.yandex;
        C1503l c1503l = new C1503l(AbstractC7709l.purchase(context.getAssets().open("theme_catalog.json")));
        try {
            C15913l c15913l = AbstractC8237l.amazon;
            c15913l.getClass();
            c4757l = (C4757l) AbstractC10802l.loadAd(c15913l, C4757l.Companion.serializer(), new C6309l(c1503l, i));
            try {
                c1503l.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                c1503l.close();
            } catch (Throwable th4) {
                AbstractC11718l.yandex(th3, th4);
            }
            th = th3;
            c4757l = null;
        }
        if (th != null) {
            throw th;
        }
        for (C6270l c6270l : c4757l.crashlytics) {
            AbstractC6145l.yandex.yandex(c6270l);
            for (C6417l c6417l : c6270l.loadAd) {
                AbstractC6145l.crashlytics.firebase(Integer.valueOf(c6417l.yandex), c6417l);
            }
        }
        for (C18571l c18571l : c4757l.amazon) {
            AbstractC6145l.loadAd.yandex(c18571l);
            for (C9894l c9894l : c18571l.loadAd) {
                AbstractC6145l.amazon.firebase(Integer.valueOf(c9894l.yandex), c9894l);
            }
        }
        int i3 = 3;
        C3797l c3797l = new C3797l(3);
        c3797l.f7902l = new C1414l(450.0f, 0.85f);
        C9967l.setSpringModule(c3797l);
        C9967l.setDefaultTransformer(InterfaceC9215l.f18962l);
        AbstractC13209l.loadAd = InterfaceC11884l.f23707l;
        SparseIntArray sparseIntArray = AbstractC12930l.crashlytics;
        sparseIntArray.put(R.layout.abc_alert_dialog_material, R.layout.mdc_alert);
        sparseIntArray.put(R.layout.mtrl_alert_dialog, R.layout.mdc_alert);
        sparseIntArray.put(R.layout.preference_category_material, R.layout.mdc_pref_category);
        sparseIntArray.put(R.layout.preference_widget_switch, R.layout.mdc_switch);
        SparseArray sparseArray = InterfaceC6697l.yandex;
        if (sparseArray.indexOfKey(android.R.attr.drawableTint) >= 0) {
            sparseArray.remove(android.R.attr.drawableTint);
        }
        AbstractC13015l.yandex(android.R.attr.drawableTint, new C5437l(i2));
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            if (sparseArray.indexOfKey(android.R.attr.outlineSpotShadowColor) >= 0) {
                sparseArray.remove(android.R.attr.outlineSpotShadowColor);
            }
            AbstractC13015l.yandex(android.R.attr.outlineSpotShadowColor, new C16430l(0));
            if (sparseArray.indexOfKey(android.R.attr.outlineAmbientShadowColor) >= 0) {
                sparseArray.remove(android.R.attr.outlineAmbientShadowColor);
            }
            AbstractC13015l.yandex(android.R.attr.outlineAmbientShadowColor, new C16430l(1));
        }
        if (sparseArray.indexOfKey(R.attr.cardBackgroundColor) >= 0) {
            sparseArray.remove(R.attr.cardBackgroundColor);
        }
        AbstractC13015l.yandex(R.attr.cardBackgroundColor, new C5437l(8));
        if (sparseArray.indexOfKey(R.attr.tabIndicatorColor) >= 0) {
            sparseArray.remove(R.attr.tabIndicatorColor);
        }
        AbstractC13015l.yandex(R.attr.tabIndicatorColor, new C5437l(9));
        if (sparseArray.indexOfKey(R.attr.boxBackgroundColor) >= 0) {
            sparseArray.remove(R.attr.boxBackgroundColor);
        }
        AbstractC13015l.yandex(R.attr.boxBackgroundColor, new C5437l(10));
        if (sparseArray.indexOfKey(R.attr.rippleColor) >= 0) {
            sparseArray.remove(R.attr.rippleColor);
        }
        AbstractC13015l.yandex(R.attr.rippleColor, new C5437l(11));
        if (sparseArray.indexOfKey(android.R.attr.buttonTint) >= 0) {
            sparseArray.remove(android.R.attr.buttonTint);
        }
        AbstractC13015l.yandex(android.R.attr.buttonTint, new C5437l(12));
        if (sparseArray.indexOfKey(R.attr.tint) >= 0) {
            sparseArray.remove(R.attr.tint);
        }
        AbstractC13015l.yandex(R.attr.tint, new C5437l(i));
        if (sparseArray.indexOfKey(R.attr.drawableTint) >= 0) {
            sparseArray.remove(R.attr.drawableTint);
        }
        AbstractC13015l.yandex(R.attr.drawableTint, new C5437l(2));
        if (sparseArray.indexOfKey(R.attr.itemIconTint) >= 0) {
            sparseArray.remove(R.attr.itemIconTint);
        }
        AbstractC13015l.yandex(R.attr.itemIconTint, new C5437l(i3));
        if (sparseArray.indexOfKey(R.attr.itemIconTint) >= 0) {
            sparseArray.remove(R.attr.itemIconTint);
        }
        AbstractC13015l.yandex(R.attr.itemIconTint, new C5437l(4));
        if (sparseArray.indexOfKey(R.attr.iconTint) >= 0) {
            sparseArray.remove(R.attr.iconTint);
        }
        AbstractC13015l.yandex(R.attr.iconTint, new C5437l(5));
        if (sparseArray.indexOfKey(R.attr.hintTextColor) >= 0) {
            sparseArray.remove(R.attr.hintTextColor);
        }
        AbstractC13015l.yandex(R.attr.hintTextColor, new C5437l(6));
        if (sparseArray.indexOfKey(R.attr.strokeColor) >= 0) {
            sparseArray.remove(R.attr.strokeColor);
        }
        AbstractC13015l.yandex(R.attr.strokeColor, new C5437l(7));
        AbstractC12930l.admob.add(new C0490l());
        AbstractC12930l.yandex(RecyclerView.class, ThemedRecyclerView.class);
        AbstractC12930l.yandex(AbstractC2361l.class, ThemedViewPager.class);
        if (i4 >= 29) {
            AbstractC12930l.yandex(ScrollView.class, ThemedScrollView.class);
        }
        AbstractC13209l.loadAd(AbstractC8733l.yandex(), null, false);
    }
}
