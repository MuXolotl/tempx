package androidx.car.app.messaging.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.utils.billing;
import defpackage.C11467l;
import defpackage.InterfaceC11652l;
import defpackage.InterfaceC12208l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC17562l;
import defpackage.InterfaceC5141l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
class ConversationCallbackDelegateImpl implements InterfaceC5141l {
    private final IConversationCallback mConversationCallbackBinder;

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @InterfaceC12208l
    public static class ConversationCallbackStub extends IConversationCallback.Stub {
        private final InterfaceC17562l mConversationCallback;

        public ConversationCallbackStub(InterfaceC17562l interfaceC17562l) {
            this.mConversationCallback = interfaceC17562l;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onMarkAsRead$0() {
            this.mConversationCallback.getClass();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTextReply$1(String str) {
            this.mConversationCallback.getClass();
            return null;
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onMarkAsRead(IOnDoneCallback iOnDoneCallback) {
            billing.crashlytics(iOnDoneCallback, "onMarkAsRead", new InterfaceC11652l() { // from class: androidx.car.app.messaging.model.loadAd
                @Override // defpackage.InterfaceC11652l
                public final Object yandex() {
                    return this.f291l.lambda$onMarkAsRead$0();
                }
            });
        }

        @Override // androidx.car.app.messaging.model.IConversationCallback
        public void onTextReply(IOnDoneCallback iOnDoneCallback, final String str) {
            billing.crashlytics(iOnDoneCallback, "onReply", new InterfaceC11652l() { // from class: androidx.car.app.messaging.model.yandex
                @Override // defpackage.InterfaceC11652l
                public final Object yandex() {
                    return this.f293l.lambda$onTextReply$1(str);
                }
            });
        }
    }

    public ConversationCallbackDelegateImpl(InterfaceC17562l interfaceC17562l) {
        this.mConversationCallbackBinder = new ConversationCallbackStub(interfaceC17562l);
    }

    public void sendMarkAsRead(InterfaceC12745l interfaceC12745l) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onMarkAsRead(billing.yandex());
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    public void sendTextReply(String str, InterfaceC12745l interfaceC12745l) {
        try {
            IConversationCallback iConversationCallback = this.mConversationCallbackBinder;
            Objects.requireNonNull(iConversationCallback);
            iConversationCallback.onTextReply(billing.yandex(), str);
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    private ConversationCallbackDelegateImpl() {
        this.mConversationCallbackBinder = null;
    }
}
