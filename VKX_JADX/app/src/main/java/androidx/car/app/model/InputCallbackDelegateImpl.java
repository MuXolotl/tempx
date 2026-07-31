package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import defpackage.C11467l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC5600l;
import defpackage.InterfaceC6815l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class InputCallbackDelegateImpl implements InterfaceC6815l {
    private final IInputCallback mCallback;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @InterfaceC12208l
    public static class OnInputCallbackStub extends IInputCallback.Stub {
        private final InterfaceC5600l mCallback;

        public OnInputCallbackStub(InterfaceC5600l interfaceC5600l) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputSubmitted$0(String str) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputTextChanged$1(String str) {
            throw null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onInputSubmitted", new crashlytics(this, str, 1));
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onInputTextChanged", new crashlytics(this, str, 0));
        }
    }

    private InputCallbackDelegateImpl(InterfaceC5600l interfaceC5600l) {
        this.mCallback = new OnInputCallbackStub(interfaceC5600l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static InterfaceC6815l create(InterfaceC5600l interfaceC5600l) {
        Objects.requireNonNull(interfaceC5600l);
        throw new ClassCastException();
    }

    public void sendInputSubmitted(String str, InterfaceC12745l interfaceC12745l) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputSubmitted(str, androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    public void sendInputTextChanged(String str, InterfaceC12745l interfaceC12745l) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
