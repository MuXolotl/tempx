package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import defpackage.C11467l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC15757l;
import defpackage.InterfaceC6934l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class OnContentRefreshDelegateImpl implements InterfaceC6934l {
    private final IOnContentRefreshListener mListener;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @InterfaceC12208l
    public static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final InterfaceC15757l mOnContentRefreshListener;

        public OnContentRefreshListenerStub(InterfaceC15757l interfaceC15757l) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onContentRefreshRequested$0() {
            throw null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onClick", new yandex(this, 2));
        }
    }

    private OnContentRefreshDelegateImpl(InterfaceC15757l interfaceC15757l) {
        this.mListener = new OnContentRefreshListenerStub(interfaceC15757l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static InterfaceC6934l create(InterfaceC15757l interfaceC15757l) {
        return new OnContentRefreshDelegateImpl(interfaceC15757l);
    }

    public void sendContentRefreshRequested(InterfaceC12745l interfaceC12745l) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
