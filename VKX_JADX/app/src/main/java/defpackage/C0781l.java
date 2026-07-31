package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؒؒؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0781l extends C7662l {
    @Override // defpackage.C7662l
    public final Set admob(C3498l c3498l) {
        throw new IllegalStateException(this.loadAd + ", required name: " + c3498l);
    }

    @Override // defpackage.C7662l, defpackage.InterfaceC7637l
    public final Set amazon() {
        throw new IllegalStateException();
    }

    @Override // defpackage.C7662l, defpackage.InterfaceC7637l
    public final /* bridge */ /* synthetic */ Collection billing(C3498l c3498l, EnumC11300l enumC11300l) {
        subs(c3498l);
        throw null;
    }

    @Override // defpackage.C7662l, defpackage.InterfaceC7637l
    public final Collection crashlytics(C18186l c18186l, Function1 function1) {
        throw new IllegalStateException(this.loadAd);
    }

    @Override // defpackage.C7662l, defpackage.InterfaceC7637l
    public final Set loadAd() {
        throw new IllegalStateException();
    }

    @Override // defpackage.C7662l, defpackage.InterfaceC7637l
    public final Set mopub() {
        throw new IllegalStateException();
    }

    @Override // defpackage.C7662l, defpackage.InterfaceC7637l
    public final InterfaceC15234l purchase(C3498l c3498l, EnumC11300l enumC11300l) {
        throw new IllegalStateException(this.loadAd + ", required name: " + c3498l);
    }

    @Override // defpackage.C7662l
    public final Set subs(C3498l c3498l) {
        throw new IllegalStateException(this.loadAd + ", required name: " + c3498l);
    }

    @Override // defpackage.C7662l
    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("ThrowingScope{"), this.loadAd, '}');
    }

    @Override // defpackage.C7662l, defpackage.InterfaceC7637l
    public final /* bridge */ /* synthetic */ Collection yandex(C3498l c3498l, EnumC11300l enumC11300l) {
        admob(c3498l);
        throw null;
    }
}
