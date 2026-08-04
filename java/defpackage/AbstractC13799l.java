package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: lْۦؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13799l {
    public final CheckableImageButton amazon;
    public final Context crashlytics;
    public final C12124l loadAd;
    public final TextInputLayout yandex;

    public AbstractC13799l(C12124l c12124l) {
        this.yandex = c12124l.f24132l;
        this.loadAd = c12124l;
        this.crashlytics = c12124l.getContext();
        this.amazon = c12124l.f24126l;
    }

    public C2683l admob() {
        return null;
    }

    public int amazon() {
        return 0;
    }

    public View.OnClickListener billing() {
        return null;
    }

    public int crashlytics() {
        return 0;
    }

    public boolean firebase() {
        return false;
    }

    public boolean isPro() {
        return this instanceof C0602l;
    }

    public View.OnFocusChangeListener mopub() {
        return null;
    }

    public View.OnFocusChangeListener purchase() {
        return null;
    }

    public final void startapp() {
        this.loadAd.purchase(false);
    }

    public boolean subs(int i) {
        return true;
    }

    public void adcel() {
    }

    public void ads() {
    }

    public void loadAd() {
    }

    public void yandex() {
    }

    public void metrica(boolean z) {
    }

    public void remoteconfig(C15685l c15685l) {
    }

    public void smaato(EditText editText) {
    }

    public void vip(AccessibilityEvent accessibilityEvent) {
    }
}
