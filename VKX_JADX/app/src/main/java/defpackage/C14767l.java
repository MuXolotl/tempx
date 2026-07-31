package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lٌٔؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14767l extends AbstractC18727l {
    public final InterfaceC10408l crashlytics;

    public C14767l(InterfaceC10408l interfaceC10408l) {
        super(interfaceC10408l);
        this.crashlytics = interfaceC10408l;
    }

    @Override // defpackage.AbstractC18727l, defpackage.InterfaceC10408l
    public final ListenableFuture amazon(float f) {
        return this.crashlytics.amazon(f);
    }

    @Override // defpackage.AbstractC18727l, defpackage.InterfaceC10408l
    public final ListenableFuture billing(float f) {
        return this.crashlytics.billing(f);
    }

    @Override // defpackage.AbstractC18727l, defpackage.InterfaceC10408l
    public final ListenableFuture isPro(boolean z) {
        return this.crashlytics.isPro(z);
    }

    @Override // defpackage.AbstractC18727l, defpackage.InterfaceC10408l
    public final ListenableFuture subs(C0093l c0093l) {
        return this.crashlytics.subs(c0093l);
    }
}
