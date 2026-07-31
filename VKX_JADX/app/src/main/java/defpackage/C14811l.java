package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lُٔؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14811l implements InterfaceC5291l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C2314l f28979l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC4946l f28980l;

    public C14811l(AbstractC4946l abstractC4946l) {
        this.f28980l = abstractC4946l;
        abstractC4946l.yandex();
    }

    @Override // defpackage.InterfaceC1925l
    public final List getParameters() {
        return C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC1925l
    public final boolean premium() {
        return false;
    }

    @Override // defpackage.InterfaceC1925l
    public final /* bridge */ /* synthetic */ InterfaceC15234l pro() {
        return null;
    }

    @Override // defpackage.InterfaceC1925l
    public final AbstractC16860l subs() {
        return this.f28980l.loadAd().mo1339native().subs();
    }

    @Override // defpackage.InterfaceC5291l
    /* JADX INFO: renamed from: synchronized */
    public final AbstractC4946l mo1127synchronized() {
        return this.f28980l;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f28980l + ')';
    }

    @Override // defpackage.InterfaceC1925l
    public final Collection yandex() {
        AbstractC4946l abstractC4946l = this.f28980l;
        return Collections.singletonList(abstractC4946l.yandex() == 3 ? abstractC4946l.loadAd() : subs().metrica());
    }
}
