package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContentResolver;
import android.os.Build;
import com.samsung.android.app.musiclibrary.ui.widget.TransitionView;

/* JADX INFO: renamed from: lۛؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C18572l implements InterfaceC18325l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final ContentResolver f36258l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f36259l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9478l f36260l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final Activity f36261l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C5848l f36262l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f36263l;

    public C18572l(Activity activity, TransitionView transitionView) {
        this.f36261l = activity;
        int i = activity.getResources().getConfiguration().uiMode;
        int i2 = 0;
        this.f36259l = activity.getResources().getConfiguration().orientation == 2;
        this.f36258l = activity.getContentResolver();
        this.f36262l = new C5848l(this, transitionView.getHandler(), i2);
        C6344l c6344l = new C6344l(0);
        C14689l c14689l = new C14689l(activity);
        transitionView.setCurrentImageDrawable(c14689l);
        this.f36260l = new C9478l(transitionView, c14689l, c6344l);
        c14689l.yandex = new C1412l(15, this);
        if (activity instanceof AbstractActivityC14666l) {
            ((AbstractActivityC14666l) activity).f23523l.yandex(this);
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onDestroy(InterfaceC3177l interfaceC3177l) {
        C9478l c9478l = this.f36260l;
        if (c9478l != null) {
            C10918l c10918l = c9478l.billing;
            ((ValueAnimator) c10918l.subs()).cancel();
            ((ValueAnimator) c10918l.subs()).removeAllListeners();
        }
        interfaceC3177l.loadAd().loadAd(this);
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStart(InterfaceC3177l interfaceC3177l) {
        C9478l c9478l = this.f36260l;
        if (c9478l == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C7504l c7504l = AbstractC4447l.subs;
            InterfaceC14029l interfaceC14029l = null;
            if (c7504l != null) {
                c7504l.ads(null);
            }
            AbstractC4447l.subs = AbstractC10999l.mopub(C1732l.f4136l, null, 0, new C10501l(this, interfaceC14029l, 0), 3);
            return;
        }
        if (!c9478l.purchase) {
            c9478l.purchase = true;
            if (c9478l.amazon) {
                ((ValueAnimator) c9478l.billing.subs()).resume();
            }
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStop(InterfaceC3177l interfaceC3177l) {
        C9478l c9478l = this.f36260l;
        if (c9478l == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            if (c9478l.purchase) {
                c9478l.purchase = false;
            }
        } else {
            C7504l c7504l = AbstractC4447l.subs;
            InterfaceC14029l interfaceC14029l = null;
            if (c7504l != null) {
                c7504l.ads(null);
            }
            AbstractC4447l.subs = AbstractC10999l.mopub(C1732l.f4136l, null, 0, new C10501l(this, interfaceC14029l, 1), 3);
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void mopub() {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onPause(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onResume(InterfaceC3177l interfaceC3177l) {
    }
}
