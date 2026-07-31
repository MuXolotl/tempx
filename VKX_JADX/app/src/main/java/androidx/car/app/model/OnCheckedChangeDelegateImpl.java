package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import defpackage.C11467l;
import defpackage.InterfaceC11652l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC17319l;
import defpackage.InterfaceC8228l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class OnCheckedChangeDelegateImpl implements InterfaceC17319l {
    private final IOnCheckedChangeListener mStub;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @InterfaceC12208l
    public static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final InterfaceC8228l mListener;

        public OnCheckedChangeListenerStub(InterfaceC8228l interfaceC8228l) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onCheckedChange$0(boolean z) {
            throw null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onCheckedChange", new InterfaceC11652l() { // from class: androidx.car.app.model.amazon
                @Override // defpackage.InterfaceC11652l
                public final Object yandex() {
                    return this.f295l.lambda$onCheckedChange$0(z);
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(InterfaceC8228l interfaceC8228l) {
        this.mStub = new OnCheckedChangeListenerStub(interfaceC8228l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static InterfaceC17319l create(InterfaceC8228l interfaceC8228l) {
        return new OnCheckedChangeDelegateImpl(interfaceC8228l);
    }

    public void sendCheckedChange(boolean z, InterfaceC12745l interfaceC12745l) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            Objects.requireNonNull(iOnCheckedChangeListener);
            iOnCheckedChangeListener.onCheckedChange(z, androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}
