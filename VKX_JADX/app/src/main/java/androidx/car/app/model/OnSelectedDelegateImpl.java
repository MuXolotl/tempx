package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import defpackage.C11467l;
import defpackage.InterfaceC11285l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC14502l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class OnSelectedDelegateImpl implements InterfaceC11285l {
    private final IOnSelectedListener mStub;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @InterfaceC12208l
    public static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final InterfaceC14502l mListener;

        public OnSelectedListenerStub(InterfaceC14502l interfaceC14502l) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSelected$0(int i) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(int i, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onSelectedListener", new loadAd(this, i, 1));
        }
    }

    private OnSelectedDelegateImpl(InterfaceC14502l interfaceC14502l) {
        this.mStub = new OnSelectedListenerStub(interfaceC14502l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static InterfaceC11285l create(InterfaceC14502l interfaceC14502l) {
        return new OnSelectedDelegateImpl(interfaceC14502l);
    }

    public void sendSelected(int i, InterfaceC12745l interfaceC12745l) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i, androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
