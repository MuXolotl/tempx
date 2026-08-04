package defpackage;

import j$.time.LocalDateTime;

/* JADX INFO: renamed from: lْؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3373l extends AbstractC17691l {
    public final C15977l yandex;

    public C3373l(C15977l c15977l) {
        this.yandex = c15977l;
    }

    @Override // defpackage.AbstractC17691l
    public final Object amazon(InterfaceC7697l interfaceC7697l) throws Exception {
        C18651l c18651l = (C18651l) interfaceC7697l;
        return new C1735l(LocalDateTime.of(c18651l.yandex.loadAd().f1462l, c18651l.loadAd.crashlytics().f12356l));
    }

    @Override // defpackage.AbstractC17691l
    public final InterfaceC7697l loadAd() {
        return AbstractC14603l.loadAd;
    }

    @Override // defpackage.AbstractC17691l
    public final C15977l yandex() {
        return this.yandex;
    }
}
