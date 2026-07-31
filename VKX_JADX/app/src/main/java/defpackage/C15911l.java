package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: renamed from: lِٕۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15911l extends AbstractRunnableC17845l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ String f31240l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f31241l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f31242l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ C9471l f31243l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ String f31244l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15911l(C9471l c9471l, String str, String str2, Bundle bundle, int i) {
        super(c9471l, true);
        this.f31242l = i;
        switch (i) {
            case 1:
                this.f31244l = str;
                this.f31240l = str2;
                this.f31241l = bundle;
                Objects.requireNonNull(c9471l);
                this.f31243l = c9471l;
                super(c9471l, true);
                break;
            default:
                this.f31244l = str;
                this.f31240l = str2;
                this.f31241l = bundle;
                this.f31243l = c9471l;
                break;
        }
    }

    @Override // defpackage.AbstractRunnableC17845l
    public final void yandex() {
        switch (this.f31242l) {
            case 0:
                InterfaceC0591l interfaceC0591l = this.f31243l.billing;
                AbstractC1051l.subs(interfaceC0591l);
                interfaceC0591l.clearConditionalUserProperty(this.f31244l, this.f31240l, this.f31241l);
                break;
            default:
                long j = this.f34775l;
                long j2 = this.f34774l;
                InterfaceC0591l interfaceC0591l2 = this.f31243l.billing;
                AbstractC1051l.subs(interfaceC0591l2);
                interfaceC0591l2.logEventWithElapsedTime(this.f31244l, this.f31240l, this.f31241l, true, true, j, j2);
                break;
        }
    }
}
