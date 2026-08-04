package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓۡۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14477l implements InterfaceC5763l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0360l f28345l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C14477l f28346l;

    public C14477l(C14477l c14477l, C0360l c0360l) {
        this.f28346l = c14477l;
        this.f28345l = c0360l;
    }

    @Override // defpackage.InterfaceC5763l
    public final InterfaceC15446l getKey() {
        return C1461l.f3656l;
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: import */
    public final /* bridge */ InterfaceC12932l mo244import(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.mopub(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final /* bridge */ InterfaceC5763l mo245l(InterfaceC15446l interfaceC15446l) {
        return AbstractC2044l.crashlytics(this, interfaceC15446l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public final InterfaceC12932l mo246l(InterfaceC12932l interfaceC12932l) {
        return AbstractC10586l.billing(this, interfaceC12932l);
    }

    @Override // defpackage.InterfaceC12932l
    /* JADX INFO: renamed from: lؚْٟ */
    public final Object mo247l(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final void yandex(InterfaceC15829l interfaceC15829l) {
        if (this.f28345l == interfaceC15829l) {
            C8339l.smaato("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        C14477l c14477l = this.f28346l;
        if (c14477l != null) {
            c14477l.yandex(interfaceC15829l);
        }
    }
}
