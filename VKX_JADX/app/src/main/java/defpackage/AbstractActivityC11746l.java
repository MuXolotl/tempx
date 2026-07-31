package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: lَِٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC11746l extends Activity implements InterfaceC3177l, InterfaceC10671l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5268l f23523l = new C5268l(this, true);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (AbstractC16763l.billing(decorView, keyEvent)) {
            return true;
        }
        return AbstractC16763l.mopub(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (AbstractC16763l.billing(getWindow().getDecorView(), keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = FragmentC12812l.f25188l;
        AbstractC17537l.loadAd(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C5268l c5268l = this.f23523l;
        c5268l.amazon("setCurrentState");
        c5268l.billing(EnumC8981l.f18520l);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.InterfaceC10671l
    public final boolean purchase(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
