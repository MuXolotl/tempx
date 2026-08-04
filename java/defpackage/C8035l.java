package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lًٖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8035l extends AbstractC16682l implements InterfaceC7042l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C8035l f16723l = new C8035l(C1083l.f2996l);

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: default */
    public final CancellationException mo2153default() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.InterfaceC7042l
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final InterfaceC11791l mo2154l(Function1 function1) {
        return C2114l.f4745l;
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: lْۥٞ */
    public final boolean mo2155l() {
        return false;
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: lَٖؕ */
    public final C5991l mo2156l() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.InterfaceC7042l
    public final boolean mopub() {
        return true;
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: private */
    public final InterfaceC4367l mo2157private(C14750l c14750l) {
        return C2114l.f4745l;
    }

    @Override // defpackage.InterfaceC7042l
    public final InterfaceC11791l signatures(boolean z, Function1 function1, boolean z2) {
        return C2114l.f4745l;
    }

    @Override // defpackage.InterfaceC7042l
    public final boolean start() {
        return false;
    }

    @Override // defpackage.InterfaceC7042l
    /* JADX INFO: renamed from: switch */
    public final Object mo2158switch(InterfaceC14029l interfaceC14029l) {
        throw new UnsupportedOperationException("This job is always active");
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.InterfaceC7042l
    public final void ads(CancellationException cancellationException) {
    }
}
