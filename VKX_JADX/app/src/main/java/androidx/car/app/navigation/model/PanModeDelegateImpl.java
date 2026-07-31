package androidx.car.app.navigation.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.billing;
import defpackage.C11467l;
import defpackage.InterfaceC11652l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC4060l;
import defpackage.InterfaceC4441l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class PanModeDelegateImpl implements InterfaceC4441l {
    private final IPanModeListener mStub;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @InterfaceC12208l
    public static class PanModeListenerStub extends IPanModeListener.Stub {
        private final InterfaceC4060l mListener;

        public PanModeListenerStub(InterfaceC4060l interfaceC4060l) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onPanModeChanged$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, IOnDoneCallback iOnDoneCallback) {
            billing.crashlytics(iOnDoneCallback, "onPanModeChanged", new InterfaceC11652l() { // from class: androidx.car.app.navigation.model.yandex
                @Override // defpackage.InterfaceC11652l
                public final Object yandex() {
                    return this.f312l.lambda$onPanModeChanged$0(z);
                }
            });
        }
    }

    private PanModeDelegateImpl(InterfaceC4060l interfaceC4060l) {
        this.mStub = new PanModeListenerStub(interfaceC4060l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static InterfaceC4441l create(InterfaceC4060l interfaceC4060l) {
        return new PanModeDelegateImpl(interfaceC4060l);
    }

    public void sendPanModeChanged(boolean z, InterfaceC12745l interfaceC12745l) {
        try {
            IPanModeListener iPanModeListener = this.mStub;
            Objects.requireNonNull(iPanModeListener);
            iPanModeListener.onPanModeChanged(z, billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
