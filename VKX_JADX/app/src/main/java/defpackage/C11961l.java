package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: lِْٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11961l extends AbstractC3398l {
    public final Field crashlytics;
    public final Field loadAd;
    public final Field yandex;

    public C11961l(Field field, Field field2, Field field3) {
        this.yandex = field;
        this.loadAd = field2;
        this.crashlytics = field3;
    }

    @Override // defpackage.AbstractC3398l
    public final View crashlytics(InputMethodManager inputMethodManager) {
        try {
            return (View) this.loadAd.get(inputMethodManager);
        } catch (ClassCastException | IllegalAccessException unused) {
            return null;
        }
    }

    @Override // defpackage.AbstractC3398l
    public final Object loadAd(InputMethodManager inputMethodManager) {
        try {
            return this.yandex.get(inputMethodManager);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // defpackage.AbstractC3398l
    public final boolean yandex(InputMethodManager inputMethodManager) {
        try {
            this.crashlytics.set(inputMethodManager, null);
            return true;
        } catch (IllegalAccessException unused) {
            return false;
        }
    }
}
