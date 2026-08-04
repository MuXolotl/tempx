package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lْۛۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13663l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10700l f26689l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26690l;

    public /* synthetic */ C13663l(C10700l c10700l, int i) {
        this.f26690l = i;
        this.f26689l = c10700l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f26690l;
        C10700l c10700l = this.f26689l;
        switch (i) {
            case 0:
                Object obj = c10700l.f21708l;
                if (obj == null) {
                    return null;
                }
                return (C13267l) obj;
            default:
                InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c10700l.f21708l;
                if (interfaceC7042l != null) {
                    interfaceC7042l.ads(null);
                }
                c10700l.f21708l = null;
                return Unit.INSTANCE;
        }
    }
}
