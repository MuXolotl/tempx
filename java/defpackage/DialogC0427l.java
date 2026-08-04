package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0427l extends Dialog implements InterfaceC3177l, InterfaceC14926l, InterfaceC6923l, InterfaceC3187l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C8688l f1556l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C13568l f1557l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C5268l f1558l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C8688l f1559l;

    public DialogC0427l(Context context, int i) {
        super(context, i);
        this.f1557l = new C13568l(new C17464l(this, new C5767l(2, this)));
        final int i2 = 0;
        this.f1556l = new C8688l(new Function0(this) { // from class: lؑۖؒ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ DialogC0427l f1814l;

            {
                this.f1814l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                DialogC0427l dialogC0427l = this.f1814l;
                switch (i3) {
                    case 0:
                        C9349l c9349l = new C9349l();
                        dialogC0427l.getNavigationEventDispatcher().loadAd(c9349l);
                        return c9349l;
                    default:
                        return new C16390l(new RunnableC16112l(18, dialogC0427l));
                }
            }
        });
        final int i3 = 1;
        this.f1559l = new C8688l(new Function0(this) { // from class: lؑۖؒ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ DialogC0427l f1814l;

            {
                this.f1814l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                DialogC0427l dialogC0427l = this.f1814l;
                switch (i4) {
                    case 0:
                        C9349l c9349l = new C9349l();
                        dialogC0427l.getNavigationEventDispatcher().loadAd(c9349l);
                        return c9349l;
                    default:
                        return new C16390l(new RunnableC16112l(18, dialogC0427l));
                }
            }
        });
    }

    public static void crashlytics(DialogC0427l dialogC0427l) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        purchase();
        super.addContentView(view, layoutParams);
    }

    public final C5268l amazon() {
        C5268l c5268l = this.f1558l;
        if (c5268l != null) {
            return c5268l;
        }
        C5268l c5268l2 = new C5268l(this, true);
        this.f1558l = c5268l2;
        return c5268l2;
    }

    @Override // defpackage.InterfaceC6923l
    public final C1527l getNavigationEventDispatcher() {
        return yandex().loadAd().crashlytics;
    }

    @Override // defpackage.InterfaceC3177l
    public final AbstractC6475l loadAd() {
        return amazon();
    }

    @Override // defpackage.InterfaceC3187l
    public final C18396l metrica() {
        return (C18396l) this.f1557l.f26580l;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((C9349l) this.f1556l.getValue()).yandex();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            yandex().crashlytics(getOnBackInvokedDispatcher());
        }
        this.f1557l.startapp(bundle);
        amazon().purchase(EnumC14812l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        this.f1557l.adcel(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        amazon().purchase(EnumC14812l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        amazon().purchase(EnumC14812l.ON_DESTROY);
        this.f1558l = null;
        super.onStop();
    }

    public final void purchase() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        purchase();
        super.setContentView(i);
    }

    @Override // defpackage.InterfaceC14926l
    public final C16390l yandex() {
        return (C16390l) this.f1559l.getValue();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        purchase();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        purchase();
        super.setContentView(view, layoutParams);
    }
}
