package defpackage;

import android.view.autofill.AutofillId;

/* JADX INFO: renamed from: lؗۤٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5265l implements InterfaceC16414l {
    public final AutofillId crashlytics;
    public final C6556l loadAd;
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l yandex;

    public C5265l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, C6556l c6556l) {
        this.yandex = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.loadAd = c6556l;
        viewTreeObserverOnGlobalLayoutListenerC13840l.setImportantForAutofill(1);
        C3865l c3865lAmazon = AbstractC17082l.amazon(viewTreeObserverOnGlobalLayoutListenerC13840l);
        AutofillId autofillId = c3865lAmazon != null ? (AutofillId) c3865lAmazon.yandex : null;
        if (autofillId == null) {
            throw AbstractC5020l.metrica("Required value was null.");
        }
        this.crashlytics = autofillId;
    }
}
