package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lُٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15731l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC15893l f30903l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f30904l;

    public /* synthetic */ C15731l(EnumC15893l enumC15893l, int i) {
        this.f30904l = i;
        this.f30903l = enumC15893l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f30904l;
        EnumC15893l enumC15893l = this.f30903l;
        switch (i) {
            case 0:
                return AbstractC3974l.firebase.yandex(enumC15893l.f31171l);
            default:
                return AbstractC3974l.firebase.yandex(enumC15893l.f31170l);
        }
    }
}
