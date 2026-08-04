package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: renamed from: lؘٜۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5828l implements InterfaceC4356l {
    public final AutofillValue yandex;

    public C5828l(AutofillValue autofillValue) {
        this.yandex = autofillValue;
    }

    public final CharSequence loadAd() {
        if (this.yandex.isText()) {
            return this.yandex.getTextValue();
        }
        return null;
    }

    public final Boolean yandex() {
        if (this.yandex.isToggle()) {
            return Boolean.valueOf(this.yandex.getToggleValue());
        }
        return null;
    }
}
