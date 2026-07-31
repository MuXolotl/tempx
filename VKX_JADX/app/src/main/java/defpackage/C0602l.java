package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑۜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0602l extends AbstractC13799l {
    public ValueAnimator adcel;
    public AutoCompleteTextView admob;
    public ValueAnimator ads;
    public final int billing;
    public final C2683l firebase;
    public final ViewOnFocusChangeListenerC10099l isPro;
    public long metrica;
    public final TimeInterpolator mopub;
    public final int purchase;
    public boolean remoteconfig;
    public boolean smaato;
    public AccessibilityManager startapp;
    public final ViewOnClickListenerC9657l subs;
    public boolean vip;

    public C0602l(C12124l c12124l) {
        super(c12124l);
        this.subs = new ViewOnClickListenerC9657l(3, this);
        this.isPro = new ViewOnFocusChangeListenerC10099l(this, 1);
        this.firebase = new C2683l(21, this);
        this.metrica = Long.MAX_VALUE;
        this.billing = AbstractC15422l.mopub(c12124l.getContext(), R.attr.motionDurationShort3, 67);
        this.purchase = AbstractC15422l.mopub(c12124l.getContext(), R.attr.motionDurationShort3, 50);
        this.mopub = AbstractC15422l.admob(c12124l.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0926l.yandex);
    }

    @Override // defpackage.AbstractC13799l
    public final void adcel() {
        int i = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.mopub;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.billing);
        valueAnimatorOfFloat.addUpdateListener(new C14131l(i, this));
        this.ads = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.purchase);
        valueAnimatorOfFloat2.addUpdateListener(new C14131l(i, this));
        this.adcel = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C7538l(3, this));
        this.startapp = (AccessibilityManager) this.crashlytics.getSystemService("accessibility");
    }

    @Override // defpackage.AbstractC13799l
    public final C2683l admob() {
        return this.firebase;
    }

    @Override // defpackage.AbstractC13799l
    public final void ads() {
        AutoCompleteTextView autoCompleteTextView = this.admob;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.admob.setOnDismissListener(null);
        }
    }

    @Override // defpackage.AbstractC13799l
    public final int amazon() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.AbstractC13799l
    public final View.OnClickListener billing() {
        return this.subs;
    }

    @Override // defpackage.AbstractC13799l
    public final int crashlytics() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.AbstractC13799l
    public final boolean firebase() {
        return this.vip;
    }

    @Override // defpackage.AbstractC13799l
    public final View.OnFocusChangeListener purchase() {
        return this.isPro;
    }

    @Override // defpackage.AbstractC13799l
    public final void remoteconfig(C15685l c15685l) {
        if (this.admob.getInputType() == 0) {
            c15685l.isPro("android.widget.Spinner");
        }
        if (c15685l.mopub()) {
            c15685l.vip(null);
        }
    }

    @Override // defpackage.AbstractC13799l
    public final void smaato(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            C18073l.license("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.admob = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: lؑۤٔ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C0602l c0602l = this.f2173l;
                    long j = jCurrentTimeMillis - c0602l.metrica;
                    if (j < 0 || j > 300) {
                        c0602l.remoteconfig = false;
                    }
                    c0602l.tapsense();
                    c0602l.remoteconfig = true;
                    c0602l.metrica = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.admob.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: lٖؒؓ
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0602l c0602l = this.yandex;
                c0602l.remoteconfig = true;
                c0602l.metrica = System.currentTimeMillis();
                c0602l.subscription(false);
            }
        });
        this.admob.setThreshold(0);
        TextInputLayout textInputLayout = this.yandex;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.startapp.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC15872l.yandex;
            this.amazon.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.AbstractC13799l
    public final boolean subs(int i) {
        return i != 0;
    }

    public final void subscription(boolean z) {
        if (this.vip != z) {
            this.vip = z;
            this.ads.cancel();
            this.adcel.start();
        }
    }

    public final void tapsense() {
        if (this.admob == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.metrica;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.remoteconfig = false;
        }
        if (this.remoteconfig) {
            this.remoteconfig = false;
            return;
        }
        subscription(!this.vip);
        boolean z = this.vip;
        AutoCompleteTextView autoCompleteTextView = this.admob;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.admob.showDropDown();
        }
    }

    @Override // defpackage.AbstractC13799l
    public final void vip(AccessibilityEvent accessibilityEvent) {
        if (this.startapp.isEnabled() && this.admob.getInputType() == 0) {
            boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.vip && !this.admob.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z) {
                tapsense();
                this.remoteconfig = true;
                this.metrica = System.currentTimeMillis();
            }
        }
    }

    @Override // defpackage.AbstractC13799l
    public final void yandex() {
        if (this.startapp.isTouchExplorationEnabled() && this.admob.getInputType() != 0 && !this.amazon.hasFocus()) {
            this.admob.dismissDropDown();
        }
        this.admob.post(new RunnableC11297l(1, this));
    }
}
