package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import defpackage.C11467l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12394l;
import defpackage.InterfaceC12743l;
import defpackage.InterfaceC12745l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class AlertCallbackDelegateImpl implements InterfaceC12743l {
    private final IAlertCallback mCallback;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @InterfaceC12208l
    public static class AlertCallbackStub extends IAlertCallback.Stub {
        private final InterfaceC12394l mCallback;

        public AlertCallbackStub(InterfaceC12394l interfaceC12394l) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertCancelled$0(int i) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onAlertDismissed$1() {
            throw null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(int i, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onCancel", new loadAd(this, i, 0));
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onDismiss", new yandex(this, 0));
        }
    }

    private AlertCallbackDelegateImpl(InterfaceC12394l interfaceC12394l) {
        this.mCallback = new AlertCallbackStub(interfaceC12394l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static InterfaceC12743l create(InterfaceC12394l interfaceC12394l) {
        return new AlertCallbackDelegateImpl(interfaceC12394l);
    }

    public void sendCancel(int i, InterfaceC12745l interfaceC12745l) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertCancelled(i, androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    public void sendDismiss(InterfaceC12745l interfaceC12745l) {
        try {
            IAlertCallback iAlertCallback = this.mCallback;
            Objects.requireNonNull(iAlertCallback);
            iAlertCallback.onAlertDismissed(androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
