package defpackage;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٌّؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8733l {
    public static void loadAd(SparseIntArray sparseIntArray, int i, int i2) {
        if (sparseIntArray.indexOfKey(i) >= 0) {
            return;
        }
        sparseIntArray.put(i, i2);
    }

    public static C16449l yandex() {
        String packageName;
        C12463l c12463l = AbstractC6145l.yandex;
        int i = 14;
        C11671l c11671l = new C11671l((InterfaceC15829l) AbstractC16584l.crashlytics().f3601l, 0 == true ? 1 : 0, i);
        C17218l c17218l = C17218l.f33421l;
        C15343l c15343l = (C15343l) AbstractC10999l.subs(c17218l, c11671l);
        int i2 = c15343l.f29993l ? AbstractC8317l.startapp ? c15343l.f29991l : c15343l.f29999l : c15343l.f29996l;
        C13660l c13660l = AbstractC6145l.crashlytics;
        C6417l c6417l = (C6417l) c13660l.mopub(Integer.valueOf(i2));
        if (c6417l == null) {
            c6417l = (C6417l) c13660l.mopub(0);
        }
        C15343l c15343l2 = (C15343l) AbstractC10999l.subs(c17218l, new C11671l((InterfaceC15829l) AbstractC16584l.crashlytics().f3601l, 0 == true ? 1 : 0, i));
        int color = Color.parseColor(AbstractC6145l.yandex(c15343l2.f29993l ? AbstractC8317l.startapp ? c15343l2.f29998l : c15343l2.f29990l : c15343l2.f29995l).crashlytics);
        C15343l c15343l3 = (C15343l) AbstractC10999l.subs(c17218l, new C11671l((InterfaceC15829l) AbstractC16584l.crashlytics().f3601l, 0 == true ? 1 : 0, i));
        boolean z = (AbstractC11173l.crashlytics() && c15343l3.f30000l) ? !AbstractC8317l.startapp : c6417l.amazon;
        C16449l c16449l = new C16449l();
        c6417l.getClass();
        c16449l.loadAd = "vkx_predefined_theme";
        c16449l.crashlytics = !z;
        c16449l.amazon = z;
        SparseIntArray sparseIntArray = c16449l.yandex;
        sparseIntArray.clear();
        for (Map.Entry entry : c6417l.billing.entrySet()) {
            String str = (String) entry.getKey();
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            Resources resources = vKXApplication.getResources();
            String strM3334new = AbstractC12024l.m3334new(str, "@");
            if (AbstractC16648l.isVip(str, "@", false)) {
                packageName = "android";
            } else {
                VKXApplication vKXApplication2 = VKXApplication.f36631l;
                if (vKXApplication2 == null) {
                    vKXApplication2 = null;
                }
                packageName = vKXApplication2.getPackageName();
            }
            sparseIntArray.put(resources.getIdentifier(strM3334new, "attr", packageName), Color.parseColor((String) entry.getValue()));
        }
        if (AbstractC11173l.crashlytics()) {
            boolean z2 = c15343l3.f30000l;
            boolean z3 = c15343l3.f29997l;
            if (z2 || z3) {
                VKXApplication vKXApplication3 = VKXApplication.f36631l;
                C3020l c3020l = new C3020l(vKXApplication3 != null ? vKXApplication3 : null);
                if (c15343l3.f30000l) {
                    sparseIntArray.put(R.attr.bg_primary, c3020l.loadAd(0.11f));
                    sparseIntArray.put(R.attr.nextdock_background, c3020l.loadAd(0.08f));
                    sparseIntArray.put(R.attr.text_primary, c3020l.yandex(8));
                    sparseIntArray.put(R.attr.text_secondary, c3020l.yandex(10));
                    sparseIntArray.put(android.R.attr.windowBackground, c3020l.yandex(7));
                }
                if (z3) {
                    color = c3020l.yandex(1);
                }
            }
        }
        boolean z4 = c15343l3.f29989l;
        Map map = c15343l3.f29992l;
        if (z4) {
            List list = C0072l.f976l;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC3984l.license(arrayList, (List) ((C15093l) it.next()).yandex.f17097l);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (map.containsKey((String) ((C9229l) obj).yandex.f25200l)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList<C8195l> arrayList3 = new ArrayList(AbstractC14055l.billing(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C12823l c12823l = ((C9229l) it2.next()).yandex;
                arrayList3.add(new C8195l((String) c12823l.f25200l, Integer.valueOf(((Number) c12823l.f25198l).intValue())));
            }
            for (C8195l c8195l : arrayList3) {
                try {
                    sparseIntArray.put(((Number) c8195l.f17097l).intValue(), Color.parseColor((String) map.get(c8195l.f17098l)));
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable unused) {
                }
            }
            if (map.containsKey("global_accent")) {
                try {
                    color = Color.parseColor((String) map.get("global_accent"));
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable unused2) {
                }
            }
        }
        sparseIntArray.put(R.attr.global_accent, color);
        sparseIntArray.put(R.attr.colorAccent, color);
        sparseIntArray.put(R.attr.colorPrimary, color);
        sparseIntArray.put(R.attr.colorSecondary, color);
        sparseIntArray.put(R.attr.colorControlActivated, color);
        sparseIntArray.put(android.R.attr.colorAccent, color);
        sparseIntArray.put(android.R.attr.colorPrimary, color);
        loadAd(sparseIntArray, R.attr.pref_card_bg, sparseIntArray.get(R.attr.bg_primary));
        loadAd(sparseIntArray, R.attr.bottomsheet_seperator_color, sparseIntArray.get(R.attr.bg_primary));
        loadAd(sparseIntArray, R.attr.bottomsheet_background_color, sparseIntArray.get(android.R.attr.windowBackground));
        loadAd(sparseIntArray, R.attr.bg_page, sparseIntArray.get(android.R.attr.windowBackground));
        if (z) {
            loadAd(sparseIntArray, R.attr.scrim_color, Color.parseColor("#25000000"));
            loadAd(sparseIntArray, R.attr.scrim_color_lighter, Color.parseColor("#50000000"));
            loadAd(sparseIntArray, R.attr.dim_color, Color.parseColor("#20000000"));
            loadAd(sparseIntArray, R.attr.feed_stroke_color, Color.parseColor("#20000000"));
            loadAd(sparseIntArray, R.attr.text_primary, -16777216);
            loadAd(sparseIntArray, R.attr.text_inverse, -1);
            loadAd(sparseIntArray, R.attr.text_secondary, Color.parseColor("#a0000000"));
            loadAd(sparseIntArray, R.attr.modal_card_border, 0);
            loadAd(sparseIntArray, R.attr.reborn_title_color, sparseIntArray.get(R.attr.text_primary));
            sparseIntArray.put(R.attr.modal_card_background, sparseIntArray.get(android.R.attr.windowBackground));
            sparseIntArray.put(R.attr.modal_card_border, sparseIntArray.get(R.attr.bg_primary));
        } else {
            loadAd(sparseIntArray, R.attr.scrim_color_lighter, Color.parseColor("#30ffffff"));
            loadAd(sparseIntArray, R.attr.text_primary, -1);
            loadAd(sparseIntArray, R.attr.text_inverse, -16777216);
            loadAd(sparseIntArray, R.attr.text_secondary, Color.parseColor("#b3ffffff"));
            loadAd(sparseIntArray, R.attr.reborn_title_color, sparseIntArray.get(R.attr.text_primary));
            sparseIntArray.put(R.attr.modal_card_background, sparseIntArray.get(R.attr.bg_primary));
        }
        loadAd(sparseIntArray, android.R.attr.textColorPrimary, sparseIntArray.get(R.attr.text_primary));
        loadAd(sparseIntArray, android.R.attr.textColorSecondary, sparseIntArray.get(R.attr.text_secondary));
        loadAd(sparseIntArray, android.R.attr.textColorAlertDialogListItem, sparseIntArray.get(R.attr.text_primary));
        loadAd(sparseIntArray, R.attr.textColorAlertDialogListItem, sparseIntArray.get(R.attr.text_primary));
        return c16449l;
    }
}
