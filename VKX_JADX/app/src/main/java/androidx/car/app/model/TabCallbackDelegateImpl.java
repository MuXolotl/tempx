package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import defpackage.C11467l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC4070l;
import defpackage.InterfaceC6819l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class TabCallbackDelegateImpl implements InterfaceC6819l {
    private final ITabCallback mStubCallback;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @InterfaceC12208l
    public static class TabCallbackStub extends ITabCallback.Stub {
        private final InterfaceC4070l mCallback;

        public TabCallbackStub(InterfaceC4070l interfaceC4070l) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTabSelected$0(String str) {
            throw null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onTabSelected", new crashlytics(this, str, 2));
        }
    }

    private TabCallbackDelegateImpl(InterfaceC4070l interfaceC4070l) {
        this.mStubCallback = new TabCallbackStub(interfaceC4070l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static InterfaceC6819l create(InterfaceC4070l interfaceC4070l) {
        return new TabCallbackDelegateImpl(interfaceC4070l);
    }

    public void sendTabSelected(String str, InterfaceC12745l interfaceC12745l) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            Objects.requireNonNull(iTabCallback);
            iTabCallback.onTabSelected(str, androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
