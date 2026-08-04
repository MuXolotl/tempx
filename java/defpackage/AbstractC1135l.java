package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.List;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؒٙٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1135l {
    public static InterfaceC17242l amazon(InterfaceC17242l interfaceC17242l, C2403l c2403l) {
        return interfaceC17242l.premium(new C16699l(c2403l));
    }

    public static final InterfaceC0798l crashlytics(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            InterfaceC0798l interfaceC0798l = tag instanceof InterfaceC0798l ? (InterfaceC0798l) tag : null;
            if (interfaceC0798l != null) {
                return interfaceC0798l;
            }
            Object objBilling = AbstractC6710l.billing(view);
            view = objBilling instanceof View ? (View) objBilling : null;
        }
        return null;
    }

    public static InterfaceC17242l loadAd(InterfaceC17242l interfaceC17242l) {
        return interfaceC17242l.premium(new C15217l(new C8864l(7)));
    }

    public static C9188l purchase(int i, boolean z, C16158l c16158l, int i2) {
        boolean z2 = (i2 & 1) != 0 ? false : z;
        boolean z3 = (i2 & 2) == 0;
        if ((i2 & 4) != 0) {
            c16158l = null;
        }
        return new C9188l(i, z3, z2, c16158l != null ? Collections.singleton(c16158l) : null, 34);
    }

    public static void yandex(C13006l c13006l, List list, C6931l c6931l) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iCrashlytics = c13006l.crashlytics((C12317l) list.get(i));
            int iM3521for = c13006l.m3521for(c13006l.loadAd, c13006l.ads(iCrashlytics));
            Object obj = iM3521for < c13006l.mopub(c13006l.loadAd, c13006l.ads(iCrashlytics + 1)) ? c13006l.crashlytics[c13006l.admob(iM3521for)] : C1867l.yandex;
            C4224l c4224l = obj instanceof C4224l ? (C4224l) obj : null;
            if (c4224l != null) {
                c4224l.yandex = c6931l;
            }
        }
    }
}
