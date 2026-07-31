package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import defpackage.C11467l;
import defpackage.InterfaceC11652l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC4315l;
import defpackage.InterfaceC5986l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class OnItemVisibilityChangedDelegateImpl implements InterfaceC5986l {
    private final IOnItemVisibilityChangedListener mStub;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    public static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final InterfaceC4315l mListener;

        public OnItemVisibilityChangedListenerStub(InterfaceC4315l interfaceC4315l) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i, int i2) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onItemVisibilityChanged", new InterfaceC11652l() { // from class: androidx.car.app.model.purchase
                @Override // defpackage.InterfaceC11652l
                public final Object yandex() {
                    return this.f307l.lambda$onItemVisibilityChanged$0(i, i2);
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(InterfaceC4315l interfaceC4315l) {
        this.mStub = new OnItemVisibilityChangedListenerStub(interfaceC4315l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static InterfaceC5986l create(InterfaceC4315l interfaceC4315l) {
        return new OnItemVisibilityChangedDelegateImpl(interfaceC4315l);
    }

    public void sendItemVisibilityChanged(int i, int i2, InterfaceC12745l interfaceC12745l) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            Objects.requireNonNull(iOnItemVisibilityChangedListener);
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}
