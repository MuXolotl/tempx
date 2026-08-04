package defpackage;

import java.security.SecureRandom;

/* JADX INFO: renamed from: lؘۦۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6114l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC9719l f12903l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final SecureRandom f12904l;

    public C6114l(InterfaceC9719l interfaceC9719l, SecureRandom secureRandom) {
        if (secureRandom == null) {
            secureRandom = AbstractC8776l.loadAd();
        } else {
            ThreadLocal threadLocal = AbstractC8776l.yandex;
        }
        this.f12904l = secureRandom;
        this.f12903l = interfaceC9719l;
    }
}
