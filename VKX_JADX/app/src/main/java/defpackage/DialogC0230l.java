package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lَؑۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0230l extends DialogC0427l implements InterfaceC17378l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public LayoutInflaterFactory2C14405l f1212l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C6056l f1213l;

    /* JADX WARN: Type inference failed for: r2v2, types: [lؘۣٓ] */
    public DialogC0230l(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.f1213l = new InterfaceC10671l() { // from class: lؘۣٓ
            @Override // defpackage.InterfaceC10671l
            public final boolean purchase(KeyEvent keyEvent) {
                return this.f12826l.mopub(keyEvent);
            }
        };
        AbstractC10242l abstractC10242lBilling = billing();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C14405l) abstractC10242lBilling).f28189l = i;
        abstractC10242lBilling.mopub();
    }

    @Override // defpackage.DialogC0427l, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        purchase();
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) billing();
        layoutInflaterFactory2C14405l.advert();
        ((ViewGroup) layoutInflaterFactory2C14405l.f28201l.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C14405l.f28171l.yandex(layoutInflaterFactory2C14405l.f28203l.getCallback());
    }

    public final AbstractC10242l billing() {
        if (this.f1212l == null) {
            ExecutorC12937l executorC12937l = AbstractC10242l.f20861l;
            this.f1212l = new LayoutInflaterFactory2C14405l(getContext(), getWindow(), this, this);
        }
        return this.f1212l;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        billing().admob();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC16763l.mopub(this.f1213l, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) billing();
        layoutInflaterFactory2C14405l.advert();
        return layoutInflaterFactory2C14405l.f28203l.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) billing();
        if (layoutInflaterFactory2C14405l.f28209l != null) {
            layoutInflaterFactory2C14405l.appmetrica();
            layoutInflaterFactory2C14405l.f28209l.getClass();
            layoutInflaterFactory2C14405l.inmobi(0);
        }
    }

    public final boolean mopub(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.DialogC0427l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        billing().amazon();
        super.onCreate(bundle);
        billing().mopub();
    }

    @Override // defpackage.DialogC0427l, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C14405l layoutInflaterFactory2C14405l = (LayoutInflaterFactory2C14405l) billing();
        layoutInflaterFactory2C14405l.appmetrica();
        C5184l c5184l = layoutInflaterFactory2C14405l.f28209l;
        if (c5184l != null) {
            c5184l.tapsense = false;
            C14307l c14307l = c5184l.subscription;
            if (c14307l != null) {
                c14307l.yandex();
            }
        }
    }

    @Override // defpackage.DialogC0427l, android.app.Dialog
    public final void setContentView(int i) {
        purchase();
        billing().firebase(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        billing().vip(getContext().getString(i));
    }

    @Override // defpackage.DialogC0427l, android.app.Dialog
    public final void setContentView(View view) {
        purchase();
        billing().smaato(view);
    }

    @Override // defpackage.DialogC0427l, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        purchase();
        billing().remoteconfig(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        billing().vip(charSequence);
    }
}
