package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: renamed from: lٖ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C17960l implements InterfaceC12202l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ FirebaseMessaging f34946l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34947l;

    public /* synthetic */ C17960l(FirebaseMessaging firebaseMessaging, int i) {
        this.f34947l = i;
        this.f34946l = firebaseMessaging;
    }

    @Override // defpackage.InterfaceC12202l
    public final void amazon(Object obj) {
        boolean z;
        int i = this.f34947l;
        FirebaseMessaging firebaseMessaging = this.f34946l;
        switch (i) {
            case 0:
                C7920l c7920l = (C7920l) obj;
                if (!firebaseMessaging.purchase.isPro() || c7920l.admob.yandex() == null) {
                    return;
                }
                synchronized (c7920l) {
                    z = c7920l.mopub;
                }
                if (z) {
                    return;
                }
                c7920l.admob(0L);
                return;
            default:
                C2220l c2220l = (C2220l) obj;
                if (c2220l != null) {
                    AbstractC16670l.firebase(c2220l.f4901l);
                    firebaseMessaging.purchase();
                    return;
                }
                return;
        }
    }
}
