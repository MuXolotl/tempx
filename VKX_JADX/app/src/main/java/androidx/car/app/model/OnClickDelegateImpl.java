package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import defpackage.C11467l;
import defpackage.InterfaceC10793l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC6511l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class OnClickDelegateImpl implements InterfaceC6511l {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class OnClickListenerStub extends IOnClickListener.Stub {
        private final InterfaceC10793l mOnClickListener;

        public OnClickListenerStub(InterfaceC10793l interfaceC10793l) {
            this.mOnClickListener = interfaceC10793l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onClick$0() {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onClick", new yandex(this, 1));
        }
    }

    private OnClickDelegateImpl(InterfaceC10793l interfaceC10793l, boolean z) {
        this.mListener = new OnClickListenerStub(interfaceC10793l);
        this.mIsParkedOnly = z;
    }

    @SuppressLint({"ExecutorRegistration"})
    public static InterfaceC6511l create(InterfaceC10793l interfaceC10793l) {
        return new OnClickDelegateImpl(interfaceC10793l, interfaceC10793l instanceof ParkedOnlyOnClickListener);
    }

    @Override // defpackage.InterfaceC6511l
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(InterfaceC12745l interfaceC12745l) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            Objects.requireNonNull(iOnClickListener);
            iOnClickListener.onClick(androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
