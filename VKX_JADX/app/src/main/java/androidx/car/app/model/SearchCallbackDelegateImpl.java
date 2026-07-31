package androidx.car.app.model;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import defpackage.C11467l;
import defpackage.InterfaceC10762l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC1526l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class SearchCallbackDelegateImpl implements InterfaceC10762l {
    private final ISearchCallback mStubCallback;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @InterfaceC12208l
    public static class SearchCallbackStub extends ISearchCallback.Stub {
        private final InterfaceC1526l mCallback;

        public SearchCallbackStub(InterfaceC1526l interfaceC1526l) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSearchSubmitted$1(String str) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSearchTextChanged$0(String str) {
            throw null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onSearchSubmitted", new billing(this, str, 0));
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.billing.crashlytics(iOnDoneCallback, "onSearchTextChanged", new billing(this, str, 1));
        }
    }

    private SearchCallbackDelegateImpl(InterfaceC1526l interfaceC1526l) {
        this.mStubCallback = new SearchCallbackStub(interfaceC1526l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static InterfaceC10762l create(InterfaceC1526l interfaceC1526l) {
        return new SearchCallbackDelegateImpl(interfaceC1526l);
    }

    public void sendSearchSubmitted(String str, InterfaceC12745l interfaceC12745l) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchSubmitted(str, androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    public void sendSearchTextChanged(String str, InterfaceC12745l interfaceC12745l) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchTextChanged(str, androidx.car.app.utils.billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
