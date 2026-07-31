package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؘٝؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5830l implements InterfaceC15244l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C12638l f12283l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12284l;

    public /* synthetic */ C5830l(C12638l c12638l, int i) {
        this.f12284l = i;
        this.f12283l = c12638l;
    }

    @Override // defpackage.InterfaceC15244l
    public final Object remoteconfig(C11644l c11644l) {
        int i = this.f12284l;
        C12638l c12638l = this.f12283l;
        switch (i) {
            case 0:
                return new C2762l((Context) c11644l.remoteconfig(Context.class), ((C14184l) c11644l.remoteconfig(C14184l.class)).amazon(), c11644l.m3178l(C15617l.class), c11644l.mo619l(C8404l.class), (Executor) c11644l.mo622l(c12638l));
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(c12638l, c11644l);
        }
    }
}
