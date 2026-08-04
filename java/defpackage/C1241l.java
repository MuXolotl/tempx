package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.Unit;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٟؒۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1241l implements InterfaceC3685l {
    public static boolean mopub = true;
    public boolean amazon;
    public final ComponentCallbacks2C14676l billing;
    public C1593l crashlytics;
    public final Object loadAd = new Object();
    public C10023l purchase;
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l yandex;

    public C1241l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        this.yandex = viewTreeObserverOnGlobalLayoutListenerC13840l;
        ComponentCallbacks2C14676l componentCallbacks2C14676l = new ComponentCallbacks2C14676l(0, this);
        this.billing = componentCallbacks2C14676l;
        if (viewTreeObserverOnGlobalLayoutListenerC13840l.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC13840l.getContext();
            if (!this.amazon) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C14676l);
                this.amazon = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC13840l.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC11783l(0, this));
    }

    public static final void amazon(C1241l c1241l) {
        C10023l c10023l = c1241l.purchase;
        if (c10023l != null) {
            synchronized (c10023l) {
                try {
                    C13660l c13660l = (C13660l) c10023l.f20419l;
                    if (c13660l != null) {
                        c13660l.yandex();
                    }
                    c10023l.f20418l = null;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c1241l.purchase = null;
    }

    @Override // defpackage.InterfaceC3685l
    public final C11925l crashlytics() {
        InterfaceC0285l c12828l;
        InterfaceC0285l c18270l;
        C11925l c11925l;
        synchronized (this.loadAd) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.yandex;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    AbstractC11880l.advert(viewTreeObserverOnGlobalLayoutListenerC13840l);
                }
                if (i >= 29) {
                    c18270l = new C18270l();
                } else {
                    if (mopub) {
                        try {
                            c12828l = new C9515l(this.yandex, new C10383l(), new C13601l());
                        } catch (Throwable unused) {
                            mopub = false;
                            c12828l = new C12828l(purchase(this.yandex));
                        }
                    } else {
                        c12828l = new C12828l(purchase(this.yandex));
                    }
                    c18270l = c12828l;
                }
                c11925l = new C11925l(c18270l);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11925l;
    }

    @Override // defpackage.InterfaceC3685l
    public final C10023l loadAd() {
        C10023l c10023l = this.purchase;
        if (c10023l != null) {
            return c10023l;
        }
        C10023l c10023l2 = new C10023l();
        this.purchase = c10023l2;
        return c10023l2;
    }

    public final AbstractC3059l purchase(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l) {
        C1593l c1593l = this.crashlytics;
        if (c1593l != null) {
            return c1593l;
        }
        C1593l c1593l2 = new C1593l(viewTreeObserverOnGlobalLayoutListenerC13840l.getContext());
        c1593l2.setClipChildren(false);
        c1593l2.setClipToPadding(false);
        c1593l2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewTreeObserverOnGlobalLayoutListenerC13840l.addView(c1593l2, -1);
        this.crashlytics = c1593l2;
        return c1593l2;
    }

    @Override // defpackage.InterfaceC3685l
    public final void yandex(C11925l c11925l) {
        synchronized (this.loadAd) {
            if (!c11925l.subscription) {
                c11925l.subscription = true;
                c11925l.loadAd();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
