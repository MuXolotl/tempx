package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: lٗؖؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC16899l extends AbstractC3868l implements Runnable {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public ListenableFuture f32955l;

    @Override // defpackage.AbstractC2722l
    public final void crashlytics() {
        this.f32955l = null;
    }

    @Override // defpackage.AbstractC2722l
    public final String isPro() {
        ListenableFuture listenableFuture = this.f32955l;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f32955l;
        if (listenableFuture != null) {
            vip(listenableFuture);
        }
    }
}
