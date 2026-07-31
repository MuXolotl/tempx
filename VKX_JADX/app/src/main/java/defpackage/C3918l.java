package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: lۣؖؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3918l extends AbstractC6139l implements InterfaceC13079l, InterfaceC2226l {
    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters */
    public final void m1448l(InterfaceC1388l interfaceC1388l) {
        try {
            m1451l(m1449l(interfaceC1388l, "TRUEPREDICATE", new Object[0]).crashlytics());
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !AbstractC12024l.appmetrica(message, "not part of this configuration schema", false)) {
                throw e;
            }
            C8339l.metrica(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: lًٖۘ, reason: contains not printable characters */
    public final C14649l m1449l(InterfaceC1388l interfaceC1388l, String str, Object... objArr) {
        return AbstractC2812l.loadAd(this, interfaceC1388l, str, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public final InterfaceC7457l m1450l(InterfaceC7457l interfaceC7457l) {
        C5501l c5501l = ((C12125l) this.f33215l).billing;
        C6067l c6067lRemoteconfig = super.remoteconfig();
        int i = AbstractC5661l.yandex;
        return (InterfaceC7457l) AbstractC5661l.yandex(c5501l, c6067lRemoteconfig, interfaceC7457l, 2, new LinkedHashMap());
    }

    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters */
    public final void m1451l(InterfaceC2329l interfaceC2329l) {
        AbstractC15960l.crashlytics(interfaceC2329l).amazon();
    }

    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters */
    public final boolean m1452l() {
        long ptr$cinterop_release = ((LongPointerWrapper) super.remoteconfig().f12835l).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        return realmcJNI.realm_is_writable(ptr$cinterop_release);
    }

    @Override // defpackage.AbstractC6139l, defpackage.AbstractC17054l, defpackage.InterfaceC13079l
    public final InterfaceC7832l remoteconfig() {
        return super.remoteconfig();
    }
}
