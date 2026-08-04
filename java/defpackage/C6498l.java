package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import j$.util.Objects;

/* JADX INFO: renamed from: lؙٖٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6498l implements InterfaceC4500l {
    public final View loadAd;
    public final Object yandex;

    public C6498l(ContentCaptureSession contentCaptureSession, View view) {
        this.yandex = contentCaptureSession;
        this.loadAd = view;
    }

    public final void amazon(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8936l.purchase(this.yandex).notifyViewAppeared(viewStructure);
        }
    }

    public final void billing(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.yandex).notifyViewTextChanged(autofillId, str);
        }
    }

    public final C14099l crashlytics(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new C14099l(C8936l.purchase(this.yandex).newVirtualViewStructure(autofillId, j));
        }
        return null;
    }

    public final AutofillId loadAd(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionPurchase = C8936l.purchase(this.yandex);
        C3865l c3865lAmazon = AbstractC17082l.amazon(this.loadAd);
        Objects.requireNonNull(c3865lAmazon);
        return contentCaptureSessionPurchase.newAutofillId(C8339l.purchase(c3865lAmazon.yandex), j);
    }

    public final void purchase(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            C8936l.purchase(this.yandex).notifyViewDisappeared(autofillId);
        }
    }

    public final void yandex() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionPurchase = C8936l.purchase(this.yandex);
            C3865l c3865lAmazon = AbstractC17082l.amazon(this.loadAd);
            Objects.requireNonNull(c3865lAmazon);
            contentCaptureSessionPurchase.notifyViewsDisappeared(C8339l.purchase(c3865lAmazon.yandex), new long[]{Long.MIN_VALUE});
        }
    }
}
